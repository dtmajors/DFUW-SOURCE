/*
 * Decompiled with CFR.
 */
public class irm
extends iqz {
    private int mbc;
    private int mbd;
    private ire msb;

    public irm(int n, int n2, ire ire2) {
        this.mbc = n;
        this.mbd = n2;
        this.msb = ire2;
    }

    public irm(int n, int n2) {
        this(n, n2, null);
    }

    @Override
    public void e(ipf ipf2) {
        if (this.msb == ire.muk) {
            ipf2.setWidth(this.mbc);
        } else if (this.msb == ire.mul) {
            ipf2.setHeight(this.mbd);
        } else {
            ipf2.setSize(this.mbc, this.mbd);
        }
    }

    @Override
    public void i(ipf ipf2) {
        if (this.msb == ire.muk) {
            ipf2.setWidth(this.mbc);
        } else if (this.msb == ire.mul) {
            ipf2.setHeight(this.mbd);
        } else {
            ipf2.setSize(this.mbc, this.mbd);
        }
    }

    public int getWidth() {
        return this.mbc;
    }

    public int getHeight() {
        return this.mbd;
    }

    public ire dlY() {
        return this.msb;
    }
}

