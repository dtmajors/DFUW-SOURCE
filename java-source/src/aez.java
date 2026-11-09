/*
 * Decompiled with CFR.
 */
public abstract class aez {
    private final afm bfU;
    private final int adk;
    private final lox bfJ;
    private final lox bfV;
    private final afq bfW;
    private final int ayO;

    aez(afm afm2, int n, lox lox2, int n2, afq afq2, lox lox3) {
        this.bfU = afm2;
        this.adk = n;
        this.bfJ = lox2;
        this.bfW = afq2;
        this.ayO = n2;
        this.bfV = lox3;
    }

    public afm zz() {
        return this.bfU;
    }

    public int getIndex() {
        return this.adk;
    }

    public int getLimit() {
        return this.ayO;
    }

    public final afq zA() {
        return this.bfW;
    }

    public final lox zl() {
        return this.bfJ;
    }

    public final lox zB() {
        return this.bfV;
    }
}

