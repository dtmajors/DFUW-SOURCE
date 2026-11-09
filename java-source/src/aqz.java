/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqz
extends aqu {
    ljp bNW;

    public aqz(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 16.0;
        this.bNW = new ljp(0.0f, 0.0f);
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Kq();
        if (this.bFP.a(this.bNW)) {
            return false;
        }
        if (this.b(this.bNW, true)) {
            return true;
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(false, null);
        this.Qs();
        ljq ljq2 = this.bFP.Jk();
        this.bNW.x = ljq2.x;
        this.bNW.y = ljq2.rlV;
    }

    @Override
    public String name() {
        return "WATER FLEE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

