/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqo
extends aqu {
    public aqo(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 1.0;
    }

    @Override
    public boolean execute() {
        if (this.Qp()) {
            return false;
        }
        this.bFP.Kk();
        if (this.Qn()) {
            return true;
        }
        if (this.PT()) {
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
        this.Qs();
    }

    @Override
    public String name() {
        return "SHORT BURST";
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

