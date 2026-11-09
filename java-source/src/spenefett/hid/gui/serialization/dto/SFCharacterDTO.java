/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterRaceDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterRoleDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterSchoolListDTO;

@XStreamAlias(value="SFCharacterDTO")
public class SFCharacterDTO
extends SFXMLSerializable {
    public String firstName = null;
    public String lastName = null;
    public SFCharacterRaceDTO race = null;
    public SFCharacterAppearanceDTO appearance = null;
    public SFCharacterRoleDTO role = null;
    public SFCharacterSchoolListDTO schools = null;

    public SFCharacterDTO() {
    }

    public SFCharacterDTO(String string, String string2) {
        this.firstName = string;
        this.lastName = string2;
        this.appearance = SFCharacterAppearanceDTO.cDC();
        this.race = new SFCharacterRaceDTO();
        this.role = new SFCharacterRoleDTO();
        this.schools = new SFCharacterSchoolListDTO();
    }
}

