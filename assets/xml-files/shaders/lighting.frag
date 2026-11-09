//
//
//	Generic Lighting
//
//


#ifndef __LIGHTING__FRAG__
#define __LIGHTING__FRAG__

#include "light_constants.frag"

#include "lights.frag"
#include "planets.frag"
#include "environment.frag"
#include "atmosphere.frag"
#include "alphaHDRL.frag"
#include "HDRLUtils.frag"


float3 CalculateLight(const float3 Normal, const float3 LightDir)
{
     float Cos = max(0.0f , dot(Normal,LightDir) );
     
     return (Cos);
}


//Standard point light

float CalculatePointLightSimple1_1(const float3 WorldVertexPosition, const float3 WorldVertexNormal, const float3 WorldLightPos, const float LightRange)
{
	float3 Vert2Light = WorldLightPos - WorldVertexPosition;
	float Dist = length(Vert2Light);
	Vert2Light = normalize(Vert2Light);
	
	//make it zero if it's below
	float Multiplier = LightRange - Dist;
	
	Multiplier = saturate(Multiplier);
	
	//dot it
	float Dot = dot(Vert2Light,WorldVertexNormal) * Multiplier;
	
	return Dot;
}

float CalculateFresnelTerm(const float3 ViewDir, const float3 ViewNormal)
{
	float f = 0.5f - dot(ViewDir,ViewNormal);
	f = 1 - 4*f*f;
	//f = saturate(f*2);
	return f;
}


//Pixel shader lighting
float3 lightPixelSpecularDiffuseWrap(const float3 Nn, const float3 Vn, const float3 SurfaceColor,
const float SPECULAR_EXPONENT, const float DIFFUSE_WRAP, const float SPECULAR_CONTRIBUTION)
{
	float3 Ln = -PLANET_LIGHTDIR_COMMON;
	float3 Hn = normalize(Vn + Ln);
	float ldn = dot(Ln,Nn);
	ldn = smoothstep(-DIFFUSE_WRAP,1.0,ldn);
	float hdn = dot(Hn,Nn);
	float4 litVec = lit(ldn,hdn,SPECULAR_EXPONENT);

	float3 DiffuseFactor = SurfaceColor * saturate((ldn*PLANET_LIGHTCOLOR_COMMON) + ATMOSPHERE_AMBIENT);
    float3 SpecularFactor = saturate(litVec.y*litVec.z*litVec.x*SurfaceColor.y);
	
	return DiffuseFactor + SpecularFactor*SPECULAR_CONTRIBUTION;
}

float3 lightPixelSpecular(const float3 WorldNormal, const float3 WorldEyeVec,const float3 SurfaceColor,const float SPECULAR_EXPONENT,const float SPECULAR_CONTRIBUTION)
{
	float3 Ln = -PLANET_LIGHTDIR_COMMON;
	float3 Nn = normalize(WorldNormal);
	float3 Vn = normalize(WorldEyeVec);
	
	float ldn = saturate(dot(Ln,Nn));
	
	float3 Reflect = reflect(Vn,Nn);
	
	float tempdot = saturate(dot(Ln,Reflect));

	float Specular = pow(tempdot , SPECULAR_EXPONENT);


	float3 DiffuseFactor = SurfaceColor * saturate( (ldn * PLANET_LIGHTCOLOR_COMMON) + ATMOSPHERE_AMBIENT);
	float SpecularFactor = Specular * SPECULAR_CONTRIBUTION;
	
	return DiffuseFactor + SpecularFactor.xxx;
	
}

