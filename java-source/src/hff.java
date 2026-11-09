/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
import java.util.List;

public class hff
implements hmi {
    public final hfe jIm;
    public final String Identifier;
    public final boolean khb;
    public final boolean khc;
    private hke khd = null;
    private boolean khe = false;
    public boolean khf = true;
    private String khg;
    private lgg khh = null;
    private hfa khi = hfa.LEVEL_NONE;
    private String DisplayName;
    private String khj;
    private hfn khk;
    private List<a> kgT = lcn.emA();
    private List<a> khl = lcn.emA();
    private List<a> khm = lcn.emA();
    private boolean khn = false;

    hff(hfe hfe2, lfu lfu2) {
        this.jIm = hfe2;
        this.Identifier = lfu2.aA("Identifier", "").toLowerCase().replaceAll(" ", "_");
        this.khg = lfu2.aA("WindowID", "").toLowerCase();
        this.DisplayName = lfu2.aA("DisplayName", "");
        this.khj = lfu2.aA("DefaultCommand", "");
        this.khn = lfu2.V("Attached", false);
        if (this.Identifier.isEmpty()) {
            throw new bg("Invalid chat view persistence: No identifier");
        }
        if (this.DisplayName.isEmpty()) {
            throw new bg("Invalid chat view persistence: No DisplayName");
        }
        if (this.khj.isEmpty()) {
            throw new bg("Invalid chat view persistence: No DefaultCommand");
        }
        if (this.Identifier.equals("system")) {
            this.khb = false;
            this.khc = false;
        } else {
            this.khb = true;
            this.khc = true;
        }
    }

    hff(hfe hfe2, String string, String string2, String string3, String string4, boolean bl, boolean bl2) {
        this.jIm = hfe2;
        this.Identifier = string.toLowerCase().replaceAll(" ", "_");
        this.khj = string3;
        this.DisplayName = string4;
        this.khb = bl;
        this.khc = bl2;
        this.khg = string2.toLowerCase();
        assert (this.Identifier != null);
        assert (this.khj != null);
        assert (this.DisplayName != null);
        assert (this.khg != null);
        assert (this.jIm != null);
    }

    void cgI() {
        if (this.khn && !this.cgM()) {
            this.nn(false);
        }
    }

    public String toString() {
        return "[View '" + this.Identifier + "' WindowID '" + this.khg + "' DefaultCommand '" + this.khj + "' HighlightLevel " + (Object)((Object)this.khi) + " Visible " + this.isVisible() + " Attached " + this.cgM();
    }

    void mH(String string) {
        auk auk2 = new auk(System.currentTimeMillis(), string, "System", "", aud.a.cas, null, 0, -1, null, ldv.rfe);
        auk2.ccP = string;
        hfb hfb2 = new hfb();
        hfb2.kgw = hfa.LEVEL_NONE;
        this.a(false, auk2, hfb2);
    }

    public void a(boolean bl, auk auk2, hfb hfb2) {
        assert (hfb2 != null);
        assert (auk2 != null);
        if (bl && !this.jIm.kgI.mz(this.Identifier)) {
            return;
        }
        this.khl.add(new a(this, auk2, hfb2));
        this.jIm.a(this);
    }

    public boolean isVisible() {
        return this.khk != null;
    }

    public hfa cgJ() {
        return this.khi;
    }

    public String cgK() {
        return this.khg;
    }

    public void Mc(int n) {
        if (!this.isVisible()) {
            return;
        }
        this.khk.Mc(n);
    }

    void c(lfu lfu2) {
        lfu2.aA("Identifier", this.Identifier);
        lfu2.aA("WindowID", this.khg);
        lfu2.aA("DisplayName", this.DisplayName);
        lfu2.aA("DefaultCommand", this.khj);
        boolean bl = this.cgM();
        lfu2.V("Attached", bl);
    }

    private void a(hfa hfa2) {
        assert (hfa2 != null);
        hfa hfa3 = this.jIm.kgI.mw(this.Identifier);
        if (hfa2.ordinal() > hfa3.ordinal()) {
            hfa2 = hfa3;
        }
        if (this.cgM()) {
            hfa3 = this.jIm.kgI.ms(this.khg);
            if (hfa2.ordinal() > hfa3.ordinal()) {
                hfa2 = hfa3;
            }
        }
        if (this.isVisible()) {
            hfa2 = hfa.LEVEL_NONE;
        }
        if (hfa2.ordinal() > this.khi.ordinal() && !this.cgM() && this.jIm.kgI.mv(this.Identifier)) {
            this.nn(false);
        }
        if (this.isVisible()) {
            hfa2 = hfa.LEVEL_NONE;
        }
        this.khi = hfa2;
        if (this.cgM()) {
            this.jIm.mC(this.khg).d(this);
        }
    }

    public void k(lgg lgg2) {
        this.khh = lgg2;
        this.jIm.a(this);
    }

    public void aXQ() {
        this.a(hfa.LEVEL_NONE);
        this.jIm.mC(this.khg).g(this);
    }

    void cbH() {
        if (this.khh != null) {
            this.khe = true;
            this.cgL();
            this.khg = this.jIm.cgB();
            this.nn(false);
            this.khg = this.khg.toLowerCase();
            this.jIm.mC(this.khg).l(this.khh);
            this.khh = null;
            this.khe = false;
        }
        if (!this.khl.isEmpty()) {
            if (!this.cgM() && this.jIm.kgI.mu(this.Identifier) && this.khf) {
                this.nn(false);
            }
            int n = this.kgT.size();
            int n2 = this.jIm.kgI.mx(this.Identifier);
            hfa hfa2 = null;
            for (a a2 : this.khl) {
                ++n;
                this.kgT.add(a2);
                if (this.khk != null) {
                    this.khm.add(a2);
                }
                if (a2.kho.kgw.ordinal() <= this.khi.ordinal()) continue;
                hfa2 = a2.kho.kgw;
            }
            if (n > n2) {
                for (int i = n - n2; i > 0; --i) {
                    this.kgT.remove(0);
                }
            }
            this.khl.clear();
            if (hfa2 != null) {
                this.a(hfa2);
            }
            if (this.khk != null) {
                this.khk.Mj(500);
            }
        }
        if (!this.khm.isEmpty()) {
            for (a a3 : this.khm) {
                this.a(a3);
            }
            this.khm.clear();
        }
    }

    void a(a a2) {
        if (this.khk == null) {
            return;
        }
        if (a2.crz.aFo != null && !a2.crz.aFo.equals("")) {
            this.khk.a(a2.crz.ccP, hfe.a(a2.kho.kgt, lcq.BRIGHT_WHITE), a2.crz.aEW);
        }
    }

    public void nn(boolean bl) {
        if (!this.jIm.kgI.mz(this.Identifier) && !this.khe) {
            this.kgT.clear();
        }
        this.jIm.mC(this.khg).a(this, bl);
        this.jIm.mC(this.khg).d(this);
        this.jIm.c(this);
    }

    public void r(String string, int n) {
        if (this.cgM()) {
            this.cgL();
        }
        this.khg = string;
        this.jIm.mC(this.khg).a(this, true, n);
        this.jIm.mC(this.khg).d(this);
        this.jIm.c(this);
    }

    public void cgL() {
        this.jIm.mC(this.khg).f(this);
        this.jIm.b(this);
    }

    public boolean cgM() {
        return this.jIm.mC(this.khg).mI(this.Identifier) != null;
    }

    public String cgN() {
        return this.khj;
    }

    public void cbE() {
        if (this.cgM()) {
            this.cgL();
        }
    }

    @Override
    public hms a(lgg lgg2, lhf lhf2) {
        this.khk = new hfn(this, lgg2, lhf2);
        this.khm.clear();
        this.khm.addAll(this.kgT);
        this.jIm.a(this);
        return this.khk;
    }

    @Override
    public String cgO() {
        return this.DisplayName;
    }

    public void c(hms hms2) {
        if (hms2 == this.khk) {
            this.khk = null;
        }
    }

    public void cgP() {
        if (this.khd == null) {
            this.khd = new hke(this);
        }
        this.khd.ne(true);
    }

    public hen cgQ() {
        hen.f f2 = this.jIm.dXw.jXO;
        lhf lhf2 = this.jIm.dXw.jXk.jVa;
        lgg lgg2 = this.jIm.dXw.e(this.jIm.dXw.jXk.jUZ, lhf2);
        hen hen2 = new hen(this.jIm.dXw, (String)null, lgg2, lhf2, f2, new hnu.e(this.jIm.dXw.jXk.jVb, this.jIm.dXw.jXk.jVc), new hen.d(lcy.qVZ.a(new ljk(this.DisplayName))), new hnu.d(this.khd.kBN), new hen.e(true), new hen.c(true));
        hof hof2 = new hof((hnc)this.jIm.dXw, (String)null, lgg.rlI, hen2.csW(), this.jIm.dXw.kKm, true, true, true, true, this.khd.kBN, lcy.qZF.esy());
        this.jIm.dXw.jXk.getClass();
        hcs hcs2 = new hcs(this, hof2, lgg.rlI, 464);
        hen2.w(hof2);
        hof2.a(hcs2);
        hof2.a(hcs2);
        return hen2;
    }

    public String getDisplayName() {
        return this.DisplayName;
    }
}

