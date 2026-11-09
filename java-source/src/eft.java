/*
 * Decompiled with CFR.
 */
public class eft
extends efq {
    private int ioQ;
    public int ioP;

    public cu.b bGu() {
        if (this.ioQ >= 0 && this.ioQ < cu.b.lm.length) {
            return cu.b.lm[this.ioQ];
        }
        return cu.b.ll;
    }

    public void a(cu.b b2) {
        this.ioQ = b2 == null ? -1 : b2.ordinal();
    }

    eft() {
        super(14344);
    }
}

