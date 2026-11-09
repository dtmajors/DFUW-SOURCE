/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aoq
extends aqu {
    boolean bJO;
    boolean bJP;
    final float bJN = 35.0f;

    public aoq(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 4.5;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void O(double d2) {
        if (d2 < 3.0 && !this.bJP) {
            this.bJP = true;
            this.bFP.hg(65908);
        }
        if (d2 < 2.0 && !this.bJO) {
            this.bJO = true;
            int n = this.bFP.IK();
            if (n < 3) {
                arz.SH().c(cug.fhs, this.bFP.Jk().esF(), new lgl(0.0f, arw.Sx() * (float)Math.PI, 0.0f));
                ++n;
            }
            for (int i = 0; i < n; ++i) {
                this.bFP.a(this.bFP.Jl(), lea.enT().getType("Fire Damage"), 55.0f + 15.0f * arw.Sx(), 2.0f, 35.0f, anf.a.bEc);
            }
        }
    }

    @Override
    public void initialize() {
        this.bFP.hg(65907);
        this.bJO = false;
        this.bJP = false;
    }

    @Override
    public String name() {
        return "DEMON SPECIAL";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

