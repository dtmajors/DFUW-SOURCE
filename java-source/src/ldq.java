/*
 * Decompiled with CFR.
 */
public final class ldq
implements Comparable<ldq> {
    private float Pz;

    public static float parseFloat(String string) {
        return Float.parseFloat(string);
    }

    public static ldq zo(String string) {
        try {
            float f = ldq.parseFloat(string);
            return new ldq(f);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static boolean ai(float f, float f2) {
        return ldq.y(f, f2, 5.0E-6f);
    }

    public static boolean y(float f, float f2, float f3) {
        return f <= f2 + f3 && f >= f2 - f3;
    }

    public ldq() {
    }

    public ldq(float f) {
        this.Pz = f;
    }

    public float floatValue() {
        return this.Pz;
    }

    public boolean b(ldq ldq2) {
        return ldq.ai(this.Pz, ldq2.Pz);
    }

    public boolean equals(Object object) {
        if (object instanceof ldq) {
            return this.b((ldq)object);
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.Pz);
    }

    public final String toString() {
        return null;
    }

    public int c(ldq ldq2) {
        double d2 = this.Pz - ldq2.Pz;
        if (d2 < (double)5.0E-6f) {
            return -1;
        }
        if (d2 > (double)5.0E-6f) {
            return 1;
        }
        return 0;
    }

    public void setValue(float f) {
        this.Pz = f;
    }

    public static float o(float f, float f2, float f3) {
        return f * (1.0f - f3) + f2 * f3;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((ldq)object);
    }
}

