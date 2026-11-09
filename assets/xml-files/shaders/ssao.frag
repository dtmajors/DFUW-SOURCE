//  Screen Space Ambient Occlusion functions
//
//
//

#ifndef __SSAO__FRAG__
#define __SSAO__FRAG__

#include "shaderconfig.frag"
#include "camera.frag"
#include "fog.frag"

float SSAO_getZVal(const float ZValIn)
{
	return ZValIn;
};

static const float SSAO_ALPHABLEND_MIN_ALPHA = 0.1f;

texture ZBufferTexture : REPZBufferTexture;
texture ZBufferScaledTexture : REPZBufferScaledTexture;
texture SphereTexture : REPSphereTexture;

sampler2D ZBufferSampler =
sampler_state
{
    Texture = <ZBufferTexture>;
    AddressU = Clamp;
    AddressV = Clamp;
#ifdef SET_SAMPLERSTATE
    MinFilter = Point;
    MagFilter = Point;
#endif	
	BorderColor = 0;
};

sampler2D ZBufferScaledSampler =
sampler_state
{
    Texture = <ZBufferScaledTexture>;
    AddressU = Clamp;
    AddressV = Clamp;
#ifdef SET_SAMPLERSTATE
    MinFilter = Point;
    MagFilter = Point;
#endif	
	BorderColor = 0;
};

sampler2D Sphere4x4_16_Sampler =
sampler_state
{
    Texture = <SphereTexture>;
    AddressU = Wrap;
    AddressV = Wrap;
#ifdef SET_SAMPLERSTATE
    MinFilter = Point;
    MagFilter = Point;
#endif	
	BorderColor = 0;
};

/*
static const int KernelSize = 8;


float2 PixelCoordsFilter[KernelSize] =
{
    { -1, -1 },
    { +0, -1 },
    { +1, -1 },
    { +1, +0 },
    { +1, +1 },
    { +0, +1 },
    { -1, +1 },
    { -1, +0 },
};

static const int RandomSpherePointKernelSize = 16;

float3 SpherePointsKernel[RandomSpherePointKernelSize];

/*
float2 PixelCoordsFilter[KernelSize] =
{
    { -1, -1 },
    { +0, -1 },
    { +1, -1 },
    { +1, +0 },
    { +1, +1 },
    { +0, +1 },
    { -1, +1 },
    { -1, +0 },
	//
    { -2, -2 },
    { +2, -2 },
    { +2, +2 },
    { -2, +2 },	
};
*/
//LERP , Subtractor . SphereWidth, SphereDepth
float4 SSAO_params : REPSSAO_Parameters; // = { 0.9f,0.0075f,0.5f,0.5f };
// SmallAreaMin,BigAreaStart,  DepthRangeDivider,DefVal
float4 SSAO_params2 :REPSSAO_Parameters_2; // = { 5.0f, 32.0f , 64.0f, 0.0f };

float SSAO_LerpValue = 0.9f;

