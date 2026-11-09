/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerSiegeStoneDTO;

public class azy {
    private ldv cIq = null;
    private String cIr = null;
    private baa[] cIs = null;
    private int cIt = 0;
    private int cIu = 0;

    public ldv afr() {
        return this.cIq;
    }

    void fB(ldv ldv2) {
        this.cIq = ldv2;
    }

    public String afs() {
        return this.cIr;
    }

    void fa(String string) {
        this.cIr = string;
    }

    public baa[] aft() {
        return this.cIs;
    }

    void a(baa[] baaArray) {
        this.cIs = baaArray;
    }

    public int afu() {
        return this.cIt;
    }

    void jC(int n) {
        this.cIt = n;
    }

    public int afv() {
        return this.cIu;
    }

    void jD(int n) {
        this.cIu = n;
    }

    public boolean jE(int n) {
        if (n < 0) {
            lfn.b(5, "SFClanConquestChallengeGlobalAttackerInfo", "updatePlacedSiegeStones() : New Siege-Stones Value is Negative!!!");
            assert (false);
            return false;
        }
        if (n > this.cIt) {
            lfn.b(5, "SFClanConquestChallengeGlobalAttackerInfo", "updatePlacedSiegeStones() : New Siege-Stones Value is Greater Than Maximum!!!");
            assert (false);
            return false;
        }
        if (n == this.cIt) {
            return false;
        }
        this.cIu = n;
        return true;
    }

    public boolean a(baa baa2) {
        boolean bl = false;
        if (this.cIs != null && this.cIs.length > 0) {
            for (int i = 0; i < this.cIs.length; ++i) {
                if (!this.cIs[i].afM().equals(baa2.afM())) continue;
                bl = true;
                break;
            }
        }
        if (bl) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForMercenaryJoined() : Mercenary Already Exists!!!");
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

    public boolean b(baa baa2) {
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

    public boolean n(ldv ldv2, String string) {
        if (ldv.au(this.cIq, ldv2)) {
            this.cIr = string;
            return true;
        }
        if (this.cIs != null) {
            for (int i = 0; i < this.cIs.length; ++i) {
                if (!this.cIs[i].n(ldv2, string)) continue;
                return true;
            }
        }
        return false;
    }

    public SFConquestChallengeAttackerDTO a(azz azz2, jng jng2, boolean bl) {
        if (jng2 == null) {
            return null;
        }
        SFConquestChallengeAttackerDTO sFConquestChallengeAttackerDTO = new SFConquestChallengeAttackerDTO();
        sFConquestChallengeAttackerDTO.isPlayersClan = jng2.dNh() ? jng2.dNi().iG().equals(this.cIq) : false;
        sFConquestChallengeAttackerDTO.clanName = this.cIr;
        sFConquestChallengeAttackerDTO.score = 0.0f;
        sFConquestChallengeAttackerDTO.isMercenary = false;
        sFConquestChallengeAttackerDTO.isRemoved = !bl;
        sFConquestChallengeAttackerDTO.stanceToPlayersClan = jng2.sD(this.cIq).ordinal();
        sFConquestChallengeAttackerDTO.maxSiegeStones = this.cIt;
        sFConquestChallengeAttackerDTO.siegeStones = lcn.emv();
        if (jng2.dNh() && azz2.q(jng2.dNi().iG(), true) && bl) {
            sFConquestChallengeAttackerDTO.score = jng2.ao(azz2.afl(), this.cIq);
            sFConquestChallengeAttackerDTO.siegeStonePlacementTimer = jng2.am(azz2.afl(), this.cIq);
            for (azw azw2 : jng2.an(azz2.afl(), this.cIq)) {
                sFConquestChallengeAttackerDTO.siegeStones.add(azw2.afj());
            }
        } else {
            sFConquestChallengeAttackerDTO.siegeStonePlacementTimer = 0;
            for (int i = 0; i < this.cIu; ++i) {
                SFConquestChallengeAttackerSiegeStoneDTO sFConquestChallengeAttackerSiegeStoneDTO = new SFConquestChallengeAttackerSiegeStoneDTO();
                sFConquestChallengeAttackerSiegeStoneDTO.worldX = 0.0f;
                sFConquestChallengeAttackerSiegeStoneDTO.worldY = 0.0f;
                sFConquestChallengeAttackerSiegeStoneDTO.worldZ = 0.0f;
                sFConquestChallengeAttackerSiegeStoneDTO.displayName = "Siege-Stone";
                sFConquestChallengeAttackerSiegeStoneDTO.resourceName = "r_siege bindstone large";
                sFConquestChallengeAttackerSiegeStoneDTO.healthCurrent = 1.0f;
                sFConquestChallengeAttackerSiegeStoneDTO.healthMax = 1.0f;
                sFConquestChallengeAttackerDTO.siegeStones.add(sFConquestChallengeAttackerSiegeStoneDTO);
            }
        }
        return sFConquestChallengeAttackerDTO;
    }
}

