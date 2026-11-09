/*
 * Decompiled with CFR.
 */
public class hlc
extends hdj {
    public final bwy krU;

    public hlc(bwy bwy2) {
        super(bwy2.dXw, null, "Monitor_" + bwy2.dXC.eny(), 304, null);
        this.krU = bwy2;
    }

    @Override
    protected hen cdl() {
        return this.krU.aCI();
    }

    public boolean coX() {
        return this.hasAttribute(256);
    }
}

