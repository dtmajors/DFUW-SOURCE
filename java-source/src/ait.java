/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 *  lcw
 *  mcs
 */
public abstract class ait
extends aja
implements ajc {
    private int bnM = 0;
    private int bnL = 0;
    private dbr bnO = null;
    private float bnP = 0.0f;

    public final int BV() {
        return this.bnM;
    }

    public final void fC(int n) {
        this.bnM = n;
    }

    public final int BS() {
        return this.bnL;
    }

    public final void fB(int n) {
        this.bnL = n;
    }

    public final dbr BX() {
        return this.bnO;
    }

    public final void a(dbr dbr2) {
        assert (dbr2 != null);
        this.bnO = dbr2;
        this.bnO.a(this);
    }

    public final String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    public final String BT() {
        return ajb.fI(this.bnL);
    }

    public final float BY() {
        if (this.bnP == 0.0f) {
            this.bnP = this.BZ();
            if (ep.aH((int)this.bnM) && this.boj.aJz().bgQ().Ux()) {
                this.bnP *= 0.01f;
            }
        }
        return this.bnP;
    }

    @Override
    public final void reset() {
        super.reset();
        this.bnP = 0.0f;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" AttributeType='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        float f2 = 0.0f;
        int n = ep.aL((int)this.bnM);
        switch (n) {
            case 2: {
                f2 = this.boj.aJz().bgQ().fi().al(this.bnM);
                break;
            }
            case 3: {
                f2 = this.boj.aJz().bgQ().fi().ap(this.bnM);
                break;
            }
            default: {
                assert (false) : "Invalid data type";
                return true;
            }
        }
        float f3 = this.BY();
        if (this.bnM != 13696 && f3 < 0.0f) {
            lfn.b(5, "SFAttributeConstraint", "checkConstraint() Invalid requiredvalue provided for attribute '" + this.getAttributeName() + "': " + f3);
            this.bok = mcs.uAm.bD(new Object[0]);
            return false;
        }
        boolean bl = false;
        switch (this.bnL) {
            case 1: {
                boolean bl2 = bl = f2 >= f3;
                if (bl) break;
                if (lcw.bcB == 2) {
                    if (this.BV() == 384) {
                        this.bok = mcs.uAp.bD(this.BV(), 352, Float.valueOf(f3));
                        break;
                    }
                    if (this.BV() == 400) {
                        this.bok = mcs.uAp.bD(this.BV(), 384, Float.valueOf(f3));
                        break;
                    }
                    this.bok = mcs.uAo.bD(this.BV(), Float.valueOf(f3), Float.valueOf(f2));
                    break;
                }
                this.bok = mcs.uAo.bD(this.BV(), Float.valueOf(f3), Float.valueOf(f2));
                break;
            }
            case 2: {
                boolean bl3 = bl = f2 > f3;
                if (bl) break;
                if (lcw.bcB == 2) {
                    if (this.BV() == 384) {
                        this.bok = mcs.uAp.bD(this.BV(), 352, Float.valueOf(f3));
                        break;
                    }
                    if (this.BV() == 400) {
                        this.bok = mcs.uAp.bD(this.BV(), 384, Float.valueOf(f3));
                        break;
                    }
                    this.bok = mcs.uAo.bD(this.BV(), Float.valueOf(f3), Float.valueOf(f2));
                    break;
                }
                this.bok = mcs.uAo.bD(this.BV(), Float.valueOf(f3), Float.valueOf(f2));
                break;
            }
            case 3: {
                boolean bl4 = bl = f2 <= f3;
                if (bl) break;
                if (this.bnM == 13712 && f2 > 0.0f) {
                    this.bok = mcs.uAs.bD(new Object[0]);
                    break;
                }
                this.bok = mcs.uAn.bD(this.BV(), Float.valueOf(f3), Float.valueOf(f2));
                break;
            }
            case 4: {
                boolean bl5 = bl = f2 < f3;
                if (bl) break;
                if (this.bnM == 13696 && f2 > -1.0f) {
                    this.bok = mcs.uAr.bD(cug.fww);
                    break;
                }
                if (this.bnM == 13712 && f2 > 0.0f) {
                    this.bok = mcs.uAs.bD(new Object[0]);
                    break;
                }
                this.bok = mcs.uAn.bD(this.BV(), Float.valueOf(f3), Float.valueOf(f2));
                break;
            }
            default: {
                lfn.b(5, "SFAttributeConstraint", "checkConstraint() Invalid OperatorType: '" + this.BT() + "'");
                return false;
            }
        }
        return bl;
    }

    protected abstract float BZ();

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ait ait2 = (ait)aja2;
        ait2.fC(this.bnM);
        ait2.fB(this.bnL);
        if (this.bnO != null) {
            ait2.a((dbr)this.bnO.bjr());
        }
    }

    @Override
    public void Ca() {
        if (this.bnO != null) {
            this.bnO.Ca();
        }
    }
}

