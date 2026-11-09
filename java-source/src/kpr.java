/*
 * Decompiled with CFR.
 */
public class kpr
extends kpz {
    public static final int pUR = 1;
    public static final int pUS = 2;
    public static final int pUT = 0;
    public static final int pUU = 1;
    private int pUV;
    private int pUW;
    private int iED;
    private int iEE;
    private String fFC;
    private String pUX;

    kpr() {
        this.Jv(3590);
    }

    public int efr() {
        return this.pUW;
    }

    public void aak(int n) {
        this.pUW = n;
    }

    public int efs() {
        return this.pUV;
    }

    public void aal(int n) {
        this.pUV = n;
    }

    public String eft() {
        return this.pUX;
    }

    public void wR(String string) {
        this.pUX = string;
    }

    public int getScreenX() {
        return this.iED;
    }

    public void Fy(int n) {
        this.iED = n;
    }

    public int getScreenY() {
        return this.iEE;
    }

    public void Fz(int n) {
        this.iEE = n;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }
}

