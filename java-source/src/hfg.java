/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  lcw
 *  lcy
 */
import java.util.ArrayList;

public class hfg {
    public lbn dXA = new lbn(this){
        final /* synthetic */ hfg khC;
        {
            this.khC = hfg2;
        }

        public void W() {
            hfg.a(this.khC);
        }
    };
    public lbn khq = new lbn(this){
        final /* synthetic */ hfg khC;
        {
            this.khC = hfg2;
        }

        public void W() {
            hfg.b(this.khC);
        }
    };
    public lbn khr = new lbn(this){
        final /* synthetic */ hfg khC;
        {
            this.khC = hfg2;
        }

        public void W() {
            hfg.c(this.khC);
        }
    };
    public lbn khs = new lbn(this){
        final /* synthetic */ hfg khC;
        {
            this.khC = hfg2;
        }

        public void W() {
            hfg.d(this.khC);
        }
    };
    public lbn kht = new lbn(this){
        final /* synthetic */ hfg khC;
        {
            this.khC = hfg2;
        }

        public void W() {
            hfg.e(this.khC);
        }
    };
    public final String Identifier;
    public final hfe jIm;
    ArrayList<hff> khu = lcn.emv();
    private final hkc khv;
    public final hch khw;
    private String Title;
    private hen khx;
    private hfo khy;
    private boolean khz = false;
    String khA;
    private hkf khB = null;

    hfg(hfe hfe2, lfu lfu2) {
        this.jIm = hfe2;
        this.khv = new hkc(this);
        this.khw = new hch(100);
        this.Identifier = lfu2.aA("Identifier", "").toLowerCase();
        this.Title = lfu2.aA("Title", null);
        this.khA = lfu2.aA("ActiveViewID", "").toLowerCase().replaceAll(" ", "_");
        this.khz = lfu2.V("Visible", false);
        if (this.khA.equals("")) {
            this.khA = null;
        }
        this.khw.a(lfu2.zC("Editor"));
        this.khv.a(lfu2.zC("Factory"));
        if (this.Identifier.isEmpty()) {
            throw new bg("Invalid chat window persistence: No identifier");
        }
        if (this.Title.isEmpty()) {
            throw new bg("Invalid chat window persistence: No title");
        }
    }

    hfg(hfe hfe2, String string) {
        this.jIm = hfe2;
        this.khv = new hkc(this);
        this.khw = new hch(100);
        this.Identifier = string.toLowerCase();
        this.Title = string;
    }

    void cgI() {
        this.setVisible(this.khz);
    }

    void c(lfu lfu2) {
        lfu2.aA("Identifier", this.Identifier);
        lfu2.aA("Title", this.Title);
        lfu2.aA("ActiveViewID", this.khA == null ? "" : this.khA);
        lfu2.V("Visible", this.cdi());
        this.khw.a(lfu2.zC("Editor"));
        this.khv.a(lfu2.zC("Factory"));
    }

    void d(hff hff2) {
        assert (this.mI(hff2.Identifier) == hff2);
        if (this.cdi()) {
            this.khy.d(hff2);
        }
    }

    hff mI(String string) {
        for (hff hff2 : this.khu) {
            if (!hff2.Identifier.equalsIgnoreCase(string)) continue;
            return hff2;
        }
        return null;
    }

    void a(hff hff2, boolean bl, int n) {
        assert (this.mI(hff2.Identifier) == null);
        this.khu.add(n, hff2);
        if (bl || this.khA == null) {
            this.khA = hff2.Identifier;
        }
        if (this.cdi()) {
            this.khy.cib();
        } else if (this.jIm.kgI.mr(this.Identifier)) {
            this.setVisible(true);
        }
    }

    void e(hff hff2) {
        this.khA = hff2.Identifier;
        if (this.cdi()) {
            this.khy.cib();
        }
    }

    void a(hff hff2, boolean bl) {
        assert (this.mI(hff2.Identifier) == null);
        this.khu.add(hff2);
        if (bl || this.khA == null) {
            this.khA = hff2.Identifier;
        }
        if (this.cdi()) {
            this.khy.cib();
        } else if (this.jIm.kgI.mr(this.Identifier)) {
            this.setVisible(true);
        }
    }

