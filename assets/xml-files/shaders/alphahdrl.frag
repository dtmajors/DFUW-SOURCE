//  Alpha Testing & Blending with HDR Lighting
//
//
//

#ifndef __ALPHA_HDRL__
#define __ALPHA_HDRL__

static const int AlphaTestValueINT = 0x7f;
static const float AlphaTestValueFloat = 127.0f/255.0f;
static const float ALPHA_TEST_VALUE = AlphaTestValueFloat;

float getAlphaTestValHDR(float SourceAlpha)
{
    float TA = saturate(SourceAlpha - AlphaTestValueFloat);
    //if <= 0 set to 0 set to 1.0
    TA += 0.499f;
    
    if (TA > 0.5f)
       TA = 1.0f;
    else
       TA = 0.0f;
       
    return TA;
}


float getAlphaTestValHDR_One(float SourceAlpha)
{
    float TA = saturate(SourceAlpha - AlphaTestValueFloat);
    //if <= 0 set to 0 set to 1.0
    TA += 0.499f;
    
    if (TA > 0.5f)
       TA = 0.00f;
    else
       TA = 1.0f;
       
    return TA;
}


float getAlphaTestValHDRMin(float SourceAlpha)
{
    float TA = saturate(SourceAlpha - AlphaTestValueFloat);
    //if <= 0 set to 0 set to 0.01
    TA += 0.49999999f;
    
    if (TA > 0.5f)
       TA = 0.01f;
       //TA = 1.0f;
    else
       TA = 0.0f;
       //TA = 0.0f;
       
    return TA;

}


float getAlphaBlendValHDR(float SourceAlpha)
{
   return SourceAlpha;   
}

#endif