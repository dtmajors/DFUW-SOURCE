/*
 * Decompiled with CFR.
 */
public class evs
extends evv {
    private int iDW = 0;
    private int iDX = 0;
    private int iDY = 0;

    public int bMB() {
        return this.iDW;
    }

    public void Fr(int n) {
        this.iDW = n;
    }

    public int bMC() {
        return this.iDX;
    }

    public void Fs(int n) {
        this.iDX = n;
    }

    public int bMD() {
        return this.iDY;
    }

    public void Ft(int n) {
        this.iDY = n;
    }

    evs() {
        super(20037, bba.cPA.ordinal());
    }
}

