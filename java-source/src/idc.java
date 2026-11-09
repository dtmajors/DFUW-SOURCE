/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cxd
 *  hvj
 *  hzo
 *  lcr
 *  lcw
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFChatChannelInfoDTO;
import spenefett.hid.gui.serialization.dto.SFChatInfoDTO;

public class idc
extends btk
implements bto,
htt {
    private static final double lID = 5.0;
    public static final String lEx = "/";
    private static final double lIE = 0.5;
    private static final double lIF = 0.5;
    private static final int lIG = 1;
    private static final int lIH = 2;
    private static final int lII = 3;
    private static final int lIJ = 4;
    private static final int lIK = 5;
    private static final String lIL = "CONFIG_ENTRY_COMBAT_LOG_VISIBLE";
    private static final String lIM = "CONFIG_ENTRY_GLOBAL_CHANNEL_VISIBLE";
    private static final String lIN = "CONFIG_ENTRY_AREA_CHANNEL_VISIBLE";
    private static final String lIO = null;
    private static final String lIP = null;
    private static final String lIQ = "CONFIG_ENTRY_CLAN_CHANNEL_VISIBLE";
    private static final String lIR = "CONFIG_ENTRY_CLAN_ALLIANCE_CHANNEL_VISIBLE";
    private static final String lIS = "CONFIG_ENTRY_GLOBAL_JAPAN_CHANNEL_VISIBLE";
    private String lIT = null;
    private String lIU = null;
    private String lIV = null;
    private String lIW = null;
    private int lIX = 0;
    private int lIY = 0;
    private double lIZ = 0.0;
    private double lJa = 0.0;
    private boolean lJb = false;
    private Set<Integer> lJc = lcn.emz();
    private Map<Integer, SFChatChannelInfoDTO> lJd = lcn.emw();
    private Queue<String> lJe = lcn.emA();
    private Queue<lfs<String, Integer>> lJf = lcn.emA();
    private bbs lJg = bbs.NoRank;
    private idd lJh = idd.lJp;
    private SFChatInfoDTO lJi = new SFChatInfoDTO();
    private lfs<jmy, String> lJj = null;
    private double lJk = 0.0;
    private double lJl = 0.0;
    private final int lJm = 10;

    @Override
    public void initialize() {
        super.initialize();
        this.cOv();
        this.cOu();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2309: {
                this.b((egr)dxq2);
                break;
            }
            case 17922: {
                this.c((fwp)dxq2);
                break;
            }
            case 26885: {
                this.a((fvd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        double d2 = ldz2.rgz;
        if (this.lJe.size() > 0 && d2 > this.lIZ + 0.5) {
            this.pM(this.lJe.remove());
            this.lIZ = d2;
        }
        if (this.lJf.size() > 0 && d2 > this.lJa + 0.5) {
            lfs<String, Integer> lfs2 = this.lJf.remove();
            this.D((String)lfs2.reX, (Integer)lfs2.reY);
            this.lJa = d2;
        }
    }

    public boolean cOd() {
        return this.lJb;
    }

    public void pP(boolean bl) {
        this.lJb = bl;
    }

    public bbs cOe() {
        return this.lJg;
    }

    public void g(bbs bbs2) {
        this.lJg = bbs2 == null ? bbs.NoRank : bbs2;
    }

    public idd cOf() {
        return this.lJh;
    }

    public void a(idd idd2) {
        if (idd2 == null) {
            return;
        }
        this.lJh = idd2;
        Iterator<Integer> iterator = this.lJc.iterator();
        int n = -1;
        SFChatChannelInfoDTO sFChatChannelInfoDTO = null;
        while (iterator.hasNext()) {
            n = iterator.next();
            sFChatChannelInfoDTO = this.lJd.get(n);
            if (sFChatChannelInfoDTO == this.lJi.combatLog) {
                sFChatChannelInfoDTO.fontSize = this.lJh.lJr;
                continue;
            }
            sFChatChannelInfoDTO.fontSize = this.lJh.lJq;
        }
    }

    public SFChatInfoDTO cOg() {
        return this.lJi;
    }

    public int cOh() {
        return this.lJi.activeChannelId;
    }

    public int cOi() {
        int n = this.cOh();
        int n2 = -1;
        boolean bl = false;
        boolean bl2 = true;
        int n3 = -1;
        int n42 = -1;
        for (int n42 : this.lJc) {
            if (!this.lJd.get((Object)Integer.valueOf((int)n42)).isVisible) continue;
            if (bl2) {
                n3 = n42;
                bl2 = false;
            }
            if (n42 == n) {
                bl = true;
                continue;
            }
            if (!bl) continue;
            n2 = n42;
            break;
        }
        if (n2 == -1) {
            n2 = n3;
        }
        return n2;
    }

    public SFChatChannelInfoDTO cOj() {
        return this.PY(this.cOi());
    }

    public boolean PX(int n) {
        if (this.lJc.contains(n) && this.lJi.activeChannelId != n) {
            this.lJi.activeChannelId = n;
            return true;
        }
        return false;
    }

    public boolean aa(int n, boolean bl) {
        SFChatChannelInfoDTO sFChatChannelInfoDTO = this.PY(n);
        if (sFChatChannelInfoDTO == null || sFChatChannelInfoDTO.isVisible == bl || this.lIY == 1 && !bl) {
            return false;
        }
        sFChatChannelInfoDTO.isVisible = bl;
        this.lIY += bl ? 1 : -1;
        this.lJi.visibleChannelsCount = this.lIY;
        this.pQ(this.lIY > 1);
        if (this.lJi.activeChannelId == n && !bl) {
            Iterator<Integer> iterator = this.lJc.iterator();
            boolean bl2 = false;
            Integer n2 = null;
            Integer n3 = null;
            while (iterator.hasNext()) {
                n2 = iterator.next();
                if (n2 == null) continue;
                sFChatChannelInfoDTO = this.PY(n2);
                if (n2 == n) {
                    if (n3 != null) break;
                    bl2 = true;
                }
                if (!sFChatChannelInfoDTO.isVisible) continue;
                n3 = n2;
                if (!bl2) continue;
            }
            if (n3 != null) {
                this.lJi.activeChannelId = n3;
            }
        } else if (bl) {
            this.lJi.activeChannelId = n;
        }
        return true;
    }

    public void pQ(boolean bl) {
        Iterator<Integer> iterator = this.lJc.iterator();
        Integer n = null;
        SFChatChannelInfoDTO sFChatChannelInfoDTO = null;
        while (iterator.hasNext()) {
            n = iterator.next();
            if (n == null) continue;
            sFChatChannelInfoDTO = this.PY(n);
            sFChatChannelInfoDTO.isHideable = bl;
        }
    }

    public SFChatChannelInfoDTO PY(int n) {
        return this.lJd.get(n);
    }

    public SFChatChannelInfoDTO cOk() {
        return this.PY(this.lJi.activeChannelId);
    }

    public Collection<SFChatChannelInfoDTO> cOl() {
        return this.lJd.values();
    }

    public String cOm() {
        return this.lIT;
    }

    public void pK(String string) {
        this.lIT = string;
    }

    public String cOn() {
        return this.lIU;
    }

    public void pL(String string) {
        this.lIU = string;
    }

    public void sendMessage(String string) {
        if (string == null || string.length() == 0) {
            return;
        }
        if ((string = string.trim()).length() == 0) {
            return;
        }
        this.cOr();
        string = lhn.q(string, 0, 140);
        string = lhn.Ah(string);
        hzo hzo2 = hso.cxK().cxP().cyJ();
        idf idf2 = null;
        if (hzo2 != null) {
            idf2 = hzo2.cHJ();
        }
        if (lEx.equals(String.valueOf(string.charAt(0)))) {
            if (this.lJe.size() > 0 && idf2 != null) {
                idf2.pN(lvr.sZB.bD(new Object[0]).exA());
            }
            this.lJe.add(string);
        } else {
            SFChatChannelInfoDTO sFChatChannelInfoDTO = this.cOk();
            if (sFChatChannelInfoDTO != null) {
                if (this.lJf.size() > 0 && idf2 != null) {
                    idf2.pN(lvr.sZA.bD(new Object[0]).exA());
                }
                this.lJf.add(new lfs<String, Integer>(string, sFChatChannelInfoDTO.defaultTargetOrdinal));
            }
        }
    }

    public void M(String string, String string2) {
        if (string == null || string.isEmpty() || string2 == null || string2.isEmpty()) {
            return;
        }
        if (hso.cxK().cxP() == null) {
            return;
        }
        if (hso.cxK().cxP().cyJ() == null) {
            return;
        }
        if (hso.cxK().cxP().cyJ().cIq() == null) {
            return;
        }
        if (hso.cxK().cxP().cyJ().cIq().iP() == null) {
            return;
        }
        if (hso.cxK().cxP().cyJ().cIq().iR() == null) {
            return;
        }
        this.lIV = string;
        this.lIW = string2;
        String string3 = this.lIV + " " + this.lIW;
        String string4 = hso.cxK().cxP().cyJ().cIq().iP() + " " + hso.cxK().cxP().cyJ().cIq().iR();
        if (string3.trim().equalsIgnoreCase(string4.trim())) {
            hso.cxK().cxP().v(mcj.uuZ.bD(new Object[0]));
            this.lIV = null;
            this.lIW = null;
            return;
        }
        this.cOs();
    }

    public String cOo() {
        if (this.lJj == null) {
            return null;
        }
        return lEx + ((jmy)((Object)this.lJj.reX)).akV + (String)this.lJj.reY;
    }

    public lfs<jmy, String> cOp() {
        return this.lJj;
    }

    public void cOq() {
        idf idf2 = this.cOt();
        String string = this.cOo();
        if (idf2 != null && string != null) {
            idf2.w(string, false);
        }
    }

    public void cOr() {
        this.lJj = null;
    }

    private void pM(String string) {
        assert (string != null && string.length() > 0 && lEx.equals(String.valueOf(string.charAt(0))));
        ldv ldv2 = hso.cxK().cxU().getGUID();
        ehh ehh2 = (ehh)this.MessageDelegator.h(2341, this.GUID, ldv2);
        ehh2.alk = string;
        this.MessageDelegator.F(ehh2);
    }

    private void c(String string, int n, String string2) {
        amf amf2;
        Object object;
        Object object2;
        cew cew2 = (cew)this.MessageDelegator.bzx().bzt().d(hso.cxK().bAn().gYY);
        if (cew2 == null) {
            assert (false);
            return;
        }
        if (lcw.emW()) {
            int n2;
            object2 = cew2.fi();
            assert (object2 != null);
            object = (ew)((el)object2).ae(12256);
            int n3 = cg.b.hd.ordinal();
            if (object != null) {
                n3 = ((ew)object).fQ();
            }
            if ((n2 = ((ew)cew2.fi().ae(1136)).fQ()) == hc.aaz.ordinal()) {
                if (n3 == cg.b.hd.ordinal() && n == aud.a.cap.ordinal()) {
                    hso.cxK().cxP().w(maf.JapaneseSendToKorean.bD(new Object[0]));
                    return;
                }
                if (n3 == cg.b.he.ordinal() && n == aud.a.caK.ordinal()) {
                    hso.cxK().cxP().w(maf.KoreanSendToJapanese.bD(new Object[0]));
                    return;
                }
                if (n == aud.a.cap.ordinal() || n == aud.a.caK.ordinal()) {
                    if (this.MessageDelegator.arc().rgz - this.lJl < 10.0) {
                        hso.cxK().cxP().w(maf.GlobalTooFast.bD(10));
                        return;
                    }
                    this.lJl = this.MessageDelegator.arc().rgz;
                }
            }
        }
        object2 = (ehw)this.MessageDelegator.h(2316, this.GUID, lcr.qAL);
        ((ehw)object2).ipN = string;
        ((ehw)object2).ipK = n;
        ((ehw)object2).ipM = string2;
        ((ehw)object2).ipQ = this.lJg.ordinal();
        object = hso.cxK().cxP().czb();
        if (object != null && ((jng)object).HT()) {
            ((ehw)object2).ipP = ((jng)object).acl();
        }
        if (n == aud.a.cav.ordinal() && lcr.mOy != null && (amf2 = this.MessageDelegator.bzx().bzt().d(lcr.mOy)) instanceof cbd) {
            ((ehw)object2).cRI = ((cbd)amf2).aHm();
        }
        if (string2 != null) {
            this.lIT = string2;
        }
        this.MessageDelegator.F((dxq)object2);
    }

    private void D(String string, int n) {
        this.c(string, n, null);
    }

    private void N(String string, String string2) {
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            return;
        }
        ldv ldv2 = hso.cxK().bAn().Tr;
        fwt fwt2 = (fwt)this.MessageDelegator.h(17949, this.GUID, ldv2);
        fwt2.FirstName = string;
        fwt2.LastName = string2;
        this.MessageDelegator.F(fwt2);
    }

    private void cOs() {
        ldv ldv2 = hso.cxK().bAn().Tr;
        fwo fwo2 = (fwo)this.MessageDelegator.h(17921, this.GUID, ldv2);
        fwo2.jM(true);
        fwo2.hC = ldv2;
        fwo2.eiE = ldv2;
        this.MessageDelegator.F(fwo2);
    }

    private void ah(ldv ldv2, int n) {
        ldv ldv3 = hso.cxK().bAn().Tr;
        fwz fwz2 = (fwz)this.MessageDelegator.h(17952, this.GUID, lcr.mOy);
        fwz2.DV(n);
        fwz2.pY(ldv3);
        fwz2.pZ(ldv2);
        this.MessageDelegator.F(fwz2);
    }

    private void E(String string, int n) {
        if (string == null || string.isEmpty()) {
            return;
        }
        fvc fvc2 = (fvc)this.MessageDelegator.h(26884, this.GUID, lcr.qAN);
        ma ma2 = new ma();
        ma2.awJ = string;
        ma2.afj = 3;
        fvc2.Yb = ma2;
        fvc2.aqs = n;
        this.MessageDelegator.F(fvc2);
    }

    private void a(ldv ldv2, String string, int n) {
        if (ldv2 == null || string == null || string.isEmpty()) {
            return;
        }
        gkt gkt2 = (gkt)this.MessageDelegator.h(31491, this.GUID, hso.cxK().bAn().Tr);
        gkt2.YN = ldv2;
        gkt2.YL = string;
        gkt2.ed = n;
        this.MessageDelegator.F(gkt2);
    }

    private void ru(ldv ldv2) {
        elr elr2 = (elr)this.MessageDelegator.h(13909, this.GUID, hso.cxK().bAn().Tr);
        elr2.Ri = ldv2;
        this.MessageDelegator.F(elr2);
    }

    private void b(egr egr2) {
        jmy jmy2 = jmy.getValueById(egr2.ipj);
        if (jmy2 == null) {
            return;
        }
        switch (jmy2) {
            case nCw: 
            case nCx: {
                this.c((String)egr2.ccm[2], aud.a.cas.ordinal(), (String)egr2.ccm[0] + " " + (String)egr2.ccm[1]);
                this.a(jmy.nCx, (String)egr2.ccm[0] + " " + (String)egr2.ccm[1]);
                break;
            }
            case nCy: 
            case nCz: {
                this.c((String)egr2.ccm[0], aud.a.cas.ordinal(), this.lIT);
                this.a(jmy.nCz, new String[0]);
                break;
            }
            case nCA: 
            case nCB: {
                this.M((String)egr2.ccm[0], (String)egr2.ccm[1]);
                break;
            }
            case nCC: 
            case nCD: {
                this.D((String)egr2.ccm[0], aud.a.cav.ordinal());
                this.a(jmy.nCD, new String[0]);
                break;
            }
            case nCE: 
            case nCF: {
                this.D((String)egr2.ccm[0], aud.a.cat.ordinal());
                this.a(jmy.nCF, new String[0]);
                break;
            }
            case nCG: 
            case nCH: {
                this.E((String)egr2.ccm[0] + " " + (String)egr2.ccm[1], 5);
                break;
            }
            case nCI: {
                this.E((String)egr2.ccm[0] + " " + (String)egr2.ccm[1], 1);
                break;
            }
            case nCK: {
                this.E((String)egr2.ccm[0] + " " + (String)egr2.ccm[1], 4);
                break;
            }
            case nCL: {
                this.E((String)egr2.ccm[0] + " " + (String)egr2.ccm[1], 2);
                break;
            }
            case nCM: {
                this.E((String)egr2.ccm[0] + " " + (String)egr2.ccm[1], 3);
                break;
            }
            case nCN: {
                this.D((String)egr2.ccm[0], aud.a.cax.ordinal());
                break;
            }
            case nCO: {
                this.D((String)egr2.ccm[0], aud.a.caF.ordinal());
                break;
            }
            case nCP: {
                this.bs(egr2.ccm);
                break;
            }
            case nCQ: {
                this.bt(egr2.ccm);
                break;
            }
        }
        this.cOq();
    }

    private void c(fwp fwp2) {
        if (fwp2.cRI != null && !fwp2.cRI.equals(lcr.qAC)) {
            this.N(this.lIV, this.lIW);
        }
    }

    private void a(fvd fvd2) {
        if (fvd2.iXC == null || fvd2.iXC.length != 1 || fvd2.iXC[0] == null) {
            return;
        }
        jng jng2 = hso.cxK().cxP().czb();
        switch (fvd2.aqs) {
            case 1: {
                this.a(fvd2.iXC[0].Ri, fvd2.iXC[0].bc, 0);
                break;
            }
            case 2: {
                this.ru(fvd2.iXC[0].Ri);
                break;
            }
            case 3: {
                if (jng2 == null) break;
                jng2.a(fvd2.iXC[0].Ri, false, this);
                break;
            }
            case 4: {
                this.ah(fvd2.iXC[0].Ri, 0);
                break;
            }
            case 5: {
                this.ah(fvd2.iXC[0].Ri, 1);
                break;
            }
        }
    }

    private void bs(Object[] objectArray) {
        int n = 6;
        if (objectArray != null && objectArray.length > 0) {
            n = (Integer)objectArray[0];
        }
        if (n < 2 || n > 100) {
            idf idf2;
            hzo hzo2 = hso.cxK().cxP().cyJ();
            if (hzo2 != null && (idf2 = hzo2.cHJ()) != null) {
                idf2.pN(lvu.taw.bD(2, 100).exA());
            }
            return;
        }
        if (this.lJk + 5.0 > this.MessageDelegator.arc().rgz) {
            hso.cxK().cxP().v(maf.RollCommandSpam.bD(new Object[0]));
            return;
        }
        this.lJk = this.MessageDelegator.arc().rgz;
        float f = lgp.erA().nextFloat();
        int n2 = (int)(f * (float)n) + 1;
        aud.a a2 = aud.a.getValue(this.cOk().defaultTargetOrdinal);
        switch (a2) {
            case cav: {
                String string = hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cIq() != null ? hso.cxK().cxP().cyJ().cIq().iU() : "";
                fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, hso.cxK().bAn().gYX);
                fgo2.r(maf.RollResultParty.bD(string, n, n2));
                fgo2.ld(true);
                this.MessageDelegator.F(fgo2);
                break;
            }
            case cat: {
                String string = hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cIq() != null ? hso.cxK().cxP().cyJ().cIq().iU() : "";
                fgo fgo3 = (fgo)this.MessageDelegator.h(29447, this.GUID, hso.cxK().bAn().gYX);
                fgo3.r(maf.RollResultClan.bD(string, n, n2));
                fgo3.lc(true);
                this.MessageDelegator.F(fgo3);
                break;
            }
            default: {
                loz loz2 = maf.RollResultPersonal.bD(n, n2);
                hso.cxK().cxP().v(loz2);
                break;
            }
        }
    }

    private void bt(Object[] objectArray) {
        if (hso.cxK().bAn() == null) {
            return;
        }
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, hso.cxK().bAn().gYY);
        gjt2.SkillType = cxd.fHj;
        this.MessageDelegator.F(gjt2);
    }

    private void a(jmy jmy2, String ... stringArray) {
        String string = "";
        for (String string2 : stringArray) {
            string = string + " " + string2;
        }
        string = string + " ";
        this.lJj = new lfs<jmy, String>(jmy2, string);
    }

    private idf cOt() {
        hzo hzo2;
        hvj hvj2 = hso.cxK().cxP();
        if (hvj2 != null && (hzo2 = hvj2.cyJ()) != null) {
            return hzo2.cHJ();
        }
        return null;
    }

    private void a(int n, String string, jmw.a[] aArray) {
        jmw jmw2;
        ldv ldv2 = hso.cxK().cxU().getGUID();
        ehj ehj2 = (ehj)this.MessageDelegator.h(2349, this.GUID, ldv2);
        ehj2.ipV = jmw2 = new jmw(n, lEx + string, this.GUID, aArray);
        this.MessageDelegator.F(ehj2);
    }

    private void cOu() {
        this.a(jmy.nCw.cck, jmy.nCw.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCx.cck, jmy.nCx.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCy.cck, jmy.nCy.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCz.cck, jmy.nCz.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCA.cck, jmy.nCA.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCB.cck, jmy.nCB.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCC.cck, jmy.nCC.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCD.cck, jmy.nCD.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCE.cck, jmy.nCE.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCF.cck, jmy.nCF.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCG.cck, jmy.nCG.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCH.cck, jmy.nCH.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCI.cck, jmy.nCI.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCJ.cck, jmy.nCJ.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCK.cck, jmy.nCK.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCL.cck, jmy.nCL.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCM.cck, jmy.nCM.akV, new jmw.a[]{new jmw.a(jmw.b.nCl, lvv.taE.bD(new Object[0]).exA()), new jmw.a(jmw.b.nCl, lvv.taF.bD(new Object[0]).exA())});
        this.a(jmy.nCN.cck, jmy.nCN.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCO.cck, jmy.nCO.akV, new jmw.a[]{new jmw.a(jmw.b.nCm, lvv.taG.bD(new Object[0]).exA())});
        this.a(jmy.nCP.cck, jmy.nCP.akV, new jmw.a[]{new jmw.a(jmw.b.nCi, lvv.taH.bD(new Object[0]).exA(), true)});
        this.a(jmy.nCQ.cck, jmy.nCQ.akV, null);
    }

    private void cOv() {
        this.lJi.activeChannelId = this.lIX;
        this.a(this.lJi.combatLog, aud.a.cap.ordinal(), hyy.b.luA.ordinal(), lvs.sZE.bD(new Object[0]).exA(), lvs.sZO.bD(new Object[0]).exA(), "addNotification", "texture/gui/runtime/buttons/icons/chat/pvp.png", lIL, this.lJh.lJr, true, true);
        lox lox2 = lvs.sZF;
        lox lox3 = lvs.sZO;
        if (lcw.bcB == 2) {
            lox2 = lvs.sZH;
            lox3 = lvs.sZU;
        }
        this.a(this.lJi.globalChannel, aud.a.cap.ordinal(), hyy.b.luB.ordinal(), lox2.bD(new Object[0]).exA(), lox3.bD(new Object[0]).exA(), "addGlobalMessage", "texture/gui/runtime/buttons/icons/chat/globalchat.png", lIM, this.lJh.lJq, true, true);
        this.a(this.lJi.areaChannel, aud.a.car.ordinal(), hyy.b.luC.ordinal(), lvs.sZI.bD(new Object[0]).exA(), lvs.sZP.bD(new Object[0]).exA(), "addAreaMessage", "texture/gui/runtime/buttons/icons/chat/globalchat.png", lIN, this.lJh.lJq, true, true);
        this.a(this.lJi.partyChannel, aud.a.cav.ordinal(), hyy.b.luD.ordinal(), lvs.sZJ.bD(new Object[0]).exA(), lvs.sZQ.bD(new Object[0]).exA(), "addPartyMessage", "texture/gui/runtime/buttons/icons/chat/party.png", lIO, this.lJh.lJq, false, false);
        this.a(this.lJi.privateChannel, aud.a.cap.ordinal(), hyy.b.luE.ordinal(), lvs.sZK.bD(new Object[0]).exA(), lvs.sZO.bD(new Object[0]).exA(), "addPrivateMessage", "texture/gui/runtime/buttons/icons/chat/whisper.png", lIP, this.lJh.lJq, false, false);
        this.a(this.lJi.clanChannel, aud.a.cat.ordinal(), hyy.b.luF.ordinal(), lvs.sZL.bD(new Object[0]).exA(), lvs.sZS.bD(new Object[0]).exA(), "addClanMessage", "texture/gui/runtime/buttons/icons/chat/clan.png", lIQ, this.lJh.lJq, false, false);
        this.a(this.lJi.clanAllianceChannel, aud.a.caC.ordinal(), hyy.b.luG.ordinal(), lvs.sZM.bD(new Object[0]).exA(), lvs.sZT.bD(new Object[0]).exA(), "addClanAllianceMessage", "texture/gui/runtime/buttons/icons/chat/clan.png", lIR, this.lJh.lJq, false, false);
        boolean bl = lcw.emW();
        this.a(this.lJi.globalJapanChannel, aud.a.caK.ordinal(), hyy.b.luN.ordinal(), lvs.sZG.bD(new Object[0]).exA(), lvs.sZV.bD(new Object[0]).exA(), "addGlobalJapanMessage", "texture/gui/runtime/buttons/icons/chat/globalchat.png", lIS, this.lJh.lJq, bl, bl);
        this.lJi.visibleChannelsCount = this.lIY;
        this.pQ(this.lIY > 1);
    }

    private void a(SFChatChannelInfoDTO sFChatChannelInfoDTO, int n, int n2, String string, String string2, String string3, String string4, String string5, double d2, boolean bl, boolean bl2) {
        this.lJc.add(this.lIX);
        sFChatChannelInfoDTO.id = this.lIX++;
        sFChatChannelInfoDTO.defaultTargetOrdinal = n;
        sFChatChannelInfoDTO.menuButtonOrdinal = n2;
        sFChatChannelInfoDTO.channelName = string;
        sFChatChannelInfoDTO.channelShortName = string2;
        sFChatChannelInfoDTO.flashFunctionName = string3;
        sFChatChannelInfoDTO.iconPath = string4;
        sFChatChannelInfoDTO.visibleConfigEntryName = string5;
        sFChatChannelInfoDTO.isVisible = bl;
        sFChatChannelInfoDTO.isEnabled = bl2;
        sFChatChannelInfoDTO.showNotification = false;
        sFChatChannelInfoDTO.fontSize = d2;
        this.lIY += sFChatChannelInfoDTO.isVisible ? 1 : 0;
        this.lJd.put(sFChatChannelInfoDTO.id, sFChatChannelInfoDTO);
    }

    public void cOw() {
        this.lJi.combatLog.channelName = lvs.sZE.bD(new Object[0]).exA();
        this.lJi.combatLog.channelShortName = lvs.sZO.bD(new Object[0]).exA();
        if (lcw.bcB == 2) {
            this.lJi.globalChannel.channelName = lvs.sZH.bD(new Object[0]).exA();
            this.lJi.globalChannel.channelShortName = lvs.sZU.bD(new Object[0]).exA();
        } else {
            this.lJi.globalChannel.channelName = lvs.sZF.bD(new Object[0]).exA();
            this.lJi.globalChannel.channelShortName = lvs.sZO.bD(new Object[0]).exA();
        }
        this.lJi.areaChannel.channelName = lvs.sZI.bD(new Object[0]).exA();
        this.lJi.areaChannel.channelShortName = lvs.sZP.bD(new Object[0]).exA();
        this.lJi.partyChannel.channelName = lvs.sZJ.bD(new Object[0]).exA();
        this.lJi.partyChannel.channelShortName = lvs.sZQ.bD(new Object[0]).exA();
        this.lJi.privateChannel.channelName = lvs.sZK.bD(new Object[0]).exA();
        this.lJi.privateChannel.channelShortName = lvs.sZO.bD(new Object[0]).exA();
        this.lJi.clanChannel.channelName = lvs.sZL.bD(new Object[0]).exA();
        this.lJi.clanChannel.channelShortName = lvs.sZS.bD(new Object[0]).exA();
        this.lJi.clanAllianceChannel.channelName = lvs.sZM.bD(new Object[0]).exA();
        this.lJi.clanAllianceChannel.channelShortName = lvs.sZT.bD(new Object[0]).exA();
        this.lJi.globalJapanChannel.channelName = lvs.sZG.bD(new Object[0]).exA();
        this.lJi.globalJapanChannel.channelShortName = lvs.sZV.bD(new Object[0]).exA();
    }

    @Override
    public void oj() {
    }

    @Override
    public void cyA() {
    }

    @Override
    public void oi() {
    }

    @Override
    public void ny(String string) {
        idf idf2;
        hzo hzo2 = hso.cxK().cxP().cyJ();
        if (hzo2 != null && (idf2 = hzo2.cHJ()) != null) {
            idf2.pN(string);
        }
    }

    @Override
    public void nz(String string) {
        idf idf2;
        hzo hzo2 = hso.cxK().cxP().cyJ();
        if (hzo2 != null && (idf2 = hzo2.cHJ()) != null) {
            idf2.pN(string);
        }
    }
}

