/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cex
 *  cxd
 *  cxg
 *  ha
 *  lcr
 */
public class bll
extends bke
implements bto {
    private fcw dtR = null;
    private boolean dua = false;
    private int dub = 0;
    private boolean duc = false;
    private float bpU = -1.0f;
    private loz dud = null;
    private int due = -1;
    private ldv aUa = null;
    private int duf = -1;
    private a dug = null;
    private ldv duh = null;
    private ldv cCH = null;
    private String YM = null;
    private bbs dui = bbs.NoRank;
    private ldv duj = null;
    private int duk = 0;

    public bll() {
        this.dsy = bkd.a.dst;
    }

    private void arz() {
        if (this.aUa != null) {
            this.cx(this.aUa);
        }
        if (this.duh != null) {
            this.hR(this.duh);
        }
        this.dua = false;
        this.arB();
        this.a(this.dtR, false);
        this.Vc();
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : Message is null!!!");
            this.dua = true;
            return;
        }
        if (fdo2.bEz() != 9227) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : Message is not a SFFunctionEffectMessage!!!");
            this.dua = true;
            return;
        }
        this.dtR = (fcw)fdo2;
        if (this.dtR.aZG == null) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : SourceObjectGUID is null!!!");
            this.dua = true;
            return;
        }
        ha ha2 = this.hI(this.dtR.akX);
        if (ha2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : PSO is null!!!");
            this.dua = true;
            return;
        }
        cex cex2 = ha2.jf();
        if (cex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : PlayerObject is null!!!");
            this.dua = true;
            return;
        }
        if (cex2.aJF() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : PlayerObject.getInventoryPlayer() is null!!!");
            this.dua = true;
            return;
        }
        if (cex2.aJF().avx() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : PlayerObject.getInventoryPlayer().getAttachedWeapon() is null!!!");
            this.dua = true;
            return;
        }
        bqs bqs2 = cex2.aJF().avx();
        this.due = del.zW(bqs2.az());
        cxc cxc2 = cex2.jk().ht(this.dtR.aYC);
        if (cxc2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "doFunction() : PlayerObject.getSkillManagerServer().getSkill(FunctionMessage.CauseSkillType) is null!!!");
            this.dua = true;
            return;
        }
        this.duf = cxd.xV((int)cxc2.zg());
        if (this.duf >= 0) {
            this.dug = new a(this, ha2, cex2, cxc2);
        }
        double d2 = 1.0;
        if (this.dtR.aYC == cxd.fHn) {
            d2 = cxg.d((cxc)cxc2, (int)2075);
        }
        this.cCH = ha2.iG();
        this.YM = ha2.iV();
        this.dui = ha2.kE();
        this.duj = ha2.jM();
        this.duk = ha2.jN();
        this.a(this.dtR.aZG, cex2.getGUID(), ha2.getGUID(), ha2.iU(), this.cCH, this.YM, this.dui, this.duj, this.duk, this.dtR.aYC, bqs2.az(), d2);
        ++this.dub;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dua) {
            if (this.dub > 0) {
                lfn.b(5, this.getClass().getSimpleName(), "doTick() : There are pending operations for FUNCTION OBJECT " + this.GUID.fk() + ", System will wait until everything is been setup correctly!!!");
                return;
            }
            this.arz();
            return;
        }
        if (!this.duc) {
            return;
        }
        ha ha2 = this.hI(this.dtR.akX);
        if (ha2 == null) {
            this.dua = true;
            return;
        }
        cex cex2 = ha2.jf();
        if (cex2 == null) {
            this.dua = true;
            return;
        }
        if (cex2.aJD() == null) {
            this.dua = true;
            return;
        }
        if (cex2.aJD().aEP() == null) {
            this.dua = true;
            return;
        }
        if (!cex2.aJD().aEP().isAlive()) {
            this.dua = true;
            return;
        }
        if (!ldv.au(this.cCH, ha2.iG()) || this.dui != ha2.kE()) {
            this.cCH = ha2.iG();
            this.YM = ha2.iV();
            this.dui = ha2.kE();
            this.hS(this.dtR.aZG);
        }
        if (!ldv.au(this.duj, ha2.jM()) || this.duk != ha2.jN()) {
            this.duj = ha2.jM();
            this.duk = ha2.jN();
            this.hT(this.dtR.aZG);
        }
        if (this.bpU <= 0.0f) {
            return;
        }
        if (cex2.aAG() == null) {
            this.dua = true;
            return;
        }
        float f2 = Math.abs(ha2.jf().aAG().av().ez(this.dtR.aZH));
        if (f2 > this.bpU) {
            if (this.dud != null) {
                this.e(this.dtR.akX, this.dud);
            }
            this.dua = true;
        }
    }

    private void arA() {
        this.duc = true;
        if (this.due >= 0) {
            ha ha2 = this.hI(this.dtR.akX);
            if (ha2 == null) {
                this.dua = true;
                return;
            }
            cex cex2 = ha2.jf();
            if (cex2 == null) {
                this.dua = true;
                return;
            }
            this.a(this.due, cex2.aAG().axa(), cex2.aAG().av());
        }
        if (this.dug != null) {
            this.a(this.MessageDelegator.getGUID(), this.dug);
        }
    }

    private void arB() {
        if (!this.duc) {
            return;
        }
        this.hQ(this.dtR.aZG);
    }

    private void a(ldv ldv2, ldv ldv3, ldv ldv4, String string, ldv ldv5, String string2, bbs bbs2, ldv ldv6, int n, int n2, int n3, double d2) {
        ftk ftk2 = (ftk)this.MessageDelegator.h(1050, this.GUID, ldv2);
        ftk2.oL(ldv3);
        ftk2.pR(ldv4);
        ftk2.d(string);
        ftk2.pS(ldv5);
        ftk2.cD(string2);
        ftk2.e(bbs2);
        ftk2.pT(ldv6);
        ftk2.HP(n);
        ftk2.pQ(this.GUID);
        ftk2.ge(n2);
        ftk2.HQ(n3);
        ftk2.cF(d2);
        this.MessageDelegator.F(ftk2);
    }

    private void a(int n, ldv ldv2, ljq ljq2) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.aZG = null;
        glh2.akX = ldv2;
        glh2.aZD = ljq2;
        glh2.jkQ = true;
        this.MessageDelegator.F(glh2);
    }

    private void cx(ldv ldv2) {
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEb);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.MessageDelegator.F(glj2);
    }

    private void hQ(ldv ldv2) {
        ftj ftj2 = (ftj)this.MessageDelegator.h(1052, this.GUID, ldv2);
        ftj2.pQ(this.GUID);
        this.MessageDelegator.F(ftj2);
    }

    private void a(ldv ldv2, a a2) {
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, ldv2);
        fcw2.dul = a2.dul;
        fcw2.bst = a2.bst;
        fcw2.aZG = a2.aZG;
        fcw2.akX = a2.akX;
        fcw2.dsL = a2.dsL;
        fcw2.dum = a2.dum;
        fcw2.aYF = a2.aYF;
        fcw2.bsG = a2.bsG;
        fcw2.aYC = a2.aYC;
        fcw2.Magnitude = a2.Magnitude;
        fcw2.dun = a2.dun;
        fcw2.eKm = a2.doT;
        fcw2.aSp = a2.aSp;
        fcw2.bRw = a2.bRw;
        fcw2.aYH = a2.aYH;
        fcw2.aYG = a2.aYG;
        fcw2.bsE = a2.bsE;
        fcw2.bRD = a2.bRD;
        fcw2.gpI = a2.duo;
        fcw2.dup = a2.dup;
        fcw2.duq = a2.duq;
        fcw2.aZH = a2.aZH;
        fcw2.dhr = a2.dhr;
        fcw2.cRI = a2.cRI;
        fcw2.a(a2.dur);
        fcw2.iV(a2.dus);
        this.MessageDelegator.E(fcw2);
    }

    private void hR(ldv ldv2) {
        fdp fdp2 = (fdp)this.MessageDelegator.h(9218, this.GUID, ldv2);
        this.MessageDelegator.F(fdp2);
    }

    private void hS(ldv ldv2) {
        ftm ftm2 = (ftm)this.MessageDelegator.h(1055, this.GUID, ldv2);
        ftm2.ch(this.cCH);
        ftm2.cD(this.YM);
        ftm2.f(this.dui);
        this.MessageDelegator.F(ftm2);
    }

    private void hT(ldv ldv2) {
        fto fto2 = (fto)this.MessageDelegator.h(1054, this.GUID, ldv2);
        fto2.oK(this.duj);
        fto2.HR(this.duk);
        this.MessageDelegator.F(fto2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1051: {
                this.a((ftl)dxq2);
                break;
            }
            case 1053: {
                this.a((ftn)dxq2);
                break;
            }
            case 13059: {
                this.b((glb)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
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

    private void a(ftl ftl2) {
        --this.dub;
        if (ftl2.vA()) {
            this.bpU = ftl2.bRK();
            this.dud = ftl2.bRL();
            this.arA();
        } else {
            this.dua = true;
        }
        if (ftl2.bRJ() != null) {
            this.e(this.dtR.akX, ftl2.bRJ());
        }
    }

    private void a(ftn ftn2) {
        if (this.dua) {
            return;
        }
        ha ha2 = this.hI(this.dtR.akX);
        if (ha2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectCharacterLinkUpdateDurabilityMessage() : PSO is null!!!");
            this.dua = true;
            return;
        }
        cex cex2 = ha2.jf();
        if (cex2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectCharacterLinkUpdateDurabilityMessage() : PlayerObject is null!!!");
            this.dua = true;
            return;
        }
        if (cex2.aJF() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectCharacterLinkUpdateDurabilityMessage() : PlayerObject.getInventoryPlayer() is null!!!");
            this.dua = true;
            return;
        }
        if (cex2.aJF().avx() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectCharacterLinkUpdateDurabilityMessage() : PlayerObject.getInventoryPlayer().getAttachedWeapon() is null!!!");
            this.dua = true;
            return;
        }
        bqs bqs2 = cex2.aJF().avx();
        czb czb2 = (czb)((Object)cex2.jk().ht(this.dtR.aYC));
        if (czb2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectCharacterLinkUpdateDurabilityMessage() : PlayerObject.getSkillManagerServer().getSkill(FunctionMessage.CauseSkillType) is null!!!");
            this.dua = true;
            return;
        }
        ((brg)cex2.aJF()).a(bqs2.getGUID(), czb2);
    }

    private void b(glb glb2) {
        if (this.duc) {
            this.aUa = glb2.aUa;
        } else {
            this.cx(glb2.aUa);
        }
    }

    private void a(fdh fdh2) {
        if (this.duc) {
            this.duh = fdh2.gbp;
        } else {
            this.hR(fdh2.gbp);
        }
    }

    @Override
    protected void a(fdp fdp2) {
        this.dua = true;
        if (fdp2.aO().equals(this.dtR.aZG)) {
            this.duc = false;
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        int n = gre2.bWR();
        switch (n) {
            case 1050: {
                --this.dub;
                this.dua = true;
                break;
            }
            case 7955: {
                --this.dub;
                this.dua = true;
                break;
            }
            case 7981: {
                --this.dub;
                this.dua = true;
            }
        }
    }
}

