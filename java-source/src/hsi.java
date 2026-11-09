/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class hsi {
    public static final hbe jzX = hbe.jAM;
    private static final int lbQ = 10;
    public final ldv dbx;
    public final lbd jWH;
    public final lbh kAz;
    public final lha<ktl, knt> lbR;
    public final String lbS;
    private final Map<ldv, hrz> lbT = new HashMap<ldv, hrz>();
    private final List<hrz> lbU = new LinkedList<hrz>();
    private final Map<ldv, knt> lbV = new HashMap<ldv, knt>();
    private final List<a> lbW = new LinkedList<a>();
    private final ldl lbX = new ldl();
    private final lbi<ktl> lbY = new lbi<ktl>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsi lca;
        {
            this.lca = hsi2;
        }

        public void c(ktl ktl2) {
            knt knt2 = (knt)hsi.a(this.lca).get(ktl2.dXg());
            ldv ldv2 = ktl2.dXh();
            hrz hrz2 = (hrz)hsi.b(this.lca).get(ldv2);
            if (knt2 == null && !$assertionsDisabled && !lda.by(knt2)) {
                throw new AssertionError();
            }
            if (hrz2 == null) {
                return;
            }
            hrz2.a(ktl2, knt2);
        }

        public /* synthetic */ void m(Object object) {
            this.c((ktl)object);
        }

        static {
            $assertionsDisabled = !hsi.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private boolean lbZ;

    public hsi(ldv ldv2, lbd lbd2, lbh lbh2, lha<ktl, knt> lha2, String string) {
        this.dbx = ldv2;
        this.jWH = lbd2;
        this.kAz = lbh2;
        this.lbS = string;
        this.lbR = lha2;
        this.lbZ = false;
        this.jLT = true;
        this.mU(true);
    }

    public final void dispose() {
        assert (this.jLT);
        this.mU(false);
        this.jLT = false;
    }

    public final void chi() {
        Object object;
        while (this.lbW.size() > 0) {
            object = this.lbW.get(0);
            if (((a)object).lcb > this.kAz.emd()) break;
            this.lbW.remove(0);
            knt knt2 = this.lbV.remove(((a)object).lcc.getGUID());
        }
        this.lbX.enp();
        while (!this.lbU.isEmpty()) {
            object = this.lbU.remove(0);
            assert (!this.lbU.contains(object));
            ((hrz)object).cxc();
        }
    }

    public final lbl<lbn> cxq() {
        return this.lbX;
    }

    protected void a(boolean bl, hrz hrz2) {
        assert (this.jLT);
        assert (this.lbT.containsKey(hrz2.getGUID()) == !bl);
        assert (this.lbT.containsValue(hrz2) == !bl);
        if (bl) {
            this.lbT.put(hrz2.getGUID(), hrz2);
        } else {
            this.lbT.remove(hrz2.getGUID());
        }
    }

    public final void a(boolean bl, hrz hrz2, boolean bl2) {
        assert (this.jLT);
        assert (bl2 || this.lbU.contains(hrz2) == !bl);
        if (bl) {
            this.lbU.add(hrz2);
        } else {
            this.lbU.remove(hrz2);
        }
    }

    public final void oG(boolean bl) {
        this.lbZ = bl;
    }

    public final void check() {
    }

    protected final knt I(int n, ldv ldv2) {
        assert (this.jLT);
        assert (this.lbT.containsKey(ldv2));
        knt knt2 = (knt)this.lbR.rng.ik(n);
        knt2.hC(ldv2);
        knt2.ts(ldv2);
        knt2.jM(true);
        return knt2;
    }

    protected final void a(String string, knt knt2) {
        assert (this.jLT);
        assert ((knt2.bUV() & 0xFFF00) == 256) : knt2.bUV();
        assert (knt2.getGUID() != null);
        this.lbV.put(knt2.getGUID(), knt2);
        this.lbW.add(new a(this.kAz.emd() + 10, knt2));
        this.lbR.rnh.m(knt2);
    }

    public final void g(String string, ldv ldv2) {
        knr knr2 = (knr)this.I(260, ldv2);
        knr2.Zy(1);
        knr2.wD(true);
        this.a(string, knr2);
    }

    private void mU(boolean bl) {
        this.lbR.rex.a(bl, ktl.class, this.lbY);
    }

    static /* synthetic */ Map a(hsi hsi2) {
        return hsi2.lbV;
    }

    static /* synthetic */ Map b(hsi hsi2) {
        return hsi2.lbT;
    }
}

