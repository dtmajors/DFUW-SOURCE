/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqq
extends aqu {
    public aqq(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 3.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Qt();
        if (this.Qd()) {
            return true;
        }
        if (this.Qn()) {
            return true;
        }
        if (this.bFP.IZ().LK()) {
            if (this.PQ()) {
                return true;
            }
            if (this.Qj()) {
                return true;
            }
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.Kn();
        if (this.bLs == aqu.b.bMn) {
            this.bFP.a(true, ani.c.bFG);
        }
        if (this.bLs == aqu.b.bME) {
            this.bFP.a(true, ani.c.bFJ);
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "SUPPORT SELF MAGIC";
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

