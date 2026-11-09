/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqs
extends aqu {
    public aqs(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 20.0;
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Kq();
        if (!this.bFP.e(this.bFP.bCM.Pk(), 40.0f)) {
            return false;
        }
        this.bFP.bCM.bE(this.bFP.IZ().bt(30.0f));
        return this.Qo();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(false, null);
        this.Qs();
        this.bFP.bCM.b(this.bFP.br(40.0f), 30.0f, 20.0f, 8.0f, 0.0f);
        this.bFP.bCM.a(aob.a.bJa);
    }

    @Override
    public String name() {
        return "SWIM RANDOM";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

