/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hnd {
    public static final hbe jzX = hbe.jAM;
    private final Map<a, ldn> kNV = new HashMap<a, ldn>();

    public final void cleanup() {
        for (ldn ldn2 : this.kNV.values()) {
            assert (ldn2.isEmpty());
        }
    }

    public final void a(boolean bl, lbp lbp2, a a2) {
        ldn ldn2 = this.kNV.get(a2);
        if (ldn2 == null) {
            assert (bl);
            ldn2 = new ldn();
            this.kNV.put(a2, ldn2);
        }
        ldn2.a(bl, lbp2);
    }

    public final void a(boolean bl, lbp lbp2, int n, Set<jpn> set) {
        a a2 = new a(n, set);
        this.a(bl, lbp2, a2);
    }

    public final boolean a(int n, Set<jpn> set) {
        if (this.kNV == null) {
            return false;
        }
        a a2 = new a(n, set);
        ldn ldn2 = this.kNV.get(a2);
        if (ldn2 == null) {
            return false;
        }
        return ldn2.ens();
    }
}

