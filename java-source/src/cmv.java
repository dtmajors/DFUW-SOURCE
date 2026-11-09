/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.List;

public class cmv
extends btk
implements bto {
    private String btt = "";
    private String btu = "";
    private String btv = "";
    private String btw = "";
    private String btx = "";
    private String bty = "";
    private String btz = "";
    private String byX = "";
    private String byY = "";
    private static final float eMp = 1.0f;
    private dfc eMq = null;
    private dfc eMr = null;
    private dfc eMs = null;
    private dfc eMt = null;
    private dfc eMu = null;
    private dfc eMv = null;
    private dfc eMw = null;
    private dfm eMN = null;
    private dfm eMO = null;
    private static final int eMx = 0;
    private static final int eMy = 1;
    private static final int dwD = 2;
    private static final int eMz = 3;
    private int eMA = 0;
    private List<ldv> eLY = lcn.emv();
    private List<knj> eMP = lcn.emv();
    private bvm eMB = null;
    private ljq eMC = null;
    private ljq eMD = null;
    private static final int eME = 25;
    private float[] eMF = new float[25];
    private boolean fE = true;
    private boolean eMH = false;
    private boolean eMQ = false;
    private boolean eMR = false;
    private double bcH = -100.0;
    private static final double eMI = (double)0.1f;
    kps eMS = null;
    kps eMT = null;
    private static float bpE = 50.0f;
    private static float aSc = 5.0f;
    private static int eMf = 360;
    private static int eMg = 360;
    private static ljq eMh = new ljq(0.0f, 1.0f, 0.0f);
    private static long dKH = 0L;
    private static boolean eMi = false;
    private static boolean eMj = false;
    private amn eMU = null;

    public cmv(amn amn2) {
        assert (amn2 != null);
        this.eMU = amn2;
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (this.eMB != null);
        this.aTL();
        this.aTR();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            assert (this.eMB != null);
            this.eMC = this.eMB.av();
            this.eMD = this.eMB.av();
            this.eMD.y = 0.0f;
            for (int i = 0; i < 25; ++i) {
                this.eMF[i] = 0.0f;
            }
            this.fE = false;
            if (this.eMN != null) {
                this.eMS = (kps)this.MessageDelegator.h(3589);
                this.eMS.wD(false);
                this.eMS.jM(false);
                this.eMS.ts(this.GUID);
                this.eMS.hC(this.eMN.getGUID());
                this.eMS.f(new ljr());
                this.eMS.g(new ljr());
                this.eMS.aam(1);
            }
            if (this.eMO != null) {
                this.eMT = (kps)this.MessageDelegator.h(3589);
                this.eMT.wD(false);
                this.eMT.jM(false);
                this.eMT.ts(this.GUID);
                this.eMT.hC(this.eMO.getGUID());
                this.eMT.f(new ljr());
                this.eMT.g(new ljr());
                this.eMT.aam(1);
            }
        }
        this.aTS();
        this.aTO();
        if (this.bcH + (double)0.1f > ldz2.rgz) {
            return;
        }
        this.bcH = ldz2.rgz;
        this.aTP();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        super.receiveResponse(ktv2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aTM();
        this.aTT();
    }

    public void aTJ() {
        this.eMH = true;
        this.rN(2);
    }

    public void aTK() {
        this.eMH = false;
        this.rN(1);
    }

    private void aTL() {
        if (this.btt != null) {
            this.eMq = this.m(this.btt, true);
            this.a(this.eMq);
        }
        if (this.btu != null) {
            this.eMr = this.m(this.btu, true);
            this.a(this.eMr);
        }
        if (this.btv != null) {
            this.eMs = this.m(this.btv, false);
            this.a(this.eMs);
        }
        if (this.btw != null) {
            this.eMt = this.m(this.btw, false);
            this.a(this.eMt);
        }
        if (this.btx != null) {
            this.eMu = this.m(this.btx, false);
            this.a(this.eMu);
        }
        if (this.bty != null) {
            this.eMv = this.m(this.bty, false);
            this.a(this.eMv);
        }
        if (this.btz != null) {
            this.eMw = this.m(this.btz, true);
            this.a(this.eMw);
        }
    }

    private void aTR() {
        if (this.byX != null && !this.byX.equals("")) {
            this.eMN = this.hF(this.byX);
        }
        if (this.byY != null && !this.byY.equals("")) {
            this.eMO = this.hF(this.byY);
        }
    }

    private void aTS() {
        if (this.eMQ) {
            return;
        }
        if (this.eMN != null && this.eMN.blt()) {
            this.eMQ = true;
            this.b(this.eMN);
        }
        if (this.eMO != null && this.eMO.blt()) {
            this.eMQ = true;
            this.b(this.eMO);
        }
    }

    private void aTM() {
        if (this.eMq != null) {
            dey.bls().b(this.eMq);
        }
        if (this.eMr != null) {
            dey.bls().b(this.eMr);
        }
        if (this.eMs != null) {
            dey.bls().b(this.eMs);
        }
        if (this.eMt != null) {
            dey.bls().b(this.eMt);
        }
        if (this.eMu != null) {
            dey.bls().b(this.eMu);
        }
        if (this.eMv != null) {
            dey.bls().b(this.eMv);
        }
        if (this.eMw != null) {
            dey.bls().b(this.eMw);
        }
        this.aTN();
    }

    private void aTT() {
        if (this.eMO != null) {
            dey.bls().b(this.eMO);
        }
        if (this.eMN != null) {
            dey.bls().b(this.eMN);
        }
        this.aTU();
    }

    private dfc m(String string, boolean bl) {
        if (dey.bls() == null) {
            lfn.b(5, "SFWaterVesselSFXManager", "setupAudio(): SFSpecialEffectAtom.getSpecialEffectAtomGarbageCollector() == null");
            assert (false);
            return null;
        }
        if (dey.bls().getMessageDelegator() == null) {
            lfn.b(5, "SFWaterVesselSFXManager", "setupAudio(): SFSpecialEffectAtom.getSpecialEffectAtomGarbageCollector().getMessageDelegator() == null");
            assert (false);
            return null;
        }
        dfc dfc2 = (dfc)dgj.getAtomFactory().Af(4);
        dfc2.setGUID(dey.bls().getMessageDelegator().bzv());
        dfc2.hP(false);
        dfc2.setActive(true);
        dfc2.setConeOrientation(eMh);
        dfc2.setConeOutsideVolume(dKH);
        dfc2.setInsideConeAngle(eMf);
        dfc2.setLooping(bl);
        dfc2.hO(false);
        dfc2.setMaxDistance(bpE);
        dfc2.setMinDistance(aSc);
        dfc2.setMode(0);
        dfc2.setOutsideConeAngle(eMg);
        dfc2.setPlayingOnce(eMj);
        dfc2.bi(new ljq());
        dfc2.setXMLFileName(string);
        dfc2.bK(this.eMB.av());
        dey.bls().getMessageDelegator().a(dfc2);
        return dfc2;
    }

    private dfm hF(String string) {
        if (dey.bls() == null) {
            lfn.b(5, "SFWaterVesselSFXManager", "setupMesh(): SFSpecialEffectAtom.getSpecialEffectAtomGarbageCollector() == null");
            assert (false);
            return null;
        }
        if (dey.bls().getMessageDelegator() == null) {
            lfn.b(5, "SFWaterVesselSFXManager", "setupMesh(): SFSpecialEffectAtom.getSpecialEffectAtomGarbageCollector().getMessageDelegator() == null");
            assert (false);
            return null;
        }
        dfm dfm2 = (dfm)dgj.getAtomFactory().Af(11);
        dfm2.setGUID(dey.bls().getMessageDelegator().bzv());
        dfm2.setActive(true);
        dfm2.setDefaultValues();
        dfm2.setMeshXML(string);
        if (this.eMB != null) {
            dfm2.c(this.eMB.av());
            dfm2.a(this.eMB.aw());
        }
        dfm2.n(lcq.BRIGHT_WHITE);
        dey.bls().getMessageDelegator().a(dfm2);
        return dfm2;
    }

    private void a(dfc dfc2) {
        if (dfc2 == null) {
            return;
        }
        kne kne2 = (kne)this.MessageDelegator.h(776);
        kne2.lQ(false);
        kne2.jM(false);
        kne2.wD(false);
        kne2.xo(true);
        kne2.ts(this.GUID);
        kne2.qj(this.eMB.getGUID());
        kne2.qk(dfc2.getGUID());
        kne2.kX(this.MessageDelegator.bzv());
        kne2.setDeltaPos(new ljq());
        kne2.setDeltaRot(new lgl());
        kne2.Zo(9);
        this.eLY.add(kne2.aSO());
        this.MessageDelegator.a(kne2);
    }

    private void b(dfm dfm2) {
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.lQ(false);
        kni2.ts(this.getGUID());
        kni2.jM(false);
        kni2.wD(false);
        kni2.qj(this.eMB.axa());
        kni2.qk(dfm2.getGUID());
        kni2.kX(this.MessageDelegator.bzv());
        kni2.pPN = 64;
        kni2.biE = new ljq();
        kni2.biF = new lgl();
        kni2.biD = false;
        this.MessageDelegator.a(kni2);
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.lQ(false);
        knj2.ts(this.getGUID());
        knj2.wD(false);
        knj2.jM(false);
        knj2.qj(this.eMB.axa());
        knj2.qk(dfm2.getGUID());
        knj2.kX(kni2.aSO());
        knj2.biE = kni2.biE;
        knj2.biF = kni2.biF;
        knj2.pPN = 128;
        this.eMP.add(knj2);
    }

    private void aTU() {
        for (knj knj2 : this.eMP) {
            knj2.pPN = 1;
            this.MessageDelegator.a(knj2);
        }
        this.eMP.clear();
    }

    private void aTN() {
        for (ldv ldv2 : this.eLY) {
            kne kne2 = (kne)this.MessageDelegator.h(776);
            kne2.lQ(false);
            kne2.jM(false);
            kne2.wD(false);
            kne2.ts(this.GUID);
            kne2.qj(this.eMB.getGUID());
            kne2.qk(this.eMB.getGUID());
            kne2.kX(ldv2);
            kne2.Zo(2);
            this.MessageDelegator.a(kne2);
        }
        this.eLY.clear();
    }

    private void aTO() {
        ljr ljr2;
        float f2;
        if (this.MessageDelegator.arc().qwh <= 0.0) {
            return;
        }
        float f3 = this.eMU.getMaxVelocity();
        this.eMD.et(this.eMB.azb());
        this.eMD.y = 0.0f;
        this.eMD.nm((float)(1.0 / this.MessageDelegator.arc().qwh));
        float f4 = 0.0f;
        for (int i = 24; i > 0; --i) {
            this.eMF[i] = this.eMF[i - 1];
            f4 += this.eMF[i];
        }
        float f5 = this.eMD.eqN();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > f3) {
            f5 = f3;
        }
        this.eMF[0] = f2 = f5 / f3;
        f4 += f2;
        assert ((f4 /= 25.0f) >= 0.0f);
        float f6 = lew.o(0.15f, 1.0f, f4);
        float f7 = 0.2f;
        float f8 = lew.o(0.1f, 0.8f, f4);
        float f9 = 1.0f;
        float f10 = lew.o(0.15f, 1.0f, f4);
        float f11 = 0.3f;
        float f12 = lew.o(0.1f, 1.0f, f4);
        float f13 = 1.0f;
        if (f4 <= 1.0E-5f) {
            f11 = 0.1f;
            f9 = 0.0f;
            f13 = 0.0f;
        }
        if (this.eMS != null) {
            ljr2 = this.eMS.bBo();
            ljr2.x = f6;
            ljr2.y = f8;
            ljr2.rlV = f7;
            ljr2.rlW = f9;
            this.MessageDelegator.a(this.eMS);
        }
        if (this.eMT != null) {
            ljr2 = this.eMT.bBo();
            ljr2.x = f10;
            ljr2.y = f12;
            ljr2.rlV = f11;
            ljr2.rlW = f13;
            this.MessageDelegator.a(this.eMT);
        }
        this.eMD = this.eMB.av();
        this.eMD.y = 0.0f;
    }

    private void aTP() {
        if (this.eMB.azb().equals(this.eMC)) {
            if (this.eMH) {
                this.rN(2);
            } else {
                this.rN(1);
            }
        } else {
            this.rN(3);
            this.eMC = this.eMB.av();
        }
    }

    public boolean Ow() {
        return this.eMA == 3;
    }

    private void rN(int n) {
        switch (n) {
            case 2: {
                if (this.eMA == 2) break;
                if (this.eMA == 3) {
                    if (this.eMw != null) {
                        this.eMw.blD();
                    }
                    if (this.eMv != null) {
                        this.eMv.play();
                    }
                    if (this.eMr != null) {
                        this.eMr.play();
                    }
                } else if (this.eMA == 1) {
                    if (this.eMq != null) {
                        this.eMq.blD();
                    }
                    if (this.eMr != null) {
                        this.eMr.play();
                    }
                    if (this.eMs != null) {
                        this.eMs.play();
                    }
                }
                this.eMA = 2;
                break;
            }
            case 1: {
                if (this.eMA == 1) break;
                if (this.eMA == 2) {
                    if (this.eMt != null) {
                        this.eMt.play();
                    }
                    if (this.eMr != null) {
                        this.eMr.blD();
                    }
                    if (this.eMq != null) {
                        this.eMq.play();
                    }
                } else if (this.eMA == 3) {
                    if (this.eMw != null) {
                        this.eMw.blD();
                    }
                    if (this.eMt != null) {
                        this.eMt.play();
                    }
                    if (this.eMq != null) {
                        this.eMq.play();
                    }
                }
                this.eMA = 1;
                break;
            }
            case 3: {
                if (this.eMA == 3) break;
                if (this.eMA == 2) {
                    if (this.eMr != null) {
                        this.eMr.blD();
                    }
                    if (this.eMu != null) {
                        this.eMu.play();
                    }
                    if (this.eMw != null) {
                        this.eMw.play();
                    }
                } else if (this.eMA == 1) {
                    if (this.eMq != null) {
                        this.eMq.blD();
                    }
                    if (this.eMs != null) {
                        this.eMs.play();
                    }
                    if (this.eMw != null) {
                        this.eMw.play();
                    }
                }
                this.eMA = 3;
                break;
            }
            default: {
                assert (false) : "UNKNOWN STATE";
                break;
            }
        }
    }

    public String Fd() {
        return this.btu;
    }

    public void dd(String string) {
        this.btu = string;
    }

    public String Fe() {
        return this.btt;
    }

    public void de(String string) {
        this.btt = string;
    }

    public String Ff() {
        return this.btz;
    }

    public void df(String string) {
        this.btz = string;
    }

    public String Fg() {
        return this.btv;
    }

    public void dg(String string) {
        this.btv = string;
    }

    public String Fh() {
        return this.btx;
    }

    public void dh(String string) {
        this.btx = string;
    }

    public String Fi() {
        return this.btw;
    }

    public void di(String string) {
        this.btw = string;
    }

    public String Fj() {
        return this.bty;
    }

    public void dj(String string) {
        this.bty = string;
    }

    public String GV() {
        return this.byY;
    }

    public void du(String string) {
        this.byY = string;
    }

    public String GW() {
        return this.byX;
    }

    public void dv(String string) {
        this.byX = string;
    }

    public bvm aTQ() {
        return this.eMB;
    }

    public void a(bvm bvm2) {
        this.eMB = bvm2;
    }
}

