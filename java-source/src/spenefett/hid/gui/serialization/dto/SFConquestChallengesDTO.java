/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFConquestChallengeDTO;

@XStreamAlias(value="SFConquestChallengesDTO")
public class SFConquestChallengesDTO
extends SFXMLSerializable {
    public List<SFConquestChallengeDTO> challenges;
    public int gameModeChallengeIdx;
}

