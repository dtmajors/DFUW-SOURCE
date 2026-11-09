/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFRectDTO")
public class SFRectDTO
extends SFXMLSerializable {
    public float X;
    public float Y;
    public float W;
    public float H;
}

