/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spenefett.util.jni.SFJNIUtils;

public abstract class hsh
extends hnc {
    private static final float lbD = 1.0f;
    private static final float lbE = 0.001f;
    private static final boolean lbF = false;
    private static final Map<Integer, jpn> lbG = hsh.cxp();
    public final hsg jWV;
    private final hsf lbH;
    public final hsi jDE;
    public final dxs cdj = new dxs();
    private final lbn lbI = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsh lbP;
        {
            this.lbP = hsh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hsh.a(this.lbP)) {
                throw new AssertionError();
            }
            if (hsh.b(this.lbP)) {
                hsh.a(this.lbP, (hms)this.lbP.kND, 0.0f);
                hsh.a(this.lbP, false);
                hsh.a(this.lbP, (hms)this.lbP.kND, 1);
            }
        }

        static {
            $assertionsDisabled = !hsh.class.desiredAssertionStatus();
        }
    };
    private final lbn lbJ = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hsh lbP;
        {
            this.lbP = hsh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hsh.a(this.lbP)) {
                throw new AssertionError();
            }
            this.lbP.cxo();
        }

        static {
            $assertionsDisabled = !hsh.class.desiredAssertionStatus();
        }
    };
    private final lbn lbK = new lbn(this){
        final /* synthetic */ hsh lbP;
        {
            this.lbP = hsh2;
        }

        public final void W() {
            hsh.c(this.lbP);
        }
    };
    private final lbi<jpp> lbL = new lbi<jpp>(this){
        final /* synthetic */ hsh lbP;
        {
            this.lbP = hsh2;
        }

        public final void b(jpp jpp2) {
            hsh.a(this.lbP, jpp2);
            switch (jpp2.nNJ) {
                case 256: 
                case 260: {
                    int n = jpp2.nNK;
                    int n2 = jpp2.nNL & 0xFFFF;
                    boolean bl = (jpp2.nNL & 0x40000000) != 0;
                    hsh.a(this.lbP, n, true);
                    EnumSet<jpn> enumSet = EnumSet.copyOf(hsh.d(this.lbP));
                    enumSet.removeAll(jpn.nLP);
                    enumSet = Collections.unmodifiableSet(enumSet);
                    for (int i = 0; i < n2; ++i) {
                        this.lbP.c(n, bl, enumSet);
                        bl = true;
                    }
                    break;
                }
                case 257: 
                case 261: {
                    int n = jpp2.nNK;
                    hsh.a(this.lbP, n, false);
                    this.lbP.Nq(n);
                    break;
                }
                case 258: {
                    char c2 = (char)jpp2.nNK;
                    int n = jpp2.nNL & 0xFFFF;
                    for (int i = 0; i < n; ++i) {
                        this.lbP.h(c2);
                    }
                    break;
                }
                case 512: {
                    this.On(jpp2.nNL);
                    break;
                }
                case 513: {
                    this.On(jpp2.nNL);
                    this.lbP.nY(false);
                    break;
                }
                case 514: {
                    this.On(jpp2.nNL);
                    this.lbP.cqL();
                    break;
                }
                case 515: {
                    this.On(jpp2.nNL);
                    this.lbP.nY(true);
                    break;
                }
                case 522: {
                    this.On(jpp2.nNL);
                    int n = jpp2.nNK >> 16;
                    if ((n /= 120) == 0) break;
                    this.lbP.Np(n);
                    break;
                }
            }
            hsh.a(this.lbP, null);
        }

        private void On(int n) {
            short s = (short)(n & 0xFFFF);
            int n2 = n >> 16;
            if (s == hsh.e(this.lbP) && n2 == hsh.f(this.lbP)) {
                return;
            }
            hsh.a(this.lbP, s);
            hsh.b(this.lbP, n2);
            this.lbP.B(new lgg(s, n2));
        }

        public /* synthetic */ void m(Object object) {
            this.b((jpp)object);
        }
    };
    private boolean jLT;
    private boolean kNK;
    private final Set<jpn> kvi = EnumSet.noneOf(jpn.class);
    private int lbM;
    private int lbN;
    private jpp lbO;

    public hsh(hsg hsg2, hnc.c c2, hsi hsi2, lhf lhf2) {
        super(hsg2.kAz, hsg2.kNg, hsg2.kNh, c2, lhf2);
        this.jWV = hsg2;
        this.jDE = hsi2;
        this.lbH = new hsf(this, 10);
        this.jLT = true;
        this.mU(true);
    }

    public final hsb e(hnb hnb2) {
        return this.lbH.e(hnb2);
    }

    public final jpp cxn() {
        return this.lbO;
    }

    public final String d(hnb hnb2, String string, boolean bl, int n, boolean bl2) {
        assert (this.jLT);
        List<String> list = this.b(hnb2, string, bl, n, bl2);
        return this.a(list, bl2);
    }

    @Override
    protected void cbg() {
        assert (this.jLT);
        this.lbH.dispose();
        this.mU(false);
        super.cbg();
        this.jLT = false;
    }

    @Override
    protected boolean n(Set<jpn> set) {
        return this.kvi.containsAll(set);
    }

    @Override
    protected final void b(lhi lhi2) {
        assert (this.jLT);
        this.jWV.a(lhi2);
    }

    @Override
    protected lhf c(hnb hnb2, String string) {
        assert (this.jLT);
        if (string.length() == 0) {
            return lhf.rnv;
        }
        return SFJNIUtils.Instance.getSinglelineTextSize(hnb2.kNa, hnb2.kNb, hnb2.kNc, hnb2.kNd, string);
    }

    @Override
    protected lhf c(hnb hnb2, String string, boolean bl, int n, boolean bl2) {
        assert (this.jLT);
        if (string.length() == 0) {
            return new lhf(lhf.rnv);
        }
        string = this.d(hnb2, string, bl, n, bl2);
        int n2 = 3072;
        return SFJNIUtils.Instance.getMultilineTextSize(hnb2.kNa, hnb2.kNb, hnb2.kNc, hnb2.kNd, string, n, n2);
    }

    @Override
    protected final void csj() {
        assert (this.jLT);
        this.kNK = true;
    }

    @Override
    protected final hmg csk() {
        assert (this.jLT);
        return new hsk(this);
    }

    @Override
    protected final hmh csl() {
        assert (this.jLT);
        return new hsm(this);
    }

    @Override
    protected final void csm() {
        lcu lcu2 = this.cqJ();
        this.jWV.c(lcu2);
    }

    @Override
    protected final double csn() {
        return this.jWV.csa();
    }

    @Override
    protected final int cso() {
        return this.jWV.csb();
    }

    @Override
    protected void csr() {
        super.csr();
        this.jWV.jWK.ow(this.crV() != null);
    }

    protected void cxo() {
        this.e(this.jWV.jWK.cqE().cqv());
    }

    private int e(hms hms2, int n) {
        return 0;
    }

    private float b(hms hms2, float f2) {
        assert (this.jLT);
        if (hms2 instanceof hoy) {
            hoy hoy2 = (hoy)hms2;
            hmf object = hoy2.cqc();
            object.jY(f2);
            f2 += 0.001f;
        }
        if (hms2 instanceof hmt) {
            for (hms hms3 : ((hmt)hms2).crn()) {
                f2 = this.b(hms3, f2);
            }
        }
        return f2;
    }

    private static Map<Integer, jpn> cxp() {
        HashMap<Integer, jpn> hashMap = new HashMap<Integer, jpn>();
        hashMap.put(new Integer(16), jpn.nLv);
        hashMap.put(new Integer(17), jpn.nLw);
        hashMap.put(new Integer(18), jpn.nLx);
        hashMap.put(new Integer(160), jpn.nLz);
        hashMap.put(new Integer(161), jpn.nLD);
        hashMap.put(new Integer(162), jpn.nLA);
        hashMap.put(new Integer(163), jpn.nLE);
        hashMap.put(new Integer(164), jpn.nLB);
        hashMap.put(new Integer(165), jpn.nLF);
        hashMap.put(new Integer(91), jpn.nLC);
        hashMap.put(new Integer(92), jpn.nLG);
        return Collections.unmodifiableMap(hashMap);
    }

    private void W(int n, boolean bl) {
        jpn jpn2 = lbG.get(new Integer(n));
        if (jpn2 == null) {
            return;
        }
        assert (jpn2 != jpn.nLv && jpn2 != jpn.nLw && jpn2 != jpn.nLx);
        this.a(jpn2, bl);
    }

    private void a(jpn jpn2, boolean bl) {
        if (this.kvi.contains((Object)jpn2) == bl) {
            return;
        }
        if (bl) {
            this.kvi.add(jpn2);
        } else {
            this.kvi.remove((Object)jpn2);
        }
        this.a(jpn.nLv, this.kvi.contains((Object)jpn.nLz) || this.kvi.contains((Object)jpn.nLD));
        this.a(jpn.nLw, this.kvi.contains((Object)jpn.nLA) || this.kvi.contains((Object)jpn.nLE));
        this.a(jpn.nLx, this.kvi.contains((Object)jpn.nLB) || this.kvi.contains((Object)jpn.nLF));
    }

    private void mU(boolean bl) {
        this.jDE.cxq().a(bl, this.lbI);
        this.jWV.jWK.cwO().a(bl, this.lbJ);
        this.jWV.jWK.cwL().a(bl, this.lbK);
        this.jWV.lbv.a(bl, this.lbL);
    }

    static /* synthetic */ boolean a(hsh hsh2) {
        return hsh2.jLT;
    }

    static /* synthetic */ boolean b(hsh hsh2) {
        return hsh2.kNK;
    }

    static /* synthetic */ float a(hsh hsh2, hms hms2, float f2) {
        return hsh2.b(hms2, f2);
    }

    static /* synthetic */ boolean a(hsh hsh2, boolean bl) {
        hsh2.kNK = bl;
        return hsh2.kNK;
    }

    static /* synthetic */ int a(hsh hsh2, hms hms2, int n) {
        return hsh2.e(hms2, n);
    }

    static /* synthetic */ void c(hsh hsh2) {
        hsh2.cqN();
    }

    static /* synthetic */ jpp a(hsh hsh2, jpp jpp2) {
        hsh2.lbO = jpp2;
        return hsh2.lbO;
    }

    static /* synthetic */ void a(hsh hsh2, int n, boolean bl) {
        hsh2.W(n, bl);
    }

    static /* synthetic */ Set d(hsh hsh2) {
        return hsh2.kvi;
    }

    static /* synthetic */ int e(hsh hsh2) {
        return hsh2.lbM;
    }

    static /* synthetic */ int f(hsh hsh2) {
        return hsh2.lbN;
    }

    static /* synthetic */ int a(hsh hsh2, int n) {
        hsh2.lbM = n;
        return hsh2.lbM;
    }

    static /* synthetic */ int b(hsh hsh2, int n) {
        hsh2.lbN = n;
        return hsh2.lbN;
    }
}

