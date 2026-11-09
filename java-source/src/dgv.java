/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgv
extends dgj {
    private float gts = 0.2f;
    private float gtt = 0.2f;
    private float gtu = 0.0f;
    private float gtv = 0.0f;
    private boolean lX = true;

    public dgv() {
        this.gqB = 95;
    }

    public void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.gqP == null) {
            return;
        }
        if (this.gqP.fC == null) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "doTickSpecialEffect() : parent start time is null. can not update fade ");
            return;
        }
        if (this.nx == null) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "doTickSpecialEffect() : Current time is null ! can not update fade");
            return;
        }
        float f2 = (float)(this.nx.rgz - this.gqP.fC.rgz);
        float f3 = this.gqP.getDuration() * this.gts;
        float f4 = this.gqP.getDuration() * this.gtt;
        float f5 = this.gqP.getDuration() - f4;
        float f6 = 1.0f;
        f6 = f2 <= f3 && f3 != 0.0f ? f2 / f3 : (f2 > f5 && f4 != 0.0f ? 1.0f - (f2 - f5) / f4 : 1.0f);
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        for (int i2 = 0; i2 < this.gqP.getAtomCount(); ++i2) {
            dey dey2 = this.gqP.getAtom(i2);
            if (dey2 == null) continue;
            this.calcAtomValues(dey2, f6);
        }
    }

    private void calcAtomValues(dey dey2, float f2) {
        if (dey2.blo() == 14) {
            dfo dfo2 = (dfo)dey2;
            if (this.lX) {
                this.lX = false;
                this.gtu = dfo2.getStartColor().a;
                this.gtv = dfo2.getEndColor().a;
            }
            float f3 = f2 * this.gtu;
            float f4 = f2 * this.gtv;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            lcq lcq2 = dfo2.getStartColor();
            lcq lcq3 = dfo2.getEndColor();
            dfo2.setStartColor(new lcq(lcq2.r, lcq2.g, lcq2.b, f3, true));
            dfo2.setEndColor(new lcq(lcq3.r, lcq3.g, lcq3.b, f4, true));
        } else if (dey2.blo() == 25) {
            dfg dfg2 = (dfg)dey2;
            if (this.lX) {
                this.lX = false;
                this.gtu = dfg2.getStartColor().a;
                this.gtv = dfg2.getEndColor().a;
            }
            float f5 = f2 * this.gtu;
            float f6 = f2 * this.gtv;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            lcq lcq4 = dfg2.getStartColor();
            lcq lcq5 = dfg2.getEndColor();
            dfg2.setStartColor(new lcq(lcq4.r, lcq4.g, lcq4.b, f5, true));
            dfg2.setEndColor(new lcq(lcq5.r, lcq5.g, lcq5.b, f6, true));
        } else if (dey2.blo() == 11) {
            dfm dfm2 = (dfm)dey2;
            lcq lcq6 = dfm2.bms();
            dfm2.n(new lcq(lcq6.r, lcq6.g, lcq6.b, f2, true));
        }
    }

    public void overideParentAtomParameters(dey dey2) {
        this.calcAtomValues(dey2, 0.0f);
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.setInheritDuration(true);
        this.gts = 0.2f;
        this.gtt = 0.2f;
    }

    public void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgv dgv2 = (dgv)dgj2;
        dgv2.setFadeInPercentTime(this.gts);
        dgv2.setFadeOutPercentTime(this.gtt);
    }

    public void setFadeInPercentTime(float f2) {
        this.gts = f2;
    }

    public float getFadeInPercentTime() {
        return this.gts;
    }

    public void setFadeOutPercentTime(float f2) {
        this.gtt = f2;
    }

    public float getFadeOutPercentTime() {
        return this.gtt;
    }
}

