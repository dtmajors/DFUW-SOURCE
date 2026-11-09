/*
 * Decompiled with CFR.
 */
public class hzz
extends hzw {
    private boolean lzT;
    private String lob;

    public hzz(int n, int n2, int n3, int n4, boolean bl, String string) {
        super("TooltipGenericWindowSmall", "TooltipGenericWindowSmall.swf", n, n2, n3, n4);
        this.lzT = bl;
        this.lob = string;
    }

    public void da(int n, int n2) {
        this.cJV();
    }

    public void mf(String string) {
        this.lob = string;
        this.cJV();
    }

    @llk
    protected void onTooltipWindowResized(int n, int n2) {
        joa joa2 = hzz.cxP().cxY();
        int n3 = this.lzT ? this.lzl + this.lzn : this.lzl - n;
        int n4 = this.lzm + this.lzo / 2 - n2 / 2;
        if (n4 < 0) {
            n4 = 0;
        } else if ((float)(n4 + n2) > joa2.H) {
            n4 = (int)(joa2.H - (float)n2);
        }
        this.R(n3, n4);
        float f = (float)n / this.cEJ();
        float f2 = (float)n2 / this.cDc();
        this.N(f, f2);
    }

    private void cJV() {
        this.a("setData", new Object[]{this.lob, this.lzT});
    }
}

