/*
 * Decompiled with CFR.
 */
public class dns
extends dnl {
    public ldv gLc = null;
    public ldv gLd = null;
    public doa gLk = null;
    public dny gLl = null;
    public ldv gLf = null;
    public ldv gLg = null;
    public dnz[] gLm = null;

    public dns() {
        super(6);
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
        stringBuilder.append(this.gLk);
        stringBuilder.append(" ObjectACurrencyItem=");
        stringBuilder.append(this.gLl);
        stringBuilder.append(" ObjectBInventoryGUID=");
        stringBuilder.append(this.gLf);
        stringBuilder.append(" ObjectBContainerItemGUID=");
        stringBuilder.append(this.gLg);
        stringBuilder.append(" ObjectBItems=[");
        int n = this.gLm.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.gLm[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.gLc == null) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectAInventoryGUID is null.");
            return false;
        }
        if (this.gLd == null) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectAContainerItemGUID is null.");
            return false;
        }
        if (this.gLk == null) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectAItem is null.");
            return false;
        }
        if (!this.gLk.validate()) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectAItem is invalid.");
            return false;
        }
        if (this.gLl == null) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectACurrencyItem is null.");
            return false;
        }
        if (!this.gLl.validate()) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectACurrencyItem is invalid.");
            return false;
        }
        if (this.gLf == null) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectBInventoryGUID is null.");
            return false;
        }
        if (this.gLg == null) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectBContainerItemGUID is null.");
            return false;
        }
        if (this.gLm == null || this.gLm.length == 0) {
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectBItems array is null or empty.");
            return false;
        }
        int n = this.gLm.length;
        for (int i = 0; i < n; ++i) {
            if (this.gLm[i] == null) {
                lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectBItem " + i + " in array is null.");
                return false;
            }
            if (this.gLm[i].validate()) continue;
            lfn.b(5, "SFTransactionInfoSellToPlayer", "validate() ObjectBItem " + i + " in array is invalid.");
            return false;
        }
        return true;
    }
}

