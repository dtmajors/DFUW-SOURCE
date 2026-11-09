/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apd
extends aqu {
    public apd(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 30.0;
    }

    @Override
    public boolean execute() {
        this.bFP.bCK.OC();
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
        float f = 15.0f;
        float f2 = 130.0f;
        if (this.bFP.Jv()) {
            f = 50.0f;
            f2 = 150.0f;
        }
        this.bFP.bCK.a(this.bLn, f2, f, 25.0f, 0.0f);
        this.bFP.bCK.a(any.a.bIq);
        this.bE(0.3f);
        return this.PW();
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void initialize() {
        this.bFP.Kn();
        this.bFP.a(true, ani.c.bFK);
        this.Qs();
        this.bFP.stop();
    }

    @Override
    public String name() {
        return "FLY ATTACK";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

