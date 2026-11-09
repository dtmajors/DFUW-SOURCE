/*
 * Decompiled with CFR.
 */
public class izh
extends iug {
    private ipx mDd;
    private iqa mDe;
    private iqa mDf;
    private ipf mDg;
    private ipf lUw;
    private boolean mDh = false;

    public boolean dtQ() {
        return this.mDh;
    }

    public void sO(boolean bl) {
        if (bl == this.mDh) {
            return;
        }
        this.mDh = bl;
        this.dtT();
    }

    @Override
    public void eQ(int n, int n2) {
        super.eQ(n, n2);
        this.dtT();
    }

    public String cXf() {
        return null;
    }

    public iph dtR() {
        this.dtU();
        return this.mDd;
    }

    public void W(String string, String string2) {
        if (this.mDd != null) {
            return;
        }
        this.dtU();
        String string3 = this.cXf();
        if (!lhn.isEmpty(string3)) {
            this.mDg = new ipb(string3);
            this.mDg.setVisible(this.mDh);
            this.mDd.W(this.mDg);
        }
        this.mDe = new iqa(string);
        this.mDe.setVisible(false);
        this.mDd.W(this.mDe);
        this.mDd.W(ipx.c(new ipf[0]));
        this.mDf = new iqa(string2);
        this.mDf.setVisible(false);
        this.mDd.W(this.mDf);
        if (!lhn.isEmpty(string3)) {
            this.lUw = new ipb(string3);
            this.lUw.setVisible(this.mDh);
            this.mDd.W(this.lUw);
        }
    }

    public void dtS() {
        this.W("/dfdata/texture/gui/j2f/common/gradients/list_gradient_top.png", "/dfdata/texture/gui/j2f/common/gradients/list_gradient_bottom.png");
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        if (this.mDe != null) {
            this.mDe.hz(f2);
        }
        if (this.mDf != null) {
            this.mDf.hz(f2);
        }
    }

    private void dtT() {
        if (this.mDe != null) {
            boolean bl = this.drk();
            if (bl) {
                int n = this.dnx();
                int n2 = this.dsb();
                if (n > 0) {
                    this.mDe.setVisible(true);
                } else {
                    this.mDe.setVisible(false);
                }
                if (n < n2) {
                    this.mDf.setVisible(true);
                } else {
                    this.mDf.setVisible(false);
                }
            } else {
                this.mDe.setVisible(false);
                this.mDf.setVisible(false);
            }
            if (!this.mDh) {
                if (this.mDg != null) {
                    this.mDg.setVisible(this.mDe.djL());
                }
                if (this.lUw != null) {
                    this.lUw.setVisible(this.mDf.djL());
                }
            }
        }
    }

    private void dtU() {
        if (this.mDd != null) {
            return;
        }
        this.mDd = ipx.j(new ipf[0]);
        this.mDd.a(ipn.msf);
        this.drM().W(this.mDd);
    }
}

