//  Shared Camera Variables
//
//
//

#ifndef __CAMERA__FRAG__
#define __CAMERA__FRAG__


const shared float3 EyePos : REPEyePos;
const shared float3 WorldEyePos : REPWorldEyePos;
const shared float4 CamParams : REPCameraParameters;
const shared float3 CamDir : REPCamDirection;
const shared float2 BackBufferParams : REPBackBufferParameters;

#define EYE_POS EyePos
#define WORLD_EYE_POS WorldEyePos

#define CAMERA_NEAR_PLANE CamParams.x
#define CAMERA_FAR_PLANE CamParams.y
#define CAM_NEAR_FARPLANE CamParams.w
#define INV_CAM_NEAR_FARPLANE CamParams.z
#define CAMERA_DIRECTION CamDir

#define BACKBUFFER_WIDTH BackBufferParams.x
#define BACKBUFFER_HEIGHT BackBufferParams.y



#endif