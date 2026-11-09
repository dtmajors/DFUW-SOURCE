/*
 * Decompiled with CFR.
 */
public class aug {
    public String SB = null;
    public ldv Ri = null;
    public int cbW = 0;
    public String cbX = null;

    public static String ie(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        if ((n & 2) != 0) {
            stringBuilder.append("public");
            bl = true;
        }
        if ((n & 1) != 0) {
            if (bl) {
                stringBuilder.append(",");
            }
            stringBuilder.append("private");
            bl = true;
        }
        if ((n & 8) != 0) {
            if (bl) {
                stringBuilder.append(",");
            }
            stringBuilder.append("clan");
            bl = true;
        }
        if ((n & 4) != 0) {
            if (bl) {
                stringBuilder.append(",");
            }
            stringBuilder.append("party");
            bl = true;
        }
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.SB == null) {
            stringBuilder.append("Nick=null");
        } else {
            stringBuilder.append("Nick='" + this.SB + "'");
        }
        if (this.Ri == null) {
            stringBuilder.append(" PSOGUID=null");
        } else {
            stringBuilder.append(" PSOGUID=" + this.Ri);
        }
        stringBuilder.append(" Types=");
        stringBuilder.append(aug.ie(this.cbW));
        if (this.cbX == null) {
            stringBuilder.append(" Reason=null");
        } else {
            stringBuilder.append(" Reason='" + this.cbX + "'");
        }
        return stringBuilder.toString();
    }

    public aug VZ() {
        aug aug2 = new aug();
        aug2.SB = this.SB;
        aug2.cbX = this.cbX;
        aug2.cbW = this.cbW;
        aug2.Ri = this.Ri;
        return aug2;
    }

    public /* synthetic */ Object clone() {
        return this.VZ();
    }
}

