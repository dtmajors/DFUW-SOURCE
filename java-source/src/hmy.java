/*
 * Decompiled with CFR.
 */
import java.util.Arrays;

public class hmy
extends hmw {
    public final int kMz;
    private int[] kMA;

    public hmy(hrt hrt2, int n) {
        super(hrt2);
        this.kMz = n;
        this.kMA = new int[0];
        this.nb(true);
    }

    public final void aF(int[] nArray) {
        assert (nArray.length == this.kMu.getSize());
        int[] nArray2 = hmy.aG(nArray);
        if (Arrays.equals(nArray2, this.kMA)) {
            return;
        }
        this.kMA = nArray2;
        this.ccd();
    }

    public final int No(int n) {
        assert (n >= 0 && n < this.kMA.length) : n;
        int n2 = this.kMA[n];
        int n3 = n == 0 ? 0 : this.kMA[n - 1];
        int n4 = n2 - n3;
        assert (n4 >= 0);
        return n4;
    }

    public final void cD(int n, int n2) {
        assert (n >= 0 && n < this.kMA.length) : n;
        assert (n2 >= 0);
        int n3 = n2 - this.No(n);
        if (n3 == 0) {
            return;
        }
        int n4 = n;
        while (n4 < this.kMA.length) {
            int n5 = n4++;
            this.kMA[n5] = this.kMA[n5] + n3;
        }
        this.ccd();
    }

    @Override
    public int crs() {
        return this.kMA.length;
    }

    @Override
    public int cru() {
        int n = this.kMA.length;
        if (n == 0) {
            return 0;
        }
        return this.kMA[n - 1];
    }

    @Override
    public int Nk(int n) {
        assert (n >= 0 && n < this.kMA.length) : n;
        int n2 = n == 0 ? 0 : this.kMA[n - 1];
        return this.kMA[n] - n2;
    }

    @Override
    public int Nl(int n) {
        int n2;
        assert (n >= 0 && n < this.crs());
        int n3 = n2 = n == 0 ? 0 : this.kMA[n - 1];
        assert (n2 >= 0 && n2 <= this.cru());
        return n2;
    }

    @Override
    public int Nm(int n) {
        assert (n >= 0 && n < this.cru());
        int n2 = 0;
        int n3 = 0;
        int n4 = this.kMA.length;
        while (n3 < n4) {
            if (this.kMA[n2] > n) {
                n4 = n2;
            } else {
                n3 = n2 + 1;
            }
            n2 = (n3 + n4) / 2;
        }
        assert (n2 >= 0 && n2 < this.crs());
        return n2;
    }

    @Override
    protected void cbg() {
        this.nb(false);
        super.cbg();
    }

    @Override
    protected void ccd() {
        int n = this.kMu.getSize();
        if (n == this.kMA.length) {
            return;
        }
        int[] nArray = new int[n];
        System.arraycopy(this.kMA, 0, nArray, 0, Math.min(this.kMA.length, nArray.length));
        int n2 = this.kMA.length == 0 ? 0 : this.kMA[this.kMA.length - 1];
        for (int i = this.kMA.length; i < nArray.length; ++i) {
            nArray[i] = n2 += this.kMz;
        }
        this.kMA = nArray;
        super.ccd();
    }

    private static int[] aG(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        int n = 0;
        for (int i = 0; i < nArray.length; ++i) {
            nArray2[i] = n += nArray[i];
        }
        return nArray2;
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}

