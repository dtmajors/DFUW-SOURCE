/*
 * Decompiled with CFR.
 */
public abstract class ikr
extends ijc {
    private iks mgK;

    public ikr(lox lox2, String string) {
        super(true, true, lox2);
        this.mgK = new iks(string);
        this.W(this.mgK);
        this.mgK.dan().setText("50/100");
        this.mgK.dcx().setProgress(0.5f);
    }

    @Override
    public iph cXA() {
        return null;
    }

    @Override
    public void cZZ() {
        super.cZZ();
        this.mgK.i(this.daD());
    }

    @Override
    public void daa() {
        this.mgK.hz(this.daE());
    }
}

