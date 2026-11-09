/*
 * Decompiled with CFR.
 */
import java.util.IdentityHashMap;

public class hmr {
    private final IdentityHashMap<hoy, a> kLI = new IdentityHashMap();
    public final String jLK;
    private lcq dMT;

    public hmr(String string) {
        this.jLK = string;
        this.dMT = lcq.COLORSHIFT_NEUTRAL;
    }

    public final boolean isEmpty() {
        return this.kLI.isEmpty();
    }

    public final void cleanup() {
        while (!this.kLI.isEmpty()) {
            hoy hoy2 = this.kLI.keySet().iterator().next();
            this.a(false, hoy2);
        }
    }

    public final void a(boolean bl, hoy hoy2) {
        a a2;
        if (this.b(hoy2) == bl) {
            return;
        }
        if (bl) {
            a2 = new a(this, hoy2);
            this.kLI.put(hoy2, a2);
        } else {
            a2 = this.c(hoy2);
            this.kLI.remove(hoy2);
        }
        hoy2.cql().a(bl, a2);
        hoy2.c(bl, this);
        assert (this.b(hoy2) == bl);
    }

    public final boolean b(hoy hoy2) {
        return this.c(hoy2) != null;
    }

    public final boolean J(lcq lcq2) {
        if (lcq2.X(this.dMT)) {
            return false;
        }
        this.dMT = lcq2;
        for (a a2 : this.kLI.values()) {
            hoy hoy2 = a2.kLF;
            hoy2.cuy();
        }
        return true;
    }

    public final lcq getColor() {
        return this.dMT;
    }

    public String toString() {
        return null;
    }

    private a c(hoy hoy2) {
        return this.kLI.get(hoy2);
    }
}

