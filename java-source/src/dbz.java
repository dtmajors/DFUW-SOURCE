/*
 * Decompiled with CFR.
 */
public class dbz
extends dbw {
    private static final float gcF = 1.0f;
    private int fXI = 0;
    private daf bqC = null;
    private boolean gcG = false;
    private double gcH = 0.0;

    public dbz() {
        super(cxd.j.fRw);
    }

    public void yC(int n2) {
        this.fXI = n2;
    }

    @Override
    public void nh() {
        if (this.gcH == 0.0) {
            return;
        }
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        if (d2 < this.gcH) {
            return;
        }
        if (this.gcG) {
            if (this.bqC.Dw()) {
                while (d2 >= this.gcH) {
                    this.gcH += 1.0;
                    this.boj.jk().yZ(this.fXI);
                }
            } else {
                this.gcG = false;
                this.gcH = d2;
            }
        } else if (this.bqC.Dw()) {
            this.gcG = true;
            this.gcH = d2;
        } else {
            while (d2 >= this.gcH) {
                this.gcH += 1.0;
                this.boj.jk().yZ(this.boj.zg());
            }
        }
    }

    @Override
    public void bjk() {
        assert (this.boj.bfF());
        this.bqC = (daf)this.boj;
        this.gcG = this.bqC.Dw();
        this.gcH = this.boj.getMessageDelegator().arc().rgz + 1.0;
    }

    @Override
    public void beQ() {
        assert (this.boj.bfF());
        this.bqC = null;
        this.gcG = false;
        this.gcH = 0.0;
    }

    @Override
    protected void a(dbw dbw2) {
        super.a(dbw2);
        dbz dbz2 = (dbz)dbw2;
        dbz2.yC(this.fXI);
    }
}

