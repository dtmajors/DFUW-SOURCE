/*
 * Decompiled with CFR.
 */
public class hnb
implements Comparable<hnb>,
lbq {
    public static final hnb kMZ = new hnb("Helvetica", 12, 400, false);
    public static final hbe jzX = hbe.jAM;
    public static final lbs<hnb> Persistor = new lbs<hnb>(){
        static final /* synthetic */ boolean $assertionsDisabled;

        public hnb a(lfu lfu2, hnb hnb2) {
            String string = lfu2.aA("Facename", hnb2 == null ? null : hnb2.kNa);
            int n = lfu2.ad("Pointsize", hnb2 == null ? 0 : hnb2.kNb);
            int n2 = lfu2.ad("Weight", hnb2 == null ? 0 : hnb2.kNc);
            boolean bl = lfu2.V("Italic", hnb2 == null ? false : hnb2.kNd);
            if (hnb2 != null && hnb2.b(string, n, n2, bl)) {
                return hnb2;
            }
            if (!$assertionsDisabled && !lfu2.eqA()) {
                throw new AssertionError();
            }
            return new hnb(string, n, n2, bl);
        }

        static {
            $assertionsDisabled = !hnb.class.desiredAssertionStatus();
        }
    };
    public final String kNa;
    public final int kNb;
    public final int kNc;
    public final boolean kNd;

    public hnb(String string, int n, int n2, boolean bl) {
        this.kNa = string;
        this.kNb = n;
        this.kNc = n2;
        this.kNd = bl;
    }

    public final boolean b(String string, int n, int n2, boolean bl) {
        return string.equals(this.kNa) && n == this.kNb && n2 == this.kNc && bl == this.kNd;
    }

    public final boolean c(hnb hnb2) {
        return this.b(hnb2.kNa, hnb2.kNb, hnb2.kNc, hnb2.kNd);
    }

    public int hashCode() {
        return this.kNa.hashCode() ^ this.kNb ^ this.kNc ^ (this.kNd ? 1231 : 1237);
    }

    public boolean equals(Object object) {
        if (object instanceof hnb) {
            return this.c((hnb)object);
        }
        assert (false);
        return false;
    }

    public String toString() {
        return "[" + this.kNa + " " + this.kNb + " pt, Weight=" + this.kNc + (this.kNd ? ", italic" : "") + "]";
    }

    public int d(hnb hnb2) {
        int n = this.kNa.compareTo(hnb2.kNa);
        if (n == 0) {
            n = hnb2.kNb - this.kNb;
        }
        if (n == 0) {
            n = hnb2.kNc - this.kNc;
        }
        if (n == 0) {
            n = (hnb2.kNd ? 1 : 0) - (this.kNd ? 1 : 0);
        }
        return n;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.d((hnb)object);
    }
}

