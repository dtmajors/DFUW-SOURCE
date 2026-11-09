//  Math Functions
//
//
//

#ifndef __MATH_FUNCTIONS__FRAG__
#define __MATH_FUNCTIONS__FRAG__

#include "mathconstants.frag"
#include "mathtypes.frag"

#define SFVec3Dot(a,b) dot(a,b)
#define SFVec3Cross(a,b) cross(a,b)

#define SFPow(a,b) pow(a,b)

#include "quatfunctions.frag"
#include "matrixfunctions.frag"
#include "vectorfunctions.frag"


#endif