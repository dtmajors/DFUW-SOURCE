/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanVillageDetailsDTO")
public class SFClanVillageDetailsDTO
extends SFXMLSerializable {
    public String id;
    public String name;
    public boolean owned;
    public String ownerClanName;
    public boolean playersClanOwned;
    public boolean isVulnerable;
    public boolean isRequisitioningAvailable;
}

