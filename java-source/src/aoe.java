/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aoe
extends aqu {
    public aoe(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 4.0;
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
        this.Qh();
        if (this.Qc()) {
            return true;
        }
        if (this.Qn()) {
            return true;
        }
        if (this.bC(7.5f)) {
            return true;
        }
        this.PU();
        if (this.PN()) {
            return true;
        }
        if (this.PQ()) {
            return true;
        }
        if (this.bG(false)) {
            return true;
        }
        this.PL();
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        ljq ljq2 = this.bFP.IZ().LC();
        ljq ljq3 = this.bFP.IY().esF();
        float f = 14.0f;
        float f2 = 7.0f;
        float f3 = ljq2.getX() < ljq3.getX() - f || ljq2.getX() > ljq3.getX() + f ? (float)((double)ljq3.getX() + arw.e(-f, f)) : ljq2.getX();
        float f4 = ljq2.bdV() < ljq3.bdV() - f2 || ljq2.bdV() > ljq3.bdV() + f2 ? (float)((double)ljq3.bdV() + arw.e(-f2, f2)) : ljq2.bdV();
        ljq ljq4 = new ljq(f3, ljq3.getY(), f4);
        arw.ct.debug(this.getClass().getSimpleName() + ": target position: [" + ljq4 + "]");
        return ljq4;
    }

    @Override
    public void initialize() {
        this.bFP.Kn();
        this.bFP.a(true, ani.c.bFK);
        this.Qs();
    }

    @Override
    public String name() {
        return "BELOW LONG RANGE MAGIC";
    }

    @Override
    public boolean Ps() {
        return true;
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

