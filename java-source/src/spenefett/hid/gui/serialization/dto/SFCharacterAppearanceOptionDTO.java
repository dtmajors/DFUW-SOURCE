/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFCharacterAppearanceOptionDTO")
public class SFCharacterAppearanceOptionDTO
extends SFXMLSerializable {
    public String type = "";
    public String text = "";
    public int value = 0;
}

