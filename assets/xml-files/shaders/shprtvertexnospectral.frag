//SHPRT Fragment Shader

#ifndef __SHPRTVERTEXNOSPECTRAL__FRAG__
#define __SHPRTVERTEXNOSPECTRAL__FRAG__

//Declare this one as shared
#define MAX_NUM_PCA_VECTORS 12


//shared float4 LdotT[1+3*(MAX_NUM_PCA_VECTORS/4)] : RESHLightInputNoSpectral;
const shared float4 LdotT[1+(MAX_NUM_PCA_VECTORS/4)] : RESHLightInputNoSpectral;
//const shared float4 LdotT[1+(MAX_NUM_PCA_VECTORS/4)] : RESHLightInputPlanetaryNoSpectral;

#define SHPRT_AMBIENT 0.0f
#define SHPRT_AMBIENT_SINGLE 0.1f

float4 DiffuseSHPRTNoSpectral(const float4 PCAWeights[MAX_NUM_PCA_VECTORS/4])
{

    float4 ExitRGB = (float4)0;
    
           
    // Multiply and sum all the PCA weights by the vClusterLdotT values 
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        ExitRGB.rgb += PCAWeights[i].xyz * LdotT[i+1].xyz;
    }    
   
    float4 ExitRadiance = LdotT[0];
    float Temp = dot(ExitRGB,1);
    ExitRadiance.rgb += Temp;
    //ExitRadiance.rgb *= 2;
    ExitRadiance.w = Temp;
    
    
    return ExitRadiance;
};

float DiffuseSHPRTNoSpectral1Channel(const float4 PCAWeights[MAX_NUM_PCA_VECTORS/4])
{
	return PCAWeights[0].x; 

/*
    float3 ExitRGB = (float3)0;
    
           
    // Multiply and sum all the PCA weights by the vClusterLdotT values 
//    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    for (int i=0; i < (3); i++) 
    {
        ExitRGB += PCAWeights[i].xyz * LdotT[i+1].xyz;
    }    
   
    float ExitRadiance = LdotT[0].x;
    float Temp = dot(ExitRGB,1);
    ExitRadiance += Temp;
//    ExitRadiance.w = Temp;
    
    
    return ExitRadiance;
*/    
};


float4 DiffuseSHPRTFloat1(const float PCAWeights[MAX_NUM_PCA_VECTORS/4])
{

    float4 ExitRGB = (float4)0;
    
    //return PCAWeights[2];
    
    // Multiply and sum all the PCA weights by the vClusterLdotT values 
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    //for (int i=0; i < (2); i++) 
    {
        ExitRGB += PCAWeights[i] * LdotT[i+1];
        //ExitRGB.rgb += PCAWeights[i];
    }    
   
   //return ExitRGB;
   
    float4 ExitRadiance = LdotT[0];
    float Temp = dot(ExitRGB,1);
    ExitRadiance += Temp;
    //ExitRadiance += ExitRGB;
    
    //ExitRadiance.rgb *= 2;
    //ExitRadiance.w = Temp;
    
    
    return ExitRadiance;
};


#endif