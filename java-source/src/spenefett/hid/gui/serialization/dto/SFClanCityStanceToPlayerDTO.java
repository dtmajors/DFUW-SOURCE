/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanCityStanceToPlayerDTO")
public class SFClanCityStanceToPlayerDTO
extends SFXMLSerializable {
    public boolean isPlayersClansCity;
    public boolean canPlayerEnter;
    public boolean canPlayerBind;
    public boolean isPlayerBound;
    public boolean canPlayerEditMayor;
    public boolean canPlayerEditConquest;
    public boolean canPlayerIssueMercenaries;
    public boolean canPlayerEditMercenaries;
    public boolean canPlayerBuildCity;
    public boolean canPlayerEditGuardPolicy;
    public boolean canPlayerEditBankAccessPolicy;
    public boolean canPlayerEditMarketAccessPolicy;
    public boolean canPlayerEditCitizens;
    public boolean canPlayerEditGateControlPolicy;
    public boolean canPlayerEditCityProtection;
}

