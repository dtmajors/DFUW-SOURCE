/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;
import java.util.Map;

public class jdp
extends ipx {
    private jch mSc;
    private ist mTj;
    private Map<Integer, jdo> mTk = lcn.emw();

    public jdp(jch jch2) {
        this.mSc = jch2;
        this.a(iqo.dmT());
        this.W(ipx.l(ipx.a(4, 1, new ipf[0]), new ipk(0x2F2F2F, 484, 1)));
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(this.dyN());
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    public void TS(int n) {
        jdo jdo2 = this.mTk.get(n);
        if (jdo2 != null) {
            this.dyT();
            jdo2.dyK();
        }
    }

    private ipf dyN() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.dyO());
        ipx2.W(this.cGX());
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(this.dyS());
        return ipx2;
    }

    private ipf dyO() {
        ipx ipx2 = new ipx(this, iqo.dmT()){
            final /* synthetic */ jdp mTl;
            {
                this.mTl = jdp2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyC.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(40, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_collectibles.png")));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(ipx.d(this.dyP()));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf dyP() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.dyQ());
        ipx2.W(this.dyR());
        return ipx2;
    }

    private ipf dyQ() {
        this.mTj = new ist(isf.mwN, 12, 0xABABAB);
        this.dyT();
        return this.mTj;
    }

    private ipf dyR() {
        return new ist(isf.mwN, 12, 12357465, "/" + this.mSc.dxp());
    }

    private ipf cGX() {
        return new ipk(0x2F2F2F, 1, 1);
    }

    private ipf dyS() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        List<ach> list = this.mSc.dxr();
        for (ach ach2 : list) {
            if (ipx3.bfn() > 0) {
                ipx3.W(ipx.a(12, 1, new ipf[0]));
            }
            jdo jdo2 = new jdo(this.mSc, ach2);
            this.mTk.put(ach2.getID(), jdo2);
            ipx3.W(jdo2);
        }
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        return ipx2;
    }

    private void dyT() {
        this.mTj.setText("" + this.mSc.dxq());
        if (this.mSc.dxq() == this.mSc.dxp()) {
            this.mTj.Rk(12357465);
        }
    }
}

