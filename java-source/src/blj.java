/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 */
public class blj
extends bke {
    private fcw dtR = null;
    private static les DX = lea.enT();

    public blj() {
        this.dsy = bkd.a.drL;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9227) {
            this.Vc();
            return;
        }
        this.dtR = (fcw)fdo2;
        fdo2.f(this.GUID);
        fdo2.dul |= 0xA;
        fdo2.bst = bkd.dqy;
        this.MessageDelegator.F(fdo2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(fdg fdg2) {
        if (fdg2.iJT == null) {
            this.Vc();
            return;
        }
        if (fdg2.dsL == null) {
            this.Vc();
            return;
        }
        if (fdg2.iJU <= 0.0f) {
            this.Vc();
            return;
        }
        if (lea.enW().isDescendant(this.dtR.dhr, cug.fgH)) {
            this.Vc();
            return;
        }
        this.cV(fdg2.iJU);
    }

    private int[] kY(int n) {
        if (n == 3168) {
            return new int[]{352, 3136};
        }
        if (n == 3648) {
            return new int[]{384, 3584};
        }
        if (n == 5184) {
            return new int[]{400, 5120};
        }
        return new int[]{352, 3136};
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            this.Vc();
            return;
        }
        if (!fcs2.iJq) {
            // empty if block
        }
        this.Vc();
    }

    private void cV(float f2) {
        als als2;
        assert (f2 >= 0.0f);
        assert (this.dtR != null);
        int[] nArray = this.kY(this.dtR.aYG);
        int n = nArray[0];
        int n2 = nArray[1];
        if (n == 352 && (als2 = this.hI(this.dtR.aZG)) != null) {
            f2 = ayc.a((cbx)als2.jf(), true, false, f2);
        }
        als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(5.0);
        als2.ga(1);
        als2.gb(5);
        als2.fC(n);
        int n3 = (int)als2.DV() * 1;
        float f3 = f2 / (float)n3;
        als2.gc(n3);
        als2.ar(f3);
        als2.aq(0.0f);
        als2.as(f2);
        als2.cP(this.dtR.aYF);
        als2.gd(this.dtR.bsG);
        als2.ge(this.dtR.aYC);
        als2.fJ(n2);
        als2.gf(this.dtR.aYH);
        als2.aX(this.GUID);
        this.a(this.dtR.aZG, als2, this.dtR.aZH);
    }
}

