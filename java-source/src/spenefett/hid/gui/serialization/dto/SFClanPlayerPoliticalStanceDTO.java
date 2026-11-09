/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanPlayerPoliticalStanceDTO")
public class SFClanPlayerPoliticalStanceDTO
extends SFXMLSerializable {
    public int id;
    public String playerName;
    public boolean killOnSight;
    public boolean allowedToBind;
    public boolean banned;
}

