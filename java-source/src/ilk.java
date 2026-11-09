/*
 * Decompiled with CFR.
 */
public class ilk
extends ijc {
    private int mid = 8;
    private boolean mie;
    private boolean mif = false;
    private ipb lLM = new ipb("use_prompt_background");
    private ipb mhW = null;
    private ist mhX = null;

    public ilk() {
        super(true, true, lyu.tKL);
        this.c(ipx.d(this.lLM), 0);
        this.mhW = new ipb("use_prompt_icon_gears");
        this.c(ipx.d(this.mhW), 1);
        this.mhX = new ist("F");
        this.mhX.b(isf.mwO);
        this.mhX.zY(25);
        this.mhX.Rk(12685656);
        this.c(ipx.d(this.mhX), 2);
    }

    public boolean dcV() {
        return this.mie;
    }

    public void qN(boolean bl) {
        this.mie = bl;
        this.mci.dLF();
    }

    public boolean dcW() {
        return this.mif;
    }

    public void qO(boolean bl) {
        this.mif = bl;
        this.mhX.setVisible(this.mif);
        this.mhW.setVisible(!this.mif);
        this.mci.dLF();
    }

    @Override
    public ije dae() {
        return new ili(this);
    }

    @Override
    public ikd daf() {
        return ikd.mfA;
    }

    @Override
    public iph cXA() {
        return null;
    }

    @Override
    public void daa() {
        this.lLM.hz(this.daE());
    }

    @Override
    public void cPk() {
        super.cPk();
        this.daG();
        switch (this.daD()) {
            case mcL: {
                this.lLM.setSize(64, 64);
                this.mhX.zY(22);
                break;
            }
            default: {
                this.lLM.setSize(72, 72);
                this.mhX.zY(25);
                break;
            }
            case mcN: {
                this.lLM.setSize(80, 80);
                this.mhX.zY(28);
            }
        }
        this.mhX.ek(31, 23);
    }

    @Override
    public void cZZ() {
        switch (this.daD()) {
            case mcL: {
                this.lLM.setSize(64, 64);
                this.mhX.zY(22);
                this.mid = 8;
                break;
            }
            default: {
                this.lLM.setSize(72, 72);
                this.mhX.zY(25);
                this.mid = 4;
                break;
            }
            case mcN: {
                this.lLM.setSize(80, 80);
                this.mhX.zY(28);
                this.mid = 0;
            }
        }
    }

    @Override
    public int daz() {
        return this.day() + this.lLM.getX();
    }

    @Override
    public int dar() {
        return this.daA() + this.lLM.getY();
    }

    @Override
    public void Re(int n) {
        this.Rd(n - this.mid);
    }

    @Override
    public void Rc(int n) {
        this.Rf(n - this.mid);
    }
}

