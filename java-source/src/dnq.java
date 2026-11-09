/*
 * Decompiled with CFR.
 */
public class dnq
extends dnl {
    public ldv gLc = null;
    public ldv gLd = null;
    public dny gLe = null;
    public ldv gLf = null;
    public ldv gLg = null;
    public dny gLh = null;

    public dnq(int n) {
        super(n);
    }

    @Override
    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.brB());
        stringBuilder.append(" ObjectAInventoryGUID=");
        stringBuilder.append(this.gLc);
        stringBuilder.append(" ObjectAContainerItemGUID=");
        stringBuilder.append(this.gLd);
        stringBuilder.append(" ObjectAItem=");
        stringBuilder.append(this.gLe);
        stringBuilder.append(" ObjectBInventoryGUID=");
        stringBuilder.append(this.gLf);
        stringBuilder.append(" ObjectBContainerItemGUID=");
        stringBuilder.append(this.gLg);
        stringBuilder.append(" ObjectBItem=");
        stringBuilder.append(this.gLh);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.gLc == null) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectAInventoryGUID is null.");
            return false;
        }
        if (this.gLd == null) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectAContainerItemGUID is null.");
            return false;
        }
        if (this.gLe == null) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectAItem is null.");
            return false;
        }
        if (!this.gLe.validate()) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectAItem is invalid.");
            return false;
        }
        if (this.gLf == null) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectBInventoryGUID is null.");
            return false;
        }
        if (this.gLg == null) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectBContainerItemGUID is null.");
            return false;
        }
        if (this.gLh == null) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectBItem is null.");
            return false;
        }
        if (!this.gLh.validate()) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectBItem is invalid.");
            return false;
        }
        if (this.gLe.GUID.equals(this.gLh.GUID)) {
            lfn.b(5, "SFTransactionInfoMerge", "validate() ObjectAItem.GUID == ObjectBItem.GUID.");
            return false;
        }
        return true;
    }
}

