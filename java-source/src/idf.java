/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 *  hyn
 *  hzo
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import spenefett.hid.gui.serialization.dto.SFChatChannelInfoDTO;
import spenefett.hid.gui.serialization.dto.SFChatInfoDTO;
import spenefett.hid.gui.serialization.dto.SFChatLinkDTO;

public class idf
extends hzk
implements bto,
htz,
huh,
hul,
hyy.d,
jml {
    public static final boolean lJv = false;
    public static final int lEy = 140;
    public static final float lJw = 410.0f;
    public static final int lJx = 0;
    public static final int lJy = 1;
    public static final int lJz = 2;
    private static final String lJA = "CHAT_FONT_SIZE";
    private static final String lJB = "CHAT_TIMESTAMPS_ENABLED";
    private static final String lJC = "CHAT_ACTIVE_CHANNEL";
    private static final String lJD = "#06a5f7";
    private static final String lJE = "#de00eb";
    private static final String lJF = "#38c800";
    private static final String lJG = "#f7ef06";
    private static final String lJH = "#ffffff";
    private static final String lJI = "#ffffff";
    private static final String lJJ = "#e70009";
    private static final String lJK = "#ffa53a";
    private static final String lJL = "#ffae00";
    private static final String lJM = "#e30009";
    private jgr lxx = null;
    private idc lxw = null;
    private hyn lJN = null;
    private float lJO = 0.2f;
    private boolean lJP = false;

    public idf(idc idc2) {
        super("ChatWindow", "Chat.swf");
        this.OQ(lcw.qOS ? 0 : jnz.nGC | jnz.nGj);
        this.a(hya.lmu, true);
        this.a(hyb.lmC);
        assert (idc2 != null);
        this.lxw = idc2;
        this.a(lJA, hsu.ldg, (Integer)idc2.cOf().cck);
        this.a(lJB, hsu.ldg, idc2.cOd());
        this.a(lJC, hsu.ldg, (Integer)idc2.cOh());
        Collection<SFChatChannelInfoDTO> collection = idc2.cOl();
        for (SFChatChannelInfoDTO sFChatChannelInfoDTO : collection) {
            if (sFChatChannelInfoDTO.visibleConfigEntryName == null) continue;
            this.a(sFChatChannelInfoDTO.visibleConfigEntryName, hsu.ldg, sFChatChannelInfoDTO.isVisible);
        }
    }

    public float cOx() {
        return this.lJO;
    }

    public void kz(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.lJO = f;
    }

    public void initialize() {
        super.initialize();
        if (lcw.bcB == 2) {
            hyy.b.luB.a(lvs.sZH);
        }
        fvp fvp2 = (fvp)this.MessageDelegator.h(12289, this.getGUID(), lcr.qCM);
        fvp2.iTm = 1;
        fvp2.dTe = 0;
        this.MessageDelegator.E(fvp2);
        idf.cyJ().cHx().a(hyy.a.lrL, this);
        jng jng2 = hso.cxK().cxP().czb();
        if (jng2 != null) {
            jng2.a(this);
        }
        hso.cxK().cxR().dMa().a(jmq.nAP, this);
    }

    public void cleanUp() {
        Object object;
        super.cleanUp();
        if (hso.cxK() != null) {
            hso.cxK().cxR().dMa().j(jmq.nAP);
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && (object = hso.cxK().cxP().czb()) != null) {
            ((jng)object).b(this);
        }
        object = (fvv)this.MessageDelegator.h(12290, this.getGUID(), lcr.qCM);
        ((fvv)object).iTm = 1;
        this.MessageDelegator.E((dxq)object);
    }

    public void cBa() {
        hyy hyy2;
        super.cBa();
        this.cOy();
        this.cOB();
        this.cOC();
        this.cOE();
        this.pT(hso.cxK().cxN() == jnz.nFE);
        boolean bl = this.lxw.cOd();
        idd idd2 = this.lxw.cOf();
        hzo hzo2 = (hzo)idf.cxO();
        hyy hyy3 = hyy2 = hzo2 != null ? hzo2.cHx() : null;
        if (hyy2 != null) {
            if (bl) {
                hyy2.a(hyy.b.luM, 1);
            }
            switch (idd2) {
                case lJn: {
                    hyy2.a(hyy.b.luI, 1);
                    break;
                }
                case lJo: {
                    hyy2.a(hyy.b.luJ, 1);
                    break;
                }
                case lJp: {
                    hyy2.a(hyy.b.luK, 1);
                    break;
                }
            }
        }
    }

    @Override
    protected void cDZ() {
        super.cDZ();
        this.lxw.a(idd.getValueFromId(this.nh(lJA)));
        this.lxw.pP(this.nk(lJB));
        this.lxw.PX(this.nh(lJC));
        Collection<SFChatChannelInfoDTO> collection = this.lxw.cOl();
        for (SFChatChannelInfoDTO sFChatChannelInfoDTO : collection) {
            if (sFChatChannelInfoDTO.visibleConfigEntryName == null || !sFChatChannelInfoDTO.isEnabled || sFChatChannelInfoDTO.id == this.lxw.cOg().globalJapanChannel.id && !lcw.emW()) continue;
            this.lxw.aa(sFChatChannelInfoDTO.id, this.nk(sFChatChannelInfoDTO.visibleConfigEntryName));
        }
    }

    protected void cEc() {
    }

    protected void b(jnz jnz2, jnz jnz3) {
        this.pT(jnz3 == jnz.nFE);
        if (jnz2 == jnz.nFF) {
            this.pR(false);
        }
    }

    protected void cEi() {
    }

    protected void cEj() {
        this.pR(false);
    }

    @Override
    protected void cEb() {
        super.cEb();
        if (idf.cyJ() == null) {
            return;
        }
        this.cOG();
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 17920) {
            switch (dxq2.bEz()) {
                case 17942: {
                    this.b((fws)dxq2);
                    break;
                }
                case 17943: {
                    this.b((fwy)dxq2);
                }
            }
            return;
        }
        switch (dxq2.bEz()) {
            case 2328: {
                this.a((egi)dxq2);
                break;
            }
            case 26885: {
                this.c(ide.a(this, (fvd)dxq2));
                break;
            }
            case 2350: {
                this.a((egf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void b(hyy.b b2, int n) {
        hzo hzo2 = (hzo)idf.cxO();
        SFChatInfoDTO sFChatInfoDTO = this.lxw.cOg();
        switch (b2) {
            case luy: {
                this.setVisible(false);
                hzo2.cHw().duC();
                break;
            }
            case luA: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.combatLog.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.combatLog);
                break;
            }
            case luB: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.globalChannel.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.globalChannel);
                break;
            }
            case luN: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.globalJapanChannel.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.globalJapanChannel);
                break;
            }
            case luC: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.areaChannel.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.areaChannel);
                break;
            }
            case luD: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.partyChannel.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.partyChannel);
                break;
            }
            case luE: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.privateChannel.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.privateChannel);
                break;
            }
            case luF: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.clanChannel.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.clanChannel);
                break;
            }
            case luG: {
                if (sFChatInfoDTO.activeChannelId == sFChatInfoDTO.clanAllianceChannel.id) {
                    this.setChannelVisibleById(sFChatInfoDTO.activeChannelId, false);
                    break;
                }
                this.a(sFChatInfoDTO.clanAllianceChannel);
                break;
            }
            case luI: {
                if (n != 1) break;
                this.lxw.a(idd.lJn);
                this.w(lJA, this.lxw.cOf().cck);
                this.cOy();
                break;
            }
            case luJ: {
                if (n != 1) break;
                this.lxw.a(idd.lJo);
                this.w(lJA, this.lxw.cOf().cck);
                this.cOy();
                break;
            }
            case luK: {
                if (n != 1) break;
                this.lxw.a(idd.lJp);
                this.w(lJA, this.lxw.cOf().cck);
                this.cOy();
                break;
            }
            case luM: {
                this.lxw.pP(n == 1);
                this.q(lJB, this.lxw.cOd());
                this.cOA();
                this.cOE();
                break;
            }
        }
    }

    @Override
    public boolean cGG() {
        return false;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    protected void j(int n, int n2, String string) {
        this.lJN = this.t(n, n2, string);
    }

    protected void cEk() {
        this.lxw.cOw();
        this.cOy();
    }

    private hyn t(int n, int n2, String string) {
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add(jmy.nCw.lOI.bD(new Object[0]).exA().toUpperCase());
        arrayList.add(jmy.nCA.lOI.bD(new Object[0]).exA().toUpperCase());
        arrayList.add(jmy.nCI.lOI.bD(new Object[0]).exA().toUpperCase());
        arrayList.add(jmy.nCJ.lOI.bD(new Object[0]).exA().toUpperCase());
        if (idf.cxP().cyZ() != null) {
            if (idf.cxP().cyZ().a(jmy.nCS)) {
                arrayList.add(jmy.nCS.lOI.bD(new Object[0]).exA().toUpperCase());
            }
            if (idf.cxP().cyZ().a(jmy.nCS)) {
                arrayList.add(jmy.nCR.lOI.bD(new Object[0]).exA().toUpperCase());
            }
            if (idf.cxP().cyZ().a(jmy.nCS)) {
                arrayList.add(jmy.nCT.lOI.bD(new Object[0]).exA().toUpperCase());
            }
            if (idf.cxP().cyZ().a(jmy.nCS)) {
                arrayList.add(jmy.nCU.lOI.bD(new Object[0]).exA().toUpperCase());
            }
            if (idf.cxP().cyZ().a(jmy.nCS)) {
                arrayList.add(jmy.nCV.lOI.bD(new Object[0]).exA().toUpperCase());
            }
        }
        return new hyi(n, n2, new hyk(this, arrayList){
            final /* synthetic */ List lra;
            final /* synthetic */ idf lJQ;
            {
                this.lJQ = idf2;
                this.lra = list;
            }

            public String[] cDR() {
                return this.lra.toArray(new String[this.lra.size()]);
            }

            public void a(int n, String string, int n2, int n3, int n4, int n5) {
                jmy jmy2 = jmy.getValueByName(string);
                String string2 = null;
                switch (jmy2) {
                    case nCw: 
                    case nCx: {
                        idf.a(this.lJQ);
                        this.lJQ.cqF();
                        this.lJQ.cFc();
                        break;
                    }
                    case nCA: 
                    case nCB: {
                        String[] stringArray;
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty() || (stringArray = string2.split(" ")) == null || stringArray.length != 2) break;
                        idf.b(this.lJQ).M(stringArray[0], stringArray[1]);
                        break;
                    }
                    case nCI: {
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty()) break;
                        idf.a(this.lJQ, string2, 1);
                        break;
                    }
                    case nCJ: {
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty()) break;
                        idf.a(this.lJQ, string2, 2);
                        break;
                    }
                    case nCR: {
                        String[] stringArray;
                        if (!idf.cOH().cyZ().a(jmy.nCR)) break;
                        hso.cxK().a(jmq.nzc);
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty() || (stringArray = string2.split(" ")) == null || stringArray.length != 2 || hso.cxK().cxP().cyJ() == null || hso.cxK().cxP().cyJ().cHv() == null) break;
                        hso.cxK().cxP().cyJ().cHv().pR(kh.a.aop.name() + " " + stringArray[0] + " " + stringArray[1]);
                        break;
                    }
                    case nCS: {
                        String[] stringArray;
                        if (!idf.cOI().cyZ().a(jmy.nCS)) break;
                        hso.cxK().a(jmq.nzc);
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty() || (stringArray = string2.split(" ")) == null || stringArray.length != 2 || hso.cxK().cxP().cyJ() == null || hso.cxK().cxP().cyJ().cHv() == null) break;
                        hso.cxK().cxP().cyJ().cHv().pR(kh.a.aoq.name() + " " + stringArray[0] + " " + stringArray[1]);
                        break;
                    }
                    case nCT: {
                        String[] stringArray;
                        if (!idf.cOJ().cyZ().a(jmy.nCT)) break;
                        hso.cxK().a(jmq.nzc);
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty() || (stringArray = string2.split(" ")) == null || stringArray.length != 2 || hso.cxK().cxP().cyJ() == null || hso.cxK().cxP().cyJ().cHv() == null) break;
                        hso.cxK().cxP().cyJ().cHv().pR(kh.a.aoA.name() + " " + stringArray[0] + " " + stringArray[1]);
                        break;
                    }
                    case nCU: {
                        String[] stringArray;
                        if (!idf.cOK().cyZ().a(jmy.nCU)) break;
                        hso.cxK().a(jmq.nzc);
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty() || (stringArray = string2.split(" ")) == null || stringArray.length != 2 || hso.cxK().cxP().cyJ() == null || hso.cxK().cxP().cyJ().cHv() == null) break;
                        hso.cxK().cxP().cyJ().cHv().pR(kt.a.arB.name() + " " + stringArray[0] + " " + stringArray[1]);
                        break;
                    }
                    case nCV: {
                        String[] stringArray;
                        if (!idf.cOL().cyZ().a(jmy.nCV)) break;
                        hso.cxK().a(jmq.nzc);
                        string2 = idf.b(this.lJQ).cOn();
                        if (string2 == null || string2.isEmpty() || (stringArray = string2.split(" ")) == null || stringArray.length != 2 || hso.cxK().cxP().cyJ() == null || hso.cxK().cxP().cyJ().cHv() == null) break;
                        hso.cxK().cxP().cyJ().cHv().pR(kt.a.arC.name() + " " + stringArray[0] + " " + stringArray[1]);
                        break;
                    }
                }
                idf.cOM().czi();
            }

            public void cDU() {
            }
        });
    }

    private void b(fws fws2) {
        SFChatChannelInfoDTO sFChatChannelInfoDTO = this.lxw.cOg().partyChannel;
        sFChatChannelInfoDTO.isEnabled = true;
        this.a(sFChatChannelInfoDTO);
        this.cOC();
    }

    private void b(fwy fwy2) {
        this.setChannelVisibleById(this.lxw.cOg().partyChannel.id, false);
    }

    private void a(egi egi2) {
        if (egi2 == null) {
            return;
        }
        if (egi2.crz == null) {
            return;
        }
        if (egi2.crz.ccW != null) {
            Object object;
            if (egi2.crz.ccU == null || egi2.crz.ccU.isEmpty()) {
                return;
            }
            if (this.lxx == null && (object = hso.cxK().cxP().cyJ()) != null) {
                this.lxx = object.cHM();
            }
            if (egi2.crz.ccU.equals("<self>")) {
                egi2.crz.ccU = dsv.byP().iU();
            } else if (this.lxx != null && this.lxx.sh(egi2.crz.ccU)) {
                return;
            }
            switch (egi2.crz.ccW) {
                case cap: 
                case caq: 
                case caJ: 
                case caG: 
                case caA: 
                case caB: {
                    this.a(egi2.crz, this.lxw.cOg().globalChannel, "#ffffff", "#ffffff");
                    break;
                }
                case caK: {
                    this.a(egi2.crz, this.lxw.cOg().globalJapanChannel, "#ffffff", "#ffffff");
                    break;
                }
                case car: {
                    this.a(egi2.crz, this.lxw.cOg().areaChannel, "#ffffff", "#ffffff");
                    break;
                }
                case cas: {
                    object = null;
                    String string = egi2.crz.ccU;
                    if (egi2.crz.ccU.equals(dsv.byP().iU())) {
                        egi2.crz.ccU = egi2.crz.ccV;
                        object = "To: ";
                    } else {
                        this.lxw.pK(egi2.crz.ccU);
                    }
                    SFChatChannelInfoDTO sFChatChannelInfoDTO = this.lxw.cOg().privateChannel;
                    if (!sFChatChannelInfoDTO.isVisible || !this.cEU()) {
                        this.a(hxz.lmd);
                    }
                    this.a(egi2.crz, sFChatChannelInfoDTO, lJE, lJE, false, false, (String)object);
                    egi2.crz.ccU = string;
                    break;
                }
                case cat: 
                case cau: 
                case caE: 
                case caH: {
                    this.a(egi2.crz, this.lxw.cOg().clanChannel, lJF, "#ffffff", false, true);
                    break;
                }
                case caC: 
                case caD: {
                    this.a(egi2.crz, this.lxw.cOg().clanAllianceChannel, lJF, "#ffffff", true, true);
                    break;
                }
                case cav: 
                case caI: {
                    this.a(egi2.crz, this.lxw.cOg().partyChannel, lJD, "#ffffff");
                    break;
                }
                case caw: 
                case cay: 
                case caz: 
                case caF: {
                    this.a(egi2.crz, this.lxw.cOg().privateChannel, lJJ, lJJ);
                    break;
                }
                case cax: {
                    this.a(egi2.crz, this.lxw.cOg().privateChannel, lJK, lJK);
                    break;
                }
            }
        } else {
            this.e(egi2.crz);
            this.a(egi2.crz, this.lxw.cOg().combatLog, lJG, lJG);
        }
    }

    private void a(egf egf2) {
        if (egf2.ipl == null) {
            return;
        }
        jmy jmy2 = jmy.getValueById(egf2.ipj);
        if (jmy2 == null) {
            return;
        }
        if (!egf2.ipk) {
            switch (jmy2) {
                case nCw: 
                case nCx: {
                    this.oh(egf2.ipl[0]);
                    break;
                }
            }
            hso.cxK().a(jnz.nFI);
            this.setVisible(true);
            this.cqF();
            this.cFc();
        }
    }

    private void a(auk auk2, SFChatChannelInfoDTO sFChatChannelInfoDTO, String string, String string2) {
        this.a(auk2, sFChatChannelInfoDTO, string, string2, false, false, null);
    }

    private void a(auk auk2, SFChatChannelInfoDTO sFChatChannelInfoDTO, String string, String string2, boolean bl, boolean bl2) {
        this.a(auk2, sFChatChannelInfoDTO, string, string2, bl, bl2, null);
    }

    private void a(auk auk2, SFChatChannelInfoDTO sFChatChannelInfoDTO, String string, String string2, boolean bl, boolean bl2, String string3) {
        if (auk2 == null || sFChatChannelInfoDTO == null) {
            return;
        }
        if (!sFChatChannelInfoDTO.isVisible) {
            idf.cyJ().cHx().c(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO.menuButtonOrdinal), true);
        }
        if (!sFChatChannelInfoDTO.isEnabled) {
            sFChatChannelInfoDTO.isEnabled = true;
            this.cOC();
        }
        this.a(sFChatChannelInfoDTO.flashFunctionName, new Object[]{this.a(auk2, string, string2, bl, bl2, string3)});
    }

    public void pN(String string) {
        if (lcw.qOS) {
            return;
        }
        egy egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
        lip[] lipArray = new lip[]{new ljg(string)};
        egy2.b(aud.b.cbT);
        egy2.ipJ = lipArray;
        this.MessageDelegator.F(egy2);
    }

    public void c(lox lox2) {
        if (lox2 != null) {
            this.pN(lox2.bD(new Object[0]).exA());
        }
    }

    private void F(String string, int n) {
        if (string == null || string.isEmpty()) {
            return;
        }
        SFChatChannelInfoDTO sFChatChannelInfoDTO = this.lxw.cOk();
        if (sFChatChannelInfoDTO == null || sFChatChannelInfoDTO.id == n) {
            return;
        }
        this.a(sFChatChannelInfoDTO.flashFunctionName, new Object[]{string});
    }

    private void e(auk auk2) {
        if (auk2 == null || auk2.aFo == null || auk2.aFo.isEmpty()) {
            return;
        }
        auk2.aFo = auk2.aFo.replaceAll("\\^C(.*?)\\^", "");
        auk2.aFo = auk2.aFo.replaceAll("\\^L", "");
        auk2.aFo = auk2.aFo.replaceAll("\\^N", "");
        auk2.aFo = auk2.aFo.replaceAll("\\^", "");
    }

    private String a(auk auk2, String string, String string2, boolean bl, boolean bl2, String string3) {
        bbs bbs2;
        String string4 = "<font color='#f7ef06'>[" + lvr.sZC.bD(new Object[0]).exA() + "]</font>";
        String string5 = "";
        String string6 = "";
        if (auk2.ccU != null && auk2.ccU.length() > 0) {
            string4 = this.a(auk2.ccU, string, string3, auk2.ccY);
        }
        if (bl && auk2.add != null && !auk2.add.isEmpty()) {
            string5 = this.O("[" + auk2.add.toUpperCase() + "] ", string);
        }
        if (bl2 && auk2.ccX != bbs.NoRank.ordinal() && (bbs2 = bbs.getValueByOrdinal(auk2.ccX)) != null) {
            string6 = this.O("[" + bbs2.wp().bD(new Object[0]).exA().toUpperCase() + "] ", string);
        }
        return this.an(auk2.aEW) + string5 + string6 + string4 + " " + this.O(auk2.aFo, string2) + "<br />";
    }

    private String a(String string, String string2, String string3, int n) {
        if (string2 == null || string2.isEmpty()) {
            string2 = "#ffffff";
        }
        if (string3 == null) {
            string3 = "";
        }
        String string4 = "";
        if (n > 0) {
            if (n >= hc.aaP.ordinal()) {
                string4 = "<font color='#e30009'>[ADM]</font> ";
            } else if (n >= hc.aaA.ordinal()) {
                string4 = "<font color='#ffae00'>[GM]</font> ";
            }
        }
        return string4 + "<font color='" + string2 + "'><a href='event:player:" + string + "'>[" + string3 + string + "]</a></font>";
    }

    private String O(String string, String string2) {
        if (string2 == null || string2.isEmpty()) {
            string2 = "#ffffff";
        }
        return "<font color='" + string2 + "'>" + string + "</font>";
    }

    private String an(long l2) {
        if (this.lxw.cOd()) {
            String string = ldz.b(l2, true);
            return "<font color='#ffffff'>[" + string + "]</font> ";
        }
        return "";
    }

    private void cOy() {
        this.a("setChatInfo", new Object[]{this.lxw.cOg()});
    }

    private void cOz() {
        SFChatLinkDTO sFChatLinkDTO = new SFChatLinkDTO();
        sFChatLinkDTO.id = (int)(Math.random() * 99.0);
        sFChatLinkDTO.text = "[Item " + sFChatLinkDTO.id + "]";
        sFChatLinkDTO.color = 0xFF0000;
        this.a("insertChatInputLink", new Object[]{sFChatLinkDTO});
    }

    private void cOA() {
        this.a("removeAllMessages", new Object[0]);
    }

    private void cOB() {
        SFChatChannelInfoDTO sFChatChannelInfoDTO = this.lxw.cOk();
        if (sFChatChannelInfoDTO != null) {
            this.a("setChatPrefixText", new Object[]{"<font color='#000000'>" + sFChatChannelInfoDTO.channelShortName + ":</font>"});
        }
    }

    public void w(String string, boolean bl) {
        this.a("setChatInputText", new Object[]{string, bl});
    }

    public void pR(boolean bl) {
        this.pS(bl);
        hso.cxK().cxR().setIgnoreKeyboard(bl);
    }

    private void pS(boolean bl) {
        if (this.cEU() && bl) {
            hso.cxK().cxP().i((hyn)this);
            this.a("setChatInputFocus", new Object[]{true});
        } else {
            this.a("setChatInputFocus", new Object[]{false});
        }
    }

    private void pT(boolean bl) {
        this.a("setGameModeEnabled", new Object[]{bl, Float.valueOf(this.lJO)});
    }

    private void cOC() {
        hyy hyy2 = idf.cyJ().cHx();
        Collection<SFChatChannelInfoDTO> collection = this.lxw.cOl();
        for (SFChatChannelInfoDTO sFChatChannelInfoDTO : collection) {
            hyy.b b2 = hyy.b.getValueByOrdinal(sFChatChannelInfoDTO.menuButtonOrdinal);
            hyy2.b(b2, sFChatChannelInfoDTO.isEnabled);
            if (sFChatChannelInfoDTO.isVisible && sFChatChannelInfoDTO.isEnabled) {
                if (sFChatChannelInfoDTO.id == this.lxw.cOh()) {
                    hyy2.a(b2, 2);
                    continue;
                }
                hyy2.a(b2, 1);
                continue;
            }
            hyy2.a(b2, 0);
        }
    }

    private void cOD() {
        this.oh(this.lxw.cOn());
    }

    public void oh(String string) {
        this.w("/" + jmy.nCx.akV + " " + string + " ", true);
    }

    private String[] pO(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(":");
        if (stringArray == null || stringArray.length != 2) {
            return null;
        }
        if (stringArray[0] == null || stringArray[0].isEmpty()) {
            return null;
        }
        if (stringArray[1] == null || stringArray[1].isEmpty()) {
            return null;
        }
        return stringArray;
    }

    private void a(SFChatChannelInfoDTO sFChatChannelInfoDTO) {
        if (sFChatChannelInfoDTO == null) {
            return;
        }
        int n = this.lxw.cOh();
        SFChatChannelInfoDTO sFChatChannelInfoDTO2 = this.lxw.PY(n);
        hyy hyy2 = idf.cyJ().cHx();
        if (sFChatChannelInfoDTO.isVisible) {
            if (this.lxw.PX(sFChatChannelInfoDTO.id)) {
                hyy2.a(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO2.menuButtonOrdinal), 1);
                hyy2.a(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO.menuButtonOrdinal), 2);
                this.a("setActiveChannelId", new Object[]{this.lxw.cOh()});
                this.cOB();
            }
        } else if (this.lxw.aa(sFChatChannelInfoDTO.id, true)) {
            if (sFChatChannelInfoDTO.visibleConfigEntryName != null) {
                this.q(sFChatChannelInfoDTO.visibleConfigEntryName, sFChatChannelInfoDTO.isVisible);
            }
            if (sFChatChannelInfoDTO.id == this.lxw.cOh() || this.lxw.PX(sFChatChannelInfoDTO.id)) {
                hyy2.a(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO2.menuButtonOrdinal), 1);
                hyy2.a(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO.menuButtonOrdinal), 2);
            } else {
                hyy2.a(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO.menuButtonOrdinal), 1);
            }
            hyy2.c(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO.menuButtonOrdinal), false);
            this.cOy();
            this.cOB();
        }
        this.w(lJC, this.lxw.cOh());
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

    private void cOE() {
        ehk ehk2 = (ehk)this.MessageDelegator.h(2327, this.GUID, lcr.qCM);
        this.MessageDelegator.F(ehk2);
    }

    private boolean pP(String string) {
        return string != null && string.equals(dsv.byP().iU());
    }

    private void pU(boolean bl) {
        jng jng2 = hso.cxK().cxP().czb();
        if (jng2 != null && jng2.HT()) {
            boolean bl2 = jng2.dNh();
            boolean bl3 = jng2.dNy();
            boolean bl4 = bl2;
            boolean bl5 = bl3;
            SFChatChannelInfoDTO sFChatChannelInfoDTO = this.lxw.cOg().clanChannel;
            sFChatChannelInfoDTO.isEnabled = bl2;
            if (bl && sFChatChannelInfoDTO.visibleConfigEntryName != null) {
                bl4 = bl4 && this.nk(sFChatChannelInfoDTO.visibleConfigEntryName) != false;
            }
            SFChatChannelInfoDTO sFChatChannelInfoDTO2 = this.lxw.cOg().clanAllianceChannel;
            sFChatChannelInfoDTO2.isEnabled = bl3;
            if (bl && sFChatChannelInfoDTO2.visibleConfigEntryName != null) {
                bl5 = bl5 && this.nk(sFChatChannelInfoDTO2.visibleConfigEntryName) != false;
            }
            this.c(sFChatChannelInfoDTO.id, bl4, false);
            this.c(sFChatChannelInfoDTO2.id, bl5, false);
            this.cOy();
            this.cOB();
            this.cOC();
        }
    }

    private void cOF() {
        jng jng2 = hso.cxK().cxP().czb();
        if (jng2 != null && jng2.HT()) {
            if (jng2.dNh()) {
                this.lxw.g(jng2.dNu().abC());
            } else {
                this.lxw.g(bbs.NoRank);
            }
        }
    }

    private void cOG() {
        hyy hyy2;
        hzo hzo2 = (hzo)idf.cxO();
        hyy hyy3 = hyy2 = hzo2 != null ? hzo2.cHx() : null;
        if (hyy2 != null) {
            float f = this.cEF();
            float f2 = this.getHeight();
            if (f2 < 410.0f) {
                hyy2.a(hyy.a.lrL, f - (410.0f - f2));
            } else {
                hyy2.a(hyy.a.lrL, f);
            }
        }
    }

    private void c(int n, boolean bl, boolean bl2) {
        if (this.lxw.aa(n, bl)) {
            SFChatChannelInfoDTO sFChatChannelInfoDTO = this.lxw.PY(n);
            if (sFChatChannelInfoDTO.visibleConfigEntryName != null) {
                this.q(sFChatChannelInfoDTO.visibleConfigEntryName, sFChatChannelInfoDTO.isVisible);
            }
            if (bl) {
                hyy hyy2 = idf.cyJ().cHx();
                hyy2.c(hyy.b.getValueByOrdinal(sFChatChannelInfoDTO.menuButtonOrdinal), false);
            }
            if (bl2) {
                this.cOy();
                this.cOB();
                this.cOC();
            }
        }
    }

    @llk
    private void setActiveChannelId(int n) {
        this.a(this.lxw.PY(n));
    }

    @llk
    private void setChannelVisibleById(int n, boolean bl) {
        this.c(n, bl, true);
    }

    @llk
    private void sendMessage(String string) {
        this.lxw.sendMessage(string);
        if (hso.cxK().cxN() == jnz.nFF) {
            hso.cxK().a(jnz.nFE);
        }
    }

    @llk
    private void setIgnoreKeyboard(boolean bl) {
        hso.cxK().cxR().setIgnoreKeyboard(bl);
    }

    @llk
    private void enterGameMode() {
        hso.cxK().a(jnz.nFE);
    }

    @llk
    private void setHeightOffset(double d2) {
        this.N(this.getWidth() / this.cEJ(), (this.cDc() - (float)d2) / this.cDc());
        idf.cyJ().updateLayout();
    }

    @llk
    private void onLinkLeftClicked(String string) {
        String[] stringArray = this.pO(string);
        if (stringArray != null && stringArray[0].equals("player") && !this.pP(stringArray[1])) {
            this.lxw.pL(stringArray[1]);
            this.cOD();
        }
    }

    @llk
    private void onLinkRightClicked(String string) {
        String[] stringArray = this.pO(string);
        if (stringArray != null && stringArray[0].equals("player") && !this.pP(stringArray[1])) {
            this.lxw.pL(stringArray[1]);
            if (this.lJN != null) {
                hso.cxK().cxP().c(this.lJN);
                this.lJN = null;
            }
        }
    }

    @llk
    private void onLinkMouseOver(String string) {
        String[] stringArray = this.pO(string);
        if (stringArray != null && stringArray[0].equals("player") && !this.pP(stringArray[1])) {
            this.b(hxv.llj);
        }
    }

    @llk
    private void onLinkMouseOut(String string) {
        String[] stringArray = this.pO(string);
        if (stringArray != null && stringArray[0].equals("player") && !this.pP(stringArray[1])) {
            this.b(hxv.llh);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        jng jng2;
        if (!this.lJP && (jng2 = hso.cxK().cxP().czb()) != null) {
            this.lJP = jng2.HT();
            if (this.lJP) {
                this.pU(true);
                this.cOF();
            }
        }
    }

    @Override
    public void oj() {
        this.pU(false);
        this.cOF();
    }

    @Override
    public void oi() {
        this.pU(false);
        this.cOF();
    }

    @Override
    public void rc(ldv ldv2) {
        this.pU(false);
    }

    @Override
    public void rd(ldv ldv2) {
    }

    @Override
    public void a(jmq jmq2) {
        if (jmq2 == jmq.nAP && this.cEU()) {
            this.a(this.lxw.cOj());
        }
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    @Override
    public void cyz() {
        this.cOF();
    }

    @Override
    public boolean b(hyy.b b2) {
        return lcw.emW() || b2.ordinal() != hyy.b.luN.ordinal();
    }

    @Override
    public void a(hyy.b b2, jnx jnx2) {
    }

    static /* synthetic */ void a(idf idf2) {
        idf2.cOD();
    }

    static /* synthetic */ idc b(idf idf2) {
        return idf2.lxw;
    }

    static /* synthetic */ void a(idf idf2, String string, int n) {
        idf2.E(string, n);
    }

    static /* synthetic */ hvj cOH() {
        return idf.cxP();
    }

    static /* synthetic */ hvj cOI() {
        return idf.cxP();
    }

    static /* synthetic */ hvj cOJ() {
        return idf.cxP();
    }

    static /* synthetic */ hvj cOK() {
        return idf.cxP();
    }

    static /* synthetic */ hvj cOL() {
        return idf.cxP();
    }

    static /* synthetic */ hvj cOM() {
        return idf.cxP();
    }
}

