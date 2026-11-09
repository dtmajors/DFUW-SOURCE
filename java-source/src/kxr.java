/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class kxr
extends kxt {
    public int bnM = 0;

    @Override
    public boolean aaR(int n) {
        return this.bnM == n;
    }

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    @Override
    public String getPropertyName() {
        return this.getAttributeName();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRuleForAttribute: AttributeType='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}

