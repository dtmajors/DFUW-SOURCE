/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  hvj
 *  hvy
 *  hyn
 *  hzo
 *  jju
 *  lcr
 *  lcw
 */
import java.util.Map;

public class iev {
    private final hvj lPv;
    private final hzo lPw;
    private final dxr lPx;

    public iev(hvj hvj2, hzo hzo2, dxr dxr2) {
        this.lPv = hvj2;
        this.lPw = hzo2;
        this.lPx = dxr2;
    }

    public boolean Qp(int n) {
        if (n == cug.fua) {
            this.cQI();
            return true;
        }
        if (n == cug.fub) {
            this.cQH();
            return true;
        }
        if (n == cug.fui) {
            this.cQG();
            return true;
        }
        if (n == cug.fue) {
            this.cQF();
            return true;
        }
        if (n == cug.fuf) {
            this.cQE();
            return true;
        }
        if (n == cug.ftY) {
            this.cQD();
            return true;
        }
        if (n == cug.fuj) {
            this.cQC();
            return true;
        }
        if (cug.wG((int)n)) {
            this.Qq(n);
            return true;
        }
        return false;
    }

    private void Qq(int n) {
        civ civ2 = lea.epC().get(n);
        if (!(civ2 instanceof ciw)) {
            return;
        }
        ciw ciw2 = (ciw)civ2;
        switch (ciw2.BP()) {
            case bnq: {
                cix cix2 = (cix)ciw2;
                if (!jid.dHb().UJ(n)) break;
                ldj ldj2 = lea.eoF().get(cix2.aPL());
                if (ldj2 == null) {
                    assert (false) : "Invalid : " + cix2.aPL();
                    return;
                }
                this.lPv.v(mag.EmoteMessageAlreadyOwn.bD(ldj2.ipt));
                return;
            }
            case bnr: 
            case bns: 
            case bnt: 
            case bnu: 
            case bnv: 
            case bnw: 
            case bnx: 
            case bny: 
            case bnz: 
            case bnA: 
            case bnB: 
            case bnC: {
                ciy ciy2 = (ciy)ciw2;
                if (!jid.dHb().UJ(n)) break;
                this.lPv.v(mag.SkinMessageAlreadyOwn.bD(ciy2.aPN()));
                return;
            }
            default: {
                assert (false) : "UNIMPLEMENTED : " + (Object)((Object)ciw2.BP());
                break;
            }
        }
        this.lPv.czv().a(jgl.a.naw, -1, n, false);
    }

    private void cQC() {
        if (lcw.emW()) {
            lfn.b(5, "SFItemContainerWindow", "onElementDoubleClicked() Plex item can not be used in a korean server. CharacterID : " + hso.cxK().bAn().SN);
            assert (false) : "Plex item can not be used in a korean server";
            return;
        }
        this.lPv.czv().a(jgl.a.nau, -1, -1, false);
    }

    private void cQD() {
        int n;
        hvy hvy2 = this.lPv.cyZ();
        int n2 = hvy2.cAr();
        int n3 = this.lPv.cyZ().abF();
        if (n3 == (n = this.lPv.cyZ().akj()) + n2) {
            this.lPv.w(mcr.uxN.bD(new Object[0]));
            return;
        }
        if (hvy2 != null) {
            this.lPv.czv().a(jgl.a.naq, -1, -1, false);
        }
    }

    private void cQE() {
        hvy hvy2 = this.lPv.cyZ();
        if (hvy2 != null) {
            if (hvy2.cAK() > 0) {
                this.lPv.w(mcr.uyg.bD(cug.fue));
                return;
            }
            this.lPv.czv().a(jgl.a.nas);
        }
    }

    private void cQF() {
        hvy hvy2 = this.lPv.cyZ();
        if (hvy2 != null) {
            if (hvy2.cAJ() > 0) {
                this.lPv.w(mcr.uyg.bD(cug.fuf));
                return;
            }
            this.lPv.czv().a(jgl.a.nar);
        }
    }

    private void cQG() {
        hvy hvy2 = this.lPv.cyZ();
        if (hvy2 != null) {
            if (hvy2.cAC() < hvy2.cAD()) {
                this.lPv.v(mcr.uye.bD(hvy2.cAD() - hvy2.cAC(), cug.fui));
                return;
            }
            this.lPv.czv().a(jgl.a.nat, -1, cug.fui, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cQH() {
        cew cew2 = (cew)this.lPx.bzx().bzt().d(hso.cxK().bAn().gYY);
        byv byv2 = cew2.aJD().aEP();
        cfz cfz2 = (cfz)this.lPx.bzx().bzt().d(lcr.qCk);
        if (cfz2 != null && cfz2.aNP() != cfz.a.ewk) {
            this.lPv.v(mcr.uyn.bD(cug.fub));
            return;
        }
        for (Map.Entry entry : this.lPw.cId().entrySet()) {
            int n = (Integer)entry.getKey();
            if (n == hzo.a.lyH.ordinal() || n == hzo.a.lyG.ordinal() || n == hzo.a.lyS.ordinal() || n == hzo.a.lyX.ordinal() || !((hyn)entry.getValue()).isVisible()) continue;
            this.lPv.v(mcr.uym.bD(cug.fub));
            return;
        }
        if (this.lPw.cIU() != null && this.lPw.cIU().cQe().size() > 0) {
            this.lPv.v(mcr.uyp.bD(cug.fub));
            return;
        }
        if (this.lPw.cIm() != null && this.lPw.cIm().cEU()) {
            this.lPv.v(mcr.uyo.bD(cug.fub));
            return;
        }
        if (byv2.vO() != 6) {
            this.lPv.v(mcr.uyl.bD(cug.fub));
            return;
        }
        if (this.lPw.cIw() != null && this.lPw.cIw().isVisible()) {
            this.lPv.v(mcr.uym.bD(cug.fub));
            return;
        }
        jju jju2 = this.lPw.cHB();
        if (jju2.dKh()) {
            if (lmf.rEz.equals((Object)jju2.dKn())) {
                this.lPv.czv().a(jgl.a.nav, -1, cug.fub, false);
                return;
            }
        }
        this.lPv.v(mcr.uyk.bD(cug.fub));
    }

    private void cQI() {
        int n;
        hvy hvy2 = this.lPv.cyZ();
        if (hvy2 == null) {
            return;
        }
        double d2 = hvy2.cAC();
        if (d2 < (double)(n = hvy2.cAE())) {
            this.lPv.v(mcr.tBE.bD((double)n - d2, cug.fua));
            return;
        }
        this.lPv.czv().a(jgl.a.nap, -1, cug.fua, false);
    }
}

