/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aoy
extends aqu {
    double bJu = 0.0;
    private double bKl = 1.5;
    private boolean bJt;
    private boolean bKm;
    private boolean bKn;

    public aoy(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.8;
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
        this.Ql();
        this.PL();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJu <= 0.0) {
            this.bJu = d2;
            return true;
        }
        if (d2 > this.bJu) {
            if (!this.bJt) {
                this.bJu = d2 + this.bKl;
                this.bFP.hg(33554638);
                this.bJt = true;
            } else {
                this.bJu = Double.POSITIVE_INFINITY;
                this.bFP.If();
                this.bFP.Ij();
            }
        }
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bJu = 0.0;
        this.bJt = false;
        this.bFP.hg(65566);
        this.bFP.a(true, ani.c.bFK);
        this.bFP.Kn();
        this.Qs();
    }

    @Override
    public String name() {
        return "ERODACH MISSILE ATTACK";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

