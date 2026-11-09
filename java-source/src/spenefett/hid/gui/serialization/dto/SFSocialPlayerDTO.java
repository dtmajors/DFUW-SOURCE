/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFSocialPlayerDTO")
public class SFSocialPlayerDTO
extends SFXMLSerializable {
    public String GUID = null;
    public String firstName = null;
    public String lastName = null;
    public boolean online = false;
    public boolean changed = false;
    public boolean selected = false;
    public boolean removeToggleOn = false;
    public boolean blockToggleOn = false;
    public boolean summonAvailable = false;
}

