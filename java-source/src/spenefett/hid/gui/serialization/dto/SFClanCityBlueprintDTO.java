/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCityElementDTO;

@XStreamAlias(value="SFClanCityBlueprintDTO")
public class SFClanCityBlueprintDTO
extends SFXMLSerializable {
    public String name;
    public String mapTitle;
    public float x;
    public float y;
    public float minX;
    public float minY;
    public List<SFCityElementDTO> elements;
    public String builtValuesTitle;
    public String prerequisitesTitle;
    public String healthString;
    public String stateStringEnabled;
    public String stateStringDisabled;
    public String upgradeLevelString;
}

