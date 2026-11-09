/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 *  hzo
 *  lcr
 *  lqf
 */
public class jq
extends jk {
    int alD = 0;

    @Override
    public void nU() {
        this.a(a.alF.toString().toLowerCase(), hc.aaQ, lqf.rZv, mhs.STRING, mhs.STRING);
        this.a(a.alG.toString().toLowerCase(), hc.aaQ, lqf.rZw, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.be(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case alF: {
                this.e(jj2);
                break;
            }
            case alG: {
                this.f(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a be(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void e(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        jme jme2 = (jme)this.MessageDelegator.bzx().bzt().d(lcr.qCC);
        jmu jmu2 = new jmu("KEYBOARD." + string.toUpperCase(), jmd.nvd, jnz.nGe | jnz.nGg | jnz.nGh);
        jmr jmr2 = jme2.dMc().b(jmu2, jmq.nzG, this.alD++);
        ieo.a(jmr2, string2);
        jj2.nT();
    }

    private void f(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        hvj hvj2 = (hvj)this.MessageDelegator.bzx().bzt().d(lcr.acL);
        hzl hzl2 = hvj2.cxO();
        if (hzl2 instanceof hzo) {
            hzo hzo2 = (hzo)hzl2;
            if (!hzo2.cHv().pQ(string)) {
                jj2.b(lqd.rXp.bD(string), true);
            } else {
                jj2.nT();
            }
        } else {
            jj2.b(lqd.rXe.bD(new Object[0]), true);
        }
    }
}

