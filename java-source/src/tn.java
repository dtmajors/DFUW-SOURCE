/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 *  lcw
 */
public class tn
extends btk {
    public static final String TC = "SFPlayerSummonFriendManager";
    public static final double aTX = 15.0;
    private final cex aaY;
    private ldv atv = null;
    private efg aTY = null;
    private ldv aTZ = null;
    private ldv aUa = null;

    public void uW() {
        if (this.aTY == null || this.atv != null) {
            return;
        }
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, this.aaY.getGUID());
        fdt2.kU(true);
        this.MessageDelegator.I(fdt2);
    }

    private void a(efg efg2) {
        boolean bl;
        if (!this.uX()) {
            this.f(5, efg2.aO());
            return;
        }
        if (this.aTY != null) {
            this.f(7, efg2.aO());
            return;
        }
        if (!this.aaY.mA().iY()) {
            this.f(6, efg2.aO());
            return;
        }
        if (this.aaY.mp()) {
            this.f(5, efg2.aO());
            return;
        }
        if (this.aaY.lF() != -1) {
            this.f(5, efg2.aO());
            return;
        }
        if (this.aaY.mA().aD(efg2.qd())) {
            this.f(0, efg2.aO());
            return;
        }
        ljq ljq2 = this.aaY.aAG().azb();
        boolean bl2 = bl = ljq2.y < -1000.0f;
        if (bl) {
            this.f(9, efg2.aO());
            return;
        }
        int n = this.aaY.mA().kU();
        if (this.aaY.mA().kU() > 0) {
            int n2 = -1;
            switch (n) {
                case 3: {
                    n2 = 10;
                    break;
                }
                case 1: 
                case 5: {
                    n2 = 11;
                }
            }
            if (n2 != -1) {
                this.f(n2, efg2.aO());
                return;
            }
        }
        this.aTY = efg2;
        double d2 = this.MessageDelegator.arc().rgz + 60.0;
        this.aTZ = lcr.p((ldv)lcr.aTZ, (int)this.aaY.mA().jr(), (int)this.aaY.mA().getGUID().enw());
        String string = "Unknown Location";
        String string2 = lcw.dZ((ljq)this.aTY.av());
        if (string2 != null) {
            string = lea.eoS().get(string2.toLowerCase());
        }
        if (!lcw.qOR) {
            String string3 = "Would you like to be summoned by " + this.aTY.iU() + " in " + string + "?";
            String[] stringArray = bdp.dbh;
            bdr bdr2 = new bdr(this.GUID, d2, string3, stringArray);
            bdr2.Title = "Summoning Request";
            est est2 = (est)this.MessageDelegator.h(18179, this.GUID, this.aTZ);
            est2.iBv = bdr2;
            this.MessageDelegator.F(est2);
        } else {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = this.GUID;
            bdt2.dbE = lwq.tfY.bD(this.aTY.iU());
            bdt2.ed = bdu.dbP.ordinal();
            bdt2.Ri = this.aTY.qd();
            esu esu2 = (esu)this.MessageDelegator.h(18183, this.getGUID(), this.aTZ);
            esu2.iBw = bdt2;
            this.MessageDelegator.F(esu2);
        }
        this.l(d2);
    }

    private void a(gvn gvn2) {
        assert (this.atv == null);
        assert (this.aTY != null);
        if (gvn2.atv == null) {
            lfn.b(5, TC, "handleTimerCreateResponse() TimerGUID is null. Timer could not be created.");
            assert (false);
            this.f(5, this.aTY.aO());
            this.aTY = null;
            return;
        }
        this.atv = gvn2.atv;
    }

    private void a(gvt gvt2) {
        if (this.atv == null) {
            return;
        }
        if (this.aTY == null) {
            assert (false);
            return;
        }
        if (gvt2.atv == null) {
            lfn.b(5, TC, "handleTimerTimeoutMessage() Message.TimerGUID is null.");
        } else if (!this.atv.equals(gvt2.atv)) {
            lfn.b(5, TC, "handleTimerTimeoutMessage() TimerGUID is not equal to Message.TimerGUID. TimerGUID=" + this.atv + " Message.TimerGUID=" + gvt2.atv);
        }
        this.f(2, this.aTY.aO());
        this.atv = null;
        this.aTZ = null;
        this.aTY = null;
    }

    private void b(esv esv2) {
        if (this.atv == null) {
            return;
        }
        if (this.aTY == null) {
            return;
        }
        if (!this.uX()) {
            this.f(5, this.aTY.aO());
            this.bJ(this.atv);
            this.atv = null;
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (!this.aaY.mA().iY()) {
            this.f(6, this.aTY.aO());
            this.bJ(this.atv);
            this.atv = null;
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (this.aaY.mp()) {
            this.f(5, this.aTY.aO());
            this.bJ(this.atv);
            this.atv = null;
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (esv2.iBx == null) {
            lfn.b(5, TC, "handleConfirmationResponse() ConfirmationRespose is null.");
            this.f(5, this.aTY.aO());
            this.bJ(this.atv);
            this.atv = null;
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (this.aaY.lF() != -1) {
            this.f(12, this.aTY.aO());
            this.bJ(this.atv);
            this.atv = null;
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        this.bJ(this.atv);
        this.atv = null;
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getPartyInviteButtonType(n);
            switch (a2) {
                case dbt: {
                    cat cat2 = (cat)this.aaY.aKu();
                    cat2.aGW();
                    fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, this.aaY.getGUID());
                    fdt2.sk(esv2.aVk());
                    fdt2.kU(true);
                    fdt2.cz(15.0);
                    fdt2.jM(true);
                    fdt2.kV(true);
                    this.MessageDelegator.I(fdt2);
                    this.uY();
                    break;
                }
                case dbu: {
                    this.f(3, this.aTY.aO());
                    this.aTZ = null;
                    this.aTY = null;
                    break;
                }
                default: {
                    lfn.b(5, TC, "handleConfirmationResponse() Invalid buttontype provided: " + (Object)((Object)a2));
                    this.f(5, this.aTY.aO());
                    this.aTZ = null;
                    this.aTY = null;
                }
            }
            return;
        }
        if (bdv2 instanceof bdx) {
            this.f(2, this.aTY.aO());
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        lfn.b(5, TC, "handleConfirmationResponse() Invalid response received: " + bdv2);
        this.f(5, this.aTY.aO());
        this.aTZ = null;
        this.aTY = null;
    }

    private void a(fdu fdu2) {
        this.uZ();
        if (this.aTY == null) {
            lfn.b(5, TC, "handleFunctionUseObjectDelayResponseMessage() Probably proccess has already been canceled.");
            return;
        }
        if (!this.uX()) {
            this.f(5, this.aTY.aO());
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (!this.aaY.mA().iY()) {
            this.f(6, this.aTY.aO());
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (this.aaY.mp()) {
            this.f(5, this.aTY.aO());
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (!fdu2.bOA()) {
            this.f(5, this.aTY.aO());
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        if (this.aaY.lF() != -1) {
            this.f(12, this.aTY.aO());
            this.aTZ = null;
            this.aTY = null;
            return;
        }
        this.f(4, this.aTY.aO());
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.GUID, this.aaY.aJP().getGUID());
        gqt2.a(hx.a.aeK);
        gqt2.Position = this.aTY.av();
        gqt2.jpN = true;
        this.MessageDelegator.F(gqt2);
        this.aTZ = null;
        this.aTY = null;
    }

    private void f(int n, ldv ldv2) {
        efh efh2 = (efh)this.MessageDelegator.h(12837, this.getGUID(), ldv2);
        efh2.DR(n);
        this.MessageDelegator.F(efh2);
    }

    private void l(double d2) {
        assert (d2 > 0.0);
        gvm gvm2 = (gvm)this.MessageDelegator.h(4353, this.GUID, this.MessageDelegator.getGUID());
        gvm2.gdA = 1;
        gvm2.Rs = this.GUID;
        gvm2.oV = 0.0;
        gvm2.eNV = d2;
        this.MessageDelegator.F(gvm2);
    }

    private void bJ(ldv ldv2) {
        assert (ldv2 != null);
        gvr gvr2 = (gvr)this.MessageDelegator.h(4355, this.GUID, this.MessageDelegator.getGUID());
        gvr2.gdA = 1;
        gvr2.atv = ldv2;
        gvr2.jsw = false;
        this.MessageDelegator.F(gvr2);
    }

    public tn(cex cex2) {
        this.aaY = cex2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 12836: {
                this.a((efg)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
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
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean uX() {
        if (this.aaY == null) {
            return false;
        }
        if (this.aaY.aAG() == null) {
            return false;
        }
        if (this.aaY.aKu() == null) {
            return false;
        }
        if (this.aaY.aMA() == null) {
            return false;
        }
        if (this.aaY.aMA().hk() == null) {
            return false;
        }
        if (this.aaY.aAG().azb() == null) {
            return false;
        }
        if (this.aaY.mA() == null) {
            return false;
        }
        return this.MessageDelegator != null;
    }

    private void uY() {
        assert (this.aUa == null);
        this.aUa = this.MessageDelegator.lL(lcr.qEa);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        glh2.SpecialEffectType = del.dr("se_summon_player_target");
        glh2.akX = this.aaY.aAG().getGUID();
        glh2.aZD = this.aaY.aAG().azb();
        glh2.aUa = this.aUa;
        this.MessageDelegator.F(glh2);
    }

    private void uZ() {
        if (this.aUa == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEb);
        glj2.aUa = this.aUa;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
        this.aUa = null;
    }
}

