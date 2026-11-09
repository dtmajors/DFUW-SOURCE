/*
 * Decompiled with CFR.
 */
public class dqi {
    public static final int gOh = 1;
    public static final int gOi = 2;
    public static final int gOj = 3;
    private ldv GUID = null;
    private dxr MessageDelegator = null;
    private ldv gOk = null;
    private int[] duz = null;
    private boolean dJl = false;
    private boolean dJm = false;
    private boolean gOl = false;
    private boolean gOm = false;
    private ldv dtj = null;

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final dxr getMessageDelegator() {
        return this.MessageDelegator;
    }

    public final void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    public final ldv btf() {
        assert (this.gOk != null);
        return this.gOk;
    }

    public final void nC(ldv ldv2) {
        assert (ldv2 != null);
        assert (this.gOk == null) : this.gOk;
        this.gOk = ldv2;
    }

    public final int[] btg() {
        assert (this.gOk != null);
        return this.duz;
    }

    public final void M(int[] nArray) {
        this.duz = nArray;
    }

    public final boolean bth() {
        return this.dJl;
    }

    public final void iv(boolean bl) {
        this.dJl = bl;
    }

    public final boolean bti() {
        return this.dJm;
    }

    public final void iw(boolean bl) {
        this.dJm = bl;
    }

    public final boolean btj() {
        return this.gOl;
    }

    public final boolean Bm(int n) {
        for (int i = 0; i < this.duz.length; ++i) {
            if (this.duz[i] != n) continue;
            return true;
        }
        return false;
    }

    public final void ix(boolean bl) {
        this.gOl = bl;
    }

    public final boolean btk() {
        return this.gOm;
    }

    public final void iy(boolean bl) {
        this.gOm = bl;
    }

    public final void hZ(ldv ldv2) {
        this.dtj = ldv2;
    }

    public final void Bn(int n) {
        int[] nArray = new int[this.duz.length + 1];
        System.arraycopy(this.duz, 0, nArray, 0, this.duz.length);
        nArray[this.duz.length] = n;
        this.duz = nArray;
    }

    public final boolean ad(int n) {
        int n2 = this.duz.length;
        for (int i = 0; i < n2; ++i) {
            if (this.duz[i] != n) continue;
            return true;
        }
        return false;
    }

    public void e(int n, ej ej2) {
        assert (this.gOk != null);
        assert (this.dtj != null);
        assert (n == 1 || n == 2) : n;
        assert (this.ad(ej2.getType())) : ej2.getType();
        gzp gzp2 = (gzp)this.MessageDelegator.h(8195, this.GUID, this.gOk);
        gzp2.aXP = n;
        gzp2.bhp = ej2;
        gzp2.dtj = this.dtj;
        this.MessageDelegator.F(gzp2);
    }

    public final void Bo(int n) {
        assert (this.gOk != null);
        assert (this.dtj != null);
        assert (n > 0);
        gzu gzu2 = (gzu)this.MessageDelegator.h(8197, this.GUID, this.gOk);
        gzu2.jvJ = 1;
        gzu2.bnM = n;
        gzu2.dtj = this.dtj;
        this.MessageDelegator.F(gzu2);
    }

    public final void btl() {
        assert (this.gOk != null);
        assert (this.dtj != null);
        gzu gzu2 = (gzu)this.MessageDelegator.h(8197, this.GUID, this.gOk);
        gzu2.jvJ = 3;
        gzu2.dtj = this.dtj;
        this.MessageDelegator.F(gzu2);
    }

    public final void Bp(int n) {
        assert (this.gOk != null);
        assert (this.dtj != null);
        assert (n > 0);
        gzu gzu2 = (gzu)this.MessageDelegator.h(8197, this.GUID, this.gOk);
        gzu2.jvJ = 2;
        gzu2.bnM = n;
        gzu2.dtj = this.dtj;
        this.MessageDelegator.F(gzu2);
    }

    public final void i(ej[] ejArray) {
        assert (this.gOk != null);
        assert (this.dtj != null);
        assert (ejArray != null);
        gzq gzq2 = (gzq)this.MessageDelegator.h(8196, this.GUID, this.gOk);
        gzq2.DR = ejArray;
        gzq2.dtj = this.dtj;
        this.MessageDelegator.F(gzq2);
    }

    public final void btm() {
        assert (this.GUID != null);
        assert (this.MessageDelegator != null);
        this.MessageDelegator.oa(this.GUID);
    }

    public final void Bq(int n) {
        int[] nArray = new int[this.duz.length - 1];
        int n2 = 0;
        int n3 = this.duz.length;
        for (int i = 0; i < n3; ++i) {
            if (this.duz[i] == n) continue;
            nArray[n2] = this.duz[i];
            ++n2;
        }
        this.duz = nArray;
    }
}

