/*
 * Decompiled with CFR.
 */
public class ayn {
    private int czF;
    private int czG;
    private int czH;
    private int czI;
    public static final int czJ = 1;
    public static final int czK = 2;
    public static final int czL = 3;
    public static final int czM = 4;
    public static final int czN = 5;

    public static final String getErrorMessage(int n) {
        switch (n) {
            case 1: {
                return "Invalid Operation";
            }
            case 2: {
                return "Access Denied";
            }
            case 3: {
                return "Already exists";
            }
            case 4: {
                return "Not Found";
            }
            case 5: {
                return "Not Online";
            }
        }
        return "<Unknown>";
    }

    public ayn() {
    }

    public ayn(int n) {
        this.czF = n;
    }

    public ayn(int n, int n2) {
        this.czF = n;
        this.czG = n2;
    }

    public ayn(int n, int n2, int n3) {
        this.czF = n;
        this.czG = n2;
        this.czH = n3;
    }

    public ayn(int n, int n2, int n3, int n4) {
        this.czF = n;
        this.czG = n2;
        this.czH = n3;
        this.czI = n4;
    }

    public String getMessage() {
        return ayn.getErrorMessage(this.czF);
    }

    public int abe() {
        return this.czG;
    }

    public int abf() {
        return this.czH;
    }

    public int abg() {
        return this.czI;
    }

    public int abh() {
        return this.czF;
    }
}

