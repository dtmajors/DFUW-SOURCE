/*
 * Decompiled with CFR.
 */
public class ctm
implements Comparable {
    public static final float fga = 10.0f;
    public int ResourceType = 0;
    public int asi = 0;
    public float fgb = 0.0f;

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public int compareTo(Object object) {
        if (object instanceof ctm) {
            ctm ctm2 = (ctm)object;
            if (this.ResourceType < ctm2.ResourceType) {
                return -1;
            }
            if (this.ResourceType == ctm2.ResourceType) {
                return 0;
            }
            return 1;
        }
        return -1;
    }

    public ctm bbC() {
        ctm ctm2 = new ctm();
        ctm2.ResourceType = this.ResourceType;
        ctm2.asi = this.asi;
        ctm2.fgb = this.fgb;
        return ctm2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFIngredient: ResourceName='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        stringBuilder.append(" FractionLoss=");
        stringBuilder.append(this.fgb);
        return stringBuilder.toString();
    }
}

