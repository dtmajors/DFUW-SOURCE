/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class aqt
extends aqu {
    public aqt(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 25.0;
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
        this.bFP.bCM.b(this.bFP.av(), 20.0f, 20.0f, 8.0f, 5.0f);
        this.bFP.bCM.a(aob.a.bIZ);
    }

    @Override
    public String name() {
        return "SWIM SPIRAL";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

