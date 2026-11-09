/*
 * Decompiled with CFR.
 */
public class lkt
implements Comparable {
    public a rrq;
    public float pIs = 1.0f;
    public int dRF;
    public double rrr;
    public boolean gRm;
    public float fXV;
    public boolean rrs;
    public boolean rri;
    public float rrt;
    public int rrf;
    public String gsj;
    public float dum;

    public String toString() {
        return "StartTime = " + this.rrr + ", Animation State [" + this.gsj + "] , ID =" + this.dRF + ", StateType = " + (Object)((Object)this.rrq);
    }

    public int compareTo(Object object) {
        if (object instanceof lkt) {
            lkt lkt2 = (lkt)object;
            if (this.rrr < lkt2.rrr) {
                return 1;
            }
            if (this.rrr == lkt2.rrr) {
                return 0;
            }
            return -1;
        }
        throw new IllegalArgumentException("Can't compare to this object (" + this.getClass().getSimpleName() + ") to [" + object.getClass().getSimpleName() + "]");
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof lkt) {
            lkt lkt2 = (lkt)object;
            return this.rrr == lkt2.rrr;
        }
        throw new IllegalArgumentException("Can't compare to this object (" + this.getClass().getSimpleName() + ") to [" + object.getClass().getSimpleName() + "]");
    }

    public int hashCode() {
        return (int)this.rrr * 31;
    }
}

