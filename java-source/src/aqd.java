/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqd
extends aqu {
    double bJs = 0.0;

    public aqd(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 8.0;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        double d2 = this.bFP.Jp().rgz;
        if (d2 > this.bJs) {
            this.bJs = d2 + 0.7;
            if (this.bFP.bCL.Ow()) {
                this.bFP.a(this.bFP.Jl(), lea.enT().getType("Impact Damage"), 1.0f, 2.0f, 7.0f, anf.a.bEc);
            }
        }
        if (this.bG(true)) {
            return true;
        }
        if (this.Qn()) {
            return true;
        }
        if (this.bD(7.5f)) {
            return true;
        }
        if (this.PN()) {
            return true;
        }
        if (this.PR()) {
            return true;
        }
        if (this.bD(2.14748365E9f)) {
            return true;
        }
        this.PL();
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void initialize() {
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public boolean Pq() {
        return true;
    }

    @Override
    public String name() {
        return "RAGE CHARGE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

