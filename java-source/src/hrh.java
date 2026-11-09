/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hrh<ROW, FIELD>
extends hrd<ROW, FIELD> {
    hbe jzX = hbe.jAM;
    public final hrs<ROW, FIELD> kVC;
    public final Set<ROW> lac = new HashSet<ROW>();
    private final lbn lad = new lbn(this){
        final /* synthetic */ hrh laf;
        {
            this.laf = hrh2;
        }

        public final void W() {
            hrh.a(this.laf);
        }
    };
    private final b<ROW> lae;
    public boolean jLT;

    public hrh(hrs<ROW, FIELD> hrs2) {
        this(hrs2, new b(null));
    }

    private hrh(hrs<ROW, FIELD> hrs2, b<ROW> b2) {
        super(hrs2.getFieldCount(), b2);
        this.kVC = hrs2;
        this.lae = b2;
        this.jLT = true;
        this.nb(true);
    }

    public final void dispose() {
        assert (this.jLT);
        this.nb(false);
        this.jLT = false;
    }

    public final boolean H(ROW ROW) {
        assert (this.jLT);
        return this.kVC.P(ROW) != null;
    }

    public final boolean I(ROW ROW) {
        assert (this.jLT);
        assert (this.H(ROW));
        return this.lac.contains(ROW);
    }

    public final void a(ROW ROW, boolean bl) {
        assert (this.jLT);
        assert (this.H(ROW));
        if (this.lac.contains(ROW) == bl) {
            return;
        }
        if (bl) {
            this.lac.add(ROW);
        } else {
            this.lac.remove(ROW);
        }
        assert (this.lac.contains(ROW) == bl);
        this.cwD();
    }

    public final void J(ROW ROW) {
        assert (this.jLT);
        assert (ROW != null);
        if ((ROW = this.kVC.N(ROW)) == null) {
            return;
        }
        boolean bl = false;
        while (ROW != null) {
            if (!this.lac.contains(ROW)) {
                bl = true;
                this.lac.add(ROW);
            }
            ROW = this.kVC.N(ROW);
        }
        if (bl) {
            this.cwD();
        }
    }

    public final void cvk() {
        if (this.lac.isEmpty()) {
            return;
        }
        this.lac.clear();
        this.cwD();
    }

    public final int K(ROW ROW) {
        return this.lae.K(ROW);
    }

    public final ROW L(ROW ROW) {
        ROW ROW2;
        if ((ROW = this.kVC.P(ROW)) == null) {
            return null;
        }
        while ((ROW2 = this.kVC.Q(ROW)) != null) {
            ROW = ROW2;
        }
        return ROW;
    }

    public int NW(int n) {
        return this.lae.NX((int)n).hdr;
    }

    @Override
    public ROW LQ(int n) {
        assert (this.jLT);
        return (ROW)this.lae.NX((int)n).kWe;
    }

    @Override
    public FIELD a(ROW ROW, int n) {
        return this.kVC.a(ROW, n);
    }

    private void cwB() {
        assert (this.jLT);
        this.cwC();
        this.os(true);
    }

    private boolean cwC() {
        boolean bl = false;
        Iterator<ROW> iterator = this.lac.iterator();
        while (iterator.hasNext()) {
            ROW ROW = iterator.next();
            assert (ROW != null);
            if (this.kVC.O(ROW)) continue;
            iterator.remove();
            bl = true;
        }
        return bl;
    }

    private void cwD() {
        this.os(false);
    }

    private void os(boolean bl) {
        boolean bl2 = bl;
        int n = 0;
        Object var4_4 = this.kVC.P(null);
        int n2 = 0;
        while (var4_4 != null) {
            block8: {
                a<ROW> a2 = this.lae.NY(n);
                if (a2.kWe != var4_4 || a2.hdr != n2) {
                    a2.kWe = var4_4;
                    a2.hdr = n2;
                    bl2 = true;
                }
                if (this.kVC.P(var4_4) != null && this.I(var4_4)) {
                    ++n2;
                    var4_4 = this.kVC.P(var4_4);
                } else {
                    Object var7_7 = this.kVC.Q(var4_4);
                    if (var7_7 != null) {
                        var4_4 = var7_7;
                    } else {
                        do {
                            --n2;
                            if ((var4_4 = this.kVC.N(var4_4)) == null) break block8;
                        } while ((var7_7 = this.kVC.Q(var4_4)) == null);
                        var4_4 = var7_7;
                    }
                }
            }
            ++n;
        }
        this.lae.NZ(n);
        if (bl2) {
            this.kMt.enp();
        }
    }

    private boolean M(ROW ROW) {
        if (ROW == null) {
            return false;
        }
        if ((ROW = this.kVC.N(ROW)) == null) {
            return false;
        }
        if (!this.lac.contains(ROW)) {
            return true;
        }
        return this.M(ROW);
    }

    private void nb(boolean bl) {
        this.kVC.cec().a(bl, this.lad);
    }

    static /* synthetic */ void a(hrh hrh2) {
        hrh2.cwB();
    }
}

