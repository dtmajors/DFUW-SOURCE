/*
 * Decompiled with CFR.
 */
public class kqu
extends kqy {
    public static final int pWN = 0;
    public static final int pWO = 1;
    public static final int pWP = 2;
    public static final int pWQ = 3;
    public static final int pWR = 4;
    private int pWB = 0;
    private ldv Rs = null;
    private int pWS = 0;
    private int pJi = 0;
    private int PC = -1;

    public int efF() {
        return this.pWB;
    }

    public void aar(int n) {
        this.pWB = n;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public int efN() {
        return this.pWS;
    }

    public void aau(int n) {
        this.pWS = n;
    }

    kqu() {
        this.Jv(4106);
    }

    public int eda() {
        return this.pJi;
    }

    public void YV(int n) {
        this.pJi = n;
    }

    public int getValue() {
        return this.PC;
    }

    public void setValue(int n) {
        this.PC = n;
    }
}

