/*
 * Decompiled with CFR.
 */
import java.util.List;

public class iso
extends isp {
    private itd mxk;
    private boolean mxl;
    private List<a> mxm;

    public iso(String string) {
        this.setText(string);
    }

    public iso(loz loz2) {
        this.o(loz2);
    }

    public iso(isf isf2, int n, int n2, loz loz2) {
        this.a(isf2, n);
        this.Rk(n2);
        this.o(loz2);
    }

    public iso(isf isf2, int n, int n2, String string) {
        this.a(isf2, n);
        this.Rk(n2);
        this.setText(string);
    }

    public iso(isf isf2, int n, int n2) {
        this.a(isf2, n);
        this.Rk(n2);
    }

    public iso() {
        this((String)null);
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
        this.mxm = null;
        this.dpC();
        this.dku();
    }

    @Override
    public void setText(String string) {
        this.e(new itd(this, string){
            final /* synthetic */ String lWu;
            final /* synthetic */ iso mxn;
            {
                this.mxn = iso2;
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
            final /* synthetic */ iso mxn;
            {
                this.mxn = iso2;
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
        this.e(new itd(this, loz2){
            final /* synthetic */ loz mxp;
            final /* synthetic */ iso mxn;
            {
                this.mxn = iso2;
                this.mxp = loz2;
            }

            public String getText() {
                return this.mxp != null ? this.mxp.exA() : null;
            }
        });
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

    public void d(String string, int n, int n2, boolean bl) {
        if (this.mxm == null) {
            this.mxm = lcn.emv();
        }
        this.mxm.add(new a(string, n, n2, bl));
        this.dkg();
    }

    @Override
    public void djy() {
        if (this.dqi() != isu.mxO && this.dqj()) {
            this.dke();
            String string = this.getText();
            this.djE().b("MultilineText_measure", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dqt(), this.dqn().ordinal(), string != null ? string : ""});
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
        this.dpB();
    }

    @Override
    public void djm() {
        super.djm();
        this.mxl = false;
    }

    @Override
    public void dA(int n, int n2) {
        String string = this.getText();
        this.djE().b("MultilineText_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dql(), this.dqt(), this.dqn().ordinal(), string != null ? string : "", this.dpE()});
        this.dpB();
    }

    @Override
    public void rn(String string) {
        this.f(new itd(this, string){
            final /* synthetic */ String lWu;
            final /* synthetic */ iso mxn;
            {
                this.mxn = iso2;
                this.lWu = string;
            }

            public String getText() {
                return this.lWu;
            }
        });
    }

    @Override
    public void pI(String string) {
        this.f(new itd(this, string){
            final /* synthetic */ String lWu;
            final /* synthetic */ iso mxn;
            {
                this.mxn = iso2;
                this.lWu = string;
            }

            public String getText() {
                return this.lWu;
            }
        });
    }

    public void c(String string, int n, int n2, boolean bl) {
        this.djE().b("MultilineText_appendText", new Object[]{this.getId(), string, n, n2, bl});
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

    protected void dpB() {
        if (this.mxm == null) {
            return;
        }
        for (a a2 : this.mxm) {
            this.c(a2.text, a2.mxq, a2.mxr, a2.mxs);
        }
        this.mxm = null;
    }

    private void dpC() {
        if (this.mxl) {
            return;
        }
        this.mxl = true;
        this.dkg();
    }
}

