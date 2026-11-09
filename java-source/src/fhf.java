/*
 * Decompiled with CFR.
 */
public class fhf
extends fhc {
    private int ew = bnj.dwi.ordinal();
    private ldv atb;
    private ljq atc;
    private ljq ate;
    private int atf;
    private int iMj;

    public bnj bPD() {
        return bnj.getValueByOrdinal(this.ew);
    }

    public void a(bnj bnj2) {
        this.ew = bnj2 == null ? this.ew : bnj2.ordinal();
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

    public int bPE() {
        return this.iMj;
    }

    public void GL(int n) {
        this.iMj = n;
    }

    fhf() {
        super(23815);
    }
}

