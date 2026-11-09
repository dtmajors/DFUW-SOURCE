/*
 * Decompiled with CFR.
 */
public class cnv
implements Comparable<cnv> {
    public final String name;
    public cnm[] eOS;
    public double eOT = Double.POSITIVE_INFINITY;
    public cnv eOU;

    public cnv(String string) {
        this.name = string;
    }

    public String toString() {
        return this.name;
    }

    public int c(cnv cnv2) {
        return Double.compare(this.eOT, cnv2.eOT);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((cnv)object);
    }
}

