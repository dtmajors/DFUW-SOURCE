/*
 * Decompiled with CFR.
 */
public class csp
extends cso {
    public static final int fcy = 2000;
    public static final int fcz = 150;
    public static final int fcA = 1000;
    private int fcB = 1000;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aYS().getValue() != this.baL()) {
            this.tZ(cqu2.aYS().getValue());
            this.baM();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aYS().adI(this.baL());
    }

    public int baL() {
        return this.fcB;
    }

    public void tZ(int n) {
        if (n < 150) {
            n = 150;
        } else if (n > 2000) {
            n = 2000;
        }
        this.fcB = n;
    }

    private void baM() {
        kgp kgp2 = this.WT();
        kgp2.Xa(524288);
        kgp2.setMaxNumParticles(this.baL());
        this.MessageDelegator.b(kgp2);
    }
}

