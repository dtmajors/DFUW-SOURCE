/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aov
extends aqu {
    private final ary bJQ;
    private double bKj;

    public aov(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 7.0;
        int n = (int)(this.bFP.getGUID().eny() + (long)(31 * cug.fhb));
        this.bFP.hi(n);
        arz.SH().a(n, cug.fhb, this.bFP.av().esF(), this.bFP.aw().eqV());
        this.bJQ = new ary(n, 1.5, 0.5, -15.0f, 0.0f);
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Qh();
        this.Qt();
        if (this.bFP.IZ().Ly() == null) {
            return false;
        }
        if (this.bLl < 4.0f) {
            this.bKj = this.bFP.Jp().rgz;
        } else if (this.bFP.Jp().rgz > this.bKj + this.bJQ.SF() + this.bJQ.Bw()) {
            return false;
        }
        if (!this.bFP.bCL.Ow() && this.bJQ.aB(this.bFP.av())) {
            asp.a(del.gka, this.bJQ.SE(), this.bFP.getGUID(), this.bFP.getMessageDelegator());
        }
        this.v(this.bFP.IZ().Ly());
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void O(double d2) {
        if (d2 < this.bJQ.Bw() - this.bJQ.SF()) {
            this.end();
        }
    }

    @Override
    public void initialize() {
        this.bFP.Ko();
        this.bFP.a(true, null);
        this.Qs();
        this.bKj = this.bFP.Jp().rgz;
    }

    @Override
    public String name() {
        return "DUEL MELEE";
    }

    @Override
    public void end() {
        if (this.bJQ.SD()) {
            asp.a(del.gkb, this.bJQ.SE(), this.bFP.getGUID(), this.bFP.getMessageDelegator());
        }
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

