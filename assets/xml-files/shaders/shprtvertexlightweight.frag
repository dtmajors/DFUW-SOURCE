//SHPRT Fragment Shader


//Declare this one as shared
#define MAX_NUM_CLUSTERS    1
#define MAX_NUM_PCA_VECTORS 16


shared float4 vClusterLdotT[MAX_NUM_CLUSTERS*(1+3*(MAX_NUM_PCA_VECTORS/4))] : RESHLightInputLightWeight;



float4 DiffuseSHPRTLightWeight(const float4 PCAWeights[MAX_NUM_PCA_VECTORS/4])
{

    float4 ExitRGB = (float4)0;
    
           
    // Multiply and sum all the PCA weights by the vClusterLdotT values 
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        ExitRGB.rgb += PCAWeights[i] * vClusterLdotT[i+1];
    }    
//    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
//    {
//        vExitG += PCAWeights[i] * vClusterLdotT[i+1+(MAX_NUM_PCA_VECTORS/4)];
//    }    
//    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
//    {
//        vExitB += PCAWeights[i] * vClusterLdotT[i+1+(MAX_NUM_PCA_VECTORS/4)*2];
//    }    
   
    float4 ExitRadiance = vClusterLdotT[0];
    ExitRadiance.rgb += dot(ExitRGB,1);    
    
    //vExitRadiance.g += dot(vExitG,1);
    //vExitRadiance.b += dot(vExitB,1);
    
    return ExitRadiance;

};


float4 DiffuseSHPRTClusterLightWeight(const int ClusterOffset, const float4 PCAWeights[MAX_NUM_PCA_VECTORS/4])
{

//    float4 vExitR = float4(0,0,0,0);
//    float4 vExitG = float4(0,0,0,0);
//    float4 vExitB = float4(0,0,0,0);
    
    float4 ExitRGB = (float4)0;

    
           
    // Multiply and sum all the PCA weights by the vClusterLdotT values 
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        ExitRGB += PCAWeights[i] * vClusterLdotT[ClusterOffset+i+1];
    }    
//    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
//    {
//        vExitG += PCAWeights[i] * vClusterLdotT[ClusterOffset+i+1+(MAX_NUM_PCA_VECTORS/4)];
//    }    
//    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
//    {
//        vExitB += PCAWeights[i] * vClusterLdotT[ClusterOffset+i+1+(MAX_NUM_PCA_VECTORS/4)*2];
//    }    
   
    float4 vExitRadiance = vClusterLdotT[ClusterOffset];
    vExitRadiance.rgb += dot(ExitRGB,1);
//    vExitRadiance.g += dot(vExitG,1);
//    vExitRadiance.b += dot(vExitB,1);
    
    return vExitRadiance;
};
