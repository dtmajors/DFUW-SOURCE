/*
 * Decompiled with CFR.
 */
public class igb
extends ifv {
    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        if (ifk.lRm != Float.MAX_VALUE) {
            return ifk.lRm;
        }
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        for (igh igh2 : igj.lSv) {
            float f2;
            if (igh2.cTd() != bl || !((f2 = igh2.cY(ljq2)) < f)) continue;
            f = f2;
            bl2 = true;
            ljq3.ex(igh2.av());
        }
        if (!bl2) {
            return -1.0f;
        }
        ifk.lRm = f;
        return f;
    }
}

