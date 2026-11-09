/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFConquestChallengeAttackerSiegeStoneDTO")
public class SFConquestChallengeAttackerSiegeStoneDTO
extends SFXMLSerializable {
    public float worldX;
    public float worldY;
    public float worldZ;
    public float healthCurrent;
    public float healthMax;
    public String resourceName;
    public String displayName;
}

