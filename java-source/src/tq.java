/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cug
 *  ha
 *  lcr
 *  lcw
 */
import java.util.Map;

public class tq
extends btk {
    private static final int aUH = 0;
    private static final int aUI = 1;
    private static final int aUJ = 0;
    private static final int aUK = 1;
    private final ha hF;
    private boolean aUL = false;
    private static final boolean aUM = false;
    private ldv atv = null;
    private Map<Integer, Integer> aUN = lcn.emw();
    private Map<ldv, tp> aUO = lcn.emw();
    private static final int aUP = 5000;
    private gwn aUQ = null;
    private static final int atr = 1;
    private int aUR = 2;
    private Map<Integer, lei> aUS = lcn.emw();

    public tq(ha ha2) {
        this.hF = ha2;
    }

    public void a(cnh cnh2) {
        if (this.aUO.isEmpty()) {
            return;
        }
        assert (this.hF.jf() != null);
        if (!this.aUO.isEmpty()) {
            this.aq(false);
        }
        for (tp tp2 : this.aUO.values()) {
            int n = (int)((float)tp2.vf() * tp2.vn());
            if (n <= 0) continue;
            cte[] cteArray = new cte[]{new cte()};
            cteArray[0].ResourceType = tp2.az();
            cteArray[0].asi = n;
            cnh2.d(cteArray);
        }
        this.aUO.clear();
    }

    public void vr() {
        if (this.aUO.isEmpty()) {
            return;
        }
        assert (this.hF.jf() != null);
        if (!this.aUO.isEmpty()) {
            this.aq(false);
        }
        if (this.aUL) {
            return;
        }
        for (tp tp2 : this.aUO.values()) {
            int n = (int)((float)tp2.vf() * tp2.vq());
            if (n <= 0) continue;
            fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), this.hF.getGUID());
            int[] nArray = new int[1];
            int[] nArray2 = new int[1];
            nArray[0] = tp2.az();
            nArray2[0] = n;
            fmz2.bqd = nArray;
            fmz2.iIY = nArray2;
            fmz2.b(bqy.dGB);
            this.hF.receiveMessage((dxq)fmz2);
        }
        this.aUO.clear();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25606: {
                this.a((gwz)dxq2);
                break;
            }
            case 25614: {
                this.a((gwx)dxq2);
                break;
            }
            case 25605: {
                this.a((gwn)dxq2);
                break;
            }
            case 25608: {
                this.a((gwl)dxq2);
                break;
            }
            case 25611: {
                this.a((gws)dxq2);
                break;
            }
            case 4354: {
                this.a((gvn)dxq2);
                break;
            }
            case 4357: {
                this.a((gvt)dxq2);
                break;
            }
            case 18180: {
                this.b((esv)dxq2);
                break;
            }
            case 25613: {
                this.a((gwu)dxq2);
                break;
            }
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            case 7994: {
                this.a((fmy)dxq2);
                break;
            }
            case 7956: {
                this.b((fna)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gwz gwz2) {
        if (this.aUL) {
            return;
        }
        if (gwz2.gJy == null) {
            return;
        }
        if (lea.enW().isDescendant(gwz2.ResourceType, cug.fsA)) {
            this.b(gwz2);
        } else if (lea.enW().isDescendant(gwz2.ResourceType, cug.fsB)) {
            this.c(gwz2);
        } else assert (false);
    }

    private void a(gwx gwx2) {
        gwy gwy2 = (gwy)this.MessageDelegator.h(25615, this.getGUID(), gwx2.aO());
        this.MessageDelegator.b(gwx2, gwy2);
        if (this.aUS.isEmpty()) {
            this.MessageDelegator.F(gwy2);
            return;
        }
        int[] nArray = new int[this.aUS.size()];
        int[] nArray2 = new int[this.aUS.size()];
        int n = 0;
        for (Map.Entry<Integer, lei> entry : this.aUS.entrySet()) {
            nArray[n] = entry.getKey();
            nArray2[n] = entry.getValue().intValue();
            ++n;
        }
        gwy2.jsT = nArray;
        gwy2.jsU = nArray2;
        this.MessageDelegator.F(gwy2);
    }

    public boolean vs() {
        return !this.aUO.isEmpty();
    }

    private void b(gwz gwz2) {
        if (!this.aUO.isEmpty()) {
            int n = 0;
            for (tp tp2 : this.aUO.values()) {
                n += tp2.vf();
            }
            if (n >= 5000) {
                this.hF.c(mda.uEl.bD(new Object[0]));
                return;
            }
        }
        gwm gwm2 = (gwm)this.MessageDelegator.h(25604, this.getGUID(), gwz2.gJy);
        gwm2.diQ = this.hF.getGUID();
        this.MessageDelegator.F(gwm2);
        this.aUL = true;
    }

    private void c(gwz gwz2) {
        if (this.aUO.isEmpty()) {
            this.hF.c(mda.uEm.bD(new Object[0]));
            return;
        }
        gwt gwt2 = (gwt)this.MessageDelegator.h(25612, this.getGUID(), gwz2.gJy);
        gwt2.diQ = this.hF.getGUID();
        this.MessageDelegator.F(gwt2);
        this.aUL = true;
    }

    private void a(gwu gwu2) {
        assert (gwu2.gJy != null);
        assert (this.aUL);
        if (!this.aUO.containsKey(gwu2.gJy)) {
            this.hF.c(mda.uEn.bD(new Object[0]));
            this.aUL = false;
            return;
        }
        tp tp2 = this.aUO.get(gwu2.gJy);
        assert (tp2 != null);
        gwr gwr2 = (gwr)this.MessageDelegator.h(25610, this.getGUID(), gwu2.gJy);
        gwr2.diQ = this.hF.getGUID();
        gwr2.ResourceType = tp2.az();
        gwr2.asi = tp2.vf();
        gwr2.aUF = tp2.vm();
        this.MessageDelegator.F(gwr2);
    }

    private void a(gws gws2) {
        assert (this.aUL);
        this.aUL = false;
        assert (this.aUO.containsKey(gws2.aO()));
        switch (gws2.ew) {
            case 1: {
                this.hF.c(mda.uEn.bD(new Object[0]));
                return;
            }
            case 4: {
                this.hF.c(mda.uEo.bD(new Object[0]));
                return;
            }
            case 3: {
                this.hF.c(mda.uEp.bD(new Object[0]));
                this.cq(gws2.aO());
                return;
            }
            case 2: {
                this.hF.c(mda.uEq.bD(new Object[0]));
                return;
            }
            case 0: {
                assert (false);
                return;
            }
            case 5: {
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
        tp tp2 = this.aUO.get(gws2.aO());
        int n = this.cp(gws2.aO());
        assert (gws2.bqd != null);
        assert (gws2.iIY != null);
        assert (gws2.bqd.length > 0);
        assert (gws2.bqd.length == gws2.iIY.length);
        String string = lea.epe().get(tp2.vo()).bri();
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), this.hF.getGUID());
        fmz2.iIY = gws2.bqd;
        fmz2.bqd = gws2.iIY;
        fmz2.hsP = true;
        fmz2.b(bqy.dGA);
        this.hF.receiveMessage((dxq)fmz2);
        for (int i = 0; i < gws2.bqd.length; ++i) {
            if (i == 0) {
                if (gws2.jsS) {
                    this.hF.c(mda.uEs.bD(string, n, gws2.iIY[i], gws2.bqd[i]));
                    continue;
                }
                this.hF.c(mda.uEr.bD(string, n, gws2.iIY[i], gws2.bqd[i]));
                continue;
            }
            this.hF.c(mda.uEt.bD(string, gws2.iIY[i], gws2.bqd[i]));
        }
    }

    private void a(fmy fmy2) {
        assert (fmy2.iQF);
    }

    private void b(fna fna2) {
        assert (fna2.iQK);
    }

    private int cp(ldv ldv2) {
        tp tp2 = this.cq(ldv2);
        if (tp2 == null) {
            return -1;
        }
        this.a(tp2);
        return this.b(tp2);
    }

    private tp cq(ldv ldv2) {
        assert (this.aUO.containsKey(ldv2));
        tp tp2 = this.aUO.remove(ldv2);
        if (tp2 == null) {
            return null;
        }
        if (tp2.vg() != null) {
            this.a(tp2.vg());
        }
        if (this.aUO.isEmpty()) {
            this.aq(false);
        }
        return tp2;
    }

    private void a(tp tp2) {
        assert (tp2 != null);
        lei lei2 = this.aUS.get(tp2.vo());
        if (lei2 == null) {
            lei2 = new lei(0);
            this.aUS.put(tp2.vo(), lei2);
        }
        lei2.setValue(lei2.intValue() + 1);
        this.ds(tp2.vo());
    }

    private int b(tp tp2) {
        lei lei2 = this.aUS.get(tp2.vo());
        if (lei2 == null) {
            assert (false);
            return 0;
        }
        return lei2.intValue();
    }

    private void aq(boolean bl) {
        eq eq2 = this.hF.jf().jm().af(10496);
        if (eq2 == null) {
            assert (false);
        } else if (eq2.getBooleanValue() != bl) {
            eq2.x(bl);
        }
    }

    private void a(gwn gwn2) {
        assert (this.aUL);
        switch (gwn2.ew) {
            case 1: {
                this.hF.c(mda.uEj.bD(gwn2.aUD, gwn2.jsM));
                this.aUL = false;
                return;
            }
            case 3: {
                this.hF.c(mda.sdM.bD(gwn2.aUD));
                this.aUL = false;
                return;
            }
        }
        if (!this.hF.iY() || this.hF.iM()) {
            this.aUL = false;
            return;
        }
        if (this.hF.jf() == null) {
            this.aUL = false;
            return;
        }
        if (!this.hF.jf().aLU().aEP().isAlive()) {
            this.aUL = false;
            return;
        }
        bri bri2 = (bri)this.hF.jf().aJC().asf();
        int n = bri2.aup().mp(cug.fkb);
        if (n < gwn2.gKg) {
            this.hF.c(mda.uev.bD(gwn2.gKg, cug.fkb));
            this.aUL = false;
            return;
        }
        this.aUQ = gwn2;
        this.d(gwn2.aUD, gwn2.gKg);
    }

    private void d(String string, int n) {
        ldv ldv2 = this.MessageDelegator.bzv();
        double d2 = this.MessageDelegator.arc().rgz + 60.0;
        ldv ldv3 = lcr.p((ldv)lcr.aTZ, (int)this.hF.jr(), (int)this.hF.getGUID().enw());
        if (!lcw.qOR) {
            String[] stringArray = bdp.dbr;
            String string2 = "Do you want to spend " + n + " gold for a Trade Route Run?";
            bdr bdr2 = new bdr(ldv2, d2, string2, stringArray);
            bdr2.Title = "";
            est est2 = (est)this.MessageDelegator.h(18179, this.GUID, ldv3);
            est2.iBv = bdr2;
            this.MessageDelegator.F(est2);
        } else {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = ldv2;
            bdt2.dbE = lwq.tge.bD(n, cug.fkb);
            bdt2.ed = bdu.dbN.ordinal();
            esu esu2 = (esu)this.MessageDelegator.h(18183, this.getGUID(), ldv3);
            esu2.iBw = bdt2;
            this.MessageDelegator.F(esu2);
        }
        this.l(60.0);
    }

    private void l(double d2) {
        gvm gvm2 = (gvm)this.MessageDelegator.h(4353, this.GUID, this.MessageDelegator.getGUID());
        gvm2.gdA = 1;
        gvm2.Rs = this.GUID;
        gvm2.oV = 0.0;
        gvm2.eNV = d2;
        this.MessageDelegator.F(gvm2);
    }

    private void a(gvn gvn2) {
        assert (this.atv == null);
        if (gvn2.atv == null) {
            return;
        }
        this.atv = gvn2.atv;
    }

    private void a(gvt gvt2) {
        assert (this.atv != null);
        if (gvt2.atv == null) {
            assert (false);
            return;
        }
        if (!this.atv.equals(gvt2.atv)) {
            assert (false);
            return;
        }
        this.atv = null;
        this.aUQ = null;
        this.aUL = false;
    }

    private void vt() {
        assert (this.aUQ != null);
        bri bri2 = (bri)this.hF.jf().aJC().asf();
        int n = this.aUQ.gKg;
        if (bri2.aup().mp(cug.fkb) < n) {
            this.hF.c(mda.uev.bD(this.aUQ.gKg, cug.fkb));
            this.aUL = false;
            this.aUQ = null;
            return;
        }
        gwk gwk2 = (gwk)this.MessageDelegator.h(25607, this.getGUID(), this.aUQ.aUw);
        gwk2.jjU = this.aUQ.gKg;
        gwk2.diQ = this.hF.getGUID();
        this.MessageDelegator.F(gwk2);
    }

    private void a(gwl gwl2) {
        assert (this.aUL);
        assert (this.aUQ != null);
        switch (gwl2.ew) {
            case 1: {
                this.hF.c(mda.uEj.bD(this.aUQ.aUD, this.aUQ.jsM));
                this.aUL = false;
                this.aUQ = null;
                return;
            }
            case 2: {
                this.hF.c(mda.sdM.bD(this.aUQ.aUD));
                this.aUL = false;
                this.aUQ = null;
                return;
            }
        }
        bri bri2 = (bri)this.hF.jf().aJC().asf();
        int n = gwl2.asi;
        if (!bri2.aup().a(cug.fkb, n, bqy.dHO)) {
            this.hF.c(mda.uev.bD(cug.fkb, this.aUQ.gKg));
            this.aUL = false;
            this.aUQ = null;
            return;
        }
        tp tp2 = this.aUO.get(this.aUQ.aUw);
        if (tp2 != null) {
            tp2.dp(gwl2.asi);
        } else {
            tp2 = new tp();
            tp2.dq(this.aUR);
            tp2.P(this.aUQ.aUy);
            tp2.R(this.aUQ.aUz);
            tp2.Q(this.aUQ.aUA);
            tp2.S(this.aUQ.aUB);
            tp2.do(gwl2.asi);
            tp2.l(this.aUQ.gKh);
            tp2.co(this.aUQ.aUw);
            tp2.cg(gwl2.dyW);
            tp2.dr(this.aUQ.aUG);
            tp2.ch(this.aUQ.aUD);
            tp2.ai(gwl2.aZD);
            tp2.s(this.MessageDelegator.arc().rgz);
            this.aUO.put(this.aUQ.aUw, tp2);
            this.a(cug.fmm, tp2.vj(), tp2.vl(), this.aUR);
            ++this.aUR;
        }
        int n2 = (int)((float)tp2.vf() * tp2.vi());
        int n3 = (int)((float)tp2.vf() * tp2.vp());
        this.hF.c(mda.uEk.bD(gwl2.dyW, n2, n3, cug.fkb));
        this.aq(true);
        this.aUL = false;
        this.aUQ = null;
    }

    private void b(esv esv2) {
        if (esv2.iBx == null) {
            return;
        }
        if (this.atv == null) {
            return;
        }
        if (this.aUQ == null) {
            return;
        }
        this.bJ(this.atv);
        this.atv = null;
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getPersonalTradeRouteButtonType(n);
            if (a2 == null) {
                a2 = bdp.a.dbu;
            }
            switch (a2) {
                case dbt: {
                    this.vt();
                    return;
                }
                case dbu: {
                    this.aUQ = null;
                    this.aUL = false;
                    break;
                }
                default: {
                    this.aUQ = null;
                    this.aUL = false;
                    break;
                }
            }
        } else if (bdv2 instanceof bdx) {
            this.aUQ = null;
            this.aUL = false;
        } else {
            this.aUQ = null;
            this.aUL = false;
        }
    }

    private void bJ(ldv ldv2) {
        assert (ldv2 != null);
        gvr gvr2 = (gvr)this.MessageDelegator.h(4355, this.GUID, this.MessageDelegator.getGUID());
        gvr2.gdA = 1;
        gvr2.atv = ldv2;
        gvr2.jsw = false;
        this.MessageDelegator.F(gvr2);
    }

    private void a(int n, String string, ljq ljq2, int n2) {
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.hF.getGUID());
        eaa2.Position = ljq2;
        eaa2.aFo = string;
        eaa2.ResourceType = n;
        eaa2.aFp = false;
        eaa2.aqs = n2;
        this.hF.receiveMessage((dxq)eaa2);
    }

    private void a(atf atf2) {
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), this.hF.getGUID());
        eae2.iks = atf2.ID;
        eae2.aqs = 1;
        this.hF.receiveMessage((dxq)eae2);
    }

    private void a(eaf eaf2) {
        if (eaf2.aVk() == 1) {
            if (eaf2.ex != 3) {
                return;
            }
            return;
        }
        if (eaf2.ex != 2) {
            assert (false);
            return;
        }
        if (eaf2.Zn == null || eaf2.Zn.length != 1) {
            assert (false);
            return;
        }
        tp tp2 = null;
        for (tp tp3 : this.aUO.values()) {
            if (tp3.vh() != eaf2.aVk()) continue;
            tp2 = tp3;
            break;
        }
        if (tp2 == null) {
            this.a(eaf2.Zn[0]);
            assert (false);
            return;
        }
        tp2.b(eaf2.Zn[0]);
    }

    public void vu() {
        if (this.hF != null && this.hF.getGUID() != null) {
            if (lcw.enb()) {
                return;
            }
            String string = "Select TraderouteType,Counter From player_traderoutes Where GameID=" + lcw.qGe + " And   WorldID=" + lcw.qGf + " And   CharacterID=" + this.hF.getGUID().enw();
            kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.getGUID(), dxm.hpA);
            kdj2.wA("Darkfall_Read");
            kdj2.wB(string);
            kdj2.setContext(0);
            this.MessageDelegator.b(kdj2);
        } else {
            lfn.b(5, "SFPersonalTradeRouteManager", "loadTraderoutes() Traderoutes loading failed.");
            assert (false);
        }
    }

    private void ds(int n) {
        if (this.hF != null && this.hF.getGUID() != null) {
            String string = "Insert Into player_traderoutes(GameID,WorldID,CharacterID,TraderouteType,Counter) Values (" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + n + "," + 1 + ")" + " On Duplicate Key Update Counter=Counter + 1";
            kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.getGUID(), dxm.hpA);
            kdj2.wA("Darkfall");
            kdj2.wB(string);
            kdj2.setContext(1);
            this.MessageDelegator.b(kdj2);
        } else {
            lfn.b(5, "SFPersonalTradeRouteManager", "loadTraderoutes() Traderoutes saving failed.");
            assert (false);
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        int n = kcz2.getMessageType();
        switch (n) {
            case 260: {
                this.d((kdk)kcz2);
            }
        }
    }

    private void d(kdk kdk2) {
        lmg[] lmgArray = kdk2.dVr().euS();
        lmo[] lmoArray = kdk2.dVr().euT();
        int n = kdk2.getContext();
        int n2 = kdk2.dVr().getErrorCode();
        if (n2 != 0) {
            lfn.b(5, "SFPersonalTradeRouteManager", "handleMiddlewareSQLResultMessage() Query " + n + " failed with error code :" + n2);
            assert (false);
            return;
        }
        switch (n) {
            case 0: {
                this.a(lmoArray, lmgArray);
                break;
            }
            case 1: {
                break;
            }
            default: {
                assert (false) : "Unknown Response :" + n;
                break;
            }
        }
    }

    private void a(lmo[] lmoArray, lmg[] lmgArray) {
        if (lmoArray != null && lmoArray.length > 0) {
            for (int i = 0; i < lmoArray.length; ++i) {
                int n = -1;
                lei lei2 = null;
                lmi[] lmiArray = lmoArray[i].euV();
                assert (lmgArray.length == lmiArray.length);
                for (int j = 0; j < lmiArray.length; ++j) {
                    try {
                        switch (j) {
                            case 0: {
                                n = Integer.parseInt(lmiArray[j].toString());
                                break;
                            }
                            case 1: {
                                lei2 = lei.zw(lmiArray[j].toString());
                            }
                        }
                        continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        assert (false) : "Parsing problem in :" + lmiArray[j];
                        n = -1;
                        lei2 = null;
                        break;
                    }
                }
                if (n == -1 || lei2 == null) continue;
                this.aUS.put(n, lei2);
            }
        }
    }
}

