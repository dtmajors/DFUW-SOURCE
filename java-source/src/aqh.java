/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public final class aqh
extends aqu {
    public aqh(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 10.0;
        this.bLq = true;
        if (b2 == aqu.b.bNi) {
            this.bFP.a("Shade teleport random", null, del.gjQ, false);
        } else {
            this.bFP.Kl();
        }
    }

    @Override
    public boolean execute() {
        this.Ql();
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        asp.a(del.gjS, this.bFP.av(), this.bFP.getGUID(), this.bFP.getMessageDelegator());
        this.bFP.bn(false);
        this.bFP.bm(false);
        float f = this.bFP.Jl().Uc();
        f += 0.15f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.bFP.c(352, (Object)Float.valueOf(f * this.bFP.Jl().Ub()));
    }

    @Override
    public void end() {
        this.bFP.bn(true);
        this.bFP.bm(true);
    }

    @Override
    public String name() {
        if (this.bLs == aqu.b.bNi) {
            return "SHADE HIDE & TELEPORT";
        }
        return "SHADE HIDE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

