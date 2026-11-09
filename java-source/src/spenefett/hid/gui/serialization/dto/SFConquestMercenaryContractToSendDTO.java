/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFConquestMercenaryContractToSendDTO")
public class SFConquestMercenaryContractToSendDTO
extends SFXMLSerializable {
    public int flatFeeReward;
    public float wagerPercentageReward;
    public List<String> recipientNames;
}

