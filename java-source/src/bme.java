/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cug
 *  dta
 *  lcr
 */
public class bme
extends bke {
    private fdn duZ = null;
    private ljq be = null;
    private ldv Ts = null;
    private ldv SA = null;

    public bme() {
        this.dsy = bkd.a.drB;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9237) {
            this.Vc();
            return;
        }
        this.duZ = (fdn)fdo2;
        if (this.duZ.ResourceType <= 0) {
            this.Vc();
            return;
        }
        if (!ResourceTree.isDescendant(this.duZ.ResourceType, cug.fgE)) {
            this.Vc();
            return;
        }
        this.be = this.duZ.be == null ? this.hV(fdo2.aZG) : this.duZ.be;
        this.arF();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13315: {
                this.a((dye)dxq2);
                break;
            }
            case 11017: {
                this.a((gqj)dxq2);
                break;
            }
            case 11019: {
                this.a((gqm)dxq2);
                break;
            }
            case 11027: {
                this.a((gpa)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private ljq hV(ldv ldv2) {
        assert (ldv2 != null);
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        return ((cdb)amf2).aAG().av();
    }

    private void a(dye dye2) {
        this.Vc();
    }

    private void a(gqj gqj2) {
        if (!gqj2.jns) {
            this.Vc();
            return;
        }
        this.Ts = gqj2.Ts;
        this.fR(this.duZ.DisplayName);
    }

    private void a(gpa gpa2) {
        assert (this.Ts.equals(gpa2.aO()));
        this.SA = gpa2.jot;
        this.arE();
    }

    private void a(gqm gqm2) {
        if (!gqm2.jpp) {
            this.Vc();
            return;
        }
        this.arD();
    }

    private void fR(String string) {
        assert (this.be != null);
        assert (this.Ts != null);
        gqg gqg2 = (gqg)this.MessageDelegator.h(11015, this.GUID, this.Ts);
        gqg2.jpg = false;
        gqg2.Xe = this.GUID;
        gqg2.Za = this.duZ.ResourceType;
        gqg2.bc = string;
        gqg2.jjc = this.be;
        gqg2.jph = new lgl();
        this.MessageDelegator.F(gqg2);
    }

    private void arD() {
        assert (this.Ts == null);
        gqi gqi2 = (gqi)this.MessageDelegator.h(11016, this.GUID, lcr.qAH);
        gqi2.jpm = 1;
        gqi2.jpn = this.GUID;
        gqi2.Xe = this.GUID;
        this.MessageDelegator.F(gqi2);
    }

    private void arE() {
        assert (this.Ts != null);
        gpb gpb2 = (gpb)this.MessageDelegator.h(11028, this.GUID, this.Ts);
        this.MessageDelegator.F(gpb2);
    }

    private void arF() {
        gql gql2 = (gql)this.MessageDelegator.h(11018, this.GUID, lcr.qAS);
        gql2.adA = this.GUID;
        gql2.adD = true;
        this.MessageDelegator.E(gql2);
    }

    private void B(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        gsk gsk2 = (gsk)this.MessageDelegator.h(11049, this.GUID, lcr.qAS);
        gsk2.ija = 4;
        gsk2.adA = ldv2;
        gsk2.Rr = ldv3;
        this.MessageDelegator.F(gsk2);
    }
}

