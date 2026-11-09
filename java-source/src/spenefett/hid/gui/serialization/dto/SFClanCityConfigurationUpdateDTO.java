/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanHoldingCitizenDTO;
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;

@XStreamAlias(value="SFClanCityConfigurationUpdateDTO")
public class SFClanCityConfigurationUpdateDTO
extends SFXMLSerializable {
    public SFClanMemberInformationDTO mayor;
    public int guardPolicy;
    public int bankAccessPolicy;
    public int marketAccessPolicy;
    public List<SFClanHoldingCitizenDTO> citizensToKick;
    public int gateControlPolicy;
    public int protectionIndex;
    public boolean protectionAutoRenew;
    public boolean protectionIncludesAssetDamage;
}

