//  Shared Environment Variables
//
//
//

#ifndef __ENVIRONMENT__FRAG__
#define __ENVIRONMENT__FRAG__

#include "shaderconfig.frag"

const shared texture EnvMap : REEnvGlobalEnvironmentMap;
const shared float4 SkyColor : REEnvSkyColor;

#define ENVIRONMENT_MAP EnvMap
#define SKY_COLOR SkyColor

sampler Environment_Sampler = sampler_state
{ 
    Texture = (ENVIRONMENT_MAP);
#ifdef SET_SAMPLERSTATE
    MipFilter = DEFAULT_CUBE_MIPFILTER;
    MinFilter = DEFAULT_CUBE_MIN_TEXTUREFILTER;
    MagFilter = DEFAULT_CUBE_MAG_TEXTUREFILTER;
#endif
};



#endif