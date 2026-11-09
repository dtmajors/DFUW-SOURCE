/*
 * Decompiled with CFR.
 */
public abstract class hxo {
    protected final hxh lfj;
    private int lkI = -1;
    private int ljO;
    private float X;
    private float Y;
    private float ljP;
    private float ljQ;
    private float doR;
    private float ljR;
    private double eKm;
    private double oV;
    private double lkJ;

    protected hxo(hxh hxh2, ldz ldz2, float f2, float f3) {
        this.lfj = hxh2;
        this.X = hxh2.getX();
        this.Y = hxh2.getY();
        this.ljP = hxh2.cCZ();
        this.ljQ = hxh2.cDa();
        this.doR = hxh2.getAlpha();
        this.ljR = hxh2.cDd();
        this.eKm = f2;
        this.lkJ = f3;
        this.oV = ldz2.rgz - this.lkJ;
    }

    public int aB(ldz ldz2) {
        this.lkJ = ldz2.rgz - this.oV;
        if (this.lkJ >= this.eKm) {
            return 0;
        }
        ++this.lkI;
        float f2 = (float)(this.lkJ / this.eKm);
        this.ljO = 0;
        this.G(this.lkI, f2);
        return this.ljO;
    }

    protected abstract void G(int var1, float var2);

    public abstract boolean b(hxi var1);

    public final boolean isDone() {
        return this.lkJ >= this.eKm;
    }

    public final float cDy() {
        if (this.lkJ >= this.eKm) {
            return 0.0f;
        }
        return (float)(this.eKm - this.lkJ);
    }

    protected final void kl(float f2) {
        this.X = f2;
        this.a(hxi.lkg);
    }

    protected final void km(float f2) {
        this.Y = f2;
        this.a(hxi.lkh);
    }

    protected final void kj(float f2) {
        this.ljP = f2;
        this.a(hxi.lke);
    }

    protected final void kk(float f2) {
        this.ljQ = f2;
        this.a(hxi.lkf);
    }

    protected final void hz(float f2) {
        this.doR = f2;
        this.a(hxi.lkj);
    }

    protected final void kn(float f2) {
        this.ljR = f2;
        this.a(hxi.lki);
    }

    private final void a(hxi hxi2) {
        this.ljO |= hxi2.cDs();
    }

    public final float getX() {
        return this.X;
    }

    public final float getY() {
        return this.Y;
    }

    public final float cCZ() {
        return this.ljP;
    }

    public final float cDa() {
        return this.ljQ;
    }

    public final float getAlpha() {
        return this.doR;
    }

    public final float cDd() {
        return this.ljR;
    }
}

