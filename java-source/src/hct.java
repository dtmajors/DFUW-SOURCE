/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class hct
extends hog
implements hoh.a {
    public final hfg jIQ;
    public final hfe jIm;
    hoh jIn;
    private final hog.a jHD;
    private static final int jGP = 22;
    private static final int jHA = 8;
    private static final int jHB = 30;
    private static final int jHC = 100;
    private final Map<hfd.a, Object> jIo = lcn.emw();
    private final Map<hfd.a, hoa> jIp = lcn.emw();
    private final hqt jIR;
    private final hqc jIL;
    private final hqt jIS;

    public hct(hfg hfg2, hoh hoh2, lgg lgg2, int n) {
        super((hnc)hfg2.jIm.dXw, (String)null, lgg2, new lhf(n, 1000), hfg2.jIm.dXw.kKl);
        this.jIm = hfg2.jIm;
        this.jIQ = hfg2;
        this.jIn = hoh2;
        this.jHD = this.jIm.dXw.krh;
        int n2 = this.jHD.kRX.cg;
        this.j(new hpe((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n2), new lhf(this.getWidth() - this.jHD.kRX.cf * 2, 22), this.jIm.dXw.kIZ, "Chat Window '" + this.jIQ.getTitle() + "'"));
        this.jIR = this.a(hfd.a.WindowAutoShowOnAttach, n2 += 30, "Show window when a new tab is added");
        this.jIL = this.d(hfd.a.WindowMaxHighlightLevel, n2 += 30, "Max importance level for tabs in this window");
        this.jIS = this.a(hfd.a.WindowAffectedByMainMenu, n2 += 30, "Window is toggled by main menu Chat button");
        n2 += 30;
        this.cco();
    }

    private hqt a(hfd.a a2, int n, String string) {
        hqt hqt2 = new hqt((hnc)this.jIm.dXw, (String)null, new lgg(this.jHD.kRX.cf + 100 - this.jIm.dXw.kJI.kpT.kLY.rmN, n), new lhf(this.jIm.dXw.kJI.kpT.kLY.rmN + this.jIm.dXw.kJI.kZx + this.cch(), 22), this.jIm.dXw.kJI, string);
        hqt2.cvC().a(true, new a(this, a2));
        this.jIo.put(a2, this.jIm.kgI.b(this.jIQ.Identifier, a2));
        this.j(hqt2);
        this.jIp.put(a2, hqt2);
        return hqt2;
    }

    private hqm a(hfd.a a2, int n, String string, double d2, double d3, double d4) {
        this.jIo.put(a2, this.jIm.kgI.b(this.jIQ.Identifier, a2));
        hqm hqm2 = new hqm((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.jIm.dXw.kKw, d2, d3, ((Integer)this.jIo.get((Object)a2)).intValue(), 0, d4);
        hqm2.cqg().cpY().a(true, new c(this, hqm2, a2));
        this.j(hqm2);
        this.jIp.put(a2, hqm2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.jIm.dXw.kIT, string);
        this.j(hpe2);
        return hqm2;
    }

    private hqc d(hfd.a a2, int n, String string) {
        this.jIo.put(a2, this.jIm.kgI.b(this.jIQ.Identifier, a2));
        hqc hqc2 = new hqc((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.jIm.dXw.kKH, this.jIm.dXw.kKE, 100, new b(this, a2));
        for (hfa hfa2 : hfa.VALUES) {
            hqc2.kTn.nd(hfa2.toString());
        }
        hqc2.jHT.Nw(((hfa)((Object)this.jIo.get((Object)a2))).ordinal());
        this.j(hqc2);
        this.jIp.put(a2, hqc2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.jIm.dXw.kIT, string);
        this.j(hpe2);
        return hqc2;
    }

    private int cch() {
        return this.getWidth() - (this.jHD.kRX.cf * 2 + 100 + this.jHD.kRY.cf);
    }

    private void a(hfd.a a2) {
        hoa hoa2 = this.jIp.get((Object)a2);
        if (hoa2 instanceof hqt) {
            ((hqt)hoa2).on((Boolean)this.jIo.get((Object)a2));
        } else if (hoa2 instanceof hqm) {
            ((hqm)hoa2).cqg().cP(((Integer)this.jIo.get((Object)a2)).doubleValue());
        } else if (hoa2 instanceof hqc && this.jIo.get((Object)a2) instanceof hfa) {
            ((hqc)hoa2).jHT.Nw(((hfa)((Object)this.jIo.get((Object)a2))).ordinal());
        }
    }

    private void cco() {
        for (hfd.a a2 : this.jIo.keySet()) {
            this.a(a2);
        }
    }

    @Override
    public void ccp() {
        for (hfd.a a2 : this.jIo.keySet()) {
            this.jIm.kgI.a(this.jIQ.Identifier, a2, this.jIo.get((Object)a2));
        }
        this.cco();
        this.jIn.refresh();
    }

    @Override
    public void ccq() {
        Set<hfd.a> set = lcn.emx();
        set.addAll(this.jIo.keySet());
        this.jIo.clear();
        for (hfd.a a2 : set) {
            this.jIm.kgI.c(this.jIQ.Identifier, a2);
            this.jIo.put(a2, this.jIm.kgI.b(a2));
        }
        this.cco();
        this.jIn.refresh();
    }

    @Override
    public void ccr() {
        Set<hfd.a> set = lcn.emx();
        set.addAll(this.jIo.keySet());
        this.jIo.clear();
        for (hfd.a a2 : set) {
            this.jIo.put(a2, this.jIm.kgI.b(this.jIQ.Identifier, a2));
        }
        this.cco();
        this.jIn.refresh();
    }

    @Override
    public boolean ccs() {
        for (hfd.a a2 : this.jIo.keySet()) {
            if (this.jIo.get((Object)a2).equals(this.jIm.kgI.b(a2))) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean cct() {
        for (hfd.a a2 : this.jIo.keySet()) {
            if (this.jIo.get((Object)a2).equals(this.jIm.kgI.b(this.jIQ.Identifier, a2))) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    static /* synthetic */ Map a(hct hct2) {
        return hct2.jIo;
    }

    static /* synthetic */ void a(hct hct2, hfd.a a2) {
        hct2.a(a2);
    }

    static /* synthetic */ Map b(hct hct2) {
        return hct2.jIp;
    }
}

