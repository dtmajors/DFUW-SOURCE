/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdm
 *  lcy
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class hgf
extends hou {
    private static final lhf jGE = new lhf(0, 4);
    private static final int kmF = 450;
    private final lbn jCt = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgf kng;
        {
            this.kng = hgf2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgf.b(this.kng)) {
                throw new AssertionError();
            }
        }

        static {
            $assertionsDisabled = !hgf.class.desiredAssertionStatus();
        }
    };
    private static final hoz.a jHL = new hoz.a(lcy.qUR);
    private static final hoz.a jHM = new hoz.a(lcy.qUS, true);
    private static final hoz.a jCu = new hoz.a(lcy.qQB);
    private final ldv kmI;
    private final how kna;
    private List<hdz> knb;
    private final List<e> knc;
    private e knd;
    private final lbn kmN = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgf kng;
        {
            this.kng = hgf2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgf.b(this.kng)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hgf.d(this.kng) == null) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hgf.d(this.kng).csT();
            a a2 = (a)hoz2.ccw();
            this.kng.cbO().jZL.ccS().yP(!hoz2.cuF());
            hgf.a(this.kng, null);
            hoz.a a3 = hoz2.coZ();
            if (a3 == hgf.ciY()) {
                hgf.b(this.kng, a2.kmX);
            }
            hgf.a(this.kng, null);
        }

        static {
            $assertionsDisabled = !hgf.class.desiredAssertionStatus();
        }
    };
    private final lbn kmQ = new lbn(this){
        final /* synthetic */ hgf kng;
        {
            this.kng = hgf2;
        }

        public final void W() {
            hgf.e(this.kng);
        }
    };
    private final lbn kmS = new lbn(this){
        final /* synthetic */ hgf kng;
        {
            this.kng = hgf2;
        }

        public final void W() {
            hgf.e(this.kng);
        }
    };
    private final lbn kne = new lbn(this){
        final /* synthetic */ hgf kng;
        {
            this.kng = hgf2;
        }

        public final void W() {
            hgf.f(this.kng);
            hgf.g(this.kng);
        }
    };
    private boolean Initialized;
    private hnu kmT;
    private final hqr jGH;
    private final hja kmU;
    private final c knf;
    private final lij<hdw> kki = new lij();

    @Override
    protected boolean LM(int n) {
        this.jGH.Nj(n);
        return true;
    }

    private void mS(String string) {
        this.cbO().a(string, null, new hoz.a[]{jCu}, null, jCu, jCu, this.jCt);
    }

    public hgf(hdm hdm2, String string, lgg lgg2, lhf lhf2, ldv ldv2) {
        super((hnc)hdm2, string, lgg2, lhf2, new lhf(1, 2), lgg.rlI);
        assert (ldv2 != null);
        this.kmI = ldv2;
        this.a(ldb.reo, 0, 360);
        this.a(ldb.rep, 0, 300);
        hdm2.jXk.getClass();
        this.a(ldb.rep, 1, 85);
        int n = hgf.jGE.rmN;
        int n2 = hgf.jGE.H;
        hja.d d2 = new hja.d(hdm2.kKD, 16, hdm2.kIy, hdm2.kIy, hdm2.kIs, hdm2.kIy, hlu.kGU);
        this.knf = new c(hdm2.kmY, hdm2.jGK, d2, hdm2.kJK);
        this.jGH = new hqr(this.kLu, (String)null, new lgg(n, n2), lhf.rnv, this.knf.jGK);
        n2 += this.jGH.getHeight();
        n2 += hgf.jGE.H;
        this.kmU = new hja(this.cbO(), (String)null, lgg.rlI, lhf.rnv, this.knf.kmZ, this.kki);
        this.jGH.cwt().cqd().a(this.kmU);
        this.d(0, 0, this.jGH);
        this.p(this.jGH);
        this.kna = new how((hnc)hdm2, null, lgg.rlI, lhf.rnv, hdm2.kKk);
        this.d(1, 0, this.kna);
        this.knc = lcn.emv();
        this.ciV();
        int n3 = 4;
        int n4 = 64;
        int n5 = 64;
        int n6 = 50;
        int n7 = 86;
        hqv.a a2 = new hqv.a(hdm2.kJJ, hdm2.kIn.kEi);
        for (int i = 0; i < 3; ++i) {
            int n8 = n7 + (n4 + n6) * i;
            int n9 = -1;
            String string2 = lcy.qVE.esy();
            lhu lhu2 = lhu.rnR;
            if (i < this.knb.size()) {
                lhu2 = this.knb.get((int)i).kaW.atw();
                n9 = this.knb.get((int)i).kaW.Type;
                string2 = lcy.qVD.esy();
            }
            e e2 = new e(this, null);
            d d3 = new d(this, e2);
            b b2 = new b(this, (hnc)hdm2, null, new lgg(n8, n3), new lhf(n4, n5), hpx.a.kXm, a2, lhu2);
            b2.cvC().a(true, d3);
            b2.og(false);
            b2.ResourceType = n9;
            this.kna.j(b2);
            hpe hpe2 = new hpe((hnc)hdm2, "jalla", new lgg(n8, n3 + n5 + 2), new lhf(64, 12), this.cbO().kIY, string2);
            this.kna.j(hpe2);
            e2.kni = b2;
            e2.ResourceType = n9;
            e2.knj = hpe2;
            this.knc.add(e2);
        }
    }

    private void ciU() {
        Object object;
        assert (this.knc != null);
        ArrayList<e> arrayList = new ArrayList<e>(this.knc);
        ArrayList<hdz> arrayList2 = new ArrayList<hdz>(this.knb);
        Iterator iterator = arrayList.iterator();
        block0: while (iterator.hasNext()) {
            e e2 = (e)iterator.next();
            object = arrayList2.iterator();
            while (object.hasNext()) {
                hdz hdz2 = (hdz)object.next();
                if (e2.ResourceType != hdz2.kaW.Type) continue;
                iterator.remove();
                object.remove();
                continue block0;
            }
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            object = (e)arrayList.get(i);
            int n2 = -1;
            lhu lhu2 = lhu.rnR;
            String string = lcy.qVE.esy();
            if (i < arrayList2.size()) {
                lhu2 = ((hdz)arrayList2.get((int)i)).kaW.atw();
                n2 = ((hdz)arrayList2.get((int)i)).kaW.Type;
                string = lcy.qVD.esy();
            }
            ((e)object).kni.e(lhu2);
            ((e)object).ResourceType = n2;
            ((e)object).kni.ResourceType = n2;
            ((e)object).knj.mV(string);
        }
    }

    private void ciV() {
        this.knb = lcn.emv();
        Collection<hdu> collection = this.cbP().kck.kyz.cfh();
        for (hdu hdu2 : collection) {
            if (!(hdu2 instanceof hdz)) continue;
            hdz hdz2 = (hdz)hdu2;
            if (!cug.vF((int)hdz2.ceB().Type)) continue;
            this.knb.add(hdz2);
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.layout();
        this.ciX();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kmT != null) {
            this.ciQ();
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        super.cce();
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        hdw hdw2 = (hdw)this.kmU.cvj();
        if (hdw2 != null) {
            hdz hdz2 = this.f(hdw2);
            this.k(hdz2);
        }
        super.ccc();
    }

    private void k(hdu hdu2) {
        if (hdu2 != null) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            this.ciO().a(hdu2, hdu2.kaW, linkedList);
            this.kLu.a(hdu2.kaW.atw(), linkedList);
            return;
        }
    }

    private hdz ciW() {
        hdw hdw2 = (hdw)this.kmU.getSelectedItem();
        if (hdw2 == null) {
            return null;
        }
        if (!this.kki.ad(hdw2)) {
            return null;
        }
        hdz hdz2 = this.f(hdw2);
        if (hdz2 == null) {
            return null;
        }
        return hdz2;
    }

    private final hdz f(hdw hdw2) {
        ler ler2 = lea.enW().acv(hdw2.Type);
        if (ler2 == null) {
            return null;
        }
        hdz hdz2 = (hdz)hdw2.a(null, ldv.rfe);
        brt brt2 = (brt)cug.fxg.get(hdw2.Type);
        if (brt2 != null) {
            hdz2.o(brt2);
        }
        return hdz2;
    }

    private void layout() {
        int n = this.getHeight();
        this.cbO().jXk.getClass();
        int n2 = n - 85;
        this.jGH.cC(this.getWidth(), n2);
        int n3 = this.jGH.cwt().cqd().cpJ().rmN;
        if (n3 < 450) {
            n3 = 450;
        }
        this.kmU.MS(n3);
    }

    private hdm ciO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.ciO().cbP();
    }

    private void f(hdz hdz2) {
        if (this.knd == null) {
            return;
        }
        for (e object2 : this.knc) {
            if (object2.ResourceType != hdz2.kaW.Type) continue;
            this.mS(lcy.raQ.esy());
            return;
        }
        int n = this.knd.ResourceType;
        if (n == -1) {
            lip lip2 = hdz2.cdY();
            float f2 = 0.0f;
            switch (this.knb.size()) {
                case 1: {
                    f2 = 100.0f;
                    break;
                }
                case 2: {
                    f2 = 1000.0f;
                    break;
                }
                default: {
                    return;
                }
            }
            ljd ljd2 = new ljd(f2);
            if (f2 > this.cbP().kck.kyz.cfq()) {
                this.mS(lcy.raP.a(ljd2).esy());
                return;
            }
            this.kmT = this.cbO().a(lcy.raM.a(lip2, ljd2).esy(), null, new hoz.a[]{jHL, jHM}, (Object)new a(hdz2), jHL, jHM, this.kmN);
        } else {
            lip lip3 = hdz2.cdY();
            lip lip4 = cug.uH((int)n);
            if (hdz2.kaW.Type == n) {
                return;
            }
            assert (lip3 != null);
            float f3 = 20.0f;
            ljd ljd3 = new ljd(f3);
            if (f3 > this.cbP().kck.kyz.cfq()) {
                this.mS(lcy.raP.a(ljd3).esy());
                return;
            }
            for (hdz hdz3 : this.knb) {
                if (hdz3.kaW.Type != n) continue;
                if (!hdz3.Uu()) break;
                this.mS(lcy.raO.esy());
                return;
            }
            this.kmT = this.cbO().a(lcy.raL.a(lip3, lip4, ljd3).esy(), null, new hoz.a[]{jHL, jHM}, (Object)new a(hdz2), jHL, jHM, this.kmN);
        }
    }

    private void j(hdu hdu2) {
        if (this.knd == null) {
            return;
        }
        int n = 0;
        int n2 = this.knd.ResourceType;
        int n3 = hdu2.kaW.Type;
        this.knd = null;
        if (n3 == n2) {
            return;
        }
        for (e e2 : this.knc) {
            if (e2.ResourceType != n3) continue;
            return;
        }
        if (n2 == -1) {
            n = this.knb.size() + 1;
            this.cbP().kck.l(this.kmI, n, n3);
        } else {
            this.cbP().kck.a(this.kmI, n, n2, n3);
        }
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private void ciQ() {
        assert (this.Initialized);
        assert (this.kmT != null);
        this.kLu.t(this.kmT);
        assert (this.kmT == null);
    }

    private void ciX() {
        this.kki.clear();
        Collection collection = cug.fxg.values();
        les les2 = lea.enW();
        hdw hdw2 = hdw.kbl;
        this.kki.d(hdw2, null, null);
        Object object = collection.iterator();
        while (object.hasNext()) {
            brt brt2 = (brt)object.next();
            ler ler2 = les2.acv(brt2.az());
            hdw hdw3 = hdw.LW(ler2.getType());
            this.kki.d(hdw3, hdw2, null);
        }
        this.kki.a(null, hdw.kbg, true);
        for (object = (hdv)this.kmU.kVC.P(null); object != null; object = ((hdv)object).cen()) {
            if (!this.kmU.kVC.O((hdw)object)) continue;
            this.kmU.a((hdw)object, true, false);
        }
        this.kmU.refresh();
    }

    private void mU(boolean bl) {
        this.kmU.cqn().a(bl, this.kmQ);
        this.jGH.cwt().cqd().cpI().a(bl, this.kmS);
        this.cbP().kck.kyz.cfa().a(bl, this.kne);
    }

    static /* synthetic */ List a(hgf hgf2) {
        return hgf2.knb;
    }

    static /* synthetic */ void a(hgf hgf2, hdu hdu2) {
        hgf2.k(hdu2);
    }

    static /* synthetic */ boolean b(hgf hgf2) {
        return hgf2.Initialized;
    }

    static /* synthetic */ hdz c(hgf hgf2) {
        return hgf2.ciW();
    }

    static /* synthetic */ void a(hgf hgf2, String string) {
        hgf2.mS(string);
    }

    static /* synthetic */ e a(hgf hgf2, e e2) {
        hgf2.knd = e2;
        return hgf2.knd;
    }

    static /* synthetic */ void a(hgf hgf2, hdz hdz2) {
        hgf2.f(hdz2);
    }

    static /* synthetic */ hnu d(hgf hgf2) {
        return hgf2.kmT;
    }

    static /* synthetic */ hnu a(hgf hgf2, hnu hnu2) {
        hgf2.kmT = hnu2;
        return hgf2.kmT;
    }

    static /* synthetic */ hoz.a ciY() {
        return jHL;
    }

    static /* synthetic */ void b(hgf hgf2, hdu hdu2) {
        hgf2.j(hdu2);
    }

    static /* synthetic */ void e(hgf hgf2) {
        hgf2.layout();
    }

    static /* synthetic */ void f(hgf hgf2) {
        hgf2.ciV();
    }

    static /* synthetic */ void g(hgf hgf2) {
        hgf2.ciU();
    }
}

