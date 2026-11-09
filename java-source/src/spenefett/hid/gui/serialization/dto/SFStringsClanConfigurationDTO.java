/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanTagsDTO;

@XStreamAlias(value="SFStringsClanConfigurationDTO")
public class SFStringsClanConfigurationDTO
extends SFXMLSerializable {
    public String title;
    public String clanNameTitle;
    public String clanMottoTitle;
    public String clanCharterTitle;
    public String membershipRestrictionsTitle;
    public String membershipRestrictionsInfo;
    public String humanRaceName;
    public String mirdainRaceName;
    public String dwarfRaceName;
    public String orkRaceName;
    public String alfarRaceName;
    public String mahirimRaceName;
    public String acceptingNewMembers;
    public String clanTagsTitle;
    public String clanTagsInfo;
    public String updateClanText;
    public String updatingClanConfigurationText;
    public SFClanTagsDTO clanTags;
    public String leaderTitle;
    public String founderTitle;
    public String mottoDefaultText;
    public String charterDefaultText;
    public String villageTimerOptionsTitle;
    public String villageTimerCycleCurrentTitle;
    public String villageTimerCycleNextTitle;
    public String villageTimerCycleTimerLabel;
    public String villageTimerCycleRewardsLabel;
    public String villageTimerCycleGlobulesLabel;
}

