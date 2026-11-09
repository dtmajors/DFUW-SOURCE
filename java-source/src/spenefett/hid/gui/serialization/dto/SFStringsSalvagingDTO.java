/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsSalvagingDTO")
public class SFStringsSalvagingDTO
extends SFXMLSerializable {
    public String title;
    public String instructions;
    public String dropHereText;
    public String requiredCraftingSkillTitle;
    public String requiredWorkstationText;
    public String salvageableResourcesTitle;
    public String salvageAmountTitle;
    public String currentGoldCostText;
    public String totalGoldCostText;
    public String currentOperationTimeText;
    public String totalOperationTimeText;
    public String cannotSalvageText;
    public String beginSalvagingText;
    public String cancelSalvagingText;
    public String workstationBonusesText;
    public String selentineAreaText;
}

