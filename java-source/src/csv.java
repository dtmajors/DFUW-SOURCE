/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class csv {
    public int bnM = 0;
    public boolean fdT = true;
    public float fdU = 0.0f;
    public float fdV = 0.0f;
    public float fdW = 0.0f;
    public float fdX = 0.0f;

    public final String getAttributeName() {
        if (this.bnM == 0) {
            return "Protections";
        }
        return ep.aM((int)this.bnM);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAttributeModificationRule: AttributeName='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' ModificationAddition=");
        stringBuilder.append(this.fdT);
        stringBuilder.append(" MaxLevel_0=");
        stringBuilder.append(this.fdU);
        stringBuilder.append(" MaxLevel_100=");
        stringBuilder.append(this.fdV);
        stringBuilder.append(" MinLevel_0=");
        stringBuilder.append(this.fdW);
        stringBuilder.append(" MinLevel_100=");
        stringBuilder.append(this.fdX);
        return stringBuilder.toString();
    }
}

