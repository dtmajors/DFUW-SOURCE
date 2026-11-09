/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqj
extends aqu {
    double bJs = 0.0;
    private boolean bKY;
    private boolean bKm;
    private boolean bKn;

    public aqj(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 5.2;
        this.bLq = true;
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
        this.Qt();
        this.PM();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJs <= 0.0) {
            this.bJs = d2;
            return true;
        }
        if (d2 > this.bJs) {
            if (!this.bKY) {
                this.bJs = d2 + 2.0;
                this.bFP.hg(590188);
                this.bKY = true;
            } else if (!this.bKm) {
                this.bJs = d2 + 1.2;
                this.bFP.hg(590193);
                this.bKm = true;
                this.bFP.If();
                this.bFP.Ij();
            } else if (!this.bKn) {
                this.bJs = d2 + 2.0;
                this.bFP.hg(590189);
                this.bKn = true;
            } else {
                this.bJs = Double.POSITIVE_INFINITY;
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(true, ani.c.bFK);
        this.bFP.Kn();
        this.Qs();
    }

    @Override
    public String name() {
        return "SHADOW DRAGON ATTACK";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

