/*
 * Decompiled with CFR.
 */
public class bwm {
    public static final int dVn = -1;
    public static final int dVo = 1000;
    public static final float dVp = 0.0f;
    public static final float dVq = 4.0f;
    public static final float dVr = 0.0f;
    public static final double dVs = Math.PI;
    public static final float dVt = 0.0f;
    public static final double dVu = Math.PI;
    public static final float dVv = 0.0f;
    public static final float dVw = 5.0f;
    public static final float dVx = 0.0f;
    public static final float dVy = 100.0f;
    public static final float dVz = 0.0f;
    public static final float dVA = 50.0f;
    public static final float dVB = 0.0f;
    public static final float dVC = 10.0f;
    public static final float dVD = 0.0f;
    public static final float dVE = 50.0f;
    private int ResourceType = -1;
    private String dVF = "";
    private int dVG = -1;
    private String dVH = "";
    private int dVI = -1;
    private float dVJ = -1.0f;
    private int dVK = -1;
    private int dVL = -1;
    private float dir = -1.0f;
    private int dVM = -1;
    private float dVN = 0.0f;
    private float dVO = 0.0f;
    private float dVP = 0.0f;
    private float dVQ = 0.0f;
    private float dVR = 0.0f;
    private float akO = -1.0f;
    private float dVS = 0.0f;
    private float dVT = 0.0f;
    private float dVU = 0.0f;
    private String dVV = "";
    private String dVW = "";
    private String dVX = "";
    private String dVY = "";
    private String dVZ = "";
    private String dWa = "";
    private String dWb = "";
    private String dWc = "";
    private String dWd = "";
    private int dWe = -1;
    private int dWf = -1;
    private int dWg = -1;
    private int dWh = -1;
    private int dWi = -1;
    private int dWj = -1;
    private int dWk = -1;
    private int dWl = -1;
    private boolean dWm = false;

    public void EM() {
        this.dWe = del.dr(this.dVV);
        if (this.dWe <= 0) assert (false);
        this.dWf = del.dr(this.dVW);
        if (this.dWf <= 0) assert (false);
        this.dWg = del.dr(this.dVX);
        if (this.dWg <= 0) assert (false);
        this.dWh = del.dr(this.dVY);
        if (this.dWh <= 0) assert (false);
        this.dWi = del.dr(this.dVZ);
        if (this.dWi <= 0) assert (false);
        this.dWj = del.dr(this.dWa);
        if (this.dWj <= 0) assert (false);
        this.dWl = this.dWd != null && !this.dWd.equals("") ? del.dr(this.dWd) : -1;
        this.dVG = cpd.hL(this.dVF);
        if (this.dVG <= 0) assert (false);
        if (this.dWb != "") {
            this.dWk = del.dr(this.dWb);
            if (this.dWk <= 0) assert (false);
        }
    }

    public float aou() {
        return this.dir;
    }

    public void cN(float f2) {
        this.dir = f2;
    }

    public int aBA() {
        return this.dVK;
    }

    public void nt(int n) {
        this.dVK = n;
    }

    public float aBB() {
        return this.dVJ;
    }

    public void ds(float f2) {
        this.dVJ = f2;
    }

    public int aBC() {
        return this.dVI;
    }

    public void nu(int n) {
        this.dVI = n;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public String aBD() {
        return this.dVH;
    }

    public void gt(String string) {
        this.dVH = string;
    }

    public float aBE() {
        return this.dVQ;
    }

    public void dt(float f2) {
        this.dVQ = f2;
    }

    public int aBF() {
        return this.dVM;
    }

    public void nv(int n) {
        this.dVM = n;
    }

    public float aBG() {
        return this.dVN;
    }

    public void du(float f2) {
        this.dVN = f2;
    }

    public float aBH() {
        return this.dVP;
    }

    public void dv(float f2) {
        this.dVP = f2;
    }

    public float aBI() {
        return this.dVO;
    }

    public void dw(float f2) {
        this.dVO = f2;
    }

    public float aBJ() {
        return this.dVR;
    }

    public void dx(float f2) {
        this.dVR = f2;
    }

    public int aBK() {
        return this.dVL;
    }

    public void nw(int n) {
        this.dVL = n;
    }

    public String aBL() {
        return this.dVW;
    }

    public void gu(String string) {
        this.dVW = string;
    }

    public String aBM() {
        return this.dVX;
    }

    public void gv(String string) {
        this.dVX = string;
    }

    public String aBN() {
        return this.dVV;
    }

    public void gw(String string) {
        this.dVV = string;
    }

    public String aBO() {
        return this.dVY;
    }

    public void gx(String string) {
        this.dVY = string;
    }

    public String aBP() {
        return this.dVZ;
    }

    public void gy(String string) {
        this.dVZ = string;
    }

    public String aBQ() {
        return this.dWa;
    }

    public void gz(String string) {
        this.dWa = string;
    }

    public int aBR() {
        return this.dWf;
    }

    public int aBS() {
        return this.dWi;
    }

    public int aBT() {
        return this.dWj;
    }

    public int aBU() {
        return this.dWg;
    }

    public int aBV() {
        return this.dWh;
    }

    public int aBW() {
        return this.dWe;
    }

    public int aBX() {
        return this.dVG;
    }

    public String aBY() {
        return this.dVF;
    }

    public void gA(String string) {
        this.dVF = string;
    }

    public boolean aBZ() {
        return this.dWm;
    }

    public void eZ(boolean bl) {
        this.dWm = bl;
    }

    public String aCa() {
        return this.dWb;
    }

    public void gB(String string) {
        this.dWb = string;
    }

    public int aCb() {
        return this.dWk;
    }

    public void nx(int n) {
        this.dWk = n;
    }

    public float aCc() {
        return this.akO;
    }

    public void dy(float f2) {
        this.akO = f2;
    }

    public float aCd() {
        return this.dVS;
    }

    public void dz(float f2) {
        this.dVS = f2;
    }

    public float aCe() {
        return this.dVT;
    }

    public void dA(float f2) {
        this.dVT = f2;
    }

    public String aCf() {
        return this.dWc;
    }

    public void gC(String string) {
        this.dWc = string;
    }

    public float aCg() {
        return this.dVU;
    }

    public void dB(float f2) {
        this.dVU = f2;
    }

    public final String aCh() {
        return this.dWd;
    }

    public final void gD(String string) {
        this.dWd = string;
    }

    public final int aCi() {
        return this.dWl;
    }
}

