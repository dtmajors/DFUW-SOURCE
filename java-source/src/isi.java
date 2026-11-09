/*
 * Decompiled with CFR.
 */
public class isi
extends ist {
    public isi() {
    }

    public isi(String string) {
        super(string);
    }

    public isi(isf isf2, int n, int n2, loz loz2) {
        super(isf2, n, n2, loz2);
    }

    public isi(isf isf2, int n, int n2, String string) {
        super(isf2, n, n2, string);
    }

    @Override
    public void dpv() {
        this.djE().b("TextField_retrieveHtmlText", new Object[]{this.getId()});
    }

    @Override
    public void djy() {
        if (this.dqi() != isu.mxO && this.dqj()) {
            this.dke();
            this.djE().b("HtmlText_measure", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dqt(), this.dqn().ordinal(), this.dpz()});
        } else {
            this.eq(this.getWidth(), this.getHeight());
        }
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("HtmlText_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dql(), this.dqt(), this.dqn().ordinal(), this.dpz()});
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

