/*
 * Decompiled with CFR.
 */
public class iqu
extends irl {
    private int mbc;
    private int mbd;

    public iqu(int n, int n2) {
        this.mbc = n;
        this.mbd = n2;
    }

    @Override
    public void e(ipf ipf2) {
        ipf2.setSize(this.mbc, this.mbd);
    }

    public int getWidth() {
        return this.mbc;
    }

    public int getHeight() {
        return this.mbd;
    }

    public void setWidth(int n) {
        this.mbc = n;
    }

    public void setHeight(int n) {
        this.mbd = n;
    }

    public void setSize(int n, int n2) {
        this.mbc = n;
        this.mbd = n2;
    }
}

