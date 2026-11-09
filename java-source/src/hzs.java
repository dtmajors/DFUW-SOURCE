/*
 * Decompiled with CFR.
 */
public class hzs
extends hzk {
    private hwo lzk;
    private int lzl;
    private int lzm;
    private int lzn;
    private int lzo;
    hzq lzb = null;

    public hzs() {
        super("YesNoWindow", "yesno.swf");
        this.a(hya.lmp, true);
        this.OQ(-1);
    }

    public void cBa() {
        super.cBa();
    }

    public void initialize() {
        super.initialize();
    }

    public void cleanUp() {
        super.cleanUp();
    }

    public void a(hzq hzq2) {
        this.lzb = hzq2;
    }

    public void a(String string, int n, int n2, int n3, int n4) {
        this.lzl = n;
        this.lzm = n2;
        this.lzn = n3;
        this.lzo = n4;
        this.setVisible(true);
        this.a("setMessageText", new Object[]{string});
    }

    @llk
    public void gotSize(double d2, double d3) {
        boolean bl;
        int n;
        joa joa2 = hzs.cxP().cxY();
        int n2 = (int)((double)(this.lzm + this.lzo / 2) - d3 / 2.0);
        if (n2 < 0) {
            n2 = 0;
        } else if ((double)n2 + d3 > (double)((int)joa2.H)) {
            n2 = (int)((double)joa2.H - d3);
        }
        if ((double)this.lzl < (double)((int)joa2.X) + (double)joa2.W / 2.0) {
            n = this.lzl + this.lzn;
            bl = false;
        } else {
            n = (int)((double)(this.lzl - this.lzn / 2) - d2 - 1.0);
            bl = true;
        }
        this.R(n, n2 - 1);
        float f = (float)d2 / this.cEJ();
        float f2 = (float)d3 / this.cDc();
        this.N(f, f2);
        this.a("onWindowPositioned", new Object[]{bl});
        if (this.lzb != null) {
            this.lzb.O((float)d2, (float)d3);
        }
        this.cqF();
    }

    public void e(int n, int n2, String string) {
        if (string != null && string.startsWith("acceptButton")) {
            this.choice(0);
        }
    }

    @llk
    public void choice(int n) {
        if (this.lzb != null) {
            this.lzb.oH(n == 0);
        }
    }

    public hwo cJz() {
        return this.lzk;
    }

    public void c(hwo hwo2) {
        this.lzk = hwo2;
    }
}

