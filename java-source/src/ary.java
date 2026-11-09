/*
 * Decompiled with CFR.
 */
public class ary {
    private final double bSE;
    private ljq bSF;
    private final double bSG;
    private ljq bSH;
    private a bJe;
    private final arz bSI = arz.SH();
    private final float bSJ;
    private final float bSK;
    private final int bSL;
    private double bSM = 0.1;
    private lgl bSN;
    private lgl bSO;

    public ary(int n, double d2, double d3, float f2, float f3) {
        this.bSL = n;
        this.bSE = d2;
        this.bSG = d3;
        this.bSK = f2;
        this.bSJ = f3;
        this.bJe = a.bSR;
    }

    public boolean SD() {
        if (this.bJe != a.bSP) {
            return false;
        }
        this.a(this.bSF, this.bSH, this.bSO, this.bSN, this.bSE);
        this.bJe = a.bSQ;
        return true;
    }

    public double Bw() {
        return this.bSE;
    }

    public ljq SE() {
        return this.bSF;
    }

    public double SF() {
        return this.bSG;
    }

    public boolean SG() {
        if (this.bJe != a.bSQ) {
            return false;
        }
        this.bJe = a.bSR;
        return true;
    }

    public boolean aB(ljq ljq2) {
        return this.d(ljq2, false);
    }

    public boolean d(ljq ljq2, boolean bl) {
        if (ljq2 == null) {
            return false;
        }
        if (this.bJe != a.bSR) {
            return false;
        }
        if (!this.bSI.hN(this.bSL)) {
            return false;
        }
        ljq ljq3 = ljq2.esF();
        ljq3.y += this.bSK;
        ljq ljq4 = ljq2.esF();
        ljq4.y += this.bSJ;
        lgl lgl2 = null;
        lgl2 = !bl ? new lgl(0.0f, arw.Sx() * (float)Math.PI, 0.0f) : new lgl(0.0f, 0.0f, 0.0f);
        this.a(ljq3, ljq4, lgl2, lgl2, this.bSE);
        return true;
    }

    public void ad(double d2) {
        this.bSM = d2;
    }

    public void a(ljq ljq2, ljq ljq3, lgl lgl2, lgl lgl3, double d2) {
        if (ljq2 == null) {
            return;
        }
        if (ljq3 == null) {
            return;
        }
        if (lgl2 == null) {
            return;
        }
        if (lgl3 == null) {
            return;
        }
        ldv ldv2 = this.bSI.hM(this.bSL);
        if (ldv2 == null) {
            return;
        }
        this.bJe = a.bSP;
        this.bSH = ljq2;
        this.bSF = ljq3;
        this.bSN = lgl2;
        this.bSO = lgl3;
        fuj fuj2 = (fuj)this.bSI.getMessageDelegator().h(1038, this.bSI.getGUID(), ldv2);
        fuj2.oV = this.bSI.getMessageDelegator().arc().rgz + this.bSM;
        fuj2.eKm = d2;
        fuj2.gon = this.bSH;
        fuj2.goo = this.bSF;
        fuj2.iWX = this.bSN;
        fuj2.iWY = this.bSO;
        this.bSI.getMessageDelegator().F(fuj2);
    }
}

