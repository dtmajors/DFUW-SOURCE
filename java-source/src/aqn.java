/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqn
extends aqu {
    public aqn(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.0;
    }

    @Override
    public boolean execute() {
        if (this.bFP.IZ().Ly() != null && this.PC() > 0) {
            arw.ct.debug("ShadowImpIdle: I have target and received " + this.PC() + " hits");
            return false;
        }
        this.bFP.Kk();
        this.bFP.Kq();
        if (!arw.bRW && this.P(0.01)) {
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
    }

    @Override
    public String name() {
        return "SHADOW IMP IDLE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

