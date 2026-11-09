// dynamic_lights.frag

#ifndef __DYNAMIC_LIGHTS_FRAG__
#define __DYNAMIC_LIGHTS_FRAG__

#include "alphahdrl.frag"
#include "environment.frag"

static const float NearFarAttenRatio = 0.5;

// Light params unpacking
float3 unpackLightPosition(half4x4 LightParams) {return LightParams[0].xyz;}
float unpackLightRange(half4x4 LightParams) {return LightParams[0].w;}
float3 unpackLightColor(half4x4 LightParams) {return LightParams[1].xyz;}
float unpackLightIntensity(half4x4 LightParams) {return LightParams[1].w;}
float4 unpackLightPlane(half4x4 LightParams) {return LightParams[2];}
void packLightPosition(out half4 LParam0, out float4 LParam1, out float4 LParam2, out float4 LParam3, float3 Position) {LParam0.xyz = Position;}
float3 unpackLightPosition(half4 LParam0, half4 LParam1, half4 LParam2, half4 LParam3) {return LParam0.xyz;}

// light param array
#ifndef LIGHTS_SUPPORTED
#define LIGHTS_SUPPORTED 8
#endif
const int MaxLights : REInfoMaxLights = LIGHTS_SUPPORTED;
uniform half4x4 LightParams[LIGHTS_SUPPORTED] : REPLightParams;
uniform int ActiveLightCount : REPActiveLightCount;

/*
// light params unpacking from texture
texture LightParamTex : REPLightParamTexture;
sampler LightParamSampler = sampler_state
{
    texture = <LightParamTex>;
    AddressU = BORDER;
    AddressV = BORDER;
    AddressW = BORDER;
    BorderColor = float4(0.5, 0.1, 0.7, 1.0);
    MaxMipLevel = 0;
    MipFilter = POINT;
    MinFilter = POINT;
    MagFilter = POINT;
};

// keep this in sync with the engine
static const int TextureLightParamCount = 16;
static const float LightParamTextureIndexMultiplier = 1.0 / (float) (4 * TextureLightParamCount);

float4 getLightParamRowFromTexture(int LightParamIndex, int RowIndex) {return tex2D(LightParamSampler, (4 * LightParamIndex + RowIndex) * LightParamTextureIndexMultiplier);}
*/

float calculatePointLightAttenuation(const float3 WorldPos, const float4x4 LightParams)
{
	float AttenFar = unpackLightRange(LightParams);
	float AttenNear = AttenFar * NearFarAttenRatio;
	return 1.0 - smoothstep(AttenNear, AttenFar, length(unpackLightPosition(LightParams) - WorldPos));
}


// --------------------------------------------------------------------------------------------------------------------------------------
// Versions that output raw lighting (not combined with surface color, ambient etc)
// --------------------------------------------------------------------------------------------------------------------------------------
float4 pointLightPixelDiffuseRaw(float3 SurfacePos, float3 SurfaceNormal, float4x4 LightParams)
{
	if (dot(unpackLightPlane(LightParams), float4(SurfacePos, 1)) < 0) return float4(0, 0, 0, 0);
	float AttenFar = unpackLightRange(LightParams);
	float3 LightPos = unpackLightPosition(LightParams);
	float3 LightVec = LightPos - SurfacePos;
	float LightDist = length(LightVec);
	if (LightDist >= AttenFar) return float4(0, 0, 0, 0);
	LightVec /= LightDist;
	float AttenNear = AttenFar * NearFarAttenRatio;
	float Atten = 1.0 - smoothstep(AttenNear, AttenFar, LightDist);
	float DiffuseTerm = saturate(dot(LightVec, SurfaceNormal));
	float4 ReturnVal;
	ReturnVal.xyz = DiffuseTerm * Atten * unpackLightColor(LightParams);
	ReturnVal.w = 0;
	return ReturnVal;
}

