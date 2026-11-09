/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
public class cnf
extends cni {
    private ayd cCy = null;

    public cnf() {
        this.setObjectType(116);
    }

    public ayd acx() {
        return this.cCy;
    }

    public void b(ayd ayd2) {
        this.cCy = ayd2;
        if (this.cCy == null) {
            this.lc(null);
        } else {
            this.lc(this.cCy.getGUID());
        }
    }

    @Override
    public int asb() {
        return this.cCy == null ? 0 : this.cCy.a(this);
    }

    public boolean ld(ldv ldv2) {
        cnk cnk2 = this.sc(ldv2.ib());
        if (cnk2 == null) {
            return false;
        }
        return cnk2.eOp;
    }

    public boolean le(ldv ldv2) {
        cnk cnk2 = this.sc(ldv2.ib());
        if (cnk2 == null) {
            return false;
        }
        return cnk2.dFx;
    }

    public final ldv rX(int n) {
        cnk cnk2 = this.sc(n);
        if (cnk2 == null) {
            return null;
        }
        return cnk2.dzZ;
    }

    public final void e(bbr bbr2) {
        if (bbr2 == null) {
            return;
        }
        ldv ldv2 = this.sd(bbr2.abB().enw());
        if (ldv2 == null) {
            return;
        }
        gbc gbc2 = (gbc)this.MessageDelegator.h(4879, this.GUID, ldv2);
        this.MessageDelegator.F(gbc2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13835: {
                this.a((emc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(emc emc2) {
        cnk cnk2 = this.sc(emc2.aO().ib());
        if (cnk2 == null) {
            return;
        }
        bbr bbr2 = this.cCy.iO(cnk2.dzZ.enw());
        bqm.b b2 = this.aJC().asf().alX();
        if (b2 == null) {
            cnk2.dFx = false;
            cnk2.eOp = false;
        } else {
            switch (b2) {
                case dEp: {
                    cnk2.dFx = bbr2 == null ? false : bbr2.b(bca.cTZ);
                    cnk2.eOp = bbr2 == null ? false : bbr2.b(bca.cUa);
                    break;
                }
                case dER: {
                    cnk2.dFx = bbr2 == null ? false : bbr2.b(bca.cUe);
                    cnk2.eOp = bbr2 == null ? false : bbr2.b(bca.cUf);
                    break;
                }
                case dES: {
                    cnk2.dFx = bbr2 == null ? false : bbr2.b(bca.cUg);
                    cnk2.eOp = bbr2 == null ? false : bbr2.b(bca.cUi);
                }
            }
        }
        emd emd2 = (emd)this.MessageDelegator.h(13836, this.GUID, emc2.aO());
        emd2.dFx = cnk2.dFx;
        emd2.dFy = cnk2.eOp;
        this.MessageDelegator.F(emd2);
    }
}

