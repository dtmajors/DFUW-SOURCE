/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFWorldMapCreateMarkerDTO;

@XStreamAlias(value="SFWorldMapCreateMarkerListDTO")
public class SFWorldMapCreateMarkerListDTO
extends SFXMLSerializable {
    public List<SFWorldMapCreateMarkerDTO> list = lcn.emv();
}

