/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class arq {
    private anf bQP;
    private int bQQ;
    private double bQy;
    private boolean bQR;
    private boolean bQS = false;
    public static final double bQT = 900.0;

    public arq(int n) {
        this.bQQ = n;
    }

    public String toString() {
        return null;
    }

    public anf Sa() {
        return this.bQP;
    }

    public double Sb() {
        return this.bQy;
    }

    public boolean Sc() {
        return this.bQP != null && this.bQP.IX() != null;
    }

    public boolean Y(double d2) {
        return this.bQy < d2;
    }

    public void a(anf anf2) {
        this.bQP = anf2;
    }

    public void hI(int n) {
        this.bQQ = n;
    }

    public void Z(double d2) {
        this.bQy = d2;
    }

    public void aa(double d2) {
        this.bQy = d2 + (double)this.bQQ;
    }

    public void Sd() {
        this.bQR = true;
    }

    public boolean Se() {
        return this.bQR;
    }

    public boolean Sf() {
        return this.bQS;
    }

    public void bO(boolean bl) {
        this.bQS = bl;
    }

    public boolean ab(double d2) {
        return this.bQy - d2 < 900.0;
    }
}

