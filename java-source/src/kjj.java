/*
 * Decompiled with CFR.
 */
public class kjj
extends kjb {
    public static final int pEO = 1;
    public static final int pEP = 2;
    public static final int pEj = 4;
    public static final int pEk = 8;
    public static final int pEQ = 16;
    private int pER = 0;
    private let[] pES = null;
    private ldv[] pET = null;

    kjj() {
        this.Jv(2823);
    }

    public int ebp() {
        return this.pER;
    }

    public void Yj(int n) {
        this.pER = n;
    }

    public let[] ebq() {
        return this.pES;
    }

    public void a(let[] letArray) {
        this.pES = letArray;
    }

    public ldv[] ebr() {
        return this.pET;
    }

    public void F(ldv[] ldvArray) {
        this.pET = ldvArray;
    }
}

