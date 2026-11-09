//  Shared Matrix Variables
//
//
//

#ifndef __PLANETS__FRAG__
#define __PLANETS__FRAG__

const shared float3 PlanetLightDir1 : REEnvPlanetaryLightDir1;
const shared float3 PlanetLightDir2 : REEnvPlanetaryLightDir2;
const shared float3 PlanetLightDir3 : REEnvPlanetaryLightDir3;
const float3 PlanetLightDir1ObjectSpace : REEnvPlanetaryLightDir1ObjectSpace;
const shared float4 PlanetLightColor1 : REEnvPlanetaryLightColor1;
const shared float4 PlanetLightColor2 : REEnvPlanetaryLightColor2;
const shared float4 PlanetLightColor3 : REEnvPlanetaryLightColor3;

const shared float3 PlanetPos1 : REEnvPlanetPosition1 = {0.0,0.0,0.0};
const shared float3 PlanetPos2 : REEnvPlanetPosition2 = {0.0,0.0,0.0};
const shared float3 PlanetPos3 : REEnvPlanetPosition3 = {0.0,0.0,0.0};

const shared float3 godRayParams : REPGodRayParams = {0.0, 0.0, 0.0};


#define PLANET_LIGHTDIR_01 PlanetLightDir1
#define PLANET_LIGHTDIR_02 PlanetLightDir2
#define PLANET_LIGHTDIR_03 PlanetLightDir3

#define PLANET_LIGHTDIR_COMMON PlanetLightDir1
#define PLANET_LIGHTDIR_COMMON_OBJECT_SPACE PlanetLightDir1ObjectSpace
#define PLANET_LIGHTCOLOR_COMMON PlanetLightColor1

#define PLANET_LIGHTCOLOR_01 PlanetLightColor1
#define PLANET_LIGHTCOLOR_02 PlanetLightColor2
#define PLANET_LIGHTCOLOR_03 PlanetLightColor3

#define PLANET_POSITION_01 PlanetPos1
#define PLANET_POSITION_02 PlanetPos2
#define PLANET_POSITION_03 PlanetPos3

#define GOD_RAY_SCREEN_CENTER godRayParams.xy
#define GOD_RAY_FADE godRayParams.z

#endif