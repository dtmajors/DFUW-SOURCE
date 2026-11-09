/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public abstract class hzk
extends hyn {
    protected String lvY = null;
    private a lvZ = a.lwg;
    private int lwa;
    private int lwb;
    private int lwc;
    private int lwd;
    private String lwe;
    private hxv lwf = null;

    public hzk(String string, String string2) {
        super(string, string2);
    }

    protected void cEQ() {
        if (this.lvZ == a.lwh && this.a(hya.lmq)) {
            float f = this.cEN().W;
            float f2 = this.cEN().H;
            float f3 = this.getWidth();
            float f4 = this.getHeight();
            if (Math.abs(this.lon) < 10.0f) {
                this.lon = 0.0f;
            }
            if (Math.abs(f - f3 - this.lon) < 10.0f) {
                this.lon = f - f3;
            }
            if (Math.abs(this.loo) < 10.0f) {
                this.loo = 0.0f;
            }
            if (Math.abs(f2 - f4 - this.loo) < 10.0f) {
                this.loo = f2 - f4;
            }
        }
    }

    @llk
    protected void print(String string) {
    }

    protected boolean oe(String string) {
        return string.startsWith("border");
    }

    protected ifg of(String string) {
        return null;
    }

    protected boolean og(String string) {
        return false;
    }

    protected void c(ifg ifg2) {
    }

    protected void d(ifg ifg2) {
    }

    protected void a(ifg ifg2, hzk hzk2) {
    }

    protected void f(hzk hzk2, ifg ifg2) {
        this.a(hya.lmw, false);
    }

    protected void g(hzk hzk2, ifg ifg2) {
        this.a(hya.lmw, true);
    }

    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        return false;
    }

    protected boolean b(hzk hzk2, ifg ifg2, String string) {
        return false;
    }

    protected boolean e(ifg ifg2) {
        return false;
    }

    protected boolean f(ifg ifg2) {
        return false;
    }

    protected void g(ifg ifg2) {
    }

    public final void cEw() {
        if (this.lvZ == a.lwh) {
            this.po(false);
        }
        super.cEw();
    }

    public final void c(int n, int n2, int n3, String string) {
        int n4;
        super.c(n, n2, n3, string);
        this.lvY = null;
        this.lwf = null;
        if (string != null) {
            // empty if block
        }
        if (this.lvZ == a.lwg) {
            if (string != null) {
                if (this.oe(string)) {
                    this.lwf = hxv.lln;
                } else if (this.og(string)) {
                    this.lvY = string;
                    this.lwf = hxv.llj;
                }
            } else if (this.og("")) {
                this.lvY = string;
                this.lwf = hxv.llj;
            }
        } else if (this.lvZ == a.lwh) {
            this.lwc = n;
            this.lwd = n2;
            this.lwf = hxv.lln;
        } else if (this.lvZ == a.lwi && (n4 = Math.max(Math.abs(n - this.lwa), Math.abs(n2 - this.lwb))) > 5) {
            this.df(n, n2);
        }
    }

    public final void m(int n, int n2, String string) {
        if (this.a(hya.lmt) || this.cFL()) {
            super.m(n, n2, string);
        }
        if (string != null && this.oe(string)) {
            switch (this.cEK()) {
                case lmD: {
                    this.cEZ();
                    this.lvZ = a.lwh;
                    this.lwa = n;
                    this.lwb = n2;
                    this.lwc = n;
                    this.lwd = n2;
                    break;
                }
            }
            return;
        }
        if (string == null) {
            string = "";
        }
        if (this.og(string)) {
            this.cEZ();
            this.lvZ = a.lwi;
            this.lwe = string;
            this.lwa = n;
            this.lwb = n2;
            this.lwc = n;
            this.lwd = n2;
        }
    }

    public final void p(int n, int n2, String string) {
        super.p(n, n2, string);
        if (this.lvZ == a.lwh) {
            this.cHg();
        } else if (this.lvZ == a.lwi) {
            this.lvZ = a.lwg;
            this.cFa();
        }
    }

    public final void q(int n, int n2, String string) {
        super.q(n, n2, string);
    }

    public final void r(int n, int n2, String string) {
        super.r(n, n2, string);
    }

    public final void x(int n, int n2, int n3) {
        super.x(n, n2, n3);
    }

    public final void y(int n, int n2, int n3) {
        super.y(n, n2, n3);
        this.lwf = null;
    }

    private void po(boolean bl) {
        int n = this.lwc - this.lwa;
        int n2 = this.lwd - this.lwb;
        if (n != 0 || n2 != 0) {
            float f = this.cEE() + (float)n;
            float f2 = this.cEF() + (float)n2;
            this.R(f, f2);
            this.lwa = this.lwc;
            this.lwb = this.lwd;
        }
    }

    private void cHg() {
        this.cFa();
        this.po(true);
        this.cEO();
        this.lvZ = a.lwg;
    }

    private void df(int n, int n2) {
        assert (this.lwe != null);
        ifg ifg2 = this.of(this.lwe);
        if (ifg2 != null) {
            ifg2.dC(n, n2);
        }
        this.lwe = null;
        this.lvZ = a.lwg;
        if (ifg2 == null) {
            return;
        }
        this.v(n, n2, 0);
        hzk.cxP().a(this, ifg2);
    }

    public final void h(ifg ifg2) {
        this.c(ifg2);
    }

    public final void i(ifg ifg2) {
        this.d(ifg2);
    }

    public final void b(ifg ifg2, hzk hzk2) {
        this.a(ifg2, hzk2);
    }

    public final void h(hzk hzk2, ifg ifg2) {
        this.f(hzk2, ifg2);
    }

    public final void i(hzk hzk2, ifg ifg2) {
        this.g(hzk2, ifg2);
    }

    public final boolean c(hzk hzk2, ifg ifg2, String string) {
        return this.a(hzk2, ifg2, string);
    }

    public final boolean d(hzk hzk2, ifg ifg2, String string) {
        return this.b(hzk2, ifg2, string);
    }

    public final boolean j(ifg ifg2) {
        return this.e(ifg2);
    }

    public final boolean k(ifg ifg2) {
        return this.f(ifg2);
    }

    public final void l(ifg ifg2) {
        this.g(ifg2);
    }

    protected void cEb() {
        super.cEb();
        if (this.b("XPercent", mhs.FLOAT) && this.b("YPercent", mhs.FLOAT)) {
            float f = this.cEE() / this.cEN().W;
            float f2 = this.cEF() / this.cEN().H;
            this.d("XPercent", f);
            this.d("YPercent", f2);
        }
    }

    protected void cDZ() {
        super.cDZ();
        if (this.b("XPercent", mhs.FLOAT) && this.b("YPercent", mhs.FLOAT)) {
            float f = this.ni("XPercent").floatValue() * this.cEN().W;
            float f2 = this.ni("YPercent").floatValue() * this.cEN().H;
            this.R(f, f2);
        }
    }

    public hxv cFf() {
        if (this.lwf != null) {
            return this.lwf;
        }
        return this.cFg();
    }

    public boolean t(hyn hyn2) {
        return true;
    }

    public void qt() {
    }
}

