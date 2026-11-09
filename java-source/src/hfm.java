/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hfm
extends hpe {
    public final boolean kjc;
    private hpe.c kjd = null;
    private hpe.c kje = null;
    private lcq kjf = null;

    public hfm(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpe.c c2, String string2, boolean bl) {
        super((hnc)hdm2, string, lgg2, lhf2, c2, string2);
        this.kjd = c2;
        this.kjc = bl;
        if (this.kjc && c2 instanceof hpe.e) {
            this.kje = new hpe.e(c2.jFE, lcq.BRIGHT_WHITE, ((hpe.e)c2).kUX, ((hpe.e)c2).kUY);
        }
    }

    @Override
    public void chL() {
        super.chL();
        if (!this.kjc) {
            return;
        }
        this.a(this.kje);
        this.kjf = this.cuw();
        this.H(lcq.BRIGHT_WHITE);
    }

    @Override
    public void chK() {
        super.chK();
        if (!this.kjc) {
            return;
        }
        this.a(this.kjd);
        if (this.kjf != null) {
            this.H(this.kjf);
        }
    }

    @Override
    public void cbM() {
        super.cbM();
        if (!this.kjc) {
            return;
        }
        if (!this.kLu.csd()) {
            ((hdm)this.kLu).jZD.kat.mA(this.getText());
        }
    }
}

