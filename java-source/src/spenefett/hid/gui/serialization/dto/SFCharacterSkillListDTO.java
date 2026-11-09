/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCharacterSkillDTO;

@XStreamAlias(value="SFCharacterSkillListDTO")
public class SFCharacterSkillListDTO
extends SFXMLSerializable {
    public List<SFCharacterSkillDTO> list = lcn.emv();
}

