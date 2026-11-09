/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanTagDTO;

@XStreamAlias(value="SFClanTagsDTO")
public class SFClanTagsDTO
extends SFXMLSerializable {
    public List<SFClanTagDTO> tags;
}

