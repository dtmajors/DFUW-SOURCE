/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lqf
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class kq
extends jk {
    private les aqN = lea.enZ();
    private cxk aqO = new cxk();

    @Override
    public void nU() {
        this.a(a.are.toString().toLowerCase(), true, hc.aaQ, lqf.sap, mhs.STRING, mhs.FLOAT);
        this.a(a.arf.toString().toLowerCase(), hc.aaQ, lqf.saq, mhs.STRING, mhs.FLOAT);
        this.a(a.arg.toString().toLowerCase(), hc.aaV, lqf.sar, mhs.STRING, mhs.STRING);
        this.a(a.arh.toString().toLowerCase(), hc.aaV, lqf.sas, mhs.STRING, mhs.FLOAT, mhs.STRING);
        this.a(a.aqQ.toString().toLowerCase(), true, hc.aaP, lqf.sat, mhs.FLOAT);
        this.a(a.aqR.toString().toLowerCase(), hc.aaP, lqf.sau, mhs.STRING);
        this.a(a.aqS.toString().toLowerCase(), hc.aaP, lqf.sav);
        this.a(a.aqT.toString().toLowerCase(), hc.aaP, lqf.saw, mhs.STRING);
        this.a(a.aqU.toString().toLowerCase(), hc.aaP, lqf.sax);
        this.a(a.aqV.toString().toLowerCase(), hc.aaP, lqf.say, mhs.STRING, mhs.FLOAT);
        this.a(a.aqW.toString().toLowerCase(), hc.aaP, lqf.saz, mhs.STRING, mhs.FLOAT);
        this.a(a.aqX.toString().toLowerCase(), hc.aaP, lqf.saA, mhs.FLOAT);
        this.a(a.aqY.toString().toLowerCase(), hc.aaP, lqf.saB);
        this.a(a.aqZ.toString().toLowerCase(), hc.aaP, lqf.saC);
        this.a(a.ara.toString().toLowerCase(), hc.aaP, lqf.saD);
        this.a(a.arb.toString().toLowerCase(), hc.aaP, lqf.saE, mhs.INTEGER);
        this.a(a.arc.toString().toLowerCase(), hc.aaP, lqf.saF, mhs.STRING, mhs.FLOAT);
        this.a(a.ard.toString().toLowerCase(), hc.aaP, lqf.saG, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bC(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case are: {
                this.bl(jj2);
                break;
            }
            case arf: {
                this.a(jj2, 0, false);
                break;
            }
            case arg: {
                this.bj(jj2);
                break;
            }
            case arh: {
                this.bk(jj2);
                break;
            }
            case aqQ: {
                this.bm(jj2);
                break;
            }
            case aqR: {
                this.b(jj2, 6, false);
                break;
            }
            case aqS: {
                this.b(jj2, 6, true);
                break;
            }
            case aqT: {
                this.b(jj2, 7, false);
                break;
            }
            case aqU: {
                this.b(jj2, 7, true);
                break;
            }
            case aqV: {
                this.a(jj2, 2, false);
                break;
            }
            case aqW: {
                this.a(jj2, 1, false);
                break;
            }
            case aqX: {
                this.a(jj2, 1, true);
                break;
            }
            case aqY: {
                this.bn(jj2);
                break;
            }
            case aqZ: {
                this.bo(jj2);
                break;
            }
            case ara: {
                this.bp(jj2);
                break;
            }
            case arc: {
                this.br(jj2);
                break;
            }
            case ard: {
                this.bs(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bC(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void bj(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "addSkillToPlayer() SkillName '" + string + "' is invalid.");
            return;
        }
        if (!lea.eob().contains(n)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), this.nW().getGUID());
        ern2.ilu = 14;
        ern2.YL = ((mhr)jj2.cA((int)1)).Value;
        ern2.izF = string;
        this.MessageDelegator.E(ern2);
        jj2.nT();
    }

    private void bk(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), this.nW().getGUID());
        ern2.ilu = 15;
        ern2.YL = ((mhr)jj2.cA((int)2)).Value;
        ern2.izF = ((mhr)jj2.cA((int)0)).Value;
        ern2.izH = ((mhn)jj2.cA((int)1)).Pz;
        this.MessageDelegator.E(ern2);
        jj2.nT();
    }

    private void bl(jj jj2) {
        List<dct> list;
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "addSkill() SkillName '" + string + "' is invalid.");
            return;
        }
        float f = 1.0f;
        if (jj2.getArgCount() == 2) {
            f = ((mhn)jj2.cA((int)1)).Pz;
        }
        if ((list = this.a(string, f)).isEmpty()) {
            return;
        }
        dct[] dctArray = list.toArray(new dct[list.size()]);
        fdl fdl2 = (fdl)this.MessageDelegator.h(9235, this.GUID, jj2.getTargetObjectGUID().bFk());
        fdl2.bst = bkd.dqQ;
        fdl2.aZG = jj2.getTargetObjectGUID();
        fdl2.akX = jj2.getTargetObjectGUID();
        fdl2.dvs = dctArray;
        fdl2.iJX = true;
        this.MessageDelegator.E(fdl2);
        jj2.nT();
    }

    private void a(jj jj2, int n, boolean bl) {
        String string;
        int n2 = 0;
        if (!bl && (n2 = this.aqN.getType(string = ((mhr)jj2.cA((int)0)).Value)) <= 0) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "setLevel() SkillName '" + string + "' is invalid.");
            return;
        }
        float f = 1.0f;
        if (n == 0) {
            if (jj2.getArgCount() == 2) {
                f = ((mhn)jj2.cA((int)1)).Pz;
            }
        } else if (n == 2) {
            f = 100.0f;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, jj2.getTargetObjectGUID());
        giy2.aZF = 8;
        giy2.SkillType = n2;
        giy2.SkillLevel = f;
        this.MessageDelegator.E(giy2);
        jj2.nT();
    }

    private List<dct> a(String string, float f) {
        assert (string != null);
        assert (f >= 1.0f);
        ArrayList<dct> arrayList = lcn.emv();
        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), ";");
        String string2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String string3 = stringTokenizer.nextToken().trim();
            dct dct2 = new dct();
            int n = string3.indexOf(58);
            if (n < 0) {
                string2 = string3;
                dct2.SkillLevel = f;
            } else {
                string2 = string3.substring(0, n);
                String string4 = string3.substring(n + 1, string3.length());
                dct2.SkillLevel = this.bD(string4);
            }
            if (string2 != null && string2.startsWith("*")) {
                string2 = string2.replace("*", "");
                this.aqO.a(string2, dct2.SkillLevel, arrayList);
                continue;
            }
            dct2.SkillType = this.aqN.getType(string2);
            if (dct2.SkillType < 0) {
                lfn.b(5, "SFConsoleCommandHandlerSkill", "createSkillItems() SkillName '" + string2 + "' is invalid.");
                continue;
            }
            this.aqO.a(dct2.SkillType, dct2.SkillLevel, arrayList);
        }
        return arrayList;
    }

    private float bD(String string) {
        try {
            float f = Float.parseFloat(string);
            if (f < 1.0f || f > 100.0f) {
                lfn.b(5, "SFConsoleCommandHandlerSkill", "parseSkillLevelString() SkillLevelString '" + string + "' is invalid.");
                return 1.0f;
            }
            return f;
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "parseSkillLevelString() " + numberFormatException);
            return 1.0f;
        }
    }

    private void bm(jj jj2) {
        String string;
        List<dct> list;
        float f = 1.0f;
        if (jj2.getArgCount() > 0) {
            f = ((mhn)jj2.cA((int)0)).Pz;
        }
        if ((list = this.a(string = this.aqN.eqq().getName(), f)).isEmpty()) {
            return;
        }
        dct[] dctArray = list.toArray(new dct[list.size()]);
        fdl fdl2 = (fdl)this.MessageDelegator.h(9235, this.GUID, jj2.getTargetObjectGUID().bFk());
        fdl2.bst = bkd.dqQ;
        fdl2.aZG = jj2.getTargetObjectGUID();
        fdl2.akX = jj2.getTargetObjectGUID();
        fdl2.dvs = dctArray;
        fdl2.iJX = true;
        this.MessageDelegator.E(fdl2);
        jj2.nT();
    }

    private void b(jj jj2, int n, boolean bl) {
        Object object;
        int n2 = 0;
        if (!bl && (n2 = this.aqN.getType((String)(object = ((mhr)jj2.cA((int)0)).Value))) <= 0) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "setAlwaysFail() SkillName '" + (String)object + "' is invalid.");
            return;
        }
        object = (giy)this.MessageDelegator.h(4624, this.GUID, jj2.getTargetObjectGUID());
        ((giy)object).aZF = n;
        ((giy)object).SkillType = n2;
        this.MessageDelegator.E((dxq)object);
        jj2.nT();
    }

    private void bn(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.nX());
        giy2.aZF = 4;
        this.MessageDelegator.E(giy2);
        giy giy3 = (giy)this.MessageDelegator.h(4624, this.GUID, this.nW().getGUID());
        giy3.aZF = 4;
        this.MessageDelegator.E(giy3);
        jj2.nT();
    }

    private void bo(jj jj2) {
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, jj2.getTargetObjectGUID());
        giy2.aZF = 3;
        this.MessageDelegator.E(giy2);
        jj2.nT();
    }

    private void bp(jj jj2) {
        erc erc2 = (erc)this.MessageDelegator.h(16641, this.GUID, jj2.getTargetObjectGUID());
        erc2.ixE = 13;
        this.MessageDelegator.F(erc2);
        jj2.nT();
    }

    private void bq(jj jj2) {
        int n = ((mho)jj2.cA((int)0)).PC;
        if (n <= 0 || n > 5) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "setPowerGroupForAll() PowerGroup is invalid.");
            return;
        }
        float f = cxi.yd(n);
        if (f <= 0.0f) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "setPowerGroupForAll() Invalid powergroup provided: " + n);
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, jj2.getTargetObjectGUID());
        giy2.aZF = 9;
        giy2.SkillLevel = f;
        this.MessageDelegator.E(giy2);
        jj2.nT();
    }

    private void br(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "setSynchronizedStateChangeValue() SkillName '" + string + "' is invalid.");
            return;
        }
        float f = ((mhn)jj2.cA((int)1)).Pz;
        if (f < 0.0f || f > 1.0f) {
            lfn.b(5, "SFConsoleCommandHandlerSkill", "setSynchronizedStateChangeValue() SynchronizedStateChangeValue is invalid.");
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, jj2.getTargetObjectGUID());
        giy2.aZF = 10;
        giy2.SkillType = n;
        giy2.jiU = f;
        this.MessageDelegator.E(giy2);
        jj2.nT();
    }

    private void bs(jj jj2) {
        gkc gkc2 = (gkc)this.MessageDelegator.h(4635, this.GUID, jj2.getTargetObjectGUID());
        gkc2.mi(true);
        gkc2.k(false);
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (!gkc2.p(string, true)) {
            return;
        }
        this.MessageDelegator.E(gkc2);
        jj2.nT();
    }
}

