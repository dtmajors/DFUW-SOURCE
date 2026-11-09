/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFWorldMapDestroyMarkerDTO;

@XStreamAlias(value="SFWorldMapDestroyMarkerListDTO")
public class SFWorldMapDestroyMarkerListDTO
extends SFXMLSerializable {
    public List<SFWorldMapDestroyMarkerDTO> list = lcn.emv();
}

