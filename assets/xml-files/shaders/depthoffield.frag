// depthoffield.frag

#ifndef _DEPTH_OF_FIELD_FRAG_
#define _DEPTH_OF_FIELD_FRAG_

#include "camera.frag"
#include "ssao.frag"

float DOFZBufferToLinear(float ZBuffer)
{
	float A = CAMERA_FAR_PLANE / (CAMERA_FAR_PLANE - CAMERA_NEAR_PLANE);
	float B = -CAMERA_NEAR_PLANE * A;
	return B / (ZBuffer - A);
}

bool DepthOfFieldEnabled :REPDepthOfFieldEnabled;

texture DepthOfFieldBlurTexture : REPTextureDepthOfFieldBlur;
sampler2D DepthOfFieldBlurSampler =
sampler_state
{
    Texture = <DepthOfFieldBlurTexture>;
    AddressU = Clamp;
    AddressV = Clamp;

    MinFilter = Linear;
    MagFilter = Linear;
};

#define DOF_SAMPLER DepthOfFieldBlurSampler

float4 ApplyDepthOfField(float4 OutColor, float2 texCoord) {
	[branch]
	if (!DepthOfFieldEnabled) return OutColor;

	float4 BlurredColor = tex2D(DOF_SAMPLER, texCoord);
	float4 NormalDepthSample = tex2D(ZBufferSampler, texCoord);
	float LinearDepth = DOFZBufferToLinear(NormalDepthSample.w) / CAMERA_FAR_PLANE;	
	float minimum = 0.002;
	float maximum = 0.3;//0.01;
	
	float factor1 = smoothstep(0.0, minimum, LinearDepth);
	float factor2 = smoothstep(1.0, maximum, LinearDepth);
	float DOFLerp = 1.0 - factor1 * factor2;
	
	// Don't let sky get blurred
	if (NormalDepthSample.w != 1.0) {
	OutColor = lerp(OutColor, BlurredColor, DOFLerp);
	}
	//else OutColor = float4(1, 0, 0, 1);
	
	
	
	return OutColor;
}

#endif // ndef _DEPTH_OF_FIELD_FRAG_