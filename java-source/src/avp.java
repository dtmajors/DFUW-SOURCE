/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class avp
extends aul {
    private boolean Initialized = false;
    private ldv cea = null;
    private ldv cdD = null;
    private cxk aqO = new cxk();
    private les aqN = lea.enZ();

    public avp() {
        super(new amd(avp.class, aul.cdc, "ChatProxyAlignment", new cqi[0], null));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            case 2305: {
                dxq2.on(lcr.qCM);
                this.MessageDelegator.E(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.cdD == null) {
            return;
        }
        a[] aArray = (a[])a.class.getEnumConstants();
        a a2 = aArray[n];
        switch (a2) {
            case cpG: {
                this.aT(objectArray);
                break;
            }
            case cpH: {
                this.aU(objectArray);
                break;
            }
            case cpI: {
                this.aV(objectArray);
                break;
            }
            case cpJ: {
                this.aS(objectArray);
                break;
            }
            case cpK: {
                this.aX(objectArray);
                break;
            }
            case cpL: {
                this.Xf();
                break;
            }
            case cpM: {
                this.aY(objectArray);
                break;
            }
            case cpN: {
                this.Xg();
                break;
            }
            case cpO: {
                this.aW(objectArray);
                break;
            }
            case cpP: {
                this.Xe();
                break;
            }
            case cpQ: {
                this.Xd();
                break;
            }
            case cpR: {
                this.aZ(objectArray);
                break;
            }
            case cpS: {
                this.ba(objectArray);
                break;
            }
            case cpT: {
                this.bb(objectArray);
                break;
            }
            case cpU: {
                this.bc(objectArray);
                break;
            }
            case cpV: {
                this.bd(objectArray);
                break;
            }
            case cpW: {
                this.be(objectArray);
                break;
            }
            case cpX: {
                this.Xh();
                break;
            }
            case cpY: {
                this.bf(objectArray);
                break;
            }
            case cpZ: {
                this.bg(objectArray);
                break;
            }
            default: {
                super.b(n, objectArray, string);
            }
        }
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaV, a.cpG, new ljk("adds the specified skill to a player"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill")), new egg("player_name", egg.a.ipr, false, new ljk("the name of a character"))});
        this.a(hc.aaV, a.cpH, new ljk("sets the level of the specified skill"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill")), new egg("skill_level", egg.a.ipp, false, new ljk("the level of the skill")), new egg("player_name", egg.a.ipr, false, new ljk("the name of a character"))});
        this.a(hc.aaQ, a.cpI, new ljk("adds the specified skill"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill")), new egg("skill_level", egg.a.ipp, true, new ljk("the level of the skill"))});
        this.a(hc.aaP, a.cpJ, new ljk("adds all the skills the player does not have"), new egg[]{new egg("skill_level", egg.a.ipp, true, new ljk("the level of the skills"))});
        this.a(hc.aaP, a.cpK, new ljk("configures the specified skill to always fail"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill"))});
        this.a(hc.aaP, a.cpL, new ljk("configures all the skills to always fail"), new egg[0]);
        this.a(hc.aaP, a.cpM, new ljk("configures the specified skill to always succeed"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill"))});
        this.a(hc.aaP, a.cpN, new ljk("configures all the skills to always succeed"), new egg[0]);
        this.a(hc.aaP, a.cpO, new ljk("prints the level of the specified skill"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill"))});
        this.a(hc.aaP, a.cpP, new ljk("removes all the cooldown timers created for the specified skill"), new egg[0]);
        this.a(hc.aaP, a.cpQ, new ljk("removes all the rules set making skills either fail or succeed"), new egg[0]);
        this.a(hc.aaQ, a.cpR, new ljk("sets the level of the specified skill"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill")), new egg("skill_level", egg.a.ipp, false, new ljk("the level of the skill"))});
        this.a(hc.aaP, a.cpS, new ljk("sets the level of all the skills"), new egg[]{new egg("skill_level", egg.a.ipp, false, new ljk("the level of the skills"))});
        this.a(hc.aaP, a.cpT, new ljk("sets the level of the specified skill to its max level"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill"))});
        this.a(hc.aaP, a.cpU, new ljk("sets the level of the specified skill to its min level"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the name of the skill"))});
        this.a(hc.aaP, a.cpV, new ljk("sets the power group and then indirectly the level for all the skills"), new egg[]{new egg("power group", egg.a.ipn, false, new ljk("the power group from which the new level is computed"))});
        this.a(hc.aaP, a.cpW, new ljk("sets the synchronized state change value for a specified skill"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the skill to modify")), new egg("state_change_value", egg.a.ipp, false, new ljk("the new synchronized state change value"))});
        this.a(hc.aaP, a.cpX, new ljk("stops all the skills currently running"), new egg[0]);
        this.a(hc.aaP, a.cpY, new ljk("prints the current value of the skill XP-gain modifier(s)"), new egg[]{new egg("modifier_category", egg.a.ipr, true, new ljk("the modifier category, or categories, to print the value of"))});
        this.a(hc.aaP, a.cpZ, new ljk("sets the value of the skill XP-gain modifiers(s)"), new egg[]{new egg("modifier_category_and_value", egg.a.ipr, false, new ljk("the category and value of the modifier(s) to set, in the format <Category>:<Value>, multiple categories can be set at the same time by using ';' to separate entries!"))});
    }

    private List<dct> a(String string, float f2) {
        assert (string != null);
        assert (f2 >= 1.0f);
        ArrayList<dct> arrayList = lcn.emv();
        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), ";");
        String string2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String string3 = stringTokenizer.nextToken().trim();
            dct dct2 = new dct();
            int n = string3.indexOf(58);
            if (n < 0) {
                string2 = string3;
                dct2.SkillLevel = f2;
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
                lfn.b(5, "SFChatProxyForSkill", "createSkillItems() SkillName '" + string2 + "' is invalid.");
                continue;
            }
            this.aqO.a(dct2.SkillType, dct2.SkillLevel, arrayList);
        }
        return arrayList;
    }

    private ldv cd(boolean bl) {
        if (bl) {
            return this.cdD;
        }
        bun bun2 = (bun)this.MessageDelegator.bzx().bzt().d(lcr.qBP);
        ldv ldv2 = bun2.axO();
        if (ldv2 == null) {
            return null;
        }
        return lcr.ak((ldv)ldv2, (int)this.cdD.ib());
    }

    private void a(egk egk2) {
        if (egk2.cdD == null) {
            lfn.b(5, "SFChatProxyForSkill", "handleChatGUIDInfoMessage() PlayerObjectServerGUID is null.");
            return;
        }
        this.cea = lcr.ak((ldv)egk2.cdD, (int)this.GUID.ib());
        this.cdD = egk2.cdD;
    }

    private float bD(String string) {
        try {
            float f2 = Float.parseFloat(string);
            if (f2 < 1.0f || f2 > 100.0f) {
                lfn.b(5, "SFChatProxyForSkill", "parseSkillLevelString() SkillLevelString '" + string + "' is invalid.");
                return 1.0f;
            }
            return f2;
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFChatProxyForSkill", "parseSkillLevelString() " + numberFormatException);
            return 1.0f;
        }
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void aS(Object[] objectArray) {
        String string;
        List<dct> list;
        float f2 = 1.0f;
        if (objectArray.length > 0) {
            try {
                f2 = ((ldq)objectArray[0]).floatValue();
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, "SFChatProxyForSkill", "addAllSkills() " + numberFormatException);
                return;
            }
        }
        if ((list = this.a(string = this.aqN.eqq().getName(), f2)).isEmpty()) {
            return;
        }
        dct[] dctArray = list.toArray(new dct[list.size()]);
        fdl fdl2 = (fdl)this.MessageDelegator.h(9235, this.GUID, this.cdD.bFk());
        fdl2.bst = bkd.dqQ;
        fdl2.aZG = this.cdD;
        fdl2.akX = this.cdD;
        fdl2.dvs = dctArray;
        fdl2.iJX = true;
        this.d(this.cdD, fdl2);
    }

    private void aT(Object[] objectArray) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), this.cdD);
        ern2.ilu = 14;
        ern2.YL = (String)objectArray[1];
        ern2.izF = (String)objectArray[0];
        this.MessageDelegator.E(ern2);
    }

    private void aU(Object[] objectArray) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), this.cdD);
        ern2.ilu = 15;
        ern2.YL = (String)objectArray[2];
        ern2.izF = (String)objectArray[0];
        ern2.izH = ((ldq)objectArray[1]).floatValue();
        this.MessageDelegator.E(ern2);
    }

    private void aV(Object[] objectArray) {
        List<dct> list;
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "addSkill() SkillName '" + string + "' is invalid.");
            return;
        }
        float f2 = 1.0f;
        if (objectArray.length == 2) {
            try {
                f2 = ((ldq)objectArray[1]).floatValue();
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, "SFChatProxyForSkill", "addSkill() " + numberFormatException);
                return;
            }
        }
        if ((list = this.a(string, f2)).isEmpty()) {
            return;
        }
        dct[] dctArray = list.toArray(new dct[list.size()]);
        fdl fdl2 = (fdl)this.MessageDelegator.h(9235, this.GUID, this.cdD.bFk());
        fdl2.bst = bkd.dqQ;
        fdl2.aZG = this.cdD;
        fdl2.akX = this.cdD;
        fdl2.dvs = dctArray;
        fdl2.iJX = true;
        this.d(this.cdD, fdl2);
    }

    private void aW(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "printSkillLevel() SkillName '" + string + "' is invalid.");
            return;
        }
        gjp gjp2 = (gjp)this.MessageDelegator.h(4626, this.GUID, this.cdD);
        gjp2.SkillType = n;
        this.d(this.cdD, gjp2);
    }

    private void Xd() {
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 3;
        this.d(this.cdD, giy2);
    }

    private void Xe() {
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cea);
        giy2.aZF = 4;
        this.a(giy2);
        giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 4;
        this.d(this.cdD, giy2);
    }

    private void aX(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "setAlwaysFail() SkillName '" + string + "' is invalid.");
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 6;
        giy2.SkillType = n;
        this.d(this.cdD, giy2);
    }

    private void Xf() {
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 6;
        giy2.SkillType = 0;
        this.d(this.cdD, giy2);
    }

    private void aY(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "setAlwaysSucceed() SkillName '" + string + "' is invalid.");
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 7;
        giy2.SkillType = n;
        this.d(this.cdD, giy2);
    }

    private void Xg() {
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 7;
        giy2.SkillType = 0;
        this.d(this.cdD, giy2);
    }

    private void aZ(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "setLevel() SkillName '" + string + "' is invalid.");
            return;
        }
        float f2 = 1.0f;
        if (objectArray.length == 2) {
            try {
                f2 = ((ldq)objectArray[1]).floatValue();
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, "SFChatProxyForSkill", "setLevel() " + numberFormatException);
                return;
            }
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 8;
        giy2.SkillType = n;
        giy2.SkillLevel = f2;
        this.d(this.cdD, giy2);
    }

    private void ba(Object[] objectArray) {
        float f2 = 1.0f;
        try {
            f2 = ((ldq)objectArray[0]).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFChatProxyForSkill", "setLevelForAll() " + numberFormatException);
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 9;
        giy2.SkillLevel = f2;
        this.d(this.cdD, giy2);
    }

    private void bb(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "setMaxLevel() SkillName '" + string + "' is invalid.");
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 8;
        giy2.SkillType = n;
        giy2.SkillLevel = 100.0f;
        this.d(this.cdD, giy2);
    }

    private void bc(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "setMinLevel() SkillName '" + string + "' is invalid.");
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 8;
        giy2.SkillType = n;
        giy2.SkillLevel = 1.0f;
        this.d(this.cdD, giy2);
    }

    private void bd(Object[] objectArray) {
        int n = ((lei)objectArray[0]).intValue();
        if (n <= 0 || n > 5) {
            lfn.b(5, "SFChatProxyForSkill", "setPowerGroupForAll() PowerGroup is invalid.");
            return;
        }
        float f2 = cxi.yd(n);
        if (f2 <= 0.0f) {
            lfn.b(5, "SFChatProxyForSkill", "setPowerGroupForAll() Invalid powergroup provided: " + n);
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cdD);
        giy2.aZF = 9;
        giy2.SkillLevel = f2;
        this.d(this.cdD, giy2);
    }

    private void be(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForSkill", "setSynchronizedStateChangeValue() SkillName '" + string + "' is invalid.");
            return;
        }
        float f2 = ((ldq)objectArray[1]).floatValue();
        if (f2 < 0.0f || f2 > 1.0f) {
            lfn.b(5, "SFChatProxyForSkill", "setSynchronizedStateChangeValue() SynchronizedStateChangeValue is invalid.");
            return;
        }
        giy giy2 = (giy)this.MessageDelegator.h(4624, this.GUID, this.cea);
        giy2.aZF = 10;
        giy2.SkillType = n;
        giy2.jiU = f2;
        this.a(giy2);
    }

    private void Xh() {
        erc erc2 = (erc)this.MessageDelegator.h(16641, this.GUID, this.cdD);
        erc2.ixE = 13;
        this.MessageDelegator.F(erc2);
    }

    private void bf(Object[] objectArray) {
        gka gka2 = (gka)this.MessageDelegator.h(4633, this.GUID, this.cdD);
        gka2.mg(false);
        gka2.mh(false);
        gka2.mi(true);
        if (objectArray.length > 0) {
            if (!gka2.p((String)objectArray[0], true)) {
                this.h(lzp.tXq.bD(new Object[0]));
                return;
            }
        } else {
            gka2.a(cxn.values());
        }
        this.d(this.cdD, gka2);
    }

    private void bg(Object[] objectArray) {
        gkc gkc2 = (gkc)this.MessageDelegator.h(4635, this.GUID, this.cdD);
        gkc2.mi(true);
        gkc2.k(false);
        if (!gkc2.p((String)objectArray[0], true)) {
            this.h(lzp.tXw.bD(new Object[0]));
            return;
        }
        this.d(this.cdD, gkc2);
    }
}

