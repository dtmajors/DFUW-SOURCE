/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanRecruitsDTO")
public class SFStringsClanRecruitsDTO
extends SFXMLSerializable {
    public String title;
    public String playerNameHeader;
    public String raceHeader;
    public String playerPointsHeader;
    public String searchFilterDefaultText;
    public String updateClanRecruitsText;
    public String updatingClanRecruitsText;
}

