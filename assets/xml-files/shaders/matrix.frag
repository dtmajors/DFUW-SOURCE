//  Shared Matrix Variables
//
//
//

#ifndef __MATRIX__FRAG__
#define __MATRIX__FRAG__

#include "camera.frag"

const shared matrix ViewMatrix   : REPViewMatrix;
const shared matrix ProjMatrix   : REPProjectionMatrix;
const shared matrix ViewProjMatrix : REPViewProjectionMatrix;
const shared matrix InvViewProjMatrix : REPInvViewProjectionMatrix;
const shared matrix ViewMatrixTranspose : REPViewMatrixTranspose;
const shared matrix InvViewMatrix	: REPInverseViewMatrix;

const shared matrix PrevViewMatrix : REPPrevViewMatrix;
const shared matrix PrevViewProjMatrix : REPPrevViewProjectionMatrix;

const shared matrix CloseProjMatrix : REPCloseProjectionMatrix;


#define VIEW_MATRIX ViewMatrix
#define INV_VIEW_MATRIX InvViewMatrix
#define VIEW_MATRIX_TRANSPOSE ViewMatrixTranspose
#define PROJECTION_MATRIX ProjMatrix
#define VIEW_PROJECTION_MATRIX ViewProjMatrix
#define INV_VIEW_PROJECTION_MATRIX InvViewProjMatrix
#define PREV_VIEW_MATRIX PrevViewMatrix
#define PREV_VIEW_PROJECTION_MATRIX PrevViewProjMatrix
#define CLOSE_PROJECTION_MATRIX CloseProjMatrix



#endif