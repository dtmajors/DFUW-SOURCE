/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aow
extends aqu {
    public aow(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 1.0;
    }

    @Override
    public boolean execute() {
        this.PL();
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void initialize() {
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public boolean Ps() {
        return true;
    }

    @Override
    public String name() {
        return "ENEMY SPOTTED";
    }

    @Override
    public boolean Pr() {
        return false;
    }
}

