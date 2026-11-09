// SMAA.frag

#ifndef __SMAA_FRAG__
#define __SMAA_FRAG__

#include "camera.frag"

// ------------------------------------------------------------------------------------------
#define SMAA_PIXEL_SIZE float2(1.0 / BackBufferParams.x, 1.0 / BackBufferParams.y)
#define SMAA_HLSL_3 1

#define SMAA_PRESET_LOW 0
#define SMAA_PRESET_MEDIUM 0
#define SMAA_PRESET_HIGH 0
#define SMAA_PRESET_ULTRA 1
// ------------------------------------------------------------------------------------------ 

#include "SMAA.h"
 
// Input vars and textures.
texture colorTex2D : REPSMAAColorTexture;
texture depthTex2D : REPSMAADepthTexture;
texture edgesTex2D : REPSMAAEdgeTexture;
texture blendTex2D : REPSMAABlendTexture;
texture areaTex2D : REPSMAAAreaTexture;
texture searchTex2D : REPSMAASearchTexture;



//DX9 samplers.
sampler2D colorTex {
    Texture = <colorTex2D>;
    AddressU  = Clamp; AddressV = Clamp;
    MipFilter = Point; MinFilter = Linear; MagFilter = Linear;
    SRGBTexture = false;
};

sampler2D colorTexG {
    Texture = <colorTex2D>;
    AddressU  = Clamp; AddressV = Clamp;
    MipFilter = Linear; MinFilter = Linear; MagFilter = Linear;
    SRGBTexture = false;
};

sampler2D depthTex {
    Texture = <depthTex2D>;
    AddressU  = Clamp; AddressV = Clamp;
    MipFilter = Linear; MinFilter = Linear; MagFilter = Linear;
    SRGBTexture = false;
};

sampler2D edgesTex {
    Texture = <edgesTex2D>;
    AddressU = Clamp; AddressV = Clamp;
    MipFilter = Linear; MinFilter = Linear; MagFilter = Linear;
    SRGBTexture = false;
};

sampler2D blendTex {
    Texture = <blendTex2D>;
    AddressU = Clamp; AddressV = Clamp;
    MipFilter = Linear; MinFilter = Linear; MagFilter = Linear;
    SRGBTexture = false;
};

sampler2D areaTex {
    Texture = <areaTex2D>;
    AddressU = Clamp; AddressV = Clamp; AddressW = Clamp;
    MipFilter = Linear; MinFilter = Linear; MagFilter = Linear;
    SRGBTexture = false;
};

sampler2D searchTex {
    Texture = <searchTex2D>;
    AddressU = Clamp; AddressV = Clamp; AddressW = Clamp;
    MipFilter = Point; MinFilter = Point; MagFilter = Point;
    SRGBTexture = false;
};

#endif
 
 