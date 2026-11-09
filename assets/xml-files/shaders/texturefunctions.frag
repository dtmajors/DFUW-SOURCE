//  Texture Functions
//
//
//

#ifndef __TEXTURE_FUNCTIONS__
#define __TEXTURE_FUNCTIONS__

#include "time.frag"


float2 SFGetTextureAnimation(const float2 InputTex, const float AnimFrequency,const int NumTexturesSqr)
{
    float AnimLifeScale = TOTAL_TIME/AnimFrequency;
    AnimLifeScale = frac(AnimLifeScale);

    float TextureFactor = 1.0f/NumTexturesSqr;
    
    int RealNumTextures = NumTexturesSqr * NumTexturesSqr;
   
    float CurrentTex = RealNumTextures * AnimLifeScale;
    
    CurrentTex  = floor(CurrentTex);
    //find out where we are
    float Y = floor(CurrentTex/NumTexturesSqr);
    float X = CurrentTex - (Y * NumTexturesSqr);
    
    float2 RealTex = InputTex;
    //RealTex.x = frac(InputTex.x);
    //RealTex.y = frac(InputTex.y);
    
    float2 TexOut;
    TexOut.x = X * TextureFactor + RealTex.x * TextureFactor;
    TexOut.y = Y * TextureFactor + RealTex.y * TextureFactor;
    
    return TexOut;
}

#endif