float4 pointLightPixelDiffuseRawAbs(float3 SurfacePos, float3 SurfaceNormal, float4x4 LightParams)
{
	if (dot(unpackLightPlane(LightParams), float4(SurfacePos, 1)) < 0) return float4(0, 0, 0, 0);
	float AttenFar = unpackLightRange(LightParams);
	float3 LightPos = unpackLightPosition(LightParams);
	float3 LightVec = LightPos - SurfacePos;
	float LightDist = length(LightVec);
	if (LightDist >= AttenFar) return float4(0, 0, 0, 0);
	LightVec /= LightDist;
	float AttenNear = AttenFar * NearFarAttenRatio;
	float Atten = 1.0 - smoothstep(AttenNear, AttenFar, LightDist);
	float DiffuseTerm = saturate(abs(dot(LightVec, SurfaceNormal)));
	float4 ReturnVal;
	ReturnVal.xyz = DiffuseTerm * Atten * unpackLightColor(LightParams);
	ReturnVal.w = 0;
	return ReturnVal;
}

float4 pointLightPixelSpecularDiffuseWrapRaw(const float3 WorldPos, const float3 Nn, 
	const float SPECULAR_EXPONENT, const float DIFFUSE_WRAP, const float SPECULAR_CONTRIBUTION,
	const float3 Vn, const float4x4 LightParams)
{

	if (dot(unpackLightPlane(LightParams), float4(WorldPos, 1)) < 0) return float4(0, 0, 0, 0);
	float AttenFar = unpackLightRange(LightParams);
	float3 LightPos = unpackLightPosition(LightParams);
	float3 LightVec = LightPos - WorldPos;
	float LightDist = length(LightVec);
	if (LightDist >= AttenFar) return float4(0, 0, 0, 0);
	LightVec /= LightDist;
	float AttenNear = AttenFar * NearFarAttenRatio;
	float Atten = 1.0 - smoothstep(AttenNear, AttenFar, LightDist);
	float3 Hn = normalize(Vn + LightVec);
	float ldn = dot(LightVec, Nn);
	ldn = smoothstep(-DIFFUSE_WRAP, 1.0, ldn);
	float hdn = dot(Hn, Nn);
	float4 litVec = lit(ldn, hdn, SPECULAR_EXPONENT);
	float3 DiffuseFactor = ldn * unpackLightColor(LightParams);
	float4 ReturnValue;
	ReturnValue.xyz = DiffuseFactor;
	ReturnValue.a = saturate(litVec.y * litVec.z * litVec.x) * unpackLightIntensity(LightParams) * SPECULAR_CONTRIBUTION;

	return ReturnValue * Atten;
}

float4 pointLightPixelSpecularRaw(const float3 WorldPos, const float3 Nn, const float3 Vn, 
	const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION, const float4x4 LightParams)
{
	if (dot(unpackLightPlane(LightParams), float4(WorldPos, 1)) < 0) return float4(0, 0, 0, 0);
	float AttenFar = unpackLightRange(LightParams);
	float3 LightPos = unpackLightPosition(LightParams);
	float3 LightVec = LightPos - WorldPos;
	float LightDist = length(LightVec);
	if (LightDist >= AttenFar) return float4(0, 0, 0, 0);
	LightVec /= LightDist;
	float AttenNear = AttenFar * NearFarAttenRatio;
	float Atten = 1.0 - smoothstep(AttenNear, AttenFar, LightDist);
	float ldn = saturate(dot(LightVec, Nn));
	float3 Reflect = reflect(Vn, Nn);
	float tempdot = saturate(dot(LightVec, Reflect));
	float Specular = pow(tempdot , SPECULAR_EXPONENT);
	float3 DiffuseFactor = ldn;
	float4 ReturnVal = float4(0, 0, 0, 0);
	ReturnVal.xyz = DiffuseFactor * unpackLightColor(LightParams);
	ReturnVal.a = Specular * SPECULAR_CONTRIBUTION * unpackLightIntensity(LightParams);

	return ReturnVal * Atten;
}

