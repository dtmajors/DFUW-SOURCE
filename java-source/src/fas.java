/*
 * Decompiled with CFR.
 */
public class fas
extends fal {
    public static final int iHz = 1;
    public static final int iHA = 2;
    public static final int iHB = 4;
    public static final int iHC = 8;
    public static final int iHD = 16;
    public static final int iHE = 32;
    private int iHF = 0;
    private float gTN = 0.0f;
    private float gTO = 1.0f;
    private float gTP = 1.0f;
    private String gTQ = "neutral";

    public String bvP() {
        return this.gTQ;
    }

    public void jb(String string) {
        this.gTQ = string;
    }

    public fas() {
        super(1810);
    }

    public void Gg(int n) {
        this.iHF = n;
    }

    public int bNV() {
        return this.iHF;
    }

    public void hE(float f2) {
        this.gTN = f2;
    }

    public float bvS() {
        return this.gTN;
    }

    public void hF(float f2) {
        this.gTO = f2;
    }

    public float bvT() {
        return this.gTO;
    }

    public void hG(float f2) {
        this.gTP = f2;
    }

    public float bvU() {
        return this.gTP;
    }
}

