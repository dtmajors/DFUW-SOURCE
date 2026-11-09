/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFCityElementDTO")
public class SFCityElementDTO
extends SFXMLSerializable {
    public float x;
    public float y;
    public float rotation;
    public String resourceName;
    public int category;
    public boolean built;
    public int currentLevel;
    public int maxLevel;
    public boolean buildable;
    public int id;
    public String displayName;
    public String description;
    public String costString;
    public String actionString;
    public List<String> prerequisiteResourceNames;
    public List<String> prerequisiteResourceDisplayNames;
    public List<Integer> prerequisiteLevels;
    public boolean enabled;
    public float currentHealth;
    public float maximumHealth;
    public boolean modifying;
}

