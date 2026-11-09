//  BumpStuff
//
//
//

#ifndef __BUMP__UTILS__FRAG__
#define __BUMP__UTILS__FRAG__

#define AVERAGE_PIXEL_PLUS 1.0f/32.0f

#define GREEN_CHANNEL


float GetValue(const float4 Value)
{
#ifdef RED_CHANNEL
	return Value.r;
#endif

#ifdef GREEN_CHANNEL
	return Value.g;
#endif


#ifdef BLUE_CHANNEL
	return Value.b;
#endif

#ifdef ALL_CHANNEL

	return 0.3*Value.r + 0.59*Value.g + 0.11*Value.b;

#endif
}

float4 Tex2Dot3Experimental_2_0(const float2 Tex,uniform sampler TextureSampler)
{
   float4 Pixel;
   Pixel = tex2D(TextureSampler,Tex);
   float4 n;
   n.x = 2*(Pixel.r-0.5f);
//   n.x = Pixel.r;
   n.y = saturate(2*Pixel.g);
//   n.y = 1.0f;
//   n.z = Pixel.b;
   n.z = 2*(Pixel.b-0.5f);
   n.w = 1.0f;
   
   
   
   return n;
}


float4 Tex2Dot3Simple_2_0(const float2 Tex,uniform sampler TextureSampler)
{

  const float PixPlus = AVERAGE_PIXEL_PLUS;
 
  float dX,dY;
  
  //Read a pixel
  float2 TC;
  float4 Pixel;

//Simplified!
  TC.x = Tex.x;
  TC.y = Tex.y + PixPlus;
  Pixel = tex2D(TextureSampler,TC);
  dY = GetValue(Pixel) * -2.0;
  
  TC.x = Tex.x;
  TC.y = Tex.y - PixPlus;// + 1.0f;
  Pixel = tex2D(TextureSampler,TC);
  dY += GetValue(Pixel) * 2.0;

  TC.x = Tex.x - PixPlus;// + 1.0f;
  TC.y = Tex.y;
  Pixel = tex2D(TextureSampler,TC);
  dX = GetValue(Pixel) * -2.0f;

  TC.x = Tex.x + PixPlus;
  TC.y = Tex.y;
  Pixel = tex2D(TextureSampler,TC);
  dX += GetValue(Pixel) * 2.0f;

  

  float4 n;
  n.x = -dX;
  n.y = 1.0f;
  n.z = -dY;
  n.w = 1.0f;
  
  float oolen = rsqrt(n.x*n.x + n.y*n.y + n.z*n.z);
  n *= oolen;
  
  return n;

}

float4 Tex2Dot3SinglePixel_2_0(const float2 Tex,uniform sampler TextureSampler)
{

  float4 Pixel = tex2D(TextureSampler,Tex);
  float dX,dY;
  dX = 0.3*Pixel.r + 0.59*Pixel.g + 0.11*Pixel.b;
  dY = 0.5*Pixel.r + 0.27*Pixel.g + 0.23*Pixel.b;
  
 

  float4 n;
  n.x = -dX;
  n.y = 1.0f;
  n.z = -dY;
  n.w = 1.0f;
  
  float oolen = rsqrt(n.x*n.x + n.y*n.y + n.z*n.z);
  n *= oolen;
  
  return n;

}



float4 Tex2Dot3_2_0(const float2 Tex,uniform sampler TextureSampler)
{

   const float PixPlus = AVERAGE_PIXEL_PLUS;

  float dX,dY;
  
  //Read a pixel
  float2 TC;
  float4 Pixel;


  float YPixPlus = Tex.y + PixPlus;
  
  TC.x = Tex.x - PixPlus + 1.0f;
  TC.y = YPixPlus;
  Pixel = tex2D(TextureSampler,TC);
  dY = GetValue(Pixel) * -1.0;

  TC.x = Tex.x;
  TC.y = YPixPlus;
  Pixel = tex2D(TextureSampler,TC);
  dY += GetValue(Pixel) * -2.0;

//  TC.x = Tex.x + PixPlus;
//  TC.y = YPixPlus;
//  Pixel = tex2D(TextureSampler,TC);
//  dY += GetValue(Pixel) * -1.0;

//  TC.x = Tex.x - PixPlus + 1.0f;
//  TC.y = Tex.y - PixPlus + 1.0f;
//  Pixel = tex2D(TextureSampler,TC);
//  dY += GetValue(Pixel) * 1.0;


  TC.x = Tex.x;
  TC.y = Tex.y - PixPlus + 1.0f;
  Pixel = tex2D(TextureSampler,TC);
  dY += GetValue(Pixel) * 2.0;

  TC.x = Tex.x + PixPlus;
  TC.y = Tex.y - PixPlus + 1.0f;
  Pixel = tex2D(TextureSampler,TC);
  dY += GetValue(Pixel) * 1.0;

  
  TC.x = Tex.x - PixPlus + 1.0f;
  TC.y = Tex.y - PixPlus + 1.0f;
  Pixel = tex2D(TextureSampler,TC);
  dX = GetValue(Pixel) * -1.0f;

  TC.x = Tex.x - PixPlus + 1.0f;
  TC.y = Tex.y;
  Pixel = tex2D(TextureSampler,TC);
  dX += GetValue(Pixel) * -2.0f;

//  TC.x = Tex.x - PixPlus + 1.0f;
//  TC.y = YPixPlus;
//  Pixel = tex2D(TextureSampler,TC);
//  dX += GetValue(Pixel) * 1.0f;

  TC.x = Tex.x + PixPlus;
  TC.y = Tex.y;
  Pixel = tex2D(TextureSampler,TC);
  dX += GetValue(Pixel) * 2.0f;

  TC.x = Tex.x + PixPlus;
  TC.y = YPixPlus;
  Pixel = tex2D(TextureSampler,TC);
  dX += GetValue(Pixel) * 1.0f;


  float4 n;
  n.x = -dX;
  n.y = 1.0f;
  n.z = -dY;
  n.w = 1.0f;
  
  float oolen = rsqrt(n.x*n.x + n.y*n.y + n.z*n.z);
  n *= oolen;
  
  return n;

}

float Tex2SpeneBump(const float2 Tex, uniform sampler TextureSampler)
{
   float4 Pixel = tex2D(TextureSampler,Tex);
   float Avg = Pixel.x;//(Pixel.x + Pixel.y + Pixel.z)/3.0;
   return Avg;
}

#endif