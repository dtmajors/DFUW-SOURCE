/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
import java.util.Collection;

public class aog
extends aqu {
    double bJs = 0.0;
    private boolean bJt;

    public aog(anf anf2, aqu.b b2) {
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
        this.Ql();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJs <= 0.0) {
            this.bJs = d2;
            return true;
        }
        if (d2 > this.bJs) {
            if (!this.bJt && d2 - this.bJs > 2.0) {
                this.bJs = d2 + 2.3;
                this.bFP.hg(100663650);
                this.bJt = true;
            } else if (this.bJt) {
                this.bJs = Double.POSITIVE_INFINITY;
                Collection<asv> collection = this.bFP.IZ().r(this.bFP.av(), 100.0f);
                for (asv asv2 : collection) {
                    this.bFP.a(asv2, lea.enT().getType("Impact Damage"), 210.0f + 30.0f * arw.Sx(), 6.0f, 1.0f, anf.a.bEb);
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
        if (this.bFP.az() == cug.fhz) {
            return "CELESTIAL SPECIAL ATTACK";
        }
        return "INFERNAL SPECIAL ATTACK";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

