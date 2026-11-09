/*
 * Decompiled with CFR.
 */
public class jgx
extends ipx
implements iua {
    public jgx() {
        this.a(new iqx(4, 4, 4, 4));
        this.W(this.dFf());
    }

    @Override
    public boolean getSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean bl) {
    }

    private ipf dFf() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.cPn()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.c(new ipf[]{ipx.d(this.cPo())}));
        return ipx2;
    }

    private ipf cPn() {
        return new ipb("/dfdata/texture/gui/j2f/special_events/list_icons/ei_no_events.png");
    }

    private ipf cPo() {
        return new ist(isf.mwO, 14, 0xABABAB, mfp.CKD.bD(new Object[0]));
    }
}

