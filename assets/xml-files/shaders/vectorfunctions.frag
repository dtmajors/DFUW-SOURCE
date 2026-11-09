//Vector functions

#ifndef __VECTOR_FUNCTIONS__
#define __VECTOR_FUNCTIONS__

#include "mathconstants.frag"
#include "mathtypes.frag"

SFVector3 SFConvertFromWorldPosition(const SFWorldPosition In)
{
	SFVector3 v;
	v.x = In.x/SFWorldScaleFloat;
	v.y = In.y/SFWorldScaleFloat;
	v.z = In.z/SFWorldScaleFloat;
	return v;
}

SFVector2 SFVector2Rotate(const SFVector2 In, const float Angle)
{
     SFVector2 Out;
     float cosA = cos(Angle);
     float sinA = sin(Angle);
     Out.x = In.x * cosA - In.y * sinA;
     Out.y = In.x * sinA + In.y * cosA;
     
     return Out;  
}

SFVector3 SFVectorRotateY(const SFVector3 In, const float Angle)
{
     SFVector3 Out;
     float cosA = cos(Angle);
     float sinA = sin(Angle);
     Out.x = In.x * cosA - In.z * sinA;
     Out.y = In.y;
     Out.z = In.x * sinA + In.z * cosA;
     
     return Out;  
}

SFVector3 SFVectorRotateZ(const SFVector3 In, const float Angle)
{
     SFVector3 Out;
     float cosA = cos(Angle);
     float sinA = sin(Angle);
     Out.x = In.x * cosA + In.y * sinA;
     Out.y = In.y * cosA - In.x * sinA;
     Out.z = In.z;
    
     return Out;  
}


SFVector3 SFVectorRotateX(const SFVector3 In, const float Angle)
{
     SFVector3 Out;
     float cosA = cos(Angle);
     float sinA = sin(Angle);
     Out.x = In.x;
     Out.y = In.y*cosA + In.z*sinA;
     Out.z = -In.y*sinA + In.z*cosA;
     
     return Out;  
}

SFVector3 SFVectorRotateXY(const SFVector3 In, const float XAngle, const float YAngle)
{
     SFVector3 Out;
     float XcosA = cos(XAngle);
     float XsinA = sin(XAngle);
     float YcosA = cos(YAngle);
     float YsinA = sin(YAngle);
     
     Out.x = In.x * YcosA - In.z * YsinA;
     Out.y = In.y * XcosA + In.z * XsinA;
     Out.z = In.x * YsinA + In.z * YcosA -In.y*XsinA + In.z*XcosA;
     
     return Out;

}


#endif
