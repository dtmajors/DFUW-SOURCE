/*
 * Decompiled with CFR.
 */
public class dod
extends dny {
    public int dJc = -1;
    public int gLD = 0;
    public int gLE = 0;
    public int aRX = 0;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" SlotNumber=");
        stringBuilder.append(this.dJc);
        return stringBuilder.toString();
    }

    public final boolean brH() {
        if (this.gLD < 1) {
            lfn.b(5, "SFTransactionItemWithSlotNumber", "validateTransferCheckData() DepthOfSubTree is invalid.");
            return false;
        }
        if (this.gLE < 1) {
            lfn.b(5, "SFTransactionItemWithSlotNumber", "validateTransferCheckData() ItemCountInSubTree is invalid.");
            return false;
        }
        if (this.aRX <= 0) {
            lfn.b(5, "SFTransactionItemWithSlotNumber", "validateTransferCheckData() ItemResourceType is invalid.");
            return false;
        }
        return true;
    }
}

