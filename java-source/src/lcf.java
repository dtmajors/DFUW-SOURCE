/*
 * Decompiled with CFR.
 */
public class lcf
implements lbg {
    private static final int qvV = 8;
    private static final int qvW = 4;
    private static final int qvX = 32;
    private final int fb;
    private final int fc;
    private final byte[] qvY;
    private final int qvZ;

    private static int abG(int n) {
        return (n + 32 - 1) / 32 * 4;
    }

    public lcf(int n, int n2, byte[] byArray) {
        assert (n >= 0);
        assert (n2 >= 0);
        assert (byArray.length >= lcf.abG(n) * n2);
        this.fb = n;
        this.fc = n2;
        this.qvY = byArray;
        this.qvZ = lcf.abG(n);
    }

    public lcf(int n, int n2, boolean bl) {
        this(n, n2, lcf.j(n, n2, bl));
    }

    @Override
    public final int getWidth() {
        return this.fb;
    }

    @Override
    public final int getHeight() {
        return this.fc;
    }

    @Override
    public boolean fN(int n, int n2) {
        assert (n >= 0 && n < this.fb);
        assert (n2 >= 0 && n2 < this.fc);
        int n3 = (this.fc - 1 - n2) * this.qvZ + n / 8;
        int n4 = 7 - n % 8;
        return (this.qvY[n3] & 1 << n4) != 0;
    }

    public void i(int n, int n2, boolean bl) {
        int n3 = (this.fc - 1 - n2) * this.qvZ + n / 8;
        int n4 = 7 - n % 8;
        if (bl) {
            int n5 = n3;
            this.qvY[n5] = (byte)(this.qvY[n5] | 1 << n4);
        } else {
            int n6 = n3;
            this.qvY[n6] = (byte)(this.qvY[n6] & ~(1 << n4));
        }
    }

    public final int an(int n, boolean bl) {
        int n2;
        for (n2 = 0; n2 < this.fb && this.fN(n2, n) != bl; ++n2) {
        }
        return n2;
    }

    public final int ao(int n, boolean bl) {
        int n2;
        for (n2 = 0; n2 < this.fc && this.fN(n, n2) != bl; ++n2) {
        }
        return n2;
    }

    private static byte[] j(int n, int n2, boolean bl) {
        byte[] byArray = new byte[lcf.abG(n) * n2];
        byte by = (byte)(bl ? -1 : 0);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = by;
        }
        return byArray;
    }
}

