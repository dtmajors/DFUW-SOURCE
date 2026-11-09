// reflection.frag

#ifndef _REFLECTION_FRAG_
#define _REFLECTION_FRAG_

#define REFLECTION_TYPE_REAL 0
#define REFLECTION_TYPE_FAKE 1

float fresnelDielectric(float3 incoming, float3 normal, float eta) {
    float c = abs(dot(incoming, normal));
    float g = eta * eta - 1.0 + c * c;
    float result;
	if(g > 0.0) {
		g = sqrt(g);
		float A =(g - c)/(g + c);
		float B =(c *(g + c)- 1.0)/(c *(g - c)+ 1.0);
		result = 0.5 * A * A *(1.0 + B * B);
	} else {
		result = 1.0;  // TIR (no refracted component) 
	}

    return result;
}

#endif // ndef _REFLECTION_FRAG_