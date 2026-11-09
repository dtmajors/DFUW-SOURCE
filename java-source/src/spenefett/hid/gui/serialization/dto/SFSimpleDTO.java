/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFSimpleDTO")
public final class SFSimpleDTO
extends SFXMLSerializable {
    public String testString;
    public double testDouble;
}

