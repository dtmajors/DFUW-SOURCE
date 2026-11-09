/*
 * Decompiled with CFR.
 */
public class hej {
    public final cak.c bpW;
    public final int aCJ;
    public final lgg kec;
    public final lhu ked;
    public final lhu kee;

    public hej(cak.c c2, int n, lgg lgg2, lhu lhu2, lhu lhu3) {
        assert (lhu2.kLY.rmN == lhu2.kLY.H) : lhu2.kLY;
        this.bpW = c2;
        this.aCJ = n;
        this.kec = lgg2;
        this.ked = lhu2;
        this.kee = lhu3;
    }

    public final lgg d(hdz hdz2) {
        lgs lgs2 = hdz2.ceB().awT();
        lgg lgg2 = new lgg(this.kec.cf + (this.ked.kLY.rmN - lgs2.rmN) / 2, this.kec.cg + (this.ked.kLY.H - lgs2.H) / 2);
        return lgg2;
    }

    public final lgg cfx() {
        return new lgs(this.kec, this.ked.kLY).cfx();
    }

    public final String toString() {
        return null;
    }
}

