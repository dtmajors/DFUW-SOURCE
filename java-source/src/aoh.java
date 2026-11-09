/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aoh
extends aqu {
    public aoh(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 3.0;
    }

    @Override
    public boolean execute() {
        if (this.bFP.IU() == null) {
            return false;
        }
        this.bFP.Kk();
        this.bFP.Kq();
        if (this.Qv()) {
            return true;
        }
        if (this.Qx()) {
            return true;
        }
        if (this.Qu()) {
            return true;
        }
        if (this.Qw()) {
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
        return "COMMAND";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

