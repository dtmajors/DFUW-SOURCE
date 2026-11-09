/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class cmz
extends cmw {
    private btn eHi = null;
    private cmy eNv = null;
    private gke eNw = null;
    private gkf eNx = null;
    private static final int eNy = -2;
    private double eNz = 0.0;
    private boolean eNA = true;
    private int eNB = -10000;
    private double eNC = 0.0;
    private static final double eND = 300.0;
    private static final int eNE = 1;
    private static final int eNF = 2;

    public cmz() {
        super(true);
    }

    public void c(btn btn2) {
        this.eHi = btn2;
    }

    public void d(btn btn2) {
        this.eHi = null;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.eNA && this.eNz + 3.0 + 0.1 < this.MessageDelegator.arc().rgz) {
            this.eNA = true;
            this.aUf();
            assert (this.eNx != null);
            this.MessageDelegator.F(this.eNx);
            this.eNx = null;
        }
        if (this.eNC + 300.0 < this.MessageDelegator.arc().rgz) {
            gkj gkj2 = (gkj)this.MessageDelegator.h(26122, this.getGUID(), lcr.qEs);
            gkj2.jjU = this.eNv.rV(this.az());
            gkj2.gfd = this.az();
            this.MessageDelegator.F(gkj2);
            this.eNC = this.MessageDelegator.arc().rgz;
        }
    }

    private boolean aUe() {
        if (this.eNw != null) {
            return false;
        }
        return this.eNx == null;
    }

    public void initialize() {
        super.initialize();
        this.eNv = new cmy();
        this.aUf();
        this.fi().i(12512, this.eNv.rV(this.az()));
    }

    public void Hy() {
        this.aIw();
    }

    public void receiveMessage(dxq dxq2) {
        if (this.eHi != null && this.eHi.a(dxq2, (btk)((Object)this))) {
            return;
        }
        switch (dxq2.bEz()) {
            case 26116: {
                this.a((gke)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            case 26119: {
                this.a((gkm)dxq2);
                break;
            }
            case 26123: {
                this.a((gkk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gke gke2) {
        if (!this.aUe() || this.eNv == null) {
            gkf gkf2 = (gkf)this.MessageDelegator.h(26117, this.getGUID(), gke2.aO());
            this.MessageDelegator.b(gke2, gkf2);
            gkf2.ew = 2;
            this.MessageDelegator.F(gkf2);
            return;
        }
        this.eNw = gke2;
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), gke2.diQ);
        fne2.hsP = true;
        fne2.iQN = true;
        fne2.aqs = 1;
        fne2.ResourceType = this.eNv.aTY();
        fne2.asi = this.eNv.rV(this.az());
        fne2.b(bqy.dHX);
        this.MessageDelegator.F(fne2);
    }

    private void a(fnf fnf2) {
        assert (fnf2.aVk() == 1 || fnf2.aVk() == 2);
        if (!fnf2.iQM && fnf2.aVk() == 1) {
            fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), this.eNw.diQ);
            fne2.hsP = true;
            fne2.iQN = false;
            fne2.aqs = 2;
            fne2.ResourceType = this.eNv.aTY();
            fne2.asi = this.eNv.rV(this.az());
            fne2.b(bqy.dHX);
            this.MessageDelegator.F(fne2);
            return;
        }
        if (!fnf2.iQM) {
            assert (this.eNw != null);
            gkf gkf2 = (gkf)this.MessageDelegator.h(26117, this.getGUID(), this.eNw.aO());
            this.MessageDelegator.b(this.eNw, gkf2);
            gkf2.ew = 3;
            gkf2.brS = this.eNv.aTY();
            gkf2.jjL = this.eNv.rV(this.az());
            this.MessageDelegator.F(gkf2);
            this.eNw = null;
            return;
        }
        gkl gkl2 = (gkl)this.MessageDelegator.h(26118, this.getGUID(), lcr.qEs);
        gkl2.jjU = this.eNv.rV(this.az());
        gkl2.jjW = this.eNv.aTY();
        gkl2.gfd = this.az();
        this.MessageDelegator.F(gkl2);
    }

    private void a(gkm gkm2) {
        assert (this.eNw != null);
        gkf gkf2 = (gkf)this.MessageDelegator.h(26117, this.getGUID(), this.eNw.aO());
        this.MessageDelegator.b(gkm2, gkf2);
        gkf2.ew = 1;
        gkf2.jjO = this.eNv.aTZ();
        if (gkm2.jjX) {
            gkf2.jjM = true;
            gkf2.jjN = gkm2.jjV;
            this.eNv.aUa();
            this.rW(0);
        } else {
            gkf2.jjN = this.eNv.rU(this.az());
            gkf2.jjM = false;
            this.rW(gkm2.jjV);
        }
        this.n(this.eNv.aUb(), this.eNv.aUc(), this.eNv.aUd());
        this.eNx = gkf2;
        this.eNw = null;
    }

    private void a(gkk gkk2) {
        this.rW(gkk2.jjV);
    }

    private void rW(int n) {
        int n2 = this.eNB - n;
        if ((n2 = Math.abs(n2)) > 10) {
            this.fi().i(12512, this.eNv.rV(this.az()));
            this.fi().i(12528, n);
            this.eNB = n;
        }
        this.eNC = this.MessageDelegator.arc().rgz;
    }

    private void n(int n, int n2, int n3) {
        gkg gkg2 = (gkg)this.MessageDelegator.h(26120, this.getGUID(), this.getGUID());
        gkg2.jjP = n;
        gkg2.jjQ = n2;
        gkg2.jjR = n3;
        gkg2.oV = this.MessageDelegator.arc().rgz;
        gkg2.eKm = 3.0;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)this.MessageDelegator.arc().rgz + 3.0f;
        gqu2.iXB = gkg2;
        this.MessageDelegator.F(gqu2);
        this.eNz = this.MessageDelegator.arc().rgz;
        this.eNA = false;
    }

    protected void aIw() {
        super.aIw();
        if (lcw.enb()) {
            // empty if block
        }
    }

    private void aUf() {
        ew ew2 = this.jm().ao(10544);
        ew ew3 = this.jm().ao(10560);
        ew ew4 = this.jm().ao(10576);
        assert (ew2 != null);
        assert (ew3 != null);
        assert (ew4 != null);
        ew2.bi(this.eNv.aUb());
        ew3.bi(this.eNv.aUc());
        ew4.bi(this.eNv.aUd());
    }
}

