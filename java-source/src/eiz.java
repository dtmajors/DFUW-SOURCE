/*
 * Decompiled with CFR.
 */
public class eiz
extends ejm {
    private int ew = axr.ctd.ordinal();

    public axr bHn() {
        return axr.getValueByOrdinal(this.ew);
    }

    public void a(axr axr2) {
        this.ew = axr2 == null ? this.ew : axr2.ordinal();
    }

    eiz() {
        super(18736);
    }
}

