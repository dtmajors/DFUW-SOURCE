#ifndef _LEVITATION_FRAG_
#define _LEVITATION_FRAG_

#include "vectorfunctions.frag"

float ExtractLevitationTranslation(float4 LevParams) {return LevParams.r;}
float ExtractLevitationRotationX(float4 LevParams) {return LevParams.g;}
float ExtractLevitationRotationZ(float4 LevParams) {return LevParams.b;}
//float ExtractLevitationRotationY(float4 LevParams) {return LevParams.a;}



static const float MaxLevitateAngle = 25 * 0.06;
static const float LevitateRotateSpeed = 0.25;
static const float LevitateTranslateSpeed = 1.0;
static const float LevitationDistance = 50.0f;



void LevitationEffect(const float3 Position, const float3 Normal, out float3 oPosition, out float3 oNormal, float4 LevParams)
{
	float3 tmpPosition = Position;
	float3 tmpNormal = Normal;

	float XAngle = ExtractLevitationRotationX(LevParams) * MaxLevitateAngle * sin(LevitateRotateSpeed * TOTAL_TIME);
	tmpPosition = SFVectorRotateX(tmpPosition, XAngle);
	tmpNormal = SFVectorRotateX(tmpNormal, XAngle);
	
	
	float ZAngle = ExtractLevitationRotationZ(LevParams) * MaxLevitateAngle * cos(LevitateRotateSpeed * 1.33 * TOTAL_TIME);
	tmpPosition = SFVectorRotateZ(tmpPosition, ZAngle);
	tmpNormal = SFVectorRotateZ(tmpNormal, ZAngle);
	

	tmpPosition.y += LevitationDistance * ExtractLevitationTranslation(LevParams) * 2 * 0.025 * sin(1.6 * 0.5 * TOTAL_TIME);
	tmpPosition.y += LevitationDistance * ExtractLevitationTranslation(LevParams) * 0.025 * sin(1.6 * 0.77 * TOTAL_TIME);
	float YAngle = TOTAL_TIME * 0.005;
	tmpPosition = SFVectorRotateY(tmpPosition, YAngle);
	tmpNormal = SFVectorRotateY(tmpNormal, YAngle);
	
	oPosition = tmpPosition;
	oNormal = tmpNormal;
}


STD_VS_INSTANCE_OUTPUT LevitateVertexShader(STD_VS_INSTANCE_INPUT Input)
{
	STD_VS_INSTANCE_OUTPUT Out = (STD_VS_INSTANCE_OUTPUT)0;
	
	Out.Misc = Input.Diff;

	float4x4 WMat = float4x4(Input.WMat1, Input.WMat2, Input.WMat3, Input.WMat4);
	
	float3 NewPos = Input.Pos.xyz / Input.Pos.w;
	float3 NewNorm = Input.Norm;

	LevitationEffect(NewPos, NewNorm, NewPos, NewNorm, Input.Diff);
	
	float4 WorldPos = mul(float4(NewPos, 1), WMat);
	Out.Pos = mul(WorldPos, VIEW_PROJECTION_MATRIX);

	WorldPos /= WorldPos.w;
	Out.WorldPos = WorldPos.xyz;
	
	Out.ZPos.xy = Out.Pos.zw;

	Out.WorldNormal = normalize(mul(NewNorm, (float3x3)WMat));
	Out.WorldEyeVec = normalize(WorldPos.xyz - EyePos);

	float Time = abs(sin((TOTAL_TIME + Input.Pos.y + Input.Pos.x + Input.Pos.z) * 1.31f));
    Out.Glow = Time * Time * Time * Time;
	Out.Tc = Input.Tex;
	Out.Fog = CalculateFog_3_0(Out.Pos.z);

    return Out;
}

#endif // ndedf _LEVITATION_FRAG_