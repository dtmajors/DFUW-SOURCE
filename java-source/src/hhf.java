/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 *  lcy
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class hhf
extends hpw {
    protected static final List<a> kqp = Collections.unmodifiableList(Arrays.asList(new a("MarkersQuest", hdw.kbm), new a("MarkersBindstone", hdw.kbn), new a("MarkersGreaterstone", hdw.kbo), new a("MarkersChaosstone", hdw.kbp), new a("MarkersAnnotation", hdw.kbq), new a("MarkersConquest", hdw.kbr), new a("MarkersPartyPlayer", hdw.kbs), new a("MarkersPartyWaypoint", hdw.kbt), new a("MarkersVendor", hdw.kbu), new a("MarkersCity", hdw.kbv), new a("MarkersClanMembers", hdw.kbw), new a("MarkersHousing", hdw.kbx), new a("MarkersControlPoints", hdw.kby), new a("MarkersFortress", hdw.kbA), new a("MarkersTradeRoute", hdw.kbz), new a("MarkersPlayers", hdw.kbB), new a("MarkersSiegestone", hdw.kbC), new a("MarkersPlayerDeployedObjects", hdw.kbD), new a("MarkersFunFlags", hdw.kbE)));
    private static final hpw.a kqq = new hpw.a(lhu.rnR, lcq.COLORSHIFT_NEUTRAL);
    private final Map<hei, hhi> kqr = new HashMap<hei, hhi>();
    private final ljp kqs;
    private final ljp kqt;
    protected final ljp kqu;
    private final hde kqv;
    private final Map<lgg, b> kqw = new HashMap<lgg, b>();
    private final lbn kqx = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhf kqE;
        {
            this.kqE = hhf2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhf.a(this.kqE)) {
                throw new AssertionError();
            }
            hhf.b(this.kqE);
        }

        static {
            $assertionsDisabled = !hhf.class.desiredAssertionStatus();
        }
    };
    private final hby kqy = new hby(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhf kqE;
        {
            this.kqE = hhf2;
        }

        public final void a(hby.a a2, hei hei2) {
            if (!$assertionsDisabled && !hhf.a(this.kqE)) {
                throw new AssertionError();
            }
            this.kqE.c(a2, hei2);
        }

        static {
            $assertionsDisabled = !hhf.class.desiredAssertionStatus();
        }
    };
    private final lbn kqz = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhf kqE;
        {
            this.kqE = hhf2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhf.a(this.kqE)) {
                throw new AssertionError();
            }
            hhf.c(this.kqE);
        }

        static {
            $assertionsDisabled = !hhf.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private boolean kqA = true;
    private lbf<lhu> kqB;
    private boolean kqC = true;
    private float daN;
    private static final Map<hdw, lfb> kqD = hhf.ckM();

    public hhf(hdm hdm2, String string, ljp ljp2, ljp ljp3, float f2, lbf<lhu> lbf2, boolean bl, hde hde2) {
        super((hnc)hdm2, string, lgg.rlI, lhf.rnv, kqq);
        this.kqs = new ljp(ljp2);
        this.kqt = new ljp(ljp3);
        this.kqu = new ljp(ljp3.x - ljp2.x, ljp3.y - ljp2.y);
        this.kqA = bl;
        this.kqv = hde2;
        this.kqB = lbf2;
        this.daN = f2;
        this.ckV();
        this.d(this.ckX());
    }

    public final float getScale() {
        return this.daN;
    }

    public final boolean jR(float f2) {
        if (ldq.ai(f2, this.daN)) {
            return false;
        }
        this.daN = f2;
        this.cko();
        return true;
    }

    public final boolean c(lbf<lhu> lbf2) {
        if (lbf2 == this.kqB) {
            return false;
        }
        this.kqB = lbf2;
        this.d(this.ckX());
        return true;
    }

    public final boolean ckJ() {
        return this.kqA;
    }

    public final void nA(boolean bl) {
        if (bl == this.kqC) {
            return;
        }
        this.kqC = bl;
        if (this.kqC) {
            this.ckP();
        }
    }

    public final float jS(float f2) {
        lhf lhf2 = this.cqv();
        assert (lhf2.rmN == lhf2.H);
        assert (this.kqu.x == this.kqu.y);
        float f3 = (float)lhf2.rmN / this.kqu.x;
        return f2 / f3;
    }

    public final int jT(float f2) {
        lhf lhf2 = this.cqv();
        assert (lhf2.rmN == lhf2.H);
        assert (this.kqu.x == this.kqu.y);
        float f3 = (float)lhf2.rmN / this.kqu.x;
        return (int)(f2 * f3);
    }

    public final ljp t(lgg lgg2) {
        assert (lgg2.cf >= 0) : lgg2.cf;
        assert (lgg2.cf < this.getWidth()) : lgg2.cf;
        assert (lgg2.cg >= 0) : lgg2.cg;
        assert (lgg2.cg < this.getHeight()) : lgg2.cg;
        float f2 = this.jS(lgg2.cf);
        float f3 = this.jS(lgg2.cg);
        f3 += this.kqs.y;
        f3 = -f3;
        ljp ljp2 = new ljp(f2 += this.kqs.x, f3);
        assert (hhf.t(ljp2.x, this.kqs.x, this.kqt.x)) : ljp2.x;
        assert (hhf.t(ljp2.y, this.kqs.y, this.kqt.y)) : ljp2.y;
        return ljp2;
    }

    public final lgg q(ljp ljp2) {
        assert (hhf.t(ljp2.x, this.kqs.x, this.kqt.x)) : ljp2.x;
        assert (hhf.t(ljp2.y, this.kqs.y, this.kqt.y)) : ljp2.y;
        float f2 = ljp2.x;
        float f3 = ljp2.y;
        f3 = -f3;
        lgg lgg2 = new lgg(this.jT(f2 -= this.kqs.x), this.jT(f3 -= this.kqs.y));
        assert (lgg2.cf >= 0) : lgg2.cf;
        assert (lgg2.cf <= this.getWidth()) : lgg2.cf;
        assert (lgg2.cg >= 0) : lgg2.cg;
        assert (lgg2.cg <= this.getHeight()) : lgg2.cg;
        return lgg2;
    }

    public final void ckK() {
        this.ckm();
    }

    public final void ckL() {
        this.ckn();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.ckQ();
        if (this.kqC) {
            this.ckY();
        }
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        if (this.kqC) {
            this.ckW();
            this.ckU();
        }
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        this.aY(linkedList);
        lhu lhu2 = null;
        this.kLu.a(lhu2, linkedList);
    }

    @Override
    protected void cfS() {
        assert (this.Initialized);
        super.cfS();
        if (this.kqC) {
            this.ckY();
        }
    }

    @Override
    protected void chd() {
        assert (this.Initialized);
        super.chd();
        if (this.kqC) {
            this.ckY();
        }
    }

    @Override
    protected int a(ldb ldb2, int n) {
        return 0;
    }

    protected void ckm() {
    }

    protected void ckn() {
    }

    private static final Map<hdw, lfb> ckM() {
        HashMap<hdw, lfb> hashMap = new HashMap<hdw, lfb>();
        hashMap.put(hdw.kbm, lcy.rdT);
        hashMap.put(hdw.kbn, lcy.rdU);
        hashMap.put(hdw.kbo, lcy.rdV);
        hashMap.put(hdw.kbp, lcy.rdW);
        hashMap.put(hdw.kbq, lcy.rdX);
        hashMap.put(hdw.kbr, lcy.rdY);
        hashMap.put(hdw.kbs, lcy.rdZ);
        hashMap.put(hdw.kbt, lcy.rea);
        hashMap.put(hdw.kbu, lcy.reb);
        hashMap.put(hdw.kbv, lcy.rec);
        hashMap.put(hdw.kbw, lcy.red);
        hashMap.put(hdw.kbx, lcy.ree);
        hashMap.put(hdw.kby, lcy.ref);
        hashMap.put(hdw.kbz, lcy.reg);
        hashMap.put(hdw.kbA, lcy.reh);
        hashMap.put(hdw.kbB, lcy.rei);
        hashMap.put(hdw.kbC, lcy.rej);
        hashMap.put(hdw.kbD, lcy.rek);
        hashMap.put(hdw.kbE, lcy.rel);
        return hashMap;
    }

    protected void aY(List<hnt> list) {
        lgg lgg2 = this.cqu();
        assert (this.cqQ());
        Object object = this.t(lgg2);
        ljq ljq2 = new ljq(((ljp)object).x, 0.0f, ((ljp)object).y);
        object = lcw.dW((ljq)ljq2);
        Object object2 = lea.h((lej)object);
        ljg ljg2 = new ljg(((lhy)object2).getDisplayName());
        list.add(new hnt(this.cbO().kKo, lcy.rdR.a(ljg2).esy()));
        list.add(new hnt(this.cbO().jGU, new lis(ljq2).esy()));
        object2 = this.cbP().kck.av();
        ((ljq)object2).y = ljq2.y;
        float f2 = ljq2.ez((ljq)object2);
        Object object3 = new lit(f2);
        object3 = lcy.rdS.a(new lip[]{object3});
        list.add(new hnt(this.cbO().jGU, ((lip)object3).esy()));
        if (lcw.SC.ordinal() >= hc.aaA.ordinal()) {
            list.add(new hnt(this.cbO().kKr, "World coordinates: " + ljq2));
            object2 = lcw.f((lej)object);
            list.add(new hnt(this.cbO().kKr, "Tile ID: " + (String)object2));
        }
        for (hei hei2 : this.kqr.keySet()) {
            lgg lgg3;
            object3 = this.kqr.get(hei2);
            if (!((hms)object3).A(lgg3 = ((hms)object3).a((hms)this, lgg2))) continue;
            list.add(new hnt(this.cbO().jGU, "\r\n"));
            Object object4 = hei2.cfu();
            Object object5 = null;
            for (hdw hdw2 = hei2.kdY; object5 == null && hdw2 != null; hdw2 = hdw2.ces()) {
                object5 = kqD.get(hdw2);
            }
            if (object5 != null) {
                object4 = ((lfb)object5).a(new lip[]{object4});
            }
            list.add(new hnt(this.cbO().kKo, ((lip)object4).esy()));
            object4 = hei2.cfv();
            ljq2 = new ljq(((ljp)object4).x, 0.0f, ((ljp)object4).y);
            list.add(new hnt(this.cbO().jGU, new lis(ljq2).esy()));
            object5 = this.cbP().kck.av();
            ((ljq)object5).y = ljq2.y;
            float f3 = ljq2.ez((ljq)object5);
            lip lip2 = new lit(f3);
            lip2 = lcy.rdS.a(lip2);
            list.add(new hnt(this.cbO().jGU, lip2.esy()));
        }
    }

    protected void cko() {
        this.d(this.ckX());
    }

    protected void ckN() {
        this.ckS();
    }

    protected void ckO() {
        this.ckQ();
    }

    protected void ckP() {
        this.ckW();
        this.ckY();
        this.ckU();
    }

    protected final void nB(boolean bl) {
        bl = true;
        if (bl == this.kqA) {
            return;
        }
        this.kqA = bl;
        this.ckN();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void ckQ() {
        Object object;
        HashSet<hei> hashSet = new HashSet<hei>(this.cbP().kco.cor());
        Iterator<Object> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            hei object22 = (hei)iterator.next();
            if (this.e(object22.kdY) != hde.b.jLt) continue;
            iterator.remove();
        }
        iterator = this.kqr.keySet().iterator();
        while (iterator.hasNext()) {
            hei hei2 = (hei)iterator.next();
            if (hashSet.contains(hei2)) continue;
            object = this.kqr.get(hei2);
            ((hms)object).remove();
            iterator.remove();
        }
        for (hei hei3 : hashSet) {
            object = this.kqr.get(hei3);
            if (object != null) continue;
            object = new hhi(this.cbO(), (String)null, hei3, this.kqA);
            this.j((hms)object);
            this.kqr.put(hei3, (hhi)object);
        }
        for (Map.Entry entry : this.kqr.entrySet()) {
            object = (hei)entry.getKey();
            hde.b b2 = this.e(((hei)object).kdY);
            hhi hhi2 = (hhi)entry.getValue();
            hhi2.nC(b2 == hde.b.jLu);
        }
    }

    final void c(hby.a a2, hei hei2) {
        switch (a2) {
            case jEC: {
                if (this.kqr.get(hei2) != null) {
                    this.c(hby.a.jEE, hei2);
                    return;
                }
                hhi hhi2 = new hhi(this.cbO(), (String)null, hei2, this.kqA);
                this.j(hhi2);
                this.kqr.put(hei2, hhi2);
                hde.b b2 = this.e(hei2.kdY);
                hhi2.nC(b2 == hde.b.jLu);
                break;
            }
            case jED: {
                hhi hhi3 = this.kqr.remove(hei2);
                if (hhi3 == null) break;
                hhi3.remove();
                break;
            }
            case jEE: {
                hde.b b3 = this.e(hei2.kdY);
                hhi hhi4 = this.kqr.get(hei2);
                if (hhi4 == null) {
                    if (b3 != hde.b.jLt) {
                        this.c(hby.a.jEC, hei2);
                    }
                    return;
                }
                hhi4.nC(b3 == hde.b.jLu);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private static boolean t(float f2, float f3, float f4) {
        return f3 <= f2 && f2 <= f4 || f4 <= f2 && f2 <= f3;
    }

    private hde.b e(hdv hdv2) {
        for (a a2 : kqp) {
            if (!hdv2.b(a2.kqG)) continue;
            return this.kqv.mm(a2.aQU).evQ();
        }
        assert (false);
        return null;
    }

    private void ckR() {
        this.ckV();
        this.ckT();
    }

    private void ckS() {
        for (Map.Entry<hei, hhi> entry : this.kqr.entrySet()) {
            entry.getValue().clg();
        }
    }

    private void ckT() {
        for (Map.Entry<hei, hhi> entry : this.kqr.entrySet()) {
            entry.getValue().clh();
        }
    }

    private void ckU() {
        for (Map.Entry<hei, hhi> entry : this.kqr.entrySet()) {
            entry.getValue().cli();
        }
    }

    private void ckV() {
        this.ckO();
    }

    private void ckW() {
        lhf lhf2 = this.cla();
        for (b b2 : lin.a(this.crn(), b.class)) {
            b2.h(b2.kqH.cf * lhf2.rmN, b2.kqH.cg * lhf2.H, lhf2.rmN, lhf2.H);
            b2.N(this.daN, this.daN);
        }
    }

    private lhf ckX() {
        lhf lhf2 = this.cla();
        return new lhf(lhf2.rmN * this.kqB.cst(), lhf2.H * this.kqB.getRowCount());
    }

    private void ckY() {
        lgs lgs2 = this.cqU();
        this.a(lgs2, this.kqB);
        this.e(lgs2);
        this.ckZ();
    }

    private void a(lgs lgs2, lbf<lhu> lbf2) {
        ArrayList<b> arrayList = null;
        for (b b2 : lin.a(this.crn(), b.class)) {
            if (b2.kqB == lbf2 && lgs2.x(b2.cqD())) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<b>();
            }
            arrayList.add(b2);
        }
        if (arrayList != null) {
            for (b b2 : arrayList) {
                b b3 = this.kqw.remove(b2.kqH);
                assert (b3 == b2);
                b2.remove();
            }
        }
    }

    private void e(lgs lgs2) {
        lhf lhf2 = this.cla();
        int n = lgs2.cf / lhf2.rmN;
        int n2 = lgs2.cg / lhf2.H;
        int n3 = (lgs2.cf + lgs2.rmN) / lhf2.rmN;
        int n4 = (lgs2.cg + lgs2.H) / lhf2.H;
        int n5 = n2 * lhf2.rmN;
        for (int i = n2; i <= n4; ++i) {
            int n6 = n * lhf2.rmN;
            for (int j = n; j <= n3; ++j) {
                lgg lgg2;
                b b2;
                if (lgs2.L(n6, n5, lhf2.rmN, lhf2.H) && (b2 = this.kqw.get(lgg2 = new lgg(j, i))) == null) {
                    b2 = new b(this.kLu, n6, n5, lhf2, this.kqB, lgg2, this.daN);
                    this.j(b2);
                    b2.cqG();
                    this.kqw.put(lgg2, b2);
                }
                n6 += lhf2.rmN;
            }
            n5 += lhf2.H;
        }
    }

    protected final void ckZ() {
        for (hms hms2 : this.crn()) {
            if (!(hms2 instanceof b)) continue;
            b b2 = (b)hms2;
            lcq lcq2 = this.u(b2.kqH);
            if (lcq2 == null) {
                lcq2 = lcq.COLORSHIFT_NEUTRAL;
            }
            b2.H(lcq2);
        }
    }

    protected lcq u(lgg lgg2) {
        return null;
    }

    private lhf cla() {
        lhf lhf2 = this.kqB.fM((int)0, (int)0).kLY;
        return new lhf((int)((float)lhf2.rmN * this.daN), (int)((float)lhf2.H * this.daN));
    }

    protected final boolean clb() {
        return this.kqC;
    }

    private void mU(boolean bl) {
        this.cbP().kco.coq().a(bl, this.kqy);
        this.kqv.cec().a(bl, this.kqz);
    }

    static /* synthetic */ boolean a(hhf hhf2) {
        return hhf2.Initialized;
    }

    static /* synthetic */ void b(hhf hhf2) {
        hhf2.ckQ();
    }

    static /* synthetic */ void c(hhf hhf2) {
        hhf2.ckR();
    }
}

