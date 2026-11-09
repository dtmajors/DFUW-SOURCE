/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFSalvageableResourceDTO")
public class SFSalvageableResourceDTO
extends SFXMLSerializable {
    public int quantity;
    public String resourceName;
    public int chance;
    public boolean hasBonus;
}

