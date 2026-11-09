/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanMemberOverviewDTO")
public class SFStringsClanMemberOverviewDTO
extends SFXMLSerializable {
    public String titlePlayerMember;
    public String titleClanMember;
    public String playerPointsTitle;
    public String clanPointsTitle;
    public String killsTitle;
    public String permissionsTitle;
    public List<String> permissionCategoryNames;
    public List<String> permissionNames;
    public String leaveClanButtonAction;
    public String leaveClanMessage;
    public String leavingClanButtonAction;
    public String leavingClanMessage;
    public String savePermissionsButtonAction;
    public String savingPermissionsButtonAction;
    public String kickPlayerButtonAction;
    public String kickingPlayerButtonAction;
    public String banPlayerButtonAction;
    public String banningPlayerButtonAction;
}

