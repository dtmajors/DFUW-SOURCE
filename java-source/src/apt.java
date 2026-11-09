/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apt
extends aqu {
    public apt(anf anf2, aqu.b b2) {
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
        this.Qt();
        this.Qh();
        if (this.Qc()) {
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
        this.bFP.Kn();
        switch (this.bLs) {
            case bMM: {
                this.bFP.a(true, ani.c.bFK);
                break;
            }
            case bMN: {
                this.bFP.a(true, ani.c.bFL);
                break;
            }
            case bMr: {
                this.bFP.a(true, ani.c.bFH);
                break;
            }
            case bMj: {
                this.bFP.a(true, ani.c.bFN);
            }
        }
        this.Qs();
    }

    @Override
    public String name() {
        switch (this.bLs) {
            case bMM: {
                return "OFFENSIVE LONG RANGE MAGIC";
            }
            case bMN: {
                return "OFFENSIVE SHORT RANGE MAGIC";
            }
            case bMr: {
                return "OFFENSIVE DEBUFF RANGE MAGIC";
            }
            case bMj: {
                return "OFFENSIVE ANTITANK RANGE MAGIC";
            }
        }
        return "OFFENSIVE RANGE MAGIC";
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

