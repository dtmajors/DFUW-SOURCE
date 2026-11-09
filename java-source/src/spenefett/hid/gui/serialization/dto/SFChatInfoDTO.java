/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFChatChannelInfoDTO;

@XStreamAlias(value="SFChatInfoDTO")
public class SFChatInfoDTO
extends SFXMLSerializable {
    public int activeChannelId = 0;
    public int visibleChannelsCount = 0;
    public SFChatChannelInfoDTO combatLog = new SFChatChannelInfoDTO();
    public SFChatChannelInfoDTO globalChannel = new SFChatChannelInfoDTO();
    public SFChatChannelInfoDTO areaChannel = new SFChatChannelInfoDTO();
    public SFChatChannelInfoDTO partyChannel = new SFChatChannelInfoDTO();
    public SFChatChannelInfoDTO privateChannel = new SFChatChannelInfoDTO();
    public SFChatChannelInfoDTO clanChannel = new SFChatChannelInfoDTO();
    public SFChatChannelInfoDTO clanAllianceChannel = new SFChatChannelInfoDTO();
    public SFChatChannelInfoDTO globalJapanChannel = new SFChatChannelInfoDTO();
}