float4 lightPixelSpecularDiffuseEnvironmentHDRL(const float3 Nn, const float3 Vn, const float3 Ln, 
	const float4 SurfaceColor, const float SPECULAR_EXPONENT,const float SPECULAR_CONTRIBUTION)
{
	float4 Color;
	
	float ldn = saturate(dot(Ln,Nn));
	
	float3 Reflect = reflect(Vn,Nn);
	
	float4 EnvMap = texCUBE(Environment_Sampler, Reflect);
	
	float tempdot = saturate(dot(Ln,Reflect));
	
	float Specular = pow(tempdot , SPECULAR_EXPONENT);
	
	float3 DiffuseFactor = SurfaceColor.xyz * EnvMap * 2.0f * saturate( (ldn * PLANET_LIGHTCOLOR_COMMON) + ATMOSPHERE_AMBIENT);
	float3 SpecularFactor = Specular * SPECULAR_CONTRIBUTION;
	
	Color.xyz = DiffuseFactor + SpecularFactor;
	
	Color.a = (Specular + 0.01f);
	
	return Color;
	
}


float4 lightPixelSpecularDiffuseEnvironmentAlphaTestHDRL(const float3 Nn, const float3 Vn, const float3 Ln, 
	const float4 SurfaceColor, const float SPECULAR_EXPONENT,const float SPECULAR_CONTRIBUTION)
{
	if (SurfaceColor.a < ALPHA_TEST_VALUE)
	{
		clip(-0.5f);
	}
	
	return lightPixelSpecularDiffuseEnvironmentHDRL(Nn,Vn,Ln,SurfaceColor,SPECULAR_EXPONENT,SPECULAR_CONTRIBUTION);
}

float4 lightPixelSpecularDiffuseEnvironmentHDRLGlow(const float3 Nn, const float3 Vn, 
	const float3 Ln, const float4 SurfaceColor,const float Glow, const float SPECULAR_EXPONENT,const float SPECULAR_CONTRIBUTION)
{
	float4 Color;
	
	float ldn = saturate(dot(Ln,Nn));
	
	float3 Reflect = reflect(Vn,Nn);
	
	float4 EnvMap = texCUBE(Environment_Sampler, Reflect);
	
	float tempdot = saturate(dot(Ln,Reflect));
	
	float Specular = pow(tempdot , SPECULAR_EXPONENT);
	
	float3 DiffuseFactor = SurfaceColor.xyz * EnvMap * 2.0f * saturate( (ldn * PLANET_LIGHTCOLOR_COMMON) + ATMOSPHERE_AMBIENT);
	float3 SpecularFactor = Specular * SPECULAR_CONTRIBUTION;
	
	Color.xyz = DiffuseFactor + SpecularFactor;
	
	Color.a = saturate((SurfaceColor.a * Glow) + Specular);
	
	return Color;
	
}

// --------------------------------------------------------------------------------------------------------------------------------------
// Versions that output raw lighting (not combined with surface color, ambient etc)
// --------------------------------------------------------------------------------------------------------------------------------------
float4 lightPixelSpecularDiffuseWrapRaw(const float3 Nn, const float3 Vn, const float SPECULAR_EXPONENT, const float DIFFUSE_WRAP, const float SPECULAR_CONTRIBUTION)
{
	float3 Ln = -PLANET_LIGHTDIR_COMMON;
	float3 Hn = normalize(-Vn + Ln);
	float ldn = dot(Ln, Nn);
	ldn = smoothstep(-DIFFUSE_WRAP, 1.0, ldn);
	float hdn = dot(Hn, Nn);
	//float4 litVec = lit(ldn, hdn, SPECULAR_EXPONENT);

	if (ldn < 0) hdn = 0;
	hdn = saturate(hdn);
	
	float3 DiffuseFactor = saturate(ldn * PLANET_LIGHTCOLOR_COMMON);
    float SpecularFactor = pow(hdn, SPECULAR_EXPONENT);
		
	float4 ReturnValue;
	ReturnValue.xyz = DiffuseFactor;
	ReturnValue.a = SpecularFactor * SPECULAR_CONTRIBUTION * (PLANET_LIGHTCOLOR_COMMON.x + PLANET_LIGHTCOLOR_COMMON.y + PLANET_LIGHTCOLOR_COMMON.z) / 3;
	
	return  ReturnValue;
}

