/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  lcr
 */
public class dar
extends czb {
    private boolean gbq = false;
    private boolean gbr = false;
    private boolean gbo = false;
    private ldv gbp = null;

    public boolean biB() {
        return this.gbq;
    }

    public void hz(boolean bl) {
        this.gbq = bl;
    }

    public boolean biC() {
        return this.gbr;
    }

    public void hA(boolean bl) {
        this.gbr = bl;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 9221: {
                this.a((fdh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void bey() {
        assert (!this.gbo);
        assert (this.gbp == null);
        assert (this.fGZ);
        assert (this.fGi != null);
        if (this.gbq) {
            this.gbo = true;
            this.i(this.fGi);
        }
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        dar dar2 = (dar)((Object)cxc2);
        dar2.hz(this.gbq);
        dar2.hA(this.gbr);
    }

    protected void beA() {
        assert (!this.gbq);
        if (this.fGZ) {
            assert (this.fGi != null);
            this.i(this.fGi);
        } else {
            ldv ldv2 = null;
            ldv2 = this.fGh.akX == null ? this.emI.bgQ().getGUID() : this.fGh.akX;
            ldv ldv3 = this.emI.bgQ().getGUID();
            int n2 = this.emI.bgQ().getObjectType();
            this.c(ldv3, ldv2, ldv3, n2);
        }
    }

    protected void beC() {
        if (this.fGZ) {
            assert (this.fGi != null);
            if (this.gbq) {
                this.gbo = false;
                if (this.gbp != null) {
                    this.hR(this.gbp);
                    this.gbp = null;
                }
            } else {
                if (this.fGi.aYC == cxd.fHR && this.emI.bgQ().aIq()) {
                    ((cex)this.emI.bgQ()).c(mcl.uvX.bD(new Object[0]));
                    if (this.gbr) {
                        fcs fcs2 = (fcs)this.MessageDelegator.h(9219, this.GUID, this.GUID);
                        fcs2.iJq = false;
                        fcs2.bst = this.getFunctionType();
                        this.a(fcs2);
                    }
                    return;
                }
                this.i(this.fGi);
            }
        } else {
            assert (this.fGh.akX != null);
            ldv ldv2 = this.fGh.akX;
            ldv ldv3 = this.emI.bgQ().getGUID();
            int n2 = this.emI.bgQ().getObjectType();
            this.c(ldv3, ldv2, ldv3, n2);
        }
    }

    protected final void beD() {
        if (!this.gbq) {
            return;
        }
        this.gbo = false;
        if (this.gbp != null) {
            this.hR(this.gbp);
            this.gbp = null;
        }
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            return;
        }
        if (!this.gbr) {
            return;
        }
        if (this.fGZ) assert (this.fGi != null);
        czj czj2 = this.emI.mf(this.GUID);
        if (czj2 == null) {
            return;
        }
        if (fcs2.iJq) {
            if (fcs2.bst == bkd.dqx || fcs2.bst == bkd.dqA) {
                this.jk().ch((cxc)((Object)czj2));
            }
            czj2.bhr();
            czj2.a(cxd.p.fSi, this.fGi);
        } else {
            if (this.fGi != null && lea.enW().isDescendant(this.fGi.dhr, cug.fkA)) {
                czj2.bhr();
                czj2.a(cxd.p.fSi, this.fGi);
                return;
            }
            czj2.ber();
        }
    }

    private void a(fdh fdh2) {
        if (fdh2.gbp == null) {
            return;
        }
        if (this.gbo) {
            this.gbp = fdh2.gbp;
        } else {
            assert (this.gbp == null);
            this.hR(fdh2.gbp);
        }
    }

    private void c(ldv ldv2, ldv ldv3, ldv ldv4, int n2) {
        fdo fdo2 = (fdo)this.MessageDelegator.h(9217, this.GUID, this.MessageDelegator.getGUID());
        if (this.gbr) {
            fdo2.dul |= 8;
        }
        fdo2.bst = this.getFunctionType();
        fdo2.aZG = ldv2;
        fdo2.akX = ldv3;
        fdo2.aYF = ldv4;
        fdo2.bsG = this.emI.bgQ().az();
        fdo2.aYC = n2;
        this.MessageDelegator.F(fdo2);
    }

    private void i(ddc ddc2) {
        fdo fdo2 = (fdo)this.MessageDelegator.h(9217, this.GUID, this.MessageDelegator.getGUID());
        if (this.gbq) {
            fdo2.dul |= 4;
        }
        if (this.gbr) {
            fdo2.dul |= 8;
        }
        fdo2.bst = this.getFunctionType();
        fdo2.aZG = ddc2.aYF;
        fdo2.akX = ddc2.akX;
        fdo2.aYF = ddc2.aYF;
        fdo2.bsG = this.emI.bgQ().az();
        fdo2.aYC = ddc2.aYC;
        if (ddc2.akX.equals(lcr.qEk)) {
            fdo2.dhr = ddc2.dhr;
        }
        this.MessageDelegator.F(fdo2);
    }
}

