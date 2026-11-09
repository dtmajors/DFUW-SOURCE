/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class bcn
extends btk {
    private static final int cWA = 20;
    private ayd cCy = null;
    private azn cwP = null;
    private Set<ldv> cWB = lcn.emx();
    private Map<Integer, bbr> cWC = lcn.emw();
    private Map<Integer, bbr> cWD = lcn.emw();
    private int Qs = 0;
    private Map<Integer, lfs<bbr, ldv>> cWE = lcn.emw();
    private Map<ldv, bcm> cWF = lcn.emw();

    public boolean ZR() {
        return this.cWC.isEmpty() && this.cWC.isEmpty() && this.cWD.isEmpty() && this.cWE.isEmpty() && this.cWF.isEmpty();
    }

    public boolean ew(ldv ldv2) {
        return ldv2 == null ? false : this.cWB.contains(ldv2);
    }

    public ldv[] aaj() {
        return this.cWB.toArray(new ldv[this.cWB.size()]);
    }

    public bcm[] aak() {
        return this.cWF.values().toArray(new bcm[this.cWF.size()]);
    }

    public bcm gJ(ldv ldv2) {
        return this.cWF.get(ldv2);
    }

    public int alf() {
        return this.cWF.size();
    }

    public int alg() {
        return 20;
    }

    public bcn(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
    }

    public void c(nm nm2) {
        if (!this.cWB.isEmpty()) {
            nm2.aDy.aDU = new int[this.cWB.size()];
            int n = 0;
            for (ldv ldv2 : this.cWB) {
                nm2.aDy.aDU[n++] = ldv2.enw();
            }
        }
    }

    public void a(nm nm2) {
        if (nm2.aDy.aDU != null) {
            for (int n : nm2.aDy.aDU) {
                ldv ldv2 = lcr.abW((int)n);
                this.cWB.add(ldv2);
                this.y(ldv2, -1);
            }
        }
    }

    public void a(bbr bbr2) {
        if (!this.cWB.contains(bbr2.abB())) {
            return;
        }
        this.u(bbr2.abB(), false);
        bcm bcm2 = this.cWF.remove(bbr2.abB());
        if (bcm2 != null) {
            this.cwP.a(1545, bcm2);
        }
        this.cCy.i(mbn.uko.bD(bbr2.akp()));
    }

    private void gK(ldv ldv2) {
        this.cWB.add(ldv2);
        this.cCy.dH(ldv2);
        this.cCy.b(mbn.ukj.bD(this.cCy.iV()), ldv2);
    }

    private void u(ldv ldv2, boolean bl) {
        this.cWB.remove(ldv2);
        this.cCy.dI(ldv2);
        if (bl) {
            this.cCy.b(mbn.ukn.bD(this.cCy.iV()), ldv2);
        }
    }

    private void c(bbr bbr2, ldv ldv2) {
        this.y(ldv2, this.Qs);
        this.cWC.put(this.Qs, bbr2);
        ++this.Qs;
        this.gK(ldv2);
    }

    private void d(bbr bbr2, ldv ldv2) {
        this.y(ldv2, this.Qs);
        this.cWD.put(this.Qs, bbr2);
        ++this.Qs;
        this.u(ldv2, true);
        bcm bcm2 = this.cWF.remove(ldv2);
        if (bcm2 != null) {
            this.cwP.a(1545, bcm2);
        }
    }

    private void a(bbr bbr2, ldv ldv2, ldv ldv3) {
        if (this.cCy.dQ(ldv2)) {
            bbr bbr3 = this.cCy.dR(ldv2);
            azb azb2 = this.cCy.eb(ldv3);
            this.cCy.i(mbn.ukp.bD(new Object[]{bbr2.abP(), bbr2.akp(), bbr3.abP(), bbr3.akp(), azb2.Xz(), azb2.Xt()}));
            this.cCy.b(mbn.uks.bD(new Object[]{bbr2.abP(), bbr2.akp(), azb2.Xz(), azb2.Xt()}), ldv2);
        } else {
            this.y(ldv2, this.Qs);
            this.cWE.put(this.Qs, new lfs<bbr, ldv>(bbr2, ldv3));
            ++this.Qs;
        }
    }

    public void b(ldv ldv2, ldv[] ldvArray) {
        if (ldv2 == null || ldvArray == null || ldvArray.length == 0) {
            return;
        }
        for (int i = 0; i < ldvArray.length; ++i) {
            eii eii2 = (eii)this.MessageDelegator.h(18705, this.cCy.getGUID(), ldv2);
            eii2.irn = ldvArray[i];
            eii2.ilb = ccf.elu.ordinal();
            eii2.hz = false;
            this.MessageDelegator.F(eii2);
        }
    }

    public lfs<bco, ldv> d(bbr bbr2, ldv[] ldvArray) {
        lfs<bco, ldv> lfs2 = new lfs<bco, ldv>();
        if (ldvArray == null || ldvArray.length == 0) {
            lfs2.reX = bco.cWY;
            return lfs2;
        }
        if (bbr2 == null) {
            lfs2.reX = bco.cWI;
            return lfs2;
        }
        if (!bbr2.b(bca.cUo)) {
            lfs2.reX = bco.cWK;
            return lfs2;
        }
        for (ldv ldv2 : ldvArray) {
            if (this.cWB.contains(ldv2)) continue;
            lfs2.reX = bco.cWS;
            lfs2.reY = ldv2;
            return lfs2;
        }
        lfs2.reX = bco.cWY;
        return lfs2;
    }

    public lfs<bco, ldv> b(bbr bbr2, ldv[] ldvArray, int n, ldv[] ldvArray2) {
        lfs<bco, ldv> lfs2 = new lfs<bco, ldv>();
        if (ldvArray == null || ldvArray.length == 0) {
            lfs2.reX = bco.cWY;
            return lfs2;
        }
        if (bbr2 == null) {
            lfs2.reX = bco.cWI;
            return lfs2;
        }
        if (!bbr2.b(bca.cUo)) {
            lfs2.reX = bco.cWK;
            return lfs2;
        }
        if (this.cWB.size() - n + ldvArray.length > 20) {
            lfs2.reX = bco.cWN;
            return lfs2;
        }
        for (ldv ldv2 : ldvArray) {
            if (this.cWB.contains(ldv2)) {
                lfs2.reX = bco.cWP;
                lfs2.reY = ldv2;
                return lfs2;
            }
            boolean bl = false;
            if (ldvArray2 != null) {
                for (int i = 0; i < ldvArray2.length; ++i) {
                    if (!ldvArray2[i].equals(ldv2)) continue;
                    bl = true;
                    break;
                }
            }
            if (this.cCy.ep(ldv2) && !bl) {
                lfs2.reX = bco.cWU;
                lfs2.reY = ldv2;
                return lfs2;
            }
            if (!this.cCy.dQ(ldv2)) continue;
            lfs2.reX = bco.cWX;
            lfs2.reY = ldv2;
            return lfs2;
        }
        lfs2.reX = bco.cWY;
        return lfs2;
    }

    public void b(bbr bbr2, ldv[] ldvArray, ldv[] ldvArray2, ldv[] ldvArray3) {
        lfs<bco, ldv> lfs2 = this.d(bbr2, ldvArray2);
        lfs<bco, ldv> lfs3 = this.b(bbr2, ldvArray, ldvArray2 == null ? 0 : ldvArray2.length, ldvArray3);
        if (lfs2.reX != bco.cWY || lfs3.reX != bco.cWY) {
            lfn.b(5, this.getClass().getSimpleName(), "performAllowedToBindListUpdate() : Cannot Perform Update... Caller Should Call 'canX' Methods, Synchronously, First!!!... AddResult = " + lfs3.reX + ", RemoveResult = " + lfs2.reX);
            assert (false);
            return;
        }
        if (ldvArray2 != null) {
            for (ldv object : ldvArray2) {
                this.d(bbr2, object);
            }
        }
        if (ldvArray != null) {
            for (ldv ldv2 : ldvArray) {
                this.c(bbr2, ldv2);
            }
        }
        for (ldv ldv2 : this.cCy.YM()) {
            eik eik2 = (eik)this.MessageDelegator.h(18732, this.cCy.getGUID(), ldv2);
            eik2.n(this.aaj());
            this.MessageDelegator.F(eik2);
        }
    }

    private void y(ldv ldv2, int n) {
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
        eef2.sk(n);
        eef2.jM(false);
        this.MessageDelegator.F(eef2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eeg eeg2) {
        bbr bbr2 = this.cWC.remove(eeg2.aVk());
        if (bbr2 != null) {
            bcm bcm2 = new bcm(eeg2.aO(), eeg2.iP() + " " + eeg2.iR(), eeg2.js(), eeg2.jt());
            this.cWF.put(eeg2.aO(), bcm2);
            if (eeg2.iV() == null) {
                this.cCy.i(mbn.ukh.bD(new Object[]{bbr2.abP(), bbr2.akp(), cg.c(eeg2.iP(), eeg2.iR())}));
            } else {
                this.cCy.i(mbn.ukg.bD(new Object[]{bbr2.abP(), bbr2.akp(), eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV()}));
            }
            this.cCy.b(mbn.uki.bD(new Object[]{bbr2.abP(), bbr2.akp(), this.cCy.iV()}), eeg2.aO());
            this.cwP.a(1544, bcm2);
            return;
        }
        bbr2 = this.cWD.remove(eeg2.aVk());
        if (bbr2 != null) {
            bcm bcm3 = this.cWF.remove(eeg2.aO());
            if (eeg2.iV() == null) {
                this.cCy.i(mbn.ukl.bD(new Object[]{bbr2.abP(), bbr2.akp(), cg.c(eeg2.iP(), eeg2.iR())}));
            } else {
                this.cCy.i(mbn.ukk.bD(new Object[]{bbr2.abP(), bbr2.akp(), eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV()}));
            }
            this.cCy.b(mbn.ukm.bD(new Object[]{this.cCy.iV(), bbr2.abP(), bbr2.akp()}), eeg2.aO());
            if (bcm3 != null) {
                this.cwP.a(1545, bcm3);
            }
            return;
        }
        lfs<bbr, ldv> lfs2 = this.cWE.remove(eeg2.aVk());
        if (lfs2 != null) {
            bbr2 = (bbr)lfs2.reX;
            azb azb2 = this.cCy.eb((ldv)lfs2.reY);
            if (eeg2.iV() == null) {
                this.cCy.i(mbn.ukr.bD(new Object[]{bbr2.abP(), bbr2.akp(), cg.c(eeg2.iP(), eeg2.iR()), azb2.Xz(), azb2.Xt()}));
            } else {
                this.cCy.i(mbn.ukq.bD(new Object[]{bbr2.abP(), bbr2.akp(), eeg2.kE(), cg.c(eeg2.iP(), eeg2.iR()), eeg2.iV(), azb2.Xz(), azb2.Xt()}));
            }
            this.cCy.b(mbn.ukt.bD(new Object[]{bbr2.abP(), bbr2.akp(), azb2.Xz(), azb2.Xt(), this.cCy.iV()}), eeg2.aO());
            return;
        }
        if (this.ew(eeg2.aO()) && !this.cWF.containsKey(eeg2.aO())) {
            this.cWF.put(eeg2.aO(), new bcm(eeg2.aO(), eeg2.iP() + " " + eeg2.iR(), eeg2.js(), eeg2.jt()));
        }
    }
}

