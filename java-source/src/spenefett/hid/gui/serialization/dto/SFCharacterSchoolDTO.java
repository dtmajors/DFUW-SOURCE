/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCharacterSkillListDTO;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

@XStreamAlias(value="SFCharacterSchoolDTO")
public class SFCharacterSchoolDTO
extends SFXMLSerializable {
    public SFGUIElementDTO element = new SFGUIElementDTO();
    public SFCharacterSkillListDTO skills = new SFCharacterSkillListDTO();
    public String name = null;
    public String description = null;
}

