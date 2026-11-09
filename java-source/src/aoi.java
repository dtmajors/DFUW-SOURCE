/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aoi
extends aqu {
    public aoi(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 5.0;
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
        if (this.Qn()) {
            return true;
        }
        if (!this.Qp() && this.PR()) {
            return true;
        }
        if (this.PS()) {
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
        if (this.bLs == aqu.b.bMp) {
            this.bFP.a(true, null);
        } else if (this.bLs == aqu.b.bMi) {
            this.bFP.a(true, null, ani.a.bFl);
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "COWARD MELEE";
    }

    @Override
    public boolean Pu() {
        return true;
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

