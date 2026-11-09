/*
 * Decompiled with CFR.
 */
public class mho
extends mhk {
    public int PC;

    public mho() {
        super(mhs.INTEGER);
    }

    public mho(int n) {
        super(mhs.INTEGER);
        this.PC = n;
    }

    public String toString() {
        return "Integer:" + this.PC;
    }

    @Override
    public String eyZ() {
        return "" + this.PC;
    }

    @Override
    public boolean BT(String string) {
        try {
            this.PC = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }
}

