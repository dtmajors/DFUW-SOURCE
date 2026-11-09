/*
 * Decompiled with CFR.
 */
public class ifz
extends ifv {
    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        chk chk2 = (chk)che2;
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        ljq ljq4 = new ljq();
        if (chk2.ezZ != null && !chk2.ezZ.isEmpty()) {
            for (String string : chk2.ezZ) {
                float f2;
                cgr cgr2 = lea.eps().hm(string);
                if (cgr2 == null || !((f2 = ifk.a(ljq2, bl, cgr2, ljq4)) < f)) continue;
                f = f2;
                bl2 = true;
                ljq3.ex(ljq4);
            }
        }
        return bl2 ? f : -1.0f;
    }
}

