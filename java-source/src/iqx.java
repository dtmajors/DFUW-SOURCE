/*
 * Decompiled with CFR.
 */
public class iqx
extends irl {
    private int mub;
    private int muc;
    private int mud;
    private int mue;
    private static iqx muf = new iqx(1, 1, 1, 1);

    public iqx(int n, int n2, int n3, int n4) {
        this.mub = n;
        this.muc = n2;
        this.mud = n3;
        this.mue = n4;
    }

    @Override
    public void e(ipf ipf2) {
        super.e(ipf2);
        ipf2.setSize(ipf2.getWidth() + this.mub + this.mud, ipf2.getHeight() + this.muc + this.mue);
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        ira.a(iph2, this.mub, this.muc, iph2.getWidth() - this.mub - this.mud, iph2.getHeight() - this.muc - this.mue);
    }

    public static iqx dnh() {
        return muf;
    }
}

