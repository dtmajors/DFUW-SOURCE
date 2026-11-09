/*
 * Decompiled with CFR.
 */
public class dnz
extends dny {
    public int asi = 0;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" Quantity=");
        stringBuilder.append(this.asi);
        return stringBuilder.toString();
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.asi <= 0) {
            lfn.b(5, "SFTransactionItemCurrency", "validate() Quantity is invalid.");
            return false;
        }
        return true;
    }
}

