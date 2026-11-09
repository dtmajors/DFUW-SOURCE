/*
 * Decompiled with CFR.
 */
public class doc
extends dob {
    public int dJc = -1;
    public int aRX = 0;
    public int gLD = 0;
    public int gLE = 0;

    public final String bkf() {
        return lea.enW().getName(this.aRX);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" SlotNumber=");
        stringBuilder.append(this.dJc);
        stringBuilder.append(" ItemResourceType='");
        stringBuilder.append(this.bkf());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public final boolean brH() {
        if (this.gLD < 1) {
            lfn.b(5, "SFTransactionItemWithQuantityAndSlotNumber", "validateTransferCheckData() DepthOfSubTree is invalid.");
            return false;
        }
        if (this.gLE < 1) {
            lfn.b(5, "SFTransactionItemWithQuantityAndSlotNumber", "validateTransferCheckData() ItemCountInSubTree is invalid.");
            return false;
        }
        return true;
    }
}

