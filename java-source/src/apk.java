/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apk
extends aqu {
    public apk(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 1.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qh();
        this.Qt();
        this.Qa();
        this.PL();
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.Kn();
        if (this.bLs == aqu.b.bMh) {
            this.bFP.a(true, ani.c.bFK);
        } else {
            this.bFP.a(true, ani.c.bFL);
        }
        this.Qs();
    }

    @Override
    public String name() {
        if (this.bLs == aqu.b.bMh) {
            return "FRENZY MAGIC LONG";
        }
        return "FRENZY MAGIC SHORT";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

