/*
 * Decompiled with CFR.
 */
public class dnt
extends dnl {
    public ldv gLc = null;
    public ldv gLd = null;
    public doc gLn = null;
    public ldv gLf = null;
    public ldv gLg = null;
    public ldv gLo = null;
    public boolean gLp = false;
    public dny gLq = null;

    public dnt(int n) {
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
        stringBuilder.append(this.gLn);
        stringBuilder.append(" ObjectBInventoryGUID=");
        stringBuilder.append(this.gLf);
        stringBuilder.append(" ObjectBContainerItemGUID=");
        stringBuilder.append(this.gLg);
        stringBuilder.append(" ObjectBItemGUID=");
        stringBuilder.append(this.gLo);
        stringBuilder.append(" AutoStackSplit=");
        stringBuilder.append(this.gLp);
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
        if (this.gLc == null) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectAInventoryGUID is null.");
            return false;
        }
        if (this.gLd == null) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectAContainerItemGUID is null.");
            return false;
        }
        if (this.gLn == null) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectAItem is null.");
            return false;
        }
        if (!this.gLn.validate()) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectAItem is invalid.");
            return false;
        }
        if (this.gLf == null) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectBInventoryGUID is null.");
            return false;
        }
        if (this.gLg == null) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectBContainerItemGUID is null.");
            return false;
        }
        if (this.gLo == null) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectBItemGUID is null.");
            return false;
        }
        if (this.gLn.GUID.equals(this.gLo)) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectAItem.GUID == ObjectBItemGUID.");
            return false;
        }
        if (this.gLn.aRX <= 0) {
            lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectAItem.ItemResourceType is invalid.");
            return false;
        }
        if (!this.gLc.equals(this.gLf)) {
            if (!this.gLn.brH()) {
                lfn.b(5, "SFTransactionInfoSplit", "validate() ObjectAItem is invalid.");
                return false;
            }
        } else if (this.brA() == 11 && this.gLp) {
            if (this.gLq == null) {
                lfn.b(5, "SFTransactionInfoSplit", "validate() MatchingItem is null.");
                return false;
            }
            if (!this.gLq.validate()) {
                lfn.b(5, "SFTransactionInfoSplit", "validate() MatchingItem is invalid.");
                return false;
            }
        }
        return true;
    }
}

