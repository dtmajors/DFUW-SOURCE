/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aou
extends aqu {
    private final ary bJQ;
    private double lW;
    ljq bKh;
    private boolean bKi;

    public aou(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 4.0;
        this.bLq = true;
        int n = (int)(this.bFP.getGUID().eny() + (long)(31 * cug.fhc));
        this.bFP.hi(n);
        arz.SH().a(n, cug.fhc, this.bFP.av().esF(), this.bFP.aw().eqV());
        this.bJQ = new ary(n, 2.0, 0.5, -15.0f, 6.0f + 2.0f * arw.Sx());
    }

    @Override
    public boolean execute() {
        this.Qh();
        if (this.bJQ.aB(this.bKh)) {
            this.lW = this.bFP.Jp().rgz;
            this.bKi = true;
            asp.a(del.gjZ, this.bKh, this.bFP.getGUID(), this.bFP.getMessageDelegator());
        }
        if (this.bKi && this.bFP.Jp().rgz > this.lW + 0.9) {
            this.bFP.a(this.bFP.IZ().Ly(), lea.enT().getType("Cold Damage"), 30.0f + 10.0f * arw.Sx());
            this.bKi = false;
        }
        this.PL();
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void O(double d2) {
    }

    @Override
    public void initialize() {
        this.Qs();
        this.bKi = false;
        this.bKh = this.bFP.IZ().LC().esF();
        ljq ljq2 = this.bFP.IZ().LH();
        ljq2.y = 0.0f;
        if (ljq2.eqN() > 1.0f) {
            ljq2.normalize();
            ljq2.nm(2.0f);
        } else {
            double d2 = arw.Sw() * Math.PI * 2.0;
            ljq2.x = (float)Math.cos(d2);
            ljq2.rlV = (float)Math.sin(d2);
        }
        this.bKh.es(ljq2);
    }

    @Override
    public String name() {
        return "DUEL MAGIC";
    }

    @Override
    public void end() {
        if (this.bJQ.SD()) {
            asp.a(del.gjZ, this.bKh, this.bFP.getGUID(), this.bFP.getMessageDelegator());
        }
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

