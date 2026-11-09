/*
 * Decompiled with CFR.
 */
public class kip
extends kit {
    public static final int pBA = 1;
    protected int pBB = 0;
    protected float gFo = 0.0f;
    protected float FarPlane = 0.0f;
    protected int gFp = 0;
    protected int gFq = 0;
    protected float gFr = 0.0f;
    protected float gFs = 0.0f;
    protected float gFt = 0.0f;
    protected float gFu = 0.0f;
    protected boolean Active = false;

    kip() {
        this.Jv(2051);
    }

    public int eaI() {
        return this.pBB;
    }

    public void XX(int n) {
        this.pBB = n;
    }

    public float boR() {
        return this.gFo;
    }

    public void gZ(float f) {
        this.gFo = f;
    }

    public float boS() {
        return this.FarPlane;
    }

    public void ha(float f) {
        this.FarPlane = f;
    }

    public int boT() {
        return this.gFp;
    }

    public void As(int n) {
        this.gFp = n;
    }

    public int boU() {
        return this.gFq;
    }

    public void At(int n) {
        this.gFq = n;
    }

    public float boV() {
        return this.gFr;
    }

    public void hb(float f) {
        this.gFr = f;
    }

    public float boW() {
        return this.gFs;
    }

    public void hc(float f) {
        this.gFs = f;
    }

    public float boX() {
        return this.gFt;
    }

    public void hd(float f) {
        this.gFt = f;
    }

    public float boY() {
        return this.gFu;
    }

    public void he(float f) {
        this.gFu = f;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }
}

