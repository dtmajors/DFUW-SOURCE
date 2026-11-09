//  ShadowMap
//
//
//
#include "shaderconfig.frag"
#include "sampler.frag"
#include "mathconstants.frag"

#ifndef __SHADOWMAP_FRAG__
#define __SHADOWMAP_FRAG__

#include "texture.frag"

#include "cascadedshadowmap.frag"
//The sampler for the shadow map

//Shadow stuff
const shared matrix ShadowViewProjectionMatrix : REPShadowViewProjection;
const shared matrix ShadowTextureMatrix		: REPShadowTextureMatrix;
const shared float ShadowAmbientAdd : REPShadowAmbientAdd;

#define SHADOW_AMBIENT ShadowAmbientAdd

#define SHADOW_VIEW_PROJECTION_MATRIX ShadowViewProjectionMatrix
#define SHADOW_TEXTURE_MATRIX ShadowTextureMatrix


#define SMAP_SIZE 4096
//#define SHADOW_EPSILON 0.000000f
#define SHADOW_EPSILON 0.00005f
//#define SHADOW_EPSILON 0.999995f



sampler light_shadow_map_test = sampler_state
{
    texture   = <ShadowTexture>;
    AddressU  = CLAMP;
    AddressV  = CLAMP;
#ifdef SET_SAMPLERSTATE
    MipFilter = POINT;
    MinFilter = POINT;
    MagFilter = POINT;
#endif	
};

struct VS_SHADOWMAP_OUTPUT
{
    float4 Pos  	: POSITION;
    float2 Tex		: TEXCOORD0;
    float4 ScreenPos 	: TEXCOORD1;
};

struct VS_SHADOWMAP_OUTPUT_NO_TEXTURE
{
    float4 Pos  	: POSITION;
    float4 ScreenPos 	: TEXCOORD0;
};

struct VS_SHADOWMAP_OUTPUT_SCREENPOS
{
	float4 Pos	: POSITION;
	float4 ScreenPos : TEXCOORD0;
};

/*
float4 ShadowMapPSWorldPos(VS_SHADOWMAP_OUTPUT_WORLDPOS Input) : COLOR
{

	//float4 POS = mul(float4(Input.WorldPos.xyz,1.0f),SHADOW_VIEW_PROJECTION_MATRIX);
	  
	//float4 Out = POS.z/POS.w;
	float4 Out = Input.WorldPos.z/Input.WorldPos.w;
	return Out;
}
*/


struct PS_SHADOWMAP_ID_OUTPUT
{
    float4 Depth : COLOR0;
    float4 ID 	 : COLOR1;
};

/*
void calculateShadowValues(VS_SHADOWMAP_OUTPUT In)
{
    In.ScreenPos = In.Pos.zw;
}
*/

/*
void calculateShadowValuesNoTexture(VS_SHADOWMAP_OUTPUT_NO_TEXTURE In)
{
    In.ScreenPos = In.Pos.zw;
	//In.ScreenPos.x = In.Pos.z + 5.0f;
	//In.ScreenPos.y = In.Pos.w;
}
*/

//#define DEPTHBIAS 0.1f

float4 ShadowMapPS(VS_SHADOWMAP_OUTPUT Input) : COLOR
{
	
	float4 Out = (float4)0;
	
#ifdef SHADER_SHADOW_USE_ALPHA
	Out = tex2D( SHADOWMAPSAMPLER, Input.Tex);
	
	if (Out.a > SHADER_SHADOW_ALPHA_THRESHOLD)
		Out = (Input.ScreenPos.z/Input.ScreenPos.w);
	else
	{
		clip(-1);
	}

#else
	Out = Input.ScreenPos.z/Input.ScreenPos.w;
	//Out = Input.ScreenPos.x; //Z Value linearized
#endif

	return Out;
}


float4 ShadowMapPSNoTexture(VS_SHADOWMAP_OUTPUT_NO_TEXTURE Input) : COLOR
{
	float4 Out = Input.ScreenPos.z/Input.ScreenPos.w;
	  
	return Out;
}


