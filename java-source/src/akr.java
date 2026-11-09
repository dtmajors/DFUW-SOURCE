/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class akr
extends aiu
implements akw {
    private static final boolean bC = false;
    private static final float bnW = 1.0f;
    private daf bqC = null;
    private boolean bqD = false;
    private double boc = 0.0;
    private boolean bqE = true;

    public akr() {
        this.bog = ajb.b.bph;
    }

    @Override
    protected final boolean BU() {
        if (this.Dw()) {
            return super.BU();
        }
        return true;
    }

    private boolean Dw() {
        if (this.bqC == null) {
            return false;
        }
        return this.bqC.Dw();
    }

    @Override
    public void Ca() {
        if (this.boj.bfF() && this.Dw()) {
            super.Ca();
        }
    }

    @Override
    public void nh() {
        assert (this.bqC != null);
        boolean bl = this.Dw();
        if (bl) {
            double d2 = this.boj.getMessageDelegator().arc().rgz;
            if (this.bqD) {
                while (this.boc <= d2) {
                    this.boc += 1.0;
                    super.Ca();
                }
            } else {
                this.boc = d2 + 1.0;
                super.Ca();
                if (this.boj.bfF() && !cxd.fPM) {
                    this.bqE = false;
                    this.boj.aJz().bgQ().aJL().b(400, false, " From Stamina Constraint : " + this.boj.Bu());
                }
            }
        } else if (this.bqD) {
            this.boc = 0.0;
            if (this.boj.bfF() && !cxd.fPM) {
                this.bqE = true;
                this.boj.aJz().bgQ().aJL().b(400, true, " From Stamina Constraint : " + this.boj.Bu());
            }
        }
        this.bqD = bl;
    }

    @Override
    public void Ch() {
        this.bqC = (daf)this.boj;
    }

    @Override
    public void Ci() {
        if (this.boj.bfF() && !this.bqE && this.boc > 0.0) {
            this.bqE = true;
            this.boj.aJz().bgQ().aJL().b(400, true, " From Stamina Constraint : " + this.boj.Bu());
        }
        this.bqC = null;
        this.bqD = false;
        this.boc = 0.0;
    }
}

