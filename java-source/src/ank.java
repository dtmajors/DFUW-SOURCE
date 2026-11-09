/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class ank {
    private final anf bFP;
    private lcj bFQ;
    private boolean bFR;
    private int bFS;
    private float bFT;
    private int size;
    private int[][][] bFU;
    lek bFV;
    lek bFW;
    lek bFX;
    lek bFY;
    ljq bFZ;

    public float Lf() {
        return this.bFT;
    }

    public ank(anf anf2) {
        this.bFP = anf2;
        this.bFR = false;
        this.bFS = 8;
        this.size = 2;
        this.bFT = 2.0f * (float)this.size / (float)this.bFS;
        if (this.bFP.bCL == null) {
            return;
        }
        this.bFQ = new lcj();
        this.bFQ.qwb = new ljq(0.0f, 0.0f, 0.0f);
        this.bFQ.qwc = new ljq(0.0f, 0.0f, 0.0f);
        this.bFV = new lek(this.bFS, this.bFS, this.bFS);
        this.bFW = new lek(0, 0, 0);
        this.bFX = new lek(0, 0, 0);
        this.bFY = new lek(0, 0, 0);
        this.bFZ = new ljq(0.0f, 0.0f, 0.0f);
        this.bFU = new int[this.bFS][this.bFS][this.bFS];
        this.Li();
    }

    public boolean c(ljq ljq2, ljq ljq3) {
        if (ljq2 == null) {
            return true;
        }
        if (ljq3 == null) {
            return true;
        }
        if (this.bFP.bCL == null) {
            return true;
        }
        if (this.bFR) {
            return false;
        }
        this.a(ljq2, this.bFW);
        this.a(ljq3, this.bFX);
        int n = this.bFX.cf - this.bFW.cf;
        int n2 = this.bFX.cg - this.bFW.cg;
        int n3 = this.bFX.riS - this.bFW.riS;
        int n4 = Math.abs(n);
        if (Math.abs(n2) > n4) {
            n4 = Math.abs(n2);
        }
        if (Math.abs(n3) > n4) {
            n4 = Math.abs(n3);
        }
        if (n4 == 0) {
            return true;
        }
        for (int i = 0; i <= n4; ++i) {
            this.bFY.cf = i * n / n4 + this.bFW.cf;
            this.bFY.cg = i * n2 / n4 + this.bFW.cg;
            this.bFY.riS = i * n3 / n4 + this.bFW.riS;
            if (!this.a(this.bFY) || this.bFY.equals(this.bFW) || this.b(this.bFY)) continue;
            return false;
        }
        return true;
    }

    public boolean Lg() {
        if (this.bFP.bCL == null) {
            return false;
        }
        if (this.bFR) {
            return false;
        }
        ljq ljq2 = this.bFP.Jl().av();
        float f = (float)this.size / 3.0f;
        float f2 = ljq2.x - (this.bFQ.qwb.x + this.bFQ.qwc.x) / 2.0f;
        float f3 = ljq2.y - (this.bFQ.qwb.y + this.bFQ.qwc.y) / 2.0f;
        float f4 = ljq2.rlV - (this.bFQ.qwb.rlV + this.bFQ.qwc.rlV) / 2.0f;
        if (Math.abs(f2) > f) {
            return true;
        }
        if (Math.abs(f3) > f) {
            return true;
        }
        return Math.abs(f4) > f;
    }

    public void Lh() {
        if (this.bFP.bCL == null) {
            return;
        }
        ljq ljq2 = this.bFP.Jl().av();
        this.bFQ.qwb.G(ljq2.x - (float)this.size, ljq2.y - (float)this.size, ljq2.rlV - (float)this.size);
        this.bFQ.qwc.G(ljq2.x + (float)this.size, ljq2.y + (float)this.size, ljq2.rlV + (float)this.size);
        kjh kjh2 = (kjh)this.bFP.getMessageDelegator().h(2827);
        kjh2.ts(this.bFP.getGUID());
        kjh2.pDZ = this.bFQ;
        kjh2.pEA = this.bFV;
        kjh2.pEa = -4130;
        this.bFP.getMessageDelegator().a(kjh2);
        this.bFR = true;
    }

    public void a(kui kui2) {
        if (this.bFP.bCL == null) {
            return;
        }
        this.Li();
        for (leb leb2 : kui2.qdS) {
            this.bFU[leb2.riD.cf][leb2.riD.cg][leb2.riD.riS] = 1;
        }
        this.bFR = false;
    }

    private void a(ljq ljq2, lek lek2) {
        lek2.cf = (int)Math.floor((ljq2.x - this.bFQ.qwb.x) / this.bFT);
        lek2.cg = (int)Math.floor((ljq2.y - this.bFQ.qwb.y) / this.bFT);
        lek2.riS = (int)Math.floor((ljq2.rlV - this.bFQ.qwb.rlV) / this.bFT);
    }

    private boolean a(lek lek2) {
        if (lek2.cf < 0 || lek2.cf >= this.bFS) {
            return false;
        }
        if (lek2.cg < 0 || lek2.cg >= this.bFS) {
            return false;
        }
        return lek2.riS >= 0 && lek2.riS < this.bFS;
    }

    private boolean b(lek lek2) {
        int n = this.bFS + 1;
        for (int i = this.bFS - 1; i >= 0; --i) {
            if (this.bFU[lek2.cf][i][lek2.riS] != 1) continue;
            if (n - i > 2) {
                return true;
            }
            n = i;
        }
        return false;
    }

    private void Li() {
        for (int i = 0; i < this.bFS; ++i) {
            for (int j = 0; j < this.bFS; ++j) {
                for (int k = 0; k < this.bFS; ++k) {
                    this.bFU[i][j][k] = 0;
                }
            }
        }
    }
}

