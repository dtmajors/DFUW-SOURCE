/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanMemberSelectorDTO")
public class SFStringsClanMemberSelectorDTO
extends SFXMLSerializable {
    public String title;
    public String memberNameHeader;
    public String killsHeader;
    public String clanPointsHeader;
    public String searchFilterDefaultText;
}

