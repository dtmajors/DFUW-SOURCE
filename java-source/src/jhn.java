/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jhn
extends ipx {
    private jcm mTh;
    private ipk nfh;

    public jhn(jcm jcm2, boolean bl) {
        this.mTh = jcm2;
        this.a(iqo.dmT());
        if (bl && (this.mTh.yp() != null || this.mTh.dxF() > 0.0)) {
            this.W(ipx.a(1, 2, new ipf[0]));
        }
        this.W(this.dGk());
    }

    public jcm dxS() {
        return this.mTh;
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        if (this.nfh != null) {
            this.nfh.hz(f2);
        }
    }

    private ipf dGk() {
        if (this.mTh.yp() == null && this.mTh.dxF() == 0.0) {
            return null;
        }
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(this.dGl());
        ipx2.W(this.dGm());
        return ipx2;
    }

    private ipf dGl() {
        this.nfh = new ipk(0x161616);
        return this.nfh;
    }

    private ipf dGm() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        if (this.mTh.yp() != null) {
            ipx2.W(ipx.d(this.dwl()));
        }
        ipx2.W(ipx.c(new ipf[0]));
        if (this.mTh.dxF() > 0.0) {
            ipx2.W(ipx.d(new ipk(0x313131, 1, 12)));
            ipx2.W(ipx.d(new izo(this, this.mTh.dxF()){
                final /* synthetic */ jhn nfi;
                {
                    this.nfi = jhn2;
                    super(d2);
                }

                public hyn dd(int n, int n2) {
                    return iae.oJ(lxu.tyQ.bD(new Object[0]).exA().toUpperCase());
                }
            }));
        }
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dwl() {
        iso iso2 = new iso(isf.mwN, 12, 0xABABAB, this.mTh.yp());
        iso2.setWidth(328);
        iso2.a(isu.mxP);
        iso2.sv(true);
        return iso2;
    }
}

