/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanCityNamesDTO")
public class SFClanCityNamesDTO
extends SFXMLSerializable {
    public List<String> names;
}

