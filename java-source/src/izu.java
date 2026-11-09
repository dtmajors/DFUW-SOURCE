/*
 * Decompiled with CFR.
 */
public class izu
extends izz {
    private ist mDN;

    public izu() {
        this.al(this.duf());
        ipx ipx2 = new ipx(this, irl.dnr()){
            final /* synthetic */ izu mDO;
            {
                this.mDO = izu2;
                super(iqz2);
            }

            public boolean du(int n, int n2) {
                this.mDO.c(13, true, false, false, false);
                return true;
            }
        };
        ipx2.W(new ipb("/dfdata/texture/gui/j2f/common/textfields/text_field_shorter_02_icon.png"));
        this.ag(ipx2);
    }

    public ist due() {
        return this.mDN;
    }

    private ipf duf() {
        ist ist2;
        this.mDN = ist2 = new ist();
        ist2.a(isf.mwN, 15);
        ist2.ST(0x8B8B8B);
        ist2.o(lvn.sXI.bD(new Object[0]));
        return ipx.l(ipx.a(3, 1, new ipf[0]), ipx.d(ipx.j(ist2, ipx.a(1, 1, new ipf[0]))), ipx.c(new ipf[0]));
    }
}

