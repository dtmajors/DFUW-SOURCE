/*
 * Decompiled with CFR.
 */
public class buj {
    public cxd.k dBm = null;
    public ldv Rs = null;
    public double aXq = 0.0;
    public double dBo = 0.0;
    public double dBp = 0.0;
    public boolean dBn = false;
    public boolean dNX = false;

    public boolean equals(Object object) {
        if (object instanceof buj) {
            buj buj2 = (buj)object;
            if (buj2.dBm == this.dBm && buj2.Rs.equals(this.Rs)) {
                return true;
            }
        }
        return false;
    }

    public buj ayg() {
        buj buj2 = new buj();
        buj2.dBm = this.dBm;
        buj2.Rs = this.Rs;
        buj2.aXq = this.aXq;
        buj2.dBo = this.dBo;
        buj2.dBp = this.dBp;
        buj2.dNX = this.dNX;
        return buj2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFProgressbarInfo: Type='");
        stringBuilder.append((Object)this.dBm);
        stringBuilder.append("' ObjectGUID=");
        stringBuilder.append(this.Rs);
        stringBuilder.append(" TimeEnd=");
        stringBuilder.append(this.dBp);
        return stringBuilder.toString();
    }
}

