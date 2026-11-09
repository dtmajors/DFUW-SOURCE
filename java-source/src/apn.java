/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apn
extends aqu {
    public apn(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 5.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        if (this.Qp()) {
            return false;
        }
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qh();
        this.Qt();
        if (this.bLs == aqu.b.bMG && this.PX()) {
            return true;
        }
        if (this.bLs == aqu.b.bMF && this.PZ()) {
            return true;
        }
        if (this.Qn()) {
            return true;
        }
        if (this.PN()) {
            return true;
        }
        if (this.PT()) {
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
        return null;
    }

    @Override
    public void initialize() {
        if (this.bLs == aqu.b.bMG) {
            this.bFP.Kp();
            this.bFP.a(true, null);
        }
        if (this.bLs == aqu.b.bMF) {
            this.bFP.Kn();
            this.bFP.a(true, ani.c.bFK);
        }
        this.Qs();
    }

    @Override
    public String name() {
        switch (this.bLs) {
            case bMG: {
                return "HIT AND RUN RANGE";
            }
            case bMF: {
                return "HIT AND RUN MAGIC";
            }
        }
        return "HIT AND RUN";
    }

    @Override
    public boolean Pu() {
        return true;
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

