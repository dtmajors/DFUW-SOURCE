/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanFortressDetailsDTO")
public class SFClanFortressDetailsDTO
extends SFXMLSerializable {
    public boolean owned;
    public boolean playersClanOwned;
    public boolean isActive;
    public boolean isVulnerable;
    public boolean isDestroyed;
    public String name;
    public String id;
}

