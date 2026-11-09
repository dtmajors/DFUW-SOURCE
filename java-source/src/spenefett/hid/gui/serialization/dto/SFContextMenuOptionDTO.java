/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFContextMenuOptionDTO")
public class SFContextMenuOptionDTO
extends SFXMLSerializable {
    public String text = "";
    public String iconName = "";
}

