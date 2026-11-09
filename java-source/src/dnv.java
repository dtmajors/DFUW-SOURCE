/*
 * Decompiled with CFR.
 */
public class dnv
extends dnl {
    public ldv gLc = null;
    public ldv gLd = null;
    public dob gLs = null;
    public ldv gLf = null;
    public ldv gLg = null;
    public dny gLh = null;

    public dnv(int n) {
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
        stringBuilder.append(this.gLs);
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
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectAInventoryGUID is null.");
            return false;
        }
        if (this.gLd == null) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectAContainerItemGUID is null.");
            return false;
        }
        if (this.gLs == null) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectAItem is null.");
            return false;
        }
        if (!this.gLs.validate()) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectAItem is invalid.");
            return false;
        }
        if (this.gLf == null) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectBInventoryGUID is null.");
            return false;
        }
        if (this.gLg == null) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectBContainerItemGUID is null.");
            return false;
        }
        if (this.gLh == null) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectBItem is null.");
            return false;
        }
        if (!this.gLh.validate()) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectBItem is invalid.");
            return false;
        }
        if (this.gLs.GUID.equals(this.gLh.GUID)) {
            lfn.b(5, "SFTransactionInfoSplitAndMerge", "validate() ObjectAItem.GUID == ObjectBItem.GUID.");
            return false;
        }
        return true;
    }
}

