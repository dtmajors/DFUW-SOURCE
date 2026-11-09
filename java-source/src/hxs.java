/*
 * Decompiled with CFR.
 */
public class hxs
extends hyg {
    private hxh lfj;
    private final hxi lkS;
    private final float gqm;
    private final float gqn;
    private float doT = 1.0f;
    private float lkT;
    private double oV;
    private double lkJ;
    private boolean aME;
    private boolean aMu;

    public hxs(hxi hxi2, float f2, float f3, hyf hyf2) {
        super(hyf2);
        this.lkS = hxi2;
        this.gqm = f2;
        this.gqn = f3;
        this.lkJ = 0.0;
    }

    public boolean isStarted() {
        return this.aME;
    }

    public void setDuration(float f2) {
        assert (!this.aME);
        this.doT = Math.max(f2, 0.001f);
    }

    public void a(hxh hxh2) {
        assert (!this.aME);
        this.lfj = hxh2;
    }

    public void g(ldz ldz2) {
        if (this.lfj == null) {
            assert (false);
            return;
        }
        if (!this.aME) {
            this.lkT = this.cDA();
            this.aME = true;
            this.oV = ldz2.rgz;
            this.lkJ = 0.0;
        } else if (!this.aMu) {
            this.lkJ = ldz2.rgz - this.oV;
            if (this.lkJ <= 0.0) {
                return;
            }
            if (this.lkJ >= (double)this.doT) {
                this.complete();
            } else {
                float f2 = (float)(this.lkJ / (double)this.doT);
                float f3 = this.kp(f2);
                float f4 = f3 * (this.gqn - this.gqm) + this.gqm;
                this.ko(f4);
            }
        }
    }

    public final float cDv() {
        return (float)Math.max((double)this.doT - this.lkJ, 0.0);
    }

    public final float cDu() {
        return (float)Math.min(this.lkJ, (double)this.doT);
    }

    public final float cDz() {
        if (this.lfj == null) {
            assert (false);
            return 0.0f;
        }
        return this.cDA();
    }

    public boolean isCompleted() {
        return this.aMu;
    }

    public void pb(boolean bl) {
        if (this.aME && bl) {
            this.ko(this.lkT);
        }
        this.aMu = true;
        this.aME = true;
    }

    public void complete() {
        if (!this.aMu) {
            this.ko(this.gqn);
        }
        this.aMu = true;
        this.aME = true;
        this.lkJ = this.doT;
    }

    private final void ko(float f2) {
        if (this.lfj == null) {
            assert (false);
            return;
        }
        switch (this.lkS) {
            case lke: {
                this.lfj.kj(f2);
                break;
            }
            case lkf: {
                this.lfj.kk(f2);
                break;
            }
            case lkg: {
                this.lfj.kl(f2);
                break;
            }
            case lkh: {
                this.lfj.km(f2);
                break;
            }
            case lkj: {
                this.lfj.hz(f2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private final float cDA() {
        if (this.lfj == null) {
            assert (false);
            return 0.0f;
        }
        switch (this.lkS) {
            case lke: {
                return this.lfj.cCZ();
            }
            case lkf: {
                return this.lfj.cDa();
            }
            case lkg: {
                return this.lfj.getX();
            }
            case lkh: {
                return this.lfj.getY();
            }
            case lkj: {
                return this.lfj.getAlpha();
            }
        }
        assert (false);
        return 0.0f;
    }
}

