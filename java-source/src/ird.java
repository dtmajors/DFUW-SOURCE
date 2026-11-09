/*
 * Decompiled with CFR.
 */
public class ird
extends irl {
    private int mui;
    private int muj;

    public ird(int n, int n2) {
        this.mui = n;
        this.muj = n2;
    }

    @Override
    public void i(ipf ipf2) {
        super.i(ipf2);
        iph iph2 = (iph)ipf2;
        ira.a(iph2, this.mui, this.muj);
    }
}

