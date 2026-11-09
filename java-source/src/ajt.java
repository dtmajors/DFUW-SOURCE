/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public abstract class ajt
extends aja {
    private int bpX = 0;

    public final int CS() {
        return this.bpX;
    }

    public final void fK(int n) {
        this.bpX = n;
    }

    protected final boolean a(byv byv2, int n) {
        assert (byv2 != null);
        assert (this.bpX > 0);
        assert (n > 0);
        boolean bl = false;
        switch (this.bpX) {
            case 1: {
                bl = n != byv2.vK();
                break;
            }
            case 2: {
                bl = n != byv2.vL();
                break;
            }
            case 3: {
                bl = n != byv2.vM();
                break;
            }
            case 4: {
                bl = n != byv2.vN();
                break;
            }
            case 5: {
                bl = n != byv2.vO();
                break;
            }
            case 6: {
                bl = n != byv2.vP();
                break;
            }
            case 7: {
                bl = n != byv2.vQ();
                break;
            }
            default: {
                lfn.b(5, "SFObjectStateConstraint", "checkInvertedModeValue() ModeType is invalid: " + this.bpX);
                return false;
            }
        }
        return bl;
    }

    protected final boolean b(byv byv2, int n) {
        assert (byv2 != null);
        assert (this.bpX > 0);
        assert (n > 0);
        boolean bl = false;
        switch (this.bpX) {
            case 1: {
                bl = n == byv2.vK();
                break;
            }
            case 2: {
                bl = n == byv2.vL();
                break;
            }
            case 3: {
                bl = n == byv2.vM();
                break;
            }
            case 4: {
                bl = n == byv2.vN();
                break;
            }
            case 5: {
                bl = n == byv2.vO();
                break;
            }
            case 6: {
                bl = n == byv2.vP();
                break;
            }
            case 7: {
                bl = n == byv2.vQ();
                break;
            }
            default: {
                lfn.b(5, "SFObjectStateConstraint", "checkModeValue() ModeType is invalid: " + this.bpX);
                return false;
            }
        }
        return bl;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajt ajt2 = (ajt)aja2;
        ajt2.fK(this.bpX);
    }

    protected void fL(int n) {
        block0 : switch (this.bpX) {
            case 1: {
                switch (n) {
                    case 3: {
                        this.bok = mcs.uAL.bD(new Object[0]);
                        break block0;
                    }
                }
                lfn.b(5, "SFObjectStateConstraint", "setErrorData() Missing setting of errordata for '" + byw.nR(n) + "'");
                return;
            }
            case 4: {
                switch (n) {
                    case 1: {
                        this.bok = mcs.uAM.bD(new Object[0]);
                        break block0;
                    }
                }
                lfn.b(5, "SFObjectStateConstraint", "setErrorData() Missing setting of errordata for '" + byw.nU(n) + "'");
                return;
            }
            case 5: {
                switch (n) {
                    case 6: {
                        this.bok = mcs.uAQ.bD(new Object[0]);
                        break block0;
                    }
                }
                lfn.b(5, "SFObjectStateConstraint", "setErrorData() Missing setting of errordata for '" + byw.nV(n) + "'");
                return;
            }
            case 7: {
                switch (n) {
                    case 1: {
                        this.bok = mcs.uAX.bD(new Object[0]);
                        break block0;
                    }
                    case 2: {
                        this.bok = mcs.uAZ.bD(new Object[0]);
                        break block0;
                    }
                    case 4: {
                        this.bok = mcs.uAY.bD(new Object[0]);
                        break block0;
                    }
                }
                lfn.b(5, "SFObjectStateConstraint", "setErrorData() Missing setting of errordata for '" + byw.ob(n) + "'");
                return;
            }
            default: {
                lfn.b(5, "SFObjectStateConstraint", "setErrorData() Missing setting of errordata for '" + byw.az(this.bpX, n) + "'");
                return;
            }
        }
    }

    protected void fM(int n) {
        block0 : switch (this.bpX) {
            case 5: {
                switch (n) {
                    case 1: {
                        this.bok = mcs.uAN.bD(new Object[0]);
                        break block0;
                    }
                    case 3: {
                        this.bok = mcs.uAO.bD(new Object[0]);
                        break block0;
                    }
                    case 4: {
                        this.bok = mcs.uAP.bD(new Object[0]);
                        break block0;
                    }
                }
                lfn.b(5, "SFObjectStateConstraint", "setInvertedErrorData() Missing setting of errordata for '" + byw.nV(n) + "'");
                return;
            }
            case 6: {
                switch (n) {
                    case 4: {
                        this.bok = mcs.uAV.bD(new Object[0]);
                        break block0;
                    }
                }
                lfn.b(5, "SFObjectStateConstraint", "setInvertedErrorData() Missing setting of errordata for '" + byw.nY(n) + "'");
                return;
            }
            default: {
                lfn.b(5, "SFObjectStateConstraint", "setInvertedErrorData() Missing setting of errordata for '" + byw.az(this.bpX, n) + "'");
                return;
            }
        }
    }
}

