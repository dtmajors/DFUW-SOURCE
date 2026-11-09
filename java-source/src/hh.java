/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  en
 *  ha
 *  lcr
 */
import java.util.Map;

public class hh
extends btk
implements bto {
    private static final String TC = "SFPlayerRelicManagerServer";
    private static final double abK = 1000.0;
    private static final double abL = 60000.0;
    private final ayc abM = lea.epQ();
    private final cex abN;
    private int abO = -1;
    private b abP;
    private Map<Integer, eac> abQ = lcn.emw();
    private int abR = 0;
    private Map<Integer, Integer> abS = lcn.emw();
    private ldv abT = null;
    private double abo = 0.0;
    private double abU = -1.0;
    private double abV = -1.0;
    private double abW = 0.0;
    private ldv abX = null;
    private int abY = 0;

    private void a(gep gep2) {
        if (this.abN.mA() == null) {
            lfn.b(5, TC, "handleRelicInteractionMessage() Persistent session object is not valid");
            return;
        }
        if (this.abP != null) {
            this.abN.c(mcp.uum.bD(cug.fwy));
            return;
        }
        boolean bl = gep2.bUw();
        if (bl) {
            if (this.abO == -1) {
                this.abN.c(mcp.uwW.bD(cug.fww));
                return;
            }
            this.abP = new b(this, a.acc, gep2, c.acp, ayc.cvY, gep2.lI());
            if (this.abN.aLU() != null && this.abN.aLU().aDc() != null) {
                if (ayc.cwc != -1) {
                    this.abN.aLU().aDc().nH(ayc.cwc);
                }
            }
            this.a(ayc.cvY, c.acp.ordinal());
            return;
        }
        int n = gep2.bUv();
        if (this.abO != -1) {
            if (n != -1) {
                ayc.a a2 = this.abM.iK(n);
                assert (a2 != null);
                this.abN.c(mcp.uwM.bD(cug.fww, cug.fwy));
                return;
            }
            this.abP = new b(this, a.acb, gep2, c.aco, ayc.cvW, gep2.lI());
        } else {
            if (n == -1) {
                this.abN.c(mcp.uwN.bD(cug.fww, cug.fwy));
                return;
            }
            this.abP = new b(this, a.acb, gep2, c.acn, ayc.cvX, gep2.lI());
        }
        gex gex2 = (gex)this.MessageDelegator.h(35077, this.getGUID(), gep2.bUu());
        gex2.lT(this.abP.aci == c.acn);
        gex2.oC(this.abN.mA().iG());
        this.MessageDelegator.F(gex2);
    }

    private void a(gey gey2) {
        int n = gey2.getResultCode();
        loz loz2 = null;
        boolean bl = false;
        switch (n) {
            case 1: {
                loz2 = mcp.uwO.bD(cug.fwy);
                break;
            }
            case 4: {
                loz2 = mcp.uwS.bD(cug.fwy);
                break;
            }
            case 2: {
                loz2 = mcp.uwR.bD(cug.fwy);
                break;
            }
            case 3: {
                loz2 = mcp.uwP.bD(cug.fwy);
                break;
            }
            case 0: {
                loz2 = mcp.uwQ.bD(cug.fwy);
                break;
            }
            case 5: {
                bl = true;
            }
        }
        if (!bl) {
            this.abP = null;
            this.abN.c(loz2);
            return;
        }
        if (this.abP == null) {
            if (bl) {
                this.lB();
            }
            return;
        }
        this.abP.acg = a.acc;
        if (this.abN.aLU() != null && this.abN.aLU().aDc() != null) {
            switch (this.abP.aci) {
                case acq: {
                    if (ayc.cwd == -1) break;
                    this.abN.aLU().aDc().nH(ayc.cwd);
                    break;
                }
                case acp: {
                    if (ayc.cwc == -1) break;
                    this.abN.aLU().aDc().nH(ayc.cwc);
                    break;
                }
                case acn: {
                    if (ayc.cwb == -1) break;
                    this.abN.aLU().aDc().nH(ayc.cwb);
                    break;
                }
                case aco: {
                    if (ayc.cwa == -1) break;
                    this.abN.aLU().aDc().nH(ayc.cwa);
                }
            }
        }
        this.a(this.abP.acj, this.abP.aci.ordinal());
    }

    private void a(fdu fdu2) {
        if (this.abP == null) {
            lfn.b(5, TC, "handleFunctionUseObjectDelayResponseMessage() There is no pending request for player : " + this.abN.getGUID());
            return;
        }
        boolean bl = fdu2.bOA();
        c c2 = c.getValueByOrdinal(fdu2.aVk());
        switch (c2) {
            case aco: {
                if (bl && this.abO != -1) {
                    gep gep2 = (gep)this.abP.ach;
                    gfb gfb2 = (gfb)this.MessageDelegator.h(35080, this.getGUID(), gep2.bUu());
                    gfb2.gO(this.abO);
                    gfb2.kV(this.abN.mA() != null ? this.abN.mA().iV() : null);
                    gfb2.fm(this.abN.mA() != null ? this.abN.mA().iU() : null);
                    gfb2.oH(this.abN.mA() != null ? this.abN.mA().getGUID() : null);
                    this.MessageDelegator.F(gfb2);
                    this.abP = null;
                    this.abO = -1;
                    en en2 = (en)this.abN.fi();
                    if (en2 != null) {
                        en2.i(13696, this.abO);
                    }
                    return;
                }
                this.lB();
                this.abP = null;
                this.abN.c(mcp.uwT.bD(cug.fwy));
                break;
            }
            case acn: {
                if (bl) {
                    if (this.abO == -1) {
                        gep gep3 = (gep)this.abP.ach;
                        gfe gfe2 = (gfe)this.MessageDelegator.h(35081, this.getGUID(), gep3.bUu());
                        gfe2.kV(this.abN.mA() != null ? this.abN.mA().iV() : null);
                        gfe2.fm(this.abN.mA() != null ? this.abN.mA().iU() : null);
                        gfe2.oH(this.abN.mA() != null ? this.abN.mA().getGUID() : null);
                        this.MessageDelegator.F(gfe2);
                        this.abP.acg = a.acd;
                        return;
                    }
                    assert (false) : "RelicID : " + this.abO;
                    this.abP = null;
                    this.abN.c(mcp.uwU.bD(cug.fwy));
                    return;
                }
                this.lB();
                this.abP = null;
                this.abN.c(mcp.uwU.bD(cug.fwy));
                break;
            }
            case acp: {
                if (bl) {
                    this.lA();
                } else if (this.abO != -1) {
                    ayc.a a2 = this.abM.iK(this.abO);
                    assert (a2 != null);
                    this.abN.c(mcp.uwV.bD(a2.ZD()));
                }
                this.abP = null;
                break;
            }
            case acq: {
                this.a(bl, this.abP.ach.aO(), ((ges)this.abP.ach).aVk());
                this.abP = null;
                if (bl) break;
                this.abN.c(mcp.uwL.bD(cug.fwx));
                break;
            }
            default: {
                assert (false) : "Type : " + (Object)((Object)c2);
                break;
            }
        }
        if (!bl && this.abN.aLU() != null && this.abN.aLU().aDc() != null) {
            cat cat2;
            int n = 65539;
            if (this.abN.aKu() != null && !(cat2 = (cat)this.abN.aKu()).aGR()) {
                n = 65566;
            }
            this.abN.aLU().aDc().nH(n);
        }
    }

    private void a(gff gff2) {
        int n = gff2.bUD();
        switch (n) {
            case 2: {
                this.abP = null;
                this.abN.c(mcp.uxb.bD(cug.fwy));
                break;
            }
            case 1: {
                this.abP = null;
                this.abN.c(mcp.uxc.bD(cug.fwy));
                break;
            }
            case 0: {
                this.abP = null;
                this.abN.c(mcp.uxd.bD(new Object[0]));
                break;
            }
            case 3: {
                ayc.a a2;
                if (this.abP == null) {
                    this.ca(gfg.a.jfZ.ordinal());
                    return;
                }
                this.abO = gff2.lF();
                this.abP = null;
                en en2 = (en)this.abN.fi();
                if (en2 != null) {
                    en2.i(13696, this.abO);
                }
                if ((a2 = this.abM.iK(this.abO)) == null) {
                    assert (false);
                    for (ayc.a a3 : this.abM.Zw()) {
                        lfn.b(5, TC, "handleRelicStealResponseMessage() Relic : " + a3.lF());
                    }
                    return;
                }
                this.abN.c(mcp.uxe.bD(a2.ZD()));
            }
        }
    }

    private void lA() {
        en en2;
        if (this.abN.mA() == null) {
            lfn.b(5, TC, "handleRelicLockAltarResponseMessage() Persistent session object is not valid");
            return;
        }
        if (this.abO == -1) {
            lfn.b(5, TC, "handleRelicLockAltarResponseMessage() Player does not have an active relic to sacrifice.");
            return;
        }
        ayc.a a2 = this.abM.iK(this.abO);
        if (a2 == null) {
            lfn.b(5, TC, "handleRelicLockAltarResponseMessage() Invalid relic ID : " + this.abO);
            assert (false);
            for (ayc.a a3 : this.abM.Zw()) {
                lfn.b(5, TC, "handleRelicSacrificeRequest() Relic : " + a3.lF());
            }
            return;
        }
        if (a2.ZE() > 0) {
            this.abN.mA().kz().a(tv.aVQ, a2.ZE(), "RelicID : " + this.abO);
        }
        if (a2.GC() != -1) {
            this.abN.l(a2.GC(), this.abP.ack);
        }
        if ((en2 = (en)this.abN.fi()) != null) {
            en2.i(13696, -1);
            int n = en2.ap(13712);
            boolean bl = n > 0;
            n = (int)(this.abU / 1000.0 + (double)this.abM.getTimeToLive() * 60.0 * 1.0);
            en2.i(13712, n);
            int n2 = n - (int)(this.abU / 1000.0);
            this.a(cxd.fLu, bfk.dho, n2);
            this.abN.mA().f(mcp.uxf.bD(new Object[0]));
            this.cb(3);
            if (!bl && this.abN.aKu() != null) {
                assert (this.abX == null);
                this.abX = ((cat)this.abN.aKu()).ou(cug.fud);
                assert (this.abX != null);
            }
        }
        this.ca(gfg.a.jga.ordinal());
        ldv ldv2 = this.abN.mA().getGUID();
        if (this.abN.mA().jM() != null && !this.abN.mA().jM().equals(ldv.rfd)) {
            ldv2 = this.abN.mA().jM();
        }
        fsv fsv2 = (fsv)this.MessageDelegator.h(30213, this.abN.mA().getGUID(), ldv2);
        fsv2.SkillType = cxd.fLs;
        fsv2.ResourceType = a2.ZD();
        fsv2.dtZ = cha.ezz.ordinal();
        fsv2.iVw = true;
        fsv2.Position = this.abN.aAG() != null && this.abN.aAG().azb() != null ? this.abN.aAG().azb() : new ljq(0.0f, 0.0f, 0.0f);
        this.MessageDelegator.F(fsv2);
        this.abO = -1;
    }

    private void a(gew gew2) {
        boolean bl;
        this.abY = gew2.lG();
        if (this.abN.mA() == null) {
            return;
        }
        en en2 = (en)this.abN.fi();
        if (en2 == null) {
            return;
        }
        ldv ldv2 = gew2.bUx();
        cer.f(this.abN);
        cer.i(this.abN);
        cer.m(this.abN);
        boolean bl2 = bl = this.abN.mA().getGUID().equals(ldv2) && gew2.bHc() == 3;
        if (bl) {
            en2.c(352, en2.al(354));
            en2.c(384, en2.al(386));
            en2.c(400, en2.al(402));
        }
    }

    private void a(int n, int n2, int n3) {
        assert (n > 0);
        assert (n2 > 0);
        if (this.abT != null) {
            this.abN.jm().C(this.abT);
            this.abT = null;
        }
        this.abT = this.abN.getMessageDelegator().bzv();
        als als2 = new als();
        als2.setGUID(this.abT);
        als2.x(n3);
        als2.ga(2);
        als2.gb(0);
        als2.gc(0);
        als2.cP(this.abN.getGUID());
        als2.gd(this.abN.az());
        als2.ge(n);
        als2.fJ(n2);
        als2.gf(1);
        als2.fC(10640);
        als2.ar(0.0f);
        als2.aq(1.0f);
        als2.as(1.0f);
        this.abN.a(als2, this.abN.aAG().av(), null, null);
    }

    private void a(gev gev2) {
        if (this.abO == -1) {
            return;
        }
        if (this.abP != null) {
            ayc.a a2 = this.abM.iK(this.abO);
            assert (a2 != null);
            this.abN.c(mcp.uwY.bD(a2.ZD()));
            return;
        }
        this.a(this.abN.mA(), gfg.a.jgd.ordinal());
    }

    private void a(double d2, int n) {
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.getGUID(), this.abN.getGUID());
        fdt2.sk(n);
        fdt2.kU(true);
        fdt2.cz(d2);
        fdt2.kV(false);
        fdt2.iW(0.3926991f);
        fdt2.kT(true);
        this.MessageDelegator.F(fdt2);
    }

    private void lB() {
        if (this.abP == null) {
            return;
        }
        gep gep2 = (gep)this.abP.ach;
        gfc gfc2 = (gfc)this.MessageDelegator.h(35079, this.getGUID(), gep2.bUu());
        this.MessageDelegator.F(gfc2);
    }

    private void a(ha ha2, int n) {
        if (this.abP != null) {
            switch (this.abP.acg) {
                case acb: {
                    lfn.b(5, TC, "updatePlayerState() UpdateType : " + n + " in locking state.");
                    break;
                }
                case acc: {
                    lfn.b(5, TC, "updatePlayerState() UpdateType : " + n + " in channeling state.");
                    break;
                }
                case acd: {
                    lfn.b(5, TC, "updatePlayerState() UpdateType : " + n + " in stealing state.");
                    break;
                }
                case ace: {
                    lfn.b(5, TC, "updatePlayerState() UpdateType : " + n + " in unlocking state.");
                }
            }
        }
        if (this.abO == -1) {
            return;
        }
        this.ca(n);
        this.abO = -1;
        en en2 = (en)this.abN.fi();
        if (en2 != null) {
            en2.i(13696, this.abO);
        }
    }

    public boolean lC() {
        return this.abO != -1;
    }

    public boolean lD() {
        return this.abX != null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 35073: {
                this.a((ges)dxq2);
                break;
            }
            case 35075: {
                this.a((geu)dxq2);
                break;
            }
            case 35076: {
                this.a((gep)dxq2);
                break;
            }
            case 35078: {
                this.a((gey)dxq2);
                break;
            }
            case 35082: {
                this.a((gff)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            case 35084: {
                this.a((gev)dxq2);
                break;
            }
            case 35086: {
                this.a((ger)dxq2);
                break;
            }
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            case 35087: {
                this.b((geq)dxq2);
                break;
            }
            case 35088: {
                this.a((gew)dxq2);
            }
        }
    }

    private void b(geq geq2) {
        if (this.abN.aMR() == null) {
            return;
        }
        if (this.abN.mA() != null && geq2.bUx().equals(this.abN.mA().getGUID())) {
            return;
        }
        this.abN.aMR().a(geq2.av(), cug.fkL, geq2.iU(), 55.0);
    }

    public hh(cex cex2) {
        this.abN = cex2;
    }

    private void a(ges ges2) {
        ldv ldv2 = ges2.aO();
        if (!ldv2.equals(lcr.qAY)) {
            assert (false) : "Registration message did not come from stats module.";
            return;
        }
        if (this.abP != null) {
            this.a(false, ges2.aO(), ges2.aVk());
            return;
        }
        if (this.abO != -1) {
            this.abN.c(mcp.uwL.bD(cug.fwx));
            this.a(false, ges2.aO(), ges2.aVk());
            return;
        }
        if (this.abN.mA() == null) {
            this.a(false, ges2.aO(), ges2.aVk());
            return;
        }
        if (this.abN.aAG() == null) {
            this.a(false, ges2.aO(), ges2.aVk());
            return;
        }
        if (this.abN.aIq()) {
            this.a(false, ges2.aO(), ges2.aVk());
            this.abN.c(mcp.uwX.bD(new Object[0]));
            return;
        }
        en en2 = (en)this.abN.fi();
        if (en2 == null) {
            this.a(false, ges2.aO(), ges2.aVk());
            return;
        }
        this.abP = new b(this, a.ace, ges2, c.acq, ayc.cvZ, null);
        if (this.abN.aLU() != null && this.abN.aLU().aDc() != null) {
            if (ayc.cwd != -1) {
                this.abN.aLU().aDc().nH(ayc.cwd);
            }
        }
        this.a(ayc.cvZ, c.acq.ordinal());
    }

    private void a(geu geu2) {
        int n = geu2.lF();
        if (n == -1) {
            assert (false);
            return;
        }
        ldv ldv2 = geu2.aO();
        if (!ldv2.equals(lcr.qAY)) {
            assert (false) : "Registration message did not come from stats module.";
            return;
        }
        if (this.abP != null) {
            return;
        }
        if (this.abO != -1) {
            return;
        }
        if (this.abN.mA() == null) {
            return;
        }
        if (this.abN.aAG() == null) {
            return;
        }
        en en2 = (en)this.abN.fi();
        if (en2 == null) {
            return;
        }
        this.abO = n;
        en2.i(13696, this.abO);
        this.ca(gfg.a.jfU.ordinal());
        ayc.a a2 = this.abM.iK(this.abO);
        if (a2 == null) {
            assert (false) : "There is no relic with ID : " + this.abO;
            for (ayc.a a3 : this.abM.Zw()) {
                lfn.b(5, TC, "handleRelicChestUnlockedMessage() Relic : " + a3.lF());
            }
            return;
        }
        this.abN.c(mcp.uxe.bD(a2.ZD()));
    }

    public void a(boolean bl, ldv ldv2, int n) {
        get get2 = (get)this.MessageDelegator.h(35074, this.getGUID(), ldv2);
        get2.lS(bl);
        get2.sk(n);
        this.MessageDelegator.F(get2);
    }

    private void ca(int n) {
        gfg gfg2 = (gfg)this.MessageDelegator.h(35083, this.getGUID(), lcr.qAY);
        gfg2.Eh(n);
        gfg2.gO(this.abO);
        gfg2.oH(this.abN.mA() != null ? this.abN.mA().getGUID() : null);
        gfg2.kV(this.abN.mA() != null ? this.abN.mA().iV() : null);
        gfg2.fm(this.abN.mA() != null ? this.abN.mA().iU() : null);
        gfg2.c(this.abN.aAG() != null ? this.abN.aAG().azb() : null);
        this.MessageDelegator.F(gfg2);
    }

    private void cb(int n) {
        if (this.abN.mA() == null) {
            assert (false);
            return;
        }
        gew gew2 = (gew)this.MessageDelegator.h(35088, this.getGUID(), lcr.qAY);
        gew2.Eh(n);
        gew2.qm(this.abN.mA().getGUID());
        this.MessageDelegator.F(gew2);
    }

    public void lE() {
        if (this.abS.isEmpty()) {
            return;
        }
        for (int n : this.abS.values()) {
            this.cc(n);
        }
        this.abS.clear();
    }

    private void a(ger ger2) {
        int n;
        int n2 = ger2.bUz();
        if (n2 != -1) {
            Integer n3 = this.abS.get(n2);
            if (n3 != null) {
                assert (false);
            } else {
                this.a(ger2.av(), cug.uV((int)n2), n2);
            }
        }
        if ((n = ger2.bUy()) != -1) {
            Integer n4 = this.abS.remove(n);
            if (n4 == null) {
                assert (false);
                return;
            }
            this.cc(n4);
        }
    }

    private void a(ljq ljq2, String string, int n) {
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.abN.getGUID());
        eaa2.Position = ljq2;
        eaa2.aFo = string;
        eaa2.ResourceType = n;
        eaa2.aFp = false;
        eaa2.aqs = this.abR;
        this.abN.receiveMessage((dxq)eaa2);
        this.abQ.put(this.abR, eaa2);
        ++this.abR;
    }

    private void a(eaf eaf2) {
        eac eac2 = this.abQ.remove(eaf2.aVk());
        assert (eac2 != null);
        if (eaf2.ex == 3) {
            return;
        }
        if (eaf2.ex == 5) {
            lfn.b(5, TC, "handleAnnotationResponseMessage() Annotation removal failed.");
            assert (false);
            return;
        }
        if (eaf2.ex != 2) {
            lfn.b(5, TC, "handleAnnotationResponseMessage() Failed in adding annotation. Responsetype: " + eaf2.ex);
            assert (false);
            return;
        }
        if (eaf2.Zn == null || eaf2.Zn.length != 1) {
            lfn.b(5, TC, "handleAnnotationResponseMessage() Annotations fucked up");
            assert (false);
            return;
        }
        if (eac2 instanceof eaa) {
            atf atf2 = eaf2.Zn[0];
            this.abS.put(((eaa)eac2).ResourceType, atf2.ID);
        }
    }

    private void cc(int n) {
        eae eae2 = (eae)this.abN.getMessageDelegator().h(22786, this.getGUID(), this.abN.getGUID());
        eae2.iks = n;
        eae2.sk(this.abR);
        this.abN.receiveMessage((dxq)eae2);
        this.abQ.put(this.abR, eae2);
        ++this.abR;
    }

    public void lw() {
        int n;
        assert (this.abT == null);
        en en2 = (en)this.abN.fi();
        if (en2 != null && (n = en2.ap(13712)) > 0) {
            if (this.abU < 0.0) {
                this.abU = this.MessageDelegator.bzy().getTimeInMillis();
            }
            int n2 = n - (int)(this.abU / 1000.0);
            this.a(cxd.fLu, bfk.dho, n2);
            this.cb(0);
            if (this.abN.aKu() != null) {
                assert (this.abX == null);
                this.abX = ((cat)this.abN.aKu()).ou(cug.fud);
                assert (this.abX != null);
            }
        }
    }

    public void c(ha ha2) {
        int n;
        en en2 = (en)this.abN.fi();
        if (en2 != null && (n = en2.ap(13712)) > 0) {
            this.cb(1);
        }
        this.a(ha2, gfg.a.jfW.ordinal());
    }

    public void d(ha ha2) {
        Object object;
        if (ha2 != null) {
            object = (en)this.abN.fi();
            if (object != null) {
                ew ew2 = object.ao(13712);
                if (ew2.fQ() > 0) {
                    this.abN.mA().f(mcp.uxg.bD(new Object[0]));
                }
                ew2.bi(0);
            }
            this.cb(2);
        }
        this.a(ha2, gfg.a.jfV.ordinal());
        object = (cat)this.abN.aKu();
        if (object != null) {
            ((cat)object).kg(this.abX);
        }
        this.abX = null;
    }

    public void e(ha ha2) {
        this.a(ha2, gfg.a.jfX.ordinal());
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.abU < 0.0) {
            this.abU = this.MessageDelegator.bzy().getTimeInMillis();
        }
        if (this.abV != -1.0) {
            double d2 = (ldz2.rgz - this.abV) * 1000.0;
            this.abU += d2;
        }
        this.abV = ldz2.rgz;
        if (this.abU - this.abo < 1000.0) {
            return;
        }
        this.abo = this.abU;
        int n = this.abN.fi().ap(13712);
        if (n > 0) {
            if (this.abU / 1000.0 > (double)n) {
                this.abN.fi().i(13712, 0);
                this.abN.jm().C(this.abT);
                this.abN.c(mcp.uxa.bD(new Object[0]));
                this.abY = 0;
                cer.f(this.abN);
                cer.i(this.abN);
                cer.m(this.abN);
                this.cb(4);
                if (this.abN.aKu() != null) {
                    assert (this.abX != null);
                    ((cat)this.abN.aKu()).kg(this.abX);
                    this.abX = null;
                }
                return;
            }
            if (this.abU - this.abW < 60000.0) {
                return;
            }
            this.abW = this.abU;
            if (this.abN.mA() != null && this.abN.aAG() != null && this.abN.aAG().azb() != null) {
                geq geq2 = (geq)this.MessageDelegator.h(35087, this.abN.mA().getGUID(), lcr.hac);
                geq2.fm(this.abN.mA().iU());
                geq2.qm(this.abN.mA().getGUID());
                geq2.c(this.abN.aAG().azb());
                this.MessageDelegator.E(geq2);
            }
        }
    }

    public final int lF() {
        return this.abO;
    }

    public final int lG() {
        return this.abY;
    }
}

