/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.ArrayList;
import java.util.Collection;

public class hgm
extends how
implements hbw,
hma,
lbr {
    private static final int kob = 2000;
    private static final lck<hdz, lgg> koc = new lck(2000);
    public final hee kdT;
    private final hhy kod;
    private final lib koe;
    private final double kof = 1.0;
    private final lbn kog = new lbn(this){
        final /* synthetic */ hgm kon;
        {
            this.kon = hgm2;
        }

        public final void W() {
            if (!hgm.a(this.kon)) {
                return;
            }
            if (this.kon.cbO().jZG.cpS()) {
                this.kon.kLu.kAz.b(hgm.b(this.kon));
                return;
            }
            this.kon.cjw();
        }
    };
    private final lbp koh = new lbp(this){
        final /* synthetic */ hgm kon;
        {
            this.kon = hgm2;
        }

        public final boolean caU() {
            hgm.c(this.kon);
            return true;
        }
    };
    private final lbn koi = new lbn(this){
        final /* synthetic */ hgm kon;
        {
            this.kon = hgm2;
        }

        public final void W() {
            hgm.c(this.kon);
        }
    };
    private boolean Initialized;
    private boolean koj;
    private hee kok;
    private hgy kol;
    private lgg kom;

    public hgm(hdm hdm2, String string, lgg lgg2, lhf lhf2, hpw.a a2, hee hee2, lgg lgg3) {
        super((hnc)hdm2, string, lgg2, lhf2, a2);
        assert (hee2 != null);
        this.kdT = hee2;
        this.koe = this.cjy();
        this.kod = this.p(lgg3);
        this.koj = false;
    }

    public final hee cjv() {
        return this.kdT;
    }

    public final boolean a(hdz hdz2, lgg lgg2) {
        assert (hdz2 != null);
        assert (lgg2 != null);
        return this.b(hdz2, lgg2);
    }

    public final boolean a(hgy hgy2, boolean bl, boolean bl2) {
        return this.a(hgy2, bl, bl2, -1);
    }

    @Override
    public final void a(hdz hdz2, int n, int n2, lgg lgg2) {
        this.a(hdz2, n, n2, lgg2, -1);
    }

    @Override
    public final boolean a(lfu lfu2) {
        assert (this.Initialized);
        return this.d(lfu2);
    }

    @Override
    public boolean b(hms hms2) {
        assert (this.Initialized);
        if (hms2 instanceof hgy) {
            return true;
        }
        return hms2 instanceof hhn;
    }

    @Override
    public void cge() {
    }

    @Override
    public void cgf() {
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        if (this.kod != null) {
            this.cqt().j(this.kod);
            hen hen2 = (hen)this.cqt();
            hnz.d d2 = hen2.cfF().keL.kKX.kPT;
            lhf lhf2 = new lhf(d2.ctn(), d2.cto());
            this.kod.a(lhf2, 0.0f);
        }
        this.nv(false);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void a(boolean bl, hms hms2, int n) {
        super.a(bl, hms2, n);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        this.kol = null;
        lgg lgg2 = this.cqu();
        hgy hgy2 = this.a(lgg2, hgy.class);
        if (this.isFocusOwner()) {
            if (hgy2 == this.crp()) {
                this.kol = hgy2;
                this.kom = lgg2;
            }
        } else {
            this.cqV();
        }
        super.cbM();
        this.p(hgy2);
        if (this.kdT.ceW() && this.koe.isStarted()) {
            this.koe.stop();
        }
    }

    @Override
    protected void cbv() {
        assert (this.Initialized);
        if (this.kdT.ceW() && !this.kLu.csd() && this.kol != null && this.kom.T(this.cqu()) && this.kol.ceB().auU()) {
            this.koe.ee(1.0);
        }
        super.cbv();
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        if (!this.isFocusOwner()) {
            this.p((hms)null);
        }
        if (this.kdT.ceW() && this.koe.isStarted()) {
            this.koe.stop();
        }
    }

    protected boolean d(lfu lfu2) {
        return this.l(lfu2);
    }

    protected boolean l(lfu lfu2) {
        Collection<hgy> collection = lin.a(this.crn(), hgy.class);
        for (hgy hgy2 : collection) {
            Object object;
            if (lfu2.eqA() && this.a((hms)hgy2, (lgs)(object = hgy2.cjW()), this.cqE(), 0.0f)) {
                lfn.b(4, "SFComponentInventory", "onPersistItemPositions(): moveChildWithinRectangle returned true");
            }
            if (hgy2.Ow()) {
                hgy2.cqs();
            }
            object = hgy2.cqw();
            koc.put(hgy2.cjV(), (lgg)object);
            String string = "item_";
            object = lfu2.a(string, object, lgg.Persistor);
            hgy2.z((lgg)object);
            if (!lfu2.eqA()) continue;
            lgs lgs2 = hgy2.cjW();
            this.a((hms)hgy2, lgs2, this.cqE(), 0.0f);
        }
        return lfu2.eqA();
    }

    protected boolean b(hdz hdz2, lgg lgg2) {
        assert (hdz2 != null);
        assert (lgg2 != null);
        hgy hgy2 = this.i(hdz2);
        if (hgy2 == null) {
            return false;
        }
        hgy2.z(lgg2);
        this.a((hms)hgy2, 0.0f);
        return true;
    }

    protected boolean a(hgy hgy2, boolean bl, boolean bl2, int n) {
        hmt hmt2 = this.cbO().jZG.cpN();
        if (bl2 && !bl) {
            hgy2.a(this, this.cbO().cqu(), lcy.qSt, true);
            return false;
        }
        if (hmt2 == this) {
            if (!bl) {
                hgy2.c(this);
                this.a((hgq)hgy2);
                if (n != hgy2.cjV().AR()) {
                    this.cbP().a(hgy2.cjV(), this, hgy2.cqw(), n);
                }
            }
        } else if (hmt2 instanceof hgm) {
            hee hee2 = ((hgm)hmt2).kdT;
            if (!hgy2.cjV().ceB().a(hee2, this.kdT, false)) {
                return false;
            }
            if (!bl) {
                hgy2.c(this);
                this.cbP().a(hgy2.cjV(), this, hgy2.cqw(), n);
                this.kLu.kAz.b(this.kog);
            }
        } else {
            if (hmt2 instanceof hcc) {
                return false;
            }
            assert (false);
            return false;
        }
        return true;
    }

    private boolean a(hgq hgq2) {
        assert (this.Initialized);
        lgs lgs2 = hgq2.kaW.awT();
        lgs lgs3 = hgq2.kaW.cel();
        lgs3.cf -= lgs2.cf;
        lgs3.cg -= lgs2.cg;
        lgs3 = this.a((hms)hgq2, lgs3);
        lhf lhf2 = this.cqE().y(lgs3);
        if (lhf2.rmN == 0 && lhf2.H == 0) {
            return false;
        }
        hgq2.a(lhf2, (float)this.kLu.crO());
        return true;
    }

    protected lgg g(hdz hdz2) {
        lgg lgg2 = (lgg)koc.get(hdz2);
        if (lgg2 != null) {
            return lgg2;
        }
        lhf lhf2 = hdz2.ceB().atw().kLY;
        return new lgg((int)(Math.random() * (double)(this.getWidth() - lhf2.rmN)), (int)(Math.random() * (double)(this.getHeight() - lhf2.H)));
    }

    protected void cjw() {
        this.nv(this.koj);
        this.koj = true;
        if (this.cbO().jZG.cpS() && this.cbO().jZG.cpN() == this) {
            assert (false);
            this.cbO().jZG.cpK();
        }
    }

    protected Collection<hdu> cfl() {
        return this.kdT.cfh();
    }

    protected void a(hdz hdz2, int n, int n2, lgg lgg2, int n3) {
        this.cbP().a(hdz2, n, this, n2, lgg2, n3);
    }

    protected hgy h(hdz hdz2) {
        lgg lgg2 = this.g(hdz2);
        hgy hgy2 = new hgy(this.cbO(), null, lgg2, null, hdz2, hdz2.ceB(), false, true, true, false);
        this.j(hgy2);
        return hgy2;
    }

    protected void a(hgy hgy2) {
        hgy2.remove();
    }

    protected final hgy i(hdz hdz2) {
        assert (hdz2 != null);
        for (hgy hgy2 : lin.a(this.crn(), hgy.class)) {
            if (!hgy2.cjV().b(hdz2)) continue;
            return hgy2;
        }
        return null;
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    protected void nv(boolean bl) {
        assert (this.Initialized);
        ArrayList<hgy> arrayList = new ArrayList<hgy>(lin.a(this.crn(), hgy.class));
        for (hdz object : lin.a(this.cfl(), hdz.class)) {
            if (!object.isConstructed()) continue;
            hgy hgy2 = null;
            for (int i = 0; i < arrayList.size(); ++i) {
                hgy hgy3 = (hgy)arrayList.get(i);
                if (hgy3 == null || !object.b(hgy3.cjV())) continue;
                hgy2 = hgy3;
                hgy3 = null;
                arrayList.set(i, null);
                break;
            }
            if (hgy2 != null) continue;
            hgy hgy4 = this.h(object);
            if (bl) {
                this.cbO().jXk.getClass();
                this.kLu.c(hgy4, 3);
            }
            this.a((hms)hgy4, bl ? (float)this.kLu.crO() : 0.0f);
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            hgy hgy5 = (hgy)arrayList.get(i);
            if (hgy5 == null) continue;
            this.a(hgy5);
            arrayList.set(i, null);
        }
        if (this.kod != null) {
            this.kod.M(0.0f, this.kdT.cfj());
            this.kod.cR(this.kdT.cfi());
            this.kod.nI(this.kdT.cfi() > this.kdT.cfj());
        }
    }

    private void cjx() {
        if (this.kLu.csc()) {
            return;
        }
        hms hms2 = this.crp();
        if (hms2 instanceof hgy) {
            hgy hgy2 = (hgy)hms2;
            hgy2.cjX();
        }
    }

    private lib cjy() {
        if (!this.kdT.ceW()) {
            return null;
        }
        return new lib(this.cbP().kNg, false);
    }

    private hhy p(lgg lgg2) {
        if (lgg2 == null) {
            return null;
        }
        hhy hhy2 = new hhy(this.cbO(), (String)null, lgg2, this.cbO().jXk.jPK, this.cbO().jXs, 0.0f, 0.0f, 0.0f, lcy.qUQ);
        return hhy2;
    }

    private void mU(boolean bl) {
        this.kdT.cfa().a(bl, this.kog);
        if (this.kdT.ceW()) {
            this.a(bl, this.koh, 8, jpn.nLm);
            this.koe.esg().a(bl, this.koi);
        }
    }

    static /* synthetic */ boolean a(hgm hgm2) {
        return hgm2.Initialized;
    }

    static /* synthetic */ lbn b(hgm hgm2) {
        return hgm2.kog;
    }

    static /* synthetic */ void c(hgm hgm2) {
        hgm2.cjx();
    }
}

