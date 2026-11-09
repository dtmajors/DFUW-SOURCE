/*
 * Decompiled with CFR.
 */
public class emu
extends emr {
    private int ew = ayu.cAR.ordinal();

    public ayu bIT() {
        return ayu.getValueByOrdinal(this.ew);
    }

    public void a(ayu ayu2) {
        this.ew = ayu2 == null ? this.ew : ayu2.ordinal();
    }

    emu() {
        super(13926);
    }
}

