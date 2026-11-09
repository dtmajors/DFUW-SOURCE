/*
 * Decompiled with CFR.
 */
public class et
extends ej {
    public static final int Pw = 1;
    public static final int Px = 2;
    public static final int Py = 3;
    protected float Pz = 0.0f;
    protected int PA = 1;

    public et() {
        super(2);
        this.DP = 4;
    }

    public final int fM() {
        return this.PA;
    }

    public final void bg(int n) {
        this.PA = n;
    }

    public final void n(float f) {
        if (f == 0.0f) {
            return;
        }
        this.o(this.Pz + f);
    }

    public float fN() {
        return this.Pz;
    }

    public final float fO() {
        return this.Pz;
    }

    public void o(float f) {
        if (Float.isNaN(f)) {
            f = 1.0f;
        }
        if (this.Pz == f) {
            return;
        }
        float f2 = this.Pz;
        this.Pz = f;
        if (this.DQ != null) {
            this.DQ.a(this, f2);
        }
    }

    @Override
    public final Object getValue() {
        return new Float(this.fN());
    }

    @Override
    public final void setValue(Object object) {
        if (object == null) {
            lfn.b(5, "SFFloatAttribute", "setValue() Value is null.");
        } else if (object instanceof Float) {
            this.o(((Float)object).floatValue());
        } else {
            lfn.b(5, "SFFloatAttribute", "setValue() Could not set value of attribute '" + this.getName() + "'");
            lfn.b(5, "SFFloatAttribute", "setValue() Value is not a Float, it is: " + object.getClass().getName());
        }
    }

    @Override
    public ej fm() {
        et et2 = new et();
        this.a(et2);
        return et2;
    }

    @Override
    public ej fn() {
        et et2 = new et();
        this.a(et2);
        return et2;
    }

    public void reset() {
        this.PA = 1;
    }

    @Override
    public final String fo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.fo());
        stringBuilder.append(" ModifierSumType=");
        stringBuilder.append(this.PA);
        return stringBuilder.toString();
    }

    public final String toString() {
        return Float.toString(this.fN());
    }

    @Override
    protected final void a(ej ej2) {
        super.a(ej2);
        et et2 = (et)ej2;
        et2.o(this.fN());
        et2.bg(this.PA);
    }

    @Override
    public final String fj() {
        return Float.toString(this.fO()) + " " + this.fM();
    }

    @Override
    public final boolean aq(String string) {
        int n = string.indexOf(" ");
        if (n < 0) {
            lfn.b(5, "SFFloatAttribute", "setDataAsString(): Data '" + string + "' doesn't contain space");
            return false;
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        try {
            this.o(Float.parseFloat(string2));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFFloatAttribute", "setDataAsString(): Data '" + string + "' value isn't a valid float");
            return false;
        }
        try {
            this.bg(Integer.parseInt(string3));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFFloatAttribute", "setDataAsString(): Data '" + string + "' MST isn't a valid integer");
            return false;
        }
        return true;
    }
}

