/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFWorldMapCreateMarkerOverlayIconDTO;

@XStreamAlias(value="SFWorldMapCreateMarkerDTO")
public class SFWorldMapCreateMarkerDTO
extends SFXMLSerializable {
    public int id;
    public float x;
    public float y;
    public float rotation;
    public String iconPath;
    public String trackedItemIconPath;
    public int zOrder;
    public boolean tracked;
    public float progress;
    public int progressBarColor;
    public boolean aboveFogOfWar;
    public Map<String, String> attributes = lcn.emw();
    public List<SFWorldMapCreateMarkerOverlayIconDTO> overlays = lcn.emv();
}

