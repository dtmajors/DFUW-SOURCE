/*
 * Decompiled with CFR.
 */
public class izw
extends izz {
    private ist mDP;

    public izw() {
        ipf ipf2;
        ipf ipf3 = this.duf();
        if (ipf3 != null) {
            this.al(ipf3);
        }
        if ((ipf2 = this.dui()) != null) {
            this.ag(ipf2);
        }
    }

    public ist dug() {
        return this.mDP;
    }

    public ist duh() {
        ist ist2 = new ist();
        ist2.a(isf.mwN, 15);
        ist2.ST(0x8B8B8B);
        ist2.o(lvn.sXH.bD(new Object[0]));
        return ist2;
    }

    public ipf dui() {
        ipx ipx2 = new ipx(this, irl.dnr()){
            final /* synthetic */ izw mDQ;
            {
                this.mDQ = izw2;
                super(iqz2);
            }

            public boolean du(int n, int n2) {
                this.mDQ.c(13, true, false, false, false);
                return true;
            }
        };
        ipx2.W(new ipb("/dfdata/texture/gui/j2f/common/textfields/text_field_shorter_02_icon.png"));
        return ipx2;
    }

    private ipf duf() {
        ist ist2;
        this.mDP = ist2 = this.duh();
        return ist2 != null ? ipx.l(ipx.a(3, 1, new ipf[0]), ipx.d(ipx.j(ist2, ipx.a(1, 1, new ipf[0]))), ipx.c(new ipf[0])) : null;
    }
}

