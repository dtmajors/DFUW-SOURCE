/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

@XStreamAlias(value="SFGUIElementListDTO")
public class SFGUIElementListDTO
extends SFXMLSerializable {
    public List<SFGUIElementDTO> list = lcn.emv();
}