float4 ShadowMapPSForceNoAlpha(VS_SHADOWMAP_OUTPUT Input) : COLOR
{
	
	float4 Out = (float4)0;
	
	Out = Input.ScreenPos.x/Input.ScreenPos.y;
	  
	return Out;
}


float4 ShadowMapVariancePS(VS_SHADOWMAP_OUTPUT Input) : COLOR
{
	
	float4 Out = (float4)0;
	
	float Val;
#ifdef 	SHADER_SHADOW_USE_ALPHA
	Out = tex2D( DEFAULT_SAMPLER_2, Input.Tex);
	
	//IGNORE ALPHA FOR NOW
	if (Out.a > SHADER_SHADOW_ALPHA_THRESHOLD)
		Val = Input.ScreenPos.x/Input.ScreenPos.y;
	else
	{
		clip(-1);
		//Val = 1.0;
	}

#else
	Val = Input.ScreenPos.x/Input.ScreenPos.y;
#endif


	Out.x = Val;
	Out.y = Val*Val;
	
	return Out;
	
}

float4 ShadowPSFragment(float4 ShadowPos)
{
   float4 Depth = tex2D(light_shadow_map,ShadowPos.xy);
}


float CalculateShadowDirLight(float4 ViewPos, float4 vPosLight)
{
        // Pixel is in lit area. Find out if it's
        // in shadow using 2x2 percentage closest filtering

        //transform from RT space to texture space.
        float2 ShadowTexC = 0.5 * vPosLight.xy / vPosLight.w + float2( 0.5, 0.5 );
        ShadowTexC.y = 1.0f - ShadowTexC.y;
		//ShadowTexC /= 2.0f;

        // transform to texel space
        float2 texelpos = SMAP_SIZE * ShadowTexC;
        
        // Determine the lerp amounts           
        float2 lerps = frac( texelpos );

        //read in bilerp stamp, doing the shadow checks
        float sourcevals[4];
        float LightAmount = (tex2D( light_shadow_map, ShadowTexC ).x < vPosLight.z / vPosLight.w)? 0.0f: 1.0f;  
		return LightAmount;
		/*
        sourcevals[0] = (tex2D( light_shadow_map_test, ShadowTexC ) + SHADOW_EPSILON < vPosLight.z / vPosLight.w)? 0.0f: 1.0f;  
        sourcevals[1] = (tex2D( light_shadow_map_test, ShadowTexC + float2(1.0/SMAP_SIZE, 0) ) + SHADOW_EPSILON < vPosLight.z / vPosLight.w)? 0.0f: 1.0f;  
        sourcevals[2] = (tex2D( light_shadow_map_test, ShadowTexC + float2(0, 1.0/SMAP_SIZE) ) + SHADOW_EPSILON < vPosLight.z / vPosLight.w)? 0.0f: 1.0f;  
        sourcevals[3] = (tex2D( light_shadow_map_test, ShadowTexC + float2(1.0/SMAP_SIZE, 1.0/SMAP_SIZE) ) + SHADOW_EPSILON < vPosLight.z / vPosLight.w)? 0.0f: 1.0f;  
        
        // lerp between the shadow values to calculate our light amount
        float LightAmount = lerp( lerp( sourcevals[0], sourcevals[1], lerps.x ),
                                 lerp( sourcevals[2], sourcevals[3], lerps.x ),
                                  lerps.y );
        
        //float LightAmount = 0;
        //for (int i=0; i < 4; ++i)
        //	LightAmount += sourcevals[i];
		//LightAmount += sourcevals[0] * 0.5;
		//LightAmount += sourcevals[1] * 0.5/3.0f;
		//LightAmount += sourcevals[2] * 0.5/3.0f;
		//LightAmount += sourcevals[3] * 0.5/3.0f;
		
        
        //LightAmount /=4;
        // Light it
		//LightAmount = sourcevals[0];
        return LightAmount;

		*/
}

#define light_vsm_epsilon 0.0//001

