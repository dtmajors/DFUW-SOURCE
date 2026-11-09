/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.List;

public class hoq<ROW>
extends hop<ROW, String, hpa, hpe> {
    public final b kSV;
    public final List<c> kSW;
    public final hnk kSX;
    public final hrd<ROW, String> kSP;
    private boolean Initialized;

    public hoq(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, c[] cArray, int[] nArray, hrd<ROW, String> hrd2, hnk hnk2) {
        super(hnc2, string, lgg2, lhf2, b2.kKB, hrd2, hoq.a(hrd2, nArray));
        assert (cArray != null);
        assert (cArray.length >= 1);
        assert (cArray.length == nArray.length);
        for (int i = 0; i < cArray.length; ++i) {
            assert (cArray[i].kiK != null);
        }
        this.kSV = b2;
        this.kSW = Arrays.asList(cArray);
        this.kSX = hnk2;
        this.kSP = hrd2;
    }

    public final int ND(int n) {
        hnb hnb2 = this.kSW.get((int)n).kiK.jFE;
        int n2 = this.kSb.p(ldb.rep).getSize();
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            String string = (String)this.kSb.cT(i, n);
            lhf lhf2 = this.kLu.a(hnb2, string);
            n3 = Math.max(n3, lhf2.rmN);
        }
        return n3 += this.kLu.a((hnb)hnb2, (String)"W").rmN;
    }

    public final boolean isRowSelected(int n) {
        if (this.kSX == null) {
            return false;
        }
        return this.kSX.Nr(n);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    protected hpe cO(int n, int n2) {
        return new hpe(this.kLu, null, lgg.rlI, lhf.rnv, this.kSW.get((int)n2).kiK, "");
    }

    protected hpa NE(int n) {
        return new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, lhu.rnR);
    }

    protected a<ROW> cuk() {
        return new a(this);
    }

    private static hmw[] a(hrd<?, ?> hrd2, int[] nArray) {
        assert (nArray != null);
        assert (nArray.length >= 1);
        for (int i = 0; i < nArray.length; ++i) {
            assert (nArray[i] >= 0);
        }
        hmw[] hmwArray = new hmw[ldb.ListOfValue.size()];
        hmy hmy2 = new hmy(hrd2.p(ldb.reo), nArray[0]);
        hmy2.aF(nArray);
        hmwArray[ldb.reo.ordinal()] = hmy2;
        hmwArray[ldb.rep.ordinal()] = new hmx(hrd2.p(ldb.rep), 16);
        return hmwArray;
    }

    private void mU(boolean bl) {
        this.kSX.a(bl, this);
    }

    @Override
    protected /* synthetic */ hms NC(int n) {
        return this.NE(n);
    }

    @Override
    protected /* synthetic */ hoj.a cmN() {
        return this.cuk();
    }

    @Override
    protected /* synthetic */ hms cJ(int n, int n2) {
        return this.cO(n, n2);
    }
}

