/*
 * Decompiled with CFR.
 */
public class cte
implements Comparable {
    public int ResourceType = 0;
    public int asi = 0;
    public boolean fex = false;
    public int fey = 0;
    public ej[] DR = null;
    public boolean fez = true;
    public long aXU = 0L;

    public int compareTo(Object object) {
        if (object instanceof cte) {
            cte cte2 = (cte)object;
            if (this.fey < cte2.fey) {
                return -1;
            }
            if (this.fey > cte2.fey) {
                return 1;
            }
            return this.pa().compareTo(cte2.pa());
        }
        lfn.b(5, "SFEquipmentItem", "compareTo() Invalid object: " + object.getClass().getName());
        assert (false);
        return 1;
    }

    public cte bbx() {
        cte cte2 = new cte();
        cte2.ResourceType = this.ResourceType;
        cte2.asi = this.asi;
        cte2.fex = this.fex;
        cte2.fey = this.fey;
        cte2.fez = this.fez;
        if (this.DR != null) {
            ej[] ejArray = new ej[this.DR.length];
            int n = this.DR.length;
            for (int i = 0; i < n; ++i) {
                ejArray[i] = this.DR[i].fm();
            }
            cte2.DR = ejArray;
        }
        return cte2;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  ");
        stringBuilder.append(this.pa());
        stringBuilder.append("  ");
        stringBuilder.append(this.asi);
        if (this.fex) {
            stringBuilder.append("   (attached)");
        }
        stringBuilder.append("  ");
        stringBuilder.append(this.fey);
        stringBuilder.append("  ");
        stringBuilder.append(this.fez);
        return stringBuilder.toString();
    }
}

