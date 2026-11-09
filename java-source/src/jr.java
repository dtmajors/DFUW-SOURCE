/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lqf
 */
public class jr
extends jk {
    @Override
    public void nU() {
        this.a(a.alJ.toString().toLowerCase(), hc.aaz, lqf.sbO);
        this.a(a.alK.toString().toLowerCase(), hc.aaP, lqf.sbP);
        this.a(a.alL.toString().toLowerCase(), hc.aaP, lqf.sbP, mhs.BOOLEAN);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bf(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case alJ: {
                this.g(jj2);
                break;
            }
            case alK: {
                this.h(jj2);
                break;
            }
            case alL: {
                this.i(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bf(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void g(jj jj2) {
        ksj ksj2 = this.on();
        ksj2.Lu(4);
        this.MessageDelegator.a(ksj2);
        jj2.nT();
    }

    private void h(jj jj2) {
        try {
            kbw kbw2 = new kbw();
            kbw2.j("xml-files/common/specialeffect/specialeffects.xml", lea.bkO());
            kbw2.a("xml-files/common/specialeffect/specialeffects_1air_arc_em_fm_gm.xml", lea.bkO(), false, false);
            kbw2.a("xml-files/common/specialeffect/specialeffects_2lm_nm_sc_wat_wc.xml", lea.bkO(), false, false);
        }
        catch (bg bg2) {
            // empty catch block
        }
        jj2.nT();
    }

    private void i(jj jj2) {
        deq deq2 = (deq)this.MessageDelegator.bzx().bzt().d(lcr.qEa);
        deq2.hK(((mhl)jj2.cA((int)0)).Pp);
        jj2.nT();
    }

    private ksj on() {
        ksj ksj2 = (ksj)this.MessageDelegator.j(12);
        ksj2.ts(this.getGUID());
        ksj2.fFC = "";
        ksj2.ctI = "";
        ksj2.dBL = "";
        ksj2.jzi = "";
        ksj2.jzj = "";
        ksj2.jzk = "";
        ksj2.jzl = "";
        ksj2.jzm = "";
        return ksj2;
    }
}

