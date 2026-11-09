/*
 * Decompiled with CFR.
 */
public class ldf
implements Comparable<ldf> {
    private double Pq;

    public static double zl(String string) {
        return Double.parseDouble(string);
    }

    public static ldf zm(String string) {
        return new ldf(ldf.zl(string));
    }

    public static ldf zn(String string) {
        try {
            double d2 = ldf.zl(string);
            return new ldf(d2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public ldf() {
    }

    public ldf(ldf ldf2) {
        this(ldf2.Pq);
    }

    public ldf(double d2) {
        this.Pq = d2;
    }

    public double doubleValue() {
        return this.Pq;
    }

    public boolean equals(Object object) {
        if (object instanceof ldf) {
            return ldf.r(this.Pq, ((ldf)object).Pq);
        }
        return false;
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.Pq);
        return (int)(l ^ l >>> 32);
    }

    public String toString() {
        return null;
    }

    public void za(String string) {
        this.Pq = ldf.zl(string);
    }

    public final int a(ldf ldf2) {
        double d2 = this.Pq - ldf2.Pq;
        if (d2 < 0.0) {
            return -1;
        }
        if (d2 > 0.0) {
            return 1;
        }
        return 0;
    }

    public static boolean r(double d2, double d3) {
        return ldf.d(d2, d3, 5.0E-15f);
    }

    public static boolean d(double d2, double d3, double d4) {
        return Math.abs(d2 - d3) <= d4;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((ldf)object);
    }
}

