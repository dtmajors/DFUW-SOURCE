/*
 * Decompiled with CFR.
 */
public class jcn {
    private int ID = -1;
    private loz mRs = null;
    private boolean aDg = false;
    private int mRx = 0;
    private int mRy = 0;
    private boolean mRz = false;
    private boolean mRA = false;
    private jcl bcX = null;
    jcm mRB = null;
    public final jll<jcn> mRa = new jll();
    public final jll<jcn> mRC = new jll();

    public int getID() {
        return this.ID;
    }

    public loz yp() {
        return this.mRs;
    }

    public boolean isComplete() {
        return this.aDg;
    }

    public int ze() {
        return this.mRx;
    }

    public int dxN() {
        return this.mRy;
    }

    public boolean dxO() {
        return this.mRz;
    }

    public boolean dxP() {
        return this.mRA;
    }

    public boolean dxQ() {
        return this.bcX != null;
    }

    public jcl dxR() {
        return this.bcX;
    }

    public jcm dxS() {
        return this.mRB;
    }

    public jcn(int n, loz loz2) {
        this(n, loz2, 0);
    }

    public jcn(int n, loz loz2, int n2) {
        this(n, loz2, n2, false);
    }

    public jcn(int n, loz loz2, int n2, boolean bl) {
        this(n, loz2, n2, bl, false, false, null);
    }

    public jcn(int n, loz loz2, boolean bl, boolean bl2) {
        this(n, loz2, 0, false, bl, bl2, null);
    }

    public jcn(int n, loz loz2, boolean bl, boolean bl2, jcl jcl2) {
        this(n, loz2, 0, false, bl, bl2, jcl2);
    }

    public jcn(int n, loz loz2, int n2, boolean bl, boolean bl2, boolean bl3, jcl jcl2) {
        this.ID = n;
        this.mRs = loz2;
        this.mRy = n2;
        this.aDg = bl;
        this.mRz = bl2;
        this.mRA = bl3;
        this.bcX = jcl2;
    }

    public void aC(boolean bl) {
        if (this.aDg == bl) {
            return;
        }
        this.aDg = bl;
        this.mRa.V(this);
        jcc.dwT().mQA.V(this);
    }

    public void JR(int n) {
        if (this.mRx > this.mRy) {
            this.mRx = this.mRy;
        }
        if (this.mRx == n) {
            return;
        }
        this.mRx = n;
        this.mRC.V(this);
        jcc.dwT().mQB.V(this);
    }
}

