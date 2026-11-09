/*
 * Decompiled with CFR.
 */
public class dnw
extends dnl {
    public ldv gLc = null;
    public ldv gLd = null;
    public dod gLt = null;
    public ldv gLf = null;
    public ldv gLg = null;
    public int gLu = bqm.b.dEm.ordinal();
    public boolean gLv = false;
    public boolean gLw = false;
    public int gLx = hc.aaz.ordinal();

    public dnw() {
        super(12);
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
        stringBuilder.append(this.gLt);
        stringBuilder.append(" ObjectBInventoryGUID=");
        stringBuilder.append(this.gLf);
        stringBuilder.append(" ObjectBContainerItemGUID=");
        stringBuilder.append(this.gLg);
        stringBuilder.append(" AutoStackItem=");
        stringBuilder.append(this.gLv);
        stringBuilder.append(" AutoLootRequest=");
        stringBuilder.append(this.gLw);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.gLc == null) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectAInventoryGUID is null.");
            return false;
        }
        if (this.gLd == null) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectAContainerItemGUID is null.");
            return false;
        }
        if (this.gLt == null) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectAItem is null.");
            return false;
        }
        if (!this.gLt.validate()) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectAItem is invalid.");
            return false;
        }
        if (this.gLf == null) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectBInventoryGUID is null.");
            return false;
        }
        if (this.gLg == null) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectBContainerItemGUID is null.");
            return false;
        }
        if (this.gLd.equals(this.gLg)) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectAContainerItemGUID == ObjectBContainerItemGUID.");
            return false;
        }
        if (!this.gLt.brH()) {
            lfn.b(5, "SFTransactionInfoTransfer", "validate() ObjectAItem is invalid.");
            return false;
        }
        return true;
    }
}

