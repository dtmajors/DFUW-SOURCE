/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.List;

public class cto {
    public int ResourceType = 0;
    public int asi = 0;
    public int dpT = 0;
    public int dpS = 0;
    public float Probability = 0.0f;
    public ej[] DR = null;
    public ctd[] ffQ = null;
    public cto[] fgf = null;
    public boolean fez = true;
    public int bcB = 0;

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + Arrays.hashCode(this.DR);
        n2 = 31 * n2 + Arrays.hashCode(this.fgf);
        n2 = 31 * n2 + Arrays.hashCode(this.ffQ);
        n2 = 31 * n2 + this.dpT;
        n2 = 31 * n2 + this.dpS;
        n2 = 31 * n2 + Float.floatToIntBits(this.Probability);
        n2 = 31 * n2 + this.asi;
        n2 = 31 * n2 + this.ResourceType;
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        cto cto2 = (cto)object;
        if (this.ResourceType != cto2.ResourceType) {
            return false;
        }
        if (this.asi != cto2.asi) {
            return false;
        }
        if (this.dpT != cto2.dpT) {
            return false;
        }
        if (this.dpS != cto2.dpS) {
            return false;
        }
        if (Float.floatToIntBits(this.Probability) != Float.floatToIntBits(cto2.Probability)) {
            return false;
        }
        if (!Arrays.equals(this.DR, cto2.DR)) {
            return false;
        }
        if (!Arrays.equals(this.fgf, cto2.fgf)) {
            return false;
        }
        return Arrays.equals(this.ffQ, cto2.ffQ);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLootableItemInfo: ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("'");
        if (this.asi > 0) {
            stringBuilder.append(" Quantity=");
            stringBuilder.append(this.asi);
        } else {
            stringBuilder.append(" MaxQuantity=");
            stringBuilder.append(this.dpT);
            stringBuilder.append(" MinQuantity=");
            stringBuilder.append(this.dpS);
        }
        stringBuilder.append(" Probability=");
        stringBuilder.append(this.Probability);
        return stringBuilder.toString();
    }

    public static void a(List<cto> list, String string) {
    }
}

