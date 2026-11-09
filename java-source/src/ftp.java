/*
 * Decompiled with CFR.
 */
public class ftp
extends ftt {
    protected float X = 0.0f;
    protected float Y = 0.0f;
    protected float fFy = 0.0f;
    protected float iVU = 0.0f;
    protected float iVV = 0.0f;
    protected float iVW = 0.0f;
    private String iVX = null;
    private String iVY = null;
    protected String iVZ = null;
    protected String dLK = null;
    protected String iWa = null;
    protected int ObjectType = -1;

    ftp() {
        super(1026);
    }

    public void r(float f2, float f3, float f4) {
        this.X = f2;
        this.Y = f3;
        this.fFy = f4;
    }

    public void s(float f2, float f3, float f4) {
        this.iVU = f2;
        this.iVV = f3;
        this.iVW = f4;
    }

    public float[] bRO() {
        return new float[]{this.X, this.Y, this.fFy};
    }

    public float bRP() {
        return this.X;
    }

    public float bRQ() {
        return this.Y;
    }

    public float bRR() {
        return this.fFy;
    }

    public float bRS() {
        return this.X;
    }

    public float bRT() {
        return this.Y;
    }

    public float bRU() {
        return this.fFy;
    }

    public float[] bRV() {
        return new float[]{this.iVU, this.iVV, this.iVW};
    }

    public int getObjectType() {
        return this.ObjectType;
    }

    public void setObjectType(int n) {
        this.ObjectType = n;
    }

    public String bRW() {
        return this.iVZ;
    }

    public void kL(String string) {
        this.iVZ = string;
    }

    public String axD() {
        return this.dLK;
    }

    public void gm(String string) {
        this.dLK = string;
    }

    public String bRX() {
        return this.iWa;
    }

    public void kM(String string) {
        this.iWa = string;
    }
}

