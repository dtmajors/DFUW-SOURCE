/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqr
extends aqu {
    public aqr(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 25.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Qt();
        if (!this.bFP.e(this.bFP.bCM.Pk(), 40.0f)) {
            return false;
        }
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.bFP.bCM.bE(this.bFP.IZ().bt(30.0f));
        boolean bl = this.bLk > 40.0f ? this.bFP.bCM.b(this.bLn, 20.0f, 1.0f, 10.0f, 0.0f) : this.bFP.bCM.b(this.bLn, 10.0f, 1.5f * arw.Sx() * 1.0f, 6.0f, 0.0f);
        if (!bl) {
            return false;
        }
        this.bFP.bCM.a(aob.a.bJb);
        this.bG(5.0f);
        return this.Qo();
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void initialize() {
        this.bFP.Ko();
        this.bFP.a(true, null);
        this.Qs();
    }

    @Override
    public String name() {
        return "SWIM ATTACK";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

