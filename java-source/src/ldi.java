/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class ldi
extends ler {
    private int reA = 0;
    private lce[] reB = null;
    private String lzh = null;
    private lhu dzN = null;

    public int enk() {
        return this.reA;
    }

    public void acd(int n) {
        this.reA = n;
    }

    public lce[] enl() {
        return this.reB;
    }

    public void a(lce[] lceArray) {
        this.reB = lceArray;
    }

    public String enm() {
        return this.lzh;
    }

    public void op(String string) {
        this.lzh = string;
    }

    public lhu atw() {
        return this.dzN;
    }

    public void a(lhu lhu2) {
        this.dzN = lhu2;
    }

    public boolean enn() {
        return this.reB != null;
    }

    public String eno() {
        return ep.aM((int)this.reA);
    }

    public lce ace(int n) {
        if (this.reB == null) {
            return null;
        }
        int n2 = this.reB.length;
        for (int i = 0; i < n2; ++i) {
            if (this.reB[i].bnM != n) continue;
            return this.reB[i];
        }
        return null;
    }
}

