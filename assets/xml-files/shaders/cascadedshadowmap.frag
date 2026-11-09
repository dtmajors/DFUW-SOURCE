//  ShadowMap
//
//
//


#define SHADOW_FADE_START 10
#define SHADOW_FADE_END 50

#ifndef __CASCADEDSHADOWMAP_FRAG__
#define __CASCADEDSHADOWMAP_FRAG__

#include "shaderconfig.frag"
#include "sampler.frag"
#include "mathconstants.frag"
#include "matrix.frag"
#include "texture.frag"

static const int MAX_SHADOW_SPLITS = 4;

const shared matrix ShadowViewProjectionMatrixArray[MAX_SHADOW_SPLITS] : REPShadowViewProjectionMatrixArray;
const shared float4 ShadowDistances1 : REPShadowDistanceVector1;
const shared float4 ShadowDistances2 : REPShadowDistanceVector2;
const shared int NumberOfShadowSplits : REPShadowNumberOfSplits;
const shared float SHADOW_EPSILON : REBShadowEpsilon;
static const float SHADOW_ANIM_EPSILON = 0.0008f;
const shared float ShadowTexelSize : REBShadowTexelSize;
//const float SHADOW_ID : REPShadowID;

const shared float4 ShadowFadeParameters : REPShadowFadeParameters;
#ifndef SHADOW_FADE_START
#define SHADOW_FADE_START ShadowFadeParameters.x
#endif

#ifndef SHADOW_FADE_END
#define SHADOW_FADE_END ShadowFadeParameters.y
#endif

#ifndef SHADOW_DIFF
#define SHADOW_DIFF ShadowFadeParameters.z
#endif

struct CASCADED_SHADOW_VS_OUTPUT
{
	float4 LightPos;
	int ShadowMapNumber; 
};

float4 calculateCascadedShadowMapsVS(float4 WorldPosition, float ZPos)
{
	//First figure out WHICH one to use
	float4 ZGreater = (ShadowDistances1 < ZPos);
	float MapToUse = dot(ZGreater,1.0f);
	//return mul(WorldPosition, ShadowViewProjectionMatrixArray[MapToUse - 1.0f]);
	return mul(WorldPosition, ShadowViewProjectionMatrixArray[MapToUse]);
}

CASCADED_SHADOW_VS_OUTPUT calculateCascadedShadowMapsVS_2(float4 WorldPosition, float ZPos)
{
	CASCADED_SHADOW_VS_OUTPUT Out;
	float4 ZGreater = (ShadowDistances1 < ZPos);
	float MapToUse = dot(ZGreater,1.0f);
	Out.LightPos = mul(WorldPosition, ShadowViewProjectionMatrixArray[MapToUse]);
	Out.ShadowMapNumber = MapToUse;
	return Out;
}

float2 TexLookup[4] = 
{
	//TopLeft
	{0.0f,0.0f},
	//BottomLeft
	{0.0f,0.5f},
	//TopRight
	{0.5f,0.0f},
	//BottomRIght
	{0.5f,0.5f},
};

float CLOOKUP[4] =
{
	0.0f,
	0.25f,
	0.50f,
	0.75f,
};

float ShadowTexelDivider[4] = 
{
	1.5f,
	1.5f,
	1.5f,
	1.5f,
};

float2 PoissonOffsets[12] = 
{
	float2(0.02080217f, 0.5399112f),
	float2(-0.1953127f, 0.03646252f),
	float2(0.4083022f, 0.0794738f),
	float2(0.09588743f, -0.4304161f),
	float2(0.5831574f, 0.5868099f),
	float2(-0.7049551f, 0.02469331f),
	float2(-0.5957326f, 0.659f),
	float2(-0.7581712f, -0.4898932f),
	float2(-0.3077467f, -0.8120358f),
	float2(0.9600141f, -0.001350365f),
	float2(0.672663f, -0.4354889f),
	float2(0.2648166f, -0.9277062f)
};

#define USE_PCF

//#define TEST_SHADOW_EPSILON 0.00005
//#define TEST_SHADOW_EPSILON 0.0005
#define TEST_SHADOW_EPSILON 0.00008

float CalcTestShadowVal(float4 WorldPosition, float ZPos, float SEpsilon)
{
	float4 ZGreater = (ShadowDistances1 < ZPos);
	float ShadowMapNumber = dot(ZGreater,1.0f);
	float4 PosLight = mul(WorldPosition, ShadowViewProjectionMatrixArray[ShadowMapNumber]);	
	PosLight.xyz /= PosLight.w;

	float LightZPos = tex2D( light_shadow_map, PosLight.xy ).x + SEpsilon;
	
	if (LightZPos < PosLight.z)
	{
		float CompareVal = LightZPos/PosLight.z;
		return (1.0f - CompareVal) * 0.5f;
		//return lerp(0.7f,0.0f,CompareVal);
	}
	else
	{
		return 1;
	}
}

