/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apb
extends aqu {
    public apb(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 9.0;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Qh();
        this.Qt();
        this.PO();
        if (this.Qk()) {
            return true;
        }
        if (this.Qp()) {
            return false;
        }
        if (this.Qn()) {
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
        this.bFP.Ko();
        this.bFP.a(true, null);
        this.Qs();
    }

    @Override
    public String name() {
        return "FIND COVER";
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

