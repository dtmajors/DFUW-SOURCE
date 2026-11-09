/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class ikj
extends ipx {
    private static final int mfY = 0;
    private static final int mfZ = 2;
    private hvz mga;
    private ijf mbt = ijf.mcM;
    private int mgb = 26;
    private ipb mcc;
    private ipf mgc;
    private ist mgd;
    private ist lUP;
    private double mge = 0.0;

    public ikj(hvz hvz2, ijf ijf2, boolean bl) {
        this(hwt.a(hvz2), ijf2, bl && hvz2.DV() > 0.0);
        this.mga = hvz2;
    }

    public ikj(String string, ijf ijf2, boolean bl) {
        this.mbt = ijf2;
        this.mcc = new ipb("/dfdata/" + string);
        this.W(this.mcc);
        this.mgc = new ipb("/dfdata/texture/gui/j2f/stats/modifier_counter_bg.png");
        this.mgc.hz(0.75f);
        this.mgc.setVisible(false);
        this.W(this.mgc);
        this.mgd = new ist(isf.mwN, 11, 0xE6E6E6, "0");
        this.mgd.setVisible(false);
        this.W(this.mgd);
        this.lUP = new ist(isf.mwM, 9, 0xE0E0E0, "226");
        this.lUP.setVisible(bl);
        this.W(this.lUP);
        this.cUp();
    }

    public void a(ijf ijf2) {
        if (ijf2 == this.mbt) {
            return;
        }
        this.mbt = ijf2;
        this.cUp();
        this.pack();
    }

    public void kI(float f) {
        if (this.mcc != null) {
            this.mcc.hz(f);
        }
    }

    public void setProgress(float f) {
        if (this.djE() != null && this.mga != null) {
            double d2;
            double d3 = this.mga.DV();
            if (d3 > 0.0 && (d2 = this.djE().getMessageDelegator().arc().rgz) - this.mge >= 1.0) {
                this.dcp();
                this.dcq();
                this.j(d3, d2);
                this.mge = d2;
            }
        } else if (this.mga == null) {
            this.lUP.setText("123");
        }
    }

    public void qG(boolean bl) {
        this.lUP.setVisible(bl);
    }

    @Override
    public void cPj() {
        int n = 0 + this.mgb + 0;
        int n2 = 0 + this.mgb + 2 + this.lUP.bll() + 4 + 0;
        this.setSize(n, n2);
    }

    @Override
    public void cPk() {
        this.mcc.r(this.getWidth() / 2 - this.mgb / 2, 0, this.mgb, this.mgb);
        this.mgc.r(this.getWidth() / 2 - this.mgd.getWidth() / 2 - 2, 0 + this.mgb / 2 - this.mgd.getHeight() / 2, this.mgd.getWidth() + 4, this.mgd.getHeight());
        this.mgd.ek(this.getWidth() / 2 - this.mgd.getWidth() / 2, 0 + this.mgb / 2 - this.mgd.getHeight() / 2);
        this.lUP.ek(this.getWidth() / 2 - this.lUP.getWidth() / 2, this.mcc.getY() + this.mgb + 2);
    }

    private void dcp() {
        float f = iie.cZe().cZf().lZl;
        this.mgc.setVisible(f > 0.0f);
        this.mgd.setVisible(f > 0.0f);
        this.mgd.setText(Math.round(f) + "");
    }

    private void dcq() {
        if (this.mga == null) {
            return;
        }
        if (this.mga.zg() != cxd.fKW && this.mga.zg() != cxd.fHP && this.mga.zg() != cxd.fHS) {
            return;
        }
        int n = this.mga.cAN();
        if (n == 0) {
            return;
        }
        this.mgc.setVisible(n > 0);
        this.mgd.setVisible(n > 0);
        this.mgd.setText(Math.round(n) + "");
    }

    private void j(double d2, double d3) {
        String string = (int)Math.max(0L, Math.round(d2 - d3)) + "";
        this.lUP.setText(string);
    }

    private void cUp() {
        switch (this.mbt) {
            case mcN: {
                this.mgb = 28;
                this.lUP.zY(10);
                break;
            }
            case mcM: {
                this.mgb = 26;
                this.lUP.zY(9);
                break;
            }
            case mcL: {
                this.mgb = 22;
                this.lUP.zY(8);
            }
        }
    }
}

