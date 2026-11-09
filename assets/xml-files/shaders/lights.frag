//
//
//	Generic Lighting
//
//



#ifndef __LIGHTS__FRAG__
#define __LIGHTS__FRAG__

#include "mathtypes.frag"


struct SFPointLightSimple
{
	SFVector3 Position;
	SFVector3 Color;
	float	Range;
};


const shared float4 ShadowColor : REPShadowColor;
const shared float3 ShadowLight : REPShadowLight;


#endif
