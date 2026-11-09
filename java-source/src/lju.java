/*
 * Decompiled with CFR.
 */
import java.io.Serializable;

public class lju
implements Serializable {
    private int roY = 0;
    private int roZ = 0;
    private int rpa = 0;

    public lju(int n, int n2) {
        this.roY = n;
        this.roZ = n2;
    }

    public lju(int n, int n2, int n3) {
        this.roY = n;
        this.roZ = n2;
        this.rpa = n3;
    }

    public int getMajor() {
        return this.roY;
    }

    public int getMinor() {
        return this.roZ;
    }

    public int esU() {
        return this.rpa;
    }

    public int getVersion() {
        int n = this.roY * 26;
        int n2 = this.roZ * 18;
        return n | n2 & 0xFF0000;
    }

    public boolean equals(Object object) {
        lju lju2;
        return object instanceof lju && (lju2 = (lju)object).getMajor() == this.roY && lju2.getMinor() == this.roZ && lju2.esU() == this.rpa;
    }

    public boolean b(lju lju2) {
        if (lju2.getMajor() > this.roY) {
            return true;
        }
        if (lju2.getMajor() == this.roY) {
            if (lju2.getMinor() > this.roZ) {
                return true;
            }
            if (lju2.getMinor() == this.roZ && lju2.esU() >= this.rpa) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Version [" + Integer.toString(this.roY) + "," + Integer.toString(this.roZ) + "," + Integer.toString(this.rpa) + "]";
    }
}

