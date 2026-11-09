//  Shared Time Variables
//
//
//

#ifndef __TIME__FRAG__
#define __TIME__FRAG__

#include "mathconstants.frag"

const shared float4 TimeParams : REPTimeParams;
#define TOTAL_TIME TimeParams.x
#define FRAME_TIME TimeParams.y
#define TOTAL_TIME_ACCURATE TimeParams.z
#define SIN_TIME  TimeParams.w


float SFGetPeriodicSinTimeValue(float Base, float Amplitude, float Frequency, float Phase)
{
  float TheTime = TOTAL_TIME * Frequency + Phase;
  TheTime = frac(TheTime);
  
  TheTime = sin(TheTime*SF_TWOPI);
  
  return (Base + Amplitude*TheTime);
    
}

#endif