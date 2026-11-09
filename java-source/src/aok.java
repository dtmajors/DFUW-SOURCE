/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aok
extends aqu {
    double bJu = 0.0;
    final double bJv = 5.5;
    private boolean bJt;

    public aok(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 10.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        this.Ql();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJu <= 0.0) {
            this.bJu = d2;
            return true;
        }
        if (d2 > this.bJu) {
            if (!this.bJt && d2 - this.bJu > 2.0) {
                this.bJu = d2 + 5.5;
                this.bFP.hg(33554638);
                this.bJt = true;
            } else if (this.bJt) {
                this.bJu = Double.POSITIVE_INFINITY;
                this.bFP.a(this.bFP.Jl(), lea.enT().getType("Unholy Damage"), 150.0f, 6.0f, 16.0f, anf.a.bEc);
                this.bFP.a(this.bFP.Jl(), lea.enT().getType("Unholy Damage"), 150.0f, 6.0f, 16.0f, anf.a.bEc);
                this.bFP.a(this.bFP.Jl(), lea.enT().getType("Unholy Damage"), 150.0f, 6.0f, 16.0f, anf.a.bEc);
                this.bFP.a(this.bFP.Jl(), lea.enT().getType("Unholy Damage"), 150.0f, 6.0f, 16.0f, anf.a.bEc);
            }
        }
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void end() {
        this.bFP.hg(65566);
    }

    @Override
    public void initialize() {
        this.bJt = false;
        this.bJu = 0.0;
        this.bFP.a(true, null);
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public String name() {
        return "DAVOS BLAST";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

