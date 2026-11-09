/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iny
extends ioa {
    private static final String mnp = "XPos";
    private static final String mnq = "YPos";
    private static final String mnr = "DisplayWidth";
    private static final String mns = "DisplayHeight";
    private static final String mnt = "SnapLeft";
    private static final String mnu = "SnapTop";
    private static final String mnv = "SnapRight";
    private static final String mnw = "SnapBottom";
    private static final int mcj = 16;
    private boolean mnx;
    private boolean mny;
    private boolean mnz;
    private boolean mnA;
    private int loG;
    private int loH;
    private float mnB = 0.0f;
    private float mnC = 0.0f;
    private float mnD = 0.0f;
    private float mnE = 0.0f;
    private float mnF = 0.0f;
    private float mnG = 0.0f;
    private float mnH = 0.0f;
    private float mnI = 0.0f;
    private boolean mnJ;
    private boolean mnK = false;
    private boolean mnL = false;
    private boolean mnM = false;

    public iny(String string, String string2) {
        super(string, string2);
        this.a(mnp, hsu.ldg, Float.valueOf(0.0f));
        this.a(mnq, hsu.ldg, Float.valueOf(0.0f));
        this.a(mnr, hsu.ldg, Float.valueOf(0.0f));
        this.a(mns, hsu.ldg, Float.valueOf(0.0f));
        this.a(mnt, hsu.ldg, false);
        this.a(mnu, hsu.ldg, false);
        this.a(mnv, hsu.ldg, false);
        this.a(mnw, hsu.ldg, false);
    }

    @Override
    public void initialize() {
        super.initialize();
        iny.cyJ().z((hyn)this);
        if (this.mnJ) {
            this.mnJ = false;
            this.q(mnt, this.mnx);
            this.q(mnu, this.mny);
            this.q(mnv, this.mnz);
            this.q(mnw, this.mnA);
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        iny.cyJ().A((hyn)this);
    }

    public boolean dhr() {
        return this.mnx;
    }

    public void qU(boolean bl) {
        if (bl == this.mnx) {
            return;
        }
        this.mnx = bl;
        if (this.isInitialized()) {
            this.q(mnt, this.mnx);
        } else {
            this.mnJ = true;
        }
        if (iny.cyJ() != null) {
            iny.cyJ().updateLayout();
        }
    }

    public boolean dhs() {
        return this.mny;
    }

    public void qV(boolean bl) {
        if (bl == this.mny) {
            return;
        }
        this.mny = bl;
        if (this.isInitialized()) {
            this.q(mnu, this.mny);
        } else {
            this.mnJ = true;
        }
        if (iny.cyJ() != null) {
            iny.cyJ().updateLayout();
        }
    }

    public boolean dht() {
        return this.mnz;
    }

    public void qW(boolean bl) {
        if (bl == this.mnz) {
            return;
        }
        this.mnz = bl;
        if (this.isInitialized()) {
            this.q(mnv, this.mnz);
        } else {
            this.mnJ = true;
        }
        if (iny.cyJ() != null) {
            iny.cyJ().updateLayout();
        }
    }

    public boolean dhu() {
        return this.mnA;
    }

    public void qX(boolean bl) {
        if (bl == this.mnA) {
            return;
        }
        this.mnA = bl;
        if (this.isInitialized()) {
            this.q(mnw, this.mnA);
        } else {
            this.mnJ = true;
        }
        if (iny.cyJ() != null) {
            iny.cyJ().updateLayout();
        }
    }

    public boolean cXV() {
        return true;
    }

    public boolean cXW() {
        return true;
    }

    public void dhv() {
        this.mnL = true;
        this.dhz();
    }

    public void Z(float f, float f2) {
        this.R(f, f2);
        this.dhv();
    }

    public void aa(float f, float f2) {
        this.g(this.cEE(), this.cEF(), f, f2);
        this.dhv();
    }

    public void h(float f, float f2, float f3, float f4) {
        this.g(f, f2, f3, f4);
        this.dhv();
    }

    public void cFN() {
        joa joa2 = this.dhA();
        this.Z(joa2.X + joa2.W / 2.0f - this.cFw() / 2.0f, joa2.Y + joa2.H / 2.0f - this.cFx() / 2.0f);
    }

    public boolean dhw() {
        return this.mnM;
    }

    public void qY(boolean bl) {
        this.mnM = bl;
    }

    protected void cEq() {
        if (!this.dhV()) {
            return;
        }
        if (this.mnH == 0.0f) {
            this.mnF = this.cEE();
            this.mnG = this.cEF();
            this.mnH = this.cFw();
            this.mnI = this.cFx();
        }
        float f = this.mnF;
        float f2 = this.mnG;
        float f3 = Math.max(this.mnH, this.cFy());
        float f4 = Math.max(this.mnI, this.cFz());
        f += (float)(this.cXH() + this.dhP());
        f2 += (float)(this.cXI() + this.dhQ());
        f3 -= (float)(this.cXH() + this.dhN() + this.dhP() + this.dhR());
        f4 -= (float)(this.cXI() + this.dhO() + this.dhQ() + this.dhS());
        joa joa2 = this.dhA();
        if (joa2 == null) {
            return;
        }
        if (this.mnx) {
            f = joa2.X;
        } else if (this.mnz) {
            f = joa2.X + joa2.W - f3;
        }
        if (this.mny) {
            f2 = joa2.Y;
        } else if (this.mnA) {
            f2 = joa2.Y + joa2.H - f4;
        }
        if (f + f3 > joa2.X + joa2.W) {
            f = joa2.W - f3;
        }
        if (f < joa2.X) {
            f = joa2.X;
        }
        if (f2 + f4 > joa2.Y + joa2.H) {
            f2 = joa2.H - f4;
        }
        if (f2 < joa2.Y) {
            f2 = joa2.Y;
        }
        if (f3 < this.cFy() - (float)this.cXH() - (float)this.dhN() - (float)this.dhP() - (float)this.dhR() && f + (f3 = this.cFy()) > joa2.X + joa2.W) {
            f = joa2.X + joa2.W - f3;
        }
        if (f4 < this.cFz() - (float)this.cXI() - (float)this.dhO() - (float)this.dhQ() - (float)this.dhS() && f2 + (f4 = this.cFz()) > joa2.Y + joa2.H) {
            f2 = joa2.Y + joa2.H - f4;
        }
        boolean bl = (f -= (float)(this.cXH() + this.dhP())) != this.cEE() || (f2 -= (float)(this.cXI() + this.dhQ())) != this.cEF() || (f3 += (float)(this.cXH() + this.dhN() + this.dhP() + this.dhR())) != this.cFw() || (f4 += (float)(this.cXI() + this.dhO() + this.dhQ() + this.dhS())) != this.cFx();
        this.g(f, f2, f3, f4);
        if (bl) {
            this.dhz();
        }
    }

    protected void dH(int n, int n2) {
        this.loG = n;
        this.loH = n2;
        this.dhy();
    }

    protected void dI(int n, int n2) {
        int n3 = n - this.loG;
        int n4 = n2 - this.loH;
        this.loG = n;
        this.loH = n2;
        this.ab(this.mnB + (float)n3, this.mnC + (float)n4);
    }

    protected void dJ(int n, int n2) {
    }

    protected void ee(int n, int n2) {
        this.loG = n;
        this.loH = n2;
        this.dhy();
    }

    protected void ef(int n, int n2) {
        int n3 = this.cXV() ? n - this.loG : 0;
        int n4 = this.cXW() ? n2 - this.loH : 0;
        this.loG = n;
        this.loH = n2;
        this.ac(this.mnD + (float)n3, this.mnE + (float)n4);
    }

    protected void eg(int n, int n2) {
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.mnK = true;
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        this.mnF = this.ni(mnp).floatValue();
        this.mnG = this.ni(mnq).floatValue();
        this.mnH = this.ni(mnr).floatValue();
        this.mnI = this.ni(mns).floatValue();
        this.g(this.mnF, this.mnG, this.mnH, this.mnI);
        this.qU(this.nk(mnt));
        this.qV(this.nk(mnu));
        this.qW(this.nk(mnv));
        this.qX(this.nk(mnw));
    }

    @Override
    protected void cEb() {
        super.cEb();
        this.dhz();
    }

    @Override
    protected void cCw() {
        super.cCw();
        this.dhz();
    }

    @Override
    protected void dhx() {
        this.mnL = true;
        super.dhx();
    }

    @Override
    protected void cKg() {
        this.mnL = true;
        super.cKg();
        this.cEq();
    }

    private void dhy() {
        this.mnB = this.cEE();
        this.mnC = this.cEF();
        this.mnD = this.cFw();
        this.mnE = this.cFx();
    }

    private void ab(float f, float f2) {
        this.a(f, f2, this.mnD, this.mnE, true);
    }

    private void ac(float f, float f2) {
        this.a(this.mnB, this.mnC, f, f2, false);
    }

    private void a(float f, float f2, float f3, float f4, boolean bl) {
        if (f == this.mnB && f2 == this.mnC && f3 == this.mnD && f4 == this.mnE) {
            return;
        }
        this.mnB = f;
        this.mnC = f2;
        this.mnD = f3;
        this.mnE = f4;
        f += (float)(this.cXH() + this.dhP());
        f2 += (float)(this.cXI() + this.dhQ());
        f3 -= (float)(this.cXH() + this.dhN() + this.dhP() + this.dhR());
        f4 -= (float)(this.cXI() + this.dhO() + this.dhQ() + this.dhS());
        joa joa2 = this.dhA();
        if (f - joa2.X <= 16.0f) {
            f = joa2.X;
            this.mnx = true;
        } else {
            this.mnx = false;
        }
        if (f2 - joa2.Y <= 16.0f) {
            f2 = joa2.Y;
            this.mny = true;
        } else {
            this.mny = false;
        }
        if (joa2.X + joa2.W - f - f3 <= 16.0f) {
            if (bl) {
                f = joa2.X + joa2.W - f3;
            } else {
                f3 = joa2.X + joa2.W - f;
            }
            this.mnz = true;
        } else {
            this.mnz = false;
        }
        if (joa2.Y + joa2.H - f2 - f4 <= 16.0f) {
            if (bl) {
                f2 = joa2.Y + joa2.H - f4;
            } else {
                f4 = joa2.Y + joa2.H - f2;
            }
            this.mnA = true;
        } else {
            this.mnA = false;
        }
        this.mnF = f -= (float)(this.cXH() + this.dhP());
        this.mnG = f2 -= (float)(this.cXI() + this.dhQ());
        this.mnH = f3 += (float)(this.cXH() + this.dhN() + this.dhP() + this.dhR());
        this.mnI = f4 += (float)(this.cXI() + this.dhO() + this.dhQ() + this.dhS());
        this.g(f, f2, f3, f4);
        this.dhz();
        this.q(mnt, this.mnx);
        this.q(mnu, this.mny);
        this.q(mnv, this.mnz);
        this.q(mnw, this.mnA);
    }

    private void dhz() {
        if (this.mnK) {
            if (this.mnL) {
                this.mnL = false;
                this.mnF = this.cEE();
                this.mnG = this.cEF();
                this.mnH = this.cFw();
                this.mnI = this.cFx();
            }
            this.d(mnp, this.cEE());
            this.d(mnq, this.cEF());
            this.d(mnr, this.cFw());
            this.d(mns, this.cFx());
        }
    }

    private joa dhA() {
        if (iny.cyJ() == null) {
            return null;
        }
        return !this.mnM ? iny.cyJ().cIA() : iny.cyJ().cIB();
    }
}

