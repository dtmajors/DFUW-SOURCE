#ifndef __INSTANCING__FRAG__
#define __INSTANCING__FRAG__


	//////////////////////////////////////////////////////////////////////////
	//Instancing (See SFRenderEffect.h. This file MUST be kept in sync)
	static const int INSTANCE_UNKNOWN								= 0;
	static const int INSTANCE_CUSTOM								= 0;
	static const int INSTANCE_POS_ROT								= 1;
	static const int INSTANCE_POS_ROT_GLOBCOLOR						= 2;
	static const int INSTANCE_WORLDMAT								= 3;
	static const int INSTANCE_WORLDPOS_ROT							= 4;
	static const int INSTANCE_WORLDMAT_GUIDRAND						= 5;
	static const int INSTANCE_WORLDMAT_DIFFUSE						= 6;
	static const int INSTANCE_WORLDMAT_MATERIAL_COLOR				= 7;
	static const int INSTANCE_WORLDMAT_2LIGHTS						= 8;
	static const int INSTANCE_WORLDMAT_MATERIAL_COLOR_2LIGHTS		= 9;
	static const int INSTANCE_WORLDMAT_AMBIENT_DIFFUSE				= 10;
	
#endif
