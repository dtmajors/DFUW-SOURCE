/*
 * Decompiled with CFR.
 */
public class ljz {
    protected int eDl = 0;
    protected String rpR = "Animation";
    protected float rpS = 0.0f;
    protected float rpT = 0.0f;
    protected boolean gRm = false;
    protected float rpU = 0.0f;

    public ljz() {
    }

    public ljz(int n, float f, float f2, boolean bl) {
        this.eDl = n;
        this.rpS = f;
        this.rpT = f2;
        this.gRm = bl;
    }

    public int aPL() {
        return this.eDl;
    }

    public void acX(int n) {
        this.eDl = n;
    }

    public String etc() {
        return this.rpR;
    }

    public void Ay(String string) {
        this.rpR = string;
    }

    public float etd() {
        return this.rpS;
    }

    public void nB(float f) {
        this.rpS = f;
    }

    public float ete() {
        return this.rpT;
    }

    public void nC(float f) {
        this.rpT = f;
    }

    public boolean buM() {
        return this.gRm;
    }

    public void wL(boolean bl) {
        this.gRm = bl;
    }

    public float etf() {
        return this.rpU;
    }

    public void nD(float f) {
        this.rpU = f;
    }

    public ljz etg() {
        ljz ljz2 = new ljz();
        ljz2.acX(this.eDl);
        ljz2.Ay(this.rpR);
        ljz2.nB(this.rpS);
        ljz2.nC(this.rpT);
        ljz2.wL(this.gRm);
        ljz2.nD(this.rpU);
        return ljz2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnimationName=");
        stringBuilder.append(this.rpR);
        stringBuilder.append(" StartValue=");
        stringBuilder.append(this.rpS);
        stringBuilder.append(" StartEnd=");
        stringBuilder.append(this.rpT);
        return stringBuilder.toString();
    }
}

