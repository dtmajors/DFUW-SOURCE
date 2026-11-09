/*
 * Decompiled with CFR.
 */
public class lfg {
    public static final a rke = new a();
    public final String Name;
    public final String Value;

    public lfg(String string, String string2) {
        assert (string != null);
        assert (string2 != null);
        this.Name = string;
        this.Value = string2;
    }

    public String toString() {
        return "[" + this.Name + "=" + this.Value + "]";
    }
}

