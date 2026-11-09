/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqp
extends aqu {
    public aqp(anf anf2, aqu.b b2) {
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
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        if (this.Qe()) {
            return true;
        }
        if (this.Qn()) {
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
        if (this.bLs == aqu.b.bMm) {
            this.bFP.a(true, ani.c.bFF);
        }
        if (this.bLs == aqu.b.bMD) {
            this.bFP.a(true, ani.c.bFI);
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "SUPPORT RANGE MAGIC";
    }

    @Override
    public boolean Pq() {
        return true;
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

