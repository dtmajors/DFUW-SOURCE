/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqc
extends aqu {
    public aqc(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.0;
    }

    @Override
    public boolean execute() {
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
        this.Qs();
    }

    @Override
    public String name() {
        return "IDLE";
    }

    @Override
    public boolean Pr() {
        return false;
    }
}

