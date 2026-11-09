/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class ces {
    private static final int erg = 256;
    public static final int erh = 257;
    private static Map eri = lcn.emw();
    private static ces erj = new ces();

    public static ces aLN() {
        return erj;
    }

    public static String py(int n) {
        a a2 = (a)eri.get(n);
        if (a2 == null) {
            return null;
        }
        return a2.Name;
    }

    public static int hd(String string) {
        if (string == null) {
            return -1;
        }
        a a2 = (a)eri.get(string);
        if (a2 != null) {
            return a2.Type;
        }
        return -1;
    }

    private static void a(a a2) {
        Integer n = new Integer(a2.Type);
        assert (!eri.containsKey(n));
        assert (!eri.containsKey(a2.Name));
        eri.put(n, a2);
        eri.put(a2.Name, a2);
    }

    private ces() {
    }

    public void initialize() {
        this.aLO();
    }

    private void aLO() {
        ces.a(new a(this, 257, "pf_Test Of System"));
    }
}

