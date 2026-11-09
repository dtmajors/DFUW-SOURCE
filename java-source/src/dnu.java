/*
 * Decompiled with CFR.
 */
public class dnu
extends dnl {
    public ldv dAu = null;
    public ldv aXQ = null;
    public dob gLr = null;
    public ldv Tr = null;

    public dnu() {
        super(8);
    }

    @Override
    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.brB());
        stringBuilder.append(" InventoryGUID=");
        stringBuilder.append(this.dAu);
        stringBuilder.append(" ContainerItemGUID=");
        stringBuilder.append(this.aXQ);
        stringBuilder.append(" Item=");
        stringBuilder.append(this.gLr);
        stringBuilder.append(" PersistentSessionObjectGUID=");
        stringBuilder.append(this.Tr);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.dAu == null) {
            lfn.b(5, "SFTransactionInfoSplitAndDrop", "validate() InventoryGUID is null.");
            return false;
        }
        if (this.aXQ == null) {
            lfn.b(5, "SFTransactionInfoSplitAndDrop", "validate() ContainerItemGUID is null.");
            return false;
        }
        if (this.gLr == null) {
            lfn.b(5, "SFTransactionInfoSplitAndDrop", "validate() Item is null.");
            return false;
        }
        if (!this.gLr.validate()) {
            lfn.b(5, "SFTransactionInfoSplitAndDrop", "validate() Item is invalid.");
            return false;
        }
        if (this.brD() && this.Tr == null) {
            lfn.b(5, "SFTransactionInfoSplitAndDrop", "validate() PersistentSessionObjectGUID is null.");
            return false;
        }
        return true;
    }
}

