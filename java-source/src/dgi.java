/*
 * Decompiled with CFR.
 */
public class dgi
extends dgb {
    private float gqk = 0.0f;
    private float gql = 1.0f;
    private float gqm = 0.0f;
    private float gqn = 5.0f;
    private boolean lX = true;

    public dgi() {
        this.gpB = (short)3;
    }

    @Override
    public void updateAtom(float f2) {
        if (this.lX && gpF != null && gpF.blo() == 11) {
            dfm dfm2 = (dfm)gpF;
            dfm2.o(new lcq(this.gqk, this.gql - this.gqk, this.gqm, this.gqn, true));
            this.lX = false;
        }
    }

    public float getStartAtTime() {
        return this.gqk;
    }

    public void setStartAtTime(float f2) {
        this.gqk = f2;
    }

    public float getEndAtTime() {
        return this.gql;
    }

    public void setEndAtTime(float f2) {
        this.gql = f2;
    }

    public float getStartValue() {
        return this.gqm;
    }

    public void setStartValue(float f2) {
        this.gqm = f2;
    }

    public float getEndValue() {
        return this.gqn;
    }

    public void setEndValue(float f2) {
        this.gqn = f2;
    }
}

