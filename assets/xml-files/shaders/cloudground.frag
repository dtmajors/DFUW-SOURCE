//  Cloud Ground Calculation
//
//
//

#ifndef __CLOUDGROUND_FRAG__
#define __CLOUDGROUND_FRAG__


#include "shaderconfig.frag"
#include "wind.frag"
#include "time.frag"
#include "clouds.frag"
#include "objectbounding.frag"
#include "light_constants.frag"

//#define CLOUD_REPEAT 1.0f
#define CLOUD_SCALE 0.2f
#define CLOUD_SPEED_MULTIPLIER 0.4f

texture CLOUD_TEXTURE : REPCurrentCloudTexture;

sampler CLOUD_SAMPLER = sampler_state
{
    Texture   = (CLOUD_TEXTURE);
#ifdef SET_SAMPLERSTATE
    MipFilter = DEFAULT_MIPFILTER;
    MinFilter = USER_TEXTURE_FILTER;
    MagFilter = USER_TEXTURE_FILTER;
#endif
};



float CalculateGroundMultiplier(const float3 Normal)
{
    float Dot = max(0,dot(Normal,float3(0,1,0)));
    Dot = saturate(pow(Dot,2));
    return saturate(Dot*CLOUD_SCALE*CLOUD_THICKNESS);
}

float2 CalculateBoundingTexture(const float4 Pos, const float Repeat)
{
    float XMin = getXMin(Pos.x);
    float ZMin = getZMin(Pos.z);
    
    float2 Output;
    Output.x = XMin * Repeat;
    Output.y = ZMin * Repeat;
    
    return Output;

}

float2 CalculateGroundCloud(const float4 Pos)
{
    float XMin = getXMin(Pos.x);
    float ZMin = getZMin(Pos.z);
    
    
    float Weight = frac(TOTAL_TIME * WIND_SPEED * CLOUD_SPEED_MULTIPLIER * WIND_DIR_X * 0.3f);
    float Weight2 = frac(TOTAL_TIME * WIND_SPEED * CLOUD_SPEED_MULTIPLIER * WIND_DIR_Z * 0.3f);
    float2 Output;
    
    Output.x = (XMin * CLOUD_REPEAT) + Weight;
    Output.y = (ZMin * CLOUD_REPEAT) + Weight2;

    return Output;
	
}



#endif