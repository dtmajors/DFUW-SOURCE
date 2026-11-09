/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apw
extends aqu {
    public apw(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 15.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Kq();
        if (this.bFP.Ji().LV()) {
            return false;
        }
        if (this.bFP.Ji().LW()) {
            return false;
        }
        if (this.Qn()) {
            return true;
        }
        if (this.Qj()) {
            return true;
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(false, null);
        this.Qs();
    }

    @Override
    public String name() {
        return "PATROL";
    }

    @Override
    public boolean Py() {
        return true;
    }

    @Override
    public boolean Pr() {
        return false;
    }
}

