/*
 * Decompiled with CFR.
 */
public class dpv {
    private int ID = -1;
    private double gNn = 0.0;
    private int gNo = 0;
    private int gNp = 0;

    public int getID() {
        return this.ID;
    }

    public double bss() {
        return this.gNn;
    }

    public int bst() {
        return this.gNo;
    }

    public int bsu() {
        return this.gNp;
    }

    public dpv() {
    }

    public dpv(int n, double d2, int n2, int n3) {
        this.ID = n;
        this.gNn = d2;
        this.gNo = n2;
        this.gNp = n3;
    }

    public float Bf(int n) {
        return (float)this.gNp / (float)n;
    }

    public int a(dpv dpv2) {
        if (dpv2 == null) {
            return -1;
        }
        if (this == dpv2 || this.ID == dpv2.ID || this.gNn == dpv2.gNn && this.gNo == dpv2.gNo && this.gNp == dpv2.gNp) {
            return 0;
        }
        if (this.gNn < dpv2.gNn) {
            return -1;
        }
        if (this.gNn > dpv2.gNn) {
            return 1;
        }
        if (this.gNp < dpv2.gNp) {
            return -1;
        }
        if (this.gNp > dpv2.gNp) {
            return 1;
        }
        if (this.gNo < dpv2.gNo) {
            return 1;
        }
        if (this.gNo > dpv2.gNo) {
            return -1;
        }
        return 0;
    }
}

