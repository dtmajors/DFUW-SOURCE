/*
 * Decompiled with CFR.
 */
public class mhn
extends mhk {
    public float Pz;

    public mhn() {
        super(mhs.FLOAT);
    }

    public mhn(float f) {
        super(mhs.FLOAT);
        this.Pz = f;
    }

    public String toString() {
        return "Float:" + this.Pz;
    }

    @Override
    public String eyZ() {
        return "" + this.Pz;
    }

    @Override
    public boolean BT(String string) {
        try {
            this.Pz = Float.parseFloat(string);
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }
}

