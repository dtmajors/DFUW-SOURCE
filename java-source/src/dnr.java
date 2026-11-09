/*
 * Decompiled with CFR.
 */
public class dnr
extends dnl {
    public ldv dAu = null;
    public ldv aXQ = null;
    public dny gLi = null;
    public ldv Tr = null;
    public boolean gLj = false;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    public dnr() {
        super(5);
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
        stringBuilder.append(this.gLi);
        stringBuilder.append(" PersistentSessionObjectGUID=");
        stringBuilder.append(this.Tr);
        stringBuilder.append(" SaveItemInPSO=");
        stringBuilder.append(this.gLj);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.dAu == null) {
            lfn.b(5, "SFTransactionInfoRemove", "validate() InventoryGUID is null.");
            return false;
        }
        if (this.aXQ == null) {
            lfn.b(5, "SFTransactionInfoRemove", "validate() ContainerItemGUID is null.");
            return false;
        }
        if (this.gLi == null) {
            lfn.b(5, "SFTransactionInfoRemove", "validate() Item is null.");
            return false;
        }
        if (!this.gLi.validate()) {
            lfn.b(5, "SFTransactionInfoRemove", "validate() Item is invalid.");
            return false;
        }
        if (this.brD() && this.Tr == null) {
            lfn.b(5, "SFTransactionInfoRemove", "validate() PersistentSessionObjectGUID is null.");
            return false;
        }
        return true;
    }
}

