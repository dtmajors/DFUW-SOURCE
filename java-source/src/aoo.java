/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aoo
extends aqu {
    private final int bJL = 5;
    boolean bJM;
    boolean bJt;
    final float bJN = 35.0f;

    public aoo(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 8.0;
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
        if (!this.bJt) {
            this.bJt = true;
            this.bFP.hg(33554783);
        } else if (d2 < 2.0 && !this.bJM) {
            this.bJM = true;
            int n = ars.Sl().di(this.bFP.getGUID());
            if (n < 5) {
                int n2 = ars.Sl().Sn();
                ljq ljq2 = this.hw(n2);
                ars.Sl().a(ljq2, new lgl(0.0f, arw.Sx() * (float)Math.PI, 0.0f), this.bFP.getGUID(), n2);
            }
        }
    }

    private ljq hw(int n) {
        float f = 5.0f;
        ljq ljq2 = this.bFP.IY().esF();
        switch (n) {
            case 0: {
                ljq2.kl((float)((double)(ljq2.getX() - 19.0f) + arw.e(-5.0, 5.0)));
                ljq2.fb((float)((double)(ljq2.bdV() + 19.0f) + arw.e(-5.0, 5.0)));
                break;
            }
            case 1: {
                ljq2.kl((float)((double)(ljq2.getX() + 19.0f) + arw.e(-5.0, 5.0)));
                ljq2.fb((float)((double)(ljq2.bdV() + 19.0f) + arw.e(-5.0, 5.0)));
                break;
            }
            case 2: {
                ljq2.kl((float)((double)(ljq2.getX() + 19.0f) + arw.e(-5.0, 5.0)));
                ljq2.fb((float)((double)(ljq2.bdV() - 19.0f) + arw.e(-5.0, 5.0)));
                break;
            }
            case 3: {
                ljq2.kl((float)((double)(ljq2.getX() - 19.0f) + arw.e(-5.0, 5.0)));
                ljq2.fb((float)((double)(ljq2.bdV() - 19.0f) + arw.e(-5.0, 5.0)));
                break;
            }
            case 4: {
                ljq2.kl((float)((double)ljq2.getX() + arw.e(-5.0, 5.0)));
                ljq2.fb((float)((double)ljq2.bdV() + arw.e(-5.0, 5.0)));
            }
        }
        return ljq2;
    }

    @Override
    public void initialize() {
        int n = arz.SH().c(cug.fhq, this.bFP.av(), new lgl(0.0f, 0.0f, 0.0f));
        this.bFP.hi(n);
        this.bFP.hn(n);
        this.bFP.bm(false);
        this.bFP.hg(65566);
        this.bJM = false;
        this.bJt = false;
    }

    @Override
    public String name() {
        return "DAVOS TOTEM";
    }

    @Override
    public boolean Pr() {
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
}

