/*
 * Decompiled with CFR.
 */
public class csn
extends cso {
    private boolean ObjectClipping = true;
    public static final boolean fcc = true;
    private float fcd = 100.0f;
    public static final float fce = 100.0f;
    public static final float fcf = 10.0f;
    public static final float fcg = 400.0f;
    private float fch = 100.0f;
    public static final float fci = 200.0f;
    public static final float fcj = 20.0f;
    public static final float fck = 1000.0f;
    private float fcl = 10.0f;
    public static final float fcm = 10.0f;
    public static final float fcn = 1.0f;
    public static final float fco = 100.0f;
    private boolean fcp = this.ObjectClipping;
    private boolean fcq = true;
    public static final boolean fcr = true;
    public static final int fcs = 30;
    private int fct = 30;
    public static final int fcu = 15;
    public static final int fcv = 120;
    private static final float fcw = 100.0f;
    private static final float fcx = 50.0f;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aYT().getValue() != this.baB()) {
            this.gR(cqu2.aYT().getValue());
            this.baH();
        }
        if (cqu2.aYU().getValue() != this.baD()) {
            this.eO(cqu2.aYU().getValue());
            this.baH();
        }
        if (cqu2.aYV().getValue() != this.baE()) {
            this.eP(cqu2.aYV().getValue());
            this.baH();
        }
        if (cqu2.aYW().getValue() != this.baF()) {
            this.eQ(cqu2.aYW().getValue());
            this.baH();
        }
        if (cqu2.aZz().getValue() != this.baC()) {
            this.gS(cqu2.aZz().getValue());
            this.baI();
        }
        if (cqu2.aZy().getValue() != this.baG()) {
            this.tY(cqu2.aZy().getValue());
            this.baJ();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aYT().yP(this.baB());
        cqu2.aYU().nH(this.baD());
        cqu2.aYV().nH(this.baE());
        cqu2.aYW().nH(this.baF());
        cqu2.aZz().yP(this.baC());
        cqu2.aZy().adI(this.baG());
    }

    public boolean baB() {
        return this.ObjectClipping;
    }

    public void gR(boolean bl) {
        this.fcp = this.ObjectClipping = bl;
    }

    public final boolean baC() {
        return this.fcq;
    }

    public final void gS(boolean bl) {
        this.fcq = bl;
    }

    public float baD() {
        return this.fcd;
    }

    public void eO(float f2) {
        if (f2 < 10.0f) {
            f2 = 10.0f;
        }
        if (f2 > 400.0f) {
            f2 = 400.0f;
        }
        this.fcd = f2;
    }

    public float baE() {
        return this.fch;
    }

    public void eP(float f2) {
        if (f2 < 20.0f) {
            f2 = 20.0f;
        }
        if (f2 > 1000.0f) {
            f2 = 1000.0f;
        }
        this.fch = f2;
    }

    public float baF() {
        return this.fcl;
    }

    public void eQ(float f2) {
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        this.fcl = f2;
    }

    public final int baG() {
        return this.fct;
    }

    public final void tY(int n) {
        if (n < 15) {
            n = 15;
        }
        if (n > 120) {
            n = 120;
        }
        this.fct = n;
    }

    private void baH() {
        kgd kgd2 = this.WX();
        kgd2.WK(18);
        kgd2.vs(this.baB());
        kgd2.lo(this.baD());
        kgd2.lk(1.0f / this.baE());
        kgd2.vr(this.fcp);
        kgd2.ls(100.0f);
        kgd2.lt(50.0f);
        this.MessageDelegator.b(kgd2);
    }

    private void baI() {
        kgd kgd2 = this.WX();
        kgd2.WK(4096);
        kgd2.vx(this.baC());
        this.MessageDelegator.b(kgd2);
    }

    private void baJ() {
        kgd kgd2 = this.WX();
        kgd2.WK(64);
        kgd2.lv(this.baG());
        this.MessageDelegator.b(kgd2);
    }
}

