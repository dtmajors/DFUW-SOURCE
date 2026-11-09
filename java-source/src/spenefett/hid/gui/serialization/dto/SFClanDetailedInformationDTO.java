/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.dto.SFClanFortressDetailsDTO;
import spenefett.hid.gui.serialization.dto.SFClanHoldingDetailsDTO;
import spenefett.hid.gui.serialization.dto.SFClanInformationDTO;
import spenefett.hid.gui.serialization.dto.SFClanVillageDetailsDTO;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDTO;
import spenefett.hid.gui.serialization.dto.SFConquestMercenaryContractDTO;

@XStreamAlias(value="SFClanDetailedInformationDTO")
public class SFClanDetailedInformationDTO
extends SFClanInformationDTO {
    public List<SFClanHoldingDetailsDTO> holdings;
    public List<SFConquestMercenaryContractDTO> receivedContracts;
    public List<SFConquestChallengeDTO> receivedContractChallenges;
    public List<SFConquestMercenaryContractDTO> sentContracts;
    public List<SFConquestChallengeDTO> sentContractChallenges;
    public int clanPointsAvailable;
    public List<SFClanVillageDetailsDTO> villages;
    public List<SFClanFortressDetailsDTO> fortresses;
}

