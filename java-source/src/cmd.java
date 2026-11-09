/*
 * Decompiled with CFR.
 */
public class cmd {
    private ldv GUID = null;
    private ljq Position = null;
    private double eKm = 0.0;
    private double cQz = 0.0;
    private boolean Active = false;
    private int aYg = 1;
    private int bBh = -1;
    private int eKn = 0;
    private int eKo = 0;
    private boolean eKp = false;

    public final ljq av() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public final double ajW() {
        return this.cQz;
    }

    public final void aJ(double d2) {
        this.cQz = d2;
    }

    public final boolean isActive() {
        return this.Active;
    }

    public final void setActive(boolean bl) {
        this.Active = bl;
    }

    public final double Bw() {
        return this.eKm;
    }

    public final void setDuration(double d2) {
        this.eKm = d2;
    }

    public final ldv getGUID() {
        return this.GUID;
    }

    public final void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final int Bo() {
        return this.aYg;
    }

    public final void fm(int n) {
        this.aYg = n;
    }

    public int aSU() {
        return this.eKn;
    }

    public void rH(int n) {
        this.eKn = n;
    }

    public int aSV() {
        return this.eKo;
    }

    public void rI(int n) {
        this.eKo = n;
    }

    public boolean aSW() {
        return this.eKp;
    }

    public void go(boolean bl) {
        this.eKp = bl;
    }

    public int aSX() {
        return this.bBh;
    }

    public void rJ(int n) {
        this.bBh = n;
    }
}

