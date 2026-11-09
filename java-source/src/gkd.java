/*
 * Decompiled with CFR.
 */
public class gkd
extends gjl
implements dxu {
    private int aqs = -1;
    private int[] jjz = null;
    private float[] jjF = null;
    private float[] jjG = null;
    private int[] jjH = null;
    private int[] jjI = null;
    private String aNb = null;
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

    public float[] bVC() {
        return this.jjF;
    }

    public float[] bVD() {
        return this.jjG;
    }

    public int[] bVE() {
        return this.jjH;
    }

    public int[] bVF() {
        return this.jjI;
    }

    public void a(cxn[] cxnArray, float[] fArray, float[] fArray2, int[] nArray, int[] nArray2) {
        int n;
        if (cxnArray == null || fArray == null || fArray2 == null || nArray == null || nArray2 == null || cxnArray.length != fArray.length || fArray.length != fArray2.length || fArray2.length != nArray.length || nArray.length != nArray2.length) {
            this.jjD = null;
            this.jjz = null;
            this.jjF = null;
            this.jjG = null;
            this.jjH = null;
            this.jjI = null;
            return;
        }
        this.jjD = cxnArray;
        this.jjF = fArray;
        this.jjG = fArray2;
        this.jjH = nArray;
        this.jjI = nArray2;
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
            float[] fArray3 = new float[n];
            float[] fArray4 = new float[n];
            int[] nArray3 = new int[n];
            int[] nArray4 = new int[n];
            n = 0;
            for (int i = 0; i < this.jjD.length; ++i) {
                if (this.jjD[i] == null) continue;
                cxnArray2[n] = this.jjD[i];
                fArray3[n] = this.jjF[i];
                fArray4[n] = this.jjG[i];
                nArray3[n] = this.jjH[i];
                nArray4[n] = this.jjI[i];
                ++n;
            }
            this.jjD = cxnArray2;
            this.jjF = fArray3;
            this.jjG = fArray4;
            this.jjH = nArray3;
            this.jjI = nArray4;
        }
        this.jjz = new int[this.jjD.length];
        for (n = 0; n < this.jjD.length; ++n) {
            this.jjz[n] = this.jjD[n].ordinal();
        }
    }

    public String getErrorString() {
        return this.aNb;
    }

    public void kY(String string) {
        this.aNb = string;
    }

    gkd() {
        super(4636);
    }
}

