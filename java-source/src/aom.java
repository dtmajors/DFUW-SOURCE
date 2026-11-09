/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aom
extends aqu {
    private boolean bJF;
    private boolean bJG;
    private double bJH = 0.0;
    private double bJI = 3.367;
    private double bJJ = 3.5;

    public aom(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = this.bJI + this.bJJ + 1.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        this.Ql();
        if (this.bFP.KQ() > -1) {
            int n = this.bFP.KQ();
            arz.SH().hO(n);
            this.bFP.hl(n);
            this.bFP.hn(-1);
            this.bFP.bm(true);
        }
        double d2 = this.bFP.Jp().rgz;
        if (this.bJH <= 0.0) {
            this.bJH = d2;
        }
        if (d2 > this.bJH) {
            if (!this.bJF) {
                this.bJH = d2 + this.bJI;
                this.bFP.hg(655445);
                this.bJF = true;
            } else if (!this.bJG) {
                this.bJH = d2 + this.bJJ;
                this.bFP.hg(83886595);
                this.bJG = true;
            } else {
                this.bFP.hg(65566);
            }
        }
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.Qs();
    }

    @Override
    public String name() {
        return "DAVOS GETUP";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

