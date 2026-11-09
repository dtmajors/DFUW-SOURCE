/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFConquestMercenaryContractDTO")
public class SFConquestMercenaryContractDTO
extends SFXMLSerializable {
    public String clanName;
    public float wagerPercentageAmount;
    public int flatFeeAmount;
    public boolean receivedContract;
}

