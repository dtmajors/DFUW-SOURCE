/*
 * Decompiled with CFR.
 */
public class inh
extends ize {
    private iuy lUQ;

    public inh() {
        this.drd().a(isf.mwN, 12);
        this.drd().Rk(0xABABAB);
        this.dmO().W(ipx.c(new ipf[0]));
        this.dmO().W(ipx.d(new ipk(0x313131, 1, 20)));
        this.dmO().W(ipx.a(8, 1, new ipf[0]));
        this.dmO().W(ipx.d(ipx.j(ipx.a(1, 2, new ipf[0]), this.cVS(), ipx.a(1, 2, new ipf[0]))));
        this.dmO().W(ipx.a(8, 1, new ipf[0]));
        this.SX(8);
    }

    @Override
    public void setSelected(boolean bl) {
        super.setSelected(bl);
        this.lUQ.hX(bl);
    }

    private ipf cVS() {
        this.lUQ = new iuy(this){
            final /* synthetic */ inh mmb;
            {
                this.mmb = inh2;
            }

            public void pn(boolean bl) {
                this.mmb.setSelected(bl);
            }
        };
        return this.lUQ;
    }
}

