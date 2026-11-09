/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aon
extends aqu {
    private int bJK;

    public aon(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.0;
    }

    @Override
    public boolean execute() {
        if (this.bFP.KP() >= 2) {
            return false;
        }
        if (this.bFP.KQ() == -1) {
            ljq ljq2 = this.bFP.av().esF();
            ljq2.rlV += 2.0f;
            this.bJK = arz.SH().c(cug.fhp, ljq2, new lgl(0.0f, 0.0f, 0.0f));
            this.bFP.hi(this.bJK);
            this.bFP.hn(this.bJK);
            this.bFP.bm(false);
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.hg(65907);
        this.Qs();
    }

    @Override
    public String name() {
        return "DAVOS IDLE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

