/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  hvy
 *  hzo
 */
public class hwd {
    private int gLx = -1;
    private cjx eFl = null;
    private ckd eFm = null;
    private String lhA = null;
    private String lhB = null;
    private String lhC = null;
    private String lhD = null;
    private String lhE = null;
    private double lhF = -1.0;
    private float bWF = -1.0f;
    private float bWG = -1.0f;
    private float aGr = -1.0f;
    private float bWk = -1.0f;
    private float bWs = -1.0f;
    private float bWt = -1.0f;
    private float lhG = -1.0f;
    private float lhH = -1.0f;
    private float bWP = -1.0f;
    private float bWQ = -1.0f;
    private float lhI = -1.0f;
    private float bWR = -1.0f;
    private int lhJ = -1;
    private int lhK = -1;
    private int lhL = -1;
    private int lhM = -1;
    private int lhN = -1;
    private int lhO = -1;
    private int lhP = -1;
    private int lhQ = -1;
    private float lhR = -1.0f;
    private float lhS = -1.0f;
    private float lhT = -1.0f;
    private float lhU = -1.0f;
    private float lhV = -1.0f;
    private int lhW = -1;
    private int jhe = 0;
    private int jhf = 0;
    private ep.b lhX = ep.b.Pj;
    private int lhY = 0;
    private int lhZ = 0;
    private boolean lia = false;
    private int lib = 0;
    private int lic = 0;
    private int lid = 0;
    private int lie = 0;
    private int lif = 0;
    private String jbc = "";
    private String jbd = "";
    private String aCW = "";
    private boolean Zd = false;
    private double Ze = 0.0;
    private float lig = 0.0f;
    private final hvy lih;

    public hwd(hvy hvy2) {
        this.lih = hvy2;
    }

