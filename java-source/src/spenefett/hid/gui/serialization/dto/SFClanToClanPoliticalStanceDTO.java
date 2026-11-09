/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanToClanPoliticalStanceDTO")
public class SFClanToClanPoliticalStanceDTO
extends SFXMLSerializable {
    public int playerRace;
    public boolean playerHasClan;
    public boolean playersClan;
    public boolean playerHasEditPermission;
    public int politicalStance;
    public int theirPoliticalStance;
    public boolean playerAppliedToJoinClan;
    public boolean playerIsBannedFromClan;
}

