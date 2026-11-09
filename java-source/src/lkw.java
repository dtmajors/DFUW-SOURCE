/*
 * Decompiled with CFR.
 */
public class lkw
implements Cloneable {
    public static final int pzp = 1;
    public static final int pzq = 2;
    public static final int pzr = 0;
    public static final int pzs = 1;
    public static final int pzt = 2;
    public static final String[] pzu = new String[]{"Forward", "Backward", "PingPong"};
    private int ike = 0;
    private float iGw = 1.0f;
    private int rDp;
    private int rrf = 0;
    private String gsj;
    private boolean ikh = true;
    private int ikf = 0;
    private double ikk = 0.0;
    private float iki = 0.0f;
    private float ikj = 0.0f;

    public int bES() {
        return this.ike;
    }

    public void Dm(int n) {
        assert (this.ike == 0) : "Trying to set the Track priority two times!!!";
        this.ike = n;
    }

    public int bEU() {
        return this.ikf;
    }

    public void Do(int n) {
        this.ikf = n;
    }

    public boolean bEW() {
        return this.ikh;
    }

    public void jQ(boolean bl) {
        this.ikh = bl;
    }

    public float bEX() {
        return this.iki;
    }

    public void iF(float f) {
        this.iki = f;
    }

    public float bEY() {
        return this.ikj;
    }

    public void iG(float f) {
        this.ikj = f;
    }

    public double bEZ() {
        return this.ikk;
    }

    public void cb(double d2) {
        this.ikk = d2;
    }

    public int etV() {
        return this.rrf;
    }

    public void adh(int n) {
        this.rrf = n;
    }

    public String dZF() {
        return this.gsj;
    }

    public void wI(String string) {
        this.gsj = string;
    }

    public float bSk() {
        return this.iGw;
    }

    public void jk(float f) {
        this.iGw = f;
    }

    public int euj() {
        return this.rDp;
    }

    public void adt(int n) {
        this.rDp = n;
    }

    public String toString() {
        return "TrackNr = " + this.ikf + ", SetName = " + this.gsj;
    }

    protected final Object clone() {
        lkw lkw2 = (lkw)super.clone();
        return lkw2;
    }
}

