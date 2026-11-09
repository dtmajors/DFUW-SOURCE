/*
 * Decompiled with CFR.
 */
public class lcm
implements lbh {
    private final ldl qwf = new ldl();
    private final ldl[] qwg = new ldl[]{new ldl(), new ldl()};
    private double bBt;
    private double qwh;
    private int qwi;
    private int qwj;

    public final void b(double d2, double d3, int n) {
        this.bBt = d2;
        this.qwh = d3;
        this.qwi = n;
        this.qwf.enp();
        ldl ldl2 = this.qwg[this.qwj];
        this.qwj = this.qwj + 1 & 1;
        ldl2.ym(true);
    }

    @Override
    public double emb() {
        return this.bBt;
    }

    @Override
    public double emc() {
        return this.qwh;
    }

    @Override
    public int emd() {
        return this.qwi;
    }

    @Override
    public lbl<lbn> eme() {
        return this.qwf;
    }

    @Override
    public void b(lbn lbn2) {
        ldl ldl2 = this.qwg[this.qwj];
        if (ldl2.a(lbn2)) {
            return;
        }
        ldl2.a(true, lbn2);
    }
}

