/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Map;

public class dgw
extends dgj {
    private Map<dey, a> gtw = null;
    private Map<dey, a> gtx = null;
    private float gty = 0.5f;
    private float gtz = 0.5f;

    public dgw() {
        this.gqB = 93;
    }

    public void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.gqP == null) {
            return;
        }
        for (int i2 = 0; i2 < this.gqP.getAtomCount(); ++i2) {
            float f2;
            dey dey2;
            dey dey3 = this.gqP.getAtom(i2);
            if (dey3 == null) continue;
            boolean bl = false;
            a a2 = null;
            if (this.gtz != 0.0f) {
                if (this.gtw == null) {
                    this.gtw = lcn.emw();
                }
                if ((a2 = this.gtw.get(dey3)) == null) {
                    a2 = new a(this, null);
                    this.gtw.put(dey3, a2);
                    bl = true;
                }
            }
            boolean bl2 = false;
            a a3 = null;
            if (this.gty != 0.0f) {
                if (this.gtx == null) {
                    this.gtx = lcn.emw();
                }
                if ((a3 = this.gtx.get(dey3)) == null) {
                    a3 = new a(this, null);
                    this.gtx.put(dey3, a3);
                    bl2 = true;
                }
            }
            if (dey3.blo() == 11) {
                dey2 = (dfm)dey3;
                if (a3 != null) {
                    float f3 = ((dfm)dey2).getScale();
                    if (bl2) {
                        a3.gqm = f3;
                        a3.gqn = f3;
                    }
                    ((dfm)dey2).setScale(a3.d(f3, false));
                }
                if (a2 == null) continue;
                lcq lcq2 = ((dfm)dey2).bms();
                if (bl) {
                    a2.gqm = lcq2.a;
                    a2.gqn = lcq2.a;
                }
                ((dfm)dey2).n(new lcq(lcq2.r, lcq2.g, lcq2.b, a2.d(lcq2.a, true), true));
                continue;
            }
            if (dey3.blo() == 14) {
                dey2 = (dfo)dey3;
                if (a3 != null) {
                    float f4 = ((dfo)dey2).getStartScale();
                    if (bl2) {
                        a3.gqm = f4;
                        a3.gqn = ((dfo)dey2).getEndScale();
                    }
                    float f5 = a3.d(f4, false);
                    ((dfo)dey2).setStartScale(f5);
                    ((dfo)dey2).setEndScale(f5);
                }
                if (a2 == null) continue;
                lcq lcq3 = ((dfo)dey2).getStartColor();
                lcq lcq4 = ((dfo)dey2).getEndColor();
                if (bl) {
                    a2.gqm = lcq3.a;
                    a2.gqn = lcq4.a;
                }
                f2 = a2.d(lcq3.a, true);
                ((dfo)dey2).setStartColor(new lcq(lcq3.r, lcq3.g, lcq3.b, f2, true));
                ((dfo)dey2).setEndColor(new lcq(lcq4.r, lcq4.g, lcq4.b, f2, true));
                continue;
            }
            if (dey3.blo() != 25) continue;
            dey2 = (dfg)dey3;
            if (a3 != null) {
                float f6 = ((dfg)dey2).getStartScale();
                if (bl2) {
                    a3.gqm = f6;
                    a3.gqn = ((dfg)dey2).getEndScale();
                }
                float f7 = a3.d(f6, false);
                ((dfg)dey2).setStartScale(f7);
                ((dfg)dey2).setEndScale(f7);
            }
            if (a2 == null) continue;
            lcq lcq5 = ((dfg)dey2).getStartColor();
            lcq lcq6 = ((dfg)dey2).getEndColor();
            if (bl) {
                a2.gqm = lcq5.a;
                a2.gqn = lcq6.a;
            }
            f2 = a2.d(lcq5.a, true);
            ((dfg)dey2).setStartColor(new lcq(lcq5.r, lcq5.g, lcq5.b, f2, true));
            ((dfg)dey2).setEndColor(new lcq(lcq6.r, lcq6.g, lcq6.b, f2, true));
        }
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.setInheritDuration(true);
        this.gtz = 0.5f;
        this.gty = 0.5f;
    }

    public void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgw dgw2 = (dgw)dgj2;
        dgw2.gtz = this.gtz;
        dgw2.gty = this.gty;
    }

    public void setScaleRange(float f2) {
        this.gty = f2;
    }

    public float getScaleRange() {
        return this.gty;
    }

    public void setAlphaRange(float f2) {
        this.gtz = f2;
    }

    public float getAlphaRange() {
        return this.gtz;
    }

    static /* synthetic */ float access$100(dgw dgw2) {
        return dgw2.gty;
    }

    static /* synthetic */ float access$200(dgw dgw2) {
        return dgw2.gtz;
    }
}

