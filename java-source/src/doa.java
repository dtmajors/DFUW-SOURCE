/*
 * Decompiled with CFR.
 */
public class doa
extends dny {
    public int ResourceType = 0;
    public int asi = 0;
    public float aXV = 0.0f;
    public float gLA = -1.0f;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        stringBuilder.append(" Cost=");
        stringBuilder.append(this.aXV);
        stringBuilder.append(" UnitWeight=");
        stringBuilder.append(this.gLA);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.ResourceType <= 0) {
            lfn.b(5, "SFTransactionItemCurrency", "validate() ResourceType is invalid.");
            return false;
        }
        if (this.asi <= 0) {
            lfn.b(5, "SFTransactionItemCurrency", "validate() Quantity is invalid.");
            return false;
        }
        if (this.aXV <= 0.0f) {
            lfn.b(5, "SFTransactionItemCurrency", "validate() Cost is invalid.");
            return false;
        }
        if (this.gLA < 0.0f) {
            lfn.b(5, "SFTransactionItemCurrency", "validate() UnitWeight is invalid.");
            return false;
        }
        return true;
    }
}

