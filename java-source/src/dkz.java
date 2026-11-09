/*
 * Decompiled with CFR.
 */
public class dkz {
    private float aZE;
    private float gEQ;
    private float gER;

    public float gN(float f) {
        if (f > this.gEQ) {
            return 0.0f;
        }
        float f2 = (f - this.aZE) / (this.gEQ - this.aZE);
        if (f2 < 0.5f) {
            return this.gER * 2.0f * f2;
        }
        return this.gER * (1.0f - f2) * 2.0f;
    }

    public float boq() {
        return this.gEQ;
    }

    public float bor() {
        return this.gER;
    }

    public float getStartTime() {
        return this.aZE;
    }

    public void gO(float f) {
        this.gEQ = f;
    }

    public void gP(float f) {
        this.gER = f;
    }

    public void setStartTime(float f) {
        this.aZE = f;
    }
}

