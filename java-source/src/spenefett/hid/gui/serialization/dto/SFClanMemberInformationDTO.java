/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanMemberInformationDTO")
public class SFClanMemberInformationDTO
extends SFXMLSerializable {
    public int characterID;
    public String name;
    public int rank;
    public int killCount;
    public int clanPointsEarned;
    public int playerPointsTotal;
    public boolean isOnline;
    public boolean isLeavingClan;
    public List<Integer> permissions;
    public boolean isManager;
    public boolean isLeader;
    public boolean isFounder;
    public boolean isPlayer;
    public String raceName;
    public int gender;
    public int lastOnlineTimeSortOrderIdx;
}

