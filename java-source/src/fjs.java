/*
 * Decompiled with CFR.
 */
public class fjs
extends fiv {
    public static final int iNZ = 1;
    public static final int iOa = 2;
    public static final int iOb = 4;
    private float iOc = 0.0f;
    private float iOd = 0.0f;
    private float iOe = 0.0f;
    private int iOf = 0;
    private int iOg = 0;
    private int iOh = 0;

    fjs() {
        super(2838);
    }

    public void jc(float f2) {
        this.iOc = f2;
    }

    public float bPW() {
        return this.iOc;
    }

    public void jd(float f2) {
        this.iOd = f2;
    }

    public float bPX() {
        return this.iOd;
    }

    public float bPY() {
        return this.iOe;
    }

    public void je(float f2) {
        this.iOe = f2;
    }

    public void GP(int n) {
        this.iOf = n;
    }

    public int bPZ() {
        return this.iOf;
    }

    public void GQ(int n) {
        this.iOg = n;
    }

    public int bQa() {
        return this.iOg;
    }

    public void GR(int n) {
        this.iOh = n;
    }

    public int bQb() {
        return this.iOh;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" XMove=");
        stringBuilder.append(this.iOc);
        stringBuilder.append(" YMove=");
        stringBuilder.append(this.iOd);
        stringBuilder.append(" MouseZMove=");
        stringBuilder.append(this.iOe);
        stringBuilder.append(" Pressed=");
        stringBuilder.append(this.iOf);
        stringBuilder.append(" Released=");
        stringBuilder.append(this.iOg);
        stringBuilder.append(" Clicked=");
        stringBuilder.append(this.iOh);
        return stringBuilder.toString();
    }
}

