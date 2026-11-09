//  Standard Fog Calculation
//
//
//

#ifndef __FOG__FRAG__
#define __FOG__FRAG__

const shared float4 FogParams : REEnvStandardFogParams;
const shared float4 FogColor : REEnvStandardFogColor;

#define FOG_COLOR FogColor

#define FOG_START FogParams.x
#define FOG_END FogParams.y
#define FOG_DENSITY FogParams.z
#define FOG_DIFF FogParams.w


float CalculateFog(float ZPosition)
{

  return 1.0 - (((ZPosition - FogParams.x)/(FogParams.w))*FogParams.z);
//  return 1.0 - (((ZPosition - FogParams.x)/(FogParams.y - FogParams.x))*FogParams.z);
};

float CalculateFog_3_0(float ZPosition)
{

  return saturate(((ZPosition - FogParams.x)/(FogParams.w))*FogParams.z);
//  return 1.0 - (((ZPosition - FogParams.x)/(FogParams.y - FogParams.x))*FogParams.z);
};

#endif
