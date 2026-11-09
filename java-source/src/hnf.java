/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class hnf {
    public static final hbe jzX = hbe.jAM;
    private final lic kNg;
    private final hmd kNh;
    private final lib kOd;
    private final lbn kOe = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnf kOh;
        {
            this.kOh = hnf2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnf.a(this.kOh)) {
                throw new AssertionError();
            }
            ArrayList<E> arrayList = new ArrayList<E>(hnf.b(this.kOh));
            for (lbn lbn2 : arrayList) {
                lbn2.W();
            }
            if (!hnf.c(this.kOh)) {
                hnf.e(this.kOh).setDuration(hnf.d(this.kOh).cpX());
                hnf.a(this.kOh, true);
            }
        }

        static {
            $assertionsDisabled = !hnf.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private final Set<lbn> kOf = new HashSet<lbn>();
    private boolean kOg;

    public hnf(lic lic2, hmd hmd2) {
        assert (lic2 != null);
        this.kNg = lic2;
        this.kNh = hmd2;
        this.kOd = new lib(this.kNg, true);
        this.jLT = true;
        this.mU(true);
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final boolean isConstructed() {
        return this.jLT;
    }

    public final void a(boolean bl, lbn lbn2) {
        assert (this.jLT);
        assert (lbn2 != null);
        if (bl) {
            if (this.kOf.isEmpty()) {
                this.kOg = false;
                this.kOd.ee(this.kNh.cpW());
            }
            this.kOf.add(lbn2);
        } else {
            this.kOf.remove(lbn2);
            if (this.kOf.isEmpty()) {
                this.kOd.stop();
            }
        }
    }

    public final boolean a(lbn lbn2) {
        assert (this.jLT);
        assert (lbn2 != null);
        return this.kOf.contains(lbn2);
    }

    protected void cbg() {
        assert (this.jLT);
        this.mU(false);
        this.jLT = false;
    }

    private void mU(boolean bl) {
        this.kOd.esg().a(bl, this.kOe);
    }

    static /* synthetic */ boolean a(hnf hnf2) {
        return hnf2.jLT;
    }

    static /* synthetic */ Set b(hnf hnf2) {
        return hnf2.kOf;
    }

    static /* synthetic */ boolean c(hnf hnf2) {
        return hnf2.kOg;
    }

    static /* synthetic */ hmd d(hnf hnf2) {
        return hnf2.kNh;
    }

    static /* synthetic */ lib e(hnf hnf2) {
        return hnf2.kOd;
    }

    static /* synthetic */ boolean a(hnf hnf2, boolean bl) {
        hnf2.kOg = bl;
        return hnf2.kOg;
    }
}

