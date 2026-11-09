/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.List;
import java.util.Map;

public class cmu
extends btk
implements bto {
    private String btt = null;
    private String btu = null;
    private String btv = null;
    private String btw = null;
    private String btx = null;
    private String bty = null;
    private String btz = null;
    private static final float eMp = 1.0f;
    private dfc eMq = null;
    private dfc eMr = null;
    private dfc eMs = null;
    private dfc eMt = null;
    private dfc eMu = null;
    private dfc eMv = null;
    private dfc eMw = null;
    private static final int eMx = 0;
    private static final int eMy = 1;
    private static final int dwD = 2;
    private static final int eMz = 3;
    private int eMA = 0;
    private List<ldv> eLY = lcn.emv();
    private bvm eMB = null;
    private ljq eMC = null;
    private ljq eMD = null;
    private static final int eME = 25;
    private float[] eMF = new float[25];
    private float eMG = 1.0f;
    private boolean fE = true;
    private boolean eMH = false;
    private double bcH = -100.0;
    private static final double eMI = (double)0.1f;
    private boolean eMJ = true;
    private float eMK = 0.1f;
    kps epT = null;
    private static float bpE = 50.0f;
    private static float aSc = 5.0f;
    private static int eMf = 360;
    private static int eMg = 360;
    private static ljq eMh = new ljq(0.0f, 1.0f, 0.0f);
    private static long dKH = 0L;
    private static boolean eMi = false;
    private static boolean eMj = false;
    private Map<bvc, lfs<Integer, Integer>> eML = lcn.emw();
    List<kps> eMM = lcn.emv();

    @Override
    public void initialize() {
        super.initialize();
        assert (this.eMB != null);
        this.aTL();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            assert (this.eMB != null);
            this.eMC = this.eMB.av();
            this.eMD = this.eMB.av();
            this.eMD.y = 0.0f;
            for (int i = 0; i < 25; ++i) {
                this.eMF[i] = this.eMK;
            }
            this.fE = false;
            this.epT = (kps)this.MessageDelegator.h(3589);
            this.epT.wD(false);
            this.epT.jM(false);
            this.epT.ts(this.GUID);
            this.epT.hC(this.eMB.getGUID());
            this.epT.aam(2);
        }
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

    private dfc m(String string, boolean bl) {
        if (dey.bls() == null) {
            lfn.b(5, "SFVehicleSFXManager", "setupAudio(): SFSpecialEffectAtom.getSpecialEffectAtomGarbageCollector() == null");
            assert (false);
            return null;
        }
        if (dey.bls().getMessageDelegator() == null) {
            lfn.b(5, "SFVehicleSFXManager", "setupAudio(): SFSpecialEffectAtom.getSpecialEffectAtomGarbageCollector().getMessageDelegator() == null");
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
    }

    private void aTO() {
        if (this.MessageDelegator.arc().qwh <= 0.0) {
            return;
        }
        this.eMD.et(this.eMB.azb());
        this.eMD.y = 0.0f;
        this.eMD.nm((float)(1.0 / this.MessageDelegator.arc().qwh));
        float f2 = 0.0f;
        for (int i = 24; i > 0; --i) {
            this.eMF[i] = this.eMF[i - 1];
            f2 += this.eMF[i];
        }
        float f3 = this.eMD.eqN();
        float f4 = f3 * this.eMG;
        if (f4 < this.eMK) {
            f4 = this.eMK;
        }
        this.eMF[0] = f4;
        f2 += f4;
        assert ((f2 /= 25.0f) >= 0.0f);
        for (kps kps2 : this.eMM) {
            kps2.setPower(f2);
            this.MessageDelegator.a(this.epT);
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

    private void rN(int n) {
        if (n != 3 && this.eMA == 3) {
            this.epT.setPower(0.0f);
            this.MessageDelegator.a(this.epT);
        } else if (n == 3 && this.eMA != 3) {
            this.epT.setPower(1.0f);
            this.MessageDelegator.a(this.epT);
        }
        this.bb(this.eMA, n);
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
                } else if (this.eMA == 0 && this.eMr != null) {
                    this.eMr.play();
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
                } else if (this.eMA == 0 && this.eMq != null) {
                    this.eMq.play();
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
                } else if (this.eMA == 0 && this.eMw != null) {
                    this.eMw.play();
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

    public bvm aTQ() {
        return this.eMB;
    }

    public void a(bvm bvm2) {
        this.eMB = bvm2;
    }

    public void a(bvc bvc2, int n, int n2) {
        this.eML.put(bvc2, new lfs<Integer, Integer>(n, n2));
    }

    public void a(bvc bvc2) {
        this.eML.remove(bvc2);
    }

    private void bb(int n, int n2) {
        for (Map.Entry<bvc, lfs<Integer, Integer>> entry : this.eML.entrySet()) {
            int n3 = -1;
            if ((n == 2 || n == 1) && n2 == 3) {
                n3 = entry.getValue().eqz();
            } else if (n == 3 && (n2 == 2 || n2 == 1)) {
                n3 = entry.getValue().getFirst();
            }
            if (n3 == -1) continue;
            dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.getGUID(), entry.getKey().getGUID());
            dzv2.dTs = n3;
            entry.getKey().receiveMessage(dzv2);
        }
    }

    public boolean Ow() {
        return this.eMA == 3;
    }

    public void f(bvd bvd2) {
        kps kps2 = (kps)this.MessageDelegator.h(3589);
        kps2.ec = this.GUID;
        kps2.iBr = false;
        kps2.hsP = false;
        kps2.hC(bvd2.axa());
        kps2.aam(2);
        this.eMM.add(kps2);
    }
}

