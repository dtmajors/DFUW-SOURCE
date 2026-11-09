/*
 * Decompiled with CFR.
 */
public class mhp
extends mhk {
    public long rEO;

    public mhp() {
        super(mhs.LONG);
    }

    public mhp(long l) {
        super(mhs.LONG);
        this.rEO = l;
    }

    public String toString() {
        return "Long:" + this.rEO;
    }

    @Override
    public String eyZ() {
        return "" + this.rEO;
    }

    @Override
    public boolean BT(String string) {
        try {
            this.rEO = Long.parseLong(string);
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }
}

