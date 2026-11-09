/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

@XStreamAlias(value="SFCharacterSkillDTO")
public class SFCharacterSkillDTO
extends SFXMLSerializable {
    public SFGUIElementDTO element = new SFGUIElementDTO();
    public String name = null;
    public String description = null;
}

