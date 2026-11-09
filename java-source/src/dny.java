/*
 * Decompiled with CFR.
 */
public class dny {
    public ldv GUID = null;
    public lef dAy = null;

    public boolean validate() {
        if (this.GUID == null) {
            lfn.b(5, "SFTransactionItem", "validate() GUID is null.");
            return false;
        }
        if (this.dAy == null) {
            lfn.b(5, "SFTransactionItem", "validate() LockID is null.");
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" LockID=");
        stringBuilder.append(this.dAy);
        return stringBuilder.toString();
    }
}

