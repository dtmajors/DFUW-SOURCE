/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDefenderMercenaryDTO;

public class azz {
    private ldv aEF = null;
    private String aEG = null;
    private int cIv = ayb.cvi.ordinal();
    private ljq cIw = null;
    private float cIx = 0.0f;
    private int cIy = 0;
    private ldv cIl = null;
    private String cIz = null;
    private baa[] cIs = null;
    private boolean cIA = false;
    private azy[] cIB = null;
    private azy[] cIC = null;
    private boolean cID = false;
    private double cIE = 0.0;
    private double cIF = 0.0;
    private double cIG = 0.0;
    private boolean cIH = true;
    private boolean cII = true;
    private double cIJ = 0.0;

    public ldv afl() {
        return this.aEF;
    }

    void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public String afw() {
        return this.aEG;
    }

    void fb(String string) {
        this.aEG = string;
    }

    public ayb afx() {
        return ayb.getValueByOrdinal(this.cIv);
    }

    void h(ayb ayb2) {
        this.cIv = ayb2 == null ? this.cIv : ayb2.ordinal();
    }

    public ljq afy() {
        return this.cIw;
    }

    void aH(ljq ljq2) {
        this.cIw = ljq2;
    }

    public float afz() {
        return this.cIx;
    }

    void cp(float f) {
        this.cIx = f;
    }

    public int afA() {
        return this.cIy;
    }

    void jF(int n) {
        this.cIy = n;
    }

    public ldv afk() {
        return this.cIl;
    }

    void fw(ldv ldv2) {
        this.cIl = ldv2;
    }

    public String afB() {
        return this.cIz;
    }

    void fc(String string) {
        this.cIz = string;
    }

    public baa[] aft() {
        return this.cIs;
    }

    void a(baa[] baaArray) {
        this.cIs = baaArray;
    }

    public azy[] afC() {
        return this.cIB;
    }

    void a(azy[] azyArray) {
        this.cIB = azyArray;
    }

    public azy[] afD() {
        return this.cIC;
    }

    void b(azy[] azyArray) {
        this.cIC = azyArray;
    }

    public double afE() {
        return this.cIE;
    }

    void az(double d2) {
        this.cIE = d2;
    }

    public double afF() {
        return this.cIF;
    }

    void aA(double d2) {
        this.cIF = d2;
    }

    public double afG() {
        return this.cIG;
    }

    void aB(double d2) {
        this.cIG = d2;
    }

    public boolean afH() {
        return this.cIH;
    }

    void cD(boolean bl) {
        this.cIH = bl;
    }

    public boolean afI() {
        return this.cII;
    }

    void cE(boolean bl) {
        this.cII = bl;
    }

    public double afJ() {
        return this.cIJ;
    }

    void aC(double d2) {
        this.cIJ = d2;
    }

    public boolean afK() {
        return this.cID;
    }

    void cF(boolean bl) {
        this.cID = bl;
    }

    public boolean afL() {
        return this.cIA;
    }

    void cG(boolean bl) {
        this.cIA = bl;
    }

    public String fC(ldv ldv2) {
        for (azy azy2 : this.cIB) {
            if (!azy2.afr().equals(ldv2)) continue;
            return azy2.afs();
        }
        return null;
    }

    public void a(azy azy2) {
        for (int i = 0; i < this.cIB.length; ++i) {
            if (!this.cIB[i].afr().equals(azy2.afr())) continue;
            this.cIB[i] = azy2;
            return;
        }
        azy[] azyArray = new azy[this.cIB.length + 1];
        for (int i = 0; i < this.cIB.length; ++i) {
            azyArray[i] = this.cIB[i];
        }
        azyArray[azyArray.length - 1] = azy2;
    }

    public boolean q(ldv ldv2, boolean bl) {
        if (this.fD(ldv2)) {
            return true;
        }
        if (bl && this.fa(ldv2)) {
            return true;
        }
        return this.a(ldv2, bl, false);
    }

    public boolean fD(ldv ldv2) {
        return this.cIl.equals(ldv2);
    }

