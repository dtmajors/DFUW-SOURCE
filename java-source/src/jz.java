/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lav
 *  lcw
 *  lqf
 */
public class jz
extends jk {
    @Override
    public void nU() {
        this.a(a.amX.toString().toLowerCase(), true, hc.aaP, lqf.saf, mhs.BOOLEAN);
        this.a(a.ana.toString().toLowerCase(), hc.aaP, lqf.sag);
        this.a(a.amY.toString().toLowerCase(), hc.aaP, lqf.sah);
        this.a(a.amZ.toString().toLowerCase(), hc.aaP, lqf.sai, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bl(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case amX: {
                this.N(jj2);
                break;
            }
            case ana: {
                this.O(jj2);
                break;
            }
            case amY: {
                this.P(jj2);
                break;
            }
            case amZ: {
                this.Q(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bl(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void N(jj jj2) {
        if (!lcw.enb()) {
            return;
        }
        boolean bl = false;
        if (jj2.getArgCount() == 1) {
            bl = ((mhl)jj2.cA((int)0)).Pp;
        }
        lfn.eqw().a(lfp.a.rks);
        try {
            jry.nUR = false;
            String string = lcw.qLb + "xml-files/server/resource/";
            kxm kxm2 = new kxm(false);
            kxm2.b(string, bl, false);
            jry.nUR = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
        jj2.b(lqk.sdB.bD(new Object[0]), false);
        lfn.eqw().eqv();
    }

    private void O(jj jj2) {
        if (!lcw.enb()) {
            jj2.nT();
            return;
        }
        try {
            kae kae2 = new kae();
            for (int i2 = 0; i2 < lea.eou().length; ++i2) {
                lea.eou()[i2].clear();
            }
            kae2.vP("xml-files/common/paperdoll/paperdoll masterfile.xml");
        }
        catch (bg bg2) {
            // empty catch block
        }
        jj2.nT();
    }

    private void P(jj jj2) {
        if (!lcw.enb()) {
            jj2.nT();
            return;
        }
        try {
            lea.eoi().clear();
            lea.eoj().clear();
            String string = "xml-files/gamelogicinfo/missileinfolist.xml";
            kbe kbe2 = new kbe();
            kbe2.wk(string);
        }
        catch (bg bg2) {
            // empty catch block
        }
        jj2.nT();
    }

    private void Q(jj jj2) {
        if (!lcw.enb()) {
            jj2.nT();
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = lea.enW().getType(string);
        if (n <= 0) {
            jj2.nT();
            return;
        }
        lfn.eqw().a(lfp.a.rkw);
        String string2 = lcw.qLb + "xml-files/server/resource/";
        lav lav2 = new lav(false);
        boolean bl = lav2.Z(string2, n);
        if (bl) {
            jj2.b(lqk.sdC.bD(new Object[0]), false);
        } else {
            jj2.b(lqk.sdD.bD(new Object[0]), true);
        }
        lfn.eqw().eqv();
    }
}

