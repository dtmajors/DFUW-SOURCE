/*
 * Decompiled with CFR.
 */
public class gva
extends gux {
    private ldv jsm = null;
    private double eKm = 0.0;
    private double cQz = 0.0;
    private boolean Active = false;
    private boolean eKp = false;
    private int eKn = 0;

    gva() {
        super(32274);
    }

    public final double Bw() {
        return this.eKm;
    }

    public final void setDuration(double d) {
        this.eKm = d;
    }

    public final double ajW() {
        return this.cQz;
    }

    public final void aJ(double d) {
        this.cQz = d;
    }

    public final boolean isActive() {
        return this.Active;
    }

    public final void setActive(boolean bl) {
        this.Active = bl;
    }

    public final ldv bYa() {
        return this.jsm;
    }

    public final void qE(ldv ldv2) {
        this.jsm = ldv2;
    }

    public boolean aSW() {
        return this.eKp;
    }

    public void go(boolean bl) {
        this.eKp = bl;
    }

    public int aSU() {
        return this.eKn;
    }

    public void rH(int n) {
        this.eKn = n;
    }
}

