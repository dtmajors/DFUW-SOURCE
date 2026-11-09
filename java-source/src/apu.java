/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apu
extends aqu {
    public apu(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 3.0;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.PL();
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Qt();
        return this.Qd();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        assert (this.bLs == aqu.b.bMQ);
        this.bFP.Kn();
        this.bFP.a(true, ani.c.bFM);
        this.Qs();
    }

    @Override
    public String name() {
        return "OFFENSIVE SELF MAGIC";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

