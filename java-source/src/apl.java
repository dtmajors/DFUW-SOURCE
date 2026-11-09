/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apl
extends aqu {
    public apl(anf anf2, aqu.b b2) {
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
        if (this.v(this.bFP.IZ().Ly()) && this.Qm()) {
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
        if (this.bH(false)) {
            this.bFP.a(true, null, ani.a.bFj);
        } else {
            this.bFP.a(true, null);
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "FRENZY MELEE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

