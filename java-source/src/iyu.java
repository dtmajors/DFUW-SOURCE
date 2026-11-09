/*
 * Decompiled with CFR.
 */
public abstract class iyu<T extends Enum> {
    private T[] mCy = null;
    private lox[] mCz = null;
    private int mCA = -1;
    private boolean mCB = false;
    private T mCC = null;
    private a mCD = null;
    private iyt mCE = null;

    public T[] dtA() {
        return this.mCy;
    }

    public T dtB() {
        return this.mCC;
    }

    public lox[] getDisplayNames() {
        return this.mCz;
    }

    public T dtC() {
        return this.mCy[this.mCA];
    }

    public boolean dtD() {
        return this.mCB;
    }

    public lox wp() {
        return this.mCz[this.mCA];
    }

    public iyu(iyt iyt2, T[] TArray, lox[] loxArray, int n, boolean bl) {
        this(iyt2, (Enum[])TArray, loxArray, n, bl, null);
    }

    public iyu(iyt iyt2, T[] TArray, lox[] loxArray, int n, boolean bl, T t) {
        this.mCE = iyt2;
        this.mCy = TArray;
        this.mCz = loxArray;
        this.mCA = n;
        this.mCB = bl;
        this.mCC = t;
    }

    protected abstract void b(T var1);

    protected abstract void sL(boolean var1);

    private void b(T t, boolean bl) {
        if (this.mCy[this.mCA] != t) {
            int n = -1;
            for (int i = 0; i < this.mCy.length; ++i) {
                if (this.mCy[i] != t) continue;
                n = i;
                break;
            }
            this.mCA = n;
            this.b(this.mCy[this.mCA]);
            this.mCE.dtq();
        }
        if (this.mCB != bl) {
            this.mCB = bl;
            this.sL(this.mCB);
            this.mCE.dtr();
        }
    }

    private void d(dxr dxr2) {
        if (this.mCD != null) {
            dxr2.hd(this.mCD.getGUID());
            this.mCD = null;
        }
    }

    public izr<T> a(ioa ioa2, joa joa2) {
        if (this.mCD == null) {
            this.mCD = new a(this, ioa2, joa2);
            this.mCD.setGUID(ioa2.getMessageDelegator().bzv());
            ioa2.getMessageDelegator().a((amf)((Object)this.mCD));
        }
        return this.mCD;
    }

    static /* synthetic */ Enum[] a(iyu iyu2) {
        return iyu2.mCy;
    }

    static /* synthetic */ int b(iyu iyu2) {
        return iyu2.mCA;
    }

    static /* synthetic */ boolean c(iyu iyu2) {
        return iyu2.mCB;
    }

    static /* synthetic */ void a(iyu iyu2, Enum enum_, boolean bl) {
        iyu2.b(enum_, bl);
    }

    static /* synthetic */ void a(iyu iyu2, dxr dxr2) {
        iyu2.d(dxr2);
    }
}