float4 lightPixelSpecularDiffuseWrapRaw2(const float3 Nn, const float3 Vn, const float SPECULAR_EXPONENT, const float DIFFUSE_WRAP, const float SPECULAR_CONTRIBUTION)
{
	float3 Ln = -PLANET_LIGHTDIR_COMMON;
	float3 Hn = normalize(Vn + Ln);
	float ldn = dot(Ln, Nn);
	ldn = smoothstep(-DIFFUSE_WRAP, 1.0, ldn);
	float hdn = dot(Hn, Nn);
	//float4 litVec = lit(ldn, hdn, SPECULAR_EXPONENT);

	if (ldn < 0) hdn = 0;
	hdn = saturate(hdn);
	
	float3 DiffuseFactor = saturate(ldn * PLANET_LIGHTCOLOR_COMMON);
    float SpecularFactor = pow(hdn, SPECULAR_EXPONENT);
		
	float4 ReturnValue;
	ReturnValue.xyz = DiffuseFactor;
	ReturnValue.a = SpecularFactor * SPECULAR_CONTRIBUTION * (PLANET_LIGHTCOLOR_COMMON.x + PLANET_LIGHTCOLOR_COMMON.y + PLANET_LIGHTCOLOR_COMMON.z) / 3;
	
	return  ReturnValue;
}

float4 lightPixelSpecularDiffuseWrapRaw(const float3 LightDir, const float3 Nn, const float3 Vn, const float SPECULAR_EXPONENT, const float DIFFUSE_WRAP, const float SPECULAR_CONTRIBUTION)
{
	float3 Ln = -LightDir;
	float3 Hn = normalize(-Vn + Ln);
	float ldn = dot(Ln, Nn);
	ldn = smoothstep(-DIFFUSE_WRAP, 1.0, ldn);
	float hdn = dot(Hn, Nn);
	//float4 litVec = lit(ldn, hdn, SPECULAR_EXPONENT);

	if (ldn < 0) hdn = 0;
	hdn = saturate(hdn);
	
	float3 DiffuseFactor = saturate(ldn);
    float SpecularFactor = pow(hdn, SPECULAR_EXPONENT);
		
	float4 ReturnValue;
	ReturnValue.xyz = DiffuseFactor;
	ReturnValue.a = SpecularFactor * SPECULAR_CONTRIBUTION ;
	
	return  ReturnValue;
}

float4 lightPixelSpecularDiffuseWrapRawTrees(const float3 Nn, const float3 Vn, const float SPECULAR_EXPONENT, const float DIFFUSE_WRAP, const float SPECULAR_CONTRIBUTION,float VertexPaint)
{
	float3 Ln = -PLANET_LIGHTDIR_COMMON;
	float3 Hn = normalize(-Vn + Ln);
	float ldn = dot(Ln, Nn);
	ldn = lerp(ldn,ldn * 0.6 + 0.4,VertexPaint);
	ldn = smoothstep(-DIFFUSE_WRAP, 1.0, ldn);
	float hdn = dot(Hn, Nn);
	//float4 litVec = lit(ldn, hdn, SPECULAR_EXPONENT);

	if (ldn < 0) hdn = 0;
	hdn = saturate(hdn);
	
	float3 DiffuseFactor = saturate(ldn * PLANET_LIGHTCOLOR_COMMON);
    float SpecularFactor = pow(hdn, SPECULAR_EXPONENT);
		
	float4 ReturnValue;
	ReturnValue.xyz = DiffuseFactor;
	ReturnValue.a = SpecularFactor * SPECULAR_CONTRIBUTION * (PLANET_LIGHTCOLOR_COMMON.x + PLANET_LIGHTCOLOR_COMMON.y + PLANET_LIGHTCOLOR_COMMON.z) / 3;
	
	return  ReturnValue;
}

