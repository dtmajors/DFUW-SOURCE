/*
 * Decompiled with CFR.
 */
public class bos
extends bop {
    private int dye = -1;
    private int dyf = -1;
    private boolean ChainQuest = true;
    private int cHe = 0;
    private boolean dyg = false;

    public void lw(int n) {
        if (lea.enW().isDescendant(n, this.dyf)) {
            ++this.cHe;
            return;
        }
    }

    public void jy(int n) {
        this.cHe = n;
    }

    public boolean asZ() {
        return this.dyg;
    }

    public void dI(boolean bl2) {
        this.dyg = bl2;
    }

    public int aer() {
        return this.cHe;
    }

    @Override
    public int asH() {
        return dud.hdS.ordinal();
    }

    public int ata() {
        return this.dye;
    }

    public void lx(int n) {
        this.dye = n;
    }

    public boolean an(int n, int n2) {
        boolean bl2 = lea.enW().isDescendant(n2, this.dyf);
        boolean bl3 = lea.enZ().isDescendant(n, this.dye);
        return bl2 && bl3;
    }

    public int atb() {
        return this.dyf;
    }

    public void ly(int n) {
        this.dyf = n;
    }

    public boolean asP() {
        return this.ChainQuest;
    }

    public void dB(boolean bl2) {
        this.ChainQuest = bl2;
    }
}

