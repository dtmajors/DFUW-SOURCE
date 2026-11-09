/*
 * Decompiled with CFR.
 */
public class ige {
    private ljq lSi;
    private boolean lSp;

    public ige(ljq ljq2) {
        this.lSi = ljq2;
        this.lSp = ljq2.y < -1000.0f;
    }

    public ljq av() {
        return this.lSi;
    }

    public void c(ljq ljq2) {
        this.lSi.ex(ljq2);
    }

    public boolean cTd() {
        return this.lSp;
    }

    public float cY(ljq ljq2) {
        float f = ljq2.x - this.lSi.x;
        float f2 = -ljq2.rlV - -this.lSi.rlV;
        return (float)Math.sqrt(f * f + f2 * f2);
    }
}

