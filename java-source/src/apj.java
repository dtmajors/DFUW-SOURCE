/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apj
extends aqu {
    public apj(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Kq();
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        if (this.bFP.Ji().LW()) {
            return false;
        }
        this.Qt();
        if (this.Qn()) {
            return true;
        }
        if (this.bG(false)) {
            return true;
        }
        if (this.Qj()) {
            return true;
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void initialize() {
        this.bFP.a(false, null);
        this.Qs();
    }

    @Override
    public String name() {
        return "FOLLOW";
    }

    @Override
    public boolean Pq() {
        return true;
    }

    @Override
    public boolean Pr() {
        return false;
    }
}

