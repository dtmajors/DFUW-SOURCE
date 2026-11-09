/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;
import java.util.Map;

public class jea
extends jdl {
    private ist mTy;
    private Map<jcn, jdz> mTz = lcn.emw();

    public jea(jcm jcm2) {
        super(jcm2);
        this.a(iqo.dmT());
        this.W(ipx.l(ipx.a(4, 1, new ipf[0]), new ipk(0x2F2F2F, 484, 1)));
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(this.dzg());
        List<jcl> list = jcc.dwW().ea(jcm2.qS());
        if (list != null && !list.isEmpty()) {
            this.W(this.dzm());
            this.W(this.dzn());
        }
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    @Override
    public void c(jcn jcn2) {
        jdz jdz2 = this.mTz.get(jcn2);
        if (jdz2 != null) {
            jdz2.dzc();
        }
        if (this.mTy != null) {
            this.mTy.setText("" + this.dxS().dxL());
            if (this.dxS().dxL() == this.dxS().dxE().size()) {
                this.mTy.Rk(12357465);
            }
        }
    }

    @Override
    public void d(jcn jcn2) {
        jdz jdz2 = this.mTz.get(jcn2);
        if (jdz2 != null) {
            jdz2.dzd();
        }
    }

    private ipf dzg() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.dzh());
        ipx2.W(this.cGX());
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.dzk());
        return ipx2;
    }

    private ipf dzh() {
        ipx ipx2 = new ipx(this, iqo.dmT()){
            final /* synthetic */ jea mTA;
            {
                this.mTA = jea2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyD.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.a(40, 1, new ipf[0]));
        List<jcn> list = this.dxS().dxE();
        if (list != null && !list.isEmpty()) {
            ipx2.W(ipx.c(new ipf[0]));
            ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_tasks.png")));
            ipx2.W(ipx.a(1, 4, new ipf[0]));
            ipx2.W(ipx.d(this.dzi()));
            ipx2.W(ipx.c(new ipf[0]));
        } else {
            ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_tasks.png")));
        }
        return ipx2;
    }

    private ipf dzi() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.dzj());
        ipx2.W(this.dyR());
        return ipx2;
    }

    private ipf dzj() {
        this.mTy = new ist(isf.mwN, 12, 0xABABAB, "" + this.dxS().dxL());
        return this.mTy;
    }

    private ipf dyR() {
        return new ist(isf.mwN, 12, 12357465, "/" + (this.dxS().dxE() != null ? this.dxS().dxE().size() : 0));
    }

    private ipf cGX() {
        return new ipk(0x2F2F2F, 1, 1);
    }

    private ipf dzk() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(this.dyY());
        ipx2.W(this.dzl());
        List<jcn> list = this.dxS().dxE();
        if (list != null) {
            for (jcn jcn2 : list) {
                ipx2.W(this.g(jcn2));
            }
        }
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        return ipx2;
    }

    private ipf dzl() {
        double d2 = this.dxS().dxF();
        if (d2 == 0.0) {
            return null;
        }
        return ipx.l(ipx.d(new izo(this, d2){
            final /* synthetic */ jea mTA;
            {
                this.mTA = jea2;
                super(d2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyQ.bD(new Object[0]).exA().toUpperCase());
            }
        }));
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

    private ipf g(jcn jcn2) {
        jdz jdz2 = new jdz(jcn2, this.dxS().xX());
        this.mTz.put(jcn2, jdz2);
        return jdz2;
    }

    private ipf dzm() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.h(ipx.a(40, 1, new ipf[0]), ipx.d(new ipk(0x2F2F2F, 26, 1))));
        ipx2.W(new ipk(0x2F2F2F, 1, 1));
        ipx2.W(ipx.l(ipx.a(7, 1, new ipf[0]), ipx.d(new ipk(0x2F2F2F, 428, 1))));
        return ipx2;
    }

    private ipf dzn() {
        jdy jdy2 = new jdy(this.dxS());
        return jdy2;
    }
}