float CalcPCFShadowVal(float4 WorldPosition, float ZPos, float SEpsilon)
{
	float4 ZGreater = (ShadowDistances1 < ZPos);
	float ShadowMapNumber = dot(ZGreater,1.0f);
	float4 PosLight = mul(WorldPosition, ShadowViewProjectionMatrixArray[ShadowMapNumber]);	
	PosLight.xy /= PosLight.w;

	float LightAmount;
	
	float4 depth; 
	float2 TexelSize = float2(ShadowTexelSize, ShadowTexelSize); 

	depth = float4(tex2D( light_shadow_map, PosLight.xy + float2( -TexelSize.x, 0 ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( +TexelSize.x, 0 ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( 0, -TexelSize.y ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( 0, +TexelSize.y ) ).x ); 

	float pixDepth = saturate((PosLight.z / PosLight.w) - SEpsilon); 

	depth = (pixDepth > depth)? float4(0.0, 0.0, 0.0, 0.0) : float4(1.0f, 1.0f, 1.0f, 1.0f);
	LightAmount = dot(depth, 0.25f); 
	
	return LightAmount;
};

float2 Rotate(float2 v, float sine, float cosine)
{
	float2 ret;
	ret.x = v.x * cosine - v.y * sine;
	ret.y = v.y * cosine + v.x * sine;
	return ret;
}

float CalcPoissonPCFShadowVal(float4 WorldPosition, float ZPos, float SEpsilon)
{
	// TODO: Use VPos to avoid matrix multiply
	float4 ScreenPos = mul(WorldPosition, ViewProjMatrix);
	ScreenPos.xyz /= ScreenPos.w;

	float4 ZGreater = (ShadowDistances1 < ZPos);
	float ShadowMapNumber = dot(ZGreater,1.0f);
	float4 PosLight = mul(WorldPosition, ShadowViewProjectionMatrixArray[ShadowMapNumber]);	
	PosLight.xyz /= PosLight.w;
	float PixelDepth = PosLight.z - SEpsilon;
	
	float2 sine_cosine = tex2D(RandomPoissonRotationSampler, float2(BACKBUFFER_WIDTH / 256.0, BACKBUFFER_HEIGHT / 256.0) * (ScreenPos.xy * 0.5 + 0.5)).xy;
	sine_cosine = sine_cosine * 2.0 - 1.0;
	
	float2 TexelSize = float2(ShadowTexelSize, ShadowTexelSize); 
	float PoissonDiskScale = 2.0;

	float LightAmount = 0.0;
	
	for (int i=0; i<12; i++)
	{
		float2 tc = PosLight.xy + Rotate(PoissonOffsets[i], sine_cosine.x, sine_cosine.y) * TexelSize * PoissonDiskScale;
		float depth = tex2D(light_shadow_map, tc).x;
		if (PixelDepth <= depth) LightAmount += 1.0 / 12.0;
	}
		
	return LightAmount;
};

float CalcBlurredShadowVal(float4 WorldPosition, float ZPos,float SEpsilon)
{
	float4 ZGreater = (ShadowDistances1 < ZPos);
	float ShadowMapNumber = dot(ZGreater,1.0f);
	float4 PosLight = mul(WorldPosition, ShadowViewProjectionMatrixArray[ShadowMapNumber]);	
	PosLight.xyz /= PosLight.w;
	
	float TexelDivider = ShadowTexelDivider[ShadowMapNumber];
	
	float pixDepth = saturate((PosLight.z / PosLight.w) - SEpsilon); 
	float2 TexelSize = float2(ShadowTexelSize/TexelDivider, ShadowTexelSize/TexelDivider); 
	float4 depth;
	float4 depth2;

	depth = float4(tex2D( light_shadow_map, PosLight.xy + float2( -TexelSize.x, 0 ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( +TexelSize.x, 0 ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( 0, -TexelSize.y ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( 0, +TexelSize.y ) ).x ); 
			
	depth2 = float4(tex2D( light_shadow_map, PosLight.xy + float2( -TexelSize.x, -TexelSize.y ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( +TexelSize.x, -TexelSize.y ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( -TexelSize.x, +TexelSize.y ) ).x, 
			tex2D( light_shadow_map, PosLight.xy + float2( +TexelSize.y, +TexelSize.y ) ).x ); 
	
	depth += SEpsilon;
	depth2 += SEpsilon;
			
	depth = (pixDepth > depth)? float4(0.0, 0.0, 0.0, 0.0) : float4(1.0f, 1.0f, 1.0f, 1.0f);
	depth2 = (pixDepth > depth2)? float4(0.0, 0.0, 0.0, 0.0) : float4(1.0f, 1.0f, 1.0f, 1.0f);
	
	float FirstWeight = 0.5f;
	float SecondWeight = 1.0f - FirstWeight;
	FirstWeight /= 4.0f;
	SecondWeight /= 4.0f;
	
	float LightAmount = dot(depth,FirstWeight);
	LightAmount += dot(depth2,SecondWeight);
	
	return LightAmount;	
}

float CalculateShadowFade(float ZPos)
{
	return 1.0f - saturate((ZPos - SHADOW_FADE_START)/SHADOW_DIFF);
}

float CalculateShadowFadeInv(float ZPos)
{
	//return saturate((ZPos - SHADOW_FADE_START)/SHADOW_DIFF);
	return smoothstep(SHADOW_FADE_START, SHADOW_FADE_END, ZPos);
}

float CalculateCascadedShadowDirLightAnimated(float4 WorldPosition, float ZPos)
{
	//Don't fade on animated objects. It servers no purpose and only eats fillrate
#ifdef SHADER_SHADOW_SMOOTHING_QUALITY
#if SHADER_SHADOW_SMOOTHING_QUALITY == 0
	return CalcTestShadowVal(WorldPosition,ZPos,SHADOW_ANIM_EPSILON);
#elif SHADER_SHADOW_SMOOTHING_QUALITY == 1
	return CalcPCFShadowVal(WorldPosition,ZPos,SHADOW_ANIM_EPSILON);
#elif SHADER_SHADOW_SMOOTHING_QUALITY == 2
	return CalcBlurredShadowVal(WorldPosition,ZPos,SHADOW_ANIM_EPSILON);
#elif SHADER_SHADOW_SMOOTHING_QUALITY == 3
	return CalcPoissonPCFShadowVal(WorldPosition, ZPos, SHADOW_ANIM_EPSILON);
#endif
	return CalcTestShadowVal(WorldPosition,ZPos,SHADOW_ANIM_EPSILON);
#else
	return CalcTestShadowVal(WorldPosition,ZPos,SHADOW_ANIM_EPSILON);
#endif

	return CalcTestShadowVal(WorldPosition,ZPos,SHADOW_ANIM_EPSILON);
}



float CalculateCascadedShadowDirLight(float4 WorldPosition, float ZPos)
{
	float ret = 0;

#ifdef SHADER_SHADOW_SMOOTHING_QUALITY
#if SHADER_SHADOW_SMOOTHING_QUALITY == 0
	ret = CalcTestShadowVal(WorldPosition,ZPos,SHADOW_EPSILON);
#elif SHADER_SHADOW_SMOOTHING_QUALITY == 1
	ret = CalcPCFShadowVal(WorldPosition,ZPos,SHADOW_EPSILON);
#elif SHADER_SHADOW_SMOOTHING_QUALITY == 2
	ret = CalcBlurredShadowVal(WorldPosition,ZPos,SHADOW_EPSILON);
#elif SHADER_SHADOW_SMOOTHING_QUALITY == 3
	ret = CalcPoissonPCFShadowVal(WorldPosition, ZPos, SHADOW_EPSILON);
#endif
#else
	ret = CalcTestShadowVal(WorldPosition,ZPos,SHADOW_EPSILON);
#endif

	float NearFar =  smoothstep(SHADOW_FADE_START, SHADOW_FADE_END, ZPos);
	ret = lerp(ret, 1.0, NearFar);

	return ret;
}

float CalculateCascadedShadowDirLight_2(float4 PosLight, int ShadowMapNumber)
{
return 0;
	// [-1,1]
	float2 ShadowTexC = 0.5 * PosLight.xy / PosLight.w + float2( 0.5, 0.5 );
	//[0,1]
	ShadowTexC.y = 1.0f - ShadowTexC.y;
	//
	ShadowTexC *= 0.5f;
	ShadowTexC += TexLookup[ShadowMapNumber];
	//
	//ShadowTexC.y = 1.0f - ShadowTexC.y;

	float LightAmount = (tex2D( light_shadow_map, ShadowTexC ).x < PosLight.z / PosLight.w)? 0.0f: 1.0f;  
	return LightAmount; // + CLOOKUP[ShadowMapNumber];
	//return CLOOKUP[ShadowMapNumber];
}
	

#endif