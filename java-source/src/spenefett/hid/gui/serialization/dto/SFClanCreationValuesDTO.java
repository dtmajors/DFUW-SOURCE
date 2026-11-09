/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanMembershipRestrictionsDTO;

@XStreamAlias(value="SFClanCreationValuesDTO")
public class SFClanCreationValuesDTO
extends SFXMLSerializable {
    public String clanName;
    public String clanMotto;
    public String clanCharter;
    public SFClanMembershipRestrictionsDTO membershipRestrictions;
    public List<Integer> clanTags;
}

