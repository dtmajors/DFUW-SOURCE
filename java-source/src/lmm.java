/*
 * Decompiled with CFR.
 */
public class lmm
extends lmi {
    private long rEO = 0L;

    public lmm() {
        super(2);
    }

    public long getValue() {
        return this.rEO;
    }

    public String toString() {
        return Long.toString(this.getValue());
    }
}

