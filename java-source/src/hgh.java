/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class hgh
extends hou {
    private static final lhf jGE = new lhf(0, 4);
    private static final int kmF = 446;
    private final hqr jGH;
    private final hix knG;
    private final a knH;
    private final lij<bpj> kki = new lij();
    private final how kmk;
    private final hpx knI;
    private final hpa kmK;
    private final lbn knJ = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgh.a(this.knP)) {
                throw new AssertionError();
            }
            Object object = (hii)hgh.b(this.knP).csT();
            hii.a a2 = ((hii)object).cmj();
            boolean bl = a2 != null && a2 == hii.a.kvq;
            hgh.c(this.knP);
            if (bl) {
                object = (bpj)hgh.d(this.knP).getSelectedItem();
                if (object == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "observeEvent() : HM!");
                    return;
                }
                this.knP.cbP().kci.qY(((bpj)object).getGUID());
            }
        }

        static {
            $assertionsDisabled = !hgh.class.desiredAssertionStatus();
        }
    };
    private final lbn knK = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgh.a(this.knP)) {
                throw new AssertionError();
            }
            hgh.a(this.knP, false);
            hgh.a(this.knP, null);
        }

        static {
            $assertionsDisabled = !hgh.class.desiredAssertionStatus();
        }
    };
    private final lbn knL = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgh.a(this.knP)) {
                throw new AssertionError();
            }
            hgh.e(this.knP);
        }

        static {
            $assertionsDisabled = !hgh.class.desiredAssertionStatus();
        }
    };
    private final lbn knM = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgh.a(this.knP)) {
                throw new AssertionError();
            }
            hgh.f(this.knP);
            hgh.g(this.knP);
        }

        static {
            $assertionsDisabled = !hgh.class.desiredAssertionStatus();
        }
    };
    private final lbn kmP = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgh.a(this.knP)) {
                throw new AssertionError();
            }
            hgh.h(this.knP);
        }

        static {
            $assertionsDisabled = !hgh.class.desiredAssertionStatus();
        }
    };
    private final lbn kmQ = new lbn(this){
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            hgh.g(this.knP);
        }
    };
    private final lbn kmR = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgh.a(this.knP)) {
                throw new AssertionError();
            }
            hgh.e(this.knP);
        }

        static {
            $assertionsDisabled = !hgh.class.desiredAssertionStatus();
        }
    };
    private final lbn kmS = new lbn(this){
        final /* synthetic */ hgh knP;
        {
            this.knP = hgh2;
        }

        public final void W() {
            hgh.g(this.knP);
        }
    };
    private boolean Initialized;
    private Map<Integer, List<bpj>> knN;
    private hnu knO;

    public hgh(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2, new lhf(1, 3), lgg.rlI);
        this.a(ldb.reo, 0, 462);
        this.a(ldb.rep, 0, 300);
        this.a(ldb.rep, 1, hdm2.jXk.jOa.kLY.H);
        hdm2.jXk.getClass();
        this.a(ldb.rep, 2, 40);
        int n = hgh.jGE.rmN;
        int n2 = hgh.jGE.H;
        hix.d d2 = new hix.d(hdm2.kKD, 16, hdm2.kIy, hdm2.kIy, hdm2.kIs, hdm2.kIy, hlu.kGX, hdm2.kIn.kEE, hdm2.kIA);
        this.knH = new a(hdm2.kmY, hdm2.jGK, d2, hdm2.kJK);
        this.jGH = new hqr(this.kLu, (String)null, new lgg(n, n2), lhf.rnv, this.knH.jGK);
        n2 += this.jGH.getHeight();
        n2 += hgh.jGE.H;
        this.knG = new hix(hdm2, (String)null, lgg.rlI, lhf.rnv, this.knH.knQ, this.kki);
        this.jGH.cwt().cqd().a(this.knG);
        this.d(0, 0, this.jGH);
        this.p(this.jGH);
        this.kmK = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf.rnv, hdm2.jXk.jOa);
        this.d(1, 0, this.kmK);
        this.kmk = new hog((hnc)hdm2, (String)null, lgg.rlI, lhf.rnv, hdm2.krh);
        this.d(2, 0, this.kmk);
        this.knI = new hqy((hnc)hdm2, null, new lgg(338, 4), new lhf(128, 32), hpx.a.kXm, hdm2.kJK, lcy.qVB.esy());
        this.knI.cvC().a(true, this.knL);
        this.kmk.j(this.knI);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.ccg();
        this.s();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.knO != null) {
            this.cjr();
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        bpj bpj2 = (bpj)this.knG.cvj();
        if (bpj2 == null) {
            super.ccc();
            return;
        }
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        linkedList.add(new hnt(this.cbO().jGV, bpj2.att().esy()));
        this.kLu.a(null, linkedList);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void cjo() {
        bpj bpj2 = (bpj)this.knG.getSelectedItem();
        if (bpj2 == null) {
            return;
        }
        this.b(bpj2);
    }

    private void b(bpj bpj2) {
        assert (this.knO == null);
        if (bpj2.atv() == null) {
            return;
        }
        if (bpj2.Al() == null) {
            return;
        }
        hii hii2 = new hii(this.cbO(), (String)null, lgg.rlI, bpj2);
        hnu.f f2 = this.cbO().kKL;
        lhf lhf2 = hii2.cqv().p(f2.kPT.ctr());
        lgg lgg2 = this.kLu.kND.cqE().l(lhf2);
        this.knO = new hnu(this.kLu, (String)null, lgg2, lhf2, f2, new hnu.b[0]);
        this.knO.w(hii2);
        this.nu(true);
        this.kLu.a("Prompt", (hms)this.knO);
        this.knO.cqV();
    }

    private void nu(boolean bl) {
        this.knO.cql().a(bl, this.knK);
        this.cjp().cmk().a(bl, this.knJ);
    }

    private hii cjp() {
        return (hii)this.knO.csT();
    }

    private void cjq() {
        bpj bpj2 = (bpj)this.knG.getSelectedItem();
        this.knI.og(bpj2 == null);
    }

    private boolean ccg() {
        int n = this.getHeight() - hgh.jGE.H * 2 - this.knI.getHeight();
        this.jGH.cC(this.getWidth(), n);
        int n2 = this.jGH.cwt().cqd().cpJ().rmN;
        if (n2 < 446) {
            n2 = 446;
        }
        this.knG.MS(n2);
        return true;
    }

    private void cjr() {
        assert (this.Initialized);
        assert (this.knO != null);
        this.kLu.t(this.knO);
        assert (this.knO == null);
    }

    private void cjs() {
        this.knN = lcn.emG();
        List<bpj> list = this.cbP().kci.coh().wr();
        for (bpj bpj2 : list) {
            List<bpj> list2 = this.knN.get(bpj2.atx());
            if (list2 == null) {
                list2 = lcn.emv();
                this.knN.put(bpj2.atx(), list2);
            }
            list2.add(bpj2);
        }
    }

    private void s() {
        this.cjs();
        this.kki.clear();
        for (Map.Entry<Integer, List<bpj>> entry : this.knN.entrySet()) {
            List<bpj> list = entry.getValue();
            int n = entry.getKey();
            lgw lgw2 = (lgw)lea.enW().acv(n);
            if (lgw2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "refreshSkillTree() : Resource is null for AvatarResourceType = " + n);
                continue;
            }
            String string = "gui/quest_tab/questtab_heading_" + jry.tu(lgw2.atw().Name) + ".dds";
            bpj bpj2 = new bpj();
            bpj2.a(lgw2.awO());
            bpj2.b(new ljg("Faction: " + lgw2.awO().esy()));
            bpj2.a(new lhu(128, 32, string));
            this.kki.d(bpj2, null, null);
            for (bpj bpj3 : list) {
                this.kki.d(bpj3, bpj2, null);
            }
        }
        this.kki.a(null, bpj.dzB, true);
        this.knG.kwH.notifyChanged();
        Object object = this.knG.kVC.P(null);
        while (object != null) {
            if (this.knG.kVC.O(object)) {
                this.knG.a(object, true, false);
            }
            object = (bpj)this.knG.kVC.Q(object);
        }
        this.knG.refresh();
    }

    private void mU(boolean bl) {
        this.cbP().kci.coh().cov().a(bl, this.knM);
        this.knG.cqn().a(bl, this.kmQ);
        this.knG.cvi().a(bl, this.kmR);
        this.knG.jHT.crt().a(bl, this.kmP);
        this.jGH.cwt().cqd().cpI().a(bl, this.kmS);
    }

    static /* synthetic */ boolean a(hgh hgh2) {
        return hgh2.Initialized;
    }

    static /* synthetic */ hnu b(hgh hgh2) {
        return hgh2.knO;
    }

    static /* synthetic */ void c(hgh hgh2) {
        hgh2.cjr();
    }

    static /* synthetic */ hix d(hgh hgh2) {
        return hgh2.knG;
    }

    static /* synthetic */ void a(hgh hgh2, boolean bl) {
        hgh2.nu(bl);
    }

    static /* synthetic */ hnu a(hgh hgh2, hnu hnu2) {
        hgh2.knO = hnu2;
        return hgh2.knO;
    }

    static /* synthetic */ void e(hgh hgh2) {
        hgh2.cjo();
    }

    static /* synthetic */ void f(hgh hgh2) {
        hgh2.s();
    }

    static /* synthetic */ boolean g(hgh hgh2) {
        return hgh2.ccg();
    }

    static /* synthetic */ void h(hgh hgh2) {
        hgh2.cjq();
    }
}

