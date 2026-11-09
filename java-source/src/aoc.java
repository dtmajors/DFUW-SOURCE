/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aoc
extends aqu {
    public aoc(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.5;
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
        this.Qh();
        this.Qt();
        if (this.Qg()) {
            return true;
        }
        if (this.bG(true)) {
            return true;
        }
        if (this.Qn()) {
            return true;
        }
        if (this.bD(4.0f)) {
            return true;
        }
        this.PU();
        if (this.PN()) {
            return true;
        }
        if (this.PQ()) {
            return true;
        }
        if (this.bD(Float.MAX_VALUE)) {
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
        this.bFP.Ko();
        if (this.bLs == aqu.b.bMe) {
            if (this.Qy()) {
                this.bFP.a(true, null, ani.a.bFj);
            } else {
                this.bFP.a(true, null);
            }
        }
        if (this.bLs == aqu.b.bMk) {
            this.bFP.a(true, null, ani.a.bFl);
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "AGGRESSIVE MELEE";
    }

    @Override
    public boolean Pq() {
        return true;
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

