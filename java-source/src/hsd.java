/*
 * Decompiled with CFR.
 */
public class hsd
extends hrz {
    private float lbi;
    private final ljp fFz = new ljp(1.0f, 1.0f);
    private final lgs kLQ = new lgs();
    private boolean eKX = true;
    private final ldv lbl;
    private lcq kfb = lcq.COLORSHIFT_NEUTRAL;
    private lgg kec = lgg.rlI;
    private lhf kLY = lhf.rnv;

    public hsd(hsi hsi2, String string, ldv ldv2) {
        super(hsi2, string, 1, 2, 512);
        this.lbl = ldv2;
    }

    public final void w(lgg lgg2) {
        if (this.kec.T(lgg2)) {
            return;
        }
        this.kec = lgg2;
        this.Ok(128);
    }

    public final void c(lhf lhf2) {
        if (this.kLY.r(lhf2)) {
            return;
        }
        this.kLY = lhf2;
    }

    public final void H(lcq lcq2) {
        if (this.kfb.X(lcq2)) {
            return;
        }
        this.kfb = lcq2;
        this.Ok(4096);
    }

    public final void g(lgs lgs2) {
        assert (lgs2.rmN >= 0 && lgs2.H >= 0);
        if (this.kLQ.v(lgs2)) {
            return;
        }
        this.kLQ.t(lgs2);
    }

    public final void eq(boolean bl) {
        if (this.eKX == bl) {
            return;
        }
        this.eKX = bl;
        this.Ok(512);
    }

    public final void kc(float f2) {
        if (ldq.ai(this.lbi, f2)) {
            return;
        }
        this.lbi = f2;
        this.Ok(8192);
    }

    @Override
    protected final void cxd() {
        assert (this.cxf() != 0);
        koc koc2 = (koc)this.Oj(262);
        int n = this.cxf();
        if ((n & 1) != 0) {
            koc2.wD(true);
        }
        koc2.ZD(n);
        koc2.tF(this.lbl);
        if ((n & 1) != 0) {
            koc2.ZK(Math.max(this.kLY.rmN, 5));
            koc2.ZJ(Math.max(this.kLY.H, 5));
        }
        if ((n & 0x1001) != 0) {
            koc2.setColor(this.kfb);
        }
        if ((n & 0x81) != 0) {
            koc2.k(new ljp(this.kec.cf, this.kec.cg));
        }
        if ((n & 0x401) != 0) {
            koc2.xq(false);
        }
        if ((n & 0x2001) != 0) {
            koc2.gk(this.lbi);
        }
        if ((n & 0x201) != 0) {
            koc2.setVisible(this.eKX);
        }
        if ((n & 0x11) != 0) {
            koc2.hU(false);
        }
        if ((n & 0x21) != 0) {
            koc2.gu(0.0f);
        }
        if ((n & 0x41) != 0) {
            float f2 = (float)this.kLY.rmN / 2.0f;
            float f3 = (float)this.kLY.H / 2.0f;
            koc2.bS(new ljq(f2, f3, 0.0f));
        }
        if ((n & 5) != 0) {
            koc2.hV(false);
        }
        if ((n & 9) != 0) {
            koc2.j(this.fFz);
        }
        this.b(koc2);
        n = 0;
    }

    @Override
    protected final void b(ktl ktl2, knt knt2) {
        koc koc2;
        if (knt2 instanceof koc && ((koc2 = (koc)knt2).eep() & 1) != 0) {
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
    protected boolean isVisible() {
        return this.eKX;
    }
}

