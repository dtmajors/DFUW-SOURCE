#ifndef _SSAO_TOON_FRAG
#define _SSAO_TOON_FRAG

#include "matrix.frag"

float ZBufferToLinear(float depth){
    return (2.0 * CAMERA_NEAR_PLANE) / (CAMERA_FAR_PLANE + CAMERA_NEAR_PLANE - depth * (CAMERA_FAR_PLANE - CAMERA_NEAR_PLANE));
}

#define  SSAO_SAMPLES 10

#if SSAO_SAMPLES == 16
  const float invSamples = 1.0/SSAO_SAMPLES;
  float3 sample_sphere[SSAO_SAMPLES] = {
      float3( 0.5381, 0.1856,-0.4319), float3( 0.1379, 0.2486, 0.4430),
      float3( 0.3371, 0.5679,-0.0057), float3(-0.6999,-0.0451,-0.0019),
      float3( 0.0689,-0.1598,-0.8547), float3( 0.0560, 0.0069,-0.1843),
      float3(-0.0146, 0.1402, 0.0762), float3( 0.0100,-0.1924,-0.0344),
      float3(-0.3577,-0.5301,-0.4358), float3(-0.3169, 0.1063, 0.0158),
      float3( 0.0103,-0.5869, 0.0046), float3(-0.0897,-0.4940, 0.3287),
      float3( 0.7119,-0.0154,-0.0918), float3(-0.0533, 0.0596,-0.5411),
      float3( 0.0352,-0.0631, 0.5460), float3(-0.4776, 0.2847,-0.0271)
  };
#elif SSAO_SAMPLES == 10
  const float invSamples = 1.0/SSAO_SAMPLES;
  float3 sample_sphere[SSAO_SAMPLES] = {
	  float3(-0.010735935, 0.01647018, 0.0062425877),
	  float3(-0.06533369, 0.3647007, -0.13746321),
	  float3(-0.6539235, -0.016726388, -0.53000957),
	  float3(0.40958285, 0.0052428036, -0.5591124),
	  float3(-0.1465366, 0.09899267, 0.15571679),
	  float3(-0.44122112, -0.5458797, 0.04912532),
	  float3(0.03755566, -0.10961345, -0.33040273),
	  float3(0.019100213, 0.29652783, 0.066237666),
	  float3(0.8765323, 0.011236004, 0.28265962),
	  float3(0.29264435, -0.40794238, 0.15964167)
	};
#elif SSAO_SAMPLES == 4
  const float invSamples = 1.0/SSAO_SAMPLES;
  float3 sample_sphere[SSAO_SAMPLES]={
        float3(0.71022150437556,-0.57616785347561,-0.40449477047772),
        float3(-0.66233156894995,0.23663697811915,0.71085851852456),
        float3(-0.95620741813603,0.29259718729919,0.0073661038707264),
        float3(0.48730256536123,0.26901801203224,-0.83076201104443),
    };
#endif

float SSAO_NEW(float2 Tex0){

  const float total_strength = 12;
  const float strength = 0.07;
  const float offset = 100;
  const float falloff = 0.000002;
  const float2 random_size = float2(512,512); 
  
  float4 currentPixelSample = tex2D(ZBufferSampler,Tex0);
  float depth = ZBufferToLinear(currentPixelSample.w);
 
  float3 position = float3(Tex0, depth);
  float3 normal = normalize(currentPixelSample.xyz);
  normal = normalize(mul(normal,(float3x3)VIEW_MATRIX));
  
  float radius = lerp(0.00002,0.0006,smoothstep(0,0.2,depth));
  //float radius = lerp(0.0002,0.0006,smoothstep(0,1,depth));
  float radius_depth = radius/depth;
  float occlusion = 0.0;
  float rangeCheck;
  float4 occluderFragment;
  float occluderDepth,Depth_Difference;
  float3 ray,hemi_ray,Normal_Difference;
  
  for(int i=0; i < SSAO_SAMPLES; i++) {

	ray = radius_depth * sample_sphere[i]; //no noise
	hemi_ray = position + sign(dot(ray,normal)) * ray;
	
    occluderFragment = tex2D(ZBufferSampler,hemi_ray.xy);
	occluderDepth = ZBufferToLinear(occluderFragment.w);
	
	float3 Occludernormal = normalize(occluderFragment.xyz);
	Occludernormal = normalize(mul(Occludernormal,(float3x3)VIEW_MATRIX));
	
	Normal_Difference = 1.0 - dot(Occludernormal,normal);
    Depth_Difference = depth - occluderDepth;
    
	rangeCheck = smoothstep(0.0, 1.0, radius / abs(Depth_Difference));
	//rangeCheck = lerp(1,0,smoothstep(0,radius_depth,depth - occluderDepth));//working
	
    //occlusion += step(falloff, Depth_Difference) * Normal_Difference * (1.0-smoothstep(falloff, strength, Depth_Difference));
	occlusion += step(falloff, Depth_Difference) * Normal_Difference ;
	//occlusion *= rangeCheck;
	
  }
 
  float ao = 1.0 - total_strength * occlusion * invSamples;
  return ao;
}

#endif 