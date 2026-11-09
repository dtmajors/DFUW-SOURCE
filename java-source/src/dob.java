/*
 * Decompiled with CFR.
 */
public class dob
extends dny {
    public int gLB = 0;
    public int gLC = 0;
    public float gLA = -1.0f;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" NewQuantity=");
        stringBuilder.append(this.gLB);
        stringBuilder.append(" SplitQuantity=");
        stringBuilder.append(this.gLC);
        stringBuilder.append(" UnitWeight=");
        stringBuilder.append(this.gLA);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.gLB <= 0) {
            lfn.b(5, "SFTransactionItemWithQuantity", "validate() NewQuantity is invalid.");
            return false;
        }
        if (this.gLC <= 0) {
            lfn.b(5, "SFTransactionItemWithQuantity", "validate() SplitQuantity is invalid.");
            return false;
        }
        if (this.gLA < 0.0f) {
            lfn.b(5, "SFTransactionItemWithQuantity", "validate() UnitWeight is invalid.");
            return false;
        }
        return true;
    }
}

