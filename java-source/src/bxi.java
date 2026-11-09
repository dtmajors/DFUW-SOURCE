/*
 * Decompiled with CFR.
 */
public class bxi
extends bxh {
    private static final boolean dtQ = false;
    private bxp dYt = null;
    private int dYu = 590184;
    private boolean dYv;
    private double dYw;

    public bxi(bxp bxp2) {
        super(bxp2);
        this.dYt = bxp2;
        this.aDh();
    }

    @Override
    public byx aDj() {
        return this.dYt;
    }

    public void bh(double d2) {
        assert (!this.dYt.isServerObject());
        assert (this.dYt instanceof bxq);
        if (!this.dYr) {
            return;
        }
        if (this.dYt.aDL() == null || this.dYt.aDL().aAG() == null) {
            return;
        }
        if (this.dYv) {
            if (d2 < this.dYw) {
                return;
            }
            this.dYv = false;
        }
        this.dYr = false;
        byv byv2 = this.dYt.aEP();
        if (!byv2.isAlive()) {
            return;
        }
        int n = 590184;
        bxq bxq2 = (bxq)this.dYt;
        if (bxq2.aDP() != null) {
            float f2;
            float f3;
            n = 590185;
            if (bxq2.aDQ() != null && (f3 = bxq2.aDP().Position.y) <= (f2 = bxq2.aDQ().Position.y) && Math.random() < Math.random()) {
                n = 590187;
            }
        }
        if (n <= 0) {
            lfn.b(5, "SFAnimationManagerAquaticMonster", "doTick() AnimationState is invalid.");
            return;
        }
        if (this.dYu != n) {
            block0 : switch (this.dYu) {
                case 590184: {
                    switch (n) {
                        case 590185: {
                            this.dYu = 590188;
                            this.dYr = true;
                            this.dYv = true;
                            this.dYw = d2 + 5.0;
                        }
                    }
                    break;
                }
                case 590188: {
                    this.dYu = 590185;
                    break;
                }
                case 590185: 
                case 590187: {
                    switch (n) {
                        case 590184: {
                            this.dYu = 590189;
                            this.dYr = true;
                            this.dYv = true;
                            this.dYw = d2 + 5.0;
                            break block0;
                        }
                    }
                    this.dYu = n;
                    break;
                }
                case 590189: {
                    this.dYu = 590184;
                }
            }
        }
        this.nG(this.dYu);
        this.nI(this.dYu);
    }

    @Override
    protected final void b(int n, String string, String string2) {
    }

    private void nI(int n) {
        assert (n > 0);
        fse fse2 = (fse)this.MessageDelegator.h(20481, this.GUID, this.dYt.aDL().getServerGUID());
        fse2.aWe = n;
        this.MessageDelegator.F(fse2);
    }
}

