/*
 * Decompiled with CFR.
 */
public class jmr
implements Comparable<jmr> {
    public final jmu iNW;
    public final jmq iMe;
    public final int eDX;
    public final String Identifier;
    public int nBP = 0;
    public int nBQ = 0;
    private double nBR = 0.005;
    public int nBS = 0;
    public boolean nBT = false;

    public double dMH() {
        return this.nBR;
    }

    public void dA(double d2) {
        this.nBR = d2;
    }

    public jmr(jmu jmu2, jmq jmq2, int n) {
        this.iNW = jmu2;
        this.iMe = jmq2;
        this.eDX = n;
        this.Identifier = jmr.c(jmq2, n);
    }

    public static String c(jmq jmq2, int n) {
        return jmq2.getKey() + "." + n;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof jmr)) {
            return false;
        }
        jmr jmr2 = (jmr)object;
        return this.Identifier.equals(jmr2.Identifier);
    }

    public int hashCode() {
        return this.Identifier.hashCode();
    }

    public int f(jmr jmr2) {
        return this.Identifier.compareTo(jmr2.Identifier);
    }

    public boolean isEmpty() {
        return this.iNW == null || this.iNW.isEmpty();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.f((jmr)object);
    }
}

