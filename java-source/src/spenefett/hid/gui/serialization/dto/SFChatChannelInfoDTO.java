/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFChatChannelInfoDTO")
public class SFChatChannelInfoDTO
extends SFXMLSerializable {
    public int id = -1;
    public int defaultTargetOrdinal = -1;
    public int menuButtonOrdinal = -1;
    public String channelName = null;
    public String channelShortName = null;
    public String flashFunctionName = null;
    public String iconPath = null;
    public String visibleConfigEntryName = null;
    public boolean isVisible = true;
    public boolean isHideable = true;
    public boolean isEnabled = true;
    public boolean showNotification = false;
    public double fontSize;

    public SFChatChannelInfoDTO() {
        this.fontSize = idd.lJp.lJq;
    }
}