float CalculateShadowDirLightVariance(float4 ViewPos, float4 vPosLight)
{

        //transform from RT space to texture space.
        float2 ShadowTexC = 0.5 * vPosLight.xy / vPosLight.w + float2( 0.5, 0.5 );
        ShadowTexC.y = 1.0f - ShadowTexC.y;

        // transform to texel space
        float2 texelpos = SMAP_SIZE * ShadowTexC;
        
        // Determine the lerp amounts           
        float2 lerps = frac( texelpos );
        
        float Compare = vPosLight.z/vPosLight.w;
        float Compare_x2 = Compare*Compare;

	float2 sourcevals[4];
	
        sourcevals[0] = tex2D( light_shadow_map, ShadowTexC );
        sourcevals[1] = tex2D( light_shadow_map, ShadowTexC + float2(1.0/SMAP_SIZE, 0) );
        sourcevals[2] = tex2D( light_shadow_map, ShadowTexC + float2(0, 1.0/SMAP_SIZE) );
        sourcevals[3] = tex2D( light_shadow_map, ShadowTexC + float2(1.0/SMAP_SIZE, 1.0/SMAP_SIZE) );

        //sourcevals[0] = tex2D( light_shadow_map, ShadowTexC );
        //sourcevals[1] = tex2D( light_shadow_map, ShadowTexC + float2(-1.0/SMAP_SIZE, -1.0/SMAP_SIZE) ); //Upper Left
        //sourcevals[2] = tex2D( light_shadow_map, ShadowTexC + float2(1.0/SMAP_SIZE, -1.0/SMAP_SIZE) ); //Upper Right
        //sourcevals[3] = tex2D( light_shadow_map, ShadowTexC + float2(-1.0/SMAP_SIZE, 1.0/SMAP_SIZE) ); //Lower Left
        //sourcevals[4] = tex2D( light_shadow_map, ShadowTexC + float2(1.0/SMAP_SIZE, 1.0/SMAP_SIZE) ); //Lower Right
        
        //float Divisor = 1.0/5;
        //float2 moments = 0.5f*sourcevals[0];
        //moments += 0.25f*lerp(sourcevals[1],sourcevals[4],0.5f);
        //moments += 0.25f*lerp(sourcevals[2],sourcevals[3],0.5f);

	float2 moments = lerp( lerp( sourcevals[0], sourcevals[1], lerps.x ),
	                          lerp( sourcevals[2], sourcevals[3], lerps.x ),
	                          lerps.y );

        float Light = 1;

        if ( (moments.x + SHADOW_EPSILON) <= Compare)
        {
            float E_x2 = moments.y;
            float Ex_2 = moments.x*moments.x;
            float variance =  min(max(E_x2 - Ex_2, 0.0), 1.0);
            float p = variance/(variance + (Ex_2));
            if (p > 0)
            	p = 1-p;
            Light = p;
            
            
        }
        
        /*
        if ( (moments.x + SHADOW_EPSILON) <= Compare)
        {
            Light = 0;
            for (int i=0; i < 4; ++i)
            {
            	float E_x2 = sourcevals[i].y;
            	float Ex_2 = sourcevals[i].x*sourcevals[i].x;
            	float variance =  min(max(E_x2 - Ex_2, 0.0), 1.0);
            	float p = variance/(variance + Ex_2);
            	Light += p;
            }         
            
            Light /= 4;
            
        }
        */
        
        //if ( ((moments.x + SHADOW_EPSILON) > Compare) && ((moments.y + SHADOW_EPSILON) > Compare_x2) )
        //	Light = 1;
        
        return Light;

}


float4 GetShadowValue(const float4 InColor,float ShadowVal)
{
#ifdef SHADER_SHADOW_DISABLE
	return InColor;
#else
    float RealShadowVal = saturate(ShadowVal + SHADOW_AMBIENT);
#ifdef SHADER_SHADOW_USE_DOT_SHADOW
    const float3 Dot=float3(0.3,0.59,0.11);
    float dp = dot(Dot,InColor.xyz);
    dp = 1.0f - dp;
    return InColor*saturate(RealShadowVal+dp);
#else
	float4 Out = InColor;
    Out.xyz *=RealShadowVal;
    return Out;
#endif
#endif


}

#endif