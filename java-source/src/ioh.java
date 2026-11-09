/*
 * Decompiled with CFR.
 */
public class ioh
extends hvp {
    private ipf moH;

    public ioh(ipf ipf2, int n, int n2, int n3, int n4, double d2) {
        super(n, n2, n3, n4, d2);
        this.moH = ipf2;
    }

    @Override
    public void az(ldz ldz2) {
        super.az(ldz2);
        this.moH.a(new iqu(this.czT(), this.czU()));
    }

    @Override
    public void setSize(int n, int n2) {
        ((iqu)this.moH.djQ()).setSize(n, n2);
        this.moH.pack();
    }
}

