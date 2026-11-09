/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFIngredientDTO;

@XStreamAlias(value="SFIngredientListDTO")
public class SFIngredientListDTO
extends SFXMLSerializable {
    public List<SFIngredientDTO> list = lcn.emv();
}

