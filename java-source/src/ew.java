/*
 * Decompiled with CFR.
 */
public class ew
extends ej {
    private int PC = 0;

    public ew() {
        super(3);
        this.DP = 8;
    }

    public final void bh(int n) {
        if (n == 0) {
            return;
        }
        this.bi(this.PC + n);
    }

    public int fQ() {
        return this.PC;
    }

    public final int fR() {
        return this.fQ();
    }

    public void bi(int n) {
        if (this.PC == n) {
            return;
        }
        int n2 = this.PC;
        this.PC = n;
        if (this.DQ != null) {
            this.DQ.a(this, n2);
        }
    }

    @Override
    public final Object getValue() {
        return new Integer(this.fQ());
    }

    @Override
    public final void setValue(Object object) {
        if (object == null) {
            lfn.b(5, "SFIntegerAttribute", "setValue() Value is null.");
        } else if (object instanceof Integer) {
            this.bi((Integer)object);
        } else {
            lfn.b(5, "SFIntegerAttribute", "setValue() Could not set value of attribute '" + this.getName() + "'");
            lfn.b(5, "SFIntegerAttribute", "setValue() Value is not an Integer, it is: " + object.getClass().getName());
        }
    }

    @Override
    public ej fm() {
        ew ew2 = new ew();
        this.a(ew2);
        return ew2;
    }

    @Override
    public ej fn() {
        ew ew2 = new ew();
        this.a(ew2);
        return ew2;
    }

    public void reset() {
    }

    @Override
    public final String fo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.fo());
        return stringBuilder.toString();
    }

    public final String toString() {
        return Integer.toString(this.fQ());
    }

    @Override
    protected final void a(ej ej2) {
        super.a(ej2);
        ew ew2 = (ew)ej2;
        ew2.bi(this.fQ());
    }

    @Override
    public final String fj() {
        return "" + this.fQ();
    }

    @Override
    public final boolean aq(String string) {
        try {
            this.bi(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFIntegerAttribute", "setDataAsString(): Data '" + string + "' isn't a valid integer");
            return false;
        }
        return true;
    }
}

