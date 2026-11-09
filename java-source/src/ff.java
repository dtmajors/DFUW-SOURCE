/*
 * Decompiled with CFR.
 */
public class ff
extends ej {
    private String Value = "";

    public ff() {
        super(7);
        this.DP = 11;
    }

    public String getStringValue() {
        return this.Value;
    }

    public void av(String string) {
        if (lin.i(this.Value, string)) {
            return;
        }
        this.Value = string;
        if (this.DQ != null) {
            this.DQ.e(this);
        }
    }

    @Override
    public ej fm() {
        ff ff2 = new ff();
        this.a(ff2);
        return ff2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }

    @Override
    public Object getValue() {
        return this.Value;
    }

    @Override
    public void setValue(Object object) {
        if (object == null) {
            this.av(null);
        } else if (object instanceof String) {
            this.av((String)object);
        } else {
            lfn.b(5, "SFStringAttribute", "setValue() Value is not a String, it is: " + object.getClass().getName());
        }
    }

    public String toString() {
        if (this.Value == null) {
            return "null";
        }
        return this.Value;
    }

    @Override
    protected void a(ej ej2) {
        super.a(ej2);
        ff ff2 = (ff)ej2;
        ff2.av(this.Value);
    }

    @Override
    public final String fj() {
        return this.getStringValue();
    }

    @Override
    public final boolean aq(String string) {
        this.av(string);
        return true;
    }
}

