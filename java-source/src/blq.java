/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cxd
 *  cxg
 *  ha
 */
public class blq
extends bke {
    private fcw dtR = null;
    private static les DX = lea.enT();

    public blq() {
        this.dsy = bkd.a.drM;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9227) {
            this.Vc();
            return;
        }
        this.dtR = (fcw)fdo2;
        if (this.dtR.aYC == cxd.fKZ) {
            ha ha2 = this.hI(this.dtR.akX);
            if (ha2 == null || ha2.jm() == null) {
                this.Vc();
                return;
            }
            int[] nArray = this.kZ(this.dtR.aYG);
            et et2 = (et)ha2.jm().ae(nArray[0]);
            if (et2.fN() < this.dtR.Magnitude) {
                this.dtR.Magnitude = et2.fN();
            }
            ldv ldv2 = this.dtR.aZG;
            ldv ldv3 = this.dtR.akX;
            this.dtR.akX = ldv2;
            this.dtR.aZG = ldv3;
            this.dtR.aYF = ldv3;
        }
        fdo2.f(this.GUID);
        fdo2.dul |= 0xA;
        fdo2.bst = bkd.dqy;
        this.MessageDelegator.F(fdo2);
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
        this.cW(fdg2.iJU);
    }

    private void cW(float f2) {
        assert (f2 >= 0.0f);
        assert (this.dtR != null);
        int[] nArray = this.kZ(this.dtR.aYG);
        int n = nArray[0];
        int n2 = nArray[1];
        f2 = this.cX(-f2);
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(0.0);
        als2.ga(1);
        als2.gb(1);
        als2.fC(n);
        als2.x(-3.0);
        als2.as(f2);
        als2.aq(f2);
        als2.cP(this.dtR.aYF);
        als2.gd(this.dtR.bsG);
        als2.ge(this.dtR.aYC);
        als2.fJ(n2);
        als2.gf(this.dtR.aYH);
        this.a(this.dtR.aZG, als2, this.dtR.aZH);
    }

    private int[] kZ(int n) {
        if (this.dtR.aYC == cxd.fKZ) {
            return new int[]{384, 3648};
        }
        if (n == 3136) {
            return new int[]{352, 3168};
        }
        if (n == 3584) {
            return new int[]{384, 3648};
        }
        if (n == 5120) {
            return new int[]{400, 5184};
        }
        return new int[]{352, 3168};
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

    private float cX(float f2) {
        if (this.dtR.aYC != cxd.fKZ) {
            return f2 * 0.4f;
        }
        ha ha2 = this.hI(this.dtR.aZG);
        if (ha2 == null) {
            return f2;
        }
        cex cex2 = ha2.jf();
        if (cex2 == null || cex2.jk() == null) {
            return f2;
        }
        czk czk2 = (czk)((Object)cex2.jk().ht(cxd.fKZ));
        assert (czk2 != null);
        return cxg.d((cxc)((Object)czk2), (int)1305) * f2;
    }
}

