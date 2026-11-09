/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cwx
 *  cxd
 */
public class aoa {
    private double bIm = Math.PI * 2;
    private boolean bIG;
    private int bIH;
    private int bII;
    private int bIJ;
    private final ljq bBM = new ljq();
    private final ljq bDB = new ljq();
    private int bIl;
    anf bFP;
    private int bIK;
    private boolean bIL;

    public aoa(anf anf2) {
        this.bFP = anf2;
        this.bIJ = -1;
        this.bII = -1;
        this.bIG = false;
        this.bIL = false;
        if (this.bFP.JR()) {
            this.bIm *= 0.4;
        } else if (this.bFP.Kh()) {
            this.bIm *= 0.15;
        }
        if (this.bFP.KG() != null) {
            switch (this.bFP.KG()) {
                case bEG: {
                    this.bIm *= 1.2;
                    break;
                }
                case bEn: {
                    this.bIm *= 1.1;
                    break;
                }
                case bEw: {
                    this.bIm *= 0.6;
                    break;
                }
                case bEF: {
                    this.bIm *= 0.6;
                    break;
                }
                case bEv: {
                    this.bIm *= 0.1;
                    break;
                }
                case bEy: {
                    this.bIm *= 0.5;
                    break;
                }
            }
        }
    }

    public boolean OI() {
        return this.bIL;
    }

    public int OJ() {
        return this.bIK;
    }

    public double OK() {
        return this.bIm;
    }

    public boolean OL() {
        if (this.bIJ < 0) {
            return false;
        }
        return this.bFP.av().B(this.bFP.Je(), 1.0E-4f);
    }

    public boolean Ow() {
        return this.bIJ >= 0;
    }

    public boolean OM() {
        return this.bIG;
    }

