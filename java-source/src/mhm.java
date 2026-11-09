/*
 * Decompiled with CFR.
 */
public class mhm
extends mhk {
    public double Pq;

    public mhm() {
        super(mhs.DOUBLE);
    }

    public mhm(double d2) {
        super(mhs.DOUBLE);
        this.Pq = d2;
    }

    public String toString() {
        return "Double:" + this.Pq;
    }

    @Override
    public String eyZ() {
        return "" + this.Pq;
    }

    @Override
    public boolean BT(String string) {
        try {
            this.Pq = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }
}

