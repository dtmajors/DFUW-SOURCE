/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFColorRangeDTO;

@XStreamAlias(value="SFColorRangeListDTO")
public class SFColorRangeListDTO
extends SFXMLSerializable {
    public List<SFColorRangeDTO> list = lcn.emv();
}

