/*
 * Decompiled with CFR.
 */
public class isn
extends iso {
    public isn() {
    }

    public isn(String string) {
        super(string);
    }

    public isn(isf isf2, int n, int n2, loz loz2) {
        this.a(isf2, n);
        this.Rk(n2);
        this.o(loz2);
    }

    @Override
    public void djy() {
        if (this.dqi() != isu.mxO && this.dqj()) {
            this.dke();
            this.djE().b("MultilineHtmlText_measure", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dqt(), this.dqn().ordinal(), this.dpz()});
        } else {
            this.eq(this.getWidth(), this.getHeight());
        }
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("MultilineHtmlText_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dql(), this.dqt(), this.dqn().ordinal(), this.dpz(), this.dpE()});
        this.dpB();
    }

    @Override
    public void c(String string, int n, int n2, boolean bl) {
        this.djE().b("MultilineHtmlText_appendText", new Object[]{this.getId(), string, n, n2, bl});
    }

    @Override
    public void dpw() {
        this.djE().b("TextField_setHtmlText", new Object[]{this.getId(), this.dpz()});
    }

    @Override
    public void dpx() {
        this.djE().b("TextField_setHtmlTextStyle", new Object[]{this.getId(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dql()});
    }

    @Override
    public void dpy() {
        this.dpx();
    }

    private String dpz() {
        String string = iss.rr(this.getText());
        return string != null && !string.isEmpty() ? isg.b(this.dqk(), this.bll(), this.dql(), string) : "";
    }
}

