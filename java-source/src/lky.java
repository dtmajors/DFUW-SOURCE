/*
 * Decompiled with CFR.
 */
public class lky
implements Cloneable {
    public static final String rDw = "Default Transition";
    public static final int pze = 0;
    public static final int pzf = 1;
    private static final double rDx = 0.35;
    private int rDy = 1;
    private double rDz = 0.35;
    private int rDA;
    private int rDB;
    private String Name = "Default Transition";
    private boolean rDC = true;
    private double rDD;
    private double rDE;
    private boolean rDF = false;
    private boolean rDG = false;
    private double rDH = 0.0;
    private double rDI = 1.0;
    private static lky rDJ;
    private static lky rDK;

    public static final lky eus() {
        if (rDJ == null) {
            rDJ = new lky();
        }
        return rDJ;
    }

    public static final lky eut() {
        if (rDK == null) {
            rDK = new lky();
            rDK.er(0.05f);
        }
        return rDK;
    }

    public int euu() {
        return this.rDA;
    }

    public void adv(int n) {
        this.rDA = n;
    }

    public int euv() {
        return this.rDB;
    }

    public void adw(int n) {
        this.rDB = n;
    }

    public boolean euw() {
        return this.rDC;
    }

    public void yJ(boolean bl) {
        this.rDC = bl;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    protected final Object clone() {
        lky lky2 = (lky)super.clone();
        return lky2;
    }

    public double eux() {
        return this.rDE;
    }

    public void en(double d2) {
        this.rDE = d2;
    }

    public double euy() {
        return this.rDI;
    }

    public void eo(double d2) {
        this.rDI = d2;
    }

    public double euz() {
        return this.rDH;
    }

    public void ep(double d2) {
        this.rDH = d2;
    }

    public double euA() {
        return this.rDD;
    }

    public void eq(double d2) {
        this.rDD = d2;
    }

    public double euB() {
        return this.rDz;
    }

    public void er(double d2) {
        this.rDz = d2;
    }

    public int euC() {
        return this.rDy;
    }

    public void adx(int n) {
        this.rDy = n;
    }

    public boolean euD() {
        return this.rDG;
    }

    public void yK(boolean bl) {
        this.rDG = bl;
    }

    public boolean euE() {
        return this.rDF;
    }

    public void yL(boolean bl) {
        this.rDF = bl;
    }

    public String toString() {
        return "Dur [" + this.rDz + "], Delay[" + this.rDD + ", StartPoint[" + this.rDE + "]";
    }
}

