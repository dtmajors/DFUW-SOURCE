/*
 * Decompiled with CFR.
 */
public class eko
extends emr {
    private ldv isO = null;
    private ldv aDk = null;
    private int ist = -1;
    private int ilu = aya.cvc.ordinal();

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public ldv acm() {
        return this.aDk;
    }

    public void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    public int bHD() {
        return this.ist;
    }

    public void El(int n) {
        this.ist = n;
    }

    public aya bHE() {
        return aya.getValueByOrdinal(this.ilu);
    }

    public void a(aya aya2) {
        this.ilu = aya2 == null ? this.ilu : aya2.ordinal();
    }

    eko() {
        super(13902);
    }
}

