/*
 * Decompiled with CFR.
 */
public class irb
extends irl {
    private int mbc;
    private int mbd;

    public irb(int n, int n2) {
        this.mbc = n;
        this.mbd = n2;
    }

    @Override
    public void e(ipf ipf2) {
        super.e(ipf2);
        int n = ipf2.getWidth();
        int n2 = ipf2.getHeight();
        ipf2.setSize(Math.min(n, this.mbc), Math.min(n2, this.mbd));
    }
}

