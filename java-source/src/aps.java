/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.Collection;

public class aps
extends aqu {
    private boolean bJt;
    boolean bKT = false;

    public aps(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 3.3;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (this.PK()) {
            this.bFP.Kr();
        }
        if (!this.bJt) {
            this.bFP.hg(65907);
        }
        return this.Ql();
    }

    @Override
    public void O(double d2) {
        if (!this.bKT && d2 < (double)1.33f) {
            float f = 25.0f + 25.0f * arw.Sx();
            Collection<asv> collection = this.bFP.IZ().r(this.bFP.av(), 16.0f);
            for (asv asv2 : collection) {
                this.bFP.a(asv2, lea.enT().getType("Impact Damage"), f, 3.0f, 3.0f, anf.a.bEb);
            }
            this.bKT = true;
        }
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.hg(65566);
        this.bKT = false;
        this.Qs();
    }

    @Override
    public String name() {
        return "OAKLORD AOE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

