/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgz
extends dgj {
    private float gqk = 0.0f;
    private float gql = 1.0f;
    private float gqm = 0.0f;
    private float gqn = 5.0f;
    private boolean lX = true;

    public dgz() {
        this.gqB = 97;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.setInheritDuration(true);
        float f2 = 0.0f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 5.0f;
    }

    public void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgz dgz2 = (dgz)dgj2;
        dgz2.setStartAtTime(this.getStartAtTime());
        dgz2.setEndAtTime(this.getEndAtTime());
        dgz2.setStartValue(this.getStartValue());
        dgz2.setEndValue(this.getEndValue());
    }

    public void overideParentAtomParameters(dey dey2) {
        if (dey2.blo() == 11) {
            dfm dfm2 = (dfm)dey2;
            dfm2.o(new lcq(this.gqk, this.gql - this.gqk, this.gqm, this.gqn, true));
        }
    }

    public void doTickSpecialEffect() {
        int n2 = this.gqP.getAtomCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            dey dey2 = this.gqP.getAtom(i2);
            if (!this.lX || dey2 == null || dey2.blo() != 11) continue;
            dfm dfm2 = (dfm)dey2;
            dfm2.o(new lcq(this.gqk, this.gql - this.gqk, this.gqm, this.gqn, true));
            this.lX = false;
        }
    }

    public void setStartAtTime(float f2) {
        this.gqk = f2;
    }

    public float getStartAtTime() {
        return this.gqk;
    }

    public void setEndAtTime(float f2) {
        this.gql = f2;
    }

    public float getEndAtTime() {
        return this.gql;
    }

    public void setStartValue(float f2) {
        this.gqm = f2;
    }

    public float getStartValue() {
        return this.gqm;
    }

    public void setEndValue(float f2) {
        this.gqn = f2;
    }

    public float getEndValue() {
        return this.gqn;
    }
}

