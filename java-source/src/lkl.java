/*
 * Decompiled with CFR.
 */
public class lkl
implements Cloneable {
    public static final int COMPLETE = 0;
    public static final int rqO = 1;
    private int rqP = 0;
    private String pyM = "No Name";
    private double eKm = 0.0;
    private int rqQ;

    public lkl() {
    }

    public lkl(int n, float f, float f2, boolean bl) {
        this.rqP = n;
        this.eKm = f - f2;
    }

    public int etH() {
        return this.rqP;
    }

    public void adb(int n) {
        this.rqP = n;
    }

    public String dZF() {
        return this.pyM;
    }

    public void wI(String string) {
        this.pyM = string;
    }

    public double Bw() {
        return this.eKm;
    }

    public void setDuration(double d2) {
        this.eKm = d2;
    }

    public int etI() {
        return this.rqQ;
    }

    public void adc(int n) {
        this.rqQ = n;
    }

    public String toString() {
        return "AnimationSetID[" + this.rqP + "],AnimationSetName[" + this.pyM + "], Type[" + this.rqQ + "], Dur[" + this.eKm + "]";
    }

    protected final Object clone() {
        lkl lkl2 = (lkl)super.clone();
        return lkl2;
    }
}

