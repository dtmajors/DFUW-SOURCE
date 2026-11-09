/*
 * Decompiled with CFR.
 */
public class cbl {
    private int di = -1;
    private int ejF = 0;
    private int ejG = 0;
    private int ejH = 0;
    private int ejI = 0;
    private cbn[] ejJ = null;

    public int ib() {
        return this.di;
    }

    public void bN(int n) {
        this.di = n;
    }

    public int aHF() {
        return this.ejF;
    }

    public void oB(int n) {
        this.ejF = n;
    }

    public int aHG() {
        return this.ejG;
    }

    public int aHH() {
        return this.ejH;
    }

    public int aHI() {
        return this.ejI;
    }

    public cbn[] aHJ() {
        return this.ejJ;
    }

    public void a(cbn[] cbnArray) {
        this.ejG = 0;
        this.ejH = 0;
        this.ejI = 0;
        if (cbnArray != null) {
            for (int i2 = 0; i2 < cbnArray.length; ++i2) {
                this.ejG += cbnArray[i2].aHG();
                this.ejH += cbnArray[i2].aHH();
                this.ejI += cbnArray[i2].aHI();
            }
        }
        this.ejJ = cbnArray;
    }
}

