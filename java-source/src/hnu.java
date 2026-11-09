/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class hnu
extends hpv {
    private final f kPH;
    public final lhf kPI;
    public final lhf kPJ;
    public final hnz kPK;
    private final ldl kPL = new ldl();
    protected final lbn kgj;
    private final lbn kPM = new lbn(this){
        final /* synthetic */ hnu kPR;
        {
            this.kPR = hnu2;
        }

        public final void W() {
            hnu.b(this.kPR);
        }
    };
    private final lbn kPN = new lbn(this){
        final /* synthetic */ hnu kPR;
        {
            this.kPR = hnu2;
        }

        public final void W() {
            this.kPR.csY();
        }
    };
    private boolean Initialized;
    private int kOa;
    private boolean kPO;
    private hms kPP;
    private int kPQ;

    public hnu(hnc hnc2, String string, lgg lgg2, lhf lhf2, f f2, b ... bArray) {
        this(hnc2, string, lgg2, lhf2, f2, true, new ArrayList<b>(Arrays.asList(bArray)));
    }

    private hnu(hnc hnc2, String string, lgg lgg2, lhf lhf2, f f2, boolean bl, List<b> list) {
        this(hnc2, string, lgg2, lhf2, f2, list);
        assert (lda.yk(bl));
        assert (list.size() == 0);
    }

    public hnu(hnc hnc2, String string, lgg lgg2, lhf lhf2, f f2, List<b> list) {
        super(hnc2, string, lgg2, lhf2);
        lhf lhf3 = null;
        lhf lhf4 = null;
        lbn lbn2 = null;
        hnz hnz2 = null;
        Iterator<b> iterator = list.iterator();
        while (iterator.hasNext()) {
            b b2 = iterator.next();
            if (b2 instanceof e) {
                e e2 = (e)b2;
                lhf3 = e2.kPI;
                lhf4 = e2.kPJ;
            } else if (b2 instanceof d) {
                lbn2 = ((d)b2).keI;
            } else {
                if (!(b2 instanceof c)) continue;
                hnz2 = ((c)b2).kPK;
            }
            iterator.remove();
        }
        if (lhf3 == null) {
            lhf3 = new lhf(0, 0);
        }
        assert (f2 != null);
        assert (lhf3 == null || lhf2.rmN >= lhf3.rmN);
        assert (lhf3 == null || lhf2.H >= lhf3.H);
        assert (lhf4 == null || lhf2.rmN <= lhf4.rmN);
        assert (lhf4 == null || lhf2.H <= lhf4.H);
        this.kPH = f2;
        this.kPI = lhf3;
        this.kPJ = lhf4;
        this.kgj = lbn2;
        if (hnz2 == null) {
            hnz2 = new hnz(hnc2, null, lgg.rlI, lhf2, f2.kPT);
        }
        this.kPK = hnz2;
        this.j(this.kPK);
        this.kPK.a(new a(this));
    }

    public final void csQ() {
        this.kgj.W();
    }

    public lbl<lbn> csR() {
        return this.kPL;
    }

    public boolean csS() {
        return this.kPK.ctm().csS();
    }

    public final void w(hms hms2) {
        assert (!this.Initialized);
        assert (hms2 != null);
        assert (this.kPP == null);
        this.kPP = hms2;
    }

    public final hms csT() {
        return this.kPP;
    }

    public final int getClientX() {
        return this.kPH.kPT.ctn();
    }

    public final int getClientY() {
        return this.kPH.kPT.cto();
    }

    public final lgs csU() {
        int n = this.kPH.kPT.ctn();
        int n2 = this.kPH.kPT.cto();
        int n3 = this.kPH.kPT.ctp();
        int n4 = this.kPH.kPT.ctq();
        int n5 = Math.max(0, this.getWidth() - (n + n3));
        int n6 = Math.max(0, this.getHeight() - (n2 + n4));
        return new lgs(n, n2, n5, n6);
    }

    public final lgg csV() {
        int n = this.kPH.kPT.ctn();
        int n2 = this.kPH.kPT.cto();
        return new lgg(n, n2);
    }

    public final lhf csW() {
        int n = this.kPH.kPT.ctn();
        int n2 = this.kPH.kPT.cto();
        int n3 = this.kPH.kPT.ctp();
        int n4 = this.kPH.kPT.ctq();
        return new lhf(this.getWidth() - (n + n3), this.getHeight() - (n2 + n4));
    }

    public final f csX() {
        return this.kPH;
    }

    public final void csY() {
        if (this.kPQ > 0) {
            return;
        }
        ++this.kPQ;
        lhf lhf2 = this.kPP.cqv();
        lhf2 = lhf2.p(this.kPH.kPT.ctr());
        this.d(lhf2);
        --this.kPQ;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        assert (this.kPP != null);
        super.FF();
        this.Initialized = true;
        this.kPP.j(this.csU());
        this.j(this.kPP);
        this.csY();
        this.nb(true);
        this.chf();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.chf();
    }

    @Override
    protected lhf b(lhf lhf2) {
        if (this.kPI != null) {
            lhf2 = lhf.b(lhf2, this.kPI);
        }
        lhf2 = lhf.b(lhf2, this.kPH.kPT.ctu());
        if (this.kPJ != null) {
            lhf2 = lhf.a(lhf2, this.kPJ);
        }
        lhf2 = lhf.a(lhf2, this.kLu.kND.cqv());
        lhf lhf3 = this.kPH.kPT.ctr();
        lhf2 = lhf2.q(lhf3);
        lhf2 = this.kPP.b(lhf2);
        lhf2 = lhf2.p(lhf3);
        return lhf2;
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        if (!this.Initialized) {
            return;
        }
        if (this.isFocusOwner()) {
            this.kPP.cqV();
        }
    }

    protected void csZ() {
    }

    protected void cfK() {
        lgs lgs2 = this.cqE();
        this.kPK.j(lgs2);
        lgs2 = this.csU();
        lgs2 = this.kPK.a((hms)this, lgs2);
        this.kPP.j(lgs2);
    }

    protected void cfM() {
    }

    @Override
    protected boolean co(int n, int n2) {
        if (!super.co(n, n2)) {
            return false;
        }
        for (hms hms2 : this.crn()) {
            int n3;
            int n4;
            if (!hms2.contains(n4 = hms2.a(this, ldb.reo, n), n3 = hms2.a(this, ldb.rep, n2))) continue;
            return true;
        }
        return false;
    }

    private void chf() {
        if (this.kOa > 0) {
            this.kPO = true;
            return;
        }
        ++this.kOa;
        this.cfK();
        --this.kOa;
        if (this.kOa == 0 && this.kPO) {
            this.kPO = false;
            this.chf();
        }
    }

    private void cta() {
        if (this.kPQ < 10) {
            ++this.kPQ;
            this.d(this.kPK.cqv());
            --this.kPQ;
        } else assert (false);
    }

    private static final lgs a(lgs lgs2, lgg lgg2, lhf lhf2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        assert (!bl || !bl2);
        assert (!bl3 || !bl4);
        int n2 = lgs2.cf;
        int n3 = lgs2.cg;
        int n4 = lgs2.cf + lgs2.rmN;
        int n5 = lgs2.cg + lgs2.H;
        if (bl) {
            n = -lgg2.cg;
            if ((n3 -= n) < 0) {
                n3 = 0;
            }
        } else if (bl2 && (n5 += (n = lgg2.cg)) > lhf2.H) {
            n5 = lhf2.H;
        }
        if (bl4) {
            n = -lgg2.cf;
            if ((n2 -= n) < 0) {
                n2 = 0;
            }
        } else if (bl3 && (n4 += (n = lgg2.cf)) > lhf2.rmN) {
            n4 = lhf2.rmN;
        }
        return new lgs(n2, n3, n4 - n2, n5 - n3);
    }

    private static final lgs a(lgs lgs2, lhf lhf2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        assert (!bl || !bl2);
        assert (!bl3 || !bl4);
        int n = lgs2.cf;
        int n2 = lgs2.cg;
        int n3 = lgs2.cf + lgs2.rmN;
        int n4 = lgs2.cg + lgs2.H;
        if (bl) {
            n2 = n4 - lhf2.H;
        } else if (bl2) {
            n4 = n2 + lhf2.H;
        }
        if (bl4) {
            n = n3 - lhf2.rmN;
        } else if (bl3) {
            n3 = n + lhf2.rmN;
        }
        lgs lgs3 = new lgs(n, n2, n3 - n, n4 - n2);
        assert (lgs3.rmN == lhf2.rmN);
        assert (lgs3.H == lhf2.H);
        return lgs3;
    }

    private void nb(boolean bl) {
        this.kPK.cqn().a(bl, this.kPM);
        this.kPP.cqn().a(bl, this.kPN);
    }

    static /* synthetic */ ldl a(hnu hnu2) {
        return hnu2.kPL;
    }

    static /* synthetic */ lgs b(lgs lgs2, lgg lgg2, lhf lhf2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return hnu.a(lgs2, lgg2, lhf2, bl, bl2, bl3, bl4);
    }

    static /* synthetic */ lgs b(lgs lgs2, lhf lhf2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return hnu.a(lgs2, lhf2, bl, bl2, bl3, bl4);
    }

    static /* synthetic */ void b(hnu hnu2) {
        hnu2.cta();
    }
}

