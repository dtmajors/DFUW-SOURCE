/*
 * Decompiled with CFR.
 */
public class ifw
extends ifv {
    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        chg chg2 = (chg)che2;
        if (chg2.ObjectType == cgd.ewS.ordinal()) {
            return -1.0f;
        }
        les les2 = lea.enZ();
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        if (chg2.bSL == -1 || chg2.ezO) {
            for (igi igi2 : igj.lSt) {
                float f2;
                if (igi2.cTd() != bl || !((f2 = igi2.cY(ljq2)) < f)) continue;
                f = f2;
                bl2 = true;
                ljq3.ex(igi2.av());
            }
        } else {
            for (igi igi3 : igj.lSt) {
                for (Integer n : igi3.cTg()) {
                    float f3;
                    if (!les2.isDescendant(chg2.bSL, n) || !((f3 = igi3.cY(ljq2)) < f)) continue;
                    f = f3;
                    bl2 = true;
                    ljq3.ex(igi3.av());
                }
            }
        }
        return bl2 ? f : -1.0f;
    }
}

