/*
 * Decompiled with CFR.
 */
public class ipw
extends ipm {
    private static iqz mdv = new iqu(32, 32);

    public ipw() {
        this(ire.mul, true);
    }

    public ipw(ire ire2, boolean bl) {
        super(bl ? 0 : 0xFFFFFF, bl ? 0xFFFFFF : 0, ire2);
        this.setVisible(false);
        this.a(mdv);
        this.a(ipd.mqz);
    }
}

