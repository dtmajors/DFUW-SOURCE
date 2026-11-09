/*
 * Decompiled with CFR.
 */
public class anc
implements Comparable<anc> {
    public static final ldv bBO = new ldv(666L);
    private static final double acj = 0.25;
    private static final double bBP = 0.05;
    private String bBQ;
    private double bBR;
    private Object bBS;
    private final a bBT;
    private final ldv bBU;
    private final ldv bBV;

    public anc(ldv ldv2, ldv ldv3, a a2) {
        assert (ldv3 != null) : "Cannot send a message to a null receiver";
        this.bBV = ldv2;
        this.bBU = ldv3;
        this.bBT = a2;
    }

    public int a(anc anc2) {
        assert (anc2 != null) : "Cannot compare nulls";
        if (this.equals(anc2)) {
            return 0;
        }
        return (int)Math.signum(this.bBR - anc2.bBR);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            assert (false) : "Apples and Oranges";
            return false;
        }
        if (Math.abs(this.bBR - ((anc)object).bBR) >= 0.25) {
            return false;
        }
        if (this.bBT == null ? ((anc)object).bBT != null : !this.bBT.equals((Object)((anc)object).bBT)) {
            return false;
        }
        if (this.bBU == null ? ((anc)object).bBU != null : !this.bBU.equals(((anc)object).bBU)) {
            return false;
        }
        return !(this.bBV == null ? ((anc)object).bBV != null : !this.bBV.equals(((anc)object).bBV));
    }

    public String HW() {
        return this.bBQ == null ? "Future Message" : this.bBQ;
    }

    public double HX() {
        return this.bBR;
    }

    public Object HY() {
        return this.bBS;
    }

    public a HZ() {
        return this.bBT;
    }

    public ldv Ia() {
        return this.bBU;
    }

    public ldv Ib() {
        return this.bBV;
    }

    public int hashCode() {
        int n = 1;
        long l = Double.doubleToLongBits(this.bBR);
        n = 31 * n + (int)(l ^ l >>> 32);
        n = 31 * n + (this.bBT == null ? 0 : this.bBT.hashCode());
        n = 31 * n + (this.bBU == null ? 0 : this.bBU.hashCode());
        n = 31 * n + (this.bBV == null ? 0 : this.bBV.hashCode());
        return n;
    }

    public void dI(String string) {
        this.bBQ = string;
    }

    public void A(double d2) {
        this.bBR = d2 + arw.e(-0.05, 0.05);
    }

    public void i(Object object) {
        this.bBS = object;
    }

    public String toString() {
        return null;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((anc)object);
    }
}

