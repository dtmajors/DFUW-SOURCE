/*
 * Decompiled with CFR.
 */
public class dnx
extends dnl {
    public ldv dAu = null;
    public ldv gLy = null;
    public dod gKZ = null;
    public ldv gLz = null;
    public boolean gLv = false;
    public dny gLq = null;

    public dnx() {
        super(13);
    }

    @Override
    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.brB());
        stringBuilder.append(" InventoryGUID=");
        stringBuilder.append(this.dAu);
        stringBuilder.append(" SourceContainerItemGUID=");
        stringBuilder.append(this.gLy);
        stringBuilder.append(" Item=");
        stringBuilder.append(this.gKZ);
        stringBuilder.append(" TargetContainerItemGUID=");
        stringBuilder.append(this.gLz);
        stringBuilder.append(" AutoStackItem=");
        stringBuilder.append(this.gLv);
        if (this.gLq != null) {
            stringBuilder.append(" MatchingItem=");
            stringBuilder.append(this.gLq);
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.dAu == null) {
            lfn.b(5, "SFTransactionInfoTransferInternally", "validate() InventoryGUID is null.");
            return false;
        }
        if (this.gLy == null) {
            lfn.b(5, "SFTransactionInfoTransferInternally", "validate() SourceContainerItemGUID is null.");
            return false;
        }
        if (this.gKZ == null) {
            lfn.b(5, "SFTransactionInfoTransferInternally", "validate() Item is null.");
            return false;
        }
        if (!this.gKZ.validate()) {
            lfn.b(5, "SFTransactionInfoTransferInternally", "validate() Item is invalid.");
            return false;
        }
        if (this.gLz == null) {
            lfn.b(5, "SFTransactionInfoTransferInternally", "validate() TargetContainerItemGUID is null.");
            return false;
        }
        if (this.gLy.equals(this.gLz)) {
            lfn.b(5, "SFTransactionInfoTransferInternally", "validate() SourceContainerItemGUID == TargetContainerItemGUID.");
            return false;
        }
        if (this.gLv) {
            if (this.gLq == null) {
                lfn.b(5, "SFTransactionInfoTransferInternally", "validate() MatchingItem is null.");
                return false;
            }
            if (!this.gLq.validate()) {
                lfn.b(5, "SFTransactionInfoTransferInternally", "validate() MatchingItem is invalid.");
                return false;
            }
        }
        return true;
    }
}

