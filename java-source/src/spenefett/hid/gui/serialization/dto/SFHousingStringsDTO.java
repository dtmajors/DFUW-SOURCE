/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFHousingStringsDTO")
public class SFHousingStringsDTO
extends SFXMLSerializable {
    public String headerTitle = null;
    public String houseName = null;
    public String houseDescription = null;
    public String exteriorTitle = null;
    public String interiorTitle = null;
    public String tenantsTitle = null;
    public String tenantsName = null;
}

