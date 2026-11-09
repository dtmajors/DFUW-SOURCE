/*
 * Decompiled with CFR.
 */
public class hkc
extends hdj {
    public final hfg jIQ;

    public hkc(hfg hfg2) {
        super(hfg2.jIm.dXw, null, "ChatWindow_" + hfg2.Identifier, 316, null);
        this.jIQ = hfg2;
    }

    @Override
    protected hen cdl() {
        return this.jIQ.cdl();
    }

    @Override
    protected boolean d(lfu lfu2) {
        boolean bl = this.jIQ.d(lfu2);
        bl = super.d(lfu2) || bl;
        return bl;
    }

    public boolean coX() {
        return this.hasAttribute(256);
    }
}

