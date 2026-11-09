/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cov
 *  cph
 *  cug
 *  lcr
 */
public class bmj
extends bke {
    private fdr dvp = null;
    private cbx dvq = null;
    private int duR = 0;

    public bmj() {
        this.dsy = bkd.a.drX;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        int n2;
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9238) {
            this.Vc();
            return;
        }
        this.dvp = (fdr)fdo2;
        this.dvq = (cbx)this.MessageDelegator.d(this.dvp.akX);
        if (this.dvq == null) {
            if (this.dvp.bOs()) {
                this.a(this.dvp, false);
            }
            this.Vc();
            return;
        }
        System.out.println();
        this.duR = cug.uI((int)this.dvq.az());
        if (ResourceTree.isDescendant(this.dvq.az(), cug.fgH) && (n2 = this.dvq.jm().ap(13632)) > 0) {
            this.duR = n2;
        }
        if (this.duR <= 0) {
            if (this.dvp.bOs()) {
                this.a(this.dvp, false);
            }
            this.Vc();
            return;
        }
        if (!(this.dvq instanceof cph)) {
            if (this.dvp.bOs()) {
                this.a(this.dvp, false);
            }
            this.Vc();
            return;
        }
        cph cph2 = (cph)this.dvq;
        if (cph2 instanceof cpg) {
            cpg cpg2 = (cpg)cph2;
            ldv ldv2 = lcr.tQ((ldv)this.dvp.aZG);
            if (!cpg2.lo(ldv2)) {
                if (this.dvp.bOs()) {
                    this.a(this.dvp, false);
                }
                this.Vc();
                return;
            }
        } else if (cph2 instanceof cov) {
            cov cov2 = (cov)cph2;
            ldv ldv3 = lcr.tQ((ldv)this.dvp.aZG);
            if (!cov2.lo(ldv3)) {
                if (this.dvp.bOs()) {
                    this.a(this.dvp, false);
                }
                this.Vc();
                return;
            }
        } else if (!cph2.aXW()) {
            if (this.dvp.bOs()) {
                this.a(this.dvp, false);
            }
            this.Vc();
            return;
        }
        cph2.aXs();
        this.removeObject();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1044: {
                this.b((fuc)dxq2);
                break;
            }
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 11266: {
                this.a((gxy)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private ej[] arJ() {
        ej[] ejArray = new ej[2];
        ff ff2 = (ff)this.dvq.fi().ae(1360);
        if (ff2 != null) {
            ejArray[0] = ff2.fn();
        }
        et et2 = (et)this.dvq.fi().ae(352);
        if (et2 != null) {
            ejArray[1] = et2.fn();
            ejArray[1].setType(9472);
        }
        return ejArray;
    }

    private void a(fcs fcs2) {
        Object object;
        if (fcs2.bst <= 0) {
            return;
        }
        if (fcs2.iJq && fcs2.akX == null) {
            return;
        }
        if (!fcs2.iJq) {
            if (this.dvp.bOs()) {
                this.a(this.dvp, false);
            }
            this.Vc();
            return;
        }
        ldv ldv2 = fcs2.akX;
        bqs bqs2 = this.G(ldv2, this.duR);
        if (this.dvq instanceof cpg) {
            object = (cpg)this.dvq;
            if (object.AQ() != 0L) {
                bqs2.O(object.AQ());
            }
        } else if (this.dvq instanceof cov && (object = (cov)this.dvq).AQ() != 0L) {
            bqs2.O(object.AQ());
        }
        object = new brv();
        ((brv)object).dIY = bqs2;
        dnm dnm2 = new dnm();
        dnm2.gKR = this.MessageDelegator.bzv();
        dnm2.ec = this.GUID;
        dnm2.gKS = this.dvp.dXG;
        dnm2.gKT = this.dvp.dXG;
        dnm2.dAu = this.dvp.dAu;
        dnm2.aXQ = this.dvp.dAu;
        dnm2.gKU = new brv[]{object};
        dnm2.b(bqy.dGd);
        this.a(dnm2);
        gno gno2 = (gno)this.MessageDelegator.h(3595, this.GUID, lcr.qEl);
        gno2.Ri = lcr.tQ((ldv)this.dvp.aZG);
        gno2.diS = this.dvp.diS;
        gno2.ResourceType = this.dvq.az();
        this.MessageDelegator.F(gno2);
    }

    private void b(fuc fuc2) {
        if (!fuc2.iWF) {
            if (this.dvp.bOs()) {
                this.a(this.dvp, false);
            }
            this.Vc();
            return;
        }
        this.a(this.dvp.aZG, this.duR, this.arJ());
    }

    private void a(gxy gxy2) {
        if (gxy2.gKN == null) {
            this.Vc();
            return;
        }
        if (this.dvp.bOs()) {
            this.a(this.dvp, true);
        }
        if (gxy2.gKN.gKR != null) {
            this.MessageDelegator.oa(gxy2.gKN.gKR);
        }
        this.Vc();
    }

    private void removeObject() {
        assert (this.dvq != null);
        if (ResourceTree.isDescendant(this.dvq.az(), cug.fnD)) {
            gtt gtt2 = (gtt)this.MessageDelegator.h(17666, this.GUID, lcr.qBi);
            gtt2.jrF = this.dvq.getGUID();
            this.MessageDelegator.F(gtt2);
        } else if (ResourceTree.isDescendant(this.dvq.az(), cug.fgH)) {
            fsd fsd2 = (fsd)this.MessageDelegator.h(14594, this.GUID, lcr.qBn);
            fsd2.iVo = this.dvq.getGUID();
            this.MessageDelegator.F(fsd2);
        } else if (ResourceTree.isDescendant(this.dvq.az(), cug.fnO)) {
            ecp ecp2 = (ecp)this.MessageDelegator.h(3074, this.GUID, lcr.qBe);
            ecp2.auP = this.dvq.getGUID();
            this.MessageDelegator.F(ecp2);
        } else if (ResourceTree.isDescendant(this.dvq.az(), cug.fnQ)) {
            gis gis2 = (gis)this.MessageDelegator.h(34050, this.GUID, lcr.qBl);
            gis2.qo(this.dvq.getGUID());
            this.MessageDelegator.F(gis2);
        } else if (ResourceTree.isDescendant(this.dvq.az(), cug.fnP)) {
            fef fef2 = (fef)this.MessageDelegator.h(27907, this.GUID, lcr.qBj);
            fef2.pB(this.dvq.getGUID());
            this.MessageDelegator.F(fef2);
        } else {
            if (this.dvp.bOs()) {
                this.a(this.dvp, false);
            }
            this.Vc();
            return;
        }
    }

    private void a(ldv ldv2, int n, ej[] ejArray) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (ejArray != null);
        fcv fcv2 = (fcv)this.MessageDelegator.h(9243, this.GUID, ldv2.bFk());
        fcv2.dul = 8;
        fcv2.bst = bkd.dqP;
        fcv2.aZG = this.GUID;
        fcv2.akX = ldv2;
        fcv2.ResourceType = n;
        fcv2.DR = ejArray;
        this.MessageDelegator.F(fcv2);
    }
}