    public void ON() {
        if (!this.bFP.Jm().hu(cxd.fHu)) {
            return;
        }
        anj.b(this.bFP.IW(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
    }

    public void OO() {
        if (!this.bFP.Jm().hu(cxd.fHy)) {
            return;
        }
        anj.c(this.bFP.IW(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
    }

    public void OP() {
        if (!this.bFP.Jm().hu(cxd.fHy)) {
            return;
        }
        anj.d(this.bFP.IW(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
    }

    public boolean bz(float f) {
        if (!this.OD()) {
            return true;
        }
        return this.bA(f);
    }

    public boolean c(ljp ljp2) {
        if (ljp2 == null) {
            return false;
        }
        this.bDB.x = ljp2.x;
        this.bDB.y = 0.0f;
        this.bDB.rlV = ljp2.y;
        return this.ar(this.bDB);
    }

    public boolean ar(ljq ljq2) {
        if (ljq2 == null) {
            return false;
        }
        if (!this.OD()) {
            return true;
        }
        ljq.e(ljq2, this.bFP.av(), this.bBM);
        float f = arw.aA(this.bBM);
        return this.bA(f);
    }

    public boolean OE() {
        return this.ar(this.bFP.IZ().LC());
    }

    public void bD(boolean bl) {
        if (this.bFP.Jl().Uo() < 0.5f) {
            bl = false;
        }
        this.b(cxd.fHE, 0, bl);
    }

    public void OQ() {
        this.b(cxd.fHE, 2, false);
    }

    public void OR() {
        this.b(cxd.fHE, 3, false);
    }

    public void OS() {
        this.b(cxd.fHE, 0, false);
    }

    public void Ox() {
        if (!this.Pj()) {
            return;
        }
        ++this.bIK;
        if (this.bIJ < 0) {
            return;
        }
        cxc cxc2 = this.bFP.Jm().ht(this.bIJ);
        if (cxc2 == null) {
            return;
        }
        if (!(cxc2 instanceof cwx)) {
            return;
        }
        if (((cwx)cxc2).bef() == cwx.a.fGr) {
            return;
        }
        if (!this.bFP.Jb().hS(cxc2.zg())) {
            return;
        }
        anj.a(this.bFP.IW(), this.bIJ, this.bFP.getMessageDelegator(), this.bFP.getGUID());
        this.bIJ = -1;
        this.bII = -1;
        this.bIG = false;
    }

    public boolean OT() {
        if (this.bFP.IZ().Lr()) {
            this.Pf();
            return true;
        }
        return false;
    }

    public boolean OU() {
        if (this.bFP.IZ().Lr()) {
            this.Pf();
            return true;
        }
        if (this.bFP.IZ().Lq()) {
            this.Pg();
            return true;
        }
        return false;
    }

    public boolean OV() {
        if (this.bFP.IZ().Lq()) {
            this.Pg();
            return true;
        }
        return false;
    }

    public boolean OW() {
        if (this.bFP.IZ().Lq()) {
            this.Pg();
            return true;
        }
        if (this.bFP.IZ().Lr()) {
            this.Pf();
            return true;
        }
        return false;
    }

    public boolean OX() {
        if (this.bFP.IZ().Lo()) {
            this.Ph();
            return true;
        }
        return false;
    }

    public boolean OY() {
        if (this.bFP.IZ().Lo()) {
            this.Ph();
            return true;
        }
        if (this.bFP.IZ().Lp()) {
            this.Pi();
            return true;
        }
        return false;
    }

    public boolean OZ() {
        if (this.bFP.IZ().Lp()) {
            this.Pi();
            return true;
        }
        return false;
    }

    public boolean Pa() {
        if (this.bFP.IZ().Lp()) {
            this.Pi();
            return true;
        }
        if (this.bFP.IZ().Lo()) {
            this.Ph();
            return true;
        }
        return false;
    }

    public boolean Pb() {
        if (this.bFP.IZ().Lo()) {
            this.OQ();
            return true;
        }
        return false;
    }

    public boolean Pc() {
        if (this.bFP.IZ().Lo()) {
            this.OQ();
            return true;
        }
        if (this.bFP.IZ().Lp()) {
            this.OR();
            return true;
        }
        return false;
    }

    public boolean Pd() {
        if (this.bFP.IZ().Lp()) {
            this.OR();
            return true;
        }
        return false;
    }

    public boolean Pe() {
        if (this.bFP.IZ().Lp()) {
            this.OR();
            return true;
        }
        if (this.bFP.IZ().Lo()) {
            this.OQ();
            return true;
        }
        return false;
    }

    public void Pf() {
        this.b(cxd.fHK, 1, false);
    }

    public void Pg() {
        this.b(cxd.fHK, 0, false);
    }

    public void Ph() {
        this.b(cxd.fHK, 2, false);
    }

    public void Pi() {
        this.b(cxd.fHK, 3, false);
    }

    private boolean Pj() {
        if (this.bFP.Jp().lpr == this.bIH) {
            return false;
        }
        this.bIH = this.bFP.Jp().lpr;
        return true;
    }

    private boolean OD() {
        if (this.bFP.Jp().lpr == this.bIl) {
            return false;
        }
        this.bIl = this.bFP.Jp().lpr;
        return true;
    }

    private void b(int n, int n2, boolean bl) {
        if (!this.Pj()) {
            return;
        }
        this.bIK = 0;
        if (n == this.bIJ && n2 == this.bII && bl == this.bIG) {
            return;
        }
        cxc cxc2 = this.bFP.Jm().ht(n);
        if (cxc2 == null) {
            return;
        }
        if (!(cxc2 instanceof cwx)) {
            return;
        }
        if (this.bIJ < 0 || this.bIJ != n) {
            if (!this.bFP.Jb().hR(cxc2.zg())) {
                return;
            }
            anj.a(this.bFP.IW(), n, n2, bl, this.bFP.getMessageDelegator(), this.bFP.getGUID());
        } else {
            if (!this.bFP.Jb().hT(cxc2.zg())) {
                return;
            }
            anj.b(this.bFP.IW(), n, n2, bl, this.bFP.getMessageDelegator(), this.bFP.getGUID());
        }
        this.bIJ = n;
        this.bII = n2;
        this.bIG = bl;
    }

    private boolean bA(float f) {
        if (this.bII == 0 && (this.bIJ == cxd.fHE || this.bIJ == cxd.fHK)) {
            f = this.bFP.Jq().a(this.bFP.Jp().rgz, this.bFP.av(), f, this.bFP.Jl().Up());
        }
        return this.bx(f);
    }

    public void au(ljq ljq2) {
        if (ljq2 == null) {
            return;
        }
        anj.a(ljq2, this.bFP.IX(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
    }

    private boolean bx(float f) {
        double d2;
        this.bIL = false;
        double d3 = this.bFP.Jp().qwh * this.bIm;
        double d4 = this.bFP.IV();
        for (d2 = (double)f - d4; d2 > Math.PI; d2 -= Math.PI * 2) {
        }
        while (d2 < -Math.PI) {
            d2 += Math.PI * 2;
        }
        if (Math.abs(d2) < 0.001) {
            return true;
        }
        if (Math.abs(d2) >= 0.7853981633974483) {
            this.bIL = true;
        }
        if (d2 > d3) {
            d2 = d3;
        }
        if (d2 < -d3) {
            d2 = -d3;
        }
        d4 += d2;
        while (d4 > Math.PI) {
            d4 -= Math.PI * 2;
        }
        while (d4 < -Math.PI) {
            d4 += Math.PI * 2;
        }
        anj.a((float)d4, this.bFP.IX(), this.bFP.getMessageDelegator(), this.bFP.getGUID());
        this.bFP.Jl().bW((float)d4);
        return true;
    }

    public void terminate() {
        this.bFP = null;
    }
}

