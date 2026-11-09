/*
 * Decompiled with CFR.
 */
public class iim
implements hvr {
    private iil mbh;
    private a mbi = a.mbm;
    private double mbj;
    private int mbk;

    public iim(iil iil2) {
        this.mbh = iil2;
    }

    @Override
    public void az(ldz ldz2) {
        this.mbk = this.mbh.getX();
        this.mbh.cZV().RH(0);
        this.mbh.setWidth(1);
        this.mbj = ldz2.rgz;
    }

    @Override
    public void aA(ldz ldz2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.mbi) {
            case mbm: {
                double d2 = (ldz2.rgz - this.mbj) / 0.3;
                if (this.mbh.cZS()) {
                    if (d2 >= 1.0) {
                        int n = this.mbh.cZT();
                        this.mbh.RH(this.mbk - n);
                        this.mbh.setWidth(n);
                        this.mbj = ldz2.rgz;
                        this.mbi = a.mbn;
                        break;
                    }
                    int n = (int)((double)this.mbh.cZT() * d2);
                    this.mbh.RH(this.mbk - n);
                    this.mbh.setWidth(n);
                    break;
                }
                if (d2 >= 1.0) {
                    this.mbh.setWidth(this.mbh.cZT());
                    this.mbh.cZV().RH(0);
                    this.mbj = ldz2.rgz;
                    this.mbi = a.mbn;
                    break;
                }
                int n = (int)((double)this.mbh.cZT() * d2);
                this.mbh.cZV().RH(-this.mbh.cZT() + n);
                this.mbh.setWidth(n);
                break;
            }
            case mbn: {
                if (!(ldz2.rgz - this.mbj >= 3.0)) break;
                this.mbj = ldz2.rgz;
                this.mbi = a.mbo;
                break;
            }
            case mbo: {
                double d3 = 1.0 - (ldz2.rgz - this.mbj) / 0.3;
                if (this.mbh.cZS()) {
                    if (d3 <= 0.0) {
                        this.mbh.RH(this.mbk);
                        this.mbh.setWidth(1);
                        this.mbh.removeFromParent();
                        this.cZW();
                        break;
                    }
                    this.mbh.RH(this.mbk - (int)((double)this.mbh.cZT() * d3));
                    this.mbh.setWidth((int)((double)this.mbh.cZT() * d3));
                    break;
                }
                if (d3 <= 0.0) {
                    this.mbh.cZV().RH(0);
                    this.mbh.setWidth(1);
                    this.mbh.removeFromParent();
                    this.cZW();
                    break;
                }
                int n = (int)((double)this.mbh.cZT() * d3);
                this.mbh.cZV().RH(-this.mbh.cZT() + n);
                this.mbh.setWidth(n);
            }
        }
    }

    public void cZW() {
    }
}

