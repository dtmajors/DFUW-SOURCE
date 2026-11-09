/*
 * Decompiled with CFR.
 */
public class fig
extends fhc {
    private int ew = clk.eIR.ordinal();
    private ldv atb;
    private ljq atc;
    private ljq ate;
    private int atf;

    public clk bPJ() {
        return clk.getValueByOrdinal(this.ew);
    }

    public void a(clk clk2) {
        this.ew = clk2 == null ? this.ew : clk2.ordinal();
    }

    public ldv oS() {
        return this.atb;
    }

    public void pF(ldv ldv2) {
        this.atb = ldv2;
    }

    public ljq oT() {
        return this.atc;
    }

    public void Y(ljq ljq2) {
        this.atc = ljq2;
    }

    public ljq oR() {
        return this.ate;
    }

    public void X(ljq ljq2) {
        this.ate = ljq2;
    }

    public int oY() {
        return this.atf;
    }

    public void ru(int n) {
        this.atf = n;
    }

    fig() {
        super(23832);
    }
}

