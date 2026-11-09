/*
 * Decompiled with CFR.
 */
public class emo
extends emr {
    private ldv ade = null;
    private int ew = bbu.cRX.ordinal();

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public bbu bIP() {
        return bbu.getValueByOrdinal(this.ew);
    }

    public void a(bbu bbu2) {
        this.ew = bbu2 == null ? this.ew : bbu2.ordinal();
    }

    public boolean vA() {
        return this.bIP().vA();
    }

    emo() {
        super(13895);
    }
}

