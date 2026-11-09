/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class anw
extends ans {
    public anw(anf anf2) {
        super(anf2);
    }

    @Override
    protected aqu.b Mf() {
        aqu.b b2 = null;
        if (b2 == null) {
            b2 = this.Os();
        }
        if (b2 == null) {
            b2 = this.Or();
        }
        if (b2 == null) {
            b2 = this.Ot();
        }
        return b2;
    }

    private aqu.b Or() {
        if (this.bFP.IZ().Ly() == null) {
            return null;
        }
        if (this.bFP.IZ().Ly().Uq()) {
            if (arw.Sw() < 0.2 && this.bFP.Iz()) {
                return aqu.b.bNb;
            }
            if (this.bFP.IA()) {
                return aqu.b.bNd;
            }
            return null;
        }
        if (this.bFP.Iz()) {
            return aqu.b.bNc;
        }
        return null;
    }

    private aqu.b Os() {
        if (!this.bFP.Kc()) {
            return aqu.b.bNe;
        }
        if (this.bFP.IZ().Ly() == null ? arw.Sw() < 0.1 : !this.bFP.an(this.bFP.IZ().LC()) && arw.Sw() < 0.8) {
            return aqu.b.bNe;
        }
        return null;
    }

    private aqu.b Ot() {
        return aqu.b.bNa;
    }
}

