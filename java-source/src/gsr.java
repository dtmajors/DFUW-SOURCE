/*
 * Decompiled with CFR.
 */
public class gsr
extends grb
implements dxu {
    public static final int jrb = 0;
    public static final int jrc = 1;
    private int aqs = -1;
    private int gOd = 0;
    private boolean jrd = false;
    private double jre = 0.0;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int btc() {
        return this.gOd;
    }

    public void Bl(int n) {
        this.gOd = n;
    }

    public boolean bXe() {
        return this.jrd;
    }

    public void mn(boolean bl) {
        this.jrd = bl;
    }

    public double bXf() {
        return this.jre;
    }

    public void cL(double d) {
        this.jre = d;
    }

    public gsr() {
        super(11110);
    }
}

