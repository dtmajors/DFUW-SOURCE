/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  dta
 *  lcr
 *  lqf
 */
import java.util.Collection;
import java.util.Map;

public class jt
extends jk {
    @Override
    public void nU() {
        this.a(a.alR.toString().toLowerCase(), hc.aaA, lqf.rXW, mhs.INTEGER, mhs.STRING, mhs.STRING);
        this.a(a.alS.toString().toLowerCase(), hc.aaA, lqf.rXX, mhs.STRING, mhs.STRING);
        this.a(a.alT.toString().toLowerCase(), hc.aaA, lqf.rXY);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bh(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case alR: {
                this.m(jj2);
                break;
            }
            case alS: {
                this.k(jj2);
                break;
            }
            case alT: {
                this.l(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private void k(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, this.getClass().getSimpleName(), "duelTeamAddPlayer() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, this.getClass().getSimpleName(), "duelTeamAddPlayer() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        cew cew2 = this.i(string, string2);
        if (cew2 == null) {
            jj2.b(lqd.rWZ.bD(string + " " + string2), true);
            return;
        }
        erf erf2 = (erf)this.MessageDelegator.h(16661, this.GUID, lcr.acL);
        erf2.YN = cew2.getGUID();
        erf2.ilu = 1;
        this.MessageDelegator.F(erf2);
        jj2.nT();
    }

    private void l(jj jj2) {
        erf erf2 = (erf)this.MessageDelegator.h(16661, this.GUID, lcr.acL);
        erf2.ilu = 2;
        this.MessageDelegator.F(erf2);
        jj2.nT();
    }

    private void m(jj jj2) {
        int n = ((mho)jj2.cA((int)0)).PC;
        String string = ((mhr)jj2.cA((int)1)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, this.getClass().getSimpleName(), "duelTeamAddPlayer() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), false);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)2)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, this.getClass().getSimpleName(), "duelTeamAddPlayer() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), false);
            return;
        }
        if (n != 0 && n != 1) {
            jj2.b(lqd.rXa.bD(new Object[0]), false);
            return;
        }
        cew cew2 = this.i(string, string2);
        if (cew2 == null) {
            jj2.b(lqd.rWZ.bD(string + " " + string2), true);
            return;
        }
        erf erf2 = (erf)this.MessageDelegator.h(16661, this.GUID, lcr.acL);
        erf2.YL = string + " " + string2;
        erf2.ixP = n == 0 ? 0 : 1;
        erf2.YN = cew2.getGUID();
        erf2.ilu = 0;
        this.MessageDelegator.F(erf2);
        jj2.nT();
    }

    private cew i(String string, String string2) {
        bup bup2 = (bup)this.MessageDelegator.bzx().bzt().d(lcr.qBW);
        assert (bup2 != null) : "SFTitleCollectionManager is null";
        if (bup2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "SFTitleCollectionManager is null");
            return null;
        }
        Map map = ((dta)this.MessageDelegator).bzt().am();
        for (dta dta2 : map.values()) {
            Collection collection = dta2.bzr();
            for (amf amf2 : collection) {
                if (!(amf2 instanceof cew)) continue;
                cew cew2 = (cew)amf2;
                lfn.b(5, this.getClass().getSimpleName(), "poc = " + cew2);
                buo buo2 = bup2.jU(cew2.getGUID());
                if (buo2 == null || !string.equalsIgnoreCase(buo2.FirstName) || !string2.equalsIgnoreCase(buo2.LastName)) continue;
                return cew2;
            }
        }
        lfn.b(5, this.getClass().getSimpleName(), "getPlayerObjectClient() No Player '" + string + " " + string2 + " found");
        return null;
    }

    private a bh(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }
}

