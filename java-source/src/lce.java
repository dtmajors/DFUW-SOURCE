/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class lce {
    public int bnM = 0;
    public float qvU = 0.0f;

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAttributeAlteration: AttributeType='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' MagnitudeFraction=");
        stringBuilder.append(this.qvU);
        return stringBuilder.toString();
    }
}

