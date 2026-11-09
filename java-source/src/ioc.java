/*
 * Decompiled with CFR.
 */
public class ioc {
    public int cf;
    public int cg;
    private static ioc moD = new ioc();

    public ioc(int n, int n2) {
        this.set(n, n2);
    }

    public ioc() {
        this(0, 0);
    }

    public void set(int n, int n2) {
        this.cf = n;
        this.cg = n2;
    }

    public static ioc dij() {
        return moD;
    }

    public static ioc eh(int n, int n2) {
        moD.set(n, n2);
        return moD;
    }
}

