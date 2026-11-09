/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcr
 *  lcy
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hfe
implements alz {
    public static final boolean DEBUG = true;
    public final hdm dXw;
    public final hfd kgI = new hfd(this);
    private boolean kgJ = true;
    private hkd kgK = null;
    private ama kgL = null;
    private final Map<String, hff> kgM = lcn.emw();
    private final Map<String, hfg> kgN = lcn.emw();
    private final Set<hff> kgO = lcn.emx();
    private final Set<String> kgP = lcn.emx();
    private final List<String> kgQ = lcn.emv();
    private final List<b> kgR = lcn.emA();
    private final List<String> kgS = lcn.emA();
    private final List<auk> kgT = lcn.emA();
    private final hiv kgU;
    private final hiv kgV;
    private final hiv kgW;
    private lbi<ehr> kgX = new lbi<ehr>(this){
        final /* synthetic */ hfe kgY;
        {
            this.kgY = hfe2;
        }

        public void b(ehr ehr2) {
            hfe.a(this.kgY, ehr2);
        }

        public /* synthetic */ void m(Object object) {
            this.b((ehr)object);
        }
    };
    private lbn jEL = new lbn(this){
        final /* synthetic */ hfe kgY;
        {
            this.kgY = hfe2;
        }

        public void W() {
            hfe.a(this.kgY);
        }
    };

    public hfe(hdm hdm2) {
        this.dXw = hdm2;
        this.dXw.kAz.eme().a(true, this.jEL);
        this.dXw.cbP().cdh.rex.a(true, ehr.class, this.kgX);
        this.kgU = new hiv(this.dXw, "Scroller", this.dXw.kJM);
        this.kgU.a(hiv.c.kwv);
        this.kgV = new hiv(this.dXw, "Scroller", this.dXw.kJN);
        this.kgV.a(hiv.c.kwv);
        this.kgW = new hiv(this.dXw, "Scroller", this.dXw.kJO);
        this.kgW.a(hiv.c.kww);
        this.kgL = new ama(this);
        this.kgL.Eu();
    }

    public void dispose() {
        this.dXw.kAz.eme().a(false, this.jEL);
        this.dXw.cbP().cdh.rex.a(false, ehr.class, this.kgX);
        this.kgO.clear();
        this.kgP.clear();
        this.kgQ.clear();
        this.kgR.clear();
        for (hff object : this.kgM.values()) {
            if (!object.cgM()) continue;
            object.cgL();
        }
        this.kgM.clear();
        for (hfg hfg2 : this.kgN.values()) {
            hfg2.setVisible(false);
        }
        this.kgN.clear();
        this.kgU.remove();
        this.kgV.remove();
        this.kgW.remove();
        if (this.kgL != null) {
            this.kgL.Ev();
            this.kgL = null;
        }
    }

    void cgA() {
        this.kgI.a(this.kgU, this.kgI.cgr());
        this.kgU.a(hiv.c.kww);
        this.kgU.MK(300);
        this.kgU.ML(8);
        this.kgU.MM(300);
        this.kgU.MN(20000);
        this.kgU.MO(200);
        this.kgU.MP(200);
        this.kgU.MQ(2);
        this.kgU.MR(10);
        this.kgI.a(this.kgW, this.kgI.cgt());
        this.kgW.a(hiv.c.kwv);
        this.kgW.MK(600);
        this.kgW.ML(4);
        this.kgW.MM(300);
        this.kgW.MN(5000);
        this.kgW.MO(300);
        this.kgW.MP(1000);
        this.kgW.MQ(2);
        this.kgW.MR(10);
        this.kgI.a(this.kgV, this.kgI.cgs());
        this.kgV.a(hiv.c.kwv);
        this.kgV.MK(600);
        this.kgV.ML(4);
        this.kgV.MM(1000);
        this.kgV.MN(5000);
        this.kgV.MO(300);
        this.kgV.MP(1000);
        this.kgV.MQ(2);
        this.kgV.MR(10);
    }

    private void c(auk auk2) {
        this.kgT.add(auk2);
        while (this.kgT.size() > this.kgI.cgo()) {
            this.kgT.remove(0);
        }
        long l = System.currentTimeMillis() - (long)this.kgI.cgp() * 60L * 60L * 1000L;
        while (!this.kgT.isEmpty() && this.kgT.get((int)0).aEW < l) {
            this.kgT.remove(0);
        }
    }

    public void mA(String string) {
        hff hff2 = this.a(string, "Chat", "msg " + string, string, true, true);
        if (!hff2.cgM()) {
            hff2.nn(true);
        } else {
            this.mC(hff2.cgK()).e(hff2);
        }
        this.mC(hff2.cgK()).setVisible(true);
        this.mC(hff2.cgK()).no(true);
    }

    public void b(boolean bl, auk auk2) {
        if (!aud.cai && auk2.aFo.startsWith("<Chaos ")) {
            return;
        }
        this.c(auk2);
        awe awe2 = lea.rhC;
        awi awi2 = new awi(awe2, auk2);
        awe2.b(awi2);
        auk2.ccP = awi2.b(awm.DisplayText).get().toString();
        awp awp2 = (awp)awi2.b(awm.DisplayTargets);
        for (String string : awp2.Xq()) {
            hfg hfg2;
            Object object;
            Object object2;
            String string2 = "say";
            if (string.indexOf(124) > 0) {
                string2 = string.substring(string.indexOf(124) + 1);
                string = string.substring(0, string.indexOf(124));
            }
            awi awi3 = awe2.a(awi2, string);
            if (string.equals("OnScreenSmall")) {
                if (bl || this.kgI.cgr() == hfd.b.Hidden) continue;
                this.kgU.mT(auk2.Wd());
                continue;
            }
            if (string.equals("OnScreenMedium")) {
                if (bl || this.kgI.cgs() == hfd.b.Hidden) continue;
                this.kgV.mT(auk2.Wd());
                continue;
            }
            if (string.equals("OnScreenLarge")) {
                if (bl || this.kgI.cgt() == hfd.b.Hidden) continue;
                this.kgW.mT(auk2.Wd());
                continue;
            }
            if (string.equals("Effect")) {
                if (bl) continue;
                this.mG(((awo)awi3.b((awm)awm.UserString1)).Value);
                continue;
            }
            if (string.equals("MessageBox")) {
                if (bl) continue;
                object2 = new a(this, null);
                object = new hoz.a(lcy.qQB);
                ((a)object2).kha = new hki(this.dXw, null, auk2.ccS.length >= 2 ? new ljg(auk2.ccS[0]) : lcy.qVa, new ljg(auk2.Wd()), new hoz.a[]{object}, (hoz.a)object, (lbn)object2);
                ((a)object2).kha.cdk();
                continue;
            }
            object2 = new hfb();
            object = (String)awi3.b(awm.DefaultWindow).get();
            this.mC((String)object);
            int n = (Integer)awi3.b(awm.HighlightLevel).get();
            if (n < 0 || n >= hfa.VALUES.length) {
                n = hfa.LEVEL_NONE.ordinal();
            }
            ((hfb)object2).kgw = bl ? hfa.LEVEL_NONE : hfa.VALUES[n];
            ((hfb)object2).kgt = (String)awi3.b(awm.BaseColor).get();
            long l = System.currentTimeMillis();
            if (bl && auk2.aEW != 0L && (l - auk2.aEW) / 1000L > (long)(this.kgI.cgp() * 60 * 60) || bl && auk2.aEW != 0L && (l - auk2.aEW) / 1000L > (long)(this.kgI.my(string.toLowerCase().replaceAll(" ", "_")) * 60 * 60)) continue;
            hff hff2 = this.a(string, (String)object, string2, string, true, true);
            hff2.a(bl, auk2, (hfb)object2);
            if (auk2.aFo != null && !auk2.aFo.equals("") || (hfg2 = this.mC(hff2.cgK())) == null) continue;
            hfg2.e(hff2);
        }
    }

    public String cgB() {
        int n = 1;
        while (this.kgN.containsKey("custom" + n)) {
            ++n;
        }
        return "Custom" + n;
    }

    public void mB(String string) {
        this.kgP.add(string.toLowerCase());
    }

    public hff a(String string, String string2, String string3, String string4, boolean bl, boolean bl2) {
        hff hff2 = this.kgM.get(string.toLowerCase().replaceAll(" ", "_"));
        if (hff2 != null) {
            return hff2;
        }
        hff2 = new hff(this, string.toLowerCase(), string2, string3, string4, bl, bl2);
        this.kgM.put(hff2.Identifier, hff2);
        return hff2;
    }

    public hfg mC(String string) {
        hfg hfg2 = this.kgN.get(string.toLowerCase());
        if (hfg2 != null) {
            return hfg2;
        }
        hfg2 = new hfg(this, string);
        this.kgN.put(string.toLowerCase(), hfg2);
        return hfg2;
    }

    void a(hff hff2) {
        this.kgO.add(hff2);
    }

    void b(hff hff2) {
        this.kgS.remove(hff2.Identifier);
        this.kgS.add(hff2.Identifier);
    }

    void c(hff hff2) {
        this.kgS.remove(hff2.Identifier);
    }

    private void a(hff hff2, hfg hfg2, int n) {
        if (hff2.cgK() != null && hff2.cgK().equalsIgnoreCase(hfg2.Identifier)) {
            hfg2.a(hff2, n);
        } else {
            if (hff2.cgM()) {
                hff2.cgL();
            }
            hff2.r(hfg2.Identifier, n);
        }
    }

    public void b(hff hff2, hfg hfg2, int n) {
        b b2 = new b(this, null);
        b2.jET = hff2;
        b2.jIQ = hfg2;
        b2.adk = n;
        this.kgR.add(b2);
    }

    public void mD(String string) {
        this.kgQ.remove(string);
        this.kgQ.add(string);
    }

    private void a(ehr ehr2) {
        switch (ehr2.iqC) {
            case kgx: {
                this.cgC();
                break;
            }
            case kgz: {
                this.mE(ehr2.ccT);
                break;
            }
            case kgy: {
                this.mF(ehr2.ccT);
                break;
            }
            case kgA: {
                this.A(ehr2.ccT, (String)ehr2.iqD[0]);
            }
        }
    }

    private void mE(String string) {
        hff hff2;
        if (string != null && (hff2 = this.kgM.get(string.toLowerCase().replaceAll(" ", "_"))) != null) {
            hff2.cgP();
        }
    }

    private void mF(String string) {
        Object object;
        String string2 = null;
        if (string != null && (object = this.kgM.get(string.toLowerCase().replaceAll(" ", "_"))) != null) {
            string2 = ((hff)object).cgK();
        }
        if (string2 == null) {
            return;
        }
        object = this.kgN.get(string2);
        if (object == null) {
            return;
        }
        ((hfg)object).cgP();
    }

    public void cgC() {
        if (this.kgK == null) {
            this.kgK = new hkd(this);
        }
        this.kgK.ne(true);
    }

    private void A(String string, String string2) {
        Object object;
        String string3 = null;
        if (string != null && (object = this.kgM.get(string.toLowerCase().replaceAll(" ", "_"))) != null) {
            string3 = ((hff)object).cgK();
        }
        if (string3 == null) {
            return;
        }
        object = this.kgN.get(string3);
        if (object == null) {
            return;
        }
        ((hfg)object).mK(string2);
    }

    public void f(hfd.a a2) {
        switch (a2) {
            case GlobalSmallScrollerLocation: {
                this.kgI.a(this.kgU, this.kgI.cgr());
                break;
            }
            case GlobalMediumScrollerLocation: {
                this.kgI.a(this.kgV, this.kgI.cgs());
                break;
            }
            case GlobalLargeScrollerLocation: {
                this.kgI.a(this.kgW, this.kgI.cgt());
                break;
            }
            case GlobalTimestamps: 
            case GlobalSecondsInTimestamps: {
                this.cgD();
            }
        }
    }

    public void g(String string, hfd.a a2) {
    }

    public void h(String string, hfd.a a2) {
    }

    private void cgD() {
    }

    public void cdM() {
        String string = "system";
        if (!this.kgQ.isEmpty()) {
            string = this.kgQ.get(this.kgQ.size() - 1);
        }
        this.mC(string).setVisible(true);
        this.mC(string).no(true);
    }

    public void cgE() {
        LinkedList<String> linkedList = lcn.emA();
        linkedList.addAll(this.kgM.keySet());
        hfg hfg2 = this.mC("system");
        for (String string : linkedList) {
            hff hff2 = this.kgM.get(string);
            if (hff2.cgM()) continue;
            if (hff2.cgK() == null) {
                hff2.r("system", hfg2.getViewCount());
                continue;
            }
            hff2.nn(false);
        }
    }

    public void cgF() {
        for (hfg hfg2 : this.kgN.values()) {
            if (hfg2.getViewCount() <= 0) continue;
            hfg2.setVisible(true);
        }
    }

    public void cgG() {
        int n = 0;
        int n2 = 0;
        for (hfg object : this.kgN.values()) {
            if (object.getViewCount() <= 0 || !this.kgI.mt(object.Identifier)) continue;
            ++n;
            if (!object.cdi()) continue;
            ++n2;
        }
        boolean bl = n2 < n;
        for (hfg hfg2 : this.kgN.values()) {
            if (hfg2.getViewCount() <= 0 || !this.kgI.mt(hfg2.Identifier)) continue;
            hfg2.setVisible(bl);
        }
    }

    public boolean j(lfu lfu2) {
        Object object;
        int n;
        this.kgI.i(lfu2.zC("Config"));
        int n2 = lfu2.ad("WindowCount", 0);
        for (n = 0; n < n2; ++n) {
            try {
                object = new hfg(this, lfu2.zC("Window" + n));
                if (this.kgN.containsKey(((hfg)object).Identifier)) continue;
                this.kgN.put(((hfg)object).Identifier, (hfg)object);
                continue;
            }
            catch (bg bg2) {
                // empty catch block
            }
        }
        n2 = lfu2.ad("ViewCount", 0);
        for (n = 0; n < n2; ++n) {
            try {
                object = new hff(this, lfu2.zC("View" + n));
                if (((hff)object).getDisplayName().startsWith("Chaos") && !aud.cai || this.kgM.containsKey(((hff)object).Identifier)) continue;
                this.kgM.put(((hff)object).Identifier, (hff)object);
                continue;
            }
            catch (bg bg3) {
                // empty catch block
            }
        }
        lfu lfu3 = lfu2.zC("History");
        n2 = lfu3.ad("EntryCount", 0);
        for (int i = 0; i < n2; ++i) {
            auk auk2 = auk.b(lfu3.zC("Entry" + i));
            this.c(auk2);
        }
        return true;
    }

    public boolean k(lfu lfu2) {
        this.kgI.c(lfu2.zC("Config"));
        int n = 0;
        for (hfg iterator : this.kgN.values()) {
            iterator.c(lfu2.zC("Window" + n));
            ++n;
        }
        lfu2.ad("WindowCount", n);
        n = 0;
        for (hff hff2 : this.kgM.values()) {
            hff2.c(lfu2.zC("View" + n));
            ++n;
        }
        lfu2.ad("ViewCount", n);
        n = 0;
        lfu lfu3 = lfu2.zC("History");
        for (auk auk2 : this.kgT) {
            auk2.c(lfu3.zC("Entry" + n));
            ++n;
        }
        lfu3.ad("EntryCount", n);
        return true;
    }

    public boolean a(lfu lfu2) {
        if (lfu2.eqA() && !lfu2.eqB()) {
            return this.j(lfu2);
        }
        if (lfu2.eqB() && !lfu2.eqA()) {
            return this.k(lfu2);
        }
        assert (false) : "wtf?";
        return false;
    }

    public void cdJ() {
        hfg hfg2 = this.kgN.get("system");
        if (hfg2 != null) {
            hfg2.cdJ();
        }
    }

    private void cbH() {
        Object object;
        Object object2;
        if (this.kgJ) {
            Iterator iterator;
            this.kgJ = false;
            this.cgA();
            this.dXw.jZH.j(this.kgU);
            this.dXw.jZH.j(this.kgV);
            this.dXw.jZH.j(this.kgW);
            for (hff object32 : this.kgM.values()) {
                object32.cgI();
            }
            for (hfg hfg2 : this.kgN.values()) {
                hfg2.cgI();
            }
            object2 = this.a("System", "System", "say", "System", false, false);
            if (!((hff)object2).cgM()) {
                ((hff)object2).nn(false);
            }
            hfg hfg3 = this.mC("System");
            hfg3.setVisible(true);
            hfg3.no(false);
            object = lcn.emA();
            object.addAll(this.kgT);
            this.kgT.clear();
            Object object3 = object.iterator();
            while (object3.hasNext()) {
                iterator = (auk)object3.next();
                this.b(true, (auk)((Object)iterator));
            }
            if (!this.kgO.isEmpty()) {
                object3 = lcn.emx();
                object3.addAll(this.kgO);
                this.kgO.clear();
                iterator = object3.iterator();
                while (iterator.hasNext()) {
                    hff hff2 = (hff)iterator.next();
                    hff2.khf = false;
                    hff2.cbH();
                    hff2.khf = true;
                }
            }
        }
        if (!this.kgO.isEmpty()) {
            object2 = lcn.emx();
            object2.addAll(this.kgO);
            this.kgO.clear();
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                object = (hff)iterator.next();
                ((hff)object).cbH();
            }
        }
        if (!this.kgP.isEmpty()) {
            for (String string : this.kgP) {
                object = this.kgN.get(string);
                if (object == null) continue;
                assert (((hfg)object).getViewCount() == 0);
                boolean bl = false;
                for (hff hff2 : this.kgM.values()) {
                    if (hff2.cgK() == null || !hff2.cgK().equalsIgnoreCase(string)) continue;
                    bl = true;
                    break;
                }
                ((hfg)object).setVisible(false);
                if (bl) continue;
                this.kgN.remove(string);
                this.kgQ.remove(string);
            }
            this.kgP.clear();
        }
        if (!this.kgR.isEmpty()) {
            for (b b2 : this.kgR) {
                this.a(b2.jET, b2.jIQ, b2.adk);
            }
            this.kgR.clear();
        }
        if (this.kgS.size() > this.kgI.cgx()) {
            object2 = this.kgS.get(0);
            this.kgS.remove(0);
            hff hff3 = this.kgM.get(object2);
            if (hff3 != null) {
                this.kgM.remove(object2);
            }
            this.kgI.mq((String)object2);
        }
    }

    public static lcq a(String string, lcq lcq2) {
        for (hez hez2 : lea.rhD) {
            if (!hez2.DisplayName.equalsIgnoreCase(string)) continue;
            return hez2.dMT;
        }
        lcq lcq3 = jto.tR(string);
        if (lcq3 != null) {
            return lcq3;
        }
        return lcq2;
    }

    public hen cgH() {
        hen.f f2 = this.dXw.jXO;
        lhf lhf2 = this.dXw.jXk.jVa;
        lgg lgg2 = this.dXw.e(this.dXw.jXk.jUZ, lhf2);
        hen hen2 = new hen(this.dXw, (String)null, lgg2, lhf2, f2, new hnu.e(this.dXw.jXk.jVb, this.dXw.jXk.jVc), new hen.d(lcy.qVX), new hnu.d(this.kgK.kBN), new hen.e(true), new hen.c(true));
        hof hof2 = new hof((hnc)this.dXw, (String)null, lgg.rlI, hen2.csW(), this.dXw.kKm, true, true, true, true, this.kgK.kBN, lcy.qZF.esy());
        this.dXw.jXk.getClass();
        hcr hcr2 = new hcr(this, hof2, lgg.rlI, 464);
        hen2.w(hof2);
        hof2.a(hcr2);
        hof2.a(hcr2);
        return hen2;
    }

    private final void mG(String string) {
        int n = del.dr(string);
        if (n <= 0) {
            assert (false);
            return;
        }
        glh glh2 = (glh)this.kgL.getMessageDelegator().h(13057, this.kgL.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aZG = null;
        glh2.akX = null;
        glh2.aZD = ljq.roQ;
        this.kgL.getMessageDelegator().F(glh2);
    }

    @Override
    public boolean a(ba ba2) {
        return false;
    }

    @Override
    public boolean m(dxq dxq2) {
        return false;
    }

    @Override
    public boolean a(kcz kcz2) {
        return false;
    }

    @Override
    public boolean a(kgz kgz2) {
        return false;
    }

    @Override
    public boolean a(ktf ktf2) {
        return false;
    }

    @Override
    public boolean b(ktv ktv2) {
        return false;
    }

    static /* synthetic */ void a(hfe hfe2, ehr ehr2) {
        hfe2.a(ehr2);
    }

    static /* synthetic */ void a(hfe hfe2) {
        hfe2.cbH();
    }
}

