/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeAttackerSiegeStoneDTO;

@XStreamAlias(value="SFConquestChallengeAttackerDTO")
public class SFConquestChallengeAttackerDTO
extends SFXMLSerializable {
    public String clanName;
    public boolean isMercenary;
    public boolean isPlayersClan;
    public boolean isRemoved;
    public float score;
    public int stanceToPlayersClan;
    public int siegeStonePlacementTimer;
    public int maxSiegeStones;
    public List<SFConquestChallengeAttackerSiegeStoneDTO> siegeStones;
}

