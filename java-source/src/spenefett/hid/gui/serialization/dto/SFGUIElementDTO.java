/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFGUIElementDTO")
public class SFGUIElementDTO
extends SFXMLSerializable {
    public int type = hxx.llA.ordinal();
    public int state = hxw.llv.ordinal();
    public int id = 0;
    public int bagId = 0;
    public int quantity = 1;
    public double progress = -1.0;
    public String iconName = "";
    public String text = "";
    public int nameLabelColor = 0xFFFFFF;
    public boolean visible = true;
    public boolean changed = false;
    public double offsetX = 0.0;
    public double offsetY = 0.0;
    public double scale = 1.0;
    public int progressShape = 2;
    public int progressColor = 0xFF0000;
    public int progressTrackColor = 0xFFFFFF;
    public String quantityText;
    public int indicators = 0;
    public boolean quickItem = false;
    public int skillUpButton = 0;
    public int primaryDye = 0;
    public int secondaryDye = 0;
}

