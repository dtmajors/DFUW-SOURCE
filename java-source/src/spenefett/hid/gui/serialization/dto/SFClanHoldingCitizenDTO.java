/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanHoldingCitizenDTO")
public class SFClanHoldingCitizenDTO
extends SFXMLSerializable {
    public String playerName;
    public String clanName;
    public boolean ownerClanMember;
}

