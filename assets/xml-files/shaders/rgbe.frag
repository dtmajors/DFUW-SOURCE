// RGBE.frag

static const float MAX_LUMINANCE = 10;
static const float MIN_LUMINANCE = 0.0001;

float4 encodeRGBE(float3 Color)
{
	float Max = max(Color.r, max(Color.g, Color.b));
	if (Max < 0.0001) return 0;
	
	float Significand, Exponent;
	Significand = frexp(Max, Exponent);
	
	float Scale = Significand / Max;
	
	float4 ret;
	ret.xyz = Color * Scale;
	ret.w = (Exponent + 128.0) / 255.0;
	return ret;
}

float3 decodeRGBE(float4 RGBE)
{
	float Exponent = (RGBE.a * 255.0) - 128.0;
	return RGBE.xyz * exp2(Exponent);
}

// Converts a float4 'Alphaglow' color to an unclamped float3 (using alpha value to increase intensity)
float3 interpretAlphaGlowColor(float4 AlphaGlowColor)
{
	return AlphaGlowColor.rgb * (1.0 + 2.5 * saturate(AlphaGlowColor.a));
}