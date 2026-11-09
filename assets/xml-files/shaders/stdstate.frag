// StdState.frag

#ifndef _STD_STATE_FRAG_
#define _STD_STATE_FRAG_

#define STD_STATE \
	ZFunc = LessEqual; \
	ColorWriteEnable = RED | GREEN | BLUE | ALPHA; \
	ColorWriteEnable1 = RED | GREEN | BLUE | ALPHA; \
	ColorWriteEnable2 = RED | GREEN | BLUE | ALPHA; \
	SeparateAlphaBlendEnable = false
	
#endif // ndef _STD_STATE_FRAG_