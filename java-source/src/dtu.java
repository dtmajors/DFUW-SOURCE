/*
 * Decompiled with CFR.
 */
public abstract class dtu
implements Comparable {
    protected int hdr = 0;
    protected boolean hdh = false;

    public int getLevel() {
        return this.hdr;
    }

    public void setLevel(int n) {
        this.hdr = n;
    }

    public boolean bAy() {
        return this.hdh;
    }

    public void jH(boolean bl) {
        this.hdh = bl;
    }

    public abstract int compareTo(Object var1);
}

