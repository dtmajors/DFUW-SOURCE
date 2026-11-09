/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanMemberRosterDTO")
public class SFStringsClanMemberRosterDTO
extends SFXMLSerializable {
    public String title;
    public String memberNameHeader;
    public String killsHeader;
    public String clanPointsHeader;
    public String searchFilterDefaultText;
    public String raceNameAlfar;
    public String raceNameDwarf;
    public String raceNameHuman;
    public String raceNameMahirim;
    public String raceNameMirdain;
    public String raceNameOrk;
}

