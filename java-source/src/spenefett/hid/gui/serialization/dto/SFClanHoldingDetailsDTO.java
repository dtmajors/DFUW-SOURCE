/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanHoldingCitizenDTO;
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;

@XStreamAlias(value="SFClanHoldingDetailsDTO")
public class SFClanHoldingDetailsDTO
extends SFXMLSerializable {
    public String id;
    public String name;
    public int type;
    public String location;
    public String distance;
    public String ownerName;
    public int guardTowerPolicy;
    public int bankAccessPolicy;
    public int marketAccessPolicy;
    public String mayorName;
    public SFClanMemberInformationDTO mayor;
    public List<SFClanHoldingCitizenDTO> citizens;
    public int maxCitizens;
    public boolean playersClansHolding;
    public int gateControlPolicy;
    public boolean protectionActive;
    public boolean conquestActive;
    public boolean vulnerable;
    public List<String> protectionCostStrings;
    public List<String> protectionCostStringsWithAssetDamage;
    public int selectedProtection;
    public boolean protectionAvailable;
    public boolean protectionAutoRenews;
    public boolean protectionIncludesAssetDamage;
}

