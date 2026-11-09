// SpeneBump
//
//
//

#ifndef __SPENE_BUMP__
#define __SPENE_BUMP__

#include "objectmatrix.frag"
#include "planets.frag"
#include "bumputils.frag"
#include "mathconstants.frag"
#include "mathtypes.frag"
#include "mathfunctions.frag"

#define SPENE_BUMP_REDUCER 0.3f


float3 CalculateSpeneBumpLightQuat(const SFVector3 Normal, const SFVector3 LightDir)
{
	static const SFVector3 WorldNormal = SFVector3(0,1,0);
	
	SFQuaternion RotQuat = SFQuaternionRotationAxisToAxis(WorldNormal, Normal);
	//SFQuaternion RotQuat = SFQuaternionRotationAxisToAxis(Normal , WorldNormal);
	SFVector3 NewLight = SFQuaternionRotation(LightDir,RotQuat);
	return NewLight;	
}

SFQuaternion GetTangentSpace(const SFVector3 InVec)
{
	static const SFVector3 WorldNormal = SFVector3(0,1,0);
	return SFQuaternionRotationAxisToAxis(WorldNormal,InVec);     
}


float CalculateSpeneBump(const float2 Tex,uniform sampler TextureSampler,const float4 LightDir)
{
	float dotter;
	float4 BumpNormal = 2 * (Tex2Dot3Simple_2_0(Tex,TextureSampler) - 0.5f);
	//float4 BumpNormal = 2 * (Tex2Dot3_2_0(Tex,TextureSampler) - 0.5f);
	dotter = dot(LightDir.xyz,BumpNormal.xyz);

	return dotter;//*0.3f;
}

float CalculateSpeneBumpSingle(const float2 Tex,uniform sampler TextureSampler,const float4 LightDir)
{

	float dotter;
	float4 BumpNormal = 2 * (Tex2Dot3SinglePixel_2_0(Tex,TextureSampler) - 0.5f);
	dotter = dot(LightDir.xyz,BumpNormal.xyz);

	return dotter;//*0.3f;
}

float CalculateSpeneBumpExperimental(const float2 Tex,uniform sampler TextureSampler,const float4 LightDir)
{
	float dotter;
	float4 BumpNormal = Tex2Dot3Experimental_2_0(Tex,TextureSampler);
	dotter = dot(LightDir.xyz,BumpNormal.xyz);

	return dotter;//*0.8f;
}

float CalculateSpeneBumpPixel(const SFVector3 Pixel,const SFVector3 LightDir)
{
	SFVector3 n;
	n = (Pixel-0.5f)*2;
	n.y = Pixel.y*2;
	return dot(LightDir,n);
}

float CalculateSpeneBumpPixelSoft(const SFVector3 Pixel,const SFVector3 LightDir)
{
	SFVector3 n;
	//n = (saturate(2*Pixel)-0.5f)*2;
	n = (Pixel-0.5f)*2;
	n.y = Pixel.y*2;
	//return max(0.0f,dot(LightDir,n));
	return saturate(dot(LightDir,n));
}

float CalculateSpeneBumpPixelTerrain(const SFVector3 Pixel,const SFVector3 LightDir)
{
	SFVector3 n;
	n = (Pixel-0.5f)*2;
	//n.y = Pixel.y*2;
	return max(0.0f,dot(LightDir,n));
}


float CalculateSpeneBumpDot3(const SFVector3 Pixel, const SFVector3 LightDir)
{
	//SFVector3 n;
	//n = (Pixel-0.5f)*2;
	//return dot(LightDir,n);
	//return max(0.0f,dot(LightDir,n));
}


float3 CalculateSpeneBumpReflect(const SFVector3 Reflect,const SFVector3 Normal)
{
	static const SFVector3 WorldNormal = SFVector3(0,1,0);
	
	SFQuaternion RotQuat = SFQuaternionRotationAxisToAxis(Normal,Reflect);
	SFVector3 Out = SFQuaternionRotation(WorldNormal,RotQuat);
	return Out;	
}


float CalculateSpeneBumpPixelReflect(const SFVector3 Pixel,const SFVector3 LightDir)
{
	SFVector3 n;
	//n = saturate(2*(Pixel-0.5f));
	n = (Pixel-0.5f)*2;
	//n = (Pixel-LightDir)*2;
	n.y = Pixel.y*2;
	float Dot = dot(LightDir,n);
	return Dot;//*Dot*Dot;
	//return dot(SFVector3(0.0f,1.0f,0.0f),n);
	//return max(0.0f,dot(LightDir,n));
}

float CalculateSpeneBumpPixelReflect_3_0(const SFVector3 Pixel,const SFVector3 LightDir)
{
	SFVector3 n;
	//n = saturate(2*(Pixel-0.5f));
	n = (Pixel-0.5f)*2;
	//n = (Pixel-LightDir)*2;
	n.y = Pixel.y*2;	
	n = saturate(n);
	float Dot = dot(LightDir,n);
	return Dot; //*Dot*Dot;
	//return dot(SFVector3(0.0f,1.0f,0.0f),n);
	//return max(0.0f,dot(LightDir,n));
}

float CalculateSpeneBumpPixelReflect_2(const SFVector3 Pixel,const SFVector3 LightDir)
{
	SFVector3 n;
	n = 2*(Pixel-0.5f);
	float Dot = dot(LightDir,n);
	return Dot;
}


#endif