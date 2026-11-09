/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCityElementDTO;

@XStreamAlias(value="SFClanCityBlueprintElementUpdateDTO")
public class SFClanCityBlueprintElementUpdateDTO
extends SFXMLSerializable {
    public List<SFCityElementDTO> updatedElements;
}

