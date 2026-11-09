/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apz
extends aqu {
    double bJs;
    private boolean bJt;

    public apz(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 11.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        this.Ql();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJs <= 0.0) {
            this.bJs = d2;
            return true;
        }
        if (d2 > this.bJs) {
            if (!this.bJt && d2 - this.bJs > 2.0) {
                this.bJs = d2 + 4.3;
                this.bFP.hg(100663652);
                this.bJt = true;
            } else if (this.bJt) {
                this.bJs = Double.POSITIVE_INFINITY;
                asp.a(del.dr("se_ragaizan_acidearthquake"), this.bFP.av(), this.bFP.getGUID(), this.bFP.getMessageDelegator());
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
        this.bFP.a(true, null);
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public String name() {
        return "RAGAIZAN ACID EARTHQUAKE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

