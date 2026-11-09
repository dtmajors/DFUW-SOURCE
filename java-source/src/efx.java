/*
 * Decompiled with CFR.
 */
public class efx
extends efq {
    private cv[] ioV;
    private int ioW;

    efx() {
        super(14341);
    }

    public int getNewState() {
        return this.ioW;
    }

    public void Ea(int n2) {
        this.ioW = n2;
    }

    public cv[] bGy() {
        return this.ioV;
    }

    public void b(cv[] cvArray) {
        this.ioV = cvArray;
    }
}

