/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 *  lcw
 */
import java.util.Map;

public class cod
extends coa
implements bto {
    private bfu elg = null;
    private btn eHi = null;
    private cbq elf = null;
    private bwa eld = null;
    private double eHk = -2.0;
    private double ePd = 0.0;
    private int bRy = -1;
    private float ePe = 1.0f;
    private final Map<ldv, lfs<ljq, Float>> ePf = lcn.emw();
    private float Radius = 1.0f;
    private boolean bRs;
    private float bRu = 1.0f;
    private coc[] ePg;
    private ldv bBE;
    private ldv Ud;
    private dmv ePh;

    public cod() {
        super(true);
        this.elg = new bfu(this);
    }

    public final bfq aIv() {
        return this.elg;
    }

    public void b(cbq cbq2) {
        this.elf = cbq2;
    }

    public void c(cbq cbq2) {
        this.elf = null;
    }

    public void cleanUp() {
        super.cleanUp();
        this.HR();
        this.ePf.clear();
        if (this.eld != null) {
            this.eld.cleanUp();
        }
        this.eld = null;
    }

    public void c(btn btn2) {
        this.eHi = btn2;
    }

    public void aSt() {
        this.eHi = null;
    }

    public void eD(float f2) {
        this.bRu = f2;
    }

    public void hG(String string) {
        this.bRy = del.dr(string);
    }

    public void sh(int n) {
        this.bRy = n;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    public void Hy() {
        this.aIw();
        assert (this.ePg != null);
        for (coc coc2 : this.ePg) {
            ldi ldi2 = (ldi)lea.enT().acv(coc2.CD());
            assert (ldi2 != null);
            lce[] lceArray = ldi2.enl();
            if (lceArray != null && lceArray.length > 0) {
                lce lce2 = lceArray[0];
                int n = lce2.bnM;
                coc2.sg(n == 352 || n == 400 || n == 384 ? 1 : 3);
                continue;
            }
            coc2.sg(3);
        }
        this.HN();
    }

    public void receiveMessage(dxq dxq2) {
        if (this.eHi != null && this.eHi.a(dxq2, (btk)((Object)this))) {
            return;
        }
        switch (dxq2.bEz()) {
            case 1038: {
                this.a((fuj)dxq2);
                break;
            }
            case 20483: {
                this.a((fsj)dxq2);
                break;
            }
        }
        super.receiveMessage(dxq2);
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.getResult() != 0) {
            return;
        }
        switch (ktv2.egT()) {
            case 532: {
                this.a((kws)ktv2);
                break;
            }
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void a(kwr kwr2) {
        if (this.bBE != null && this.bBE.equals(kwr2.ev)) {
            this.Ud = kwr2.dJs;
        }
    }

    private void a(kws kws2) {
        ljq[] ljqArray = kws2.qfS;
        ldv[] ldvArray = kws2.qfR;
        ldv[] ldvArray2 = kws2.qfT;
        int[] nArray = kws2.qfc;
        if (ldvArray2 != null && ldvArray2.length > 0) {
            for (ldv ldv2 : ldvArray2) {
                if (lcw.enb() && ldv2.ib() != 3) continue;
                this.ePf.remove(ldv2);
            }
        }
        if (ldvArray == null || ldvArray.length == 0) {
            return;
        }
        for (int i = 0; i < ldvArray.length; ++i) {
            int n = nArray[i];
            if (n <= 0) continue;
            ldv ldv3 = ldvArray[i];
            if (lcw.enb() && ldv3.ib() != 3 || this.ePf.containsKey(ldv3) || !lea.enW().isDescendant(n, cug.fgE) || lea.enW().isDescendant(n, cug.fgG) && !this.bRs) continue;
            this.ePf.put(ldv3, new lfs<ljq, Float>(ljqArray[i], Float.valueOf((float)this.MessageDelegator.arc().rgz)));
        }
    }

    private void a(fsj fsj2) {
        if (fsj2.dTY == null) {
            lfn.b(5, "SFGenericPhysicalObjectServer", "handleMovementObjectMessage() PositionalData is null.");
            return;
        }
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (this.aAG() == null) {
            lfn.b(5, "SFGenericPhysicalObjectServer", "handleMovementObjectMessage() MeshObject is null.");
            return;
        }
        this.g(fsj2.dTY);
        ljq ljq2 = fsj2.dTY.eqI();
        lgl lgl2 = fsj2.dTY.eqK();
        this.aAG().g(ljq2, lgl2);
    }

    private void a(fuj fuj2) {
        if (this.aAG() == null) {
            return;
        }
        if (this.eld == null) {
            this.eld = new bwa();
            this.eld.setServerObject(true);
            this.eld.eL(false);
            this.eld.d(this.aAG());
            this.eld.setMessageDelegator(this.MessageDelegator);
        }
        this.eld.bf(fuj2.eKm);
        this.eld.bc(fuj2.gon);
        this.eld.l(fuj2.iWX);
        this.eld.bd(fuj2.goo);
        this.eld.m(fuj2.iWY);
        this.eld.o(fuj2.oV);
        this.eld.initialize();
        fuj fuj3 = (fuj)this.MessageDelegator.h(1038, this.getGUID(), this.getGUID());
        fuj3.gon = fuj2.gon;
        fuj3.goo = fuj2.goo;
        fuj3.iWX = fuj2.iWX;
        fuj3.iWY = fuj2.iWY;
        fuj3.eKm = fuj2.eKm;
        fuj3.oV = fuj2.oV;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)(fuj2.oV + fuj2.eKm);
        gqu2.iXB = fuj3;
        this.MessageDelegator.F(gqu2);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
        if (this.eld != null) {
            this.eld.doTick(ldz2);
        }
        if (this.eHk > 0.0) {
            this.eHk -= ldz2.qwh;
            if (this.eHk < 0.0) {
                this.eHk = 0.0;
            }
        }
        if (this.eHk <= 0.0) {
            return;
        }
        double d2 = ldz2.rgz;
        if (this.bRy != -1 && d2 > this.ePd && !this.ePf.isEmpty()) {
            this.ePd = d2 + (double)this.ePe;
            asp.a(this.bRy, this.aAG().av(), this.GUID, this.MessageDelegator);
        }
        if (!this.ePf.isEmpty()) {
            for (Map.Entry<ldv, lfs<ljq, Float>> entry : this.ePf.entrySet()) {
                lfs<ljq, Float> lfs2 = entry.getValue();
                if (!(d2 > (double)((Float)lfs2.reY).floatValue())) continue;
                lfs2.reY = Float.valueOf((float)d2 + this.bRu);
                for (coc coc2 : this.ePg) {
                    this.a(coc2, entry.getKey(), (ljq)entry.getValue().reX);
                }
                this.ePf.put(entry.getKey(), lfs2);
            }
        }
    }

    public float aUU() {
        return this.ePe;
    }

    public void eE(float f2) {
        this.ePe = f2;
    }

    public void f(et et2) {
        if (this.elf != null && !this.elf.b(this, et2)) {
            return;
        }
        if (et2.getType() == 352) {
            bfl bfl2 = (bfl)this.elg.aof();
            if (bfl2 != null) {
                this.elg.a(5, bfl2);
            }
            if (this.elf != null) {
                this.elf.b(this);
            }
            if (this.ePh != null) {
                this.ePh.nt(this.GUID);
            }
        }
        super.f(et2);
    }

    public void d(et et2, float f2) {
        super.d(et2, f2);
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
    }

    public void hC(String string) {
        ej ej2 = this.jm().ae(10432);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ff)) {
            return;
        }
        if (string == null) {
            string = "";
        }
        ff ff2 = (ff)ej2;
        ff2.av(string);
    }

    public final double aRq() {
        return this.eHk;
    }

    public final void bu(double d2) {
        this.eHk = d2;
    }

    public final boolean aRr() {
        return this.eHk > -2.0;
    }

    private void HR() {
        if (this.Ud != null) {
            kov kov2 = (kov)this.MessageDelegator.h(535);
            kov2.wD(false);
            kov2.ts(this.GUID);
            kov2.sy(this.Ud);
            this.MessageDelegator.a(kov2);
            this.Ud = null;
        }
    }

    private void HN() {
        if (this.Ud == null) {
            kou kou2 = (kou)this.MessageDelegator.h(534);
            kou2.pTa = true;
            kou2.pUN = true;
            kou2.pUO = false;
            kou2.ec = this.GUID;
            kou2.iBr = true;
            kou2.dsK = true;
            kou2.Ud = ldv.rfe;
            kou2.pUL = 0;
            kou2.pUM = this.Radius;
            kou2.pUP = 786624;
            kou2.pTs = this.aAG().av();
            this.bBE = kou2.GUID;
            this.MessageDelegator.a(kou2);
        }
    }

    private void a(coc coc2, ldv ldv2, ljq ljq2) {
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        if (coc2.aUQ() > 0.0) {
            fcw2.gpI = coc2.aUQ();
            fcw2.eKm = coc2.aUQ();
            fcw2.bsE = coc2.aUT() == 1 ? 5 : 4;
        } else {
            fcw2.gpI = -3.0;
            fcw2.eKm = -3.0;
            fcw2.bsE = coc2.aUT() == 1 ? 1 : 0;
        }
        fcw2.bst = bkd.dqy;
        fcw2.aZG = this.GUID;
        fcw2.akX = new ldv(lcr.abP((int)ldv2.enw()), ldv2.enw(), ldv2.enx());
        fcw2.aYF = this.GUID;
        fcw2.bsG = this.az();
        fcw2.aYC = cxd.fJU;
        fcw2.Magnitude = coc2.uO();
        fcw2.aYH = 1;
        fcw2.aYG = coc2.CD();
        fcw2.bRD = coc2.aUT();
        fcw2.aZH = ljq2;
        fcw2.a(cxd.f.fQW);
        this.MessageDelegator.F(fcw2);
    }

    public void a(coc[] cocArray) {
        this.ePg = cocArray;
    }

    public void a(dmv dmv2) {
        this.ePh = dmv2;
    }
}

