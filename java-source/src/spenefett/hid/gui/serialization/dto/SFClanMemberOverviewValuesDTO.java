/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanMemberOverviewValuesDTO")
public class SFClanMemberOverviewValuesDTO
extends SFXMLSerializable {
    public boolean isPlayerMember;
    public String memberName;
    public int memberPlayerPoints;
    public int memberClanPoints;
    public int memberKills;
    public int memberRank;
    public boolean isOnline;
    public boolean isLeavingClan;
    public List<Integer> memberPermissions;
    public List<Integer> playerPermissions;
}

