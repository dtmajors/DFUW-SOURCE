/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFTenantPlayerDTO")
public class SFTenantPlayerDTO
extends SFXMLSerializable {
    public String GUID = null;
    public String firstName = null;
    public String lastName = null;
    public boolean online = false;
    public boolean safeAccess = false;
    public boolean changed = false;
    public boolean makeOwnerButtonEnabled = true;
    public boolean safeAccessButtonEnabled = true;
    public boolean chatButtonEnabled = true;
    public boolean removeButtonEnabled = true;
}