    void f(hff hff2) {
        int n = this.khu.indexOf(hff2);
        if (n == -1) {
            assert (false);
            return;
        }
        this.khu.remove(n);
        if (this.khA != null && this.khA.equals(hff2.Identifier)) {
            if (n >= this.khu.size()) {
                --n;
            }
            this.khA = n >= 0 ? this.khu.get((int)n).Identifier : null;
        }
        if (this.khA == null && this.cdi()) {
            this.closeWindow();
            this.jIm.mB(this.Identifier);
        } else if (this.cdi()) {
            this.khy.cib();
        }
    }

    public String cgR() {
        return this.khA;
    }

    public int cgS() {
        if (this.khA == null) {
            return -1;
        }
        for (int i = 0; i < this.khu.size(); ++i) {
            if (!this.khu.get((int)i).Identifier.equals(this.khA)) continue;
            return i;
        }
        return -1;
    }

    public int getViewCount() {
        return this.khu.size();
    }

    public hff Md(int n) {
        return this.khu.get(n);
    }

    public void g(hff hff2) {
        this.khA = hff2 == null ? null : hff2.Identifier;
    }

    public void a(hff hff2, int n) {
        int n2 = this.khu.indexOf(hff2);
        assert (n2 >= 0);
        this.khu.remove(n2);
        if (n > n2) {
            --n;
        }
        this.khu.add(n, hff2);
        this.khA = hff2.Identifier;
        if (this.cdi()) {
            this.khy.cib();
        }
    }

    public void b(hff hff2, int n) {
        this.jIm.b(hff2, this, n);
    }

    public void cgT() {
        this.jIm.mD(this.Identifier);
    }

    public void l(lgg lgg2) {
        if (!this.cdi()) {
            return;
        }
        lgg lgg3 = new lgg(lgg2.cf - 20, lgg2.cg - 10);
        this.khx.z(lgg3);
        this.jIm.dXw.jZH.a((hms)this.khx, 3000.0f);
    }

    private void closeWindow() {
        if (!this.cdi()) {
            return;
        }
        this.khv.closeWindow();
    }

    public boolean cdi() {
        return this.khv.cdi();
    }

    public void Me(int n) {
        if (this.khA == null) {
            return;
        }
        hff hff2 = this.mI(this.khA);
        if (hff2 == null) {
            assert (false);
            return;
        }
        hff2.Mc(n);
    }

    public String getTitle() {
        return this.Title;
    }

    void setVisible(boolean bl) {
        this.khv.ne(bl);
    }

    void no(boolean bl) {
        if (!this.cdi()) {
            this.setVisible(true);
        }
        this.khy.no(bl);
    }

    public void mJ(String string) {
        if (!(string = string.trim()).isEmpty()) {
            if (string.charAt(0) == '/') {
                string = string.substring(1);
            } else {
                String string2 = "say";
                if (this.khA != null) {
                    hff hff2 = this.mI(this.khA);
                    if (hff2 == null) {
                        assert (false);
                        this.khA = null;
                    } else {
                        string2 = hff2.cgN();
                    }
                }
                string = string2 + " '" + lhn.b(string, '\'') + "'";
            }
            this.jIm.dXw.cbP().d(string, null, this.khA == null ? "" : this.khA);
        }
    }

    public hen cdl() {
        assert (this.khx == null);
        assert (this.khy == null);
        hen.f f2 = this.jIm.dXw.jXO;
        lhf lhf2 = hdk.jNz;
        lgg lgg2 = this.jIm.dXw.e(this.Identifier.equalsIgnoreCase("system") ? hdk.jNC : hdk.jND, lhf2);
        int n = (this.jIm.dXw.kND.getWidth() - lhf2.rmN) / 2;
        lgg2 = new lgg(n, lgg2.cg);
        this.khx = new hen(this.jIm.dXw, this.Identifier, lgg2, lhf2, f2, new hnu.e(hdk.jNB, hdk.jNA), new hen.d(lcy.qYn), new hnu.d(this.dXA), new hen.e(true), new hen.c(this.khv.coX()), new hen.b(this.khq));
        this.khx.f(new ljk(this.Title));
        lhf lhf3 = this.khx.cqv().q(this.khx.cfF().keL.kKX.kPT.ctr());
        this.khy = new hfo(this, lgg.rlI, lhf3);
        this.khx.w(this.khy);
        this.np(true);
        return this.khx;
    }

