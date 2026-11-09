// material.frag

#ifndef __MATERIAL_FRAG__
#define __MATERIAL_FRAG__


const float4 MaterialAmbient : REPMaterialAmbient;
const float4 MaterialDiffuse : REPMaterialDiffuse;
const float4 MaterialEmissive : REPMaterialEmissive;
const float4 MaterialSpecular : REPMaterialSpecular;
const float MaterialPower : REPMaterialPower;

const  float4 GlobalMaterialAmbient : REPGlobalMaterialAmbient;
const float4 GlobalMaterialDiffuse : REPGlobalMaterialDiffuse;
const float4 GlobalMaterialEmissive : REPGlobalMaterialEmissive;
const float4 GlobalMaterialSpecular : REPGlobalMaterialSpecular;
const float GlobalMaterialPower : REPGlobalMaterialPower;


#endif // ndef __MATERIAL_FRAG__