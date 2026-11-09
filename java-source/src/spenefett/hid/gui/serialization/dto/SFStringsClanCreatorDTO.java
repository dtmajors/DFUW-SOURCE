/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanTagsDTO;

@XStreamAlias(value="SFStringsClanCreatorDTO")
public class SFStringsClanCreatorDTO
extends SFXMLSerializable {
    public String title;
    public String instructions;
    public String clanNameTitle;
    public String defaultClanNameText;
    public String clanMottoTitle;
    public String defaultClanMottoText;
    public String clanCharterTitle;
    public String defaultClanCharterText;
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
    public String createClanText;
    public String creatingClanText;
    public SFClanTagsDTO clanTags;
    public String trialAccountRestriction;
}

