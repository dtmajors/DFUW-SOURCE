/*
 * Decompiled with CFR.
 */
public class fne
extends fmm {
    public boolean iQN = false;
    public int ResourceType = 0;
    public int asi = 0;
    private int gKV = bqy.dFL.ordinal();
    private boolean iQO = false;

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fne() {
        super(7981);
    }

    public final boolean bQf() {
        return this.iQO;
    }

    public final void lg(boolean bl) {
        this.iQO = bl;
    }
}

