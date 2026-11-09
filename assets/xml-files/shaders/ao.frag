#ifndef __AO__FRAG__
#define __AO__FRAG__

#ifdef VOXEL_LIGHTING_ENABLE

#include "camera.frag"


const shared texture VoxelMap : REVoxelMap;
const shared float3 VoxelSize : REVoxelSize;
const shared float3 VoxelCenter : REVoxelCenter;
const shared float VoxelResolution : REVoxelResolution;
const shared bool VoxelUseAperture : REVoxelUseAperture;

sampler3D AO_Sampler:register(s0) = sampler_state
{ 
    Texture = (VoxelMap);
	AddressU = MIRROR;
    AddressV = MIRROR;
    AddressW = MIRROR;
    MaxMipLevel = 0;
	MipFilter = POINT;
    MinFilter = LINEAR;
	//MagFilter = POINT;
    MagFilter = LINEAR;
};

float3 getAOVoxelCoords(const float3 Pos)	// should be used in the vertex shader
{
	float3 Temp=Pos-VoxelCenter+WorldEyePos;

	Temp /= VoxelResolution*VoxelSize;
	Temp += 0.5f;
		
	return Temp;
}

float getAmbientOcclusion(float4 AO)
{
	float AOVal=AO.x;
	float AOPow=3.0f;
	float AOAdd=0.0f;
	
	if (VoxelUseAperture)
	{
		AOVal=AO.w;
		AOPow=1.5f;
		AOAdd=0.1f;
	}
	
	return pow(AOVal,AOPow)+AOAdd;
}

float getAmbientOcclusionBright(float4 AO)
{
	float AOVal=AO.x;
	float AOPow=2.5f;
	float AOAdd=0.0f;
	
	if (VoxelUseAperture)
	{
		AOVal=AO.w;
		AOPow=1.5f;
		AOAdd=0.2f;
	}
	
	return pow(AOVal,AOPow)+AOAdd;
}


float3 getGammaFromAmbientOcclusion(float4 AO)
{
	float Gamma = AO.x;
	if (VoxelUseAperture)	Gamma = AO.w;
	return 0.65f+0.35f*Gamma;
}

float getApertureFromAO(float Value)
{
	//if (Value<0.5f) return 1.0f;
	//return pow(2.0f-2.0f*Value,0.3f);
	return min(1.0f,pow(2.0f-2.0f*Value,0.3f));
}

float getApertureLighting(float3 LightDir,float4 AO)
{
	if (!VoxelUseAperture) return 0.0f;
	
	float3 Temp= float3(-1.0f,-1.0f,-1.0f);

	Temp+=2.0f*AO.zyx;
	float dot2=saturate(dot(LightDir,Temp));
	float aperture=getApertureFromAO(AO.w);

	return min(1.0f,1.0f-4.0f*min(aperture-dot2,0.24f));
}

#else

float3 getAOVoxelCoords(const float3 Pos)
{
	return float3(0,0,0);
}

#endif
#endif

