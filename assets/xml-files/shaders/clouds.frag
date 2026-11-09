//  Cloud Parameters
//
//
//

#ifndef __CLOUDS_FRAG__
#define __CLOUDS_FRAG__


const shared float4 CloudParams : REEnvCloudParams;

#define CLOUD_THICKNESS CloudParams.z
#define CLOUD_COVER CloudParams.x
#define RELATIVE_CLOUD_COVER CloudParams.y

const shared float RelativeCloudCover : REEnvRelativeCloudCover ;
const shared float4 CloudColor : REEnvCloudColor ; 

#endif