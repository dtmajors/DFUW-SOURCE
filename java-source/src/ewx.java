/*
 * Decompiled with CFR.
 */
public class ewx
extends eww {
    public static final int iEA = 1;
    public static final int iEB = 2;
    protected int iEC = -1;
    protected int iED = 0;
    protected int iEE = 0;
    protected Integer iEF = null;
    protected int iEG = -1;

    public ewx() {
        super(3329);
    }

    public void Fx(int n) {
        this.iEC = n;
    }

    public int bNb() {
        return this.iEC;
    }

    public void n(Integer n) {
        this.iEF = n;
        this.iEG = this.iEF;
    }

    public Integer bNc() {
        return this.iEF;
    }

    public void Fy(int n) {
        this.iED = n;
    }

    public int getScreenX() {
        return this.iED;
    }

    public void Fz(int n) {
        this.iEE = n;
    }

    public int getScreenY() {
        return this.iEE;
    }
}

