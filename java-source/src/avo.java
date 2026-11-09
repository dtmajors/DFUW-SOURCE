/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  dtn
 *  lcr
 *  lcy
 */
import java.util.StringTokenizer;

public class avo
extends aul {
    private static final int cou = 0;
    private static final int cov = 1;
    private static final int cow = 2;
    private static final int cox = 3;
    private static final egg[] coy = new egg[]{new egg("firstname", egg.a.ipq, false, lcy.qTJ), new egg("surname", egg.a.ipq, false, lcy.qTK), new egg("text", egg.a.ipr, false, lcy.qTL)};
    private static final egg[] coz = new egg[]{new egg("text", egg.a.ipr, false, lcy.qTU)};
    private static final egg[] coA = new egg[]{new egg("text", egg.a.ipr, false, lcy.qTU)};
    private static final egg[] coB = new egg[]{new egg("text", egg.a.ipr, false, lcy.qTY)};
    private static final egg[] coC = new egg[]{new egg("text", egg.a.ipr, false, lcy.qTU)};
    private static final egg[] coD = new egg[]{new egg("text", egg.a.ipr, false, lcy.qTU)};
    private static final egg[] coE = new egg[]{new egg("node", egg.a.ipn, false, lcy.qUf), new egg("text", egg.a.ipr, false, lcy.qUe)};
    private static final egg[] coF = new egg[]{new egg("text", egg.a.ipr, false, lcy.qUi)};
    private static final egg[] coG = new egg[]{new egg("text", egg.a.ipr, false, lcy.qUk)};
    private static final egg[] coH = new egg[]{new egg("nick", egg.a.ipq, false, lcy.qUm), new egg("reason", egg.a.ipq, false, lcy.qUn), new egg("type", egg.a.ipq, true, lcy.qUo)};
    private static final egg[] coI = new egg[]{new egg("nick", egg.a.ipq, false, lcy.qUq)};
    private static final egg[] coJ = new egg[0];
    private static final egg[] coK = new egg[]{new egg("text", egg.a.ipq, false, lcy.qUt)};
    private static final egg[] coL = new egg[]{new egg("id", egg.a.ipn, false, lcy.qUv)};
    private static final egg[] coM = new egg[0];
    private static final egg[] coN = new egg[]{new egg("teamcommandtype", egg.a.ipq, false, lcy.qUy), new egg("param_value1", egg.a.ipq, true, lcy.qUz), new egg("param_value2", egg.a.ipq, true, lcy.qUA)};
    private static final cqi[] bui = new cqi[]{new cqo(hc.aaP, 0, "n_client_to_server_updaterate", false, new lei(25), 1, 25, lcy.qUB), new cqo(hc.aaP, 1, "n_server_to_client_updaterate", false, new lei(25), 1, 25, lcy.qUC), new cqj(hc.aaP, 2, "n_additive_updatecheck", false, new lch(false), lcy.qUD), new cqo(hc.aaP, 3, "n_subscriber_updaterate", false, new lei(25), 1, 25, lcy.qUE)};
    private static final egg[] cdv = new egg[0];
    private static final egg[] coO = new egg[]{new egg("d_number", egg.a.ipq, true, lcy.qUN)};
    private boolean Initialized = false;
    private ldv cdD = null;
    private avw coP = null;
    private lif coQ = new lif(10.0, 1.0, true);
    private dtn coR = null;

    public avo() {
        super(new amd(avo.class, aul.cdc, "ChatProxyForServer", bui, null));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            case 2326: {
                this.a((ehv)dxq2);
                break;
            }
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaz, a.coT.ordinal(), "msg", lcy.qTI, coy);
        this.a(hc.aaz, a.coU.ordinal(), "say", lcy.qTT, coz);
        this.a(hc.aaQ, a.cpa.ordinal(), "say_gm", lcy.qTM, coz);
        this.a(hc.aaV, a.cpb.ordinal(), "say_mgm", lcy.qTN, coz);
        this.a(hc.aaP, a.cpc.ordinal(), "say_admin", lcy.qTO, coz);
        this.a(hc.aaz, a.coV.ordinal(), "say_clan", lcy.qTV, coA);
        this.a(hc.aaz, a.coW.ordinal(), "say_clan_officers", lcy.qTX, coB);
        this.a(hc.aaz, a.coX.ordinal(), "say_party", lcy.qTZ, coC);
        this.a(hc.aaS, a.coY.ordinal(), "say_global", lcy.qUb, coD);
        this.a(hc.aaP, a.coZ.ordinal(), "say_node", lcy.qUd, coE);
        this.a(hc.aaz, a.cpd.ordinal(), "gm_help", lcy.qUh, coF);
        this.a(hc.aaz, a.cpe.ordinal(), "gm_report", lcy.qUj, coG);
        this.a(hc.aaz, a.cpf.ordinal(), "ignore", lcy.qUl, coH);
        this.a(hc.aaz, a.cpg.ordinal(), "unignore", lcy.qUp, coI);
        this.a(hc.aaz, a.cph.ordinal(), "ignorelist", lcy.qUr, coJ);
        this.a(hc.aaz, a.cpi.ordinal(), "annotation_add", lcy.qUs, coK);
        this.a(hc.aaz, a.cpj.ordinal(), "annotation_remove", lcy.qUu, coL);
        this.a(hc.aaz, a.cpk.ordinal(), "annotation_list", lcy.qUw, coM);
        this.a(hc.aaP, a.cpx.ordinal(), "team", lcy.qUx, coN);
        this.a(hc.aaz, a.cpl.ordinal(), "say_race", lcy.qTP, coz);
        this.a(hc.aaz, a.cpm.ordinal(), "say_alliance", lcy.qTQ, coz);
        this.a(hc.aaz, a.cpn.ordinal(), "say_clan_alliance", lcy.qTR, coz);
        this.a(hc.aaz, a.cpv.ordinal(), "say_trade", lcy.qTS, coz);
        this.a(hc.aaz, a.cpu.ordinal(), "tell", lcy.qTI, coy);
        this.a(hc.aaz, a.cpo.ordinal(), "clan", lcy.qTV, coA);
        this.a(hc.aaz, a.cpp.ordinal(), "officers", lcy.qTX, coB);
        this.a(hc.aaz, a.cpq.ordinal(), "party", lcy.qTZ, coC);
        this.a(hc.aaz, a.cpr.ordinal(), "race", lcy.qTP, coz);
        this.a(hc.aaz, a.cps.ordinal(), "alliance", lcy.qTQ, coz);
        this.a(hc.aaz, a.cpt.ordinal(), "calliance", lcy.qTR, coz);
        this.a(hc.aaz, a.cpw.ordinal(), "trade", lcy.qTS, coz);
        this.a(hc.aaz, a.cpA.ordinal(), "roll", lcy.qUK, coO);
        this.a(hc.aaz, a.cpB.ordinal(), "roll_clan", lcy.qUL, coO);
        this.a(hc.aaz, a.cpC.ordinal(), "roll_party", lcy.qUM, coO);
        this.a(hc.aaP, a.cpy.ordinal(), "spamchat", new ljk("chat spam"), new egg[]{new egg("message", egg.a.ipr, false, new ljk("text"))});
        if (aud.cai) {
            this.a(hc.aaz, a.cpD.ordinal(), "say_chaos", lcy.qUg, coz);
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
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.cdD == null) {
            return;
        }
        a[] aArray = (a[])a.class.getEnumConstants();
        a a2 = aArray[n];
        switch (a2) {
            case coT: 
            case cpu: {
                assert (objectArray.length == 3);
                this.b((String)objectArray[0] + " " + (String)objectArray[1], (String)objectArray[2], string);
                return;
            }
            case coU: {
                assert (objectArray.length == 1);
                this.a(aud.a.car, (String)objectArray[0]);
                return;
            }
            case cpa: {
                assert (objectArray.length == 1);
                this.a(aud.a.caw, (String)objectArray[0]);
                return;
            }
            case cpd: {
                assert (objectArray.length == 1);
                this.eu((String)objectArray[0]);
                return;
            }
            case cpe: {
                assert (objectArray.length == 1);
                this.ev((String)objectArray[0]);
                return;
            }
            case cpb: {
                assert (objectArray.length == 1);
                this.a(aud.a.cay, (String)objectArray[0]);
                return;
            }
            case cpc: {
                assert (objectArray.length == 1);
                this.a(aud.a.caz, (String)objectArray[0]);
                return;
            }
            case cpl: 
            case cpr: {
                assert (objectArray.length == 1);
                this.a(aud.a.caA, (String)objectArray[0]);
                return;
            }
            case cpm: 
            case cps: {
                assert (objectArray.length == 1);
                this.a(aud.a.caB, (String)objectArray[0]);
                return;
            }
            case cpv: 
            case cpw: {
                assert (objectArray.length == 1);
                this.a(aud.a.caG, (String)objectArray[0]);
                return;
            }
            case cpn: 
            case cpt: {
                assert (objectArray.length == 1);
                this.a(aud.a.caC, (String)objectArray[0]);
                return;
            }
            case coV: 
            case cpo: {
                assert (objectArray.length == 1);
                this.a(aud.a.cat, (String)objectArray[0]);
                return;
            }
            case coW: 
            case cpp: {
                assert (objectArray.length == 1);
                this.a(aud.a.cau, (String)objectArray[0]);
                return;
            }
            case coX: 
            case cpq: {
                assert (objectArray.length == 1);
                this.a(aud.a.cav, (String)objectArray[0]);
                return;
            }
            case coY: {
                assert (objectArray.length == 1);
                this.a(aud.a.cap, (String)objectArray[0]);
                return;
            }
            case coZ: {
                assert (objectArray.length == 2);
                this.h(((lei)objectArray[0]).intValue(), (String)objectArray[1]);
                return;
            }
            case cpD: {
                this.a(aud.a.caJ, (String)objectArray[0]);
                return;
            }
            case cpf: {
                if (objectArray.length < 3) {
                    this.c((String)objectArray[0], (String)objectArray[1], "public,private");
                } else {
                    this.c((String)objectArray[0], (String)objectArray[1], (String)objectArray[2]);
                }
                return;
            }
            case cpg: {
                this.ew((String)objectArray[0]);
                return;
            }
            case cph: {
                this.Xc();
                return;
            }
            case cpx: {
                if (objectArray.length == 1) {
                    this.a(2, new String[]{(String)objectArray[0]});
                } else if (objectArray.length == 2) {
                    this.a(2, new String[]{(String)objectArray[0], (String)objectArray[1]});
                } else if (objectArray.length == 3) {
                    this.a(2, new String[]{(String)objectArray[0], (String)objectArray[1], (String)objectArray[2]});
                }
                return;
            }
            case cpi: {
                this.es((String)objectArray[0]);
                return;
            }
            case cpk: {
                this.Xb();
                return;
            }
            case cpj: {
                this.b((lei)objectArray[0]);
                return;
            }
            case cpy: {
                this.et((String)objectArray[0]);
                break;
            }
            case cpA: {
                this.a(aud.a.cas, objectArray);
                break;
            }
            case cpB: {
                this.a(aud.a.cat, objectArray);
                break;
            }
            case cpC: {
                this.a(aud.a.cav, objectArray);
                break;
            }
            default: {
                super.b(n, objectArray, string);
            }
        }
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            case 0: {
                int n2 = ((lei)this.gG(0)).intValue();
                if (n2 <= 0) {
                    return;
                }
                gsn gsn2 = (gsn)this.MessageDelegator.h(11032, this.GUID, lcr.qBU);
                gsn2.KA(1);
                gsn2.cJ(1.0 / (double)n2);
                this.MessageDelegator.F(gsn2);
                return;
            }
            case 1: {
                int n3 = ((lei)this.gG(1)).intValue();
                if (n3 <= 0) {
                    return;
                }
                gsn gsn3 = (gsn)this.MessageDelegator.h(11032, this.GUID, lcr.qAJ);
                gsn3.KA(1);
                gsn3.cJ(1.0 / (double)n3);
                this.MessageDelegator.F(gsn3);
                return;
            }
            case 2: {
                boolean bl = ((lch)this.gG(2)).booleanValue();
                gsn gsn4 = (gsn)this.MessageDelegator.h(11032, this.GUID, lcr.qAJ);
                gsn4.KA(2);
                gsn4.mm(bl);
                this.MessageDelegator.F(gsn4);
                return;
            }
            case 3: {
                int n4 = ((lei)this.gG(3)).intValue();
                gsn gsn5 = (gsn)this.MessageDelegator.h(11032, this.GUID, lcr.qAJ);
                gsn5.KA(4);
                gsn5.KB(1 / n4);
                this.MessageDelegator.F(gsn5);
                return;
            }
        }
        super.b(n, object);
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void a(int n, String[] stringArray) {
        erz erz2 = (erz)this.e(16653, lcr.dMN);
        erz2.iAU = n;
        erz2.iBe = stringArray;
        this.a(erz2);
    }

    protected dtn Xa() {
        return (dtn)this.MessageDelegator.bzx().bzt().od(lcr.qzp);
    }

    private void es(String string) {
        jpx jpx2 = (jpx)this.Xa().d(lcr.qBQ);
        if (jpx2.dQf().axF().aAG().av() == null) {
            lfn.b(5, "SFChatProxyForServer", "handleCommandAnnotationAdd(): No player position");
            return;
        }
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.Xa().bAn().gYX);
        eaa2.ResourceType = cug.fqd;
        eaa2.aFo = string;
        eaa2.aFp = true;
        eaa2.Position = jpx2.dQf().axF().aAG().av().esF();
        this.MessageDelegator.F(eaa2);
    }

    private void Xb() {
        eab eab2 = (eab)this.MessageDelegator.h(22787, this.getGUID(), this.Xa().bAn().gYX);
        eab2.ikr = false;
        this.MessageDelegator.F(eab2);
    }

    private void b(lei lei2) {
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), this.Xa().bAn().gYX);
        eae2.iks = lei2.intValue();
        this.MessageDelegator.F(eae2);
    }

    private void et(String string) {
        if (this.coP == null) {
            this.coP = new avw(string);
            this.coP.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.coP);
        } else {
            this.MessageDelegator.hd(this.coP.getGUID());
            this.coP = null;
        }
    }

    private void a(eaf eaf2) {
        switch (eaf2.ex) {
            case 2: {
                this.h(mab.tZI.bD(eaf2.Zn[0].ID, eaf2.Zn[0].aFo));
                break;
            }
            case 4: {
                this.h(mab.tZL.bD(new Object[0]));
                break;
            }
            case 1: {
                this.h(mab.tZM.bD(eaf2.Zn.length));
                for (int i = 0; i < eaf2.Zn.length; ++i) {
                    this.h(mab.tZN.bD(eaf2.Zn[i].ID, eaf2.Zn[i].aFo, eaf2.Zn[i].Position));
                }
                break;
            }
            case 5: {
                this.h(mab.tZK.bD(new Object[0]));
                break;
            }
            case 3: {
                this.h(mab.tZJ.bD(eaf2.Zn[0].ID));
            }
        }
    }

    private void b(String string, String string2, String string3) {
        if (this.coQ.el(1.0)) {
            ehw ehw2 = (ehw)this.e(2316, lcr.qAL);
            ehw2.ipK = aud.a.cas.ordinal();
            ehw2.ipM = string;
            ehw2.ipN = string2;
            this.a(ehw2);
        } else {
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
            fgs2.r(maf.ChatSpam.bD(new Object[0]));
            this.MessageDelegator.F(fgs2);
        }
    }

    private void a(aud.a a2, String string) {
        if (this.coQ.el(1.0)) {
            ehw ehw2 = (ehw)this.e(2316, lcr.qAL);
            ehw2.ipK = a2.ordinal();
            ehw2.ipN = string;
            this.a(ehw2);
        } else {
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
            fgs2.r(maf.ChatSpam.bD(new Object[0]));
            this.MessageDelegator.F(fgs2);
        }
    }

    private void eu(String string) {
        ehw ehw2 = (ehw)this.e(2316, lcr.qAL);
        ehw2.ipK = aud.a.cax.ordinal();
        ehw2.ipN = string;
        this.a(ehw2);
    }

    private void ev(String string) {
        ehw ehw2 = (ehw)this.e(2316, lcr.qAL);
        ehw2.ipK = aud.a.caF.ordinal();
        ehw2.ipN = string;
        this.a(ehw2);
    }

    private void h(int n, String string) {
        if (this.coQ.el(1.0)) {
            ehw ehw2 = (ehw)this.e(2316, lcr.qAL);
            ehw2.ipM = "" + n;
            ehw2.ipK = aud.a.caq.ordinal();
            ehw2.ipN = string;
            this.a(ehw2);
        } else {
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
            fgs2.r(maf.ChatSpam.bD(new Object[0]));
            this.MessageDelegator.F(fgs2);
        }
    }

    private void c(String string, String string2, String string3) {
        ehu ehu2 = (ehu)this.e(2325, lcr.qAL);
        ehu2.iqJ = new aug();
        ehu2.iqJ.SB = string;
        ehu2.iqJ.cbX = string2;
        ehu2.ed = 1;
        StringTokenizer stringTokenizer = new StringTokenizer(string3, ",", false);
        while (stringTokenizer.hasMoreTokens()) {
            String string4 = stringTokenizer.nextToken();
            if (string4.equalsIgnoreCase("public")) {
                ehu2.iqJ.cbW |= 2;
                continue;
            }
            if (string4.equalsIgnoreCase("private")) {
                ehu2.iqJ.cbW |= 1;
                continue;
            }
            this.h(maf.IgnoreListInvalidType.bD(string4));
            return;
        }
        this.MessageDelegator.E(ehu2);
    }

    private void ew(String string) {
        ehu ehu2 = (ehu)this.e(2325, lcr.qAL);
        ehu2.iqJ = new aug();
        ehu2.iqJ.SB = string;
        ehu2.ed = 2;
        this.MessageDelegator.E(ehu2);
    }

    private void Xc() {
        ehu ehu2 = (ehu)this.e(2325, lcr.qAL);
        ehu2.iqJ = new aug();
        ehu2.ed = 0;
        this.MessageDelegator.E(ehu2);
    }

    private void a(ehv ehv2) {
        switch (ehv2.ex) {
            case 0: {
                if (ehv2.ipC == null || ehv2.ipC.length == 0) {
                    this.h(maf.IgnoreListEmpty.bD(new Object[0]));
                    return;
                }
                this.h(maf.IgnoreListHeader.bD(ehv2.ipC.length));
                for (int i = 0; i < ehv2.ipC.length; ++i) {
                    this.h(maf.IgnoreListEntry.bD(aug.ie(ehv2.ipC[i].cbW), ehv2.ipC[i].SB, ehv2.ipC[i].cbX));
                }
                break;
            }
            case 2: {
                assert (ehv2.ipC != null);
                assert (ehv2.ipC.length == 1);
                this.h(maf.IgnoreListEntryAdded.bD(aug.ie(ehv2.ipC[0].cbW), ehv2.ipC[0].SB, ehv2.ipC[0].cbX));
                break;
            }
            case 3: {
                assert (ehv2.ipC != null);
                assert (ehv2.ipC.length == 1);
                this.h(maf.IgnoreListEntryRemoved.bD(ehv2.ipC[0].SB));
                break;
            }
            case 1: {
                assert (ehv2.ipC != null);
                assert (ehv2.ipC.length == 1);
                this.h(maf.IgnoreListEntryUpdated.bD(aug.ie(ehv2.ipC[0].cbW), ehv2.ipC[0].SB, ehv2.ipC[0].cbX));
                break;
            }
            case 4: {
                this.h(maf.IgnoreListFull.bD(new Object[0]));
                break;
            }
            case 5: {
                assert (ehv2.ipC != null);
                assert (ehv2.ipC.length == 1);
                this.h(maf.IgnoreListEntryNotFound.bD(ehv2.ipC[0].SB));
                break;
            }
            case 6: {
                assert (ehv2.ipC != null);
                assert (ehv2.ipC.length == 1);
                this.h(maf.IgnoreListNameNotFound.bD(ehv2.ipC[0].SB));
                break;
            }
        }
    }

    private void a(egk egk2) {
        if (egk2.cdD == null) {
            return;
        }
        this.cdD = egk2.cdD;
    }

    private void a(aud.a a2, Object[] objectArray) {
        Object object;
        int n = 6;
        if (objectArray != null && objectArray.length > 0) {
            object = (String)objectArray[0];
            if (!((String)object).startsWith("D") && !((String)object).startsWith("d")) {
                this.h(maf.RollCommandInvalidParameters.bD(new Object[0]));
                return;
            }
            try {
                n = Integer.parseInt(((String)object).substring(1));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            if (n < 2 || n > 100) {
                this.h(maf.RollCommandInvalidParameters.bD(new Object[0]));
                return;
            }
        }
        if (this.coQ.el(1.0)) {
            float f2 = lgp.erA().nextFloat();
            int n2 = (int)(f2 * (float)n) + 1;
            lip[] lipArray = new lip[]{new lja(n2), new lja(n), new ljk("Player_Name")};
            if (a2 == aud.a.cas) {
                fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
                fgs2.r(maf.RollResultPersonal.bD(n, n2));
                this.MessageDelegator.F(fgs2);
            } else if (a2 == aud.a.cav) {
                fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, this.cdD);
                fgo2.r(maf.RollResultParty.bD("IF CHAT PROXIES ARE EVER USED AGAIN, THIS NEEDS FIXING!!!", n, n2));
                this.MessageDelegator.F(fgo2);
            } else if (a2 == aud.a.cat) {
                fgo fgo3 = (fgo)this.MessageDelegator.h(29447, this.GUID, this.cdD);
                fgo3.r(maf.RollResultClan.bD("IF CHAT PROXIES ARE EVER USED AGAIN, THIS NEEDS FIXING!!!", n, n2));
                this.MessageDelegator.F(fgo3);
            }
        } else {
            object = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
            ((fgn)object).r(maf.RollCommandSpam.bD(new Object[0]));
            this.MessageDelegator.F((dxq)object);
        }
    }
}

