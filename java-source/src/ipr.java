/*
 * Decompiled with CFR.
 */
public class ipr {
    private a msu;
    private String _name;
    private hsu mrD;
    private Object _value;

    public ipr(a a2, String string, hsu hsu2, Object object) {
        assert (a2 != null);
        assert (string != null);
        assert (hsu2 != null);
        assert (object == null || a2 == a.msv && object.getClass() == Integer.class || a2 == a.msw && object.getClass() == String.class || a2 == a.msx && object.getClass() == Float.class || a2 == a.msy && object.getClass() == Boolean.class);
        this.msu = a2;
        this._name = string;
        this.mrD = hsu2;
        this._value = object;
    }

    public a dmr() {
        return this.msu;
    }

    public String getName() {
        return this._name;
    }

    public hsu dhp() {
        return this.mrD;
    }

    public Object getValue() {
        return this._value;
    }

    public void setValue(Object object) {
        assert (object == null || this.msu == a.msv && object.getClass() == Integer.class || this.msu == a.msw && object.getClass() == String.class || this.msu == a.msx && object.getClass() == Float.class || this.msu == a.msy && object.getClass() == Boolean.class);
        this._value = object;
    }
}

