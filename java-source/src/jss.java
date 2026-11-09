/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class jss {
    public static final int nWu = 20;
    private Map<String, a> nWv = new b<String, a>(this, 20, 0.75f, 20);

    public boolean b(String string, bve.a a2) {
        if (a2 != null) {
            string = string + a2.name();
        }
        return this.nWv.containsKey(string);
    }

    public void a(String string, bvc bvc2, bve.a a2) {
        if (a2 != null) {
            string = string + a2.name();
        }
        if (this.nWv.containsKey(string)) {
            return;
        }
        a a3 = new a(this, bvc2);
        this.nWv.put(string, a3);
    }

    public bvc c(String string, bve.a a2) {
        a a3;
        if (a2 != null) {
            string = string + a2.name();
        }
        if ((a3 = this.nWv.get(string)) == null) {
            return null;
        }
        return (bvc)a3.nWw.azf();
    }
}

