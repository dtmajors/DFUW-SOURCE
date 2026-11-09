/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqw
extends aqu {
    double bJs;
    private boolean bJt;

    public aqw(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        this.Ql();
        this.bFP.hg(100663652);
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(true, null);
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public String name() {
        return "TROLL LORD FOEBRINGER";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

