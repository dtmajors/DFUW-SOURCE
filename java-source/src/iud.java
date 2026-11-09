/*
 * Decompiled with CFR.
 */
public class iud
extends ipx
implements iua {
    public static final int mzg = 0xABABAB;
    private boolean lMW;
    private ire msb = ire.mul;
    private int mpr = 0;
    private int muu = 0;
    private ipj mzh;
    private ipb mcc;
    private iso myJ;
    private ipj mzi;
    private ipj mzj;

    public iud() {
        this.rg(false);
        this.W(this.dru());
        this.W(this.drv());
        this.W(this.cPo());
        this.W(this.drw());
        this.W(this.drx());
    }

    @Override
    public boolean getSelected() {
        return this.lMW;
    }

    @Override
    public void setSelected(boolean bl) {
        if (bl == this.lMW) {
            return;
        }
        this.lMW = bl;
        iul.b(this, this.lMW);
        this.cVa();
    }

    public ire dlY() {
        return this.msb;
    }

    public void b(ire ire2) {
        if (ire2 == this.msb) {
            return;
        }
        this.msb = ire2;
        if (ire2 == ire.mul) {
            this.myJ.a(ite.myF);
        } else {
            this.myJ.a(ite.myG);
        }
        this.pack();
    }

    public int diW() {
        return this.mpr;
    }

    public void RD(int n) {
        if (this.mpr < 0) {
            this.mpr = 0;
        }
        if (n == this.mpr) {
            return;
        }
        this.mpr = n;
        this.pack();
    }

    public int dnp() {
        return this.muu;
    }

    public void RE(int n) {
        if (this.muu < 0) {
            this.muu = 0;
        }
        if (n == this.muu) {
            return;
        }
        this.muu = n;
        this.pack();
    }

    public ipj drr() {
        return this.mzi;
    }

    public ipj drs() {
        return this.mzh;
    }

    public ipb drt() {
        return this.mcc;
    }

    public iso dqE() {
        return this.myJ;
    }

    public itb dgM() {
        return null;
    }

    public boolean dez() {
        isk isk2 = new isk(this, this.djE(), this.myJ, this.dgM()){
            final /* synthetic */ iud mzk;
            {
                this.mzk = iud2;
                super(ioa2, isw2, itb2);
            }

            public void rl(String string) {
                this.mzk.qB(string);
            }
        };
        isk2.addTo(this.djE().getMessageDelegator());
        return true;
    }

    @Override
    public void cPj() {
        int n = 0;
        int n2 = 0;
        if (this.msb == ire.mul) {
            n = Math.max(n, this.mzh.getWidth());
            n2 += this.mzh.getHeight();
            if (this.myJ.djL()) {
                n = Math.max(n, this.myJ.getWidth());
                n2 += this.myJ.getHeight() + this.muu;
            }
        } else {
            n += this.mzh.getWidth();
            n2 = Math.max(n2, this.mzh.getHeight());
            if (this.myJ.djL()) {
                n += this.myJ.getWidth() + this.muu;
                n2 = Math.max(n2, this.myJ.getHeight());
            }
        }
        this.setSize(n += this.mpr * 2, n2 += this.mpr * 2);
    }

    @Override
    public void cPk() {
        if (this.msb == ire.mul) {
            this.mzh.ek(this.getWidth() / 2 - this.mzh.getWidth() / 2, this.mpr);
            this.mcc.ek(this.mzh.getX() + this.mzh.getWidth() / 2 - this.mcc.getWidth() / 2, this.mzh.getY() + this.mzh.getHeight() / 2 - this.mcc.getHeight() / 2);
            if (this.myJ.djL()) {
                int n = (this.getWidth() - this.myJ.getWidth()) / 2;
                int n2 = this.mpr + (this.mzh.getHeight() + this.muu);
                this.myJ.ek(n, n2);
            }
        } else {
            this.mzh.ek(this.mpr, this.mpr);
            this.mcc.ek(this.mzh.getX() + this.mzh.getWidth() / 2 - this.mcc.getWidth() / 2, this.mzh.getY() + this.mzh.getHeight() / 2 - this.mcc.getHeight() / 2);
            if (this.myJ.djL()) {
                int n = this.mpr + (this.mzh.getWidth() + this.muu);
                int n3 = this.mzh.getY() + (this.mzh.getHeight() - this.myJ.getHeight()) / 2;
                this.myJ.ek(n, n3);
            }
        }
        if (this.mzi.djL()) {
            this.mzi.r(0, 0, this.getWidth(), this.getHeight());
            this.mzi.cqF();
        }
        if (this.mzj.djL()) {
            this.mzj.r(0, 0, this.getWidth(), this.getHeight());
            this.mzj.cqF();
        }
    }

    public void cVa() {
        this.mzi.setVisible(this.lMW);
    }

    public void qB(String string) {
    }

    @Override
    public void cND() {
        this.mzj.setVisible(this.dkb());
        if (this.djE() != null) {
            this.djE().b(this.dkb() ? hxv.llj : hxv.llh);
        }
    }

    private ipf dru() {
        this.mzh = new ipj(0x242424, 0x313131, 1);
        this.mzh.a(iqq.dmZ());
        this.mzh.setSize(70, 70);
        this.mzh.dlK().a((iqz)null);
        this.mzh.dlL().a((iqz)null);
        return this.mzh;
    }

    private ipf drv() {
        this.mcc = new ipb();
        this.mcc.a((iqz)null);
        this.mcc.setSize(64, 64);
        this.mcc.rc(false);
        return this.mcc;
    }

    private ipf cPo() {
        this.myJ = new iso(isf.mwM, 14, 0xABABAB);
        this.myJ.setSize(64, 24);
        this.myJ.sv(false);
        this.myJ.a(isu.mxO);
        this.myJ.a(isx.myo);
        this.myJ.a(ite.myF);
        return this.myJ;
    }

    private ipf drw() {
        this.mzi = new ipj(1783961, 12095317, 1);
        this.mzi.setVisible(false);
        this.mzi.hz(0.5f);
        return this.mzi;
    }

    private ipf drx() {
        this.mzj = new ipj(2972671, 12095317, 1);
        this.mzj.setVisible(false);
        this.mzj.hz(0.1f);
        return this.mzj;
    }
}

