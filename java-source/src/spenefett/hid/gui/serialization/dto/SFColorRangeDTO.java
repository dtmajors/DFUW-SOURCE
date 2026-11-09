/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFColorRangeDTO")
public class SFColorRangeDTO
extends SFXMLSerializable {
    public int colorFrom = 0;
    public int colorTo = 0;
}

