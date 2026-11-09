//  Waves
//
//
//

#ifndef __WAVES__FRAG__
#define __WAVES__FRAG__

#include "mathfunctions.frag"
#include "time.frag"
#include "wind.frag"


#define WAVE_AMPLITUDE_1 0.5f
#define WAVE_FREQUENCY_1 1.1f
#define WAVE_LENGTH_1 25.0f

#define WAVE_AMPLITUDE_2 0.3f
#define WAVE_FREQUENCY_2 1.9f
#define WAVE_LENGTH_2 35.0f


#define GRID_SIZE 14.65f
#define WIND_LENGTH 30.0f


static const float3 Wave_Dir_Start = { 1.0f,0.0f,0.0f };

static float3 Wave_Dir = SFVectorRotateY( Wave_Dir_Start , SF_PI/3.0);
static float3 Wave_Dir2 = SFVectorRotateY( Wave_Dir_Start , -SF_PI/7.3f);

static float3 Moat_Wave_Dir  = SFVectorRotateY( Wave_Dir_Start , SF_PI/4.2);
static float3 Moat_Wave_Dir2 = SFVectorRotateY( Wave_Dir_Start , -SF_PI/3.9f);

static float3 Tar_Wave_Dir  = SFVectorRotateY( Wave_Dir_Start , SF_PI/3.1);
static float3 Tar_Wave_Dir2 = SFVectorRotateY( Wave_Dir_Start , -SF_PI/7.8f);


#define MOAT_WAVE_AMPLITUDE_1 0.09f
#define MOAT_WAVE_FREQUENCY_1 0.15f
#define MOAT_WAVE_LENGTH_1 45.0f

#define MOAT_WAVE_AMPLITUDE_2 0.07f
#define MOAT_WAVE_FREQUENCY_2 0.03f
#define MOAT_WAVE_LENGTH_2 75.0f

#define TAR_WAVE_AMPLITUDE_1 0.1f
#define TAR_WAVE_FREQUENCY_1 0.15f
#define TAR_WAVE_LENGTH_1 25.0f

#define TAR_WAVE_AMPLITUDE_2 0.07f
#define TAR_WAVE_FREQUENCY_2 0.01f
#define TAR_WAVE_LENGTH_2 15.0f


/*
float SFGetPeriodicSinTimeValue(float Base, float Amplitude, float Frequency, float Phase)
{
  float TheTime = TOTAL_TIME * Frequency + Phase;
  TheTime = frac(TheTime);
  
  TheTime = sin(TheTime*SF_TWOPI);
  
  return (Base + Amplitude*TheTime);
    
}
*/

void calculateTarWave(out float PosOffset, const SFVector3 InputPos, const float WaveFactor)
{
	float NormPos = normalize(InputPos);
	float Dot = dot(NormPos,Tar_Wave_Dir);
	float Dot2 = dot(NormPos,Tar_Wave_Dir2);

	float NewTime = Dot * TAR_WAVE_LENGTH_1 + TOTAL_TIME * TAR_WAVE_FREQUENCY_1;
	float NewTime2 = Dot2 * TAR_WAVE_LENGTH_2 + TOTAL_TIME * TAR_WAVE_FREQUENCY_2;
	
	float Y1 =sin(NewTime);
	float Y2 =sin(NewTime2);

	float Y = (TAR_WAVE_AMPLITUDE_1*Y1 + TAR_WAVE_AMPLITUDE_2*Y2);

	PosOffset = Y;	
}

void CalculateCoastWave(out float PosOffset, out float NormalizedPosOffset,
						const SFVector3 InputPos, const float CoastFactor)
{
	float3 NormPos = normalize(InputPos);
	float Dot = dot(NormPos,Wave_Dir);
	float Dot2 = dot(NormPos,Wave_Dir2);
	float Dot3 = dot(NormPos,WIND_DIR);

	float NewTime = Dot * WAVE_LENGTH_1 + TOTAL_TIME * WAVE_FREQUENCY_1;
	float NewTime2 = Dot2 * WAVE_LENGTH_2 + TOTAL_TIME * WAVE_FREQUENCY_2;
	float WindWave = (Dot3 * GRID_SIZE * 2.0f) + (TOTAL_TIME * WIND_SPEED * 2.0f);
	
	float Y1 =sin(NewTime);
	float Y2 =sin(NewTime2);
	float Y3 =sin(WindWave);

	float Wave_Wind_Amplitude = WIND_SPEED * 1.14;
	float Y = (WAVE_AMPLITUDE_1*Y1 + WAVE_AMPLITUDE_2*Y2 + Wave_Wind_Amplitude*Y3)*CoastFactor;

	float MaxAmplitude = (WAVE_AMPLITUDE_1 + WAVE_AMPLITUDE_2 + Wave_Wind_Amplitude)*CoastFactor;
	float AmpRatio = (Y+MaxAmplitude)/(MaxAmplitude*2.0f);

	NormalizedPosOffset = AmpRatio;
	PosOffset = Y;
	
}


void CalculateMoatWave(out float PosOffset, out float NormalizedPosOffset,
						const SFVector3 InputPos)
{
	float3 NormPos = normalize(InputPos);
	float Dot = dot(NormPos,Moat_Wave_Dir);
	float Dot2 = dot(NormPos,Moat_Wave_Dir2);

	float NewTime = Dot * MOAT_WAVE_LENGTH_1 + TOTAL_TIME * MOAT_WAVE_FREQUENCY_1;
	float NewTime2 = Dot2 * MOAT_WAVE_LENGTH_2 + TOTAL_TIME * MOAT_WAVE_FREQUENCY_2;
	
	float Y1 =sin(NewTime);
	float Y2 =sin(NewTime2);

	float Y = (MOAT_WAVE_AMPLITUDE_1*Y1 + MOAT_WAVE_AMPLITUDE_2*Y2);

	float MaxAmplitude = (MOAT_WAVE_AMPLITUDE_1 + MOAT_WAVE_AMPLITUDE_2);
	float AmpRatio = (Y+MaxAmplitude)/(MaxAmplitude*2.0f);

	NormalizedPosOffset = AmpRatio;
	PosOffset = Y;
	
}









#endif