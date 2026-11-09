/*
 * Decompiled with CFR.
 */
public class iyq
extends iox {
    private ipx mBQ;
    private ipb mBR;
    private boolean mBS;

    public iyq(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        this.F(new iop(new ipk(0x161616), new ipb(string)));
        this.G(new iop(new ipk(0x161616), new ipb(string2)));
        this.H(new iop(new ipk(0x161616), new ipb(string3)));
        this.I(new iop(new ipk(0x161616), new ipb(string4)));
        this.J(new iop(new ipk(0x1E1E1E), new ipb(string5)));
        this.K(new iop(new ipk(0x1E1E1E), new ipb(string6)));
        this.L(new iop(new ipk(0x1E1E1E), new ipb(string7)));
        this.M(new iop(new ipk(0x1E1E1E), new ipb(string8)));
        this.setActive(true);
    }

    public isd dsV() {
        for (iph iph2 = this.djJ(); iph2 != null; iph2 = iph2.djJ()) {
            if (!(iph2 instanceof isd)) continue;
            return (isd)iph2;
        }
        return null;
    }

    public boolean dsW() {
        return this.mBS;
    }

    public void sG(boolean bl) {
        if (bl == this.mBS) {
            return;
        }
        this.mBS = bl;
        if (this.mBQ == null) {
            this.mBR = new ipb("icon_section_change_indicator");
            this.mBQ = ipx.j(ipx.l(ipx.c(-7, -7, this.mBR), ipx.c(new ipf[0])), ipx.c(new ipf[0]));
            this.W(this.mBQ);
        }
        this.mBQ.setVisible(bl);
    }

    @Override
    public void kh(float f2) {
        for (int i = 0; i < this.bfn(); ++i) {
            ipf ipf2 = this.RO(i);
            if (!(ipf2 instanceof iop)) continue;
            iop iop2 = (iop)ipf2;
            iop2.kh(f2);
        }
    }

    @Override
    public void cLq() {
        isd isd2 = this.dsV();
        if (isd2 != null) {
            this.djE();
            ioa.cxP().czx().czI();
            isd2.SH(isd2.ah(this));
        }
    }
}

