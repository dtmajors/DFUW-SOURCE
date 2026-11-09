// std_vertex.frag

#ifndef _STD_VERTEX_FRAG_
#define _STD_VERTEX_FRAG_

#include "stdio.frag"
#include "time.frag"
#include "objectmatrix.frag"

STD_VS_OUTPUT STD_VERTEX_SHADER_(STD_VS_INPUT Input)
{
	STD_VS_OUTPUT Out = (STD_VS_OUTPUT)0;

	float4 worldPos = mul(Input.Pos, WORLD_MATRIX);
	Out.Pos = mul(worldPos, VIEW_PROJECTION_MATRIX);

	Out.ZPos.xy = Out.Pos.zw;
	Out.Fog = CalculateFog_3_0(Out.Pos. z);
	
	float3 worldNormal = mul(Input.Norm, (float3x3) WORLD_MATRIX);
	Out.viewNormal = mul(worldNormal, (float3x3) VIEW_MATRIX);
	
	Out.Tex = Input.Tex;

    return Out;
}

STD_VS_INSTANCE_OUTPUT STD_VERTEX_SHADER_INSTANCE(STD_VS_INSTANCE_INPUT Input)
{
	STD_VS_INSTANCE_OUTPUT Out = (STD_VS_INSTANCE_OUTPUT)0;

	float4x4 WMat = float4x4(Input.WMat1, Input.WMat2, Input.WMat3, Input.WMat4);
	
	float3 NewPos = Input.Pos.xyz / Input.Pos.w;
	float3 NewNorm = Input.Norm;
	
#ifdef SHADER_CFG_ROTATE
	NewPos = SFVectorRotateY(NewPos, TOTAL_TIME * SHADER_CFG_ROTATE_SPEED);
	NewNorm = SFVectorRotateY(NewNorm, TOTAL_TIME * SHADER_CFG_ROTATE_SPEED);
#endif // SHADER_CFG_ROTATE

	float4 WorldPos = mul(float4(NewPos, 1), WMat);
	//float4 ViewPos = mul(WorldPos, VIEW_MATRIX);
	Out.Pos = mul(WorldPos, VIEW_PROJECTION_MATRIX);

#ifndef LOW_SHADER_QUALITY
	Out.WorldTangent = mul(Input.Tang, (float3x3)WMat);
	Out.WorldBinormal = mul(Input.BNor, (float3x3)WMat);
#endif

	WorldPos /= WorldPos.w;
	Out.WorldPos = WorldPos.xyz;
	Out.ZPos.xy = Out.Pos.zw;

	Out.WorldNormal = normalize(mul(NewNorm, (float3x3)WMat));
	Out.WorldEyeVec = normalize(WorldPos.xyz - EyePos);
/*
	float Time = abs(sin((TOTAL_TIME + Input.Pos.y + Input.Pos.x + Input.Pos.z) * 1.31f));
    Out.Glow = Time * Time * Time * Time;
	
#ifdef LOW_SHADER_QUALITY
	Out.Glow = lightPixelDiffuseRaw(Out.WorldNormal) * 1.4;
#endif
*/
	Out.Tc = Input.Tex;
	Out.Misc.xy = Input.Tex2;
	Out.Fog = CalculateFog_3_0(Out.Pos.z);

    return Out;
}

STD_VS_INSTANCE_OUTPUT STD_VERTEX_SHADER_INSTANCE_VPAINT(STD_VS_INSTANCE_INPUT Input) {
		STD_VS_INSTANCE_OUTPUT Output = STD_VERTEX_SHADER_INSTANCE(Input);
		Output.Misc = Input.Diff;
		return Output;
}




#endif // ndef _STD_VERTEX_FRAG_
