/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aox
extends aqu {
    double bJu = 0.0;
    private boolean bJC;
    private boolean bKk;

    public aox(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 12.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Ql();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJu <= 0.0) {
            this.bJu = d2;
            return true;
        }
        if (d2 > this.bJu) {
            if (!this.bJC && d2 - this.bJu > 2.0) {
                this.bFP.Ij();
                this.bJC = true;
                this.bJu = d2 + (double)7.2f;
            } else if (this.bJC && !this.bKk) {
                this.bFP.a(this.bFP.Jl(), lea.enT().getType("Impact Damage"), 50.0f + 50.0f * arw.Sx(), 5.0f, 16.0f, anf.a.bEc);
                this.bJu = Double.POSITIVE_INFINITY;
                this.bKk = true;
            }
        }
        return true;
    }

    @Override
    public void end() {
        int n = this.bFP.KQ();
        arz.SH().hO(n);
        this.bFP.hl(n);
        this.bFP.hn(-1);
        this.bFP.bm(true);
        this.bFP.hh(33554913);
        this.bFP.hg(65566);
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        assert (this.bLs == aqu.b.bNG);
        this.bKk = false;
        this.bJC = false;
        this.bJu = 0.0;
        int n = arz.SH().c(cug.fhC, this.bFP.av(), new lgl(0.0f, 0.0f, 0.0f));
        this.bFP.hi(n);
        this.bFP.hn(n);
        this.bFP.bm(false);
        this.bFP.hg(33554913);
        this.bFP.Kn();
        this.bFP.a(true, ani.c.bFM);
        this.Qs();
    }

    @Override
    public String name() {
        return "ERODACH EARTHQUAKE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

