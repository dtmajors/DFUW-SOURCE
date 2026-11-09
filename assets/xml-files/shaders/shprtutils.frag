//SHPRT Utils

#ifndef __SHPRT_UTILS__
#define __SHPRT_UTILS__

#include "objectbounding.frag"


float CalculateGlowSHPRT(const float3 Normal, const float3 LightDir, const float Diffuse)
{
	float L = max(0,dot(LightDir,Normal));
	L =  pow(L,8);
	//L *=L; //^2
	//L *=L; //^4
	//L *=L; //^8
	//L *=L; //^
	L *= Diffuse;
	
	return L;
}

float CalculateGlowSHPRT(const float3 Normal, const float3 LightDir,const float Diffuse, const float4 Pos)
{
	float L = max(0,dot(LightDir,Normal));
	//L += //frac((Pos.x + Pos.z)*0.01)*0.2f;// + frac(Pos.y)*0.5f;
	L += 0.3f;
	//L += (BBMax.x - Pos.x)*0.1 + (BBMax.z + Pos.z)*0.1 + (BBMax.z - Pos.z)*0.15f;
	L =  pow(L,8);
	//L *=L; //^2
	//L *=L; //^4
	//L *=L; //^8
	//L *=L; //^
	L *= Diffuse;
	
	return L;
}


#endif