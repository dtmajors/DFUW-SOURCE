/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanMembershipCountsDTO")
public class SFClanMembershipCountsDTO
extends SFXMLSerializable {
    public int totalMembers;
    public int alfarMembers;
    public int dwarfMembers;
    public int humanMembers;
    public int mahirimMembers;
    public int mirdainMembers;
    public int orkMembers;
}

