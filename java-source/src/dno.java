/*
 * Decompiled with CFR.
 */
public class dno
extends dnl {
    public ldv dAu = null;
    public dod gKZ = null;

    public dno() {
        super(2);
    }

    @Override
    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.brB());
        stringBuilder.append(" InventoryGUID=");
        stringBuilder.append(this.dAu);
        stringBuilder.append(" Item=");
        stringBuilder.append(this.gKZ);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.dAu == null) {
            lfn.b(5, "SFTransactionInfoChangeSlot", "validate() InventoryGUID is null.");
            return false;
        }
        if (this.gKZ == null) {
            lfn.b(5, "SFTransactionInfoChangeSlot", "validate() Item is null.");
            return false;
        }
        if (!this.gKZ.validate()) {
            lfn.b(5, "SFTransactionInfoChangeSlot", "validate() Item is invalid.");
            return false;
        }
        return true;
    }
}

