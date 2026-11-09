/*
 * Decompiled with CFR.
 */
public class gng
extends gnh {
    public static final int START = 0;
    public static final int jmR = 1;
    public static final int END = 2;
    private int mb;
    private int jmS;
    private int jmT;
    private long dmN;
    private float jmU;
    private float jmV;
    private float awq;
    private int gKV;
    private String iUk;

    gng() {
        super(3605);
    }

    public final int bWD() {
        return this.jmS;
    }

    public final void Km(int n) {
        this.jmS = n;
    }

    public final int bWE() {
        return this.jmT;
    }

    public final void Kn(int n) {
        this.jmT = n;
    }

    public final long getStartTime() {
        return this.dmN;
    }

    public final void ah(long l) {
        this.dmN = l;
    }

    public final float bWF() {
        return this.jmU;
    }

    public final void jt(float f) {
        this.jmU = f;
    }

    public final float bWG() {
        return this.jmV;
    }

    public final void ju(float f) {
        this.jmV = f;
    }

    public final float pV() {
        return this.awq;
    }

    public final void jf(float f) {
        this.awq = f;
    }

    public final int getReason() {
        return this.gKV;
    }

    public final void EW(int n) {
        this.gKV = n;
    }

    public final String bRn() {
        return this.iUk;
    }

    public final void kJ(String string) {
        this.iUk = string;
    }

    public final int getState() {
        return this.mb;
    }

    public final void setState(int n) {
        this.mb = n;
    }
}

