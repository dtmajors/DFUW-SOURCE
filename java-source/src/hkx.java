/*
 * Decompiled with CFR.
 */
public class hkx
extends hdj {
    bwx kCw;

    public hkx(bwx bwx2) {
        super(bwx2.dXw, null, "ItemList", 304, null);
        this.kCw = bwx2;
    }

    @Override
    protected hen cdl() {
        return this.kCw.aCI();
    }

    public boolean coX() {
        return this.hasAttribute(256);
    }
}

