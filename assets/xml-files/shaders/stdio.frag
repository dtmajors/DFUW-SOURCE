//  Standard IO Structs and Ops
//
//
//

#ifndef __STDIO__FRAG__
#define __STDIO__FRAG__

#include "shaderconfig.frag"

struct STD_VS_INPUT
{
   float4 Pos  : POSITION;
   float3 Norm : NORMAL;
   float2 Tex  : TEXCOORD0;   
};

struct STD_VS_VP_INPUT
{
   float4 Pos  : POSITION;
   float4 Diff : COLOR0;
   float3 Norm : NORMAL;
   float2 Tex  : TEXCOORD0;
};

struct STD_VS_INSTANCE_INPUT
{
	float4 Pos  : POSITION;
	float3 Tang	: TANGENT;
	float3 BNor : BINORMAL;
	float3 Norm : NORMAL;
	float4 Diff : COLOR0;
	float2 Tex  : TEXCOORD0;   
	float2 Tex2 : TEXCOORD1;
	//Instancing data
	float4 WMat1 : TEXCOORD5;
	float4 WMat2 : TEXCOORD6;
	float4 WMat3 : TEXCOORD7;
	float4 WMat4 : TEXCOORD8;
	float4 Ambient : COLOR1;
	float4 Diffuse : COLOR2;
};

struct STD_VS_INSTANCE_2LIGHTS_INPUT
{
	float4 Pos  : POSITION;
	float3 Norm : NORMAL;
	float2 Tex  : TEXCOORD0;
	float4 Diff : COLOR0;	
	//Instancing data
	float4 WMat1 : TEXCOORD5;
	float4 WMat2 : TEXCOORD6;
	float4 WMat3 : TEXCOORD7;
	float4 WMat4 : TEXCOORD8;
	
#ifdef SHADER_DYNAMIC_LIGHTS_ENABLE
	// Light 0
	float4 LParam00	: TEXCOORD9;
	float4 LParam01	: TEXCOORD10;
	float4 LParam02	: TEXCOORD11;
	// Light 1
	float4 LParam10	: TEXCOORD12;
	float4 LParam11	: TEXCOORD13;
	float4 LParam12	: TEXCOORD14;
#endif
};

struct STD_VS_SKINNING_INPUT
{
    float4  Pos             : POSITION;
	float4 Diff				  :  COLOR0;
    float4  BlendWeights    : BLENDWEIGHT;
    float4  BlendIndices    : BLENDINDICES;
    float3  Normal          : NORMAL;
	float3  Tangent         : TANGENT;
	float3  Binormal        : BINORMAL;
    float3  Tex0            : TEXCOORD0;
};


struct STD_VS_OUTPUT
{
   float4 Pos  		: POSITION;
   float4 Diffuse 	: COLOR0;
   float2 Tex		: TEXCOORD0;
   float  Fog		: FOG;
   float2 ZPos		: TEXCOORD1;
   float3 viewNormal		: TEXCOORD2;
};

struct STD_VS_OUTPUT_Spec
{
   float4 Pos  		: POSITION;
   float4 Diffuse 	: COLOR0;
   float4 Specular 	: COLOR1;
   float2 Tex		: TEXCOORD0;
   float  Fog		: FOG;
};

struct STD_VS_INSTANCE_2LIGHTS_OUTPUT
{
    float4 Pos				: POSITION;
    float4 WorldNormal_X	: TEXCOORD0;
    float4 WorldEyeVec_Y	: TEXCOORD1;
	float4 Tc_ZPos_Glow		: TEXCOORD2;
    float4 WorldPos_Fog		: TEXCOORD3;
    
#ifdef SHADER_DYNAMIC_LIGHTS_ENABLE
	// Light 0
	float4 LParam00 		: TEXCOORD4;
	float4 LParam01 		: TEXCOORD5;
	float4 LParam02 		: TEXCOORD6;
	
	// Light 1
	float4 LParam10 		: TEXCOORD7;
	float4 LParam11 		: TEXCOORD8;
	float4 LParam12 		: TEXCOORD9;
#endif
};

struct STD_VS_INSTANCE_OUTPUT
{
    float4 Pos				: POSITION;
	float3 WorldTangent		: TANGENT;
	float3 WorldBinormal	: BINORMAL;
    float3 WorldNormal		: TEXCOORD0;
    float3 WorldEyeVec		: TEXCOORD1;
	float2 Tc				: TEXCOORD2;
	float4 ZPos				: TEXCOORD3;
	float  Glow				: TEXCOORD4;
    float3 WorldPos			: TEXCOORD5;
	float  Fog				: TEXCOORD6;
	float4 Misc				: TEXCOORD7;
};

struct STD_PS_OUTPUT
{
    float4 Color : COLOR0;
};



struct STD_PS_OUTPUT_3
{
    float4 Color 	: COLOR0;
	
//#ifdef MATERIAL_WRITE_ENABLE
	float4 Material	: COLOR1; /* Rem: 16/5/2012 : IF Revert, reset this to COLOR3 */
//#endif

#ifdef DEPTH_WRITE_ENABLE
	float4 Depth 	: COLOR2;
#endif
	
	/* Rem: 16/5/2012
    float4 Effect 	: COLOR1;*/
	
};

struct STD_PS_OUTPUT_3_EFFECT
{
    float4 Color : COLOR0;
	/* Rem: 16/5/2012
    float4 Effect : COLOR1;*/
//#ifdef DEPTH_WRITE_ENABLE
//	float4 Depth : COLOR2;
//#endif
};

struct PS_OUTPUT_DEPTH
{
	float4 Color : COLOR;
	float Depth : DEPTH;
};

struct PS_OUTPUT_DEPTH_3
{
	float4 Color : COLOR;
	
#ifdef DEPTH_WRITE_ENABLE
	float4 SSAO_Depth 	: COLOR1; /* Rem: 16/5/2012 IF reverted, reset this to COLOR2 */
#endif

	/* Rem: 16/5/2012
    float4 Effect : COLOR1;*/

	float Depth : DEPTH;
};


#endif