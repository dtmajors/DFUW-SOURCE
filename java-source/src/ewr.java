/*
 * Decompiled with CFR.
 */
public class ewr
extends ewt {
    private static int[] iEv = new int[0];
    public String akV;
    private int ff = hc.aaP.ordinal();
    private int[] iEw = iEv;
    public boolean alg;
    public String iEx;

    public ewr() {
        super(29698);
    }

    public final void a(hc hc2) {
        this.ff = hc2.ordinal();
    }

    public final hc hf() {
        return hc.aaW[this.ff];
    }

    public final void a(mhs[] mhsArray) {
        if (mhsArray == null) {
            this.iEw = iEv;
        } else {
            this.iEw = new int[mhsArray.length];
            for (int i = 0; i < mhsArray.length; ++i) {
                this.iEw[i] = mhsArray[i].ordinal();
            }
        }
    }

    public final mhs[] bNa() {
        mhs[] mhsArray = new mhs[this.iEw.length];
        for (int i = 0; i < this.iEw.length; ++i) {
            mhsArray[i] = mhs.VALUES[this.iEw[i]];
        }
        return mhsArray;
    }
}

