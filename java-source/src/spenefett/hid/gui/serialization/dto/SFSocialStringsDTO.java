/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFSocialStringsDTO")
public class SFSocialStringsDTO
extends SFXMLSerializable {
    public String friendsTitle = null;
    public String blockedTitle = null;
    public String requestsTitle = null;
    public String sentRequestsTitle = null;
    public String receivedRequestsTitle = null;
    public String playerListHeader = null;
    public String addButtonLabel = null;
    public String searchPrompt = null;
    public String sendRequestButtonLabel = null;
    public String blockPlayerButtonLabel = null;
}

