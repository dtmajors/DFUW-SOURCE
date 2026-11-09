/*
 * Decompiled with CFR.
 */
public class lkd
implements Cloneable {
    public static final int pxF = 0;
    public static final int pxG = 1;
    public static final String[] rqj = new String[]{"PureDistance", "XZPlaneDistance"};
    private int pxI = 0;
    private double pxK = 0.0;
    private String pyM = null;

    public int dZn() {
        return this.pxI;
    }

    public void Xs(int n) {
        this.pxI = n;
    }

    public String dZF() {
        return this.pyM;
    }

    public void wI(String string) {
        this.pyM = string;
    }

    public double dZo() {
        return this.pxK;
    }

    public void dK(double d2) {
        this.pxK = d2;
    }

    public String toString() {
        return "DistanceTimer: AnimationDistanceType=" + this.pxI + ", DeltaTimePrUnit=" + this.pxK + ", AnimationSetName=" + this.pyM;
    }

    public Object clone() {
        lkd lkd2 = (lkd)super.clone();
        return lkd2;
    }
}

