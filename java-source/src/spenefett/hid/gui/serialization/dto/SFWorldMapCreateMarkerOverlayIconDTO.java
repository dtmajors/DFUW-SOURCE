/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFWorldMapCreateMarkerOverlayIconDTO")
public class SFWorldMapCreateMarkerOverlayIconDTO
extends SFXMLSerializable {
    public int id;
    public String type;
    public float horizontalPosition;
    public float verticalPosition;
    public List<String> attributes = lcn.emv();
}

