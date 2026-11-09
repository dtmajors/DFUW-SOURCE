/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFConquestChallengeDefenderMercenaryDTO")
public class SFConquestChallengeDefenderMercenaryDTO
extends SFXMLSerializable {
    public String clanName;
    public boolean isPlayersClan;
    public int stanceToPlayersClan;
    public float percentageReward;
    public int goldReward;
}

