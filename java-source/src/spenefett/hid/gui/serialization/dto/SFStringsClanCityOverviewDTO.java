/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanCityOverviewDTO")
public class SFStringsClanCityOverviewDTO
extends SFXMLSerializable {
    public String title;
    public String stancePlayerCanEnter;
    public String stancePlayerCannotEnter;
    public String stancePlayerCanBind;
    public String stancePlayerIsBound;
    public String mayorTitle;
    public String noMayorText;
    public String guardPolicyTitle;
    public List<String> guardPolicyNames;
    public String bankAccessPolicyTitle;
    public List<String> bankAccessPolicyNames;
    public String citizenListTitle;
    public String updateCityAction;
    public String updatingCityAction;
    public String conquestTitle;
    public String gateControlPolicyTitle;
    public List<String> gateControlPolicyNames;
    public String protectionTitle;
    public List<String> protectionDescriptions;
    public String protectionCanBeAutoRenewed;
    public String protectionCannotBeAutoRenewed;
    public String protectionCanIncludeAssetDamage;
    public String protectionCannotIncludeAssetDamage;
    public String villagesTitle;
    public String cityMapTitle;
    public String marketAccessPolicyTitle;
}

