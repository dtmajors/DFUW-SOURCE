/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;

public class ify
extends ifv {
    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        chj chj2 = (chj)che2;
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        if (chj2.ezY == null) {
            return -1.0f;
        }
        if (!chj2.abr) {
            List<String> list = lea.ept().get(chj2.ezY);
            if (list != null) {
                for (String string : list) {
                    ljq ljq4 = lcw.zh((String)string);
                    float f2 = ljq4.x - ljq2.x;
                    float f3 = -ljq4.rlV - -ljq2.rlV;
                    float f4 = (float)Math.sqrt(f2 * f2 + f3 * f3);
                    if (!(f4 < f)) continue;
                    f = f4;
                    bl2 = true;
                    ljq3.ex(ljq4);
                }
            }
        } else {
            ljq ljq5 = mws.DW(chj2.ezY);
            if (ljq5 != null) {
                float f5 = ljq5.x - ljq2.x;
                float f6 = -ljq5.rlV - -ljq2.rlV;
                f = (float)Math.sqrt(f5 * f5 + f6 * f6);
                bl2 = true;
                ljq3.ex(ljq5);
            }
        }
        return bl2 ? f : -1.0f;
    }
}

