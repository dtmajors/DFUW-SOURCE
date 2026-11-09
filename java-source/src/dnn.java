/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class dnn
extends dnl {
    public ldv dAu = null;
    public ldv aXQ = null;
    public int dJc = -1;
    public int gKW = -1;
    public float gKX = 0.0f;
    public dnz[] gKY = null;

    public dnn() {
        super(14);
    }

    public String brF() {
        return lea.enW().getName(this.gKW);
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
        stringBuilder.append(" NewWeaponResourceType='");
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
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.dAu == null) {
            lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() InventoryGUID is null.");
            return false;
        }
        if (this.aXQ == null) {
            lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() ContainerItemGUID is null.");
            return false;
        }
        if (this.dJc < 0) {
            lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() SlotNumber is invalid.");
            return false;
        }
        if (!cug.vF((int)this.gKW)) {
            lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() NewWeaponResourceType is invalid.");
            return false;
        }
        if (this.gKX <= 0.0f) {
            lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() WeaponCost is invalid.");
            return false;
        }
        if (this.gKY == null || this.gKY.length == 0) {
            lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() CurrencyItems array is null or empty.");
            return false;
        }
        int n = this.gKY.length;
        for (int i = 0; i < n; ++i) {
            if (this.gKY[i] == null) {
                lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() CurrencyItem " + i + " in array is null.");
                return false;
            }
            if (this.gKY[i].validate()) continue;
            lfn.b(5, "SFTransactionInfoAddStartingWeapon", "validate() CurrencyItem " + i + " in array is invalid.");
            return false;
        }
        return true;
    }
}

