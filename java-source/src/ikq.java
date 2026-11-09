/*
 * Decompiled with CFR.
 */
public abstract class ikq
extends ijd {
    private int mgI = 0;
    private int mgJ = 0;
    private iks mgK;

    public ikq(String string, String string2) {
        super(string);
        this.mgK = new iks(string2);
        this.W(this.mgK);
    }

    @Override
    public boolean cZX() {
        return false;
    }

    public iks dcw() {
        return this.mgK;
    }

    @Override
    public void cZZ() {
        this.mgK.i(this.daD());
    }

    @Override
    public void daa() {
        this.mgK.hz(this.daE());
    }

    protected void Y(float f, float f2) {
        int n = Math.round(f);
        int n2 = Math.round(f2);
        if (n == this.mgI && n2 == this.mgJ) {
            return;
        }
        this.mgI = n;
        this.mgJ = n2;
        this.dcw().dan().setText(this.mgI + "/" + this.mgJ);
        this.dcw().dcx().setProgress(f / f2);
    }
}

