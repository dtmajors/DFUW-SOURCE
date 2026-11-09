//  Shared Matrix Variables
//
//
//

#ifndef __OBJECT__MATRIX__FRAG__
#define __OBJECT__MATRIX__FRAG__

const matrix WorldMatrix : REPWorldMatrix;
const float3 LerpPosDirection : REPLerpPositionDirection;
const float3 ObjectWorldPosition : REPObjectWorldPosition;

#define WORLD_MATRIX WorldMatrix
#define LERP_POS_DIRECTION LerpPosDirection
#define OBJECT_WORLD_POSITION ObjectWorldPosition


#endif