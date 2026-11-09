/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCharacterRaceDTO;

@XStreamAlias(value="SFCharacterRaceListDTO")
public class SFCharacterRaceListDTO
extends SFXMLSerializable {
    public List<SFCharacterRaceDTO> list = lcn.emv();
}

