/*
 * Decompiled with CFR.
 */
public class hsc
extends hrz {
    private static final boolean lbe = false;
    private static final boolean lbf = false;
    private final ljp eis = new ljp(1.0f, 1.0f);
    private final lgs kLQ = new lgs();
    private float lbg;
    private float lbh;
    private float lbi;
    private String fFC;
    private boolean fFD;
    private boolean fFE;
    private float eir;
    private boolean lbj = true;
    private boolean eKX = true;
    private lcq kfb = lcq.COLORSHIFT_NEUTRAL;
    private lgg kec = lgg.rlI;
    private lhf kLY = lhf.rnv;
    private static final boolean lbk = true;
    private int aFg = 0;

    public hsc(hsi hsi2, String string) {
        super(hsi2, string, 1, 2, 512);
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
        if (this.fFE && this.cxj()) {
            this.Ok(64);
        }
    }

    public final void setTextureName(String string) {
        assert (string != null);
        if (string.equals(this.fFC)) {
            return;
        }
        this.fFC = string;
        this.Ok(256);
    }

    public final void gu(float f2) {
        if (ldq.ai(this.eir, f2)) {
            return;
        }
        this.eir = f2;
        if (this.cxm()) {
            this.Ok(16);
            if (this.fFE && this.cxj()) {
                this.Ok(64);
            }
        }
        if (this.fFE) {
            this.Ok(32);
        }
    }

    public final void n(ljp ljp2) {
        if (ljp2.z(this.eis)) {
            return;
        }
        this.eis.u(ljp2);
        if (this.cxk()) {
            this.Ok(4);
        }
        if (this.fFD) {
            this.Ok(8);
        }
    }

    public final void H(lcq lcq2) {
        if (this.kfb.X(lcq2)) {
            return;
        }
        this.kfb = lcq2;
        this.Ok(4096);
        this.cxl();
    }

    public final void g(lgs lgs2) {
        assert (lgs2.rmN >= 0 && lgs2.H >= 0) : lgs2;
        if (this.kLQ.v(lgs2)) {
            return;
        }
        this.kLQ.t(lgs2);
        this.Ok(2048);
        this.cxl();
    }

    public final void oD(boolean bl) {
        if (this.lbj == bl) {
            return;
        }
        this.lbj = bl;
        this.cxl();
    }

    public final void kc(float f2) {
        if (ldq.ai(f2, this.lbi)) {
            return;
        }
        this.lbi = f2;
        this.Ok(8192);
    }

    public final void Nd(int n) {
        if (n == this.aFg) {
            return;
        }
        this.aFg = n;
        this.Ok(32768);
    }

    @Override
    protected final void cxd() {
        assert (this.cxf() != 0);
        assert (this.fFC.length() > 0);
        int n = this.cxf();
        kod kod2 = (kod)this.Oj(259);
        if ((n & 1) != 0) {
            kod2.wD(true);
            kod2.xs(true);
        }
        kod2.ZM(n);
        if ((n & 0x8001) != 0) {
            kod2.Nd(this.aFg);
        }
        if ((n & 0x81) != 0) {
            kod2.g(new ljp(this.kec.cf, this.kec.cg));
        }
        if ((n & 0x2001) != 0) {
            kod2.gk(this.lbi);
        }
        if ((n & 5) != 0) {
            kod2.hV(this.fFD);
        }
        if ((n & 9) != 0) {
            kod2.j(this.eis);
        }
        if ((n & 0x1001) != 0) {
            kod2.setColor(this.kfb);
        }
        if ((n & 0x201) != 0) {
            kod2.setVisible(this.eKX);
        }
        if ((n & 0x101) != 0) {
            kod2.setTextureName(this.fFC);
        }
        if ((n & 0x401) != 0) {
            kod2.xr(true);
        }
        if ((n & 0x801) != 0) {
            kod2.p(this.kLQ);
        }
        if ((n & 0x11) != 0) {
            kod2.hU(this.fFE);
        }
        if (this.fFE) {
            if ((n & 0x21) != 0) {
                kod2.gu(this.eir);
            }
            if ((n & 0x41) != 0) {
                kod2.bS(new ljq(this.lbg, this.lbh, 0.0f));
            }
        }
        this.b(kod2);
    }

    @Override
    protected final void b(ktl ktl2, knt knt2) {
        if (knt2 instanceof kod) {
            kod kod2 = (kod)knt2;
            if ((kod2.eeA() & 1) != 0) {
                if (ktl2.getResult() == 0) {
                    this.cxg();
                } else {
                    if (kod2.fFC.equals(this.jDE.lbS)) {
                        return;
                    }
                    this.fFC = this.jDE.lbS;
                    this.cxh();
                }
                return;
            }
            if ((kod2.eeA() & 0x100) != 0) {
                if (ktl2.getResult() != 0) {
                    if (kod2.fFC.equals(this.jDE.lbS)) {
                        return;
                    }
                    this.fFC = this.jDE.lbS;
                    this.Ok(256);
                }
                return;
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

    private boolean cxj() {
        assert (this.fFE);
        float f2 = (float)this.kLY.rmN / 2.0f;
        float f3 = (float)this.kLY.H / 2.0f;
        if (ldq.ai(this.lbg, f2) && ldq.ai(this.lbh, f3)) {
            return false;
        }
        this.lbg = f2;
        this.lbh = f3;
        return true;
    }

    private boolean cxk() {
        boolean bl;
        boolean bl2 = bl = !ldq.ai(this.eis.x, 1.0f) || !ldq.ai(this.eis.y, 1.0f);
        if (bl == this.fFD) {
            return false;
        }
        this.fFD = bl;
        return true;
    }

    private void cxl() {
        boolean bl = this.lbj && !this.kLQ.isEmpty() && this.kfb.a > 0.001f;
        this.oE(bl);
    }

    private void oE(boolean bl) {
        if (bl == this.eKX) {
            return;
        }
        this.eKX = bl;
        this.Ok(512);
    }

    private boolean cxm() {
        boolean bl;
        boolean bl2 = bl = !ldq.ai(this.eir, 0.0f);
        if (bl == this.fFE) {
            return false;
        }
        this.fFE = bl;
        return true;
    }
}

