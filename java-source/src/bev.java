/*
 * Decompiled with CFR.
 */
public class bev {
    private int der;
    private bfb des;
    private int det;
    private int deu;
    private boolean dev = true;
    private Object dew;
    private Object dex;
    private Object dey;

    public final int anB() {
        return this.deu;
    }

    public final void kA(int n) {
        this.deu = n;
    }

    public final Object anC() {
        return this.dex;
    }

    public final void q(Object object) {
        this.dex = object;
    }

    public final int anD() {
        return this.der;
    }

    public final void kB(int n) {
        this.der = n;
    }

    public final int anE() {
        return this.det;
    }

    public final void kC(int n) {
        this.det = n;
    }

    public final Object anF() {
        return this.dew;
    }

    public final void r(Object object) {
        this.dew = object;
    }

    public bfb anG() {
        return this.des;
    }

    public int anH() {
        return this.des.ordinal() << 16 | this.der;
    }

    public void b(bfb bfb2) {
        this.des = bfb2;
    }

    public String toString() {
        return "Env = " + (Object)((Object)this.des) + ", Property = " + this.der + ", StartTime = " + this.det + ", StartValue = " + this.dew + ", EndValue = " + this.dex;
    }

    public boolean anI() {
        return this.dev;
    }

    public void dc(boolean bl) {
        this.dev = bl;
    }

    public Object anJ() {
        return this.dey;
    }

    public void s(Object object) {
        this.dey = object;
    }
}

