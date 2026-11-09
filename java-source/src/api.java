/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class api
extends aqu {
    public api(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 40.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Qt();
        if (!this.bFP.e(this.bFP.bCK.Ov(), 160.0f)) {
            return false;
        }
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.bFP.bCK.a(this.bLn, 85.0f, 15.0f, 10.0f, 0.0f);
        this.bE(0.4f);
        return this.PW();
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void end() {
        this.bFP.k(16, 30.0f);
        this.bFP.bCK.Oy();
    }

    @Override
    public void initialize() {
        this.bFP.Kn();
        this.bFP.a(true, ani.c.bFL);
        this.Qs();
        this.bFP.k(16, 10.0f);
        this.bFP.bCK.Oz();
        this.bFP.stop();
        this.bFP.bCK.a(any.a.bIq);
    }

    @Override
    public String name() {
        return "FLY STOP";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

