/*
 * Decompiled with CFR.
 */
public class mhl
extends mhk {
    public boolean Pp;

    public mhl() {
        super(mhs.BOOLEAN);
    }

    public mhl(boolean bl) {
        super(mhs.BOOLEAN);
        this.Pp = bl;
    }

    public String toString() {
        return "Boolean:" + this.Pp;
    }

    @Override
    public String eyZ() {
        return this.Pp ? "T" : "F";
    }

    @Override
    public boolean BT(String string) {
        if (string == null) {
            return false;
        }
        if (string.equals("T")) {
            this.Pp = true;
            return true;
        }
        if (string.equals("F")) {
            this.Pp = false;
            return true;
        }
        return false;
    }
}

