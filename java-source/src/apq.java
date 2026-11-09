/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apq
extends aqu {
    public apq(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.0;
    }

    @Override
    public boolean execute() {
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
        this.bFP.hg(65539);
        this.Qs();
    }

    @Override
    public String name() {
        return "IDLE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

