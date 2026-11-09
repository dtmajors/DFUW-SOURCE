/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 *  lcw
 */
import java.util.Map;

public class gz
extends btk {
    private final ha hF;
    private int YF = 0;
    private final Map<Integer, a> YG = lcn.emw();
    private Map<ldv, els> YH = lcn.emw();

    public gz(ha ha2) {
        this.hF = ha2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 13909: {
                this.a((elr)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 13867: {
                this.a((ekk)dxq2);
                break;
            }
            case 13865: {
                this.a((elt)dxq2);
                break;
            }
            case 13830: {
                this.a((emf)dxq2);
                break;
            }
            case 13864: {
                this.a((els)dxq2);
                break;
            }
            case 18180: {
                this.a((esv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(elr elr2) {
        this.aB(elr2.Ri);
    }

    public void aB(ldv ldv2) {
        a a22;
        if (ldv2 == null) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanInvitationRequest() TargetPSOGUID == NULL.");
            assert (false);
            return;
        }
        ldv ldv3 = this.hF.iG();
        if (ldv3 == null || ldv3.equals(lcr.qAC)) {
            this.hF.c(mbg.uiZ.bD(new Object[0]));
            return;
        }
        if (!this.hF.a(bca.cTX)) {
            this.hF.c(mbg.ubr.bD(new Object[0]));
            return;
        }
        if (!this.YG.isEmpty()) {
            for (a a22 : this.YG.values()) {
                if (!ldv2.equals(a22.YN)) continue;
                lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanInvitationRequest() There is already a pending request for player " + ldv2);
                this.hF.c(mbg.ujd.bD(new Object[0]));
                return;
            }
        }
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
        eef2.aqs = this.YF;
        this.MessageDelegator.F(eef2);
        a22 = new a(this);
        a22.YN = ldv2;
        this.YG.put(this.YF, a22);
        ++this.YF;
    }

    private void a(eeg eeg2) {
        ldv ldv2 = eeg2.aO();
        int n = eeg2.aVk();
        a a2 = this.YG.get(n);
        if (a2 == null) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleCharacterNamedPropertiesResponseMessage() TargetPSOGUID " + ldv2 + " not in request map.");
            assert (false);
            return;
        }
        int n2 = eeg2.getAlignment();
        int n3 = eeg2.js();
        int n4 = eeg2.jt();
        ldv ldv3 = eeg2.iG();
        a2.YL = eeg2.iP() + " " + eeg2.iR();
        a2.YM = eeg2.iV();
        if (ldv3 != null && !ldv3.equals(lcr.qAC)) {
            this.hF.c(mbg.ujf.bD(a2.YL));
            this.YG.remove(n);
            return;
        }
        ekj ekj2 = (ekj)this.MessageDelegator.h(13866, this.getGUID(), this.hF.iG());
        ekj2.isS = n2;
        ekj2.isQ = n3;
        ekj2.isR = n4;
        ekj2.dvC = ldv2;
        ekj2.eTT = this.hF.getGUID();
        ekj2.sk(eeg2.aVk());
        this.MessageDelegator.F(ekj2);
    }

    private void a(ekk ekk2) {
        int n = ekk2.aVk();
        ldv ldv2 = ekk2.Ri;
        a a2 = this.YG.get(n);
        if (a2 == null) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanCheckPlayerResponseMessage() Player " + ldv2 + " not in request map.");
            assert (false);
            return;
        }
        ldv ldv3 = a2.YN;
        assert (ldv3 != null);
        assert (ldv2.equals(ldv3));
        int n2 = ekk2.ew;
        bbw bbw2 = bbw.getValueByOrdinal(n2);
        switch (bbw2) {
            case cSM: {
                this.YG.remove(n);
                this.hF.c(mbg.uiZ.bD(new Object[0]));
                break;
            }
            case cSN: {
                this.YG.remove(n);
                this.hF.c(mbg.ubr.bD(new Object[0]));
                break;
            }
            case cSD: {
                this.YG.remove(n);
                assert (false) : "Can not happen :" + (Object)((Object)bbw2);
                lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanInvitationRequest() System is not ready.");
                this.hF.c(mbg.rXy.bD(new Object[0]));
                break;
            }
            case cSF: {
                this.YG.remove(n);
                lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanInvitationRequest() Player has another active check.");
                this.hF.c(mbg.uje.bD(a2.YL));
                break;
            }
            case cSH: {
                this.YG.remove(n);
                this.hF.c(mbg.uiV.bD(new Object[0]));
                break;
            }
            case cSE: {
                this.YG.remove(n);
                this.hF.c(mbg.ujg.bD(a2.YL));
                break;
            }
            case cSK: {
                this.YG.remove(n);
                lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanInvitationRequest() Player is in kos list.");
                this.hF.c(mbg.ujh.bD(a2.YL));
                break;
            }
            case cSG: {
                this.YG.remove(n);
                this.hF.c(mbg.ujo.bD(a2.YL));
                break;
            }
            case cSL: {
                this.YG.remove(n);
                lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanInvitationRequest() Player is already a member in clan.");
                this.hF.c(mbg.uje.bD(a2.YL));
                break;
            }
            case cSO: {
                this.YG.remove(n);
                this.hF.c(mbg.uiM.bD(new Object[0]));
                break;
            }
            case cSJ: {
                ldv ldv4 = this.hF.iG();
                if (ldv4 == null || ldv4.equals(lcr.qAC)) {
                    this.YG.remove(n);
                    this.hF.c(mbg.uiZ.bD(new Object[0]));
                    return;
                }
                if (!this.hF.a(bca.cTX)) {
                    this.YG.remove(n);
                    this.hF.c(mbg.ubr.bD(new Object[0]));
                    return;
                }
                els els2 = (els)this.MessageDelegator.h(13864, this.getGUID(), ldv3);
                els2.eTT = this.hF.getGUID();
                els2.add = this.hF.iV();
                els2.ium = this.hF.kE().toString();
                els2.YL = this.hF.iU();
                els2.sk(n);
                this.MessageDelegator.F(els2);
                break;
            }
            case cSI: {
                this.YG.remove(n);
                assert (false) : "Can not happen : " + (Object)((Object)bbw2);
                break;
            }
            default: {
                this.YG.remove(n);
                assert (false) : "CheckResult :" + (Object)((Object)bbw2);
                break;
            }
        }
    }

    private void a(elt elt2) {
        int n = elt2.aVk();
        a a2 = this.YG.get(n);
        if (a2 == null) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "SFClanInvitePlayerResponseMessage() MessageTag " + n + " not in request map.");
            assert (false);
            return;
        }
        int n2 = elt2.iuw;
        if (n2 == 1) {
            this.YG.remove(n);
            this.hF.c(mbg.uji.bD(a2.YL));
            return;
        }
        if (n2 == 2) {
            this.YG.remove(n);
            this.hF.c(mbg.ujb.bD(a2.YL));
            return;
        }
        if (n2 == 3) {
            this.YG.remove(n);
            this.hF.c(mbg.ujc.bD(new Object[0]));
            assert (false) : "Can not happen";
            return;
        }
        if (n2 == 4) {
            this.YG.remove(n);
            this.hF.c(mbg.ujf.bD(a2.YL));
            return;
        }
        if (n2 == 0) {
            ldv ldv2 = this.hF.iG();
            if (ldv2 == null || ldv2.equals(lcr.qAC)) {
                this.YG.remove(n);
                this.hF.c(mbg.uiZ.bD(new Object[0]));
                return;
            }
            if (!this.hF.a(bca.cTX)) {
                this.YG.remove(n);
                this.hF.c(mbg.ubr.bD(new Object[0]));
                return;
            }
            eme eme2 = (eme)this.MessageDelegator.h(13829, this.getGUID(), this.hF.iG());
            eme2.isO = this.hF.getGUID();
            eme2.iuD = new ldv[]{a2.YN};
            eme2.iuE = new int[]{bbt.cRP.ordinal()};
            eme2.iuF = true;
            eme2.sk(n);
            this.MessageDelegator.F(eme2);
            return;
        }
        if (n2 == 6) {
            this.YG.remove(n);
            this.hF.c(mbg.uja.bD(a2.YL));
            return;
        }
        if (n2 == 7) {
            this.YG.remove(n);
            this.hF.c(mbg.ujj.bD(a2.YL));
            return;
        }
        if (n2 == 8) {
            this.YG.remove(n);
            this.hF.c(mbg.ujk.bD(a2.YL));
            return;
        }
    }

    private void a(emf emf2) {
        int n = emf2.aVk();
        a a2 = this.YG.remove(n);
        if (a2 == null) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanMemberApplicationResponseMessage() MessageTag " + n + " not in request map.");
            assert (false);
            return;
        }
        int n2 = emf2.aEC;
        if (!ayv.isValidOrdinal(n2)) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanMemberApplicationResponseMessage() Unknown Error.");
            this.hF.c(mbg.rXy.bD(new Object[0]));
            assert (false);
            return;
        }
        if (n2 == ayv.cBh.ordinal()) {
            if (emf2.gKV == ayv.cBv.ordinal()) {
                lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanMemberApplicationResponseMessage() Player " + this.hF.getGUID() + " not a clan member.");
                this.hF.c(mbg.uiZ.bD(new Object[0]));
                return;
            }
            if (emf2.gKV == ayv.cBQ.ordinal()) {
                lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanMemberApplicationRequestMessage() Player " + this.hF.getGUID() + " has not enough rank");
                this.hF.c(mbg.ubr.bD(new Object[0]));
                return;
            }
            if (emf2.gKV == ayv.cCb.ordinal()) {
                this.hF.c(mbg.uiM.bD(new Object[0]));
                return;
            }
            return;
        }
        ldv[] ldvArray = emf2.iuH;
        int[] nArray = emf2.iuI;
        if (ldvArray == null || ldvArray.length != 1 || nArray == null || nArray.length != 1) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleClanMemberApplicationResponseMessage() Invalid response.");
            this.hF.c(mbg.rXy.bD(new Object[0]));
            return;
        }
        int n3 = nArray[0];
        ayv ayv2 = ayv.getValueByOrdinal(n3);
        int n4 = ldvArray[0].enw();
        switch (ayv2) {
            case cBj: 
            case cBu: {
                this.hF.c(mbg.ujf.bD(a2.YL));
                break;
            }
            case cBk: {
                this.hF.c(mbg.ujg.bD(a2.YL));
                break;
            }
            case cBm: {
                this.hF.c(mbg.ujh.bD(a2.YL));
                break;
            }
            case cBp: {
                this.hF.c(mbg.ujl.bD(a2.YL));
                break;
            }
            case cBy: {
                this.hF.c(mbg.rXy.bD(new Object[0]));
                break;
            }
            case cBq: {
                this.hF.c(mbg.ujm.bD(a2.YL));
                break;
            }
            default: {
                assert (false) : "Update Code ClanOperationsResult :" + (Object)((Object)ayv2);
                break;
            }
        }
    }

    private void a(els els2) {
        ldv ldv2 = els2.eTT;
        int n = 0;
        if (!this.hF.iY()) {
            n = 1;
        } else if (this.hF.aD(ldv2)) {
            n = 2;
        } else if (ldv2.equals(this.hF.getGUID())) {
            n = 3;
        } else if (this.hF.iG() != null && !this.hF.iG().equals(lcr.qAC)) {
            n = 4;
        }
        if (n > 0) {
            this.a(n, els2);
            return;
        }
        ldv ldv3 = this.MessageDelegator.bzv();
        double d2 = this.MessageDelegator.arc().rgz + 30.0;
        ldv ldv4 = lcr.p((ldv)lcr.aTZ, (int)this.hF.jr(), (int)this.hF.getGUID().enw());
        if (lcw.qOR) {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = ldv3;
            bdt2.dbE = lwq.tfW.bD(els2.ium, els2.YL, els2.add);
            bdt2.ed = bdu.dbQ.ordinal();
            bdt2.Ri = ldv2;
            esu esu2 = (esu)this.MessageDelegator.h(18183, this.getGUID(), ldv4);
            esu2.iBw = bdt2;
            this.MessageDelegator.F(esu2);
        }
        this.YH.put(ldv3, els2);
    }

    private void a(esv esv2) {
        if (esv2.iBx == null) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleConfirmationResponse() ConfirmationResponse is null.");
            return;
        }
        ldv ldv2 = esv2.iBx.dbT;
        els els2 = this.YH.remove(ldv2);
        if (els2 == null) {
            lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleConfirmationResponse() No entry mapped to ConfirmationResponseGUID=" + ldv2);
            assert (false);
            return;
        }
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getClanInviteButtonType(n);
            if (a2 == null) {
                a2 = bdp.a.dbu;
            }
            switch (a2) {
                case dbt: {
                    if (this.hF.iG() != null && !this.hF.iG().equals(lcr.qAC)) {
                        this.hF.c(mbg.ujn.bD(new Object[0]));
                        this.a(5, els2);
                        return;
                    }
                    this.a(0, els2);
                    break;
                }
                case dbv: {
                    this.hF.c(els2.eTT, els2.YL);
                    this.a(6, els2);
                    break;
                }
                case dbu: {
                    this.a(7, els2);
                    break;
                }
                default: {
                    lfn.b(5, "SFPersistentSessionClanInvitationManager", "handleConfirmationResponse() Invalid buttontype provided: " + (Object)((Object)a2));
                    this.a(8, els2);
                    break;
                }
            }
        } else if (bdv2 instanceof bdx) {
            this.a(8, els2);
        } else {
            this.a(8, els2);
            return;
        }
    }

    private void a(int n, els els2) {
        elt elt2 = (elt)this.getMessageDelegator().h(13865, this.hF.getGUID(), els2.aO());
        this.MessageDelegator.b(els2, elt2);
        elt2.iuw = n;
        elt2.iux = this.hF.iU();
        elt2.itR = this.hF.getGUID();
        this.MessageDelegator.F(elt2);
    }
}

