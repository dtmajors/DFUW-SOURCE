/*
 * Decompiled with CFR.
 */
public class mhr
extends mhk {
    public String Value;

    public mhr() {
        super(mhs.STRING);
    }

    public mhr(String string) {
        super(mhs.STRING);
        this.Value = string;
    }

    public String toString() {
        return "String:" + this.Value;
    }

    @Override
    public String eyZ() {
        return this.Value;
    }

    @Override
    public boolean BT(String string) {
        if (string != null) {
            this.Value = string;
            return true;
        }
        return false;
    }
}

