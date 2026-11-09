/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class lgv
extends lgz {
    public int bnM = 0;

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    @Override
    public String toString() {
        assert (this.bnM > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Attribute='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

