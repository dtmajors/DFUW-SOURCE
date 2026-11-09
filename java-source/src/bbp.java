/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum bbp {
    cRt(mbh.ujq),
    cRu(mbh.ujr),
    cRv(mbh.ujs),
    cRw(mbh.ujt),
    cRx(mbh.uju),
    cRy(mbh.ujv),
    cRz(mbh.ujw);

    private lox ctl = null;

    public lox YF() {
        return this.ctl;
    }

    public boolean vA() {
        return this == cRz;
    }

    public String cu() {
        return this.ctl == null ? null : this.ctl.getIdentifier();
    }

    private bbp(lox lox2) {
        this.ctl = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.ctl.bD(new Object[0]).exA() : super.toString();
    }

    public static bbp getValueByOrdinal(int n) {
        return n < 0 || n >= bbp.values().length ? cRt : bbp.values()[n];
    }
}

