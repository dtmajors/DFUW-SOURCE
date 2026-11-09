/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class app
extends aqu {
    double bJs = 0.0;

    public app(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.0;
    }

    @Override
    public boolean execute() {
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.hg(65539);
        this.Qs();
    }

    @Override
    public String name() {
        if (this.bFP.az() == cug.fhx) {
            return "HIVEKIN QUEEN IDLE";
        }
        return "SCUMLING QUEEN IDLE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

