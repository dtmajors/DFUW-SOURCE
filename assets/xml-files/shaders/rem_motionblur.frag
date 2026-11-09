//	MoTiOnBluR Fragz


#include "shaderconfig.frag"
#include "matrix.frag"

#ifndef __MOTION_BLUR__FRAG__
#define __MOTION_BLUR__FRAG__

texture EffectTexture : REPEffectTexture;

sampler2D VelocitySampler =
sampler_state
{
    Texture = <EffectTexture>;
    AddressU = Clamp;
    AddressV = Clamp;
#ifdef SET_SAMPLERSTATE
    MinFilter = Point;
    MagFilter = Point;
#endif	
	BorderColor = 0;
};


float2 getPixelVelocity(float2 ScreenCoords, float BlurFactor)
{
    float2 pixelVelocity = tex2D(VelocitySampler, ScreenCoords).xy;
	
	return pixelVelocity*BlurFactor;
}


float2 MB_GetMBVal_float(float4 ProjPos, float4 PrevWorldPos)
{
   float4 PrevProjPos;
#ifdef SHADER_MB_USE_VIEW
   PrevProjPos = mul(PrevWorldPos,PREV_VIEW_PROJECTION_MATRIX);
#else
   PrevProjPos = mul(PrevWorldPos,VIEW_PROJECTION_MATRIX);
#endif

    // Convert to non-homogeneous points [-1,1] by dividing by w 
    ProjPos /= ProjPos.w;
    PrevProjPos /= PrevProjPos.w;

    float2 Velocity = ProjPos.xy - PrevProjPos.xy;    

    // The velocity is now between (-2,2) so divide by 2 to get it to (-1,1)
    Velocity /= 2.0f;   

	return Velocity;
}

float2 MB_GetBMVal_float(float4 ProjPos, float4 PrevWorldPos, float Scale)
{
	float2 Velocity = MB_GetMBVal_float(ProjPos,PrevWorldPos);
	Velocity *= Scale;
	return Velocity;
}


float2 MB_GetMBVal(float4 ProjPos,float4 PrevWorldPos)
{

   float4 PrevProjPos;

#ifdef SHADER_MB_USE_VIEW
   PrevProjPos = mul(PrevWorldPos,PREV_VIEW_PROJECTION_MATRIX);
#else
   PrevProjPos = mul(PrevWorldPos,VIEW_PROJECTION_MATRIX);
#endif

    // Convert to non-homogeneous points [-1,1] by dividing by w 
    ProjPos /= ProjPos.w;
    PrevProjPos /= PrevProjPos.w;
    
    
    // Vertex's velocity (in non-homogeneous projection space) is the position this frame minus 
    // its position last frame.  
    float2 Velocity = ProjPos.xy - PrevProjPos.xy;    
    // The Velocity is now between (-2,2) so divide by 2 to get it to (-1,1)
    Velocity /= 2.0f;
	//Now we need to encode it to [0,1]
	//[-0.5f,0.5f]
	Velocity /= 2.0f;
	//
	
	//Velocity *= 0.25f;
	Velocity += 0.5f;
	/*
	float Compare = 1.0f;
	if (Velocity.x > Compare || Velocity.x < -Compare)
		Velocity.x = 0.0f;
	if (Velocity.y > Compare || Velocity.y < -Compare)
		Velocity.y = 0.0f;
		*/
	
    
    return Velocity;
}

float2 MB_GetMBVal(float4 ProjPos,float4 PrevWorldPos, float Scale)
{

   float4 PrevProjPos;

#ifdef SHADER_MB_USE_VIEW
   PrevProjPos = mul(PrevWorldPos,PREV_VIEW_PROJECTION_MATRIX);
#else
   PrevProjPos = mul(PrevWorldPos,VIEW_PROJECTION_MATRIX);
#endif

    // Convert to non-homogeneous points [-1,1] by dividing by w 
    ProjPos /= ProjPos.w;
    PrevProjPos /= PrevProjPos.w;
    
    
    // Vertex's velocity (in non-homogeneous projection space) is the position this frame minus 
    // its position last frame.  
    float2 Velocity = ProjPos.xy - PrevProjPos.xy;    
    // The Velocity is now between (-2,2) so divide by 2 to get it to (-1,1)
    Velocity /= 4.0f;
	//Now we need to encode it to [0,1]
	//[-0.5f,0.5f]
	//Velocity /= 2.0f;
	//
	Velocity *= Scale;
	
	//Velocity *= 0.25f;
	Velocity += 0.5f;
	Velocity = saturate(Velocity);
	if (Scale < 0.001f)
		Velocity = 0.0f;
	
    
    return Velocity;
	
}


#endif