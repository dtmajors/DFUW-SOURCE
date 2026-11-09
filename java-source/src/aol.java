/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.Collection;

public class aol
extends aqu {
    final float bJw = 40.0f;
    final float bJx = 100.0f;
    final float bJy = 8.0f;
    final double bJz = 0.8;
    final double bJA = 6.3;
    double bJu = 0.0;
    double bJB = 0.0;
    private boolean bJC;
    ljp bJh;
    private double bJD;
    private int bJE;

    public aol(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 15.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        double d2 = this.bFP.Jp().rgz;
        if (this.bJu <= 0.0) {
            this.bJu = d2;
            return true;
        }
        if (!this.bJC && this.Pv()) {
            this.bFP.hg(33554548);
            this.bJB = d2;
            this.bJC = true;
        }
        if (this.bJC) {
            this.Ql();
            if (d2 - this.bJu > 0.8) {
                this.bJu = d2;
                Collection<asv> collection = this.bFP.IZ().r(this.bFP.av(), 40.0f);
                for (asv asv2 : collection) {
                    float f = this.bFP.Ja().p(asv2);
                    float f2 = 100.0f * (1.0f - f / 40.0f);
                    this.bFP.a(asv2, lea.enT().getType("Unholy Damage"), f2, f2);
                }
            }
            if (d2 - this.bJB > 6.3) {
                return false;
            }
        } else {
            this.PQ();
            if (this.bFP.bCL.OL()) {
                if (++this.bJE > 4) {
                    return false;
                }
            } else {
                this.bJE = 0;
            }
        }
        return true;
    }

    private boolean Pv() {
        if (this.bFP.a(this.bJh, 0.5f)) {
            return true;
        }
        return this.bJD - 6.3 > 0.0 && this.bJD - 6.3 < 0.3 && this.bFP.Jj().x(this.bJh) <= 8.0f;
    }

    @Override
    public void O(double d2) {
        this.bJD = d2;
    }

    @Override
    public void end() {
        this.bFP.hg(65566);
    }

    @Override
    public ljq Pp() {
        ljq ljq2 = this.bFP.IY().esF();
        ljq2.kl((float)((double)ljq2.getX() + arw.e(-8.0, 8.0)));
        ljq2.fb((float)((double)ljq2.bdV() + arw.e(-8.0, 8.0)));
        this.bJh = new ljp(ljq2.getX(), ljq2.bdV());
        return ljq2;
    }

    @Override
    public void initialize() {
        assert (this.bLs == aqu.b.bNM);
        this.bJE = 0;
        this.bJC = false;
        this.bFP.hg(65566);
        this.bFP.Kn();
        this.bFP.a(true, ani.c.bFM);
        this.Qs();
    }

    @Override
    public String name() {
        return "DAVOS LEECH EARTHQUAKE";
    }

    @Override
    public boolean Pr() {
        return true;
    }

    @Override
    public boolean Ps() {
        return true;
    }
}

