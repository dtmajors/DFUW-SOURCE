/*
 * Decompiled with CFR.
 */
public class kfv
extends kgh {
    public static final int pjX = 1;
    public static final int pjY = 2;
    public int pjZ = 0;
    public boolean pka;
    public lcq pkb = new lcq(lcq.BRIGHT_WHITE);

    public kfv() {
        this.ed = 12;
    }

    public int dWa() {
        return this.pjZ;
    }

    public void Wy(int n) {
        this.pjZ = n;
    }

    public boolean dWb() {
        return this.pka;
    }

    public void vk(boolean bl) {
        this.pka = bl;
    }

    public lcq dWc() {
        return this.pkb;
    }

    public void N(lcq lcq2) {
        this.pkb = lcq2;
    }
}

