/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  bvf
 *  cug
 *  ep
 *  lcr
 *  lcw
 */
public class asv
extends btk
implements bvl,
Comparable<asv> {
    public static final float bVT = 300.0f;
    public static final float bVU = 700.0f;
    public static final float bVV = 1000.0f;
    private static final int bVW = ep.k((int)352, (int)2);
    private static final int bVX = ep.k((int)384, (int)2);
    private static final int bVY = ep.k((int)400, (int)2);
    private int Qw;
    private boolean bVZ;
    private int[] bWa;
    private boolean bWb;
    private float bWc;
    private float bWd = 0.5f;
    private boolean bWe;
    private alu[] bWf;
    private int[] bWg;
    private float bWh;
    private String bWi;
    private final int bWj;
    private float aGr;
    private float bWk;
    private float bWl;
    private final float bWm;
    private final float bWn;
    private boolean bWo;
    private boolean bWp;
    private ldv bWq;
    private boolean bWr;
    private ldv bES;
    private float bWs;
    private float bWt;
    private float bWu;
    private bvf bWv;
    private final ldv Ui;
    private boolean bWw;
    private boolean bWx;
    private final ljq bWy = new ljq();
    private double bHx;
    private boolean bWz;
    private boolean bWA;
    private final ljq Position = new ljq();
    private final ljp bWB = new ljp();
    private final c bWC;
    private ldv Ri;
    private String bWD;
    private final int ResourceType;
    private final lgl Rotation = new lgl();
    private ldv bER;
    private b bWE = b.bXd;
    private float bWF;
    private float bWG;
    private float bWH;
    private final d bWI;
    private ari bWJ;
    private final a bWK = new a(this, 15);
    private e bWL = e.bXB;
    private ldv bWM;
    private boolean bWN;
    private double bWO;
    private float bWP;
    private float bWQ;
    private float bWR;
    private String DisplayName;
    private boolean bWS;
    private boolean bWT;

    public float TU() {
        return this.bWP;
    }

    public String getDisplayName() {
        return this.DisplayName;
    }

    public asv(ari ari2, ldv ldv2, ljq ljq2, int n, d d2, c c2) {
        assert (ldv2 != null);
        this.bWJ = ari2;
        this.Ui = ldv2;
        this.ResourceType = n;
        this.bWj = lea.enW().uW(lea.enW().uW(this.ResourceType));
        this.Position.ex(ljq2);
        this.bWI = d2;
        this.bWC = c2;
        switch (this.bWI) {
            case bXp: 
            case bXq: 
            case bXr: 
            case bXt: 
            case bXu: 
            case bXw: 
            case bXx: 
            case bXv: {
                this.Ri = lcr.tQ((ldv)this.Ui);
                break;
            }
            case bXs: {
                this.UO();
                this.Ri = lcr.am((ldv)this.Ui, (int)lcr.abS((int)this.Ui.enw()));
                break;
            }
            default: {
                assert (false) : "Unrecognised Type " + (Object)((Object)this.bWI);
                break;
            }
        }
        if (lcw.enb()) {
            this.Ri = new ldv(3, this.Ri.enw(), this.Ri.enx());
        }
        this.bWm = cug.vg((int)n);
        this.bWn = cug.vf((int)n);
    }

    public boolean TV() {
        return this.bWb;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.bWv = null;
        this.bWJ = null;
        this.bWM = null;
        this.bWq = null;
        this.bER = null;
        this.bES = null;
        this.Ri = null;
        if (this.bWf != null) {
            for (int i = 0; i < this.bWf.length; ++i) {
                this.bWf[i] = null;
            }
        }
        this.bWf = null;
    }

    public int A(asv asv2) {
        if (this.equals(asv2)) {
            return 0;
        }
        return this.GUID.tX(asv2.GUID);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        asv asv2 = (asv)object;
        return !(this.Ui == null ? asv2.Ui != null : !this.Ui.equals(asv2.Ui));
    }

    public int getAlignment() {
        return this.Qw;
    }

    public float TW() {
        return this.bWc;
    }

    public float TX() {
        return this.bWd;
    }

    public alu[] TY() {
        return this.bWf;
    }

    public float IV() {
        return this.bWh;
    }

    public String TZ() {
        return this.bWi;
    }

    public float Ua() {
        return this.aGr;
    }

    public float Ub() {
        return this.bWk;
    }

    public float Uc() {
        return this.bWl;
    }

    public float Ud() {
        return this.bWe ? this.bWm * 0.5f : this.bWm;
    }

    public float Ue() {
        return this.bWe ? this.bWn * 0.5f : this.bWn;
    }

    public float Uf() {
        return this.bWs;
    }

    public float Ug() {
        return this.bWt;
    }

    public float Uh() {
        return this.bWu;
    }

    public ldv KY() {
        return this.Ui;
    }

    public float Ui() {
        if (this.UB()) {
            return this.bWE.UQ();
        }
        return 1.0f;
    }

    public ljq Je() {
        return this.bWy;
    }

    public ldv Uj() {
        return this.bES;
    }

    public ljq av() {
        return this.Position;
    }

    public ljp Jj() {
        return this.bWB;
    }

    public int getPriority() {
        if (this.Uy() && !this.bWA) {
            return c.bXl.UR();
        }
        return this.bWC.UR();
    }

    public ldv qd() {
        return this.Ri;
    }

    public String Uk() {
        return this.bWD;
    }

    public int az() {
        return this.ResourceType;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public ldv Ul() {
        return this.bER;
    }

    public float Um() {
        return this.bWF;
    }

    public float Un() {
        return this.bWG;
    }

    public float Uo() {
        return this.bWH;
    }

    public ljq Up() {
        return this.bWJ == null || this.bWJ.Jp() == null ? ljq.roQ : this.bWK.aj(this.bWJ.Jp().rgz);
    }

    @Override
    public void initialize() {
        super.initialize();
        gru gru2 = (gru)this.MessageDelegator.h(11044, this.GUID, lcr.qzq);
        gru2.Ui = this.Ui;
        this.MessageDelegator.F(gru2);
        kme kme2 = (kme)this.MessageDelegator.h(3354);
        kme2.ec = this.GUID;
        kme2.pMi = 1;
        kme2.Rs = this.Ui;
        this.MessageDelegator.a(kme2);
        kmm kmm2 = (kmm)this.MessageDelegator.h(3343);
        kmm2.ec = this.GUID;
        kmm2.Rs = this.Ui;
        kmm2.Zg(2);
        this.MessageDelegator.a(kmm2);
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.Ui);
        if (amf2 instanceof bvf) {
            this.bWv = (bvf)this.MessageDelegator.bzx().bzt().d(this.Ui);
            this.bWv.a((bvl)this, true);
        }
        if (this.bWI == d.bXu) {
            this.bWJ.a(true, this.GUID, lea.enW().getName(this.ResourceType), lea.enW().getName(this.bWj));
        }
    }

    public boolean Uq() {
        return this.Ur() || this.UC() || this.UF() || this.UG();
    }

    public boolean Ur() {
        return this.bWI == d.bXp;
    }

    public boolean Us() {
        return this.bWe;
    }

    public boolean Ut() {
        if (this.bWI == d.bXs && this.bWw) {
            return true;
        }
        return this.bWo || this.bWS && !lcw.qGm;
    }

    public boolean Uu() {
        return this.bWI == d.bXs && this.bWx;
    }

    public boolean Uv() {
        return this.bWI == d.bXs && this.bWw;
    }

    public boolean Uw() {
        return this.bWp;
    }

    public boolean Ux() {
        return this.bWI == d.bXq;
    }

    public boolean Uy() {
        return this.bWI == d.bXr;
    }

    public boolean Uz() {
        return this.bWI == d.bXv;
    }

    public boolean UA() {
        return this.bWz;
    }

    public boolean UB() {
        return this.bWI == d.bXs;
    }

    public boolean HT() {
        return this.bWN && this.bVZ && this.bWr;
    }

    public boolean UC() {
        return this.bWI == d.bXt;
    }

    public boolean UD() {
        return this.bWI == d.bXu;
    }

    public boolean UE() {
        return this.bWf != null && this.bWf.length != 0;
    }

    public boolean UF() {
        return this.bWI == d.bXw;
    }

    public boolean UG() {
        return this.bWI == d.bXx;
    }

    public boolean UH() {
        return this.bWL == e.bXz;
    }

    public boolean UI() {
        return this.bWL == e.bXA;
    }

    public boolean UJ() {
        return this.bWL == e.bXC;
    }

    public boolean UK() {
        return this.bWL == e.bXD;
    }

    @Override
    public void S(int n, int n2) {
        this.bWw = false;
        this.bWx = false;
        int n3 = n & 0xFFFF0000;
        switch (n3) {
            case 65536: {
                this.bWE = b.bXh;
                this.bWp = false;
                this.bWe = false;
                break;
            }
            case 131072: {
                this.bWe = true;
                this.bWp = false;
                this.bWE = b.bXb;
                break;
            }
            case 524288: {
                this.bWe = true;
                this.bWp = false;
                this.bWE = b.bXh;
                break;
            }
            case 196608: {
                this.bWE = b.bXf;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 262144: {
                this.bWE = b.bXa;
                this.bWw = true;
                this.bWe = false;
                break;
            }
            case 327680: {
                this.bWE = b.bXc;
                this.bWw = true;
                this.bWe = false;
                break;
            }
            case 393216: 
            case 0x160000: {
                this.bWE = b.bXh;
                break;
            }
            case 458752: {
                this.bWE = b.bXd;
                break;
            }
            case 0x170000: {
                this.bWE = b.bXc;
                this.bWx = true;
                this.bWe = false;
                break;
            }
            case 589824: {
                this.bWE = b.bXc;
                this.bWp = false;
                this.bWe = false;
                break;
            }
            case 655360: {
                this.bWE = b.bXf;
                break;
            }
            case 720896: {
                this.bWE = b.bXc;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 0x150000: {
                this.bWE = b.bXe;
                this.bWe = false;
                this.bWp = true;
                break;
            }
            case 786432: {
                this.bWE = b.bXc;
                this.bWe = false;
                this.bWp = true;
                break;
            }
            case 851968: {
                this.bWE = b.bXa;
                this.bWw = true;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 917504: {
                this.bWE = b.bXa;
                this.bWw = true;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 983040: {
                this.bWE = b.bXe;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 0x100000: {
                this.bWE = b.bXc;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 0x110000: {
                this.bWE = b.bXf;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 0x120000: {
                this.bWE = b.bXf;
                break;
            }
            case 0x130000: {
                this.bWE = b.bWZ;
                break;
            }
            case 0x140000: {
                this.bWE = b.bXh;
                this.bWp = false;
                this.bWe = false;
                break;
            }
            case 0x1000000: {
                this.bWE = b.bWZ;
                if (this.bWL == e.bXA) break;
                this.bWL = e.bXA;
                break;
            }
            case 0xD000000: {
                if (n == 218103931 || n == 218104293 || n == 0xD00007D || n == 218104292 || n == 218104291 || n == 218103932) {
                    switch (n2) {
                        case 7425: {
                            this.bWz = true;
                            break;
                        }
                        case 7426: {
                            this.bWz = false;
                        }
                    }
                    break;
                }
                this.bWz = false;
                break;
            }
            case 0x2000000: {
                this.bWE = b.bWZ;
                if (this.bWL == e.bXz) break;
                this.bWL = e.bXz;
                break;
            }
            case 0x3000000: {
                this.bWE = b.bWZ;
                if (this.bWL == e.bXC) break;
                this.bWL = e.bXC;
                break;
            }
            case 0xA000000: {
                this.bWE = b.bXd;
                if (this.bWL == e.bXC) break;
                this.bWL = e.bXC;
                break;
            }
            case 0xB000000: {
                this.bWE = b.bXf;
                if (this.bWL == e.bXC) break;
                this.bWL = e.bXC;
                break;
            }
            case 0x4000000: {
                this.bWE = b.bXd;
                if (this.bWL == e.bXD) break;
                this.bWL = e.bXD;
                break;
            }
            case 0x5000000: {
                this.bWE = b.bXf;
                break;
            }
            case 0x6000000: {
                this.bWE = b.bXc;
                break;
            }
            case 0x7000000: {
                this.bWE = b.bXf;
                break;
            }
            case 0x8000000: {
                this.bWE = b.bXf;
                break;
            }
            case 0x9000000: {
                this.bWE = b.bXg;
                this.bWw = true;
                this.bWe = false;
                this.bWp = false;
                break;
            }
            case 0xC000000: {
                this.bWE = b.bWZ;
            }
        }
    }

    public void bW(float f2) {
        this.bWh = f2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 11076: {
                this.a((gpe)dxq2);
                break;
            }
            case 8195: {
                this.b((gzp)dxq2);
                break;
            }
            case 8196: {
                this.b((gzq)dxq2);
                break;
            }
            case 8197: {
                this.a((gzu)dxq2);
                break;
            }
            case 11045: {
                this.a((grv)dxq2);
                break;
            }
            case 12548: {
                this.a((fbf)dxq2);
                break;
            }
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            case 20739: {
                this.a((fwb)dxq2);
                break;
            }
            case 12291: {
                this.Ll();
                break;
            }
            case 23561: {
                this.a((eyv)dxq2);
                break;
            }
            case 23554: {
                this.a((eym)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.getResult() != 0) {
            return;
        }
        int n = ktv2.egT();
        switch (n) {
            case 5386: {
                this.handlePhysicsCollisionSchemeInfoResponse((kvf)ktv2);
                break;
            }
            case 5379: {
                this.a((kvk)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void terminate() {
        dxq dxq2;
        this.bWo = true;
        if (!this.bWT && this.bWM != null) {
            dxq2 = (gzr)this.MessageDelegator.h(8194, this.GUID, this.bES);
            dxq2.bWM = this.bWM;
            this.MessageDelegator.F(dxq2);
        }
        if (!this.bWT && this.bWq != null) {
            dxq2 = (fbg)this.MessageDelegator.h(12547, this.GUID, this.bER);
            ((fbg)dxq2).iHR = this.GUID;
            this.MessageDelegator.F(dxq2);
            eyo eyo2 = (eyo)this.MessageDelegator.h(23556, this.GUID, this.bES);
            this.MessageDelegator.F(eyo2);
            if (this.bWI == d.bXu) {
                fvv fvv2 = (fvv)this.MessageDelegator.h(12290, this.GUID, this.bES);
                fvv2.iTm = cbx.a.ekI.ordinal();
                this.MessageDelegator.F(fvv2);
            } else {
                fpl fpl2 = (fpl)this.MessageDelegator.h(16386, this.GUID, this.bES);
                fpl2.iTm = 1;
                this.MessageDelegator.F(fpl2);
            }
        }
        if (this.bWI == d.bXu) {
            this.bWJ.a(false, this.GUID, lea.enW().getName(this.ResourceType), lea.enW().getName(this.bWj));
        }
        if (this.bWv != null) {
            this.bWv.a((bvl)this, false);
        }
        this.selfDestruct();
        this.MessageDelegator.oa(this.GUID);
    }

    @Override
    public String toString() {
        return lea.enW().getName(this.ResourceType) + " " + this.Ui + " @" + this.Position + " tracked by: " + this.bWJ;
    }

    public void au(ljq ljq2) {
        if (ljq2 == null) {
            return;
        }
        this.bWy.ex(this.Position);
        this.Position.ex(ljq2);
        this.bWB.x = this.Position.x;
        this.bWB.y = this.Position.rlV;
    }

    private void c(int n, ej ej2) {
        if (n <= 0) {
            return;
        }
        if (ej2 == null) {
            return;
        }
        if (ej2.getValue() == null) {
            return;
        }
        block0 : switch (n) {
            case 1: 
            case 2: {
                switch (ej2.getType()) {
                    case 1328: {
                        if (this.Uy()) {
                            this.bWA = false;
                            if (ej2.getValue().toString().contains("(")) {
                                this.bWA = true;
                            }
                        }
                        if (!this.UD()) break block0;
                        this.DisplayName = ej2.getValue().toString();
                        break;
                    }
                    case 352: {
                        this.aGr = ((Float)ej2.getValue()).floatValue();
                        if (!(this.bWk > 0.0f)) break block0;
                        this.bWl = this.aGr / this.bWk;
                        break;
                    }
                    case 384: {
                        this.bWs = ((Float)ej2.getValue()).floatValue();
                        if (!(this.bWt > 0.0f)) break block0;
                        this.bWu = this.bWs / this.bWt;
                        break;
                    }
                    case 400: {
                        this.bWF = ((Float)ej2.getValue()).floatValue();
                        if (!(this.bWG > 0.0f)) break block0;
                        this.bWH = this.bWF / this.bWG;
                        break;
                    }
                    case 208: {
                        this.bWP = ((Float)ej2.getValue()).floatValue();
                        break;
                    }
                    case 160: {
                        this.bWQ = ((Float)ej2.getValue()).floatValue();
                        break;
                    }
                    case 176: {
                        this.bWR = ((Float)ej2.getValue()).floatValue();
                        break;
                    }
                    case 1488: {
                        this.bWy.ex(this.Position);
                        this.Position.ex(((fc)ej2.getValue()).Position);
                        this.bWB.x = this.Position.x;
                        this.bWB.y = this.Position.rlV;
                        if (!this.bWy.ew(this.Position)) {
                            ljq ljq2 = ((fc)ej2.getValue()).Qe;
                            double d2 = this.bWJ.Jp().rgz;
                            if (lcw.emZ()) {
                                double d3 = d2 - this.bHx;
                                if (ldf.r(d3, 0.0)) {
                                    ljq2 = new ljq();
                                } else {
                                    ljq2 = ljq.z(this.Position, this.bWy);
                                    ljq2.nm((float)(1.0 / d3));
                                }
                                this.bHx = d2;
                            }
                            this.bWK.b(ljq2 == null ? new ljq() : ljq2, d2);
                        }
                        this.Rotation.X(((fc)ej2.getValue()).Rotation);
                        this.bWh = this.Rotation.eqU();
                        break;
                    }
                    case 1296: {
                        this.Qw = (Integer)ej2.getValue();
                        break;
                    }
                    case 816: {
                        this.bWc = ((Float)ej2.getValue()).floatValue();
                        break;
                    }
                    case 1344: {
                        this.bWS = (Boolean)ej2.getValue();
                        break;
                    }
                    case 11808: {
                        this.bWS = (Boolean)ej2.getValue();
                        break;
                    }
                    default: {
                        if (ej2.getType() == bVW) {
                            this.bWk = ((Float)ej2.getValue()).floatValue();
                            if (!(this.aGr > 0.0f)) break block0;
                            this.bWl = this.aGr / this.bWk;
                            break;
                        }
                        if (ej2.getType() == bVX) {
                            this.bWt = ((Float)ej2.getValue()).floatValue();
                            if (!(this.bWs > 0.0f)) break block0;
                            this.bWu = this.bWs / this.bWt;
                            break;
                        }
                        if (ej2.getType() != bVY) break block0;
                        this.bWG = ((Float)ej2.getValue()).floatValue();
                        if (!(this.bWF > 0.0f)) break block0;
                        this.bWH = this.bWF / this.bWG;
                        break;
                    }
                }
                break;
            }
            default: {
                assert (false) : "Invalid EventType provided: " + n;
                break;
            }
        }
    }

    public float UL() {
        return this.bWQ;
    }

    public float UM() {
        return this.bWR;
    }

    private void b(gzp gzp2) {
        if (gzp2.aXP <= 0) {
            return;
        }
        if (gzp2.bhp == null) {
            return;
        }
        if (!this.bWM.equals(gzp2.aO())) {
            return;
        }
        this.c(gzp2.aXP, gzp2.bhp);
    }

    private void b(gzq gzq2) {
        ej[] ejArray;
        if (gzq2.DR == null) {
            return;
        }
        if (!this.bWM.equals(gzq2.aO())) {
            return;
        }
        for (ej ej2 : ejArray = gzq2.DR) {
            this.c(1, ej2);
        }
        this.bVZ = true;
        this.bWN = true;
    }

    private void a(eym eym2) {
        this.bWo = eym2.bno != 1;
    }

    public boolean UN() {
        return this.bWJ.Jp().rgz < this.bWO;
    }

    private void a(fbf fbf2) {
        assert (fbf2 != null);
        bfn bfn2 = fbf2.iIb;
        if (bfn2 == null) {
            assert (false);
            return;
        }
        ldv ldv2 = bfn2.aYF;
        if (this.bER.equals(ldv2)) {
            return;
        }
        if (!this.bER.equals(bfn2.akX)) {
            return;
        }
        int n = bfn2.Type;
        switch (n) {
            case 8: {
                this.bWO = this.bWJ.Jp().rgz + 60.0 * (0.5 + 0.5 * Math.random());
                break;
            }
            case 2: 
            case 3: {
                if (this.UD()) {
                    anc anc2 = new anc(this.Ui, this.Ui, anc.a.bBX);
                    anc2.i(bfn2);
                    this.bWJ.b(anc2);
                    break;
                }
                ldv ldv3 = lcr.ak((ldv)ldv2, (int)this.GUID.ib());
                this.bWJ.a(this, ldv3, -((bfl)bfn2).Magnitude);
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                if (this.UB()) {
                    ldv ldv4 = lcr.ak((ldv)ldv2, (int)this.GUID.ib());
                    this.bWJ.a(this, ldv4);
                } else if (this.UD()) {
                    this.bWJ.O(n, this.az());
                }
                if (n == 5) {
                    this.bWT = true;
                }
                this.bWo = true;
                break;
            }
            case 9: {
                this.bWo = false;
                break;
            }
        }
    }

    private void a(eyv eyv2) {
        this.bWf = eyv2.iFM;
    }

    private void b(fuu fuu2) {
        if (this.bWq != null) {
            this.bES = fuu2.dtj;
            this.bER = new ldv(lcr.abP((int)this.bES.enw()), this.bES.enw(), this.bES.enx());
            this.bWJ.w(this);
            this.UP();
        }
    }

    private void Ll() {
        eyu eyu2 = (eyu)this.MessageDelegator.h(23560, this.GUID, this.bES);
        this.MessageDelegator.F(eyu2);
    }

    private void a(fwb fwb2) {
        int n = fwb2.fWT;
        switch (n) {
            case 0: {
                this.bWL = e.bXB;
                break;
            }
            default: {
                if (lea.enW().isDescendant(n, cug.fiB) || lea.enW().isDescendant(n, cug.fiD)) {
                    this.bWL = e.bXz;
                    break;
                }
                if (lea.enW().isDescendant(n, cug.fiE) || lea.enW().isDescendant(n, cug.fiC)) {
                    this.bWL = e.bXA;
                    break;
                }
                if (lea.enW().isDescendant(n, cug.fiF) || lea.enW().isDescendant(n, cug.fiu)) {
                    this.bWL = e.bXC;
                    break;
                }
                if (lea.enW().isDescendant(n, cug.fiK)) {
                    this.bWL = e.bXD;
                    break;
                }
                if (!lea.enW().isDescendant(n, cug.fmO)) break;
                this.bWL = e.bXA;
            }
        }
    }

    private void handlePhysicsCollisionSchemeInfoResponse(kvf kvf2) {
        switch (kvf2.qeC) {
            case 2: 
            case 11: {
                lhl[] lhlArray;
                float f2 = Float.MAX_VALUE;
                lhl lhl2 = null;
                for (lhl lhl3 : lhlArray = kvf2.pTu) {
                    float f3 = lhl3.mZ.y;
                    if (!(f3 < f2)) continue;
                    lhl2 = lhl3;
                    f2 = f3;
                }
                assert (lhl2 != null);
                this.bWd = lhl2.Radius;
            }
        }
    }

    private void a(kvk kvk2) {
        this.bWb = kvk2.ehn();
    }

    private void a(grv grv2) {
        ldv ldv2;
        if (!grv2.Ui.equals(this.Ui)) {
            return;
        }
        this.bWq = ldv2 = lcr.al((ldv)this.Ui, (int)grv2.dj);
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, this.Ui);
        fut2.Ib(1);
        fut2.iXu = true;
        this.MessageDelegator.F(fut2);
    }

    private void a(gzu gzu2) {
        if (gzu2.jvJ == 1) {
            // empty if block
        }
    }

    private void UO() {
        String[] stringArray = cug.uV((int)this.ResourceType).split(" ");
        this.bWD = stringArray[0];
        this.bWi = stringArray[1];
    }

    private void UP() {
        int[] nArray;
        int[] nArray2;
        assert (this.bWM == null) : "The voices.... the voices in my head! Make them stop!";
        switch (this.bWI) {
            case bXp: 
            case bXr: 
            case bXt: 
            case bXw: 
            case bXx: {
                nArray2 = new int[]{2, 5};
                nArray = new int[]{352, bVW, 1488, 1328};
                break;
            }
            case bXq: 
            case bXv: {
                nArray2 = new int[]{5, 2, 8};
                nArray = new int[]{352, bVW, 1488};
                break;
            }
            case bXs: {
                nArray2 = new int[]{5, 6, 7, 9, 2, 8};
                nArray = new int[]{352, 1328, bVW, 384, bVX, 400, bVY, 1488, 1344, 11808};
                break;
            }
            case bXu: {
                nArray2 = new int[]{2, 5, 3, 8};
                nArray = new int[]{352, bVW, 1488, 816, 208, 160, 176, 1328};
                break;
            }
            default: {
                arw.ct.error("This should never happen");
                assert (false);
                return;
            }
        }
        this.bWg = nArray2;
        this.bWa = nArray;
        this.bWM = this.MessageDelegator.bzv();
        dqi dqi2 = new dqi();
        dqi2.setGUID(this.bWM);
        dqi2.nC(this.GUID);
        dqi2.M(this.bWa);
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, this.bES);
        gzo2.jvG = dqi2;
        this.MessageDelegator.F(gzo2);
        fbb fbb2 = (fbb)this.MessageDelegator.h(12545, this.GUID, this.bER);
        fbb2.iHR = this.GUID;
        fbb2.dhI = this.bWg;
        this.MessageDelegator.F(fbb2);
        eyn eyn2 = (eyn)this.MessageDelegator.h(23555, this.GUID, this.bES);
        this.MessageDelegator.F(eyn2);
        this.bWr = true;
        if (this.bWI == d.bXu) {
            fvp fvp2 = (fvp)this.MessageDelegator.h(12289, this.GUID, this.bES);
            fvp2.iTm = cbx.a.ekI.ordinal();
            fvp2.dTe = 255;
            this.MessageDelegator.F(fvp2);
        } else {
            fpi fpi2 = (fpi)this.MessageDelegator.h(16385, this.GUID, this.bES);
            fpi2.iTm = 1;
            this.MessageDelegator.F(fpi2);
        }
    }

    void a(gpe gpe2) {
        gpf gpf2 = (gpf)this.MessageDelegator.h(11077, this.GUID, gpe2.aO());
        this.MessageDelegator.b(gpe2, gpf2);
        gpf2.Position = this.Position;
        this.MessageDelegator.F(gpf2);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.A((asv)object);
    }
}

