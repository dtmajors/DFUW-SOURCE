/*
 * Decompiled with CFR.
 */
public class asa {
    private final int bSY;
    private final float Magnitude;
    private final float bSZ;
    private final int bbK;

    public asa(String string, String string2, float f2, float f3) {
        this.bSY = lea.enT().getType(string);
        this.bbK = (Integer)lea.eoc().get(string2);
        this.Magnitude = f2;
        this.bSZ = f3;
    }

    public int SJ() {
        return this.bSY;
    }

    public float uO() {
        return this.Magnitude;
    }

    public float SK() {
        return this.bSZ;
    }

    public int xc() {
        return this.bbK;
    }
}

