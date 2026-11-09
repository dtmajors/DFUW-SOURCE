/*
 * Decompiled with CFR.
 */
public class lgu {
    private long rmQ;
    private static final int rmR = 56;
    private static final long rmS = 0x1000000L;
    private static final long rmT = 0L;

    protected ldv erH() {
        ++this.rmQ;
        if (this.rmQ >= 0x1000000L) {
            this.rmQ = 0L;
        }
        long l = this.rmQ;
        ldv ldv2 = new ldv(l);
        return ldv2;
    }
}

