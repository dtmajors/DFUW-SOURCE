/*
 * Decompiled with CFR.
 */
public class kto
extends ktp {
    public boolean Active = true;
    public ljq Position = null;
    public lgl Rotation = null;
    public float[] qbD = null;
    public float[] qbE = null;
    public float[] qbF = null;
    public float[] qbG = null;
    public boolean qbH = false;
    public ljq qbI = null;
    public ljq qbJ = null;

    public kto() {
        this.qbN = 2306;
    }

    public boolean isActive() {
        return this.Active;
    }

    public boolean egQ() {
        return this.qbH;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public ljq egR() {
        return this.qbI;
    }

    public void dH(ljq ljq2) {
        this.qbI = ljq2;
    }

    public ljq egS() {
        return this.qbJ;
    }

    public void dI(ljq ljq2) {
        this.qbJ = ljq2;
    }
}

