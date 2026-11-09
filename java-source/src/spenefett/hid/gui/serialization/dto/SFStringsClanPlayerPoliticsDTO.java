/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanPlayerPoliticsDTO")
public class SFStringsClanPlayerPoliticsDTO
extends SFXMLSerializable {
    public String title;
    public String playerNameHeader;
    public String kosColumnHeader;
    public String bindColumnHeader;
    public String bannedColumnHeader;
    public String addPlayerButtonText;
    public String showListButtonText;
    public String searchTextDefaultTextListView;
    public String searchTextDefaultTextAddPlayerView;
    public String updateClanAction;
    public String updatingClanAction;
}

