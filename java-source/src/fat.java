/*
 * Decompiled with CFR.
 */
public class fat
extends fal {
    public static final int iHG = 1;
    public static final int iHH = 2;
    public static final int goA = 4;
    public static final int goz = 8;
    public static final int iHI = 16;
    protected int iHJ = -1;
    protected String gSa = "";
    protected ljq my = new ljq();
    protected ljq Position = new ljq();
    protected int gTT = -1;

    fat() {
        super(1794);
    }

    public int bNW() {
        return this.iHJ;
    }

    public void Gh(int n) {
        this.iHJ = n;
    }

    public String blU() {
        return this.gSa;
    }

    public void iL(String string) {
        this.gSa = string;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public int bvW() {
        return this.gTT;
    }

    public void BC(int n) {
        this.gTT = n;
    }
}

