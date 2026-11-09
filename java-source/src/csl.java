/*
 * Decompiled with CFR.
 */
public class csl
extends cso {
    public static final float fbJ = 1.0f;
    private float fba = 1.0f;
    public static final float fbK = 0.5f;
    public static final float fbL = 2.0f;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aZk().getValue() != this.bao()) {
            this.eN(cqu2.aZk().getValue());
            this.bap();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZk().nH(this.bao());
    }

    public float bao() {
        return this.fba;
    }

    public float eN(float f2) {
        if (f2 < 0.5f) {
            f2 = 0.5f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        this.fba = f2;
        return this.fba;
    }

    private void bap() {
        kgp kgp2 = this.WT();
        kgp2.Xa(0x800000);
        kgp2.lR(this.bao());
        this.MessageDelegator.b(kgp2);
    }
}

