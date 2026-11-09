/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class dnp
extends dnl {
    public ldv dAu = null;
    public ldv aXQ = null;
    public int dJc = -1;
    public int gLa = -1;
    public int gKW = -1;
    public float gKX = 0.0f;
    public dnz[] gKY = null;
    public dny gLb = null;

    public dnp() {
        super(15);
    }

    public String brF() {
        return lea.enW().getName(this.gKW);
    }

    public String brG() {
        return lea.enW().getName(this.gLa);
    }

    @Override
    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.brB());
        stringBuilder.append(" InventoryGUID=");
        stringBuilder.append(this.dAu);
        stringBuilder.append(" ContainerItemGUID=");
        stringBuilder.append(this.aXQ);
        stringBuilder.append(" SlotNumber=");
        stringBuilder.append(this.dJc);
        stringBuilder.append(" OldWeaponResourceType='");
        stringBuilder.append(this.brG());
        stringBuilder.append("' NewWeaponResourceType='");
        stringBuilder.append(this.brF());
        stringBuilder.append("' WeaponCost=");
        stringBuilder.append(this.gKX);
        stringBuilder.append(" CurrencyItems=[");
        int n = this.gKY.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.gKY[i]);
        }
        stringBuilder.append("] OldWeaponItem=");
        stringBuilder.append(this.gLb);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.dAu == null) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() InventoryGUID is null.");
            return false;
        }
        if (this.aXQ == null) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() ContainerItemGUID is null.");
            return false;
        }
        if (this.dJc < 0) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() SlotNumber is invalid.");
            return false;
        }
        if (!cug.vF((int)this.gLa)) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() OldWeaponResourceType is invalid.");
            return false;
        }
        if (!cug.vF((int)this.gKW)) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() NewWeaponResourceType is invalid.");
            return false;
        }
        if (this.gKX <= 0.0f) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() WeaponCost is invalid.");
            return false;
        }
        if (this.gKY == null || this.gKY.length == 0) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() CurrencyItems array is null or empty.");
            return false;
        }
        if (this.gLb == null) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() OldWeaponItem is null.");
            return false;
        }
        if (!this.gLb.validate()) {
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() OldWeaponItem is invalid.");
            return false;
        }
        int n = this.gKY.length;
        for (int i = 0; i < n; ++i) {
            if (this.gKY[i] == null) {
                lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() CurrencyItem " + i + " in array is null.");
                return false;
            }
            if (this.gKY[i].validate()) continue;
            lfn.b(5, "SFTransactionInfoChangeStartingWeapon", "validate() CurrencyItem " + i + " in array is invalid.");
            return false;
        }
        return true;
    }
}

