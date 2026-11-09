/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanMembershipRestrictionsDTO")
public class SFClanMembershipRestrictionsDTO
extends SFXMLSerializable {
    public boolean acceptingAlfar;
    public boolean acceptingDwarf;
    public boolean acceptingHuman;
    public boolean acceptingMahirim;
    public boolean acceptingMirdain;
    public boolean acceptingOrk;
    public boolean acceptingNewMembers;
}

