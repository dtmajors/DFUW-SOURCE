static float WhiteLevel = 1.1f;
static float LuminanceSaturation = 1.0f;
static float Bias = 0.1f;


static const float MaxLumi		= 3.0f;
static const float GrayLumi		= 0.135f; // 0.05f; 
static const float BrightPassThreshold = 0.4f;

//#define TONEMAPPER ToneMapLogarithmic
//#define TONEMAPPER ToneMapDragoLogarithmic
//#define TONEMAPPER ToneMapExponential
//#define TONEMAPPER ToneMapReinhard
#define TONEMAPPER ToneMapReinhardModified
#define TONEMAPPER ToneMapFilmicALU

static const float MinLinearExposure = 0.5;
static const float MaxLinearExposure = 1.0;

float AutoExposure(float AvgLumi)
{     
	AvgLumi = max(AvgLumi, 0.001f);
		
	float KeyValue = 1.03f - (2.0f / (2 + log10(AvgLumi + 1)));
	float LinearExposure = (KeyValue / AvgLumi);
	LinearExposure = MinLinearExposure + (MaxLinearExposure - MinLinearExposure) * 
		smoothstep(MinLinearExposure, MaxLinearExposure, LinearExposure);
	
	/*
	float Exposure = log2(max(LinearExposure, 0.0001f));
	Exposure -= Threshold;
    return exp2(Exposure) * Color;*/
	
	return LinearExposure;
}

// Approximates luminance from an RGB value
float CalcLuminance(float3 color)
{
    return max(dot(color, float3(0.2126, 0.7152, 0.0722)), 0.0001f);
	//return max(dot(color, float3(0.299f, 0.587f, 0.114f)), 0.0001f);
}

// Logarithmic mapping
float3 ToneMapLogarithmic(float3 color)
{
	float pixelLuminance = CalcLuminance(color);    
    float toneMappedLuminance = log10(1 + pixelLuminance) / log10(1 + WhiteLevel);
	return toneMappedLuminance * pow(color / pixelLuminance, LuminanceSaturation); 
}

// Drago's Logarithmic mapping
float3 ToneMapDragoLogarithmic(float3 color)
{
	float pixelLuminance = CalcLuminance(color);    
    float toneMappedLuminance = log10(1 + pixelLuminance);
	toneMappedLuminance /= log10(1 + WhiteLevel);
	toneMappedLuminance /= log10(2 + 8 * ((pixelLuminance / WhiteLevel) * log10(Bias) / log10(0.5f)));
	return toneMappedLuminance * pow(color / pixelLuminance, LuminanceSaturation); 
}

// Exponential mapping
float3 ToneMapExponential(float3 color)
{
	float pixelLuminance = CalcLuminance(color);    
    float toneMappedLuminance = 1 - exp(-pixelLuminance / WhiteLevel);
	return toneMappedLuminance * pow(color / pixelLuminance, LuminanceSaturation);
}

// Applies Reinhard's basic tone mapping operator
float3 ToneMapReinhard(float3 color) 
{
	float pixelLuminance = CalcLuminance(color);    
    float toneMappedLuminance = pixelLuminance / (pixelLuminance + 1);
	return toneMappedLuminance * pow(color / pixelLuminance, LuminanceSaturation);    
}

// Applies Reinhard's modified tone mapping operator
float3 ToneMapReinhardModified(float3 color) 
{    
    float pixelLuminance = CalcLuminance(color);
	float toneMappedLuminance = pixelLuminance * (1.0f + pixelLuminance / (WhiteLevel * WhiteLevel)) / (1.0f + pixelLuminance);
	return toneMappedLuminance * pow(color / pixelLuminance, LuminanceSaturation);
}

// Applies the filmic curve from John Hable's presentation
float3 ToneMapFilmicALU(float3 color)
{
    color = max(0, color - 0.004f);
    color = (color * (6.2f * color + 0.5f)) / (color * (6.2f * color + 1.7f)+ 0.06f);

    // result has 1/2.2 baked in
    return pow(color, 2.2f);
}