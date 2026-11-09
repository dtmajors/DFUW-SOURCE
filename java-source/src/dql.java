/*
 * Decompiled with CFR.
 */
public class dql {
    private lcq ekx = lcq.BRIGHT_WHITE;
    private float biu = 0.0f;
    private float gOV = 1.0f;

    public dql() {
    }

    public dql(dql dql2) {
        if (dql2 != null) {
            this.gOV = dql2.gOV;
            this.biu = dql2.biu;
            this.ekx = new lcq(dql2.ekx);
        } else {
            lfn.b(4, this.getClass().getName(), "getMultiplyer() : Value was null!");
            assert (false);
        }
    }

    public lcq aIf() {
        return this.ekx;
    }

    public void j(lcq lcq2) {
        this.ekx = lcq2;
    }

    public float getPower() {
        return this.biu;
    }

    public void setPower(float f2) {
        this.biu = f2;
    }

    public float buf() {
        return this.gOV;
    }

    public void hn(float f2) {
        this.gOV = f2;
    }

    public String toString() {
        return "[Power = " + this.biu + ", Color = " + this.ekx + ", Multiplyer = " + this.gOV + "]";
    }
}

