
#ifndef _OFFSCREEN_FX_FRAG_
#define _OFFSCREEN_FX_FRAG_

#include "shaderconfig.frag"
#include "ssao.frag"
#include "camera.frag"

float OffscreenFXAlphaBias : REPOffscreenFXAlphaBias;

float ZBufferToLinear2(float ZBuffer)
{
	float A = CAMERA_FAR_PLANE / (CAMERA_FAR_PLANE - CAMERA_NEAR_PLANE);
	float B = -CAMERA_NEAR_PLANE * A;
	return B / (ZBuffer - A);
}

float4 ProcessOffscreenFXColor(float4 c, float z, float2 ScreenTC) {
	float4 normalDepth = tex2D(ZBufferSampler, ScreenTC);
	if (normalDepth.w > 0 && normalDepth.w <= z) clip(-1);
	c.a = saturate(c.a + OffscreenFXAlphaBias);
	
	return float4(c.rgb * c.a * 0.725, c.a);
}

float4 ProcessOffscreenFXColor(float4 c, float4 ClipSpace) {
	float2 ClipXYByW = ClipSpace.xy / ClipSpace.w;
	float2 ScreenTC = (ClipXYByW * float2(1, -1) + 1) / 2;
	ScreenTC += 0.5 / BackBufferParams;
	return ProcessOffscreenFXColor(c, ClipSpace.z / ClipSpace.w, ScreenTC);
}


float4 ProcessOffscreenFXColorSmooth(float4 c, float z, float2 ScreenTC) {
	float4 normalDepth = tex2D(ZBufferSampler, ScreenTC);
	if (normalDepth.w > 0 && normalDepth.w <= z) clip(-1);
	
#ifndef LOW_SHADER_QUALITY
	// smooth particles
	float effectLinearDepth = ZBufferToLinear2(z);
	float sceneLinearDepth = ZBufferToLinear2(normalDepth.w);
	
	float dist = abs(sceneLinearDepth - effectLinearDepth);
	
	float fader = smoothstep(0, 0.4, dist);
	c.a *= fader;
#endif

	c.a = saturate(c.a + OffscreenFXAlphaBias);
	
	return float4(c.rgb * c.a, c.a);
}

float4 ProcessOffscreenFXColorSmooth(float4 c, float4 ClipSpace) {
	float2 ClipXYByW = ClipSpace.xy / ClipSpace.w;
	float2 ScreenTC = (ClipXYByW * float2(1, -1) + 1) / 2;
	ScreenTC += 0.5 / BackBufferParams;
	return ProcessOffscreenFXColorSmooth(c, ClipSpace.z / ClipSpace.w, ScreenTC);
}

#endif // ndef _OFFSCREEN_FX_FRAG_

