/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqg
extends aqu {
    public aqg(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 10.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.Qh();
        this.Qt();
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
        return "SEARCH & DESTROY";
    }

    @Override
    public boolean Pr() {
        return false;
    }
}