    public void r(ej ej2) {
        switch (ej2.getType()) {
            case 352: {
                this.aGr = ((et)ej2).fN();
                break;
            }
            case 354: {
                this.bWk = ((et)ej2).fN();
                break;
            }
            case 400: {
                this.bWF = ((et)ej2).fN();
                break;
            }
            case 402: {
                this.bWG = ((et)ej2).fN();
                break;
            }
            case 384: {
                this.bWs = ((et)ej2).fN();
                break;
            }
            case 386: {
                this.bWt = ((et)ej2).fN();
                break;
            }
            case 11552: {
                String string = ((ff)ej2).getStringValue();
                this.eFl = lea.epx().hu(string);
                break;
            }
            case 11536: {
                String string = ((ff)ej2).getStringValue();
                cke cke2 = cke.getValueByName(string);
                if (this.eFl == null || cke2 == null) break;
                this.eFm = this.eFl.aQx().get(cke2.aOK());
                break;
            }
            case 11568: {
                this.lhA = ((ff)ej2).getStringValue();
                break;
            }
            case 11600: {
                float f2 = ((et)ej2).fN();
                this.lhC = lea.epw().a(f2, 2576, ckj.eGH);
                break;
            }
            case 11632: {
                float f3 = ((et)ej2).fN();
                this.lhE = lea.epw().a(f3, 3360, ckj.eGI);
                break;
            }
            case 11584: {
                float f4 = ((et)ej2).fN();
                this.lhB = lea.epw().a(f4, 5232, ckj.eGG);
                break;
            }
            case 11616: {
                float f5 = ((et)ej2).fN();
                this.lhD = lea.epw().a(f5, 5744, ckj.eGJ);
                break;
            }
            case 9712: {
                this.jbc = ((ff)ej2).getStringValue();
                break;
            }
            case 9728: {
                this.jbd = ((ff)ej2).getStringValue();
                break;
            }
            case 12048: {
                float f6 = ((et)ej2).fN();
                if (f6 > this.lhH && this.lhH != -1.0f) {
                    hso.cxK().cxP().cyZ().kd(f6 - this.lhH);
                }
                this.lhH = f6;
                break;
            }
            case 208: {
                this.bWP = ((et)ej2).fN();
                break;
            }
            case 160: {
                this.bWQ = ((et)ej2).fN();
                break;
            }
            case 240: {
                this.lhI = ((et)ej2).fN();
                break;
            }
            case 176: {
                this.bWR = ((et)ej2).fN();
                break;
            }
            case 12816: {
                this.jhe = ((ew)ej2).fQ();
                break;
            }
            case 12832: {
                this.jhf = ((ew)ej2).fQ();
                break;
            }
            case 13120: {
                this.lhX = ep.b.getValueFromOrdinal(((ew)ej2).fQ());
                break;
            }
            case 13152: {
                this.lib = ((ew)ej2).fQ();
                break;
            }
            case 13168: {
                this.lic = ((ew)ej2).fQ();
                break;
            }
            case 13136: {
                this.lia = ((eq)ej2).getBooleanValue();
                break;
            }
            case 12912: {
                this.lhY = ((ew)ej2).fQ();
                break;
            }
            case 9872: {
                int n = ((ew)ej2).fQ();
                hzo hzo2 = this.lih.cyJ();
                if (hzo2 == null) break;
                hzo2.cHZ().OT(n);
                break;
            }
            case 10400: {
                int n = ((ew)ej2).fQ();
                hzo hzo3 = this.lih.cyJ();
                if (hzo3 != null) {
                    hzo3.cHZ().OU(n);
                }
                this.lih.lgw.V(n);
                break;
            }
            case 11872: {
                this.lhG = ((et)ej2).fN();
                this.lih.cAn();
                break;
            }
            case 1136: {
                this.gLx = ((ew)ej2).fQ();
                if (this.gLx != hc.aaP.ordinal()) break;
                kqf kqf2 = (kqf)this.lih.getMessageDelegator().h(3841);
                kqf2.ec = this.lih.getGUID();
                kqf2.hsP = false;
                kqf2.iBr = false;
                kqf2.pse = 2048;
                this.lih.getMessageDelegator().a(kqf2);
                break;
            }
            case 12896: {
                this.lhF = ((ew)ej2).fQ();
                break;
            }
            case 12928: {
                this.lhZ = ((ew)ej2).fQ();
                break;
            }
            case 13232: {
                this.lid = ((ew)ej2).fQ();
                break;
            }
            case 13312: {
                this.lhJ = ((ew)ej2).fQ();
                break;
            }
            case 13328: {
                this.lhK = ((ew)ej2).fQ();
                break;
            }
            case 13344: {
                this.lhL = ((ew)ej2).fQ();
                break;
            }
            case 13360: {
                this.lhM = ((ew)ej2).fQ();
                break;
            }
            case 13376: {
                this.lhN = ((ew)ej2).fQ();
                break;
            }
            case 13392: {
                this.lhO = ((ew)ej2).fQ();
                break;
            }
            case 13408: {
                this.lhP = ((ew)ej2).fQ();
                break;
            }
            case 13424: {
                this.lhQ = ((ew)ej2).fQ();
                break;
            }
            case 13248: {
                this.lhR = ((et)ej2).fN();
                break;
            }
            case 13264: {
                this.lhS = ((et)ej2).fN();
                break;
            }
            case 14128: {
                this.lhT = ((et)ej2).fN();
                break;
            }
            case 13296: {
                this.lhU = ((et)ej2).fN();
                break;
            }
            case 13280: {
                this.lhV = ((et)ej2).fN();
                break;
            }
            case 13488: {
                this.lif = ((ew)ej2).fQ();
                break;
            }
            case 13536: {
                this.lhW = (int)((et)ej2).fN();
                break;
            }
            case 13600: {
                this.aCW = ((ff)ej2).getStringValue();
                break;
            }
            case 13664: {
                boolean bl = this.Zd;
                this.Zd = ((eq)ej2).getBooleanValue();
                if (bl == this.Zd) break;
                this.lih.qt();
                break;
            }
            case 13680: {
                this.Ze = ((er)ej2).fC();
                break;
            }
            case 13648: {
                this.lig = ((et)ej2).fN();
                break;
            }
        }
    }

    public float Oy(int n) {
        switch (n) {
            case 208: {
                return this.bWP;
            }
            case 160: {
                return this.bWQ;
            }
            case 176: {
                return this.bWR;
            }
            case 240: {
                return this.lhI;
            }
            case 13248: {
                return this.lhR;
            }
            case 13296: {
                return this.lhU;
            }
            case 13280: {
                return this.lhV;
            }
            case 13264: {
                return this.lhS;
            }
            case 14128: {
                return this.lhT;
            }
        }
        return 0.0f;
    }