    public boolean fa(ldv ldv2) {
        for (baa baa2 : this.cIs) {
            if (!baa2.afM().equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public boolean a(ldv ldv2, boolean bl, boolean bl2) {
        for (azy azy2 : this.cIB) {
            if (azy2.afr().equals(ldv2)) {
                return true;
            }
            if (!bl) continue;
            for (baa baa2 : azy2.aft()) {
                if (!baa2.afM().equals(ldv2)) continue;
                return true;
            }
        }
        if (bl2) {
            for (azy azy2 : this.cIC) {
                if (azy2.afr().equals(ldv2)) {
                    return true;
                }
                if (!bl) continue;
                for (baa baa2 : azy2.aft()) {
                    if (!baa2.afM().equals(ldv2)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(azy azy2) {
        if (azy2 == null) {
            lfn.b(5, "SFClanConquestChallengeGlobalInfo", "updateForNewAttacker() : NewAttacker Parameter is Null!!!");
            assert (false);
            return false;
        }
        if (this.a(azy2.afr(), false, false)) {
            lfn.b(5, "SFClanConquestChallengeGlobalInfo", "updateForNewAttacker() : Attacker Already Exists in the Challenge!!!... Attacker = " + azy2.afs() + " [" + azy2.afr().fk() + "]");
            assert (false);
            return false;
        }
        azy[] azyArray = new azy[this.cIB.length + 1];
        for (int i = 0; i < this.cIB.length; ++i) {
            azyArray[i] = this.cIB[i];
        }
        azyArray[azyArray.length - 1] = azy2;
        this.cIB = azyArray;
        return true;
    }

    public boolean B(ldv ldv2, int n) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeGlobalInfo", "updateForAttackerSiegeStonesChanged() : AttackerGUID Parameter is Null!!!");
            assert (false);
            return false;
        }
        if (!this.a(ldv2, false, false)) {
            lfn.b(5, "SFClanConquestChallengeGlobalInfo", "updateForAttackerSiegeStonesChanged() : Attacker Does Not Exist in the Challenge!!!... AttackerGUID = [" + ldv2.fk() + "]");
            assert (false);
            return false;
        }
        for (int i = 0; i < this.cIB.length; ++i) {
            if (!this.cIB[i].afr().equals(ldv2)) continue;
            return this.cIB[i].jE(n);
        }
        return false;
    }

    public boolean fE(ldv ldv2) {
        int n;
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeGlobalInfo", "updateForRemovedAttacker() : AttackerGUID Parameter is Null!!!");
            assert (false);
            return false;
        }
        if (!this.a(ldv2, false, false)) {
            lfn.b(5, "SFClanConquestChallengeGlobalInfo", "updateForRemovedAttacker() : Attacker Does Not Exist in the Challenge!!!... AttackerGUID = [" + ldv2.fk() + "]");
            return false;
        }
        azy[] azyArray = new azy[this.cIB.length - 1];
        azy[] azyArray2 = new azy[this.cIC.length + 1];
        for (n = 0; n < this.cIC.length; ++n) {
            azyArray2[n] = this.cIC[n];
        }
        n = 0;
        for (int i = 0; i < this.cIB.length; ++i) {
            if (this.cIB[i].afr().equals(ldv2)) {
                this.cIB[i].jE(0);
                azyArray2[azyArray2.length - 1] = this.cIB[i];
                continue;
            }
            azyArray[n++] = this.cIB[i];
        }
        this.cIC = azyArray2;
        this.cIB = azyArray;
        return true;
    }

    public boolean b(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (this.cIH == bl && this.cII == bl2 && this.cID == bl3 && this.cIA == bl4) {
            return false;
        }
        this.cIH = bl;
        this.cII = bl2;
        this.cID = bl3;
        this.cIA = bl4;
        return true;
    }

    public boolean aD(double d2) {
        this.cIE += d2;
        this.cIF += d2;
        this.cIG += d2;
        return true;
    }

    public boolean c(baa baa2) {
        boolean bl = false;
        if (this.cIs != null && this.cIs.length > 0) {
            for (int i = 0; i < this.cIs.length; ++i) {
                if (!this.cIs[i].afM().equals(baa2.afM())) continue;
                bl = true;
                break;
            }
        }
        if (bl) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForDefenderMercenaryJoined() : Mercenary Already Exists!!!");
            assert (false);
            return false;
        }
        baa[] baaArray = new baa[(this.cIs == null ? 0 : this.cIs.length) + 1];
        if (this.cIs != null) {
            for (int i = 0; i < this.cIs.length; ++i) {
                baaArray[i] = this.cIs[i];
            }
        }
        baaArray[baaArray.length - 1] = baa2;
        this.cIs = baaArray;
        return true;
    }

    public boolean d(baa baa2) {
        boolean bl = false;
        if (this.cIs != null && this.cIs.length > 0) {
            for (int i = 0; i < this.cIs.length; ++i) {
                if (!this.cIs[i].afM().equals(baa2.afM())) continue;
                bl = true;
                break;
            }
        }
        if (!bl) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForDefenderMercenaryLeft() : Mercenary Does Not Exist!!!");
            assert (false);
            return false;
        }
        baa[] baaArray = new baa[this.cIs.length - 1];
        int n = 0;
        for (int i = 0; i < this.cIs.length; ++i) {
            if (this.cIs[i].afM().equals(baa2.afM())) continue;
            baaArray[n++] = this.cIs[i];
        }
        this.cIs = baaArray;
        return true;
    }

    public boolean a(ldv ldv2, baa baa2) {
        for (int i = 0; i < this.cIB.length; ++i) {
            if (!this.cIB[i].afr().equals(ldv2)) continue;
            return this.cIB[i].a(baa2);
        }
        return false;
    }

    public boolean b(ldv ldv2, baa baa2) {
        for (int i = 0; i < this.cIB.length; ++i) {
            if (!this.cIB[i].afr().equals(ldv2)) continue;
            return this.cIB[i].b(baa2);
        }
        return false;
    }

    public boolean n(ldv ldv2, String string) {
        int n;
        if (ldv.au(this.cIl, ldv2)) {
            this.cIz = string;
            return true;
        }
        for (n = 0; n < this.cIB.length; ++n) {
            if (!this.cIB[n].n(ldv2, string)) continue;
            return true;
        }
        if (this.cIs != null) {
            for (n = 0; n < this.cIs.length; ++n) {
                if (!this.cIs[n].n(ldv2, string)) continue;
                return true;
            }
        }
        if (this.cIC != null) {
            for (n = 0; n < this.cIC.length; ++n) {
                if (!this.cIC[n].n(ldv2, string)) continue;
                return true;
            }
        }
        return false;
    }

    public SFConquestChallengeDTO a(jng jng2) {
        SFConquestChallengeAttackerDTO sFConquestChallengeAttackerDTO;
        SFXMLSerializable sFXMLSerializable;
        if (jng2 == null) {
            return null;
        }
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        SFConquestChallengeDTO sFConquestChallengeDTO = new SFConquestChallengeDTO();
        int n = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        if (jng2.dNh() && this.q(jng2.dNi().iG(), true)) {
            n = jng2.sF(this.aEF);
            f = jng2.sH(this.aEF);
            f2 = jng2.sG(this.aEF);
        }
        sFConquestChallengeDTO.holdingID = this.aEG;
        sFConquestChallengeDTO.holdingName = lvm.sWY.bD(this.aEG).exA();
        sFConquestChallengeDTO.holdingType = this.cIv;
        sFConquestChallengeDTO.wallsProtectingHolding = n;
        sFConquestChallengeDTO.bindstoneCurrentHealth = f == 0.0f ? 1.0f : f;
        sFConquestChallengeDTO.bindstoneMaxHealth = f2 == 0.0f ? 1.0f : f2;
        bl = jng2.dNh() ? jng2.dNi().iG().equals(this.cIl) : false;
        sFConquestChallengeDTO.defenderClanName = this.cIz;
        sFConquestChallengeDTO.isPlayersClan = bl;
        sFConquestChallengeDTO.defenderMercenaries = lcn.emv();
        sFConquestChallengeDTO.stanceToPlayersClan = jng2.sD(this.cIl).ordinal();
        for (baa object : this.cIs) {
            sFXMLSerializable = object.b(jng2);
            if (sFXMLSerializable == null) continue;
            bl2 = sFXMLSerializable.isPlayersClan;
            sFConquestChallengeDTO.defenderMercenaries.add((SFConquestChallengeDefenderMercenaryDTO)sFXMLSerializable);
        }
        sFConquestChallengeDTO.attackerWagerCost = jng2.a(ayb.getValueByOrdinal(this.cIv), this.cIy, this.cIl, this);
        sFConquestChallengeDTO.attackers = lcn.emv();
        for (azy azy2 : this.cIB) {
            sFXMLSerializable = azy2.a(this, jng2, true);
            if (sFXMLSerializable != null) {
                bl3 |= ((SFConquestChallengeAttackerDTO)sFXMLSerializable).isPlayersClan;
                sFConquestChallengeDTO.attackers.add((SFConquestChallengeAttackerDTO)sFXMLSerializable);
            }
            for (baa baa2 : azy2.aft()) {
                sFConquestChallengeAttackerDTO = baa2.a(jng2, true);
                if (sFConquestChallengeAttackerDTO == null) continue;
                bl4 |= sFConquestChallengeAttackerDTO.isPlayersClan;
                sFConquestChallengeDTO.attackers.add(sFConquestChallengeAttackerDTO);
            }
        }
        for (azy azy3 : this.cIC) {
            sFXMLSerializable = azy3.a(this, jng2, false);
            if (sFXMLSerializable != null) {
                bl3 |= ((SFConquestChallengeAttackerDTO)sFXMLSerializable).isPlayersClan;
                sFConquestChallengeDTO.attackers.add((SFConquestChallengeAttackerDTO)sFXMLSerializable);
            }
            for (baa baa2 : azy3.aft()) {
                sFConquestChallengeAttackerDTO = baa2.a(jng2, false);
                if (sFConquestChallengeAttackerDTO == null) continue;
                bl4 |= sFConquestChallengeAttackerDTO.isPlayersClan;
                sFConquestChallengeDTO.attackers.add(sFConquestChallengeAttackerDTO);
            }
        }
        double d2 = jng2.getMessageDelegator().arc().rgz - this.cIJ;
        sFConquestChallengeDTO.countdownTimer = Double.valueOf(this.cIE - d2).longValue();
        sFConquestChallengeDTO.defenderVulnerabilityCountdown = Double.valueOf(this.cIG - d2).intValue();
        sFConquestChallengeDTO.attackerVulnerabilityCountdown = Double.valueOf(this.cIF - d2).intValue();
        sFConquestChallengeDTO.challengeType = bl ? bac.cIU.ordinal() : (bl2 ? bac.cIW.ordinal() : (bl3 ? bac.cIT.ordinal() : (bl4 ? bac.cIV.ordinal() : bac.cIU.ordinal())));
        sFConquestChallengeDTO.viewerHasClan = jng2.dNh();
        sFConquestChallengeDTO.viewerHasInitiatePermissions = jng2.i(bca.cUy) && this.cIH;
        sFConquestChallengeDTO.viewerHasIssueContractPermissions = jng2.i(bca.cUD) && !jng2.al(this.cIl, this.aEF) && this.cII;
        sFConquestChallengeDTO.pendingContracts = lcn.emv();
        if (jng2.dNh()) {
            for (bao bao2 : jng2.d(this)) {
                sFConquestChallengeDTO.pendingContracts.add(bao2.s(jng2.dNi().iG(), false));
            }
            for (bao bao3 : jng2.e(this)) {
                sFConquestChallengeDTO.pendingContracts.add(bao3.s(jng2.dNi().iG(), true));
            }
        }
        return sFConquestChallengeDTO;
    }
}

