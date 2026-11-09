//  Shared Matrix Variables
//
//
//

#ifndef __OBJECT_BOUNDING_FRAG__
#define __OBJECT_BOUNDING_FRAG__

#include "mathfunctions.frag"
#include "mathconstants.frag"

const float3 BBMin : REBBoundingBoxMin;
const float3 BBMax : REBBoundingBoxMax;

const float3 BSCenter : REBBoundingSphereCenter;
const float  BSRadius : REBBoundingSphereRadius;

#define BOUNDING_SPHERE_RADIUS BSRadius

float getXMin(const float InX)
{
	return (InX - BBMin.x)/(BBMax.x - BBMin.x);
}

float getXMax(const float InX)
{
	return (BBMax.x - InX)/(BBMax.x - BBMin.x);
}

float getYMin(const float InY)
{
	return (InY - BBMin.y)/(BBMax.y - BBMin.y);
}

float getYMax(const float InY)
{
	return (BBMax.y - InY)/(BBMax.y - BBMin.y);
}

float getZMin(const float InZ)
{
	return (InZ - BBMin.z)/(BBMax.z - BBMin.z);
}

float getZMax(const float InZ)
{
	return (BBMax.z - InZ)/(BBMax.z - BBMin.z);
}


float3 getAllMin(const float3 In)
{
   float3 Out;
   Out = (In - BBMin)/(BBMax - BBMin);
   //Out.x = getXMin(In.x);
   //Out.y = getYMin(In.y);
   //Out.z = getZMin(In.z);
   return Out;
}

float3 getBBCenter()
{
 	return (BBMin + BBMax)*0.5f;
}

float3 getBBExtents()
{
	return (BBMax - BBMin)*0.5f;
}

float3 getBBScale()
{
	return BBMax - BBMin;
}


float2 PlanarMapTexture(const float4 Pos, const float Repeat)
{
    float XMin = getXMin(Pos.x);
    float ZMin = getZMin(Pos.z);
    
    float2 Output;
    Output.x = XMin * Repeat;
    Output.y = ZMin * Repeat;
    
    return Output;
}

float2 MapTexture3D(const float4 Pos, const float Repeat, const float3 Normal)
{
	float3 AllMin = getAllMin(Pos.xyz);
	
	float3 Dot;
	Dot.x = abs(dot(float3(1,0,0),Normal));
	Dot.y = abs(dot(float3(0,1,0),Normal));
	Dot.z = abs(dot(float3(0,0,1),Normal));


	float2 XMap;
    XMap.x = (AllMin.x);//* Repeat;
    XMap.y = (AllMin.y);//* Repeat;
	float2 YMap;
    YMap.x = (AllMin.x);//* Repeat;
    YMap.y = (AllMin.z);//* Repeat;
	float2 ZMap;
    ZMap.x = (AllMin.y);//* Repeat;
    ZMap.y = (AllMin.z);//* Repeat;
    
    float2 Output;// = SFVector2Rotate(AllMin.xz,(AllMin.y-AllMin.z+AllMin.x)*SF_TWOPI);
	Output = AllMin.xz;
	if (Dot.y < 0.5f)
	{
		Output.xy = 0.0f;
		//Output.x += (Normal.y)*0.1f;
		//Output.y += (Normal.z+Normal.y)*0.2f;
		float2 Adder;
		if (Dot.z < 0.0f)
			Adder = XMap;
		else
			Adder = ZMap;
			
		//float2 Adder = XMap*Dot.x + ZMap*Dot.z;// + (YMap*Dot.y);
		//Output = Adder;
		//Output.x += AllMin.y;
		//Output.y += AllMin.y+AllMin.y;
	}
	
	//Output = SFVector2Rotate(AllMin.xz,AllMin.y*SF_TWOPI*Dot.y*Dot.y*Dot.y);
	Output *= Repeat;
	
    //Output.x = (AllMin.x)* Repeat;
    //Output.y = (AllMin.z)* Repeat;
	//float z = AllMin.y * Repeat;
	//Output.x += z;
	//Output.y += z;
	
	//Output.y = (AllMin.x + AllMin.y*Repeat + AllMin.z*Repeat*Repeat);
	//Output.x = (AllMin.x*Repeat*Repeat + AllMin.y*Repeat + AllMin.z);
	
	//Output = lerp(YMap,XMap,Dot.x);
	//float2 Output2 = lerp(YMap,ZMap,Dot.z);
	//Output = (Output+Output2)/2;
	//Output = lerp(Output,YMap,Dot.y*Dot.y*Dot.y);
	//Output = XMap*Dot.x + YMap*Dot.y + ZMap*Dot.z;
	//Output *= Repeat;
	//Output = (XMap+ZMap+YMap)*Repeat;
	//Output = lerp(XMap,YMap,Dot.y);
	//float2 Output2 = lerp(ZMap,YMap,Dot.y);
	//Output = lerp(Output,Output2,Dot.z);
	//Output.x += AllMin.y * Repeat;
	//Output.x = (Pos.x + Pos.x*Pos.y + Pos.x*Pos.y*Pos.z)/1000;
	//Output.x = (Pos.z + Pos.z*Pos.y + Pos.x*Pos.y*Pos.z)/1000;
    //Output.x = (Pos.x*4 + Pos.y*3 + Pos.z*1)/1000;
    //Output.y = Pos.z + Pos.y;
    //Output.y = (Pos.x*1+ Pos.y*3 + Pos.z*4)/1000;
    
    return Output;
}


float2 BoxMapTexture(const float4 Pos, const float Repeat)
{
	float XMin = getXMin(Pos.x);
	float YMin = getYMin(Pos.y);
	float ZMin = getZMin(Pos.z);
	
	float2 Output;
	float Y = YMin * Repeat;
	Output.x = (XMin * Repeat) + Y;
	Output.y = (ZMin * Repeat);
	return Output;
	
}

float3 CubeMapTexture(const float4 Pos, const float Repeat)
{
	float XMin = getXMin(Pos.x);
	float YMin = getYMin(Pos.y);
	float ZMin = getZMin(Pos.z);
	
	float3 Output;
	Output.x = (XMin * Repeat);
	Output.y = (ZMin * Repeat);
	Output.z = (YMin * Repeat);
	//Output = frac(Output);
	return Output;
	
}


#endif