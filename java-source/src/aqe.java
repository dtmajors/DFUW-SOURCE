/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.Collection;

public class aqe
extends aqu {
    double bJs = 0.0;
    private boolean bJt;

    public aqe(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 6.5;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        this.PL();
        this.Ql();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJs <= 0.0) {
            this.bJs = d2;
            return true;
        }
        if (d2 > this.bJs) {
            if (!this.bJt && d2 - this.bJs > 2.0) {
                this.bJs = d2 + 2.3;
                this.bFP.hg(100663758);
                this.bJt = true;
            } else if (this.bJt) {
                this.bJs = d2 + 0.5;
                Collection<asv> collection = this.bFP.IZ().r(this.bFP.av(), 25.0f);
                for (asv asv2 : collection) {
                    if (!(Math.abs(anp.a(this.bFP.av(), this.bFP.IV(), asv2.av())) < 1.0f)) continue;
                    this.bFP.a(asv2, lea.enT().getType("Acid Damage"), 1.0f);
                }
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
        this.bFP.a(true, null);
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public String name() {
        return "RAGAIZAN SCREAM";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

