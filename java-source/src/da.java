/*
 * Decompiled with CFR.
 */
public class da {
    ljq[] lI = new ljq[3];
    private float lJ = 5.0f;
    private float lK = 0.0f;

    public float cH() {
        return this.lK;
    }

    public void f(float f2) {
        this.lK = f2;
    }

    public float cI() {
        return this.lJ;
    }

    public void g(float f2) {
        this.lJ = f2;
    }

    public ljq cJ() {
        int n2 = (int)(Math.random() * 100.0 % 2.0);
        return this.lI[n2];
    }

    public da() {
        this.lI[0] = new ljq(34255.0f, 1080.0f, 37058.688f);
        this.lI[1] = new ljq(28387.0f, 1070.0f, 40409.0f);
        this.lI[2] = new ljq(18787.0f, 1080.0f, 42451.0f);
    }

    public boolean h(float f2) {
        return !(this.lK + this.lJ > f2);
    }
}

