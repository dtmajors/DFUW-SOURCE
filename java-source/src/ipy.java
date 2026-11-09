/*
 * Decompiled with CFR.
 */
public class ipy
extends ipx {
    public ipy() {
    }

    public ipy(iqz iqz2) {
        super(iqz2);
    }

    @Override
    public boolean dF(int n, int n2) {
        int n3;
        int n4;
        int n5 = Math.min(this.getWidth(), this.getHeight());
        int n6 = n5 / 2;
        int n7 = this.getWidth() / 2;
        int n8 = n - n7;
        int n9 = (int)Math.sqrt(n8 * n8 + (n4 = n2 - (n3 = this.getHeight() / 2)) * n4);
        return n9 <= n6;
    }
}

