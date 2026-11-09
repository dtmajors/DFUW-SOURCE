/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apf
extends aqu {
    public apf(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 25.0;
    }

    @Override
    public boolean execute() {
        this.bFP.bCK.OC();
        this.bFP.Kk();
        this.bFP.Kq();
        if (!this.bFP.e(this.bFP.bCK.Ov(), 160.0f)) {
            return false;
        }
        return this.PW();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(false, null);
        this.Qs();
        this.bFP.bCK.a(this.bFP.br(160.0f), 100.0f, 50.0f, 25.0f, 0.0f);
        this.bFP.bCK.a(any.a.bIo);
        this.bFP.stop();
    }

    @Override
    public String name() {
        return "FLY RANDOM";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

