/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apv
extends aqu {
    public apv(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 6.0;
    }

    @Override
    public boolean execute() {
        if (this.Qp()) {
            return false;
        }
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.PO();
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
        this.bFP.Ko();
        this.bFP.a(true, null);
        this.Qs();
    }

    @Override
    public String name() {
        return "PANIC";
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

