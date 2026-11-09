/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aod
extends aqu {
    float bJd;
    ary.a bJe;
    float bJf = 6.0f;
    float bJg = 4.0f;
    ljp bJh;
    boolean bJi = false;
    float bJj;
    private double bJk = 0.0;
    private int bJl;
    boolean bJm = false;

    public aod(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 10.0;
        this.bJd = -1.0f;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        double d2 = this.bFP.Jp().rgz;
        if (this.bJk <= 0.0) {
            this.bJk = d2;
            return true;
        }
        if (this.bFP.a(this.bJh)) {
            if (!this.bJm) {
                this.Ql();
                this.bJm = true;
            }
            if (this.bJe == ary.a.bSR) {
                this.bJl = arz.SH().c(cug.fhd, this.bFP.av().esF(), this.bFP.aw().eqV());
                this.bFP.hi(this.bJl);
                this.bJe = ary.a.bSP;
                this.bFP.bm(false);
            }
            if (!this.bJi) {
                arw.ct.debug("*** startin anim idle_extra_03");
                this.bFP.hg(65909);
                this.bJi = true;
            }
            if (d2 > this.bJk) {
                this.bJk = d2 + 1.0;
                this.bJd = this.bFP.Jl().Uc() + this.bJj;
                arw.ct.debug("***" + this.getClass().getSimpleName() + " HealthMod: " + this.bJd);
                this.bFP.c(352, (Object)Float.valueOf(this.bJd * this.bFP.Jl().Ub()));
            }
        }
        return true;
    }

    @Override
    public void O(double d2) {
    }

    @Override
    public ljq Pp() {
        ljq ljq2 = this.bFP.IY().esF();
        ljq2.kl((float)((double)ljq2.getX() + arw.e(-this.bJf, this.bJf)));
        ljq2.fb((float)((double)ljq2.bdV() + arw.e(-this.bJg, this.bJg)));
        this.bJh = new ljp(ljq2.getX(), ljq2.getY());
        arw.ct.debug("***" + this.getClass().getSimpleName() + ": target position: [" + ljq2 + "]");
        return ljq2;
    }

    @Override
    public void initialize() {
        this.bJe = ary.a.bSR;
        this.bFP.hg(65539);
        this.Qs();
        float f = 0.6f - this.bFP.Jl().Uc();
        this.bJj = (float)((double)f / this.bLp);
    }

    @Override
    public void end() {
        if (this.bJe == ary.a.bSP) {
            arz.SH().hO(this.bJl);
            this.bFP.hl(this.bJl);
            this.bJe = ary.a.bSQ;
            arw.ct.info("***below heal end");
            this.bFP.hh(65909);
            this.bFP.bm(true);
        }
    }

    @Override
    public String name() {
        return "BELOW NIGHTMARE HEALING";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

