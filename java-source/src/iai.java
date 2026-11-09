/*
 * Decompiled with CFR.
 */
public abstract class iai
extends hzw {
    public final int dOX;
    private hyd lzK;
    private boolean lBi;
    private int lBj;
    private int lBk;
    private boolean lBl;

    public iai(String string, String string2, int n, int n2, int n3, int n4) {
        super(string, string2, n, n2, n3, n4);
        this.dOX = iai.cxP().lee.cJO();
        this.lzK = hyd.lni;
        this.lBl = false;
    }

    public iai(String string, String string2, int n, int n2, int n3, int n4, hyd hyd2) {
        this(string, string2, n, n2, n3, n4);
        this.lzK = hyd2;
    }

    public hyd cKf() {
        return this.lzK;
    }

    public void a(hyd hyd2) {
        this.lzK = hyd2;
    }

    public void da(int n, int n2) {
        this.a("setOrientation", new Object[]{this.lzK.ordinal()});
    }

    public void db(int n, int n2) {
        this.lBi = true;
        this.lBj = n;
        this.lBk = n2;
    }

    public boolean cFm() {
        return this.lBl;
    }

    @Override
    protected void cBa() {
        super.cBa();
        if (this.lBi) {
            this.da(this.lBj, this.lBk);
        }
    }

    protected abstract void cJU();

    @llk
    protected void onTooltipWindowResized(int n, int n2) {
        boolean bl;
        int n3;
        int n4;
        int n5;
        joa joa2 = iai.cxP().cxY();
        if (this.lzK == hyd.lni) {
            n5 = this.lzl - n / 2;
            if (n5 < 0) {
                n5 = 0;
                n4 = this.lzl;
            } else if (n5 + n > (int)joa2.W) {
                n5 = (int)joa2.W - n;
                n4 = this.lzl - n5;
            } else {
                n4 = n / 2;
            }
            if (this.lzm < (int)joa2.Y + (int)joa2.H / 2) {
                n3 = this.lzm + this.lzo / 2;
                bl = true;
            } else {
                n3 = this.lzm - this.lzo / 2 - n2;
                bl = false;
            }
        } else {
            n3 = this.lzm - n2 / 2;
            if (n3 < 0) {
                n3 = 0;
                n4 = this.lzm;
            } else if (n3 + n2 > (int)joa2.H) {
                n3 = (int)joa2.H - n2;
                n4 = this.lzm - n3;
            } else {
                n4 = n2 / 2;
            }
            if (this.lzl < (int)joa2.X + (int)joa2.W / 2) {
                n5 = this.lzl + this.lzn / 2;
                bl = true;
            } else {
                n5 = this.lzl - this.lzn / 2 - n;
                bl = false;
            }
        }
        this.R(n5, n3);
        this.lBl = true;
        float f = (float)n / this.cEJ();
        float f2 = (float)n2 / this.cDc();
        this.N(f, f2);
        this.a("onTooltipWindowPositioned", new Object[]{bl, n4});
    }

    @llk
    private void _orientationSet() {
        this.cJU();
    }
}

