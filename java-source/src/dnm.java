/*
 * Decompiled with CFR.
 */
public class dnm
extends dnl {
    public ldv dAu = null;
    public ldv aXQ = null;
    public brv[] gKU = null;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    public dnm() {
        super(1);
    }

    @Override
    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.brB());
        stringBuilder.append(" InventoryGUID=");
        stringBuilder.append(this.dAu);
        stringBuilder.append(" ContainerItemGUID=");
        stringBuilder.append(this.aXQ);
        stringBuilder.append(" ItemWrappers=[");
        int n = this.gKU.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.gKU[i]);
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
            lfn.b(5, "SFTransactionInfoAdd", "validate() InventoryGUID is null.");
            return false;
        }
        if (this.aXQ == null) {
            lfn.b(5, "SFTransactionInfoAdd", "validate() ContainerItemGUID is null.");
            return false;
        }
        if (this.gKU == null) {
            lfn.b(5, "SFTransactionInfoAdd", "validate() ItemWrappers array is null.");
            return false;
        }
        int n = this.gKU.length;
        for (int i = 0; i < n; ++i) {
            if (this.gKU[i].validate()) continue;
            lfn.b(5, "SFTransactionInfoAdd", "validate() ItemWrapper " + i + " in array is invalid.");
            return false;
        }
        return true;
    }
}

