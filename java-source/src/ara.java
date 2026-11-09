/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class ara
extends aqu {
    public ara(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 6.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Kq();
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
        return "WATER IDLE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

