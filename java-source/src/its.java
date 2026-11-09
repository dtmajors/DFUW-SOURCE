/*
 * Decompiled with CFR.
 */
public abstract class its {
    private String _name;

    public its() {
    }

    public its(String string) {
        this._name = string;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String string) {
        this._name = string;
    }

    public String cDB() {
        return new ity().c(this);
    }

    public static its rz(String string) {
        return new ity().rC(string);
    }
}

