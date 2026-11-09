/*
 * Decompiled with CFR.
 */
public class gkb
extends gjl
implements dxu {
    private int aqs = -1;
    private int[] jjz = null;
    private float[] jjE = null;
    private cxn[] jjD = null;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public cxn[] bVw() {
        if (this.jjD != null) {
            return this.jjD;
        }
        if (this.jjz == null) {
            return new cxn[0];
        }
        this.jjD = new cxn[this.jjz.length];
        for (int i = 0; i < this.jjz.length; ++i) {
            this.jjD[i] = cxn.values()[this.jjz[i]];
        }
        return this.jjD;
    }

    public float[] bVA() {
        return this.jjE;
    }

    public void a(cxn[] cxnArray, float[] fArray) {
        int n;
        if (cxnArray == null || fArray == null || cxnArray.length != fArray.length) {
            this.jjD = null;
            this.jjz = null;
            this.jjE = null;
            return;
        }
        this.jjD = cxnArray;
        this.jjE = fArray;
        boolean bl = false;
        for (n = 0; n < this.jjD.length; ++n) {
            if (this.jjD[n] != null) continue;
            bl = true;
        }
        if (bl) {
            n = 0;
            for (int i = 0; i < this.jjD.length; ++i) {
                if (this.jjD[i] == null) continue;
                ++n;
            }
            cxn[] cxnArray2 = new cxn[n];
            float[] fArray2 = new float[n];
            n = 0;
            for (int i = 0; i < this.jjD.length; ++i) {
                if (this.jjD[i] == null) continue;
                cxnArray2[n] = this.jjD[i];
                fArray2[n] = this.jjE[i];
                ++n;
            }
            this.jjD = cxnArray2;
            this.jjE = fArray2;
        }
        this.jjz = new int[this.jjD.length];
        for (n = 0; n < this.jjD.length; ++n) {
            this.jjz[n] = this.jjD[n].ordinal();
        }
    }

    gkb() {
        super(4634);
    }
}

