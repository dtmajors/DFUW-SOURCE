/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.Map;

public class dw
extends btk {
    private static final boolean bC = true;
    private final float nk = 1.0f;
    private final float nl = 0.9f;
    private final float nm = 0.625f;
    private final float nn = 2.5f;
    private double no;
    private boolean np;
    private boolean nq;
    private double nr;
    private double ns;
    private Map<bfb, a> nt = lcn.emw();
    private dre nu;
    private static final double nv = 1.0;
    private static final double nw = -1.0;
    ldz nx = null;

    @Override
    public void initialize() {
        this.cV();
    }

    public void doTick(ldz ldz2) {
        this.nx = ldz2;
        this.m(ldz2);
    }

    public void cU() {
        this.nu.setActive(false);
        this.m(true);
        for (a a2 : this.nt.values()) {
            this.a(a2, 0.6f);
        }
    }

    private void m(ldz ldz2) {
        double d2 = 50400.0 + ldz2.rgz * lcw.qPM;
        double d3 = d2 % 86400.0;
        double d4 = d3 / 86400.0;
        if (d4 >= 0.0 && d4 < 0.2) {
            float f2;
            this.no = 2.5;
            this.m(false);
            if (d4 > 0.16) {
                if (this.nu.bvo() && !this.np) {
                    this.np = true;
                    this.nr = ldz2.rgz;
                    this.ns = this.nr + 1800.0 / lcw.qPM;
                    this.nq = true;
                    this.nu.hz(1.0f);
                }
                if (this.np) {
                    if (ldz2.rgz > this.ns) {
                        this.nu.hz(0.0f);
                        this.np = false;
                        this.nu.iW(false);
                    } else {
                        f2 = (float)((this.ns - ldz2.rgz) / (this.ns - this.nr));
                        this.nu.hz(f2);
                    }
                }
            } else if (d4 > 0.015) {
                if (!this.nu.bvo()) {
                    this.np = true;
                    this.nr = ldz2.rgz;
                    this.ns = this.nr + 1800.0 / lcw.qPM;
                    this.nq = true;
                    this.nu.hz(0.0f);
                    this.nu.iW(true);
                }
                if (this.np) {
                    if (ldz2.rgz > this.ns) {
                        this.nu.hz(1.0f);
                        this.np = false;
                    } else {
                        f2 = (float)((ldz2.rgz - this.nr) / (this.ns - this.nr));
                        this.nu.hz(f2);
                    }
                }
            }
        } else {
            if (this.nu.bvo()) {
                this.nu.iW(false);
            }
            this.no = 0.625;
            this.m(true);
        }
        for (a a2 : this.nt.values()) {
            double d5 = d4;
            if (a2.nB.buz() == bfb.dfN || a2.nB.buz() == bfb.dfL) {
                d5 = d4 >= 0.0 && d4 < 0.2 ? d4 * this.no : 0.5 + (d4 - 0.2) * this.no;
            }
            this.a(a2, d5);
        }
    }

    private void a(a a2, double d2) {
        ljq ljq2 = new ljq(a2.nj);
        ljq2.nm((float)d2);
        lgl lgl2 = new lgl(ljq2);
        lgl2.Y(a2.ny);
        a2.nB.I(lgl2);
        ljq2 = new ljq(a2.nA);
        ljq2.nm((float)d2);
        lgl2 = new lgl(ljq2);
        a2.nB.J(lgl2);
    }

    private void m(boolean bl) {
        if (bl) {
            a a2 = this.nt.get((Object)bfb.dfN);
            if (a2 == null) {
                return;
            }
            a2.nB.hx(1.0f);
            a2 = this.nt.get((Object)bfb.dfL);
            if (a2 == null) {
                return;
            }
            a2.nB.hx(0.9f);
            return;
        }
        a a3 = this.nt.get((Object)bfb.dfN);
        if (a3 == null) {
            return;
        }
        a3.nB.hx(0.9f);
        a3 = this.nt.get((Object)bfb.dfL);
        if (a3 == null) {
            return;
        }
        a3.nB.hx(1.0f);
    }

    private void cV() {
        double d2 = Math.PI * 2;
        lgl lgl2 = new lgl(new ljq(0.0, (double)0.1f, 1.5707963267948966));
        lgl lgl3 = new lgl(new ljq(0.0, (double)-0.1f, 1.5707963267948966));
        ljq ljq2 = new ljq(0.0, 0.0, Math.PI * 2);
        ljq ljq3 = new ljq(0.0, 0.0, Math.PI * -2);
        ljq ljq4 = new ljq(0.0f, 0.0f, 0.0f);
        ljq ljq5 = new ljq(3.0f, 0.0f, 1.0f);
        ljq5.nm((float)Math.PI * 2);
        ljq ljq6 = new ljq(0.0f, 350.0f, 0.0f);
        ljq ljq7 = new ljq(0.0f, 150.0f, 0.0f);
        a a2 = new a(this, this.cW(), lgl2, ljq2, ljq4, ljq6);
        this.nt.put(bfb.dfN, a2);
        a2 = new a(this, this.cX(), lgl3, ljq3, ljq5, ljq7);
        this.nt.put(bfb.dfL, a2);
        this.nu = new dre();
        this.MessageDelegator.a(this.nu);
    }

    private drd a(bfb bfb2, ldv ldv2) {
        drd drd2 = null;
        drd2 = !bew.c(bfb2) ? new drd(bfb2) : (drd)this.MessageDelegator.d(ldv2);
        if (drd2 == null) {
            assert (false) : "Could not find Planet = " + (Object)((Object)bfb2);
            return null;
        }
        return drd2;
    }

    private drd cW() {
        drd drd2 = this.a(bfb.dfN, lcr.qDK);
        drd2.setGUID(lcr.qDK);
        lcq lcq2 = new lcq(1.0f, 0.8f, 0.5f, 1.0f);
        drd2.setActive(true);
        drd2.setVisible(true);
        drd2.hv(1.0f);
        drd2.hx(1.0f);
        drd2.r(lcq2);
        drd2.iV(true);
        drd2.q(lcq2);
        drd2.cm(new ljq(0.0f, 350.0f, 0.0f));
        drd2.H(new lgl());
        drd2.co(new ljq());
        drd2.ck(new ljq());
        drd2.hw(1500.0f);
        drd2.cn(new ljq(2.1f, 0.0f, 3.21f));
        drd2.cl(new ljq());
        drd2.setObjectDescriptionFilename("planets\\sun.xml");
        drd2.cp(new ljq());
        drd2.iL("planets\\sun.xml");
        if (!drd2.isInitialized()) {
            this.MessageDelegator.a(drd2);
        }
        return drd2;
    }

    private drd cX() {
        drd drd2 = this.a(bfb.dfL, lcr.qDL);
        drd2.setGUID(lcr.qDL);
        lcq lcq2 = new lcq(0.0f, 0.0f, 1.0f, 1.0f);
        drd2.setActive(true);
        drd2.setVisible(true);
        drd2.hv(1.0f);
        drd2.hx(0.19f);
        drd2.r(lcq2);
        drd2.iV(true);
        drd2.q(lcq2);
        drd2.cm(new ljq(0.0f, 400.0f, 0.0f));
        drd2.H(new lgl());
        drd2.co(new ljq());
        drd2.ck(new ljq(0.04f, 0.0f, 0.0f));
        drd2.hw(200.0f);
        drd2.cn(new ljq(0.73f, 0.0f, 0.0f));
        drd2.cl(new ljq(0.0f, 0.0f, 0.021f));
        drd2.setObjectDescriptionFilename("planets/blue_moon.xml");
        drd2.cp(new ljq(0.0, 0.0, Math.PI));
        drd2.iL("planets/blue_moon.xml");
        if (!drd2.isInitialized()) {
            this.MessageDelegator.a(drd2);
        }
        return drd2;
    }
}