float getSSAOValSphere(float4 ScreenCoords)
{

	const float step = 1.f - (1.0f/8.f);
	float n = 0.0f;
	const float fScale = 0.025f;

	const float3 arrKernel[8] =
	{
		normalize(float3( 1, 1, 1))*fScale*(n+=step),
		normalize(float3(-1,-1,-1))*fScale*(n+=step),
		normalize(float3(-1,-1, 1))*fScale*(n+=step),
		normalize(float3(-1, 1,-1))*fScale*(n+=step),
		normalize(float3(-1, 1 ,1))*fScale*(n+=step),
		normalize(float3( 1,-1,-1))*fScale*(n+=step),
		normalize(float3( 1,-1, 1))*fScale*(n+=step),
		normalize(float3( 1, 1,-1))*fScale*(n+=step),
	};

	/*
	const float3 arrKernel[8] = 
	{
		float3(0.527837, -0.085868 ,0.527837)  *fScale*(n*=step),
		float3(-0.040088, 0.536087, -0.040088)  *fScale*(n*=step),
		float3(-0.670445, -0.179949, -0.670445)  *fScale*(n*=step),
		float3(-0.419418, -0.616039, -0.419418)  *fScale*(n*=step),
		float3(0.440453, -0.639399, 0.440453) *fScale*(n*=step),
		float3(-0.757088, 0.349334, -0.757088) *fScale*(n*=step),
		float3(0.574619, 0.685879,0.574619) *fScale*(n*=step),
		float3(0.03851, -0.939059, 0.03851) *fScale*(n*=step),
	};
	*/
	
	
	float2 SpherePointTexLookup; // = ScreenCoords.zw;
	SpherePointTexLookup.x = (ScreenCoords.x * BACKBUFFER_WIDTH); // /4.0f;
	SpherePointTexLookup.y = (ScreenCoords.y * BACKBUFFER_HEIGHT); // /4.0f;
	
	float3 rotSample = tex2D( Sphere4x4_16_Sampler, SpherePointTexLookup ).rgb; 
	//rotSample = (2.0 * rotSample - 1.0);
	rotSample = 2.0f * (rotSample -0.5f);

	float fSceneDepth = tex2D( ZBufferSampler, ScreenCoords.xy ).r;  	  

	// range conversions
	float fSceneDepthM = fSceneDepth;
	
	fSceneDepth /= CAM_NEAR_FARPLANE;

	float3 vSampleScale = SSAO_params.zzw
		* saturate(fSceneDepthM / SSAO_params2.x) // make area smaller if distance less than smallest
	* (1.f + fSceneDepthM / SSAO_params2.y ); // make area bigger if distance more than biggest

	float fDepthRangeScale = SSAO_params2.z / vSampleScale.z;
	
	// convert from meters into SS units
	vSampleScale.xy *= 1.0f / fSceneDepthM;
	vSampleScale.z  *= 2.0f / CAM_NEAR_FARPLANE;

	float fDepthTestSoftness = CAM_NEAR_FARPLANE/vSampleScale.z;

	// sample
	float4 vSkyAccess = 0.f;
	float4 arrSceneDepth2;      
	float3 vIrrSample;
	float4 vDistance;
	float4 fRangeIsInvalid;


  for(int i=0; i<2; i++)
  {    
	vIrrSample = reflect(arrKernel[i*4+0], rotSample) * vSampleScale;		
	arrSceneDepth2.x = tex2D( ZBufferScaledSampler, ScreenCoords.xy + vIrrSample.xy ).r*INV_CAM_NEAR_FARPLANE+ vIrrSample.z;  

	vIrrSample = reflect(arrKernel[i*4+1], rotSample) * vSampleScale;		
	arrSceneDepth2.y = tex2D( ZBufferScaledSampler, ScreenCoords.xy + vIrrSample.xy ).r*INV_CAM_NEAR_FARPLANE + vIrrSample.z;  

	vIrrSample = reflect(arrKernel[i*4+2], rotSample) * vSampleScale;		
	arrSceneDepth2.z = tex2D( ZBufferScaledSampler, ScreenCoords.xy + vIrrSample.xy ).r*INV_CAM_NEAR_FARPLANE + vIrrSample.z;  

	vIrrSample = reflect(arrKernel[i*4+3], rotSample) * vSampleScale;		
	arrSceneDepth2.w = tex2D( ZBufferScaledSampler, ScreenCoords.xy + vIrrSample.xy ).r*INV_CAM_NEAR_FARPLANE + vIrrSample.z;  


    vDistance = fSceneDepth - arrSceneDepth2; 
    float4 vDistanceScaled = vDistance * fDepthRangeScale;
    fRangeIsInvalid = (saturate( abs(vDistanceScaled) ) + saturate( vDistanceScaled ))/2.0f;  
    vSkyAccess += lerp(saturate((-vDistance)*fDepthTestSoftness), SSAO_params2.w, fRangeIsInvalid);
  }
  
	
  

  float Color = dot( vSkyAccess, (1/8.0f)*2.0 ) - SSAO_params.y; // 0.075f
  Color = saturate(lerp( 0.9f, Color, SSAO_params.x )); //0.9
  
  float LerpFactor = saturate(fSceneDepthM/FOG_END);
  
  Color = saturate(lerp(Color,1.0f,LerpFactor));

  
  if (fSceneDepthM < 0.5) // || fSceneDepthM > 300)
	Color = 1.0f;
//	else
//	Color = 1.0f;
  
  //Color = SpherePointTexLookup.x;
  //Color *= Color * Color;
  
  //Color = 1.0f - Color;
  
  //Color *= 0.3f;
  
  return Color;

}



#endif