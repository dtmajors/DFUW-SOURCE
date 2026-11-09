/*
 * Decompiled with CFR.
 */
public class knd
extends knm {
    public static final int jfl = 1;
    public static final int pPn = 2;
    public static final int pPG = 4;
    public int jfk = 0;
    public int bhh = 0;
    public boolean bhk = false;
    public String tt = null;
    public ljq bhi = null;
    public ljq bhj = null;
    public ljq gSf = null;
    public boolean hco = false;

    knd() {
        this.Jv(775);
    }

    public int bUo() {
        return this.jfk;
    }

    public void Jd(int n) {
        this.jfk = n;
    }

    public int aFZ() {
        return this.bhh;
    }

    public void eA(int n) {
        this.bhh = n;
    }

    public boolean bUr() {
        return this.bhk;
    }

    public void aE(boolean bl) {
        this.bhk = bl;
    }

    public String getFrameName() {
        return this.tt;
    }

    public void setFrameName(String string) {
        this.tt = string;
    }

    public ljq bUp() {
        return this.bhi;
    }

    public void aj(ljq ljq2) {
        this.bhi = ljq2;
    }

    public ljq bUq() {
        return this.bhj;
    }

    public void ak(ljq ljq2) {
        this.bhj = ljq2;
    }

    public ljq blS() {
        return this.gSf;
    }

    public void bM(ljq ljq2) {
        this.gSf = ljq2;
    }

    @Override
    public String toString() {
        return super.toString() + " Trans= " + this.bhi + ", Rot= " + this.bhj + ", Scale= " + this.gSf + ", Type= " + this.jfk;
    }
}

