//	Samplers

#ifndef __TEXTURE_FRAG__
#define __TEXTURE_FRAG__

#include "sampler.frag"

texture Tex0 : REPTextureDirect;
texture TexNormal : REPTextureDirectNormal;
texture TexSpecular : REPTextureDirectSpecular;
texture TexIllumination : REPTextureDirectIllumination;
texture DetailTexture : REPTextureDetail;
texture colorGradingTexture : REPColorGradingTexture;

sampler LinearSampler_2 = sampler_state
{
    texture = <Tex0>;
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0;
    //MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    
#ifdef SET_SAMPLERSTATE
    MipFilter = DEFAULT_MIPFILTER;
    MinFilter = USER_TEXTURE_FILTER;
    MagFilter = USER_TEXTURE_FILTER;
#endif	
};

sampler ShadowMapSampler = sampler_state
{
    texture = <Tex0>;
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0;
    //MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    
#ifdef SET_SAMPLERSTATE
    MipFilter = POINT;
    MinFilter = POINT;
    MagFilter = POINT;
#endif	
};


/*
sampler AnisotropicSampler_2 = sampler_state
{
    texture = <Tex0>;
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0;
    //MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    
    
#ifdef SET_SAMPLERSTATE
    MipFilter = LINEAR;
    MinFilter = ANISOTROPIC;
    MagFilter = ANISOTROPIC;
#endif	
};
*/

#define DEFAULT_SAMPLER_2 LinearSampler_2
#define SHADOWMAPSAMPLER ShadowMapSampler
//#define DEFAULT_SAMPLER_2 AnisotropicSampler_2

sampler DETAILTEXTURE_SAMPLER = sampler_state
{
    texture = <DetailTexture>;
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0;
    //MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
#ifdef SET_SAMPLERSTATE
    MipFilter = DEFAULT_MIPFILTER;
    MinFilter = USER_TEXTURE_FILTER;
    MagFilter = USER_TEXTURE_FILTER;
	
    
    //MipFilter = LINEAR;
    //MinFilter = ANISOTROPIC;
    //MagFilter = ANISOTROPIC;
#endif	
};

texture ShadowTexture : REPShadowTexture;

sampler light_shadow_map = sampler_state
{
    texture   = <ShadowTexture>;
#ifdef SET_SAMPLERSTATE
    MinFilter = Point;
    MagFilter = Point;
    MipFilter = NONE;	
#endif	
    AddressU = Border;
    AddressV = Border;
    BorderColor = 0xFFFFFFFF;
};


///////////////////////////////////////////////////////////////////////////////////////////////////////
#ifdef SET_SAMPLERSTATE
#define LinearSamplerMacro(SamplerName, Texture) \
	sampler SamplerName = sampler_state \
	{ \
		texture = < Texture >; \
		AddressU = WRAP; \
		AddressV = WRAP; \
		AddressW = WRAP; \
		BorderColor = 0; \
		MaxMipLevel = 0; \
		MipFilter = DEFAULT_MIPFILTER; \
		MinFilter = DEFAULT_MIN_TEXTUREFILTER; \
		MagFilter = DEFAULT_MAG_TEXTUREFILTER; \
	}
#else
#define LinearSamplerMacro(SamplerName, Texture) \
	sampler SamplerName = sampler_state \
	{ \
		texture = < Texture >; \
		AddressU = WRAP; \
		AddressV = WRAP; \
		AddressW = WRAP; \
		BorderColor = 0; \
		MaxMipLevel = 0; \
	}
#endif	


LinearSamplerMacro(LinearSampler_Normal, TexNormal);
LinearSamplerMacro(LinearSampler_Specular, TexSpecular);
LinearSamplerMacro(LinearSampler_Illumination, TexIllumination);

#define DEFAULT_SAMPLER_DIFFUSE			DEFAULT_SAMPLER_2
#define DEFAULT_SAMPLER_NORMAL			LinearSampler_Normal
#define DEFAULT_SAMPLER_SPECULAR		LinearSampler_Specular
#define DEFAULT_SAMPLER_ILLUMINATION	LinearSampler_Illumination





// Common textures
// ---------------------
texture EnchantmentGlowTexture : REPEnchantmentGlowTexture;
sampler EnchantmentGlowSampler = sampler_state
{
    texture = <EnchantmentGlowTexture>;
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0xFFFFFFFF;
    //MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    
#ifdef SET_SAMPLERSTATE
    MipFilter = DEFAULT_MIPFILTER;
    MinFilter = USER_TEXTURE_FILTER;
    MagFilter = USER_TEXTURE_FILTER;
#endif	
};

texture RandomPoissonRotationTexture : REPRandomPoissonRotationTexture;
sampler RandomPoissonRotationSampler = sampler_state
{
    texture = <RandomPoissonRotationTexture>;
    AddressU = WRAP;
    AddressV = WRAP;
    AddressW = WRAP;
    BorderColor = 0xFFFFFFFF;
    //MAXANISOTROPY = 1;
    MaxMipLevel = 0;
    
    MipFilter = POINT;
    MinFilter = POINT;
    MagFilter = POINT;
};

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Post Effects
texture SceneColor  : REPTextureSceneColor;
texture GlowTex			: REPBloomTexture;
texture UnderwaterParticleTexture		:  RETextureUnderwaterParticles;
texture UnderwaterNormalTexture		: RETextureUnderwaterNormalmap;
texture AvgLumiTex		: REPAverageLuminanceTexture;

texture GodRayTex	 : REPGodRayTexture;

sampler2D SceneSampler =
sampler_state
{
    Texture = <SceneColor>;
    AddressU = Clamp;
    AddressV = Clamp;
/*	
#ifdef SET_SAMPLERSTATE
    MinFilter = Point;
    MagFilter = Point;
#endif	
*/
};

sampler2D GlowSampler = sampler_state
{
	Texture = <GlowTex>;
	AddressU = CLAMP;
	AddressV = CLAMP;
    MinFilter = Linear;
    MagFilter = Linear;
};

sampler2D UnderwaterParticleSampler = sampler_state
{
	Texture = <UnderwaterParticleTexture>;
	AddressU = MIRROR;
	AddressV = MIRROR;
    MinFilter = Linear;
    MagFilter = Linear;
};

sampler2D UnderwaterNormalSampler = sampler_state
{
	Texture = <UnderwaterNormalTexture>;
	AddressU = WRAP;
	AddressV = WRAP;
    MinFilter = Linear;
    MagFilter = Linear;
};

sampler2D AvgLumiSampler = sampler_state
{
	Texture = <AvgLumiTex>;
	AddressU = CLAMP;
	AddressV = CLAMP;
//#ifdef SET_SAMPLERSTATE
    MinFilter = Point;
    MagFilter = Point;
//#endif
};

sampler2D GodRaySampler = sampler_state
{
	Texture = <GodRayTex>;
	AddressU = CLAMP;
	AddressV = CLAMP;
//#ifdef SET_SAMPLERSTATE
    MinFilter = Linear;
    MagFilter = Linear;
//#endif
};

sampler3D colorGradingSampler =
sampler_state
{
    Texture = <colorGradingTexture>;
    AddressU = Clamp;
    AddressV = Clamp;
	AddressW = Clamp;
    MinFilter = Linear;
    MagFilter = Linear;
};

texture OffscreenFXTexture : REPTextureOffscreenFX;
sampler2D OffscreenFXSampler =
sampler_state
{
    Texture = <OffscreenFXTexture>;
    AddressU = Clamp;
    AddressV = Clamp;
	
    MinFilter = Linear;
    MagFilter = Linear;
};

#endif