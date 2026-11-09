/*
 * Decompiled with CFR.
 */
import java.util.EnumMap;
import java.util.Map;

public class bxn {
    private Map<byw.a, bxo> dYQ = new EnumMap<byw.a, bxo>(byw.a.class);
    public final byw.b dYR;

    public bxn(byw.b b2) {
        this.dYR = b2;
    }

    public void a(bxo bxo2) {
        if (bxo2 == null) {
            return;
        }
        if (this.dYQ.containsKey((Object)bxo2.aDH())) {
            return;
        }
        this.dYQ.put(bxo2.aDH(), bxo2);
    }

    public bxo a(byw.a a2) {
        if (a2 == null) {
            return null;
        }
        return this.dYQ.get((Object)a2);
    }
}

