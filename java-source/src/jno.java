/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jnk
 */
import java.util.Iterator;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanToClanPoliticalStanceDTO;

public class jno
extends jnl {
    private boolean nEa = false;

    bcm[] dNM() {
        return this.nDv.dNI() ? this.nDF.aag() : null;
    }

    bcm[] dNN() {
        return this.nDv.dNI() ? this.nDF.aak() : null;
    }

    bcm[] dNO() {
        return this.nDv.dNI() ? this.nDF.abS() : null;
    }

    bcr sW(ldv ldv2) {
        if (!this.nDv.dNI()) {
            return bcr.cXg;
        }
        for (int j = 0; j < this.nDF.abc().length; ++j) {
            if (!this.nDF.abc()[j].iG().equals(ldv2)) continue;
            return this.nDF.abc()[j].alj();
        }
        return bcr.cXg;
    }

    bcr sE(ldv ldv2) {
        if (!this.nDv.dNI()) {
            return bcr.cXg;
        }
        for (int j = 0; j < this.nDF.abc().length; ++j) {
            if (!this.nDF.abc()[j].iG().equals(ldv2)) continue;
            return this.nDF.abc()[j].ali();
        }
        return bcr.cXg;
    }

    bcr sO(String string) {
        if (string == null || string.isEmpty() || !this.nDv.dNI()) {
            return bcr.cXg;
        }
        for (int j = 0; j < this.nDF.abc().length; ++j) {
            if (!this.nDF.abc()[j].iV().equals(string)) continue;
            return this.nDF.abc()[j].ali();
        }
        return bcr.cXg;
    }

    SFClanToClanPoliticalStanceDTO u(ayq ayq2) {
        bcq bcq2 = null;
        if (this.nDv.dNI()) {
            for (bcq bcq3 : this.nDF.abc()) {
                if (!bcq3.iG().equals(ayq2.iG())) continue;
                bcq2 = bcq3;
                break;
            }
        }
        SFClanToClanPoliticalStanceDTO sFClanToClanPoliticalStanceDTO = new SFClanToClanPoliticalStanceDTO();
        sFClanToClanPoliticalStanceDTO.playerRace = cg.s(hso.cxK().bAn().Za);
        sFClanToClanPoliticalStanceDTO.playerHasClan = this.nDv.dNI();
        sFClanToClanPoliticalStanceDTO.playersClan = sFClanToClanPoliticalStanceDTO.playerHasClan && this.nDF.iG().equals(ayq2.iG());
        sFClanToClanPoliticalStanceDTO.playerHasEditPermission = this.nDv.i(bca.cUk);
        sFClanToClanPoliticalStanceDTO.politicalStance = bcq2 == null ? bcr.cXg.ordinal() : bcq2.ali().ordinal();
        sFClanToClanPoliticalStanceDTO.theirPoliticalStance = bcq2 == null ? bcr.cXg.ordinal() : bcq2.alj().ordinal();
        sFClanToClanPoliticalStanceDTO.playerAppliedToJoinClan = this.nDv.sR(ayq2.iG());
        sFClanToClanPoliticalStanceDTO.playerIsBannedFromClan = ayq2.ev(hso.cxK().bAn().Tr);
        return sFClanToClanPoliticalStanceDTO;
    }

    boolean dNP() {
        if (!this.nDv.dNI()) {
            return false;
        }
        if (this.nDF != null && this.nDF.abc() != null) {
            for (bcq bcq2 : this.nDF.abc()) {
                if (!bcq2.all()) continue;
                return true;
            }
        }
        return false;
    }

    jno(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
    }

    @Override
    void dNE() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void dNF() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void bqx() {
        this.nDF = null;
    }

    void a(hun hun2, ayq ayq2, int n) {
        if (hun2 == null) {
            return;
        }
        if (this.nEa) {
            hun2.nN(bcs.cXl.YF().bD(new Object[0]).exA());
            return;
        }
        bcr bcr2 = bcr.getValueByOrdinal(n);
        this.nDC.a(hun2);
        this.nEa = true;
        this.a(ayq2.iG(), ayq2.iV(), bcr2);
    }

    void a(ldv[] ldvArray, ldv[] ldvArray2, ldv[] ldvArray3, ldv[] ldvArray4, ldv[] ldvArray5, ldv[] ldvArray6, huk huk2) {
        if (huk2 == null) {
            return;
        }
        this.nDC.a(huk2);
        this.a(ldvArray, ldvArray2, ldvArray3, ldvArray4, ldvArray5, ldvArray6);
    }

    private void a(ldv ldv2, String string, bcr bcr2) {
        assert (this.nDv.dNI());
        assert (ldv2 != null);
        assert (string != null);
        assert (bcr2 != null);
        enl enl2 = (enl)this.MessageDelegator.h(13896, this.GUID, this.nDF.iG());
        enl2.oS(hso.cxK().bAn().Tr);
        enl2.ch(ldv2);
        enl2.d(bcr2);
        this.MessageDelegator.F(enl2);
    }

    private void a(ldv[] ldvArray, ldv[] ldvArray2, ldv[] ldvArray3, ldv[] ldvArray4, ldv[] ldvArray5, ldv[] ldvArray6) {
        assert (this.nDv.dNI());
        assert (ldvArray != null || ldvArray2 != null || ldvArray3 != null || ldvArray4 != null || ldvArray5 != null || ldvArray6 != null);
        enh enh2 = (enh)this.MessageDelegator.h(13906, this.GUID, this.nDF.iG());
        enh2.oS(hso.cxK().bAn().Tr);
        enh2.t(ldvArray);
        enh2.u(ldvArray2);
        enh2.v(ldvArray3);
        enh2.w(ldvArray4);
        enh2.x(ldvArray5);
        enh2.y(ldvArray6);
        this.MessageDelegator.F(enh2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000) {
            this.a((eqr)dxq2);
            return;
        }
        switch (dxq2.bEz()) {
            case 13897: {
                this.a((enm)dxq2);
                break;
            }
            case 13907: {
                this.a((eni)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eqr eqr2) {
        switch (eqr2.bHc()) {
            case 1537: {
                this.a((eqm)eqr2);
                break;
            }
            case 1539: {
                this.a((eqn)eqr2);
                break;
            }
            case 1538: {
                this.a((eqp)eqr2);
                break;
            }
            case 1540: {
                this.a((eqk)eqr2);
                break;
            }
            case 1541: {
                this.a((eql)eqr2);
                break;
            }
            case 1544: {
                this.a((eqi)eqr2);
                break;
            }
            case 1545: {
                this.a((eqj)eqr2);
                break;
            }
            case 1542: {
                this.a((eqg)eqr2);
                break;
            }
            case 1543: {
                this.a((eqh)eqr2);
                break;
            }
            case 1546: {
                this.a((eqo)eqr2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanClientUpdateMessage() : Unknown Update Type (" + eqr2.bHc() + ") Received!!!");
                assert (false);
                return;
            }
        }
    }

    private void a(eqm eqm2) {
        this.nDF.a(eqm2.bKO());
        Set<hul> set = this.nDC.c(hul.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hul hul2 : set) {
                hul2.rc(eqm2.bKO().iG());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqn eqn2) {
        this.nDF.a(eqn2.alD(), eqn2.ali(), eqn2.alj());
        Set<hul> set = this.nDC.c(hul.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hul hul2 : set) {
                hul2.rc(eqn2.alD());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqp eqp2) {
        this.nDF.eC(eqp2.alD());
        Set<hul> set = this.nDC.c(hul.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hul hul2 : set) {
                hul2.rc(eqp2.alD());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqk eqk2) {
        this.nDF.a(eqk2.bKN());
        Set<huj> set = this.nDC.c(huj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huj huj2 : set) {
                huj2.a(this.nDF.aag());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eql eql2) {
        this.nDF.eD(eql2.bGN());
        Set<huj> set = this.nDC.c(huj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huj huj2 : set) {
                huj2.a(this.nDF.aag());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqi eqi2) {
        this.nDF.b(eqi2.bKN());
        Set<huj> set = this.nDC.c(huj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huj huj2 : set) {
                huj2.b(this.nDF.aak());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqj eqj2) {
        this.nDF.eE(eqj2.bGN());
        Set<huj> set = this.nDC.c(huj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huj huj2 : set) {
                huj2.b(this.nDF.aak());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqg eqg2) {
        this.nDF.c(eqg2.bKN());
        Set<huj> set = this.nDC.c(huj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huj huj2 : set) {
                huj2.c(this.nDF.abS());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqh eqh2) {
        this.nDF.eF(eqh2.bGN());
        Set<huj> set = this.nDC.c(huj.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huj huj2 : set) {
                huj2.c(this.nDF.abS());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqo eqo2) {
        this.nDC.B(eqo2.iG(), eqo2.iV());
        this.nDF.k(eqo2.iG(), eqo2.iV());
        Set<hul> set = this.nDC.c(hul.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hul hul2 : set) {
                hul2.rc(eqo2.iG());
            }
            this.nDC.ir(false);
        }
    }

    private void a(enm enm2) {
        this.nEa = false;
        Set<hun> set = this.nDC.c(hun.class);
        if (set.isEmpty()) {
            return;
        }
        if (enm2.vA()) {
            this.nDC.ir(true);
            for (hun hun2 : set) {
                hun2.nM(enm2.bIk());
            }
            this.nDC.ir(false);
        } else {
            this.nDC.ir(true);
            for (hun hun3 : set) {
                hun3.nN(enm2.bIk());
            }
            this.nDC.ir(false);
        }
    }

    private void a(eni eni2) {
        Set<huk> set = this.nDC.c(huk.class);
        if (set.isEmpty()) {
            return;
        }
        String string = null;
        if (eni2.bJs() != null && eni2.bJt() == null) {
            Iterator<huk> iterator = null;
            if (this.nDF != null) {
                for (bcm bcm2 : this.nDF.aag()) {
                    if (!bcm2.qd().equals(eni2.bJs())) continue;
                    string = bcm2.hl();
                    break;
                }
            }
            if (this.nDF != null && string == null) {
                for (bcm bcm3 : this.nDF.aak()) {
                    if (!bcm3.qd().equals(eni2.bJs())) continue;
                    string = bcm3.hl();
                    break;
                }
            }
            if (this.nDF != null && string == null) {
                for (bcm bcm4 : this.nDF.abS()) {
                    if (!bcm4.qd().equals(eni2.bJs())) continue;
                    string = bcm4.hl();
                    break;
                }
            }
        }
        if (string == null) {
            string = "???";
        }
        this.nDC.ir(true);
        for (huk huk2 : set) {
            if (eni2.bJr().vA()) {
                huk2.nL(eni2.kh(string));
                continue;
            }
            huk2.nK(eni2.kh(string));
        }
        this.nDC.ir(false);
    }
}

