/*
 * Decompiled with CFR.
 */
public class ist
extends isw {
    private itd mxk;
    private boolean mxl;

    public ist(String string, isf isf2, int n, int n2) {
        this.a(isu.mxP);
        this.setText(string);
        this.a(isf2, n);
        this.ST(n2);
    }

    public ist(isf isf2, int n, int n2) {
        this.a(isu.mxP);
        this.a(isf2, n);
        this.ST(n2);
    }

    public ist(isf isf2, int n, int n2, loz loz2) {
        this.a(isu.mxP);
        this.o(loz2);
        this.a(isf2, n);
        this.ST(n2);
    }

    public ist(isf isf2, int n, int n2, String string) {
        this.a(isu.mxP);
        this.setText(string);
        this.a(isf2, n);
        this.ST(n2);
    }

    public ist(String string) {
        this.a(isu.mxP);
        this.setText(string);
    }

    public ist(lox lox2) {
        this.a(isu.mxP);
        this.g(lox2);
    }

    public ist(loz loz2) {
        this.a(isu.mxP);
        this.o(loz2);
    }

    public ist() {
        this.a(isu.mxP);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mxl = false;
    }

    @Override
    public String getText() {
        return this.mxk != null ? this.mxk.getText() : null;
    }

    public void e(itd itd2) {
        if (itd2 == this.mxk) {
            return;
        }
        this.mxk = itd2;
        this.dpC();
        this.dku();
    }

    @Override
    public void setText(String string) {
        if (string == null && this.mxk == null) {
            return;
        }
        this.e(new itd(this, string){
            final /* synthetic */ String lWu;
            final /* synthetic */ ist mxN;
            {
                this.mxN = ist2;
                this.lWu = string;
            }

            public String getText() {
                return this.lWu;
            }
        });
    }

    public void a(lox lox2, boolean bl) {
        this.e(new itd(this, lox2, bl){
            final /* synthetic */ lox lWv;
            final /* synthetic */ boolean mxo;
            final /* synthetic */ ist mxN;
            {
                this.mxN = ist2;
                this.lWv = lox2;
                this.mxo = bl;
            }

            public String getText() {
                return this.lWv != null ? (this.mxo ? this.lWv.bD(new Object[0]).exA().toUpperCase() : this.lWv.bD(new Object[0]).exA()) : null;
            }
        });
    }

    public void g(lox lox2) {
        this.a(lox2, false);
    }

    @Override
    public void o(loz loz2) {
        if (loz2 != null) {
            this.e(new itd(this, loz2){
                final /* synthetic */ loz mxp;
                final /* synthetic */ ist mxN;
                {
                    this.mxN = ist2;
                    this.mxp = loz2;
                }

                public String getText() {
                    return this.mxp != null ? this.mxp.exA() : null;
                }
            });
        } else {
            this.setText("");
        }
    }

    @Override
    public void b(loz loz2, int n) {
        this.o(loz2);
        this.Rk(n);
    }

    @Override
    public void K(String string, int n) {
        this.setText(string);
        this.Rk(n);
    }

    public static ist a(isf isf2, int n, int n2, loz loz2) {
        ist ist2 = new ist();
        ist2.a(isf2, n);
        ist2.Rk(n2);
        ist2.o(loz2);
        return ist2;
    }

    public static ist c(isf isf2, int n, int n2, String string) {
        ist ist2 = new ist();
        ist2.a(isf2, n);
        ist2.Rk(n2);
        ist2.setText(string);
        return ist2;
    }

    public static ist a(isf isf2, int n, int n2) {
        ist ist2 = new ist();
        ist2.a(isf2, n);
        ist2.Rk(n2);
        return ist2;
    }

    @Override
    public void djy() {
        if (this.dqi() != isu.mxO && this.dqj()) {
            this.dke();
            String string = this.getText();
            this.djE().b("Text_measure", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dqt(), this.dqn().ordinal(), string != null ? string : ""});
        } else {
            this.eq(this.getWidth(), this.getHeight());
        }
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.mxl) {
            this.mxl = false;
            this.dpw();
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mxl = false;
    }

    @Override
    public void dA(int n, int n2) {
        String string = this.getText();
        this.djE().b("Text_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dql(), this.dqt(), this.dqn().ordinal(), string != null ? string : ""});
    }

    @Override
    public void pI(String string) {
        this.f(new itd(this, string){
            final /* synthetic */ String lWu;
            final /* synthetic */ ist mxN;
            {
                this.mxN = ist2;
                this.lWu = string;
            }

            public String getText() {
                return this.lWu;
            }
        });
    }

    public void dpw() {
        this.djE().b("TextField_setText", new Object[]{this.getId(), this.getText()});
    }

    protected itd dpA() {
        return this.mxk;
    }

    protected void f(itd itd2) {
        this.mxk = itd2;
    }

    private void dpC() {
        if (this.mxl) {
            return;
        }
        this.mxl = true;
        this.dkg();
    }
}

