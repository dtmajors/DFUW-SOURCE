/*
 * Decompiled with CFR.
 */
public class kdx {
    public static final int pif = 1;
    public static final int pig = 2;
    public static final int pih = 3;
    public static final int pii = 1;
    public static final int pij = 2;
    public static final int pik = 3;
    private String eH = "n/a";
    private lju paq = null;
    private int pil = 0;
    private int pim = 0;
    private int pin = 2;

    public void wE(String string) {
        this.eH = string;
    }

    public String getModuleName() {
        return this.eH;
    }

    public void a(lju lju2) {
        this.paq = lju2;
    }

    public lju dVx() {
        return this.paq;
    }

    public void Wv(int n) {
        this.pil = n;
    }

    public int dVy() {
        return this.pil;
    }

    public void Ww(int n) {
        this.pim = n;
    }

    public int dVz() {
        return this.pim;
    }

    public int getDirection() {
        return this.pin;
    }

    public void setDirection(int n) {
        this.pin = n;
    }
}

