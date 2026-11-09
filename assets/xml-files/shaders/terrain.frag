//  Common Terrain Shader Traits
//
//
//

#ifndef __TERRAIN__FRAG__
#define __TERRAIN__FRAG__



static const float DetailFadeStart = 00.0f;
static const float DetailFadeEnd = 100.0f;
static const float MaxDetail = 0.7f;
static const float MinDetail = 0.4f;
static const float ShineStart = 200.0f;


// BYTE 0: TextureNumber
// BYTE 1: X Kant [0,1]
// BYTE 2: Y Kant [0,1]
// BYTE 3: Blend  [0,1]
// 0 if DetailTextures

float DetailLookup[4] =
{
	0.0f,
	1.0f,
	0.0f,
	1.0f,
};


#endif