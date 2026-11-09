/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class jdr
extends jdl {
    public jdr(jcm jcm2) {
        super(jcm2);
        this.a(iqo.dmT());
        this.W(ipx.l(ipx.a(4, 1, new ipf[0]), new ipk(0x2F2F2F, 484, 1)));
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(this.dyV());
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    private ipf dyV() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.dyW());
        ipx2.W(this.cGX());
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.dyX());
        return ipx2;
    }

    private ipf dyW() {
        ipx ipx2 = new ipx(this, irl.dnr()){
            final /* synthetic */ jdr mTo;
            {
                this.mTo = jdr2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyH.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.a(40, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_dialog.png")));
        return ipx2;
    }

    private ipf cGX() {
        return new ipk(0x2F2F2F, 1, 1);
    }

    private ipf dyX() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(this.dyY());
        List<jcn> list = this.dxS().dxE();
        for (jcn jcn2 : list) {
            ipx2.W(this.e(jcn2));
        }
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        return ipx2;
    }

    private ipf dyY() {
        iso iso2 = new iso();
        iso2.a(isf.mwN, 13);
        iso2.Rk(0xABABAB);
        iso2.o(this.dxS().yp());
        iso2.a(isu.mxP);
        iso2.setWidth(445);
        return iso2;
    }

    private ipf e(jcn jcn2) {
        return new jdq(jcn2);
    }
}

