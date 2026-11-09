/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  cxd
 *  dta
 *  lcr
 *  lcw
 */
public class bun
extends btk {
    public static final float dOh = 10.0f;
    public static final float dOi = 14.0f;
    public static final float dOj = 14.0f;
    public static final float dOk = 2.0f;
    public static final float dOl = 4.0f;
    public static final float dOm = 7.0f;
    public static final float dOn = 2.0f;
    public static final float dOo = 3.5f;
    public static final float dOp = 7.0f;
    public static final float dOq = 1.7f;
    public static final float dOr = 3.5f;
    public static final float dOs = 6.0f;
    public static final float dOt = 1.7f;
    public static final float dOu = 3.5f;
    public static final float dOv = 6.5f;
    public static final float dOw = 50.0f;
    public static final float dOx = 25.0f;
    private final jpx dOy;
    private ldv afF = null;
    private ldv dOz = null;
    private ldv dOA = null;
    private ljq biE = null;
    private ljq dOB = new ljq(0.0f, 0.0f, 0.0f);
    private ljq bis = new ljq(0.0f, 0.0f, 1.0f);
    private ldv[] dOC = null;
    private boolean dOD = true;
    private buf dOE = null;

    public bun(jpx jpx2) {
        this.dOy = jpx2;
    }

    public ldv ayp() {
        return this.afF;
    }

    public void cK(ldv ldv2) {
        assert (this.afF == null);
        if (ldv2 == null) {
            lfn.b(5, "SFTargetingManager", "setPlayerObjectGUID() ObjectGUID is null.");
            return;
        }
        this.afF = ldv2;
    }

    public void jO(ldv ldv2) {
        assert (this.afF != null);
        if (ldv2 == null) {
            lfn.b(5, "SFTargetingManager", "replacePlayerObjectGUID() ObjectGUID is null.");
            return;
        }
        this.afF = ldv2;
    }

    public void jP(ldv ldv2) {
        this.dOz = ldv2;
        if (lcw.enb()) {
            if (lcw.qGV && lcw.qGW) {
                this.dOC = new ldv[3];
                this.dOC[0] = this.dOz;
                this.dOC[1] = this.ays();
                this.dOC[2] = lcr.ak((ldv)this.dOz, (int)7000);
            } else if (lcw.qGV) {
                this.dOC = null;
            } else if (lcw.qGW) {
                this.dOC = new ldv[2];
                this.dOC[0] = this.dOz;
                this.dOC[1] = this.ays();
            }
        } else {
            this.dOC = new ldv[1];
            this.dOC[0] = this.dOz;
        }
    }

    public void setDeltaPos(ljq ljq2) {
        this.biE = ljq2;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
    }

    public buf ayq() {
        return this.dOE;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dOA = this.MessageDelegator.bzv();
        this.dOE = new buf();
        this.dOE.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dOE);
    }

    public void d(buo buo2) {
        if (this.dOE.Uj() == null) {
            return;
        }
        if (buo2.Rr.tV(this.dOE.Uj())) {
            this.dOE.a(buo2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4632: {
                this.a((gjc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 517: {
                this.a((kwg)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public boolean jQ(ldv ldv2) {
        assert (this.afF != null);
        lep lep2 = this.dOE.axR();
        if (ctg.ffj) {
            lep2 = this.ayr();
        }
        if (lep2 == null) {
            return false;
        }
        if (lep2.dtj == null) {
            return false;
        }
        if (lep2.aCE == null) {
            return false;
        }
        if (lep2.ResourceType <= 0) {
            return false;
        }
        if (lep2.Position == null) {
            return false;
        }
        if (!this.dOy.d(lep2.mB, lep2.ResourceType)) {
            return false;
        }
        this.b(ldv2, lep2.aCE, lep2.dtj, lep2.ResourceType);
        return true;
    }

    public void jR(ldv ldv2) {
        lep lep2 = this.dOE.axR();
        if (ctg.ffj) {
            lep2 = this.ayr();
        }
        if (lep2 == null) {
            return;
        }
        if (lep2.dtj == null) {
            return;
        }
        if (lep2.aCE == null) {
            return;
        }
        if (lep2.ResourceType <= 0) {
            return;
        }
        if (lep2.Position == null) {
            return;
        }
        if (!this.dOy.d(lep2.mB, lep2.ResourceType)) {
            return;
        }
        int n = lep2.ResourceType == iv.ahA ? cxd.fLe : cxd.fHm;
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, ldv2);
        gjt2.SkillType = n;
        gjt2.aZF = 12;
        gjt2.akX = lep2.dtj;
        gjt2.dsL = lep2.aCE;
        gjt2.dhr = lep2.ResourceType;
        gjt2.aZD = lep2.Position;
        if (n == cxd.fLe) {
            this.MessageDelegator.F(gjt2);
            return;
        }
        byv byv2 = this.dOy.dQf().axF().aJD().aEP();
        if (byv2.aEG()) {
            this.MessageDelegator.F(gjt2);
        } else {
            if (cug.vP((int)lep2.ResourceType)) {
                return;
            }
            gjs gjs2 = (gjs)this.MessageDelegator.h(4631, this.GUID, ldv2);
            gjs2.fYi = gjt2;
            this.MessageDelegator.F(gjs2);
        }
    }

    private lep ayr() {
        dtp dtp2 = (dtp)((Object)this.MessageDelegator);
        dsu dsu2 = dtp2.bAn();
        lep lep2 = new lep();
        lep2.GUID = dsu2.gYZ;
        lep2.aCE = dsu2.gYZ;
        lep2.ResourceType = dsu2.Za;
        lep2.Position = ((bvd)dtp2.bzt().d(lep2.aCE)).av();
        lep2.mB = 1.0f;
        lep2.dtj = dsu2.gYY;
        return lep2;
    }

    private ldv ays() {
        dtm dtm2 = (dtm)((dta)this.MessageDelegator).bzt();
        ldv ldv2 = lcr.ak((ldv)this.dOz, (int)3);
        bvd bvd2 = (bvd)dtm2.bAh().d(ldv2);
        if (bvd2 == null) {
            return null;
        }
        return bvd2.axa();
    }

    private void a(gjc gjc2) {
        switch (gjc2.iRh) {
            case 1: {
                if (this.afF == null) {
                    return;
                }
                this.jS(this.dOy.dQf().axF().aAG().getGUID());
                break;
            }
            default: {
                lfn.b(5, "SFTargetingManager", "handleSkillExtensionChangedMessage() Invalid changetype provided: " + gjc2.iRh);
                return;
            }
        }
    }

    private void b(ldv ldv2, ldv ldv3, ldv ldv4, int n) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (n > 0);
        gan gan2 = (gan)this.MessageDelegator.h(4866, this.GUID, ldv2);
        gan2.Ui = ldv3;
        gan2.dtj = ldv4;
        gan2.ResourceType = n;
        this.MessageDelegator.F(gan2);
    }

    public void ayt() {
        if (this.dOC == null) {
            lfn.b(5, "SFTargetingManager", "addIgnoreGUIDs() ExcludeList is null.");
            return;
        }
        kpb kpb2 = (kpb)this.MessageDelegator.h(518);
        kpb2.ec = this.GUID;
        kpb2.iBr = true;
        kpb2.Ud = this.dOA;
        kpb2.pUa = 8;
        kpb2.Rs = this.dOz;
        kpb2.dOC = this.dOC;
        this.MessageDelegator.a(kpb2);
    }

    public void jS(ldv ldv2) {
        assert (this.Initialized);
        this.ayx();
        this.jP(ldv2);
        this.ayw();
    }

    public void jT(ldv ldv2) {
        assert (this.Initialized);
        this.jP(ldv2);
        this.ayw();
    }

    public ldv axO() {
        assert (this.dOE != null);
        return this.dOE.Uj();
    }

    public void ayu() {
        assert (this.Initialized);
        this.ayx();
        this.ayw();
    }

    public void ayv() {
        kpb kpb2 = (kpb)this.MessageDelegator.h(518);
        kpb2.ec = this.GUID;
        kpb2.iBr = true;
        kpb2.Ud = this.dOA;
        kpb2.pUa = 16;
        kpb2.Rs = this.dOz;
        kpb2.dOC = this.dOC;
        this.MessageDelegator.a(kpb2);
    }

    private void ayw() {
        cew cew2 = this.dOy.dQf().axF();
        float f2 = 300.0f;
        kpb kpb2 = (kpb)this.MessageDelegator.h(518);
        kpb2.ec = this.GUID;
        kpb2.iBr = true;
        kpb2.Ud = this.dOA;
        kpb2.pUa = 65;
        if (this.dOC != null && this.dOC.length > 0) {
            kpb2.pUa |= 8;
        }
        kpb2.pUb = 0;
        kpb2.pUd = 0;
        kpb2.dum = f2;
        kpb2.dOC = this.dOC;
        kpb2.bis = this.bis;
        kpb2.pUe = true;
        if (this.dOD) {
            kpb2.pUc = 2;
            kpb2.Rs = lcr.rg;
            kpb2.biE = new ljq();
            kpb2.dOB = new ljq();
        } else {
            kpb2.pUc = 1;
            kpb2.Rs = this.dOz;
            kpb2.biE = this.biE;
            kpb2.dOB = this.dOB;
            kpb2.bis = this.dOB;
        }
        this.MessageDelegator.a(kpb2);
    }

    private void a(kwg kwg2) {
        if (kwg2.aZH == null) {
            lfn.b(5, "SFTargetingManager", "handleLineSweepSensorResponse() SourcePosition is null.");
            return;
        }
        if (kwg2.qfy == null) {
            lfn.b(5, "SFTargetingManager", "handleLineSweepSensorResponse() Hits array is null.");
            return;
        }
        if (kwg2.qfy.length == 0) {
            this.dOE.axS();
            return;
        }
        lep[] lepArray = kwg2.qfy;
        int n = lepArray.length;
        for (int i = 0; i < n; ++i) {
            lep lep2 = lepArray[i];
            if (lep2.GUID == null) {
                lfn.b(5, "SFTargetingManager", "handleLineSweepSensorResponse() SensorHit[" + i + "]: GUID is null.");
                return;
            }
            if (lep2.aCE == null) {
                lfn.b(5, "SFTargetingManager", "handleLineSweepSensorResponse() SensorHit[" + i + "]: OwnerGUID is null.");
                return;
            }
            if (lep2.ResourceType < 0) {
                return;
            }
            if (lep2.mB < 0.0f) {
                return;
            }
            if (lep2.Position == null) {
                return;
            }
            assert (!lep2.GUID.equals(lcr.qAC));
            if (!lcw.enb() || lep2.GUID.ib() == 1024 || lep2.GUID.equals(lcr.qAC) || lep2.aCE.equals(lcr.qAC)) continue;
            lep2.GUID = lep2.aCE = lcr.al((ldv)lep2.aCE, (int)1024);
        }
        lep lep3 = lepArray[0];
        if (lep3.ResourceType == cug.fqr) {
            for (lep lep4 : lepArray) {
                if (!lea.enW().isDescendant(lep4.ResourceType, cug.fgC)) continue;
                lep3 = lep4;
                break;
            }
        }
        if (this.dOE.KY() == null) {
            this.dOE.a(lep3, lepArray);
        } else if (this.dOE.KY().equals(lep3.GUID)) {
            if (this.dOE.az() != lep3.ResourceType) {
                this.dOE.a(lep3, lepArray);
            } else {
                this.dOE.b(lep3, lepArray);
            }
        } else {
            this.dOE.a(lep3, lepArray);
        }
    }

    private void a(kwr kwr2) {
        if (kwr2.getResult() != 0) {
            lfn.b(5, "SFTargetingManager", "handleSensorResponse() LineSweepSensor could not be created.");
        }
    }

    private void ayx() {
        kpb kpb2 = (kpb)this.MessageDelegator.h(518);
        kpb2.ec = this.GUID;
        kpb2.Ud = this.dOA;
        kpb2.pUa = 2;
        kpb2.Rs = this.dOD ? lcr.rg : this.dOz;
        kpb2.biE = this.biE;
        kpb2.dOB = this.dOB;
        this.MessageDelegator.a(kpb2);
    }

    public jpx ayy() {
        return this.dOy;
    }
}

