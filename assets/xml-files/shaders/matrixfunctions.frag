
#ifndef __MATRIX_FUNCTIONS__
#define __MATRIX_FUNCTIONS__

#include "mathconstants.frag"
#include "mathtypes.frag"


SFMatrix SFMatrixTranspose(const SFMatrix m)
{
     SFMatrix Out;
     for (int i=0; i < 4; ++i)
     {
     	for (int j=0; j < 4; ++j)
     	{
     	  Out[j][i] = m[i][j];
     	  Out[i][j] = m[j][i];
     	}
     }
     
     return Out;
}

float3 SFMatrixDecomposeTranslation(const SFMatrix m)
{
   float3 Out;
   Out.x = m[3][0];
   Out.y = m[3][1];
   Out.z = m[3][2];
   //Out.x = m[0][3];
   //Out.y = m[1][3];
   //Out.z = m[2][3];
   
   return Out;
}

float SFMatrixNonTranslationSummary(const SFMatrix m)
{
	return m[1][0] + m[0][1] + m[2][1];
}

float SFMatrixNonTranslationSummary(const float4 Row0, const float4 Row1, const float4 Row2)
{
	return Row1.x + Row0.y + Row2.y;
}

SFMatrix SFMatrixBuildMatrix(const SFVector3 Position, const SFQuaternion Q)
{
   	SFMatrix mat;

	float	wx, wy, wz;
	float	xx, yy, yz;
	float	xy, xz, zz;
	float	x2, y2, z2;

	x2 = Q.x + Q.x;
	y2 = Q.y + Q.y;
	z2 = Q.z + Q.z;

	xx = Q.x * x2;
	xy = Q.x * y2;
	xz = Q.x * z2;

	yy = Q.y * y2;
	yz = Q.y * z2;
	zz = Q.z * z2;

	wx = Q.w * x2;
	wy = Q.w * y2;
	wz = Q.w * z2;

	mat[ 0 ][ 0 ] = 1.0f - ( yy + zz );
	mat[ 0 ][ 1 ] = xy - wz;
	mat[ 0 ][ 2 ] = xz + wy;
	mat[ 0 ][ 3 ] = 0.0f;

	mat[ 1 ][ 0 ] = xy + wz;
	mat[ 1 ][ 1 ] = 1.0f - ( xx + zz );
	mat[ 1 ][ 2 ] = yz - wx;
	mat[ 1 ][ 3 ] = 0.0f;

	mat[ 2 ][ 0 ] = xz - wy;
	mat[ 2 ][ 1 ] = yz + wx;
	mat[ 2 ][ 2 ] = 1.0f - ( xx + yy );
	mat[ 2 ][ 3 ] = 0.0f;
	
	mat[ 3 ][ 0 ] = Position.x;
	mat[ 3 ][ 1 ] = Position.y;
	mat[ 3 ][ 2 ] = Position.z;
	mat[ 3 ][ 3 ] = 1.0f;

	return mat;

}
#endif
