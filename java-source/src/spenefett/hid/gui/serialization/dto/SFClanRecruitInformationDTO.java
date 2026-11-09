/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanRecruitInformationDTO")
public class SFClanRecruitInformationDTO
extends SFXMLSerializable {
    public String playerName;
    public String playerRace;
    public int playerGender;
    public int playerPoints;
}

