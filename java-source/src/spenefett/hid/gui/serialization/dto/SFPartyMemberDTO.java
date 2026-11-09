/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

@XStreamAlias(value="SFPartyMemberDTO")
public class SFPartyMemberDTO
extends SFXMLSerializable {
    public String ID = null;
    public String LeaderIconName = null;
    public String Name = null;
    public SFGUIElementDTO MainSchool = new SFGUIElementDTO();
    public boolean Changed = false;
    public boolean RoundRobinExcluded = false;
}

