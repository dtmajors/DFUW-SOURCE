//  HDRL Utilities
//
//
//

#ifndef __HDRL_UTILS__
#define __HDRL_UTILS__

static const float3 LUMINANCE_VECTOR  = float3(0.2125f, 0.7154f, 0.0721f);
static const float3 LUMINANCE_VECTOR_GREEN  = float3(0.05f, 0.8f, 0.05f);
static const float3 BLUE_SHIFT_VECTOR = float3(1.05f, 0.97f, 1.27f); 
static const float LUMINANCE_EPSILON = 0.0001f;

static const float3 LUMINANCE_VECTOR_DOT  = float3(0.27, 0.67f, 0.06f);


static const float MiddleGray = 0.2f; //Middlegray
static const float WhiteCutoff = 0.8f;
static const float  BRIGHT_PASS_THRESHOLD  = 0.5f;  // Threshold for BrightPass filter
static const float  BRIGHT_PASS_OFFSET     = 0.1f; // Offset for BrightPass filter

static const float BLOOM_MULTIPLIER = 1.0f;


float getHDRPixelIllumination(const float3 RGB)
{
   return (RGB.r*0.27f) + (RGB.g*0.67f) + (RGB.b*0.06f);
}




#endif