    private void np(boolean bl) {
        this.khx.cqn().a(bl, this.khs);
        this.khx.cql().a(bl, this.khr);
        this.khx.cqr().a(bl, this.kht);
    }

    public boolean d(lfu lfu2) {
        return false;
    }

    private void cgU() {
        this.closeWindow();
    }

    private void cgV() {
        this.cgP();
    }

    private void cgW() {
        this.np(false);
        this.khy = null;
        this.khx = null;
    }

    private void cgX() {
    }

    private void cgY() {
    }

    void cdJ() {
        if (this.khx != null) {
            String string;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.Title);
            if (this.jIm.dXw.jZL.ccN().getValue()) {
                stringBuilder.append(" - FPS: ");
                string = "" + lcw.pht;
                while (string.length() < 3) {
                    string = " " + string;
                }
                stringBuilder.append(string);
            }
            if (this.jIm.dXw.jZL.ccO().getValue()) {
                stringBuilder.append(" - Ping: ");
                string = "" + lcw.qGg;
                while (string.length() < 3) {
                    string = " " + string;
                }
                stringBuilder.append(string);
            }
            if (this.jIm.dXw.cbP().kcc.ccF().getValue()) {
                stringBuilder.append(" - Bandwidth: ");
                string = "" + (lcw.qGh + lcw.qGi);
                while (string.length() < 4) {
                    string = " " + string;
                }
                stringBuilder.append(string);
                stringBuilder.append(" (In: ");
                string = "" + lcw.qGh;
                while (string.length() < 4) {
                    string = " " + string;
                }
                stringBuilder.append(string);
                stringBuilder.append("/ Out: ");
                string = "" + lcw.qGi;
                while (string.length() < 4) {
                    string = " " + string;
                }
                stringBuilder.append(string);
                stringBuilder.append(")");
            }
            this.khx.f(new ljk(stringBuilder.toString()));
        }
    }

    void mK(String string) {
        if (this.Title.equals(string = string.trim())) {
            return;
        }
        this.Title = string;
        if (this.cdi()) {
            this.khx.f(new ljk(this.Title));
        }
    }

    void cgP() {
        if (this.khB == null) {
            this.khB = new hkf(this);
        }
        this.khB.ne(true);
    }

    public hen cgZ() {
        hen.f f2 = this.jIm.dXw.jXO;
        lhf lhf2 = this.jIm.dXw.jXk.jVa;
        lgg lgg2 = this.jIm.dXw.e(this.jIm.dXw.jXk.jUZ, lhf2);
        hen hen2 = new hen(this.jIm.dXw, (String)null, lgg2, lhf2, f2, new hnu.e(this.jIm.dXw.jXk.jVb, this.jIm.dXw.jXk.jVc), new hen.d(lcy.qVY.a(new ljk(this.getTitle()))), new hnu.d(this.khB.kBN), new hen.e(true), new hen.c(true));
        hof hof2 = new hof((hnc)this.jIm.dXw, (String)null, lgg.rlI, hen2.csW(), this.jIm.dXw.kKm, true, true, true, true, this.khB.kBN, lcy.qZF.esy());
        this.jIm.dXw.jXk.getClass();
        hct hct2 = new hct(this, hof2, lgg.rlI, 464);
        hen2.w(hof2);
        hof2.a(hct2);
        hof2.a(hct2);
        return hen2;
    }

    static /* synthetic */ void a(hfg hfg2) {
        hfg2.cgU();
    }

    static /* synthetic */ void b(hfg hfg2) {
        hfg2.cgV();
    }

    static /* synthetic */ void c(hfg hfg2) {
        hfg2.cgW();
    }

    static /* synthetic */ void d(hfg hfg2) {
        hfg2.cgX();
    }

    static /* synthetic */ void e(hfg hfg2) {
        hfg2.cgY();
    }
}

