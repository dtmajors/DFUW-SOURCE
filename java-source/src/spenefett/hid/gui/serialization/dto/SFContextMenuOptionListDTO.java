/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFContextMenuOptionDTO;

@XStreamAlias(value="SFContextMenuOptionListDTO")
public class SFContextMenuOptionListDTO
extends SFXMLSerializable {
    public List<SFContextMenuOptionDTO> list = lcn.emv();
}

