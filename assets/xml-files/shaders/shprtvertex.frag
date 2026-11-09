//SHPRT Fragment Shader


//Declare this one as shared
#define MAX_NUM_CLUSTERS    1
#define MAX_NUM_PCA_VECTORS 16


shared float4 vClusterLdotT[MAX_NUM_CLUSTERS*(1+3*(MAX_NUM_PCA_VECTORS/4))] : RESHLightInput;

float4 DiffuseSHPRTCluster(const int ClusterOffset, const float4 PCAWeights[MAX_NUM_PCA_VECTORS/4])
{

    float4 vExitR = float4(0,0,0,0);
    float4 vExitG = float4(0,0,0,0);
    float4 vExitB = float4(0,0,0,0);
    
    // A single diffuse channel is caluated by:
    //       R[p] = (M[i] dot L) + sum( W[p][j] * ( B[i][j] dot L );
    // where the sum runs j between 0 and # of PCA vectors
    //       R[p] = exit radiance at point p
    //       M[i] = mean of cluster i 
    //       L = source radiance 
    //       W[p][j] = the j'th PCA weight for point p
    //       B[i][j] = the j'th PCA basis vector for cluster i
    //
    // Note: since both (M[i] dot L) and (B[i][j] dot L) can be computed on the CPU, 
    // these values are passed in as the array vClusterLdotT.   
           
    // Multiply and sum all the PCA weights by the vClusterLdotT values 
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        vExitR += PCAWeights[i] * vClusterLdotT[ClusterOffset+i+1];
    }    
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        vExitG += PCAWeights[i] * vClusterLdotT[ClusterOffset+i+1+(MAX_NUM_PCA_VECTORS/4)];
    }    
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        vExitB += PCAWeights[i] * vClusterLdotT[ClusterOffset+i+1+(MAX_NUM_PCA_VECTORS/4)*2];
    }    
   
    float4 vExitRadiance = vClusterLdotT[ClusterOffset];
    vExitRadiance.r += dot(vExitR,1);
    vExitRadiance.g += dot(vExitG,1);
    vExitRadiance.b += dot(vExitB,1);
    
    return vExitRadiance;
};

float4 DiffuseSHPRT(const float4 PCAWeights[MAX_NUM_PCA_VECTORS/4])
{
    float4 vExitR = float4(0,0,0,0);
    float4 vExitG = float4(0,0,0,0);
    float4 vExitB = float4(0,0,0,0);
    
    // A single diffuse channel is caluated by:
    //       R[p] = (M[i] dot L) + sum( W[p][j] * ( B[i][j] dot L );
    // where the sum runs j between 0 and # of PCA vectors
    //       R[p] = exit radiance at point p
    //       M[i] = mean of cluster i 
    //       L = source radiance 
    //       W[p][j] = the j'th PCA weight for point p
    //       B[i][j] = the j'th PCA basis vector for cluster i
    //
    // Note: since both (M[i] dot L) and (B[i][j] dot L) can be computed on the CPU, 
    // these values are passed in as the array vClusterLdotT.   
           
    // Multiply and sum all the PCA weights by the vClusterLdotT values 
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        vExitR += PCAWeights[i] * vClusterLdotT[i+1];
    }    
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        vExitG += PCAWeights[i] * vClusterLdotT[i+1+(MAX_NUM_PCA_VECTORS/4)];
    }    
    for (int i=0; i < (MAX_NUM_PCA_VECTORS/4); i++) 
    {
        vExitB += PCAWeights[i] * vClusterLdotT[i+1+(MAX_NUM_PCA_VECTORS/4)*2];
    }    
   
    float4 vExitRadiance = vClusterLdotT[0];
    vExitRadiance.r += dot(vExitR,1);
    vExitRadiance.g += dot(vExitG,1);
    vExitRadiance.b += dot(vExitB,1);
    
    return vExitRadiance;

};

