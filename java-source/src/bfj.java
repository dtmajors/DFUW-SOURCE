/*
 * Decompiled with CFR.
 */
public class bfj {
    private static final boolean bC = false;

    public void a(ber ber2, dqv dqv2, int n, int n2) {
        int n3 = n * 60;
        int n4 = n2 * 60;
        assert (n4 >= 0 && n4 < 86400) : "InterpolationLength is invalid: " + n4;
        if (dqv2 instanceof drb) {
            this.a(ber2, (drb)dqv2, n3, n4);
            return;
        }
        if (dqv2 instanceof drk) {
            this.a(ber2, (drk)dqv2, n3, n4);
            return;
        }
        if (dqv2 instanceof drl) {
            this.a(ber2, (drl)dqv2, n3, n4);
            return;
        }
        if (dqv2 instanceof drd) {
            this.a(ber2, (drd)dqv2, n3, n4);
            return;
        }
    }

    private void a(ber ber2, drb drb2, int n, int n2) {
        bfc bfc2 = null;
        bfc2 = new bfe();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drb2.buz());
        bfc2.eS(3);
        ((bfe)bfc2).g(drb2.buT());
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drb2.buz());
        bfc2.eS(1);
        ((bff)bfc2).setValue(drb2.buR());
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drb2.buz());
        bfc2.eS(2);
        ((bff)bfc2).setValue(drb2.buS());
        ber2.a(bfc2);
        bfc2 = new bfe();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drb2.buz());
        bfc2.eS(4);
        ((bfe)bfc2).g(drb2.buU());
        ber2.a(bfc2);
        boolean bl = drb2.buV() == ber.a.ddY.ordinal();
        bfc2 = new bfd();
        bfc2.kC(n);
        bfc2.kD(0);
        bfc2.b(bfb.dfV);
        bfc2.eS(1);
        bfc2.dc(false);
        ((bfd)bfc2).setValue(bl);
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(bfb.dfV);
        bfc2.eS(2);
        bfc2.dc(true);
        ((bff)bfc2).setValue(bl ? drb2.buW() : 0.0f);
        ber2.a(bfc2);
        boolean bl2 = drb2.buV() == ber.a.ddZ.ordinal();
        bfc2 = new bfd();
        bfc2.kC(n);
        bfc2.kD(0);
        bfc2.b(bfb.dfW);
        bfc2.eS(1);
        bfc2.dc(false);
        ((bfd)bfc2).setValue(bl2);
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(bfb.dfW);
        bfc2.eS(2);
        bfc2.dc(true);
        ((bff)bfc2).setValue(bl2 ? drb2.buW() : 0.0f);
        ber2.a(bfc2);
    }

    private void a(ber ber2, drk drk2, int n, int n2) {
        bfc bfc2 = null;
        bfc2 = new bfe();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drk2.buz());
        bfc2.eS(1);
        ((bfe)bfc2).g(drk2.bvE());
        ber2.a(bfc2);
        bfc2 = new bfe();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drk2.buz());
        bfc2.eS(9);
        ((bfe)bfc2).g(drk2.bvF());
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drk2.buz());
        bfc2.eS(4);
        ((bff)bfc2).setValue(drk2.bvI());
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drk2.buz());
        bfc2.eS(3);
        ((bff)bfc2).setValue(drk2.bvH());
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drk2.buz());
        bfc2.eS(2);
        ((bff)bfc2).setValue(drk2.bvG());
        ber2.a(bfc2);
        assert (drk2.bvG() < drk2.bvH()) : "FogStart > FogEnd";
    }

    private void a(ber ber2, drl drl2, int n, int n2) {
        bfc bfc2 = null;
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drl2.buz());
        bfc2.eS(1);
        ((bff)bfc2).setValue(drl2.bvS());
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drl2.buz());
        bfc2.eS(2);
        ((bff)bfc2).setValue(drl2.bvT());
        ber2.a(bfc2);
        bfc2 = new bff();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drl2.buz());
        bfc2.eS(3);
        ((bff)bfc2).setValue(drl2.bvU());
        ber2.a(bfc2);
        bfc2 = new bfg();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drl2.buz());
        bfc2.eS(4);
        ((bfg)bfc2).setValue(drl2.bvP());
        ber2.a(bfc2);
    }

    private void a(ber ber2, drd drd2, int n, int n2) {
        bfc bfc2 = null;
        bfc2 = new bfe();
        bfc2.kC(n);
        bfc2.kD(n2);
        bfc2.b(drd2.buz());
        bfc2.eS(6);
        ((bfe)bfc2).g(drd2.bvi());
        ber2.a(bfc2);
        if (ber2.ans()) {
            bfc2 = new bfh();
            bfc2.kC(n);
            bfc2.kD(n2);
            bfc2.b(drd2.buz());
            bfc2.eS(4);
            ((bfh)bfc2).aO(drd2.bve());
            ber2.a(bfc2);
            bfc2 = new bff();
            bfc2.kC(n);
            bfc2.kD(n2);
            bfc2.b(drd2.buz());
            bfc2.eS(7);
            ((bff)bfc2).setValue(drd2.bvj());
            ber2.a(bfc2);
        }
    }
}

