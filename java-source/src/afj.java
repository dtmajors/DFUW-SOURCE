/*
 * Decompiled with CFR.
 */
public class afj {
    private final afg bgF;
    private final int bgG;
    private final int bgH;

    public afj(afg afg2, int n, int n2) {
        this.bgF = afg2;
        this.bgG = n * 60;
        this.bgH = n2 * 60;
    }

    public double Ae() {
        return lew.fX(this.bgG, this.bgH);
    }

    public final afg Af() {
        return this.bgF;
    }
}