    public int Ow(int n) {
        switch (n) {
            case 13120: {
                return this.lhX.ordinal();
            }
            case 13168: {
                return this.lic;
            }
            case 13152: {
                return this.lib;
            }
            case 12912: {
                return this.lhY;
            }
            case 13312: {
                return this.lhJ;
            }
            case 13328: {
                return this.lhK;
            }
            case 13344: {
                return this.lhL;
            }
            case 13360: {
                return this.lhM;
            }
            case 13376: {
                return this.lhN;
            }
            case 13392: {
                return this.lhO;
            }
            case 13408: {
                return this.lhP;
            }
            case 13424: {
                return this.lhQ;
            }
            case 13536: {
                return this.lhW;
            }
        }
        return 0;
    }

    public boolean Ox(int n) {
        switch (n) {
            case 13136: {
                return this.lia;
            }
        }
        return false;
    }

    public float OA(int n) {
        if (!ep.aT((int)n)) {
            return 0.0f;
        }
        switch (n) {
            case 208: {
                ckk ckk2 = lea.epw().hz(this.lhB);
                return ckk2 != null ? ckk2.rf(5232) : 0.0f;
            }
            case 160: {
                ckk ckk3 = lea.epw().hz(this.lhC);
                return ckk3 != null ? ckk3.rf(2576) : 0.0f;
            }
            case 240: {
                ckk ckk4 = lea.epw().hz(this.lhD);
                return ckk4 != null ? ckk4.rf(5744) : 0.0f;
            }
            case 176: {
                ckk ckk5 = lea.epw().hz(this.lhE);
                return ckk5 != null ? ckk5.rf(3360) : 0.0f;
            }
        }
        return 0.0f;
    }

    public float Um() {
        return this.bWF;
    }

    public float Un() {
        return this.bWG;
    }

    public float Ua() {
        return this.aGr;
    }

    public float Ub() {
        return this.bWk;
    }

    public float Uf() {
        return this.bWs;
    }

    public float Ug() {
        return this.bWt;
    }

    public final cjx ki() {
        return this.eFl;
    }

    public final ckd kj() {
        return this.eFm;
    }

    public final String Oz(int n) {
        switch (n) {
            case 2576: {
                return this.lhC;
            }
            case 5744: {
                return this.lhD;
            }
            case 5232: {
                return this.lhB;
            }
            case 3360: {
                return this.lhE;
            }
        }
        return this.lhA;
    }

    public int cAz() {
        return this.lie;
    }

    public int cAA() {
        return this.lif;
    }

    public int akj() {
        return (int)this.lhG;
    }

    public int abF() {
        return (int)this.lhH;
    }

    public float bnS() {
        return this.bWP;
    }

    public int cAy() {
        return (int)this.lig;
    }

    public float cAF() {
        return this.bWQ;
    }

    public float cAG() {
        return this.lhI;
    }

    public float cAH() {
        return this.bWR;
    }

    public String cAt() {
        return this.jbc;
    }

    public String cAu() {
        return this.jbd;
    }

    public String cAU() {
        return cg.c(this.jbc, this.jbd);
    }

    public boolean cAw() {
        return this.gLx >= hc.aaA.ordinal();
    }

    public int cAv() {
        return this.gLx;
    }

    public int cAV() {
        return this.jhe;
    }

    public int cAW() {
        return this.jhf;
    }

    public int cAB() {
        return this.jhe + this.jhf;
    }

    public int cAK() {
        return this.lib;
    }

    public int cAJ() {
        return this.lic;
    }

    public final ep.b cAI() {
        return this.lhX;
    }

    public int cAX() {
        return this.lhY;
    }

    public double cAC() {
        return this.lhF;
    }

    public int cAE() {
        return this.lhZ;
    }

    public int cAY() {
        return this.lid;
    }

    public void da(double d2) {
        this.lhF += d2;
    }

    public void OE(int n) {
        this.lie += n;
    }

    public void OF(int n) {
        this.lie -= n;
    }

    public void Bb(int n) {
        this.lie = n;
    }

    public String cAZ() {
        return this.aCW;
    }

    public boolean nR(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (!this.aCW.toLowerCase().contains(string.toLowerCase())) {
            return false;
        }
        if (this.aCW.equalsIgnoreCase(string)) {
            return true;
        }
        return this.aCW.toLowerCase().endsWith(string.toLowerCase()) || this.aCW.toLowerCase().contains(string.toLowerCase() + ",");
    }

    public boolean kv() {
        return this.Zd;
    }

    public double kw() {
        return this.Ze;
    }
}

