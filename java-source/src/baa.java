/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDefenderMercenaryDTO;

public class baa {
    private ldv cIK = null;
    private String cIL = null;
    private int cIM = 0;
    private float aEM = 0.0f;

    public ldv afM() {
        return this.cIK;
    }

    void fF(ldv ldv2) {
        this.cIK = ldv2;
    }

    public String afN() {
        return this.cIL;
    }

    void fd(String string) {
        this.cIL = string;
    }

    public int afO() {
        return this.cIM;
    }

    void jG(int n) {
        this.cIM = n;
    }

    public float afP() {
        return this.aEM;
    }

    void cq(float f) {
        this.aEM = f;
    }

    public boolean n(ldv ldv2, String string) {
        if (ldv.au(this.cIK, ldv2)) {
            this.cIL = string;
            return true;
        }
        return false;
    }

    public SFConquestChallengeAttackerDTO a(jng jng2, boolean bl) {
        if (jng2 == null) {
            return null;
        }
        SFConquestChallengeAttackerDTO sFConquestChallengeAttackerDTO = new SFConquestChallengeAttackerDTO();
        sFConquestChallengeAttackerDTO.isPlayersClan = jng2.dNh() ? jng2.dNi().iG().equals(this.cIK) : false;
        sFConquestChallengeAttackerDTO.clanName = this.cIL;
        sFConquestChallengeAttackerDTO.score = 0.0f;
        sFConquestChallengeAttackerDTO.isMercenary = true;
        sFConquestChallengeAttackerDTO.isRemoved = !bl;
        sFConquestChallengeAttackerDTO.stanceToPlayersClan = jng2.sD(this.cIK).ordinal();
        sFConquestChallengeAttackerDTO.maxSiegeStones = 0;
        sFConquestChallengeAttackerDTO.siegeStonePlacementTimer = 0;
        sFConquestChallengeAttackerDTO.siegeStones = lcn.emv();
        return sFConquestChallengeAttackerDTO;
    }

    public SFConquestChallengeDefenderMercenaryDTO b(jng jng2) {
        if (jng2 == null) {
            return null;
        }
        SFConquestChallengeDefenderMercenaryDTO sFConquestChallengeDefenderMercenaryDTO = new SFConquestChallengeDefenderMercenaryDTO();
        sFConquestChallengeDefenderMercenaryDTO.isPlayersClan = jng2.dNh() ? jng2.dNi().iG().equals(this.cIK) : false;
        sFConquestChallengeDefenderMercenaryDTO.clanName = this.cIL;
        sFConquestChallengeDefenderMercenaryDTO.stanceToPlayersClan = jng2.sD(this.cIK).ordinal();
        sFConquestChallengeDefenderMercenaryDTO.goldReward = this.cIM;
        sFConquestChallengeDefenderMercenaryDTO.percentageReward = this.aEM;
        return sFConquestChallengeDefenderMercenaryDTO;
    }
}

