#ifndef _LUMA_SHARPNESS_FRAG
#define _LUMA_SHARPNESS_FRAG

sampler2D LumaSharp{
    Texture = <SceneColor>;
    AddressU  = Clamp; AddressV = Clamp;
    MipFilter = Linear; 
	MinFilter = Linear; 
	MagFilter = Linear;
    SRGBTexture = false;
};

#define sharp_strength  0.8  //[0.10 to 3.00] Strength of the sharpening - Default is 0.6
#define sharp_clamp     0.035  // [0.000 to 1.000] Limits maximum amount of sharpening a pixel recieves - Default is 0.035
#define offset_bias     1.0    // [0.0 to 6.0] Offset bias adjusts the radius of the sampling pattern.
                               // I designed the pattern for offset_bias 1.0, but feel free to experiment.

#define CoefLuma float4(0.2126, 0.7152, 0.0722,0)      // BT.709 & sRBG luma coefficient (Monitors and HD Television)
//#define CoefLuma float4(0.299, 0.587, 0.114,0)       // BT.601 luma coefficient (SD Television)
//#define CoefLuma float4(1.0/3.0, 1.0/3.0, 1.0/3.0,0) // Equal weight coefficient
#define sharp_strength_luma (CoefLuma *  sharp_strength)

#ifndef BUFFER_RCP_WIDTH
	#define BUFFER_WIDTH BackBufferParams.x
	#define BUFFER_HEIGHT BackBufferParams.y
	#define BUFFER_RCP_WIDTH (1.0 / BUFFER_WIDTH)
	#define BUFFER_RCP_HEIGHT (1.0 / BUFFER_HEIGHT)
#endif

#define px BUFFER_RCP_WIDTH
#define py BUFFER_RCP_HEIGHT

float4 LumaSharpenPass(float4 inputcolor, float2 tex ) 
{	
	float4 ori = tex2D(LumaSharp, tex); 
    float4 blur_ori = tex2D(LumaSharp, tex + float2(px,-py) * 0.5 * offset_bias); 
    blur_ori += tex2D(LumaSharp, tex + float2(-px,-py) * 0.5 * offset_bias);
    blur_ori += tex2D(LumaSharp, tex + float2(px,py) * 0.5 * offset_bias);
    blur_ori += tex2D(LumaSharp, tex + float2(-px,py) * 0.5 * offset_bias);

    blur_ori *= 0.25;   
  float4 sharp = ori - blur_ori; 
  float sharp_luma = dot(sharp, sharp_strength_luma); 
  sharp_luma = clamp(sharp_luma, -sharp_clamp, sharp_clamp);
  float4 done = inputcolor + sharp_luma; 
  
  return done;

}

#endif