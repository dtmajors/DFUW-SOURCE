/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanMembershipCountsDTO;
import spenefett.hid.gui.serialization.dto.SFClanMembershipRestrictionsDTO;

@XStreamAlias(value="SFClanInformationDTO")
public class SFClanInformationDTO
extends SFXMLSerializable {
    public String clanName = null;
    public String clanFounderName = null;
    public String clanLeaderName = null;
    public String clanMotto = null;
    public String clanCharter = null;
    public SFClanMembershipCountsDTO membershipCounts;
    public SFClanMembershipRestrictionsDTO membershipRestrictions;
    public List<Integer> clanTags = null;
    public boolean playerOnKOS;
    public boolean playerOnBanned;
    public boolean playerOnAllowedBinds;
    public int politicalStance;
    public int theirPoliticalStance;
    public int clanPointsTotal;
    public boolean leaderOnline;
    public boolean founderOnline;
    public boolean leaderIsPlayer;
    public boolean founderIsPlayer;
}