float4 pointLightPixelSpecularRawAbs(const float3 WorldPos, const float3 Nn, const float3 Vn, 
	const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION, const float4x4 LightParams)
{
	if (dot(unpackLightPlane(LightParams), float4(WorldPos, 1)) < 0) return float4(0, 0, 0, 0);
	float AttenFar = unpackLightRange(LightParams);
	float3 LightPos = unpackLightPosition(LightParams);
	float3 LightVec = LightPos - WorldPos;
	float LightDist = length(LightVec);
	if (LightDist >= AttenFar) return float4(0, 0, 0, 0);
	LightVec /= LightDist;
	float AttenNear = AttenFar * NearFarAttenRatio;
	float Atten = 1.0 - smoothstep(AttenNear, AttenFar, LightDist);
	float3 Ln = normalize(unpackLightPosition(LightParams) - WorldPos);
	float ldn = saturate(abs(dot(LightVec, Nn)));
	float3 Reflect = reflect(Vn, Nn);
	float tempdot = saturate(abs(dot(LightVec, Reflect)));
	float Specular = pow(tempdot , SPECULAR_EXPONENT);
	float3 DiffuseFactor = ldn;
	float4 ReturnVal = float4(0, 0, 0, 0);
	ReturnVal.xyz = DiffuseFactor * unpackLightColor(LightParams);
	ReturnVal.a = Specular * SPECULAR_CONTRIBUTION * unpackLightIntensity(LightParams);

	return ReturnVal * Atten;
}


/*
// --------------------------------------------------------------------------------------------------------------------------------------
// Versions that get input from texture instead of shader constants
// --------------------------------------------------------------------------------------------------------------------------------------

float4 pointLightPixelDiffuseRawFromTexture(float3 SurfacePos, float3 SurfaceNormal, int LightIndex)
{
	float4x4 LightParams = float4x4(
		getLightParamRowFromTexture(LightIndex, 0), 
		getLightParamRowFromTexture(LightIndex, 1), 
		getLightParamRowFromTexture(LightIndex, 2), 
		getLightParamRowFromTexture(LightIndex, 3));
		
	return pointLightPixelDiffuseRaw(SurfacePos, SurfaceNormal, LightParams);
}

float4 pointLightPixelDiffuseRawAbsFromTexture(float3 SurfacePos, float3 SurfaceNormal, int LightIndex)
{
	float4x4 LightParams = float4x4(
		getLightParamRowFromTexture(LightIndex, 0), 
		getLightParamRowFromTexture(LightIndex, 1), 
		getLightParamRowFromTexture(LightIndex, 2), 
		getLightParamRowFromTexture(LightIndex, 3));
		
	return pointLightPixelDiffuseRawAbs(SurfacePos, SurfaceNormal, LightParams);
}

float4 pointLightPixelSpecularDiffuseWrapRawFromTexture(const float3 WorldPos, const float3 Nn, 
	const float SPECULAR_EXPONENT, const float DIFFUSE_WRAP, const float SPECULAR_CONTRIBUTION,
	const float3 Vn, int LightIndex)
{
	float4x4 LightParams = float4x4(
		getLightParamRowFromTexture(LightIndex, 0), 
		getLightParamRowFromTexture(LightIndex, 1), 
		getLightParamRowFromTexture(LightIndex, 2), 
		getLightParamRowFromTexture(LightIndex, 3));
		
	return pointLightPixelSpecularDiffuseWrapRaw(WorldPos, Nn, SPECULAR_EXPONENT, DIFFUSE_WRAP, SPECULAR_CONTRIBUTION, Vn, LightParams);
	
}

float4 pointLightPixelSpecularRawFromTexture(const float3 WorldPos, const float3 Nn, const float3 Vn, 
	const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION, int LightIndex)
{
	float4x4 LightParams = float4x4(
		getLightParamRowFromTexture(LightIndex, 0), 
		getLightParamRowFromTexture(LightIndex, 1), 
		getLightParamRowFromTexture(LightIndex, 2), 
		getLightParamRowFromTexture(LightIndex, 3));
		
	return pointLightPixelSpecularRaw(WorldPos, Nn, Vn, SPECULAR_EXPONENT, SPECULAR_CONTRIBUTION, LightParams);
}

float4 pointLightPixelSpecularRawAbsFromTexture(const float3 WorldPos, const float3 Nn, const float3 Vn, 
	const float SPECULAR_EXPONENT, const float SPECULAR_CONTRIBUTION, int LightIndex)
{
	float4x4 LightParams = float4x4(
		getLightParamRowFromTexture(LightIndex, 0), 
		getLightParamRowFromTexture(LightIndex, 1), 
		getLightParamRowFromTexture(LightIndex, 2), 
		getLightParamRowFromTexture(LightIndex, 3));
		
	return pointLightPixelSpecularRawAbs(WorldPos, Nn, Vn, SPECULAR_EXPONENT, SPECULAR_CONTRIBUTION, LightParams);
}*/

#endif // ndef __DYNAMIC_LIGHTS_FRAG__