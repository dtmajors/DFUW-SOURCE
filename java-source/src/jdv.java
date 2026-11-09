/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdv
extends ipx {
    private jck mTr;
    private int mgb;

    public jdv(jck jck2, int n, boolean bl) {
        this.mTr = jck2;
        this.mgb = n;
        this.a(irl.dnr());
        this.W(new ipb("/dfdata/texture/gui/j2f/quests/backgrounds/quest_reward_bg.png", this.mgb, this.mgb));
        this.W(ipx.c(1, 1, 1, 1, this.a(jck2)));
        if (bl) {
            this.W(new ipt(0x202020));
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        bsm bsm2 = lea.acl(this.mTr.az());
        hwo hwo2 = new hwo(bsm2);
        return new iac(hwo2, hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), true, false, true);
    }

    private ipf a(jck jck2) {
        if (jck2.vf() > 1) {
            ipx ipx2 = ipx.h(new ipf[0]);
            ipx2.W(ipx.d(this.b(jck2)));
            ipx2.W(ipx.j(ipx.c(new ipf[0]), ipx.l(ipx.c(new ipf[0]), this.c(jck2))));
            return ipx2;
        }
        return ipx.d(this.b(jck2));
    }

    private ipf b(jck jck2) {
        lgw lgw2 = (lgw)lea.enW().acv(jck2.az());
        String string = "/dfdata/texture/dds/" + lgw2.atw().Name;
        return new ipb(string, this.mgb, this.mgb);
    }

    private ipf c(jck jck2) {
        return ipx.h(this.dza(), new ist(isf.mwM, 9, 0xE5E5E5, "" + jck2.vf()));
    }

    private ipf dza() {
        ipk ipk2 = new ipk(0x202020);
        ipk2.hz(0.5f);
        return ipk2;
    }
}

