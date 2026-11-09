/*
 * Decompiled with CFR.
 */
public class mgm {
    private String DvL;
    private String DvM;
    private int cck;
    private String DvN;
    private String DvO;
    private int dPT;
    private int DvP;
    private int DvQ;

    public String eyG() {
        return this.DvL;
    }

    public void BJ(String string) {
        this.DvL = string;
    }

    public String eyH() {
        return this.DvM;
    }

    public void BK(String string) {
        this.DvM = string;
    }

    public int getId() {
        return this.cck;
    }

    public void setId(int n) {
        this.cck = n;
    }

    public String eyI() {
        return this.DvN;
    }

    public void BL(String string) {
        this.DvN = string;
    }

    public String eyJ() {
        return this.DvO;
    }

    public void BM(String string) {
        this.DvO = string;
    }

    public int getPriority() {
        return this.dPT;
    }

    public void setPriority(int n) {
        this.dPT = n;
    }

    public int eyK() {
        return this.DvP;
    }

    public void aef(int n) {
        this.DvP = n;
    }

    public int eyL() {
        return this.DvQ;
    }

    public void aeg(int n) {
        this.DvQ = n;
    }

    public String toString() {
        return "RegionMaterial. Texture = " + this.DvN + ", MatID = " + this.cck;
    }
}

