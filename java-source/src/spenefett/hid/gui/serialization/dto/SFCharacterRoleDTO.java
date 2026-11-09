/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCharacterSchoolListDTO;

@XStreamAlias(value="SFCharacterRoleDTO")
public class SFCharacterRoleDTO
extends SFXMLSerializable {
    public SFCharacterSchoolListDTO schools = new SFCharacterSchoolListDTO();
    public String name = null;
    public String description = null;
    public String armorResource = null;
    public boolean active = false;
}

