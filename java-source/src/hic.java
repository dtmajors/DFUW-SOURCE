/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hic
extends hmt {
    public final lhu[] kfW = new lhu[]{new lhu(32, 32, "gui/powerbar/powerbar_01.dds"), new lhu(32, 32, "gui/powerbar/powerbar_02.dds"), new lhu(32, 32, "gui/powerbar/powerbar_03.dds"), new lhu(32, 32, "gui/powerbar/powerbar_04.dds")};
    private final hpa kgb;
    private int aDw = 0;
    private boolean jEV = false;
    private float jEW = 1.0f;
    private boolean jEX;
    private double jEY = 0.0;
    private static final float jEZ = 0.05f;
    private static final float jFa = 0.99f;
    private static final float jFb = 0.45f;
    private final hdm dXw;
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hic kuN;
        {
            this.kuN = hic2;
        }

        public void W() {
            hic.a(this.kuN);
        }
    };

    public hic(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        super(hnc2, string, lgg2, lhf2);
        this.kgb = new hpa(hnc2, "Sprite", lgg.rlI, new lhf(32, 32), lhu.rnR);
        this.j(this.kgb);
        this.dXw = (hdm)this.kLu;
        this.dXw.kAz.eme().a(true, this.jEL);
    }

    @Override
    protected void FG() {
        this.dXw.kAz.eme().a(false, this.jEL);
        super.FG();
    }

    private void cmd() {
        this.kgb.H(new lcq(1.0f, 1.0f, 1.0f, 0.99f));
        this.jEV = false;
    }

    private void cme() {
        this.jEV = true;
        this.jEW = 0.99f;
        this.jEY = this.dXw.kAz.emb();
        this.jEX = false;
    }

    private void cbH() {
        if (!this.jEV) {
            return;
        }
        if (this.dXw.kAz.emb() - this.jEY > (double)0.225f) {
            this.jEW = this.jEX ? 0.99f : 0.05f;
        } else {
            double d2 = (this.dXw.kAz.emb() - this.jEY) / (double)0.225f;
            double d3 = d2 * (double)0.94f;
            if (d3 < 0.0) {
                lfn.b(5, "SFComponentPowerBar", "tick(): Val=" + d3 + " Frac=" + d2);
                d3 = 0.0;
            }
            if (this.jEX) {
                this.jEW = (float)((double)this.jEW + d3);
                if (this.jEW > 0.99f) {
                    this.jEX = false;
                    this.jEW = 0.99f;
                }
            } else {
                this.jEW = (float)((double)this.jEW - d3);
                if (this.jEW < 0.05f) {
                    this.jEX = true;
                    this.jEW = 0.05f;
                }
            }
        }
        this.jEW = Math.min(0.99f, Math.max(0.05f, this.jEW));
        this.jEY = this.dXw.kAz.emb();
        this.kgb.H(new lcq(1.0f, 1.0f, 1.0f, this.jEW));
    }

    public void setLevel(int n) {
        if (n < 0) {
            n = 0;
        }
        if (n > 4) {
            n = 4;
        }
        if (n == this.aDw) {
            return;
        }
        if (n == 0) {
            this.kgb.a(lhu.rnR);
            this.cmd();
        } else if (n <= 3) {
            this.kgb.a(this.kfW[n - 1]);
            this.cmd();
        } else if (n == 4) {
            this.kgb.a(this.kfW[3]);
            this.cme();
        }
        this.aDw = n;
        int n2 = this.dXw.kND.cqv().rmN / 2;
        int n3 = this.dXw.kND.cqv().H / 2;
        this.cB(n2 - 16, n3 - 16);
        this.d(this.kgb.cqv());
    }

    static /* synthetic */ void a(hic hic2) {
        hic2.cbH();
    }
}

