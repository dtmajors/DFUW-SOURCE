/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;
import spenefett.hid.gui.serialization.dto.SFClanMembershipRestrictionsDTO;

@XStreamAlias(value="SFClanConfigurationValuesDTO")
public class SFClanConfigurationValuesDTO
extends SFXMLSerializable {
    public String clanName;
    public String clanMotto;
    public String clanCharter;
    public List<Integer> clanTags;
    public SFClanMembershipRestrictionsDTO membershipRestrictions;
    public SFClanMemberInformationDTO leader;
    public String founder;
    public SFClanMemberInformationDTO founderInfo;
    public List<String> villageTimerOptions;
    public int currentVillageTimerOption;
    public String villageTimerValue;
    public String villageRewardsValue;
    public String villageGlobulesValue;
    public boolean hasVillages;
}

