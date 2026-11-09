// colorGrading.frag

#ifndef _COLOR_GRADING_FRAG_
#define _COLOR_GRADING_FRAG_

#include "texture.frag"

float3 colorGrade(float3 color) {
	return tex3D(colorGradingSampler, (15 * saturate(color) + 0.5) / 16);
}

#endif // ndef _COLOR_GRADING_FRAG_