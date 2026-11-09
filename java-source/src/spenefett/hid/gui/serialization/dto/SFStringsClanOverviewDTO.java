/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanOverviewDTO")
public class SFStringsClanOverviewDTO
extends SFXMLSerializable {
    public String title;
    public String titlePlayerClan;
    public String clanCharterTitle;
    public String leaderTitle;
    public String founderTitle;
    public String membersCount;
    public String acceptingNewMembersText;
    public String raceNameAlfar;
    public String raceNameDwarf;
    public String raceNameHuman;
    public String raceNameMahirim;
    public String raceNameMirdain;
    public String raceNameOrk;
    public String holdingsTitle;
    public String clanTagsTitle;
    public String joinClanText;
    public String joiningClanText;
    public String updateClanText;
    public String updatingClanText;
    public String restrictionsPreventApplicationText;
    public List<String> politicalStanceNames;
    public String playerBannedFromJoiningText;
    public String clanPointsTitle;
    public String villagesTitle;
    public String fortressesTitle;
}

