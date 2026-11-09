/*
 * Decompiled with CFR.
 */
public class cab {
    private int cck = 0;
    private int ResourceType = -1;
    private ljr eeA;
    private float biu = 128.0f;

    public int getId() {
        return this.cck;
    }

    public void setId(int n) {
        this.cck = n;
    }

    public ljr aFJ() {
        return this.eeA;
    }

    public void a(ljr ljr2) {
        this.eeA = ljr2;
    }

    public float getPower() {
        return this.biu;
    }

    public void setPower(float f2) {
        this.biu = f2;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public int aFK() {
        int n = (int)(this.eeA.getX() * 255.0f);
        int n2 = (int)(this.eeA.getY() * 255.0f);
        int n3 = (int)(this.eeA.bdV() * 255.0f);
        return n3 | n2 << 8 | n << 16;
    }
}

