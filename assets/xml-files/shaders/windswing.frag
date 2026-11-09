//  Wind Swing
//
//
//

#ifndef __WINDSWING__FRAG__
#define __WINDSWING__FRAG__

#include "wind.frag"
#include "periodic.frag"
#include "objectbounding.frag"
#include "time.frag"
#include "objectmatrix.frag"



float3 CalculateWindPosObjectSpace(const float3 InPos)
{
   float MaxY = BBMax.y - BBMin.y;
   float BW = InPos.y-BBMin.y/MaxY;

   float3 NewPos = InPos + (WIND_DIR_OBJECTSPACE*SIN_TIME*BW*WIND_SPEED*WIND_SPEED); 
   
   return NewPos;
}

struct WindOutPut
{
   float3 Pos;
   float3 Norm;
};


WindOutPut CalculateWindPosObjectSpace(const float3 InPos, const float3 InNorm)
{
   WindOutPut Out;
   
   float MaxY = BBMax.y - BBMin.y;
   float BW = InPos.y-BBMin.y/MaxY;

    //float3 Decompose = SFMatrixDecomposeTranslation(WORLD_MATRIX);
    
    //float Phase = Decompose.x + Decompose.y + Decompose.z;
  	float Phase = SFMatrixNonTranslationSummary(WORLD_MATRIX)*10.0f;

   
   float TempMult = SFGetPeriodicSinTimeValue(0.0f,0.051f,WIND_SPEED*WIND_SPEED,Phase) * BW;
   float3 Mult = (WIND_DIR_OBJECTSPACE*TempMult); 

   Out.Pos = InPos + (Mult);


   Out.Norm.x = InNorm.x + Mult.x*0.2f;
   Out.Norm.z = InNorm.z + Mult.z*0.2f;
   Out.Norm.y = InNorm.y;
   
   return Out;
}

WindOutPut CalculateWindPosObjectSpaceInstance(const float3 InPos, const float3 InNorm,const SFMatrix WorldMatrix)
{
	//SFVector3 ObjectWorldPos = SFMatrixDecomposeTranslation(WorldMatrix);
	WindOutPut Out;

	float MaxY = BBMax.y - BBMin.y;
	float BW = InPos.y-BBMin.y/MaxY;


	//float Phase = ObjectWorldPos.x + ObjectWorldPos.y + ObjectWorldPos.z;
	//Can NOT use pos as phase, since we don't have it in the case of viewtransform
	float Phase = SFMatrixNonTranslationSummary(WorldMatrix)*10.0f;

	float TempMult = SFGetPeriodicSinTimeValue(0.0f,0.051f,WIND_SPEED*WIND_SPEED,Phase) * BW;
	
	float3 WorldPos = mul(float4(InPos,1.0f),WorldMatrix);
	float3 Mult = (WIND_DIR*TempMult); 

	
	Out.Pos = WorldPos + (Mult);


	Out.Norm.x = InNorm.x + Mult.x*0.2f;
	Out.Norm.z = InNorm.z + Mult.z*0.2f;
	Out.Norm.y = InNorm.y;

	return Out;
}

SFVector3 CalculateWindPosObjectSpaceInstanceShadow(const float3 InPos, const SFMatrix WorldMatrix)
{
	//SFVector3 ObjectWorldPos = SFMatrixDecomposeTranslation(WorldMatrix);
	WindOutPut Out;

	float MaxY = BBMax.y - BBMin.y;
	float BW = InPos.y-BBMin.y/MaxY;


	//float Phase = ObjectWorldPos.x + ObjectWorldPos.y + ObjectWorldPos.z;
	float Phase = SFMatrixNonTranslationSummary(WorldMatrix)*10.0f;

	float TempMult = SFGetPeriodicSinTimeValue(0.0f,0.051f,WIND_SPEED*WIND_SPEED,Phase) * BW;
	
	float3 WorldPos = mul(float4(InPos,1.0f),WorldMatrix);
	float3 Mult = (WIND_DIR*TempMult); 

	
	return (WorldPos + (Mult));
}

