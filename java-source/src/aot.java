/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.Collection;

public class aot
extends aqu {
    private final double bKa = 1.0;
    private double bKb = 0.0;
    private boolean bKc;
    private boolean bKd;
    private ljq bKe;
    private ljq bKf;
    private StringBuilder bKg;

    public aot(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 3.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        this.PL();
        double d2 = this.bFP.Jp().rgz;
        if (this.bKb <= 0.0) {
            this.bKb = d2;
            return true;
        }
        if (!this.bKc) {
            if (this.bFP.ap(this.bKe)) {
                arw.ct.debug("***boss is facing " + this.bKe);
                this.bKb = d2 + 1.0;
                ljp ljp2 = new ljp(this.bKe.x, this.bKe.rlV);
                this.d(ljp2);
                this.bKc = true;
            }
        } else if (this.bFP.aq(this.bKe)) {
            this.Ql();
            if (!this.bKd) {
                this.bKg.append("***ENDANIMATION NOT Started  newPos " + this.bFP.av() + "\n");
                this.bFP.hg(590123);
                Collection<asv> collection = this.bFP.IZ().r(this.bFP.av(), 16.0f);
                for (asv asv2 : collection) {
                    this.bFP.a(asv2, lea.enT().getType("Impact Damage"), 1.0f, 1.0f, 1.0f, anf.a.bEb);
                }
                this.bKd = true;
            }
        }
        return true;
    }

    @Override
    public void O(double d2) {
        super.O(d2);
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
        this.bKg = new StringBuilder();
        this.bKc = false;
        this.bKd = false;
        this.bKe = this.bFP.IZ().LC().esF();
        this.bKe.y = this.bFP.av().y;
        ljq ljq2 = ljq.z(this.bKe, this.bFP.av());
        float f = 1.0f;
        this.bKf = ljq.D(ljq2, f);
        arw.ct.debug("***this pos: " + this.bFP.av() + " tgtpos: " + this.bKe + " jmpDur: " + 1.0 + " distPerSec: " + this.bKf);
    }

    @Override
    public void end() {
        arw.ct.debug(this.bKg.toString());
        arw.ct.info("***doombringer jump end");
        this.bFP.hh(590123);
        this.bFP.hg(65566);
    }

    @Override
    public String name() {
        return "DOOMBRINGER JUMP ATTACK";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

