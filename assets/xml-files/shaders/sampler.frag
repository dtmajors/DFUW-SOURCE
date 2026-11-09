//	Samplers

#ifndef __SAMPLER__FRAG__
#define __SAMPLER__FRAG__

#include "shaderconfig.frag"

sampler LinearSampler = sampler_state
{
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0;
//    MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    
#ifdef SET_SAMPLERSTATE
    MipFilter = DEFAULT_MIPFILTER;
    MinFilter = USER_TEXTURE_FILTER;
    MagFilter = USER_TEXTURE_FILTER;
#endif	
};
/*
sampler AnisotropicSampler = sampler_state
{
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0;
//    MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    
    
#ifdef SET_SAMPLERSTATE
    MipFilter = LINEAR;
    MinFilter = ANISOTROPIC;
    MagFilter = ANISOTROPIC;
#endif	
};
*/

#define DEFAULT_SAMPLER LinearSampler
//#define DEFAULT_SAMPLER AnisotropicSampler
#define LINEAR_SAMPLER LinearSampler

sampler PointSampler = sampler_state
{
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0;
//    MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    
    
#ifdef SET_SAMPLERSTATE
    MipFilter = POINT;
    MinFilter = POINT;
    MagFilter = POINT;
#endif	
};

#define POINT_SAMPLER PointSampler



#endif