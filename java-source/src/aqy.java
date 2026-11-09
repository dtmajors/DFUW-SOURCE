/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqy
extends aqu {
    private float bNV;

    public aqy(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 6.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        if (this.bF(this.bNV)) {
            return true;
        }
        if (this.PJ()) {
            return true;
        }
        this.PL();
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void initialize() {
        this.bNV = 1.0f;
        this.bFP.Ko();
        if (this.bLs == aqu.b.bNd) {
            this.bFP.a(true, null, ani.a.bFl);
        } else {
            this.bNV = 0.2f;
            if (this.bLs == aqu.b.bNc && this.Qz()) {
                this.bFP.a(true, null, ani.a.bFj);
            } else {
                this.bFP.a(true, null);
            }
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "WATER AGGRESSIVE MELEE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

