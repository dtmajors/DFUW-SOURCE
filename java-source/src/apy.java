/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class apy
extends aqu {
    ary.a bJe;
    float bJd;
    private int bKU;

    public apy(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 20.0;
        this.bJd = -1.0f;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.bFP.Ij();
        if (this.bJe == ary.a.bSR && this.bFP.JX()) {
            if (this.bFP.IZ().n(this.bFP.av(), 4.0f) > 0) {
                return false;
            }
            this.bKU = arz.SH().c(cug.fha, this.bFP.av().esF(), this.bFP.aw().eqV());
            this.bFP.hi(this.bKU);
            this.bJe = ary.a.bSP;
            asp.a(del.gjU, this.bFP.av(), this.bFP.getGUID(), this.bFP.getMessageDelegator());
            this.bFP.c(352, (Object)Float.valueOf(this.bJd * this.bFP.Jl().Ub()));
            this.bFP.bm(false);
        }
        return this.Ql();
    }

    @Override
    public void O(double d2) {
        if (this.bJd < 0.0f) {
            this.bJd = this.bFP.Jl().Uc() + (float)(d2 / (8.0 * this.bLp));
            if (this.bJd > 1.0f) {
                this.bJd = 1.0f;
            }
        }
        if (this.bJe == ary.a.bSP && d2 < 3.0) {
            this.end();
        }
    }

    @Override
    public void end() {
        if (this.bJe == ary.a.bSP) {
            arz.SH().hO(this.bKU);
            this.bFP.hl(this.bKU);
            this.bJe = ary.a.bSQ;
            this.bFP.bm(true);
            asp.a(del.gjU, this.bFP.av(), this.bFP.getGUID(), this.bFP.getMessageDelegator());
        }
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.Kn();
        this.bFP.a(true, ani.c.bFM);
        this.bJe = ary.a.bSR;
        this.Qs();
    }

    @Override
    public String name() {
        return "PROTECTED IDLE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

