/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqm
extends aqu {
    public aqm(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 15.0;
    }

    @Override
    public boolean execute() {
        if (this.bFP.IZ().Ly() != null && this.PC() > 0) {
            arw.ct.debug("ShadowGolemPatrol: I have target and received " + this.PC() + " hits");
            return false;
        }
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
        return "SHADOW GOLEM PATROL";
    }

    @Override
    public boolean Py() {
        return true;
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

