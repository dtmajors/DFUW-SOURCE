/*
 * Decompiled with CFR.
 */
public abstract class jft
extends ipx {
    private boolean mwJ = false;
    private boolean mYe = false;
    private ipx mYf;
    private ipx lvG;
    private ipf mYg;
    private ipf mYh;
    private ipf mYi;
    private ipf mYj;
    private ipf mYk;
    private ipf mYl;
    private ipf mYm;
    private ipf mYn;

    public jft() {
        this.a(irl.dnr());
        this.mYf = ipx.d(new ipf[0]);
        this.W(this.mYf);
        this.lvG = ipx.d(new ipf[0]);
        this.W(this.lvG);
    }

    public ipf dBN() {
        return this.mYg;
    }

    public void aA(ipf ipf2) {
        if (ipf2 == this.mYg) {
            return;
        }
        if (this.mYg != null) {
            this.mYg.removeFromParent();
        }
        this.mYg = ipf2;
        if (this.mYg != null) {
            this.mYg.setVisible(false);
            this.mYf.W(this.mYg);
        }
        this.dBU();
    }

    public ipf dBO() {
        return this.mYh;
    }

    public void aB(ipf ipf2) {
        if (ipf2 == this.mYh) {
            return;
        }
        if (this.mYh != null) {
            this.mYh.removeFromParent();
        }
        this.mYh = ipf2;
        if (this.mYh != null) {
            this.mYh.setVisible(false);
            this.mYf.W(this.mYh);
        }
        this.dBU();
    }

    public ipf dBP() {
        return this.mYi;
    }

    public void aC(ipf ipf2) {
        if (ipf2 == this.mYi) {
            return;
        }
        if (this.mYi != null) {
            this.mYi.removeFromParent();
        }
        this.mYi = ipf2;
        if (this.mYi != null) {
            this.mYi.setVisible(false);
            this.mYf.W(this.mYi);
        }
        this.dBU();
    }

    public ipf dBQ() {
        return this.mYj;
    }

    public void aD(ipf ipf2) {
        if (ipf2 == this.mYj) {
            return;
        }
        if (this.mYj != null) {
            this.mYj.removeFromParent();
        }
        this.mYj = ipf2;
        if (this.mYj != null) {
            this.mYj.setVisible(false);
            this.lvG.W(this.mYj);
        }
        this.dBV();
    }

    public ipf dBR() {
        return this.mYk;
    }

    public void aE(ipf ipf2) {
        if (ipf2 == this.mYk) {
            return;
        }
        if (this.mYk != null) {
            this.mYk.removeFromParent();
        }
        this.mYk = ipf2;
        if (this.mYk != null) {
            this.mYk.setVisible(false);
            this.lvG.W(this.mYk);
        }
        this.dBV();
    }

    public ipf dBS() {
        return this.mYl;
    }

    public void aF(ipf ipf2) {
        if (ipf2 == this.mYl) {
            return;
        }
        if (this.mYl != null) {
            this.mYl.removeFromParent();
        }
        this.mYl = ipf2;
        if (this.mYl != null) {
            this.mYl.setVisible(false);
            this.lvG.W(this.mYl);
        }
        this.dBV();
    }

    public boolean dpn() {
        return this.mwJ;
    }

    public void sn(boolean bl) {
        if (bl == this.mwJ) {
            return;
        }
        this.mwJ = bl;
        this.dBV();
    }

    public boolean dBT() {
        return this.mYe;
    }

    public void th(boolean bl) {
        if (bl == this.mYe) {
            return;
        }
        this.mYe = bl;
        this.dBU();
    }

    public abstract boolean dzG();

    public void dBU() {
        ipf ipf2;
        ipf ipf3 = this.mYe ? this.mYh : (ipf2 = this.dzG() ? this.mYi : this.mYg);
        if (ipf2 == this.mYm) {
            return;
        }
        if (this.mYm != null) {
            this.mYm.setVisible(false);
        }
        this.mYm = ipf2;
        if (this.mYm != null) {
            this.mYm.setVisible(true);
        }
    }

    public void dBV() {
        ipf ipf2;
        ipf ipf3 = this.mwJ ? this.mYl : (ipf2 = this.dkb() ? this.mYk : this.mYj);
        if (ipf2 == this.mYn) {
            return;
        }
        if (this.mYn != null) {
            this.mYn.setVisible(false);
        }
        this.mYn = ipf2;
        if (this.mYn != null) {
            this.mYn.setVisible(true);
        }
    }

    @Override
    public void cND() {
        this.dBV();
    }

    @Override
    public boolean du(int n, int n2) {
        this.sn(true);
        this.rS(true);
        return true;
    }

    @Override
    public boolean dN(int n, int n2) {
        this.sn(false);
        this.rS(false);
        return true;
    }

    @Override
    public void a(ifg ifg2, hzk hzk2) {
        this.sn(false);
        this.rS(false);
    }

    @Override
    public void d(ifg ifg2) {
        this.sn(false);
        this.rS(false);
    }
}

