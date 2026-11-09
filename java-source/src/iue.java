/*
 * Decompiled with CFR.
 */
public class iue
extends ipx {
    private ipk mzl;
    private float mms = 0.0f;

    public iue(int n, int n2, int n3) {
        this.a(new iqu(n, n2));
        this.W(ipx.l(this.SZ(n3)));
    }

    public void setSize(int n) {
        ((iqu)this.djQ()).setWidth(n);
        this.pack();
        this.dry();
    }

    public void setProgress(float f2) {
        this.mms = lew.E(0.0f, f2, 1.0f);
        this.dry();
    }

    public void setColor(int n) {
        this.mzl.setColor(n);
    }

    private ipf SZ(int n) {
        this.mzl = new ipk(n);
        return this.mzl;
    }

    private void dry() {
        iqu iqu2 = (iqu)this.djQ();
        this.mzl.a(new iqu((int)(this.mms * (float)iqu2.getWidth()), iqu2.getHeight()));
    }
}

