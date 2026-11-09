/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public abstract class akk
extends aja {
    private int SkillType = 0;
    private int bnL = 0;
    private float bqz = 0.0f;

    public final int zg() {
        return this.SkillType;
    }

    public final void eI(int n) {
        this.SkillType = n;
    }

    public final int BS() {
        return this.bnL;
    }

    public final void fB(int n) {
        this.bnL = n;
    }

    public final String BT() {
        return ajb.fI(this.bnL);
    }

    public final float Ds() {
        if (this.bqz == 0.0f) {
            this.bqz = this.Dt();
        }
        return this.bqz;
    }

    public final String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    @Override
    public final void reset() {
        super.reset();
        this.bqz = 0.0f;
    }

    @Override
    protected final boolean BU() {
        this.bok = null;
        float f2 = this.boj.aJz().yQ(this.SkillType);
        float f3 = this.Ds();
        boolean bl = false;
        switch (this.bnL) {
            case 1: {
                boolean bl2 = bl = f2 >= f3;
                if (bl) break;
                this.bok = mcs.uBp.bD(Float.valueOf(f3), this.Bu(), Float.valueOf(f2));
                break;
            }
            case 2: {
                boolean bl3 = bl = f2 > f3;
                if (bl) break;
                this.bok = mcs.uBp.bD(Float.valueOf(f3), this.Bu(), Float.valueOf(f2));
                break;
            }
            case 3: {
                boolean bl4 = bl = f2 <= f3;
                if (bl) break;
                this.bok = mcs.uBo.bD(Float.valueOf(f3), this.Bu(), Float.valueOf(f2));
                break;
            }
            case 4: {
                boolean bl5 = bl = f2 < f3;
                if (bl) break;
                this.bok = mcs.uBo.bD(Float.valueOf(f3), this.Bu(), Float.valueOf(f2));
                break;
            }
            default: {
                return false;
            }
        }
        return bl;
    }

    protected abstract float Dt();

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akk akk2 = (akk)aja2;
        akk2.eI(this.SkillType);
        akk2.fB(this.bnL);
    }
}

