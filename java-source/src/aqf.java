/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqf
extends aqu {
    public aqf(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 4.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qh();
        this.Qt();
        if (this.Qi()) {
            return true;
        }
        if (this.Qn()) {
            return true;
        }
        if (this.bC(7.5f)) {
            return true;
        }
        this.PU();
        if (this.PN()) {
            return true;
        }
        if (this.PQ()) {
            return true;
        }
        if (this.bG(false)) {
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
        this.bFP.Kp();
        if (this.bLs == aqu.b.bMT) {
            this.bFP.a(true, null);
        }
        if (this.bLs == aqu.b.bMl) {
            this.bFP.a(true, null, ani.a.bFl);
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "RANGE";
    }

    @Override
    public boolean Ps() {
        return true;
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

