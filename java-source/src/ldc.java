/*
 * Decompiled with CFR.
 */
public class ldc
extends ljq {
    public static ldc zk(String string) {
        ljq ljq2 = ljq.Au(string);
        ljq2.normalize();
        return new ldc(ljq2.x, ljq2.y, ljq2.rlV);
    }

    public ldc() {
        super(1.0f, 0.0f, 0.0f);
    }

    public ldc(float f, float f2, float f3) {
        super(f, f2, f3);
        assert (this.isNormalized());
    }

    public ldc(ljq ljq2) {
        super(ljq2);
        assert (this.isNormalized());
    }
}

