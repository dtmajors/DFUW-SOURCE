/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFIngredientDTO")
public class SFIngredientDTO
extends SFXMLSerializable {
    public int quantity;
    public String name;
    public boolean success;
    public boolean isGold;
    public boolean workstationBonusActive;

    public SFIngredientDTO() {
    }

    public SFIngredientDTO(int n, String string, boolean bl, boolean bl2, boolean bl3) {
        this.quantity = n;
        this.name = string;
        this.success = bl;
        this.isGold = bl2;
        this.workstationBonusActive = bl3;
    }
}

