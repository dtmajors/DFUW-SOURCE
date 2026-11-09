/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  hlv
 *  lcr
 *  lcy
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class hgd
extends hog {
    private final ldv kmg;
    private final hpa kmh;
    private final hpa kmi;
    private final how kmj;
    private final how kmk;
    private final hpe kml;
    private final hpe kmm;
    private final hqy kmn;
    private final hqy kkz;
    private final lhf jDM = new lhf(200, 8);
    private final int kmo = 9;
    public boolean kmp = true;
    private final lbn kmq = new lbn(this){
        final /* synthetic */ hgd kmy;
        {
            this.kmy = hgd2;
        }

        public final void W() {
            hgd.a(this.kmy);
        }
    };
    private final lbn kkJ = new lbn(this){
        final /* synthetic */ hgd kmy;
        {
            this.kmy = hgd2;
        }

        public final void W() {
            hgd.a(this.kmy, 3);
            hgd.a(this.kmy, 4);
        }
    };
    private final lbn kmr = new lbn(this){
        final /* synthetic */ hgd kmy;
        {
            this.kmy = hgd2;
        }

        public final void W() {
            hgd.b(this.kmy);
        }
    };
    private final lbi<ghy> kms = new lbi<ghy>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgd kmy;
        {
            this.kmy = hgd2;
        }

        public void a(ghy ghy2) {
            switch (ghy2.ex) {
                case 1: {
                    hgd.a(this.kmy, ghy2.eei);
                    hgd.c(this.kmy);
                    hgd.b(this.kmy);
                    break;
                }
                case 2: {
                    hgd.a(this.kmy, 4);
                    return;
                }
                default: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    return;
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((ghy)object);
        }

        static {
            $assertionsDisabled = !hgd.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private final hqr jGH;
    private List<ldp> kmt = lcn.emv();
    private Map<cak.c, cad> kmu;
    private List<a> kmv = lcn.emv();
    private b kmw;
    private b kmx;

    private static hog.a k(hdm hdm2) {
        return new hog.a(hdm2.jYx, lgg.rlI, lgg.rlI, lhf.rnv);
    }

    public hgd(hdm hdm2, String string, lgg lgg2, lhf lhf2, ldv ldv2) {
        super((hnc)hdm2, string, lgg2, lhf2, hgd.k(hdm2));
        assert (ldv2 != null);
        this.kmg = ldv2;
        int n = lhf2.rmN - 2;
        how how2 = new how((hnc)hdm2, null, new lgg(0, 0), new lhf(n, 495), hdm2.kKk);
        this.j(how2);
        this.kmh = new hpa(this.kLu, (String)null, new lgg(0, 0), null, hdm2.jXk.jMw);
        this.j(this.kmh);
        int n2 = 100;
        this.jGH = new hqr(this.kLu, (String)null, new lgg(0, n2), lhf.rnv, hdm2.kJZ);
        this.kmj = new hog((hnc)hdm2, (String)null, new lgg(0, 0), new lhf(n - 20, 480), hdm2.krh);
        n2 = 492;
        this.jGH.cwt().cqd().a(this.kmj);
        this.j(this.jGH);
        this.p(this.jGH);
        jwa jwa2 = new jwa();
        int n3 = -1;
        try {
            n3 = dsv.byP().jp();
            if (n3 < 0) {
                lfn.b(5, this.getClass().getSimpleName(), "SFComponentInteractionBarber() : Char Type is invalid.");
                assert (false);
            }
            String string2 = lea.enW().getName(n3);
            this.kmt = jwa2.uC(string2);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        int n4 = 8;
        int n5 = 8;
        int n6 = 42;
        int n7 = 140;
        int n8 = 32;
        int n9 = 0;
        assert (n3 != -1);
        n9 = cg.s(n3);
        Object object = cg.gV[n9];
        lhu object22 = hbo.jDp[n9];
        this.kmw = new b(this, 3, cak.c.egl);
        this.a(n4, n5, n7 + 30, n8, "Hair Color", this.kmw, (String)object, object22);
        object = cg.gU[n9];
        lhu lhu2 = hbo.jDo[n9];
        this.kmx = new b(this, 4, cak.c.egk);
        this.a(n4, n5 += n6, n7, n8, "Skin Tone", this.kmx, (String)object, lhu2);
        n5 += n6;
        for (ldp ldp2 : this.kmt) {
            Object object2 = new lgg(n4, n5);
            Object object3 = new hpa(this.kLu, "", (lgg)object2, null, this.cbO().jXk.jMv);
            this.kmj.j((hms)object3);
            object2 = new lhf(180, 50);
            object3 = new lgg(n4 + 10, n5 + 9);
            Object object4 = new hpe(this.kLu, "", (lgg)object3, (lhf)object2, this.cbO().kIy, ldp2.DisplayName);
            this.kmj.j((hms)object4);
            object2 = null;
            float f2 = 0.0f;
            if (ldp2.ksh >= 0 && ldp2.ksh < ldp2.reW.length && (object4 = (lgw)lea.enW().zx(ldp2.reW[ldp2.ksh])) != null) {
                f2 = this.d((lgw)object4);
            }
            object4 = new ljd(f2);
            lhf lhf3 = new lhf(180, 50);
            lgg lgg3 = new lgg(n4 + 375, n5 + 9);
            object2 = new hpe(this.kLu, "", lgg3, lhf3, this.cbO().kIy, ((lip)object4).esy());
            this.kmj.j((hms)object2);
            object3 = new a(this, ldp2, true, (hpe)object2);
            object4 = new a(this, ldp2, false, (hpe)object2);
            int n10 = ldp2.reW.length;
            int n11 = ldp2.ksh;
            lgs lgs2 = new lgs(n4 + this.jDM.rmN, n5 + this.jDM.H, n7, n8);
            hbk hbk2 = new hbk((hlv)this.cbO(), lgs2, (lbn)object4, (lbn)object3, this.ch(n11, n10), false);
            ((a)object3).a(hbk2);
            ((a)object4).a(hbk2);
            hbk2.LC(n11);
            hbk2.LD(n10);
            this.kmj.j(hbk2);
            this.kmv.add((a)object3);
            lbn lbn2 = new lbn(this, (a)object3){
                final /* synthetic */ a kmz;
                final /* synthetic */ hgd kmy;
                {
                    this.kmy = hgd2;
                    this.kmz = a2;
                }

                public final void W() {
                    this.kmz.ciM();
                }
            };
            lgg lgg4 = new lgg(n4 + 155, n5 + 10);
            hqz hqz2 = new hqz(this.kLu, null, lgg4, this.cbO().jXk.jMx.kLY, hpx.a.kXm, this.cbO().kJH, this.cbO().jXk.jMx);
            hqz2.cvC().a(true, lbn2);
            this.kmj.j(hqz2);
            ((a)object3).kmD = hqz2;
            ((a)object4).kmD = hqz2;
            n5 += n6;
        }
        this.kmi = new hpa(this.kLu, (String)null, new lgg(0, n2), new lhf(n, 4), hdm2.jXk.jOa);
        this.j(this.kmi);
        this.kmk = new how(this.kLu, null, new lgg(0, n2 += this.kmi.cqv().H), new lhf(n, 40), hdm2.kKk);
        this.j(this.kmk);
        this.kml = new hpe(this.kLu, null, new lgg(10, 10), new lhf(148, 32), hdm2.kIy, lcy.qVJ.esy());
        this.kmk.j(this.kml);
        this.kmm = new hpe(this.kLu, null, new lgg(140, 2), new lhf(66, 32), hdm2.kIX, lcy.qVc.esy());
        this.kmk.j(this.kmm);
        this.kmn = new hqy(this.kLu, null, new lgg(338, 4), new lhf(128, 32), hpx.a.kXm, hdm2.kJK, lcy.qVM.esy());
        this.kmn.cvC().a(true, this.kmq);
        this.kmk.j(this.kmn);
        this.kkz = new hqy(this.kLu, null, new lgg(258, 4), new lhf(64, 32), hpx.a.kXm, hdm2.kJK, lcy.qVN.esy());
        this.kkz.cvC().a(true, this.kkJ);
        this.kmk.j(this.kkz);
    }

    private float d(lgw lgw2) {
        float f2 = 0.0f;
        f2 = lgw2.erL() == 0.0f ? 150.0f : lgw2.erL();
        return f2;
    }

    private void a(int n, int n2, int n3, int n4, String string, b b2, String string2, lhu lhu2) {
        Object object = new lgg(n, n2);
        Object object2 = new hpa(this.kLu, "", (lgg)object, null, this.cbO().jXk.jMv);
        this.kmj.j((hms)object2);
        object = new lhf(180, 50);
        object2 = new lgg(n + 10, n2 + 9);
        hpe hpe2 = new hpe(this.kLu, "", (lgg)object2, (lhf)object, this.cbO().kIy, string);
        this.kmj.j(hpe2);
        object = new hqi.a(new hqh.b(this.cbO().jHw, ldb.reo, this.cbO().kIn.kEj, lhu2, this.cbO().kIn.kEl, lcq.COLORSHIFT_NEUTRAL, this.cbO().kIn.kEn, this.cbO().kIn.kEo), hlv.I((String)string2));
        object2 = new hqi(this.kLu, "", new lgg(n + this.jDM.rmN, n2), new lhf(144, 42), (hqi.a)object, new lcq(1.0f, 1.0f, 1.0f, 1.0f), b2);
        b2.a((hqi)object2);
        this.kmj.j((hms)object2);
        float f2 = 150.0f;
        Object object3 = new ljd(f2);
        Object object4 = new lhf(180, 50);
        lgg lgg2 = new lgg(n + 375, n2 + 9);
        hpe hpe3 = new hpe(this.kLu, "", lgg2, (lhf)object4, this.cbO().kIy, ((lip)object3).esy());
        this.kmj.j(hpe3);
        b2.kmE = hpe3;
        lbn lbn2 = new lbn(this, b2){
            final /* synthetic */ b kmA;
            final /* synthetic */ hgd kmy;
            {
                this.kmy = hgd2;
                this.kmA = b2;
            }

            public final void W() {
                this.kmA.reset();
            }
        };
        object3 = new lgg(n + 155, n2 + 10);
        object4 = new hqz(this.kLu, null, (lgg)object3, this.cbO().jXk.jMx.kLY, hpx.a.kXm, this.cbO().kJH, this.cbO().jXk.jMx);
        ((hpx)object4).cvC().a(true, lbn2);
        this.kmj.j((hms)object4);
        b2.kmD = (hqz)object4;
    }

    private String ch(int n, int n2) {
        String string = "" + (n + 1) + " " + lcx.qRz.esy() + " " + n2;
        return string;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.ciI();
        int n = this.getHeight() - 140;
        this.jGH.cC(this.getWidth(), n);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected boolean LM(int n) {
        boolean bl = this.jGH.Nj(n);
        return true;
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private float ciG() {
        float f2 = 0.0f;
        for (ldp ldp2 : this.kmt) {
            lgw lgw2;
            float f3;
            if (ldp2.ksh == -1) continue;
            String string = ldp2.reW[ldp2.ksh];
            if (string.length() == 0 && ldp2.ksh != this.a(ldp2)) {
                f2 += 150.0f;
                continue;
            }
            ler ler2 = lea.enW().zx(string);
            if (ler2 == null || !(ler2 instanceof lgw) || (f3 = this.d(lgw2 = (lgw)ler2)) == 0.0f) continue;
            if (f3 < 0.0f) {
                lfn.b(5, this.getClass().getSimpleName(), "calculateTotal() : BaseCost is below zero: " + f3);
                continue;
            }
            if (ldp2.ksh == this.a(ldp2)) {
                f3 = 0.0f;
            }
            f2 += f3;
        }
        if (this.kmw.hasChanged() && this.kmw.jDR != null && this.kmu.get((Object)cak.c.egl) != null) {
            f2 += 150.0f;
        }
        if (this.kmx.hasChanged() && this.kmx.jDR != null && this.kmu.get((Object)cak.c.egk) != null) {
            f2 += 150.0f;
        }
        return f2;
    }

    private void ciH() {
        Object object;
        int n;
        ArrayList<Integer> arrayList = lcn.emv();
        ArrayList<Integer> arrayList2 = lcn.emv();
        for (ldp ldp2 : this.kmt) {
            cad cad2;
            cak.c c2;
            if (ldp2.ksh == -1) continue;
            String string = ldp2.reW[ldp2.ksh];
            n = lea.enW().getType(string);
            if (n == -1 && !string.equals("")) continue;
            if (string.equals("")) {
                string = ldp2.reW[1];
                n = lea.enW().getType(string);
                c2 = this.getLayerType(n);
                cad2 = this.kmu.get((Object)c2);
                if (c2 == null || cad2 == null) continue;
                arrayList.add(c2.ordinal());
                arrayList2.add(ldp2.ksh);
                continue;
            }
            c2 = this.getLayerType(n);
            cad2 = this.kmu.get((Object)c2);
            if (cad2 != null && cad2.ResourceType == n) continue;
            arrayList.add(c2.ordinal());
            arrayList2.add(ldp2.ksh);
        }
        if (this.kmw.hasChanged() && this.kmw.jDR != null && this.kmu.get((Object)cak.c.egl) != null) {
            object = (cac)this.kmu.get((Object)cak.c.egl);
            if (!this.kmw.jDR.cwr().X(((cac)object).dMT)) {
                arrayList.add(cak.c.egl.ordinal());
                arrayList2.add(new Integer((int)this.kmw.jDR.cum()));
            }
        }
        if (this.kmx.hasChanged() && this.kmx.jDR != null && this.kmu.get((Object)cak.c.egk) != null) {
            object = (cac)this.kmu.get((Object)cak.c.egk);
            if (!this.kmx.jDR.cwr().X(((cac)object).dMT)) {
                arrayList.add(cak.c.egk.ordinal());
                arrayList2.add(new Integer((int)this.kmx.jDR.cum()));
            }
        }
        if (arrayList2.size() != arrayList.size()) {
            lfn.b(5, this.getClass().getSimpleName(), "buyButtonPressed() : Indexes.size (" + arrayList2.size() + ") != LayerTypes.size (" + arrayList.size() + ")");
            assert (false) : "WTF";
            return;
        }
        if (arrayList2.size() == 0) {
            return;
        }
        this.Mt(3);
        object = new int[arrayList2.size()];
        int n2 = arrayList2.size();
        for (int i = 0; i < n2; ++i) {
            object[i] = (Integer)arrayList2.get(i);
        }
        int[] nArray = new int[arrayList.size()];
        n = arrayList.size();
        for (n2 = 0; n2 < n; ++n2) {
            nArray[n2] = (Integer)arrayList.get(n2);
        }
        fky fky2 = (fky)this.cbO().cdj.CW(11781);
        fky2.on(this.kmg);
        fky2.f(lcr.acL);
        fky2.imt = (int[])object;
        fky2.ims = nArray;
        fky2.YN = this.cbP().kck.hC;
        this.cbP().kck.a(fky2);
    }

    private cak.c getLayerType(int n) {
        lgw lgw2 = (lgw)lea.enW().acv(n);
        if (lgw2 == null) {
            return null;
        }
        return lgw2.auO();
    }

    private void ciI() {
        float f2 = this.ciG();
        ljd ljd2 = new ljd(f2);
        this.kmm.mV(((lip)ljd2).esy());
        boolean bl = f2 <= this.cbP().kck.kyz.cfq();
        this.kmn.og(!bl);
        for (a a2 : this.kmv) {
            a2.ciL();
        }
        this.kmw.ciL();
        this.kmx.ciL();
    }

    private void mU(boolean bl) {
        if (bl) {
            this.Mt(1);
            this.ciJ();
        } else {
            this.Mt(2);
            this.ciK();
        }
        this.cbP().kci.a(this.kms, bl);
        this.cbP().kck.kyz.cfa().a(bl, this.kmr);
    }

    private void Mt(int n) {
        ghx ghx2 = (ghx)this.cbO().cdj.CW(7686);
        ghx2.on(this.cbP().kck.hC);
        ghx2.f(lcr.acL);
        ghx2.Type = n;
        this.cbP().kck.a(ghx2);
    }

    public int a(ldp ldp2) {
        int n = 0;
        if (this.kmu == null) {
            return n;
        }
        int n2 = lea.enW().getType(ldp2.reW[1]);
        if (n2 < 0) {
            return n;
        }
        cak.c c2 = this.getLayerType(n2);
        cad cad2 = this.kmu.get((Object)c2);
        if (cad2 == null) {
            return n;
        }
        String string = cad2.pa();
        for (int i = 0; i < ldp2.reW.length; ++i) {
            if (!ldp2.reW[i].equalsIgnoreCase(string)) continue;
            n = i;
            return n;
        }
        return n;
    }

    private void caS() {
        if (this.kmv == null || this.kmv.isEmpty()) {
            return;
        }
        this.kmp = false;
        for (a a2 : this.kmv) {
            a2.ciM();
        }
        this.kmw.reset();
        this.kmx.reset();
        this.kmp = true;
    }

    protected final void a(int n, int n2, lcq lcq2) {
        if (!this.kmp) {
            return;
        }
        if (n == 3 || n == 4 ? !$assertionsDisabled && lcq2 == null : !$assertionsDisabled && n2 <= 0) {
            throw new AssertionError();
        }
        fdy fdy2 = (fdy)this.cbO().cdj.CW(9241);
        fdy2.on(this.cbP().kck.hC);
        fdy2.f(lcr.acL);
        fdy2.bst = bkd.dqL;
        fdy2.aZG = this.cbP().kck.hC;
        fdy2.akX = this.cbP().kck.hC;
        fdy2.ilu = n;
        fdy2.ResourceType = n2;
        fdy2.dMT = lcq2;
        this.cbP().kck.a(fdy2);
    }

    private void ciJ() {
        ecz ecz2 = (ecz)this.cbO().cdj.CW(2052);
        ecz2.on(lcr.qBR);
        ecz2.f(lcr.acL);
        ecz2.imc = jps.a.nPJ;
        ecz2.aZF = 1;
        ecz2.imd = false;
        this.cbP().kck.a(ecz2);
    }

    private void ciK() {
        ecz ecz2 = (ecz)this.cbO().cdj.CW(2052);
        ecz2.on(lcr.qBR);
        ecz2.f(lcr.acL);
        ecz2.aZF = 2;
        ecz2.imd = true;
        ecz2.ime = jps.a.nPJ;
        this.cbP().kck.a(ecz2);
    }

    static /* synthetic */ void a(hgd hgd2) {
        hgd2.ciH();
    }

    static /* synthetic */ void a(hgd hgd2, int n) {
        hgd2.Mt(n);
    }

    static /* synthetic */ void b(hgd hgd2) {
        hgd2.ciI();
    }

    static /* synthetic */ Map a(hgd hgd2, Map map) {
        hgd2.kmu = map;
        return hgd2.kmu;
    }

    static /* synthetic */ void c(hgd hgd2) {
        hgd2.caS();
    }

    static /* synthetic */ Map d(hgd hgd2) {
        return hgd2.kmu;
    }

    static /* synthetic */ float a(hgd hgd2, lgw lgw2) {
        return hgd2.d(lgw2);
    }

    static /* synthetic */ String a(hgd hgd2, int n, int n2) {
        return hgd2.ch(n, n2);
    }
}

