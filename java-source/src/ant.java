/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class ant
extends ans {
    public ant(anf anf2) {
        super(anf2);
    }

    @Override
    protected aqu.b Mf() {
        aqu.b b2 = null;
        if (b2 == null) {
            b2 = this.Ml();
        }
        if (b2 == null) {
            b2 = this.Mm();
        }
        if (b2 == null) {
            b2 = this.Mn();
        }
        return b2;
    }

    private aqu.b Ml() {
        if (this.bFP.IZ().Ly() == null) {
            return null;
        }
        if (!this.bFP.Iz()) {
            return null;
        }
        if (this.bHp == null) {
            return null;
        }
        if (arw.Sw() < 0.2) {
            return null;
        }
        return aqu.b.bMV;
    }

    private aqu.b Mm() {
        if (this.bHp == null) {
            return aqu.b.bMX;
        }
        if (this.bHp instanceof aqt) {
            return null;
        }
        if (this.bHp instanceof aqr) {
            return null;
        }
        if (arw.Sw() < 0.8) {
            return null;
        }
        return aqu.b.bMX;
    }

    private aqu.b Mn() {
        return aqu.b.bMW;
    }
}

