//  Wind
//
//
//

#ifndef __WIND_FRAG__
#define __WIND_FRAG__


const shared float4 WindParams : REEnvWindParams;
const shared float3 WindDir : REEnvWindDirection;
const float3 WindDirObjectSpace : REEnvWindDirectionObjectSpace;
const shared matrix WindMatrix : REEnvWindMatrix;
const shared float3 WindRotation : REEnvWindRotation;

//#define WIND_STRENGTH WindParams.x
//#define WIND_TURBULENCE WindParams.y
//#define WIND_QUST_SPEED WindParams.z
#define WIND_SPEED WindParams.w

#define WIND_DIR WindDir
#define WIND_DIR_X WindDir.x
#define WIND_DIR_Z WindDir.z
#define WIND_DIR_Y WindDir.y
#define WIND_MATRIX WindMatrix

#define WIND_ROTATION WindRotation

#define WIND_DIR_OBJECTSPACE WindDirObjectSpace

#endif