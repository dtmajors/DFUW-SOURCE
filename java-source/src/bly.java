/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 *  cug
 *  ha
 *  lcr
 *  mcs
 */
public class bly
extends bke {
    private static final int duH = 1;
    private static final int duI = 2;
    private static final int duJ = 3;
    private static final int duK = 4;
    private static final int duL = 5;
    private static final int duM = 6;
    private static int[] duN = null;
    private fds duO = null;
    private fdc duP = null;
    private fmb duQ = null;
    private int duR = 0;
    private long duS = 0L;

    public bly() {
        this.dsy = bkd.a.dsj;
        duN = new int[5];
        bly.duN[0] = 1328;
        bly.duN[1] = 1360;
        bly.duN[2] = 9472;
        bly.duN[3] = 9488;
        bly.duN[4] = 9504;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        Object object;
        Object object2;
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9239) {
            this.Vc();
            return;
        }
        if (!fdo2.aZG.tV(this.GUID)) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        this.duO = (fds)fdo2;
        cdb cdb2 = (cdb)this.MessageDelegator.d(fdo2.aZG);
        assert (cdb2 != null);
        bqs bqs2 = cdb2.aJF().iK(this.duO.iKd);
        if (bqs2 == null) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        if (ResourceTree.isDescendant(bqs2.az(), cug.fqU)) {
            if (cdb2 instanceof cex) {
                cex cex2 = (cex)cdb2;
                if (!cex2.mp() && cex2.mA() != null) {
                    cex2.mA().jZ().d(this.duO.aZD, this.duO.iKe);
                }
            } else assert (false);
            this.Vc();
            return;
        }
        if (ResourceTree.isDescendant(bqs2.az(), cug.frU)) {
            cex cex3;
            if (cdb2 instanceof cex && !(cex3 = (cex)cdb2).mp() && cex3.mA() != null && cex3.mA().kf() != null) {
                cex3.mA().kf().dl(bqs2.az());
            }
            this.Vc();
            return;
        }
        if (bqs2.az() == cug.fnU) {
            this.Vc();
            return;
        }
        ti ti2 = lea.eol().get(bqs2.az());
        if (ti2 != null) {
            if (cdb2 instanceof cex) {
                cex cex4 = (cex)cdb2;
                if (!cex4.mp()) {
                    boolean bl2 = cug.vq((int)ti2.az());
                    ezc ezc2 = (ezc)this.MessageDelegator.h(26372, this.getGUID(), cex4.getGUID());
                    ezc2.aRX = bqs2.az();
                    ezc2.Position = bl2 ? this.duO.aZD : null;
                    ezc2.Rotation = bl2 ? this.duO.iKe : null;
                    cex4.mA().receiveMessage((dxq)ezc2);
                }
            } else assert (false);
            this.Vc();
            return;
        }
        if (ResourceTree.isDescendant(bqs2.az(), cug.frJ)) {
            cex cex5;
            if (cdb2 instanceof cex && !(cex5 = (cex)cdb2).mp() && cex5.mA() != null && cex5.mA().ka() != null) {
                cex5.mA().ka().dk(bqs2.az());
            }
            this.Vc();
            return;
        }
        if (ResourceTree.isDescendant(bqs2.az(), cug.fpU)) {
            if (cdb2 instanceof cex) {
                cex cex6 = (cex)cdb2;
                if (cex6.mA() != null && !cex6.mp()) {
                    cex6.mA().jL().cz(bqs2.az());
                }
            } else assert (false);
            this.Vc();
            return;
        }
        if (ResourceTree.isDescendant(bqs2.az(), cug.fqV)) {
            if (cdb2 instanceof cex) {
                cex cex7 = (cex)cdb2;
                if (cex7.mA() != null && !cex7.mp()) {
                    cex7.mA().jZ().c(bqs2.az(), this.duO.diS);
                }
            } else assert (false);
            this.Vc();
            return;
        }
        if (bqs2.az() == cug.fpQ) {
            if (cdb2 instanceof cex) {
                lef lef2 = cdb2.aJC().asf().auo().iX(bqs2.getGUID());
                if (lef2 != null) {
                    fmv fmv2 = (fmv)this.MessageDelegator.h(7940, this.GUID, cdb2.aJC().asf().getGUID());
                    fmv2.aCK = bqs2.getGUID();
                    fmv2.dIW = lef2;
                    fmv2.iQA = true;
                    fmv2.iQC = true;
                    fmv2.iQB = false;
                    fmv2.b(bqy.dHw);
                    cdb2.aJC().asf().receiveMessage((dxq)fmv2);
                } else {
                    this.Vc();
                }
            } else {
                assert (false);
                this.Vc();
            }
            return;
        }
        boolean bl3 = ResourceTree.isDescendant(bqs2.az(), cug.fnn);
        if (bl3 && cdb2 instanceof cex && (object2 = (cex)cdb2).aAG() != null && object2.aAG().azb() != null) {
            lmf lmf2;
            boolean bl4;
            object = object2.aAG().azb();
            boolean bl5 = bl4 = ((ljq)object).y <= -1000.0f;
            if (bl4) {
                int n2 = cug.uJ((int)bqs2.az());
                if (n2 == -1) {
                    n2 = cug.fox;
                }
                this.e(fdo2.aZG, mcs.uAC.bD(n2));
                if (fdo2.bOs()) {
                    this.a(fdo2, false);
                }
                this.Vc();
                return;
            }
            if (ResourceTree.isDescendant(bqs2.az(), cug.fnp) && (lmf2 = lea.eg((ljq)object)) != null && lmf2 == lmf.rEz) {
                int n3 = cug.uJ((int)bqs2.az());
                if (n3 == -1) {
                    n3 = cug.fox;
                }
                this.e(fdo2.aZG, mcs.uAD.bD(n3));
                if (fdo2.bOs()) {
                    this.a(fdo2, false);
                }
                this.Vc();
                return;
            }
        }
        if ((object2 = cdb2.aJC().asf().auo().iX(bqs2.getGUID())) == null) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        object = cdb2.aJC().asf().getGUID();
        if ((float)bqs2.vf() > 1.0f) {
            this.duQ = (fmb)this.MessageDelegator.h(7953, this.GUID, (ldv)object);
            this.duQ.aCK = this.duO.iKd;
            this.duQ.dIW = object2;
            this.duQ.iPI = 1;
            this.duQ.iPJ = false;
            this.duQ.b(ResourceTree.isDescendant(bqs2.az(), cug.fnn) ? bqy.dHz : bqy.dHw);
        } else {
            this.duP = (fdc)this.MessageDelegator.h(9232, this.GUID, this.dsz.getGUID());
            this.duP.bst = bkd.dqJ;
            this.duP.dul = 8;
            this.duP.aZG = this.GUID;
            this.duP.akX = this.duO.iKd;
            this.duP.iJM = cdb2.az();
            this.duP.aXQ = this.duP.dAu = cdb2.aJC().asf().getGUID();
            this.duP.aCK = this.duO.iKd;
            this.duP.dIW = object2;
            this.duP.b(ResourceTree.isDescendant(bqs2.az(), cug.fnn) ? bqy.dHz : bqy.dHw);
        }
        if (bl3) {
            this.duR = bqs2.az();
            this.duS = bqs2.AQ();
            this.la(bqs2.az());
        } else {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1037: {
                this.a((ftq)dxq2);
                break;
            }
            case 5634: {
                this.a((fup)dxq2);
                break;
            }
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 7941: {
                this.a((fmw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void setScheduledForRemoval() {
        if (this.duP != null && this.duP.dIW != null) {
            this.b(this.duP.dAu, this.duP.aCK, this.duP.dIW);
        }
        if (this.duQ != null && this.duQ.dIW != null) {
            this.b(this.duQ.amk(), this.duQ.aCK, this.duQ.dIW);
        }
    }

    private void la(int n) {
        assert (this.duO != null);
        assert (this.duO.aZD != null);
        assert (this.duO.iKe != null);
        if (ResourceTree.isDescendant(n, cug.fns)) {
            int[] nArray = new int[]{1360, 9472, 9568};
            this.b(this.duO.iKd, 5, nArray);
        } else if (ResourceTree.isDescendant(n, cug.fnv)) {
            int[] nArray = new int[]{1360, 9472, 9568};
            this.b(this.duO.iKd, 6, nArray);
        } else if (ResourceTree.isDescendant(n, cug.fnr)) {
            int[] nArray = new int[]{1360, 9472, 9568};
            this.b(this.duO.iKd, 4, nArray);
        } else if (ResourceTree.isDescendant(n, cug.fno)) {
            ljq ljq2 = this.oB();
            if (ljq2 != null && !lea.b(ljq2, lea.enW().getName(n))) {
                ha ha2 = this.hI(this.duO.aZG);
                if (ha2 != null) {
                    ha2.c(lzz.tZs.bD(lea.enW().getName(n).replace("r_Figurine ", "r_")));
                }
                if (this.duO.bOs()) {
                    this.a(this.duO, false);
                }
                this.Vc();
                return;
            }
            this.b(this.duO.iKd, 1, duN);
        } else if (ResourceTree.isDescendant(n, cug.fnp)) {
            this.b(this.duO.iKd, 2, ctj.ffY);
        } else if (ResourceTree.isDescendant(n, cug.fnq)) {
            int[] nArray = new int[]{1360, 9472, 9552};
            this.b(this.duO.iKd, 3, nArray);
        } else {
            if (this.duO.bOs()) {
                this.a(this.duO, false);
            }
            this.Vc();
        }
    }

    private ljq oB() {
        ha ha2 = this.hI(this.duO.aZG);
        if (ha2 == null) {
            return null;
        }
        if (ha2.jf() == null) {
            return null;
        }
        if (ha2.jf().aAG() == null) {
            return null;
        }
        if (ha2.jf().aAG().azb() == null) {
            return null;
        }
        return ha2.jf().aAG().azb();
    }

    private ej b(int n, ej[] ejArray) {
        assert (n > 0);
        assert (ejArray != null);
        int n2 = ejArray.length;
        for (int i = 0; i < n2; ++i) {
            if (ejArray[i] == null || ejArray[i].getType() != n) continue;
            return ejArray[i];
        }
        return null;
    }

    private int c(int n, ej[] ejArray) {
        ej ej2 = this.b(n, ejArray);
        if (ej2 == null) {
            return -1;
        }
        switch (n) {
            case 9488: {
                et et2 = (et)ej2;
                return (int)et2.fN();
            }
            case 9504: {
                ff ff2 = (ff)ej2;
                return ResourceTree.getType(ff2.getStringValue());
            }
            case 9536: {
                ff ff3 = (ff)ej2;
                return ResourceTree.getType(ff3.getStringValue());
            }
            case 9520: {
                ff ff4 = (ff)ej2;
                return ResourceTree.getType(ff4.getStringValue());
            }
            case 9552: {
                ff ff5 = (ff)ej2;
                return ResourceTree.getType(ff5.getStringValue());
            }
            case 9568: {
                ff ff6 = (ff)ej2;
                return ResourceTree.getType(ff6.getStringValue());
            }
        }
        return -1;
    }

    private float c(ej[] ejArray) {
        et et2 = (et)this.b(9472, ejArray);
        if (et2 == null) {
            return 0.0f;
        }
        return et2.fN();
    }

    private String d(ej[] ejArray) {
        ff ff2 = (ff)this.b(1360, ejArray);
        if (ff2 == null) {
            return null;
        }
        return ff2.getStringValue();
    }

    private void a(fcs fcs2) {
        if (fcs2.iJq && this.duP != null) {
            this.duP.dIW = null;
        }
        if (this.duO.bOs()) {
            this.a(this.duO, fcs2.iJq);
        }
        this.Vc();
    }

    public void a(fmw fmw2) {
        cex cex2;
        bqs bqs2;
        cdb cdb2 = (cdb)this.MessageDelegator.d(this.duO.aZG);
        if (cdb2 != null && cdb2 instanceof cex && fmw2.iQE.dIY instanceof bqs && (bqs2 = (bqs)fmw2.iQE.dIY).az() == cug.fpQ && (cex2 = (cex)cdb2).aMK() != null) {
            cex2.aMK().qF(bqs2.vf());
        }
    }

    private void a(fmo fmo2) {
        if (fmo2.ilu == 7) {
            if (fmo2.eo) {
                // empty if block
            }
            if (this.duO.bOs()) {
                this.a(this.duO, fmo2.eo);
            }
        } else if (fmo2.ilu == 2 && this.duO.bOs()) {
            this.a(this.duO, fmo2.eo);
        }
        this.Vc();
    }

    private void a(ftq ftq2) {
        assert (this.duP != null || this.duQ != null);
        if (ftq2.Rs == null) {
            this.Vc();
            return;
        }
        if (ftq2.iWb) {
            Object object;
            if (this.duP != null) {
                this.MessageDelegator.H(this.duP);
            } else {
                this.MessageDelegator.H(this.duQ);
            }
            gnn gnn2 = (gnn)this.MessageDelegator.h(3594, this.GUID, lcr.qEl);
            gnn2.Ri = lcr.tQ((ldv)this.duO.aZG);
            gnn2.diS = this.duO.diS;
            gnn2.duR = this.duR;
            this.MessageDelegator.F(gnn2);
            if (lea.enW().isDescendant(this.duR, cug.fnq)) {
                object = (dxy)this.MessageDelegator.h(35587, this.GUID, this.duO.aZG);
                ((dxy)object).Da(cfv.SPAWN_MOUNT.ordinal());
                this.MessageDelegator.E((dxq)object);
            }
            if ((object = this.hI(this.duO.aZG)) != null) {
                fth fth2 = (fth)this.MessageDelegator.h(30218, this.getGUID(), object.getGUID());
                fth2.Position = this.duO.diS;
                fth2.ResourceType = this.duR;
                this.MessageDelegator.I(fth2);
            }
        } else {
            if (this.duO.bOs()) {
                this.a(this.duO, false);
            }
            this.Vc();
        }
    }

    private void a(fup fup2) {
        switch (fup2.aVk()) {
            case 1: {
                ej[] ejArray = fup2.DR;
                if (ejArray == null) {
                    this.Vc();
                    return;
                }
                String string = this.d(ejArray);
                int n = this.c(9504, ejArray);
                int n2 = this.c(9488, ejArray);
                float f2 = this.c(ejArray);
                boolean bl2 = true;
                if (string == null) {
                    bl2 = false;
                } else if (n <= 0) {
                    bl2 = false;
                } else if (n2 < 0) {
                    bl2 = false;
                } else if (f2 < 0.0f) {
                    bl2 = false;
                }
                if (!bl2) {
                    if (this.duO.bOs()) {
                        this.a(this.duO, false);
                    }
                    this.Vc();
                    return;
                }
                ecd ecd2 = (ecd)this.MessageDelegator.h(3073, this.GUID, lcr.qBe);
                ecd2.ResourceType = n;
                ecd2.dpl = n2;
                ecd2.Position = this.duO.aZD;
                ecd2.Rotation = this.duO.iKe;
                ecd2.aGB = string;
                ecd2.aGr = f2;
                ecd2.eTp = lcr.tQ((ldv)this.getGUID());
                ecd2.aXU = this.duS;
                this.MessageDelegator.F(ecd2);
                break;
            }
            case 2: {
                ej[] ejArray = fup2.DR;
                if (ejArray == null) {
                    this.Vc();
                    return;
                }
                String string = this.d(ejArray);
                int n = this.c(9536, ejArray);
                int n3 = this.c(9520, ejArray);
                float f3 = this.c(ejArray);
                boolean bl3 = true;
                if (string == null) {
                    bl3 = false;
                } else if (n <= 0) {
                    bl3 = false;
                } else if (n3 <= 0) {
                    bl3 = false;
                } else if (f3 < 0.0f) {
                    bl3 = false;
                }
                if (!bl3) {
                    if (this.duO.bOs()) {
                        this.a(this.duO, false);
                    }
                    this.Vc();
                    return;
                }
                ffy ffy2 = (ffy)this.MessageDelegator.h(8449, this.GUID, lcr.qBg);
                ffy2.l(n);
                ffy2.GB(n3);
                ffy2.c(this.duO.aZD);
                ffy2.a(this.duO.iKe);
                ffy2.eV(true);
                ffy2.la(true);
                ffy2.oF(null);
                ffy2.jS(false);
                ffy2.aGB = string;
                ffy2.aGr = f3;
                ffy2.aXU = this.duS;
                this.MessageDelegator.F(ffy2);
                break;
            }
            case 3: {
                ej[] ejArray = fup2.DR;
                if (ejArray == null) {
                    this.Vc();
                    return;
                }
                String string = this.d(ejArray);
                int n = this.c(9552, ejArray);
                float f4 = this.c(ejArray);
                cex cex2 = (cex)this.MessageDelegator.d(this.duO.aZG);
                int n4 = cex2.aMS().a(ain.bnr);
                if (n4 != -1) {
                    n = n4;
                }
                String string2 = ResourceTree.getName(n);
                boolean bl4 = true;
                if (string == null) {
                    bl4 = false;
                } else if (n <= 0) {
                    bl4 = false;
                } else if (!ResourceTree.k(n, cug.fgH, false)) {
                    bl4 = false;
                } else if (f4 < 0.0f) {
                    bl4 = false;
                } else if ((float)this.duR < 0.0f) {
                    bl4 = false;
                }
                if (!bl4) {
                    if (this.duO.bOs()) {
                        this.a(this.duO, false);
                    }
                    this.Vc();
                    return;
                }
                fsa fsa2 = (fsa)this.MessageDelegator.h(14593, this.GUID, lcr.qBn);
                fsa2.ResourceType = n;
                fsa2.duR = this.duR;
                fsa2.Position = this.duO.aZD;
                fsa2.Rotation = this.duO.iKe;
                fsa2.aGB = string;
                fsa2.aGr = f4;
                fsa2.eTp = lcr.tQ((ldv)this.getGUID());
                fsa2.aXU = this.duS;
                this.MessageDelegator.F(fsa2);
                break;
            }
            case 4: {
                ej[] ejArray = fup2.DR;
                if (ejArray == null) {
                    this.Vc();
                    return;
                }
                String string = this.d(ejArray);
                int n = this.c(9568, ejArray);
                float f5 = this.c(ejArray);
                boolean bl5 = true;
                if (string == null) {
                    bl5 = false;
                } else if (n <= 0) {
                    bl5 = false;
                } else if (f5 < 0.0f) {
                    bl5 = false;
                }
                if (!bl5) {
                    if (this.duO.bOs()) {
                        this.a(this.duO, false);
                    }
                    this.Vc();
                    return;
                }
                gtq gtq2 = (gtq)this.MessageDelegator.h(17665, this.GUID, lcr.qBi);
                gtq2.ResourceType = n;
                gtq2.Position = this.duO.aZD;
                gtq2.Rotation = this.duO.iKe;
                gtq2.aGB = string;
                gtq2.aGr = f5;
                gtq2.eTp = lcr.tQ((ldv)this.getGUID());
                gtq2.aXU = this.duS;
                this.MessageDelegator.F(gtq2);
                break;
            }
            case 5: {
                int n = this.c(9568, fup2.DR);
                dzb dzb2 = (dzb)this.MessageDelegator.h(33793, this.GUID, lcr.qBj);
                dzb2.ResourceType = n;
                String string = this.d(fup2.DR);
                float f6 = this.c(fup2.DR);
                dzb2.Position = this.duO.aZD;
                dzb2.Rotation = this.duO.iKe;
                dzb2.aGB = string;
                dzb2.aGr = f6;
                dzb2.eTp = lcr.tQ((ldv)this.getGUID());
                this.MessageDelegator.F(dzb2);
                break;
            }
            case 6: {
                int n = this.c(9568, fup2.DR);
                gip gip2 = (gip)this.MessageDelegator.h(34049, this.GUID, lcr.qBl);
                gip2.ResourceType = n;
                String string = this.d(fup2.DR);
                float f7 = this.c(fup2.DR);
                gip2.Position = this.duO.aZD;
                gip2.Rotation = this.duO.iKe;
                gip2.aGB = string;
                gip2.aGr = f7;
                gip2.eTp = lcr.tQ((ldv)this.getGUID());
                this.MessageDelegator.F(gip2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void b(ldv ldv2, ldv ldv3, lef lef2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (lef2 != null);
        flw flw2 = (flw)this.MessageDelegator.h(7952, this.GUID, ldv2);
        flw2.iPs = new ldv[]{ldv3};
        flw2.dJh = new lef[]{lef2};
        this.MessageDelegator.F(flw2);
    }
}

