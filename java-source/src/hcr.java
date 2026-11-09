/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class hcr
extends hog
implements hoh.a {
    hfe jIm;
    hoh jIn;
    private final hog.a jHD;
    private static final int jGP = 22;
    private static final int jHA = 8;
    private static final int jHB = 30;
    private static final int jHC = 100;
    private final Map<hfd.a, Object> jIo = lcn.emw();
    private final Map<hfd.a, hoa> jIp = lcn.emw();
    private final hqt jIq;
    private final hqt jIr;
    private final hqm jIs;
    private final hqm jIt;
    private final hqm jIu;
    private final hqt jIv;
    private final hqt jIw;
    private final hqt jIx;
    private final hqc jIy;
    private final hqc jIz;
    private final hqc jIA;
    private final hqc jIB;
    private final hqc jIC;
    private final hqc jID;
    private final hqy jIE;
    private final hqy jIF;

    public hcr(hfe hfe2, hoh hoh2, lgg lgg2, int n) {
        super((hnc)hfe2.dXw, (String)null, lgg2, new lhf(n, 1000), hfe2.dXw.kKl);
        this.jIm = hfe2;
        this.jIn = hoh2;
        this.jHD = this.jIm.dXw.krh;
        int n2 = this.jHD.kRX.cg;
        this.jIw = this.a(hfd.a.GlobalTimestamps, n2, "Show timestamps");
        this.jIx = this.a(hfd.a.GlobalSecondsInTimestamps, n2 += 30, "Show seconds in timestamps");
        this.jIq = this.a(hfd.a.GlobalEnterDeactivatesInGameMode, n2 += 30, "Enter deactivates chat editor in game mode");
        this.jIr = this.a(hfd.a.GlobalEnterDeactivatesInGUIMode, n2 += 30, "Enter deactivates chat editor in GUI mode");
        this.jIs = this.a(hfd.a.GlobalHistoryLength, n2 += 30, "Maximum number of lines in history", 200.0, 2000.0, 100.0);
        this.jIt = this.a(hfd.a.GlobalHistoryAge, n2 += 30, "Maximum age of lines in history, in hours", 1.0, 48.0, 1.0);
        this.jIv = this.a(hfd.a.GlobalLogging, n2 += 30, "Log all chat");
        this.jIu = this.a(hfd.a.GlobalMaxRememberedDetachedViews, n2 += 30, "Maximum number of closed tabs to remember", 0.0, 50.0, 1.0);
        this.jIy = this.b(hfd.a.GlobalSmallScrollerLocation, n2 += 30, "Location of small onscreen text");
        this.jIz = this.b(hfd.a.GlobalMediumScrollerLocation, n2 += 30, "Location of medium-sized onscreen text");
        this.jIA = this.b(hfd.a.GlobalLargeScrollerLocation, n2 += 30, "Location of large onscreen text");
        this.jIB = this.c(hfd.a.GlobalHighlightHighColorName, n2 += 30, "Color of highlighted tabs with high importance");
        this.jIC = this.c(hfd.a.GlobalHighlightMediumColorName, n2 += 30, "Color of highlighted tabs with medium importance");
        this.jID = this.c(hfd.a.GlobalHighlightLowColorName, n2 += 30, "Color of highlighted tabs with low importance");
        n2 += 30;
        this.jIE = new hqy((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n2 += 30), new lhf(200, 28), hpx.a.kXm, this.jIm.dXw.kJK, "Show all chat windows");
        this.jIE.cvC().a(true, new a(this, this.jIE));
        this.j(this.jIE);
        this.jIF = new hqy((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n2 += 36), new lhf(200, 28), hpx.a.kXm, this.jIm.dXw.kJK, "Show all chat tabs");
        this.jIF.cvC().a(true, new a(this, this.jIF));
        this.j(this.jIF);
        this.cco();
    }

    private void b(hpx hpx2) {
        if (hpx2 == this.jIE) {
            this.jIm.cgF();
        } else if (hpx2 == this.jIF) {
            this.jIm.cgE();
        }
    }

    private hqt a(hfd.a a2, int n, String string) {
        hqt hqt2 = new hqt((hnc)this.jIm.dXw, (String)null, new lgg(this.jHD.kRX.cf + 100 - this.jIm.dXw.kJI.kpT.kLY.rmN, n), new lhf(this.jIm.dXw.kJI.kpT.kLY.rmN + this.jIm.dXw.kJI.kZx + this.cch(), 22), this.jIm.dXw.kJI, string);
        hqt2.cvC().a(true, new b(this, a2));
        this.jIo.put(a2, this.jIm.kgI.d(a2));
        this.j(hqt2);
        this.jIp.put(a2, hqt2);
        return hqt2;
    }

    private hqm a(hfd.a a2, int n, String string, double d2, double d3, double d4) {
        this.jIo.put(a2, this.jIm.kgI.d(a2));
        hqm hqm2 = new hqm((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.jIm.dXw.kKw, d2, d3, ((Integer)this.jIo.get((Object)a2)).intValue(), 0, d4);
        hqm2.cqg().cpY().a(true, new e(this, hqm2, a2));
        this.j(hqm2);
        this.jIp.put(a2, hqm2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.jIm.dXw.kIT, string);
        this.j(hpe2);
        return hqm2;
    }

    private hqc b(hfd.a a2, int n, String string) {
        this.jIo.put(a2, this.jIm.kgI.d(a2));
        hqc hqc2 = new hqc((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.jIm.dXw.kKH, this.jIm.dXw.kKE, 100, new d(this, a2));
        for (hfd.b b2 : hfd.b.VALUES) {
            hqc2.kTn.nd(b2.toString());
        }
        hqc2.jHT.Nw(((hfd.b)((Object)this.jIo.get((Object)a2))).ordinal());
        this.j(hqc2);
        this.jIp.put(a2, hqc2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.jIm.dXw.kIT, string);
        this.j(hpe2);
        return hqc2;
    }

    private hqc c(hfd.a a2, int n, String string) {
        this.jIo.put(a2, this.jIm.kgI.d(a2));
        hqc hqc2 = new hqc((hnc)this.jIm.dXw, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.jIm.dXw.kKH, this.jIm.dXw.kKE, 100, new c(this, a2));
        for (hez object2 : lea.rhD) {
            hqc2.kTn.nd(object2.DisplayName);
        }
        hqc2.jHT.Nw(this.ml((String)this.jIo.get((Object)a2)));
        this.j(hqc2);
        this.jIp.put(a2, hqc2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.jIm.dXw.kIT, string);
        this.j(hpe2);
        return hqc2;
    }

    private int ml(String string) {
        for (int i = 0; i < lea.rhD.size(); ++i) {
            if (!lea.rhD.get((int)i).DisplayName.equalsIgnoreCase(string)) continue;
            return i;
        }
        return 0;
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
        } else if (hoa2 instanceof hqc) {
            if (this.jIo.get((Object)a2) instanceof hfd.b) {
                ((hqc)hoa2).jHT.Nw(((hfd.b)((Object)this.jIo.get((Object)a2))).ordinal());
            } else if (this.jIo.get((Object)a2) instanceof String) {
                ((hqc)hoa2).jHT.Nw(this.ml((String)this.jIo.get((Object)a2)));
            }
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
            this.jIm.kgI.a(a2, this.jIo.get((Object)a2));
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
            this.jIm.kgI.e(a2);
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
            this.jIo.put(a2, this.jIm.kgI.d(a2));
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
            if (this.jIo.get((Object)a2).equals(this.jIm.kgI.d(a2))) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    static /* synthetic */ void a(hcr hcr2, hpx hpx2) {
        hcr2.b(hpx2);
    }

    static /* synthetic */ Map a(hcr hcr2) {
        return hcr2.jIo;
    }

    static /* synthetic */ void a(hcr hcr2, hfd.a a2) {
        hcr2.a(a2);
    }

    static /* synthetic */ Map b(hcr hcr2) {
        return hcr2.jIp;
    }
}

