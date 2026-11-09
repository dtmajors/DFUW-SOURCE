//Quaternion functions

#ifndef __QUAT_FUNCTIONS__
#define __QUAT_FUNCTIONS__

#include "mathconstants.frag"
#include "mathtypes.frag"

SFQuaternion SFQuaternionRotationAxisToAxis(const SFVector3 From, const SFVector3 To)
{
    //assuming normalized vectors
    SFVector3 C = SFVec3Cross(From,To);
    float e = SFVec3Dot(From,To);
    float v = sqrt(2.0*(1.0 + e) );
    C /= v;
    SFQuaternion Out;
    Out.xyz = C.xyz;
    Out.w = 0.5f * v;
    
    return Out;
    

}

SFQuaternion SFQuaternionMultiply(const SFQuaternion Q1, const SFQuaternion Q2)
{

	SFQuaternion QOut;
	QOut.w = Q1.w*Q2.w - Q1.x*Q2.x - Q1.y*Q2.y - Q1.z*Q2.z;
	QOut.x = Q1.w*Q2.x + Q1.x*Q2.w + Q1.y*Q2.z - Q1.z*Q2.y;
	QOut.y = Q1.w*Q2.y + Q1.y*Q2.w + Q1.z*Q2.x - Q1.x*Q2.z;
	QOut.z = Q1.w*Q2.z + Q1.z*Q2.w + Q1.x*Q2.y - Q1.y*Q2.x;
	
	return QOut;
	

}

SFQuaternion SFQuaternionConjugate(const SFQuaternion Q)
{
   SFQuaternion QOut;
   QOut.xyz = -Q.xyz;
   QOut.w = Q.w;
   return QOut;
}

SFVector3 SFQuaternionRotation(const SFVector3 P, const SFQuaternion QIn)
{
     SFQuaternion Q = SFQuaternion(P,0);
     SFQuaternion Conj = SFQuaternionConjugate(QIn);
     
     // Conjugate(QIn)*P*QIn
     SFQuaternion Tmp;
     Tmp = SFQuaternionMultiply(Conj, Q);
     //SFQuaternion Tmp2;
     //Tmp = SFQuaternionMultiply(Tmp, QIn);
     
     SFVector3 Out;
     Out.xyz = Tmp.xyz;
     
     return Out;          
}

float3x3 SFQuaternionToMat3(const SFQuaternion Q)
{
   	float3x3 mat;

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

	mat[ 1 ][ 0 ] = xy + wz;
	mat[ 1 ][ 1 ] = 1.0f - ( xx + zz );
	mat[ 1 ][ 2 ] = yz - wx;

	mat[ 2 ][ 0 ] = xz - wy;
	mat[ 2 ][ 1 ] = yz + wx;
	mat[ 2 ][ 2 ] = 1.0f - ( xx + yy );

	return mat;
	   
}



#endif
