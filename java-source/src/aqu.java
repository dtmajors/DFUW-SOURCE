/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public abstract class aqu {
    public a bKZ;
    private float bLa;
    protected int bLb = 0;
    protected int bLc = 0;
    protected anf bFP;
    protected double bLd;
    protected double bLe;
    protected float bLf;
    protected double bLg;
    protected c bLh;
    protected float bLi;
    protected float bLj;
    protected float bLk = Float.MAX_VALUE;
    protected float bLl = Float.MAX_VALUE;
    protected ljp bLm = new ljp();
    protected ljq bLn = new ljq();
    protected ljq bLo = new ljq();
    protected double bLp = 4.0;
    protected boolean bLq = false;
    protected boolean bLr = false;
    b bLs;
    private int bLt = 0;
    private int bLu = 2;

    public aqu() {
        this.bLh = c.bNO;
    }

    public boolean Pz() {
        return this.bLq;
    }

    public void PA() {
        ++this.bLb;
    }

    public void PB() {
        ++this.bLc;
    }

    public boolean IN() {
        if (this.c(0.0, 0.9)) {
            return false;
        }
        return this.bFP.IN();
    }

    public boolean IO() {
        if (this.b(0.0, 0.9)) {
            return false;
        }
        return this.bFP.IO();
    }

    public boolean IP() {
        if (this.b(0.0, 0.9)) {
            return false;
        }
        return this.bFP.IP();
    }

    public boolean IQ() {
        if (this.b(0.0, 0.9)) {
            return false;
        }
        return this.bFP.IQ();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof aqu)) {
            return false;
        }
        aqu aqu2 = (aqu)object;
        return !(this.bLs == null ? aqu2.bLs != null : !this.bLs.equals((Object)aqu2.bLs));
    }

    public boolean c(ljq ljq2, boolean bl) {
        return false;
    }

    public abstract boolean execute();

    public abstract ljq Pp();

    public void end() {
    }

    public void O(double d2) {
    }

    public int PC() {
        return this.bLb;
    }

    public int PD() {
        return this.bLc;
    }

    public a PE() {
        return this.bKZ;
    }

    public ljq PF() {
        return this.bLn;
    }

    public float PG() {
        return this.bLk;
    }

    public double PH() {
        return this.bLp;
    }

    public b PI() {
        return this.bLs;
    }

    public boolean PJ() {
        return this.b(this.bLm, true);
    }

    public boolean PK() {
        if (this.bLt == 0) {
            this.bLt = this.bFP.Jp().lpr + this.bLu;
            return false;
        }
        if (this.bLt > this.bFP.Jp().lpr) {
            return false;
        }
        this.bLt = 0;
        return true;
    }

    public boolean PL() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLw;
        this.bFP.bCL.OE();
        this.bKZ = a2;
        return true;
    }

    public boolean PM() {
        if (this.bFP.bCK == null) {
            return false;
        }
        a a2 = a.bLw;
        this.bFP.bCK.OE();
        this.bKZ = a2;
        return true;
    }

    public boolean bC(float f) {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLx;
        float f2 = 1.0f;
        if (this.bKZ == a2) {
            f2 = 1.5f;
        }
        if (this.bLk > f2 * f) {
            return false;
        }
        if (!this.bFP.IZ().Ly().Uy() && !this.bFP.IZ().Ly().UA() && (double)this.bLf > 0.3) {
            return false;
        }
        if (this.b(0.8, 1.0)) {
            return false;
        }
        boolean bl = false;
        this.bFP.bCL.OE();
        if (this.bLk < f) {
            if (this.bFP.JR()) {
                if (this.b(0.0, 0.4)) {
                    bl = this.bFP.bCL.OT();
                }
            } else {
                double d2 = 0.2;
                double d3 = 0.4;
                double d4 = 0.6;
                if (this.bFP.IZ().Ly().Uy() || this.bFP.IZ().Ly().UA()) {
                    d2 = 0.35;
                    d3 = 0.7;
                    d4 = 0.9;
                }
                if (this.b(0.0, d2)) {
                    bl = this.bFP.bCL.OZ();
                }
                if (this.b(d2, d3)) {
                    bl = this.bFP.bCL.OX();
                }
                if (this.b(d3, d4)) {
                    bl = this.bFP.bCL.OT();
                }
            }
        }
        if (!bl) {
            this.bFP.stop();
        }
        this.bKZ = a2;
        return true;
    }

    public boolean PN() {
        if (!(this.bFP.Ji().LV() || this.bFP.Ji().LX() || this.bFP.Ji().LU())) {
            return false;
        }
        a a2 = a.bLy;
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean PO() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (!this.bFP.a(this.bFP.IZ().bu(4.0f))) {
            return false;
        }
        this.bFP.Ij();
        return false;
    }

    public boolean v(asv asv2) {
        if (asv2 == null) {
            return false;
        }
        if (this.bFP.bCL == null) {
            return false;
        }
        if (!this.bFP.a(asv2)) {
            return false;
        }
        this.bFP.Ij();
        this.bFP.bCL.ar(asv2.av());
        return true;
    }

    public boolean PP() {
        if (this.b(0.0, 0.6)) {
            return false;
        }
        asv asv2 = this.bFP.IZ().Ly();
        switch (this.bLs) {
            case bMt: {
                this.bFP.a(asf.a.bTO);
                return true;
            }
            case bMe: 
            case bMr: 
            case bMM: 
            case bMN: 
            case bMT: 
            case bMs: 
            case bMF: 
            case bMG: 
            case bNc: 
            case bMK: 
            case bMw: 
            case bMh: 
            case bMg: 
            case bMf: 
            case bMP: 
            case bNb: 
            case bMz: 
            case bMO: 
            case bNr: 
            case bNg: {
                float f;
                if (asv2 == null) {
                    return false;
                }
                float f2 = this.bFP.Jl().Uc();
                if (f2 >= (f = asv2.Uc()) * 1.05f) {
                    this.bFP.a(asf.a.bTU);
                } else if (f2 * 1.05f <= f) {
                    this.bFP.a(asf.a.bTP);
                }
                return true;
            }
            case bMd: 
            case bMc: 
            case bNf: 
            case bMI: 
            case bMv: 
            case bMA: {
                this.bFP.a(asf.a.bTR);
                return true;
            }
            case bMR: 
            case bMu: 
            case bMp: 
            case bME: 
            case bNe: {
                this.bFP.a(asf.a.bTW);
                return true;
            }
            case bMU: 
            case bNh: 
            case bNi: {
                this.bFP.a(asf.a.bTQ);
                return true;
            }
            case bMH: 
            case bNs: 
            case bMS: 
            case bMB: 
            case bMC: 
            case bNa: 
            case bML: 
            case bMJ: 
            case bMx: 
            case bMy: {
                this.bFP.a(asf.a.bTX);
                return true;
            }
            case bMq: {
                this.bFP.a(asf.a.bTV);
                return true;
            }
        }
        return false;
    }

    public boolean PQ() {
        if (!this.bFP.Ji().HT()) {
            return false;
        }
        return this.b(this.bFP.IR(), false);
    }

    public boolean PR() {
        if (!this.bFP.Ji().HT()) {
            return false;
        }
        return this.b(this.bFP.IR(), true);
    }

    public boolean PS() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLA;
        if (this.bFP.d(this.bFP.IZ().Ly()) && this.bFP.IZ().f(this.bLi, this.bLl)) {
            this.bFP.Ig();
            this.bFP.d(false, false);
        }
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean PT() {
        if (!this.bFP.Ji().HT()) {
            return false;
        }
        return this.b(this.bFP.IS(), true);
    }

    public boolean PU() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (this.bFP.JQ()) {
            return false;
        }
        if (this.bFP.JS()) {
            return false;
        }
        if (this.bFP.IZ().Ly() == null) {
            return false;
        }
        if (!this.bFP.IZ().Ls()) {
            return false;
        }
        if (this.bLk < 4.0f) {
            return false;
        }
        if (this.bLk > 16.0f) {
            return false;
        }
        if (this.b(0.0, 0.8)) {
            return false;
        }
        return this.bFP.IM();
    }

    public boolean PV() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (!this.bFP.IM()) {
            return false;
        }
        this.Qs();
        if (!this.bFP.JR()) {
            double d2 = -Math.PI + Math.PI * 2 * this.bLd;
            this.bFP.bCL.bz((float)d2);
        }
        this.bFP.stop();
        return true;
    }

    public boolean bF(boolean bl) {
        if (this.bFP.bCK == null) {
            return false;
        }
        a a2 = a.bLB;
        this.bFP.bCK.bz(bl);
        this.bKZ = a2;
        return true;
    }

    public boolean PW() {
        return this.bF(true);
    }

    public boolean bD(float f) {
        if (this.bLk > f) {
            return false;
        }
        if (!this.bFP.IZ().bw(false)) {
            return false;
        }
        return this.b(this.bLm, true);
    }

    public boolean PX() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLC;
        if (this.bLk < 7.5f) {
            return false;
        }
        if (this.bFP.IZ().f(this.bLi, this.bLl) && this.bLk < 150.0f) {
            this.bFP.Ih();
            this.bFP.d(false, true);
        }
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean PY() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLE;
        if (this.bLk < this.Qb()) {
            this.bFP.If();
            this.bFP.Ij();
        }
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean PZ() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLD;
        if (this.bLk < 7.5f) {
            return false;
        }
        if (this.bFP.IZ().f(this.bLi, this.bLl) && this.bLk < this.Qb()) {
            this.bFP.If();
            this.bFP.d(true, false);
        }
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean Qa() {
        if (this.bFP.IZ().f(this.bLi, this.bLl) && this.bLk < this.Qb()) {
            this.bFP.If();
            this.bFP.Ij();
        }
        return true;
    }

    public boolean bE(float f) {
        a a2 = a.bLH;
        if (this.bLi > f) {
            return false;
        }
        if (this.bLk > 200.0f) {
            return false;
        }
        if (this.bLl < 25.0f) {
            return false;
        }
        this.bFP.If();
        this.bFP.Ij();
        this.bKZ = a2;
        return true;
    }

    private float Qb() {
        float f = 100.0f;
        float f2 = this.bFP.Jo();
        if ((double)f2 > 0.0) {
            f = f2;
        } else {
            cxd.g g2 = this.bFP.Im();
            if (g2 != null) {
                switch (g2) {
                    case fRe: 
                    case fRd: {
                        f = 25.0f;
                        break;
                    }
                    case fRb: {
                        f = 40.0f;
                        break;
                    }
                    case fRc: {
                        f = 7.5f;
                    }
                }
            }
        }
        return 0.9f * f;
    }

    public boolean Qc() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (!this.bFP.IZ().f(this.bLi, this.bLl)) {
            return false;
        }
        if (this.bLk > this.Qb()) {
            return false;
        }
        if (this.bLk > 100.0f && this.bFP.Ji().HT() && this.b(0.0, 0.33)) {
            return false;
        }
        if (this.bFP.Im() == cxd.g.fRc && this.bFP.IZ().b(this.bLn, 4.0f, true) && this.b(0.4, 1.0)) {
            return false;
        }
        if (this.bFP.Im() == cxd.g.fRf || this.bFP.Im() == cxd.g.fRb) {
            if (this.c(0.6, 1.0) && this.bLk < 7.5f) {
                return false;
            }
            if (this.c(0.4, 1.0) && this.bFP.IZ().b(this.bLn, 4.0f, true)) {
                return false;
            }
        }
        this.bFP.If();
        if (!this.bFP.d(true, false) && this.b(0.4, 1.0)) {
            return false;
        }
        a a2 = a.bLI;
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean Qd() {
        a a2 = a.bLK;
        if (!this.bFP.Ij()) {
            return false;
        }
        this.bKZ = a2;
        return false;
    }

    public boolean Qe() {
        a a2;
        if (this.bFP.bCL == null) {
            return false;
        }
        if (!this.bFP.IZ().f(this.bLi, this.bLl)) {
            return false;
        }
        if (this.bLk > this.Qb()) {
            return false;
        }
        this.bFP.If();
        if (!this.bFP.d(true, false)) {
            return false;
        }
        this.bFP.bCL.OE();
        this.bFP.stop();
        this.bKZ = a2 = a.bLJ;
        return true;
    }

    public boolean bF(float f) {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLY;
        float f2 = 0.9f;
        if (this.bKZ == a2) {
            f2 = 1.0f;
        }
        if (!this.bFP.b(this.bFP.IZ().Ly(), f2)) {
            return false;
        }
        this.bKZ = a2;
        if (!this.bFP.IZ().f(this.bLi * f, this.bLl)) {
            return false;
        }
        this.bFP.Ig();
        if (this.bFP.d(false, false)) {
            this.bFP.bCL.OE();
            this.bFP.stop();
            return true;
        }
        return false;
    }

    private boolean Qf() {
        if (this.bFP.bCL == null) {
            return false;
        }
        boolean bl = false;
        if (this.bFP.JQ() && this.bFP.JZ()) {
            bl = true;
        }
        if (this.bFP.JT() && this.bFP.Ka()) {
            bl = true;
        }
        if (!bl) {
            return false;
        }
        this.bFP.bCL.OE();
        if (this.bFP.bCL.Ow()) {
            this.bFP.stop();
        }
        return true;
    }

    public boolean Qg() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (!this.bFP.d(this.bFP.IZ().Ly())) {
            return false;
        }
        if (!this.bFP.IZ().f(this.bLi, this.bLl)) {
            return false;
        }
        this.bFP.Ig();
        this.bFP.d(false, false);
        return true;
    }

    public boolean Qh() {
        if (this.bLr) {
            return false;
        }
        if (this.IO() || this.IN()) {
            this.bLr = true;
        }
        return true;
    }

    public boolean P(double d2) {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLP;
        if (d2 > 0.2) {
            d2 = 0.2;
        }
        if (d2 < 0.0) {
            d2 = 0.0;
        }
        boolean bl = false;
        if (!this.bFP.JR() && !this.bFP.Kh()) {
            if (this.b(0.0, d2)) {
                bl = this.bFP.bCL.OZ();
            }
            if (this.b(d2, 2.0 * d2)) {
                bl = this.bFP.bCL.OX();
            }
        }
        if (this.b(2.0 * d2, 5.0 * d2)) {
            bl = this.bFP.bCL.OV();
        }
        if (!bl) {
            return false;
        }
        double d3 = Math.PI * 3 * this.bLe;
        if (d3 < Math.PI * 2) {
            this.bFP.bCL.bz((float)d3);
        }
        this.bKZ = a2;
        return true;
    }

    public boolean Qi() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLQ;
        if (!this.bFP.IZ().f(this.bLi, this.bLl)) {
            return false;
        }
        if (this.bLk > 150.0f) {
            return false;
        }
        this.bFP.Ih();
        if (!this.bFP.d(false, true) && this.b(0.4, 1.0)) {
            return false;
        }
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean Qj() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLS;
        if (!this.bFP.Ji().HT()) {
            return false;
        }
        if (this.bFP.bCL.c(this.bFP.IR())) {
            this.bFP.bCL.Pg();
        } else {
            this.bFP.stop();
        }
        this.bKZ = a2;
        return true;
    }

    public boolean Qk() {
        a a2 = a.bLT;
        if (!this.bFP.IZ().Lt()) {
            return false;
        }
        this.a(a2);
        this.bKZ = a2;
        return true;
    }

    public boolean Ql() {
        a a2 = a.bLU;
        this.bFP.stop();
        this.bKZ = a2;
        return true;
    }

    public boolean Qm() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (!this.bFP.IZ().Ln()) {
            return false;
        }
        if (this.Qf()) {
            return false;
        }
        this.bFP.bCL.bD(false);
        return true;
    }

    public boolean bG(boolean bl) {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLV;
        if (this.bFP.IZ().Ln()) {
            return false;
        }
        if (bl && !this.bFP.IZ().bw(false)) {
            return false;
        }
        if (this.Qf()) {
            return true;
        }
        this.bFP.bCL.OE();
        boolean bl2 = false;
        if (!this.bFP.JR() && (this.bFP.IZ().g(this.bLf, this.bLl) || this.bFP.IZ().Ly().Uy())) {
            double d2 = 0.2;
            double d3 = 0.4;
            if (this.bFP.IZ().Ly().Uy() || this.bFP.IZ().Ly().UA()) {
                d2 = 0.35;
                d3 = 0.7;
            }
            if (this.b(0.0, d2)) {
                bl2 = this.bFP.bCL.OZ();
            }
            if (this.b(d2, d3)) {
                bl2 = this.bFP.bCL.OX();
            }
        }
        if (!bl2) {
            this.bFP.stop();
        }
        this.bKZ = a2;
        return true;
    }

    public boolean Qn() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (this.Qf()) {
            return true;
        }
        if (this.bLh == c.bNO) {
            return false;
        }
        boolean bl = false;
        switch (this.bLh) {
            case bNR: {
                bl = true;
                this.bFP.bCL.ON();
                this.Qr();
                break;
            }
            case bNQ: {
                if (this.bLg > (double)0.6f) {
                    bl = this.bFP.bCL.OT();
                    break;
                }
                if (this.bLg > (double)0.3f) {
                    bl = this.bFP.bCL.OV();
                    break;
                }
                bl = true;
                this.bFP.bCL.ON();
                this.Qr();
                break;
            }
            case bNS: {
                bl = this.bFP.bCL.OY();
                break;
            }
            case bNT: {
                bl = this.bFP.bCL.Pa();
                break;
            }
            case bNP: {
                bl = this.bFP.bCL.OU();
            }
        }
        if (!bl) {
            this.bFP.stop();
        }
        this.bKZ = a.bLW;
        return true;
    }

    public boolean Qo() {
        if (this.bFP.bCM == null) {
            return false;
        }
        a a2 = a.bLX;
        this.bFP.bCM.Po();
        this.bKZ = a2;
        return true;
    }

    public boolean bG(float f) {
        if (this.bLk > f) {
            return false;
        }
        if (!this.bFP.IZ().f(this.bLi, this.bLl)) {
            return false;
        }
        this.bFP.Ig();
        this.bFP.d(false, false);
        return false;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.bLs == null ? 0 : this.bLs.hashCode());
        return n2;
    }

    public abstract void initialize();

    public boolean b(double d2, double d3) {
        return this.bLd >= d2 && this.bLd < d3;
    }

    public boolean c(double d2, double d3) {
        return this.bLe >= d2 && this.bLe < d3;
    }

    public boolean Qp() {
        if (!this.bFP.Ji().HT()) {
            return false;
        }
        return this.bFP.Ji().isFinished();
    }

    public abstract String name();

    public boolean Pu() {
        return false;
    }

    public boolean Ps() {
        return false;
    }

    public boolean Pq() {
        return false;
    }

    public boolean Py() {
        return false;
    }

    public abstract boolean Pr();

    public void Qq() {
        this.bLb = 0;
        this.bLc = 0;
    }

    public void Qr() {
        this.bLg = 0.0;
    }

    public void Qs() {
        this.bLd = arw.Sw();
        this.bLe = arw.Sw();
    }

    public void terminate() {
        this.bFP = null;
    }

    public void Qt() {
        if (this.bFP.IZ().Ly() == null) {
            return;
        }
        this.bLn.ex(this.bFP.IZ().LC());
        this.bLo.ex(this.bFP.IZ().LH());
        this.bLm.u(this.bFP.IZ().LD());
        this.bLa = this.bFP.IZ().LQ();
        this.bLj = this.bFP.IZ().LR();
        this.bLi = anp.a(this.bFP.av(), this.bFP.IV(), this.bLn);
        this.bLf = anp.a(this.bLn, this.bLa, this.bFP.av());
        this.bLk = this.bFP.IZ().LA();
        this.bLl = this.bFP.Jj().x(this.bLm);
    }

    public void d(double d2, double d3) {
        if (this.bFP.bCL == null) {
            return;
        }
        this.bLg = this.bFP.bCL.OL() && this.bLh == c.bNO ? (this.bLg += (double)(10.0f * (1.5f + arw.Sx())) * d2) : (this.bLg -= d2 / 2.0);
        if (this.bLg < 0.0) {
            this.bLg = 0.0;
        }
        if (this.bLg > 1.0) {
            this.bLg = 1.0;
        }
        if (this.bLg == 0.0) {
            this.bLh = c.bNO;
        }
        if (this.bLh == c.bNO && this.bLg == 1.0) {
            int n = arw.Sy() % 15;
            this.bLh = n < 2 ? c.bNP : (n < 3 ? c.bNS : (n < 4 ? c.bNT : (n < 11 ? c.bNR : c.bNQ)));
            if (this.bFP.JR() && (this.bLh == c.bNS || this.bLh == c.bNT)) {
                this.bLh = c.bNP;
            }
            this.bFP.Jq().a(this.bFP.av(), d3);
        }
    }

    private void a(a a2) {
        if (this.bFP.bCL == null) {
            return;
        }
        this.bFP.bCL.OE();
        if (this.bFP.JR()) {
            this.bFP.stop();
            return;
        }
        boolean bl = this.bFP.IZ().Lo();
        boolean bl2 = this.bFP.IZ().Lp();
        if (this.bFP.IZ().g(this.bLf, this.bLl) || this.bFP.IZ().Ly().Uy() && this.bLk < 4.0f || this.bLb > 0 && this.c(0.0, 0.7)) {
            if (arw.Sw() < 0.005 && bl) {
                this.bFP.bCL.Ph();
            }
            if (arw.Sw() < 0.005 && bl2) {
                this.bFP.bCL.Pi();
            }
        }
        boolean bl3 = false;
        if (!bl || !bl2) {
            bl3 = true;
        }
        if (arw.Sw() < 0.01) {
            bl3 = true;
        }
        if (a2 != this.bKZ) {
            bl3 = true;
        }
        if (bl3) {
            this.bFP.stop();
        }
    }

    protected boolean Qu() {
        a a2 = a.bLz;
        if (!(this.bFP.IU() instanceof dyf)) {
            return false;
        }
        this.bKZ = a2;
        return true;
    }

    protected boolean b(ljp ljp2, boolean bl) {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLF;
        if (!this.bFP.bCL.c(ljp2)) {
            return false;
        }
        boolean bl2 = false;
        boolean bl3 = this.bFP.IZ().Lq();
        if (!(this.bFP.Kh() || bl3 || this.bFP.IZ().bt(true))) {
            if (this.bFP.JR()) {
                bl3 = true;
            } else if (!this.bFP.IZ().bu(true) && !this.bFP.IZ().bv(true)) {
                bl3 = true;
            }
        }
        if (bl3) {
            this.bFP.bCL.bD(bl);
            bl2 = true;
        }
        if (!(this.bFP.JR() || this.bFP.Kh() || bl2)) {
            if (this.c(0.2, 0.5)) {
                bl2 = this.bFP.bCL.OX();
            }
            if (this.c(0.5, 0.8)) {
                bl2 = this.bFP.bCL.OZ();
            }
        }
        if (!bl2) {
            this.bFP.stop();
        }
        this.bKZ = a2;
        return true;
    }

    protected boolean d(ljp ljp2) {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLG;
        if (!this.bFP.bCL.c(ljp2)) {
            return false;
        }
        if (this.bFP.IZ().Lq()) {
            this.bFP.bCL.OS();
        } else {
            this.bFP.stop();
        }
        this.bKZ = a2;
        return true;
    }

    protected boolean Qv() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLM;
        if (!(this.bFP.IU() instanceof dyn)) {
            return false;
        }
        dyn dyn2 = (dyn)this.bFP.IU();
        if (dyn2.eW == dyn.b.iiQ.ordinal()) {
            if (dyn2.iiK == dyn.a.iiL.ordinal()) {
                this.bFP.bCL.Pg();
            }
            if (dyn2.iiK == dyn.a.iiM.ordinal()) {
                this.bFP.bCL.Pf();
            }
            if (dyn2.iiK == dyn.a.iiO.ordinal()) {
                this.bFP.bCL.Ph();
            }
            if (dyn2.iiK == dyn.a.iiN.ordinal()) {
                this.bFP.bCL.Pi();
            }
        }
        if (dyn2.eW == dyn.b.iiR.ordinal()) {
            if (dyn2.iiK == dyn.a.iiL.ordinal()) {
                this.bFP.bCL.bD(false);
            }
            if (dyn2.iiK == dyn.a.iiM.ordinal()) {
                this.bFP.stop();
            }
            if (dyn2.iiK == dyn.a.iiO.ordinal()) {
                this.bFP.bCL.OQ();
            }
            if (dyn2.iiK == dyn.a.iiN.ordinal()) {
                this.bFP.bCL.OR();
            }
        }
        this.bKZ = a2;
        return true;
    }

    protected boolean Qw() {
        a a2 = a.bLO;
        if (!(this.bFP.IU() instanceof dyo)) {
            return false;
        }
        this.bKZ = a2;
        return true;
    }

    protected boolean Qx() {
        if (this.bFP.bCL == null) {
            return false;
        }
        a a2 = a.bLR;
        if (!(this.bFP.IU() instanceof dyq)) {
            return false;
        }
        dyq dyq2 = (dyq)this.bFP.IU();
        float f = dyq2.iiV;
        f = (float)((double)f * (Math.PI / 180));
        this.bFP.bCL.bz(f);
        this.bKZ = a2;
        return true;
    }

    protected boolean Qy() {
        return this.bH(true);
    }

    protected boolean Qz() {
        if (!this.bFP.Kh()) {
            return false;
        }
        if (this.bFP.IZ().Ly() == null) {
            return false;
        }
        if (!this.bFP.IZ().Ly().UI()) {
            return false;
        }
        float f = 0.2f;
        if (this.bFP.IZ().Ly().UA()) {
            f += 0.2f;
        }
        return arw.Sw() < (double)f;
    }

    protected boolean bH(boolean bl) {
        if (this.bFP.IZ().Ly() == null) {
            return false;
        }
        if (!this.bFP.IZ().Ly().UA()) {
            return false;
        }
        float f = 0.15f;
        if (bl) {
            f += 0.1f * Math.min(this.bFP.Jl().Ub() / 1000.0f, 1.0f);
        }
        switch (this.bFP.KG()) {
            case bEH: 
            case bEw: 
            case bEq: 
            case bEj: 
            case bEm: {
                f += 0.15f;
                break;
            }
        }
        return arw.Sw() < (double)f;
    }
}

