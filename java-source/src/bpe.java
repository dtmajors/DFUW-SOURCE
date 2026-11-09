/*
 * Decompiled with CFR.
 */
public abstract class bpe
extends btk {
    public static final int dyR = 0;
    public static final int dyS = 1;
    public static final int dyT = 2;
    private ldv ayy = null;
    private ldv dyU = null;

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    public abstract boolean atk();

    public abstract boolean atl();

    public abstract int atm();

    public ldv qH() {
        return this.ayy;
    }

    public void iy(ldv ldv2) {
        this.ayy = ldv2;
    }

    public ldv atn() {
        return this.dyU;
    }

    public void iz(ldv ldv2) {
        this.dyU = ldv2;
    }
}

