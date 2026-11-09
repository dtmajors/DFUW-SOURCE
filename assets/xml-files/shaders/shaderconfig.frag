//  Shader Config
//
//
//

#ifndef __SHADER__CONFIG__
#define __SHADER__CONFIG__


/////////////////////////////////////////////////////
// Shadowmap configs

#define SHADER_SHADOW_USE_ALPHA
//#define SHADER_SHADOW_USE_VSM
//#define SHADER_SHADOW_USE_DOT_SHADOW
#define SHADER_SHADOW_ADD 0.4f
//#define SHADER_SHADOW_DISABLE

//#define SHADER_SHADOW_ENABLE

// SHADER_DEFERRED_ENABLE is provided by the engine


#define SHADER_SHADOW_ALPHA_THRESHOLD 0.3f
#define SHADER_SHADOW_CASCADED

//#define SSAO_ENABLE

#ifndef SHADER_DEFERRED_ENABLE
	#ifdef SHADER_DYNAMIC_LIGHTS_ENABLE
		#define SHADER_DYNAMIC_OPAQUE_LIGHTS_ENABLE
	#endif
#endif


#ifdef SHADER_DEFERRED_ENABLE
	#define DEPTH_WRITE_ENABLE
	#define MATERIAL_WRITE_ENABLE
#else
	#ifdef SHADER_SHADOW_ENABLE
		#define DEPTH_WRITE_ENABLE
	#endif
	#ifdef SSAO_ENABLE
		#define DEPTH_WRITE_ENABLE
	#endif
#endif

#define SSAO_NO_EFFECT -9999999.0

////////////////////////////////////////////////////
// Texture Sampler Config
#define SET_SAMPLERSTATE

#ifndef DEFAULT_TEXTUREFILTER
#define DEFAULT_TEXTUREFILTER ANISOTROPIC
#endif

#ifndef DEFAULT_MIN_TEXTUREFILTER
#define DEFAULT_MIN_TEXTUREFILTER ANISOTROPIC
#endif

#ifndef DEFAULT_MAG_TEXTUREFILTER
#define DEFAULT_MAG_TEXTUREFILTER ANISOTROPIC
#endif

#ifndef DEFAULT_MIPFILTER
#define DEFAULT_MIPFILTER LINEAR
#endif

#ifndef DEFAULT_CUBE_MIN_TEXTUREFILTER
#define DEFAULT_CUBE_MIN_TEXTUREFILTER LINEAR
#endif

#ifndef DEFAULT_CUBE_MAG_TEXTUREFILTER
#define DEFAULT_CUBE_MAG_TEXTUREFILTER LINEAR
#endif

#ifndef DEFAULT_CUBE_MIPFILTER
#define DEFAULT_CUBE_MIPFILTER LINEAR
#endif

#ifndef USER_TEXTURE_FILTER
#define USER_TEXTURE_FILTER ANISOTROPIC
#endif

////////////////////////////////////////////////////
// Motion Blur Config

//#define SHADER_MB_ENABLE

//#define SHADER_MB_USE_VIEW






#endif