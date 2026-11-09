/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerSiegeStoneDTO;

public class azw {
    private ldv GUID = null;
    private ljq Position = null;
    private int ResourceType = 0;
    private String Name = null;
    private float bWk = 0.0f;
    private float cIk = 0.0f;

    public ldv getGUID() {
        return this.GUID;
    }

    void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public ljq av() {
        return this.Position;
    }

    void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public int az() {
        return this.ResourceType;
    }

    void l(int n) {
        this.ResourceType = n;
    }

    public String getName() {
        return this.Name;
    }

    void setName(String string) {
        this.Name = string;
    }

    public float Ub() {
        return this.bWk;
    }

    void ck(float f) {
        this.bWk = f;
    }

    public float afi() {
        return this.cIk;
    }

    void cl(float f) {
        this.cIk = f;
    }

    azw() {
    }

    public boolean cm(float f) {
        if (this.cIk == f) {
            return false;
        }
        this.cIk = f;
        return true;
    }

    public SFConquestChallengeAttackerSiegeStoneDTO afj() {
        SFConquestChallengeAttackerSiegeStoneDTO sFConquestChallengeAttackerSiegeStoneDTO = new SFConquestChallengeAttackerSiegeStoneDTO();
        sFConquestChallengeAttackerSiegeStoneDTO.displayName = this.Name;
        sFConquestChallengeAttackerSiegeStoneDTO.resourceName = lea.enW().getName(this.ResourceType);
        sFConquestChallengeAttackerSiegeStoneDTO.healthCurrent = this.cIk;
        sFConquestChallengeAttackerSiegeStoneDTO.healthMax = this.bWk;
        sFConquestChallengeAttackerSiegeStoneDTO.worldX = this.Position.x;
        sFConquestChallengeAttackerSiegeStoneDTO.worldY = this.Position.y;
        sFConquestChallengeAttackerSiegeStoneDTO.worldZ = this.Position.rlV;
        return sFConquestChallengeAttackerSiegeStoneDTO;
    }
}

