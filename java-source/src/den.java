/*
 * Decompiled with CFR.
 */
public class den
extends btk
implements bto {
    private static final float gmC = 1.5707964f;
    private ldz eMa = null;

    @Override
    public void doTick(ldz ldz2) {
        this.eMa = ldz2;
    }

    public void a(ldv ldv2, ljq ljq2, ljq ljq3, float f2) {
        float f3 = ((float)Math.random() - 0.5f) * 2.0f * 1.5707964f;
        lgl lgl2 = new lgl(f3, 0.0f, 0.0f);
        ljq ljq4 = new ljq(ljq2);
        ljq4.et(ljq3);
        if (ljq4.eqN() > 0.001f) {
            ljq4 = lgl2.eq(ljq4);
            ljq4.normalize();
            khn khn2 = (khn)this.MessageDelegator.h(3084);
            khn2.setActive(true);
            khn2.wD(false);
            khn2.jM(false);
            khn2.hC(ldv2);
            khn2.ts(this.getGUID());
            khn2.df(ljq4);
            khn2.lU(1.0f);
            khn2.Xt(3);
            this.MessageDelegator.a(khn2);
        }
    }
}

