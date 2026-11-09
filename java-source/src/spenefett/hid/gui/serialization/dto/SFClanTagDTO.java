/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanTagDTO")
public class SFClanTagDTO
extends SFXMLSerializable {
    public int id;
    public String name;
}