float4 lightPixelSpecularDiffuseEnvironmentRaw(const float3 Nn, const float3 Vn, const float3 Ln, const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION)
{
	float4 ReturnValue;
	float ldn = saturate(dot(Ln, Nn));
	float3 Reflect = reflect(Vn, Nn);
	float4 EnvMap = texCUBE(Environment_Sampler, Reflect);
	float tempdot = saturate(dot(Ln, Reflect));
	float Specular = pow(tempdot, SPECULAR_EXPONENT);
	float3 DiffuseFactor = EnvMap * 2.0f * saturate(ldn * PLANET_LIGHTCOLOR_COMMON);
	float SpecularFactor = Specular * SPECULAR_CONTRIBUTION;
	ReturnValue.xyz = DiffuseFactor;
	ReturnValue.a = Specular;
	
	return ReturnValue;
}

float4 lightPixelSpecularDiffuseEnvironmentAlphaTestRaw(const float3 Nn, const float3 Vn, const float3 Ln, const float AlphaValue, const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION)
{
	if (AlphaValue < ALPHA_TEST_VALUE)
	{
		clip(-0.5f);
	}
	
	return lightPixelSpecularDiffuseEnvironmentRaw(Nn,Vn,Ln,SPECULAR_EXPONENT,SPECULAR_CONTRIBUTION);
}


float4 lightPixelDiffuseRaw(const float3 Nn, const float3 DiffuseMaterial)
{
	float4 ReturnValue;
	float ldn = saturate(dot(-PLANET_LIGHTDIR_COMMON,Nn));

	ReturnValue.xyz = ldn * DiffuseMaterial * PLANET_LIGHTCOLOR_COMMON;
	ReturnValue.w = 0.0f;	
	
	return ReturnValue;
}

float4 lightPixelDiffuseRaw(const float3 Nn)
{
	float4 ReturnValue;
	float ldn = saturate(dot(-PLANET_LIGHTDIR_COMMON,Nn));

	ReturnValue.xyz = ldn * PLANET_LIGHTCOLOR_COMMON;
	ReturnValue.w = 0.0f;	
	
	return ReturnValue;
}

float4 lightPixelDiffuseRawAbs(const float3 Nn)
{
	float4 ReturnValue;
	float ldn = saturate(abs(dot(-PLANET_LIGHTDIR_COMMON,Nn)));

	ReturnValue.xyz = ldn * PLANET_LIGHTCOLOR_COMMON;
	ReturnValue.w = 0.0f;	
	
	return ReturnValue;
}

float4 lightPixelSpecularRaw(const float3 Nn, const float3 Vn, const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION)
{
	float4 ReturnValue;

	float3 Ln = -PLANET_LIGHTDIR_COMMON;
	float3 Reflect = reflect(Vn,Nn);
	
	float Diffuse = saturate(dot(Ln,Nn));
	float tempdot = saturate(dot(Ln,Reflect));
	float Specular = pow(tempdot , SPECULAR_EXPONENT);

	ReturnValue.xyz = Diffuse * PLANET_LIGHTCOLOR_COMMON;
	ReturnValue.w = Specular * SPECULAR_CONTRIBUTION;
	
	return ReturnValue;	
}

float4 lightPixelSpecularRawAbs(const float3 Nn, const float3 Vn, const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION)
{
	float4 ReturnValue;

	float3 Ln = -PLANET_LIGHTDIR_COMMON;
	float3 Reflect = reflect(Vn,Nn);
	
	float Diffuse = saturate(abs(dot(Ln,Nn)));
	float tempdot = saturate(abs(dot(Ln,Reflect)));
	float Specular = pow(tempdot , SPECULAR_EXPONENT);

	ReturnValue.xyz = Diffuse * PLANET_LIGHTCOLOR_COMMON;
	ReturnValue.w = Specular * SPECULAR_CONTRIBUTION;
	
	return ReturnValue;	
}

#endif