SFVector3 CalculateWindPosObjectSpaceInstanceVPShadow(const float3 InPos, const float3 VertexNormal, const SFMatrix WorldMatrix, const float4 Diffuse)
{
	//SFVector3 ObjectWorldPos = SFMatrixDecomposeTranslation(WorldMatrix);

	float MaxY = BBMax.y - BBMin.y;
	float BW = InPos.y-BBMin.y/MaxY;


	//float Phase = ObjectWorldPos.x + ObjectWorldPos.y + ObjectWorldPos.z;
	float Phase = SFMatrixNonTranslationSummary(WorldMatrix)*10.0f;

	float TempMult = SFGetPeriodicSinTimeValue(0.0f,0.051f,WIND_SPEED*WIND_SPEED,Phase) * BW;

    //Extrude position along normal of surface 
	float3 VertexPos = InPos;
    if (Diffuse.y < 0.95f)
    {
    	float Move = saturate(1.0f - Diffuse.y);
    	//float3 NewPos = VertexNormal * sin((WorldMatrix[3][0] + WorldMatrix[3][2] + TOTAL_TIME) * (InPos.y + InPos.y)*0.02f) * 0.5f;
    	float3 NewPos = VertexNormal * sin(((Phase*1.3f) + TOTAL_TIME) * (InPos.y + InPos.y)*0.02f) * 0.5f;
    	NewPos *= Move;
	    VertexPos += NewPos;
	}
	
	
	float3 WorldPos = mul(float4(VertexPos,1.0f),WorldMatrix);
	float3 Mult = (WIND_DIR*TempMult); 

	
	return (WorldPos + (Mult));
}

WindOutPut CalculateWindPosObjectSpaceInstanceVP(const float3 InPos, const float3 InNorm,const SFMatrix WorldMatrix, const float4 Diffuse,const float3 VertexNormal)
{
	//SFVector3 ObjectWorldPos = SFMatrixDecomposeTranslation(WorldMatrix);
	WindOutPut Out;

	float MaxY = BBMax.y - BBMin.y;
	float BW = InPos.y-BBMin.y/MaxY;


	//float Phase = ObjectWorldPos.x + ObjectWorldPos.y + ObjectWorldPos.z;
	float Phase = SFMatrixNonTranslationSummary(WorldMatrix)*10.0f;

	float TempMult = SFGetPeriodicSinTimeValue(0.0f,0.051f,WIND_SPEED*WIND_SPEED,Phase) * BW;

    //Extrude position along normal of surface 
	float3 VertexPos = InPos;
    if (Diffuse.y < 0.95f)
    {
    	float Move = saturate(1.0f - Diffuse.y);
    	//float3 NewPos = VertexNormal * sin((WorldMatrix[3][0] + WorldMatrix[3][2] + TOTAL_TIME) * (InPos.y + InPos.y)*0.02f) * 0.5f;
    	float3 NewPos = VertexNormal * sin(((Phase*1.3f) + TOTAL_TIME) * (InPos.y + InPos.y)*0.02f) * 0.5f;
    	NewPos *= Move;
	    VertexPos += NewPos;
	}
	
	
	float3 WorldPos = mul(float4(VertexPos,1.0f),WorldMatrix);
	float3 Mult = (WIND_DIR*TempMult); 

	
	Out.Pos = WorldPos + (Mult);


	Out.Norm.x = InNorm.x + Mult.x*0.2f;
	Out.Norm.z = InNorm.z + Mult.z*0.2f;
	Out.Norm.y = InNorm.y;

	return Out;
}

WindOutPut CalculateWindPosObjectSpaceVP(const float3 InPos, const float3 InNorm,const float4 Diffuse,const float3 VertexNormal)
{
	//SFVector3 ObjectWorldPos = SFMatrixDecomposeTranslation(WorldMatrix);
	WindOutPut Out;

	float MaxY = BBMax.y - BBMin.y;
	float BW = InPos.y-BBMin.y/MaxY;


	//float Phase = ObjectWorldPos.x + ObjectWorldPos.y + ObjectWorldPos.z;
	float Phase = SFMatrixNonTranslationSummary(WORLD_MATRIX)*10.0f;

	float TempMult = SFGetPeriodicSinTimeValue(0.0f,0.051f,WIND_SPEED*WIND_SPEED,Phase) * BW;

    //Extrude position along normal of surface 
	float3 VertexPos = InPos;
    if (Diffuse.y < 0.95f)
    {
    	float Move = saturate(1.0f - Diffuse.y);
    	//float3 NewPos = VertexNormal * sin((WorldMatrix[3][0] + WorldMatrix[3][2] + TOTAL_TIME) * (InPos.y + InPos.y)*0.02f) * 0.5f;
    	float3 NewPos = VertexNormal * sin(((Phase*1.3f) + TOTAL_TIME) * (InPos.y + InPos.y)*0.02f) * 0.5f;
    	NewPos *= Move;
	    VertexPos += NewPos;
	}
	
	
	float3 WorldPos = mul(float4(VertexPos,1.0f),WORLD_MATRIX);
	float3 Mult = (WIND_DIR*TempMult); 

	
	Out.Pos = WorldPos + (Mult);


	Out.Norm.x = InNorm.x + Mult.x*0.2f;
	Out.Norm.z = InNorm.z + Mult.z*0.2f;
	Out.Norm.y = InNorm.y;

	return Out;
}


#endif