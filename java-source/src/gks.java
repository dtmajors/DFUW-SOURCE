/*
 * Decompiled with CFR.
 */
public class gks
extends gkv
implements dxu {
    public static final int jkt = 0;
    public static final int jku = 1;
    public static final int jkv = 2;
    public static final int jkw = 3;
    public static final int jkx = 4;
    public static final int jky = 5;
    private int aqs = -1;
    private int jkz = -1;
    private ldv[] imC = null;
    private String[] imD = null;
    private boolean[] imE = null;
    private float[] iUJ = null;

    gks() {
        super(31490);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ldv[] bFJ() {
        return this.imC;
    }

    public void k(ldv[] ldvArray) {
        this.imC = ldvArray;
    }

    public String[] bFK() {
        return this.imD;
    }

    public void o(String[] stringArray) {
        this.imD = stringArray;
    }

    public boolean[] bFL() {
        return this.imE;
    }

    public void i(boolean[] blArray) {
        this.imE = blArray;
    }

    public int bVI() {
        return this.jkz;
    }

    public void JN(int n) {
        this.jkz = n;
    }

    public final float[] bRz() {
        return this.iUJ;
    }

    public final void j(float[] fArray) {
        this.iUJ = fArray;
    }
}

