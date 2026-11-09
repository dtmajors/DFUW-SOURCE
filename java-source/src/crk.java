/*
 * Decompiled with CFR.
 */
public class crk
extends crj {
    public int eYe;
    public int eYf;
    public int eYg;
    public int eYh;
    public int eYi;
    public crl eYj = new crl();

    @Override
    public Object clone() {
        crk crk2 = (crk)super.clone();
        crk2.eYj = (crl)this.eYj.clone();
        return crk2;
    }

    public void b(kgx kgx2) {
        this.tl(kgx2.eYe);
        this.tm(kgx2.eYf);
        this.tn(kgx2.eYg);
        this.to(kgx2.eYh);
        this.tp(kgx2.eYi);
    }

    public void tl(int n) {
        this.eYe = n;
        if (this.eYe > this.eYj.eYk) {
            this.eYj.eYk = this.eYe;
        }
    }

    public void tm(int n) {
        this.eYf = n;
        if (this.eYf > this.eYj.eYl) {
            this.eYj.eYl = this.eYf;
        }
    }

    public void tn(int n) {
        this.eYg = n;
        if (this.eYg > this.eYj.eYm) {
            this.eYj.eYm = this.eYg;
        }
    }

    public void to(int n) {
        this.eYh = n;
        if (this.eYh > this.eYj.eYn) {
            this.eYj.eYn = this.eYh;
        }
    }

    public void tp(int n) {
        this.eYi = n;
        if (this.eYi > this.eYj.eYo) {
            this.eYj.eYo = this.eYi;
        }
    }
}

