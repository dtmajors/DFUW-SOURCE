/*
 * Decompiled with CFR.
 */
public class hse
extends hrz {
    public static final int lbm = 44;
    public static final int lbn = 322;
    public static final int lbo = 144;
    public static final boolean lbp = true;
    private int fFM;
    private String aFo = "";
    private float lbi;
    private ldv se;
    private boolean eKX = true;
    private final lgs kLQ = new lgs();
    private lcq dMT = lcq.BRIGHT_WHITE;
    private lgg kec = lgg.rlI;
    private lhf kLY = lhf.rnv;
    private int aFg = 0;

    public static boolean Om(int n) {
        if ((n & 1) != 0) {
            n &= 0xFFFFFFFE;
        } else {
            switch (n & 0x2C) {
                case 4: 
                case 8: 
                case 32: {
                    break;
                }
                default: {
                    return false;
                }
            }
            switch ((n &= 0xFFFFFFD3) & 0x142) {
                case 2: 
                case 64: 
                case 256: {
                    break;
                }
                default: {
                    return false;
                }
            }
            switch ((n &= 0xFFFFFEBD) & 0x90) {
                case 0: 
                case 16: 
                case 128: {
                    break;
                }
                default: {
                    return false;
                }
            }
            n &= 0xFFFFFF6F;
        }
        return n == 0;
    }

    public hse(hsi hsi2, String string) {
        super(hsi2, string, 1, 2048, 32);
    }

    public final void xf(int n) {
        assert (hse.Om(n));
        if (n == this.fFM) {
            return;
        }
        this.fFM = n;
        this.Ok(128);
    }

    public final void w(lgg lgg2) {
        if (this.kec.T(lgg2)) {
            return;
        }
        this.kec = lgg2;
        this.Ok(4);
        this.Ok(256);
    }

    public final void c(lhf lhf2) {
        if (this.kLY.r(lhf2)) {
            return;
        }
        this.kLY = lhf2;
        this.Ok(256);
    }

    public final void setText(String string) {
        if (this.aFo.equals(string)) {
            return;
        }
        this.aFo = string;
        this.Ok(2);
    }

    public void ma(ldv ldv2) {
        if (ldv.au(this.se, ldv2)) {
            return;
        }
        this.se = ldv2;
        this.Ok(64);
    }

    public final void setColor(lcq lcq2) {
        if (this.dMT.X(lcq2)) {
            return;
        }
        this.dMT = lcq2;
        this.Ok(8);
    }

    public final void g(lgs lgs2) {
        if (this.kLQ.v(lgs2)) {
            return;
        }
        this.kLQ.t(lgs2);
        this.Ok(1024);
    }

    public final void kc(float f2) {
        if (ldq.ai(this.lbi, f2)) {
            return;
        }
        this.lbi = f2;
        this.Ok(16);
    }

    public final void Nd(int n) {
        if (n == this.aFg) {
            return;
        }
        this.aFg = n;
        this.Ok(4096);
    }

    public final void eq(boolean bl) {
        if (this.eKX == bl) {
            return;
        }
        this.eKX = bl;
        this.Ok(32);
    }

    @Override
    protected void cxd() {
        assert (this.cxf() != 0);
        assert (this.aFo.length() > 0);
        koe koe2 = (koe)this.Oj(257);
        int n = this.cxf();
        if ((n & 1) != 0) {
            n |= 0x200;
            koe2.hM(true);
            koe2.wD(true);
        }
        if ((n & 0x1001) != 0) {
            koe2.Nd(this.aFg);
        }
        if ((n & 5) != 0) {
            koe2.g(new ljp(this.kec.cf, this.kec.cg));
        }
        if ((n & 0x41) != 0) {
            koe2.ma(this.se);
        }
        if ((n & 0x11) != 0) {
            koe2.gk(this.lbi);
        }
        if ((n & 9) != 0) {
            koe2.setColor(this.dMT);
        }
        if ((n & 0x21) != 0) {
            koe2.setVisible(this.eKX);
        }
        if ((n & 3) != 0) {
            koe2.setText(this.aFo);
        }
        if ((n & 0x81) != 0) {
            koe2.xf(this.fFM);
        }
        if ((n & 0x101) != 0) {
            koe2.h(new ljp(this.kec.cf + this.kLY.rmN, this.kec.cg + this.kLY.H));
        }
        if ((n & 0x504) != 0) {
            koe2.hM(true);
            n |= 0x400;
            koe2.Ac(this.kLQ.cf);
            koe2.Ae(this.kLQ.cg);
            koe2.Ad(this.kLQ.cf + this.kLQ.rmN);
            koe2.Ab(this.kLQ.cg + this.kLQ.H);
        }
        koe2.JA(n);
        this.b(koe2);
        n = 0;
    }

    @Override
    protected void b(ktl ktl2, knt knt2) {
        koe koe2;
        if (knt2 instanceof koe && ((koe2 = (koe)knt2).bVb() & 1) != 0) {
            switch (ktl2.getResult()) {
                case 0: {
                    this.cxg();
                    return;
                }
            }
        }
        super.b(ktl2, knt2);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected boolean isVisible() {
        return this.eKX;
    }
}

