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
import java.util.LinkedList;

public class hge
extends hog {
    private static final lhf jGE = new lhf(0, 4);
    private static final int kmF = 450;
    private static final hoz.a jHL = new hoz.a(lcy.qUR);
    private static final hoz.a jHM = new hoz.a(lcy.qUS, true);
    private final ArrayList<hdu> kmG = new ArrayList();
    private final ArrayList<hdv> kmH = new ArrayList();
    private final ldv kmI;
    private final how kmk;
    private final hpx kmJ;
    private final hpa kmK;
    private final boolean kmL = true;
    private final lbn kmM = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hge.b(this.kmW)) {
                throw new AssertionError();
            }
            hdz hdz2 = hge.c(this.kmW);
            if (hdz2 == null) {
                return;
            }
            hge.a(this.kmW, (hdu)hdz2);
        }

        static {
            $assertionsDisabled = !hge.class.desiredAssertionStatus();
        }
    };
    private final lbn kmN = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hge.b(this.kmW)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hge.d(this.kmW) == null) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hge.d(this.kmW).csT();
            a a2 = (a)hoz2.ccw();
            this.kmW.cbO().jZL.ccS().yP(!hoz2.cuF());
            hge.a(this.kmW, null);
            hoz.a a3 = hoz2.coZ();
            if (a3 == hge.ciS()) {
                hge.b(this.kmW, a2.kmX);
            }
        }

        static {
            $assertionsDisabled = !hge.class.desiredAssertionStatus();
        }
    };
    private final lbn kmO = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hge.b(this.kmW)) {
                throw new AssertionError();
            }
            if (hge.e(this.kmW).isEmpty()) {
                Collection<hdu> collection = this.kmW.cbP().kci.cof().cfh();
                hge.e(this.kmW).clear();
                for (hdu hdu2 : collection) {
                    if (!(hdu2 instanceof hdz)) continue;
                    hge.e(this.kmW).add(hdu2);
                    hge.f(this.kmW).add(hdu2.kaW);
                }
                hge.g(this.kmW);
                hge.h(this.kmW);
            }
        }

        static {
            $assertionsDisabled = !hge.class.desiredAssertionStatus();
        }
    };
    private final lbn kmP = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hge.b(this.kmW)) {
                throw new AssertionError();
            }
            hge.a(this.kmW);
        }

        static {
            $assertionsDisabled = !hge.class.desiredAssertionStatus();
        }
    };
    private final lbn kmQ = new lbn(this){
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            hge.g(this.kmW);
        }
    };
    private final lbn kmR = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hge.b(this.kmW)) {
                throw new AssertionError();
            }
            hdz hdz2 = hge.c(this.kmW);
            if (hdz2 == null) {
                return;
            }
            if (!hge.a(this.kmW, hdz2)) {
                this.kmW.kLu.a(this.kmW.cbO().kIn.kEB);
                return;
            }
            hge.a(this.kmW, (hdu)hdz2);
        }

        static {
            $assertionsDisabled = !hge.class.desiredAssertionStatus();
        }
    };
    private final lbn kmS = new lbn(this){
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            hge.g(this.kmW);
        }
    };
    private final lbn kmr = new lbn(this){
        final /* synthetic */ hge kmW;
        {
            this.kmW = hge2;
        }

        public final void W() {
            hge.h(this.kmW);
            hge.a(this.kmW);
        }
    };
    private boolean Initialized;
    private hnu kmT;
    private final hqr jGH;
    private final hja kmU;
    private final c kmV;
    private final lij<hdw> kki = new lij();
    private hqm kkO;

    private static hog.a k(hdm hdm2) {
        return new hog.a(hdm2.jYx, lgg.rlI, lgg.rlI, lhf.rnv);
    }

    public hge(hdm hdm2, String string, lgg lgg2, lhf lhf2, ldv ldv2) {
        super((hnc)hdm2, "But component", lgg2, lhf2, hge.k(hdm2));
        assert (ldv2 != null);
        this.kmI = ldv2;
        int n = hge.jGE.rmN;
        int n2 = hge.jGE.H;
        hja.d d2 = new hja.d(hdm2.kKD, 16, hdm2.kIy, hdm2.kIy, hdm2.kIs, hdm2.kIy, hlu.kGU);
        this.kmV = new c(hdm2.kmY, hdm2.jGK, d2, hdm2.kJK);
        this.jGH = new hqr(this.kLu, (String)null, new lgg(n, 0), lhf.rnv, this.kmV.jGK);
        n2 += this.jGH.getHeight();
        n2 += hge.jGE.H;
        this.kmU = new hja(this.cbO(), (String)null, lgg.rlI, lhf.rnv, this.kmV.kmZ, this.kki);
        this.jGH.cwt().cqd().a(this.kmU);
        this.j(this.jGH);
        this.p(this.jGH);
        this.kmK = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf.rnv, hdm2.jXk.jOa);
        this.j(this.kmK);
        this.kmk = new how((hnc)hdm2, null, new lgg(0, 496), new lhf(lhf2.rmN - 1 - 2 * hge.jGE.rmN, 40), hdm2.kKk);
        this.j(this.kmk);
        this.kmJ = new hqy((hnc)hdm2, null, new lgg(338, 4), new lhf(128, 32), hpx.a.kXm, hdm2.kJK, lcy.qVA.esy());
        this.kmJ.cvC().a(true, this.kmM);
        this.kmJ.og(true);
        this.kmk.j(this.kmJ);
        n = 220;
        n2 = 8;
        hpe hpe2 = new hpe((hnc)hdm2, null, new lgg(n, n2 + 4), new lhf(55, 16), hdm2.kJd, lcy.qZL.esy());
        this.kmk.j(hpe2);
        this.kkO = new b(this, this.kLu, null, new lgg(n + 58, n2), new lhf(54, 24), hdm2.kKw, 1.0, 500.0, 1.0, 0, 1.0);
        this.kmk.j(this.kkO);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        if (this.kmG.isEmpty()) {
            Collection<hdu> collection = this.cbP().kci.cof().cfh();
            this.kmG.clear();
            for (hdu hdu2 : collection) {
                if (!(hdu2 instanceof hdz)) continue;
                this.kmG.add(hdu2);
                this.kmH.add(hdu2.kaW);
            }
        }
        this.layout();
        this.ciR();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kmT != null) {
            this.ciQ();
        }
        this.mU(false);
        super.FG();
        this.kmG.clear();
        this.kmH.clear();
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
        if (hdw2 == null) {
            return;
        }
        hdz hdz2 = this.e(hdw2);
        if (hdz2 != null) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            this.ciO().a((hdu)hdz2, hdz2.kaW, linkedList);
            this.kLu.a(hdz2.kaW.atw(), linkedList);
            return;
        }
        super.ccc();
    }

    private hdz ciN() {
        hdw hdw2 = (hdw)this.kmU.getSelectedItem();
        if (hdw2 == null) {
            return null;
        }
        if (!this.kki.ad(hdw2)) {
            return null;
        }
        hdz hdz2 = this.e(hdw2);
        if (hdz2 == null) {
            return null;
        }
        return hdz2;
    }

    private final hdz e(hdw hdw2) {
        for (hdu hdu2 : this.cbP().kci.cof().cfh()) {
            if (!(hdu2 instanceof hdz) || !hdu2.kaW.c(hdw2)) continue;
            return (hdz)hdu2;
        }
        return null;
    }

    private void layout() {
        int n = this.getHeight() - hge.jGE.H * 2 - this.kmJ.getHeight();
        this.jGH.cC(this.getWidth(), n);
        int n2 = this.jGH.cwt().cqd().cpJ().rmN;
        if (n2 < 450) {
            n2 = 450;
        }
        this.kmU.MS(n2);
    }

    private hdm ciO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.ciO().cbP();
    }

    private void i(hdu hdu2) {
        if (this.cbO().jZL.ccS().getValue()) {
            lip lip2 = hdu2.cdY();
            float f2 = hdu2.Bb();
            int n = 1;
            n = (int)this.kkO.cqg().cpZ();
            int n2 = hdu2.kaW.Type;
            int n3 = cug.uF((int)n2) * n;
            ljd ljd2 = new ljd(f2 *= (float)n);
            lja lja2 = new lja(n3);
            this.kmT = this.cbO().a(lcy.raJ.a(lja2, lip2, ljd2).esy(), null, new hoz.a[]{jHL, jHM}, lcy.qVb.esy(), !this.cbO().jZL.ccS().getValue(), (Object)new a(hdu2), jHL, jHM, this.kmN);
        } else {
            this.j(hdu2);
        }
    }

    private void j(hdu hdu2) {
        int n = 1;
        n = (int)this.kkO.cqg().cpZ();
        this.cbP().kck.j(this.kmI, hdu2.dbx, n);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private void ciP() {
        hdz hdz2 = this.ciN();
        this.kmJ.og(hdz2 == null || !this.e(hdz2));
    }

    private void ciQ() {
        assert (this.Initialized);
        assert (this.kmT != null);
        this.kLu.t(this.kmT);
        assert (this.kmT == null);
    }

    private boolean e(hdz hdz2) {
        int n;
        float f2 = hdz2.Bb();
        return f2 * (float)(n = (int)this.kkO.cqg().cpZ()) <= this.cbP().kck.kyz.cfq();
    }

    private void ciR() {
        this.kki.clear();
        int[] nArray = new int[]{cug.fiJ, cug.fiy, cug.fit, cug.fiw, cug.fiv, cug.fix, cug.fiA, cug.fiH, cug.fiI, cug.fiu, cug.fiB, cug.fiz, cug.fjw, cug.fjl, cug.fjN, cug.fjP, cug.fkf, cug.fmO, cug.fkk, cug.fjZ, cug.fpT, cug.fke, cug.fke, cug.fnn, cug.fpP, cug.fiM, cug.fqt, cug.fpU};
        les les2 = lea.enW();
        int n = 0;
        for (int i = 0; i < nArray.length; ++i) {
            ler ler2 = les2.acv(nArray[i]);
            hdw hdw2 = hdw.LW(ler2.getType());
            n += this.a(this.kki, les2, hdw2, null);
        }
        this.kki.a(null, hdw.kbg, true);
        this.kmU.kwH.notifyChanged();
        hdw hdw3 = this.kmU.kVC.P(null);
        if (hdw3 != null && this.kmU.kVC.O(hdw3) && this.kmU.kVC.P(hdw3) != null) {
            this.kmU.a(hdw3, true, false);
        }
    }

    private int a(lij<hdw> lij2, les les2, hdw hdw2, hdw hdw3) {
        if (hdw2.cem() == null) {
            if (this.kmH.isEmpty()) {
                // empty if block
            }
            if (!this.kmH.contains(hdw2)) {
                return 0;
            }
            lij2.d(hdw2, hdw3, null);
            return 1;
        }
        lij2.d(hdw2, hdw3, null);
        int n = 0;
        for (hdw hdw4 = (hdw)hdw2.cem(); hdw4 != null; hdw4 = (hdw)hdw4.cen()) {
            n += this.a(lij2, les2, hdw4, hdw2);
        }
        if (n == 0) {
            lij2.af(hdw2);
        }
        return n;
    }

    private void mU(boolean bl) {
        this.cbP().kci.cof().cfa().a(bl, this.kmO);
        this.kmU.cqn().a(bl, this.kmQ);
        this.kmU.cvi().a(bl, this.kmR);
        this.kmU.jHT.crt().a(bl, this.kmP);
        this.jGH.cwt().cqd().cpI().a(bl, this.kmS);
        this.cbP().kck.kyz.cfa().a(bl, this.kmr);
    }

    static /* synthetic */ void a(hge hge2) {
        hge2.ciP();
    }

    static /* synthetic */ boolean b(hge hge2) {
        return hge2.Initialized;
    }

    static /* synthetic */ hdz c(hge hge2) {
        return hge2.ciN();
    }

    static /* synthetic */ void a(hge hge2, hdu hdu2) {
        hge2.i(hdu2);
    }

    static /* synthetic */ hnu d(hge hge2) {
        return hge2.kmT;
    }

    static /* synthetic */ hnu a(hge hge2, hnu hnu2) {
        hge2.kmT = hnu2;
        return hge2.kmT;
    }

    static /* synthetic */ hoz.a ciS() {
        return jHL;
    }

    static /* synthetic */ void b(hge hge2, hdu hdu2) {
        hge2.j(hdu2);
    }

    static /* synthetic */ ArrayList e(hge hge2) {
        return hge2.kmG;
    }

    static /* synthetic */ ArrayList f(hge hge2) {
        return hge2.kmH;
    }

    static /* synthetic */ void g(hge hge2) {
        hge2.layout();
    }

    static /* synthetic */ void h(hge hge2) {
        hge2.ciR();
    }

    static /* synthetic */ boolean a(hge hge2, hdz hdz2) {
        return hge2.e(hdz2);
    }
}

