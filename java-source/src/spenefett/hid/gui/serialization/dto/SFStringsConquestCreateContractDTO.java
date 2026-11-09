/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsConquestCreateContractDTO")
public class SFStringsConquestCreateContractDTO
extends SFXMLSerializable {
    public String title;
    public String clanNameHeader;
    public String clanSizeHeader;
    public String filtersTitle;
    public String textFilterDefaultText;
    public String issueContractsText;
    public String issuingContractsText;
}

