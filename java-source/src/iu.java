/*
 * Decompiled with CFR.
 */
public class iu {
    public static final int ahn = 1;
    public static final int aho = 2;
    public static final int ahp = 4;
    public static final int ahq = 8;
    public static final int ahr = 16;
    public static final int ahs = 32;
    public static final int aht = 64;
    public static final int afD = 128;
    public static final int ahu = 256;
    public static final int ahv = 512;
    public final ldv ahw;
    public final ldv GUID;
    public final float ahx;
    public final int ahy;
    private double ahz;

    public iu(ldv ldv2, ldv ldv3, int n, float f2) {
        this.ahw = ldv2;
        this.GUID = ldv3;
        this.ahy = n;
        this.ahx = f2;
        this.ahz = 0.0;
    }

    public boolean s(ldz ldz2) {
        if (ldz2.rgz >= this.ahz + (double)this.ahx) {
            this.ahz = ldz2.rgz;
            return true;
        }
        return false;
    }
}

