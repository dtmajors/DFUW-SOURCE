/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDefenderMercenaryDTO;
import spenefett.hid.gui.serialization.dto.SFConquestMercenaryContractDTO;

@XStreamAlias(value="SFConquestChallengeDTO")
public class SFConquestChallengeDTO
extends SFXMLSerializable {
    public int challengeType;
    public String holdingID;
    public String holdingName;
    public int holdingType;
    public long countdownTimer;
    public int attackerVulnerabilityCountdown;
    public int defenderVulnerabilityCountdown;
    public int wallsProtectingHolding;
    public String defenderClanName;
    public boolean viewerHasClan;
    public boolean viewerHasInitiatePermissions;
    public boolean viewerHasIssueContractPermissions;
    public boolean isPlayersClan;
    public int stanceToPlayersClan;
    public float bindstoneMaxHealth;
    public float bindstoneCurrentHealth;
    public List<SFConquestChallengeDefenderMercenaryDTO> defenderMercenaries;
    public List<SFConquestChallengeAttackerDTO> attackers;
    public int attackerWagerCost;
    public List<SFConquestMercenaryContractDTO> pendingContracts;
}

