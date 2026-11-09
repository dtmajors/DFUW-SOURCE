/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  ep
 *  hdm
 *  lcy
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hfs
extends hog {
    private final hpe[] kkg;
    private final hpe[] kkh;
    private final lij<hdw> kki;
    private final hiy kkj;
    private final hqr kkk;
    private final hpe kkl;
    private final lgg kkm;
    private final a kkn;
    private final hpe kko;
    private final hpe kkp;
    private final hpe kkq;
    private final hpe kkr;
    private final hqr kks;
    private final hoq<ctm> kkt;
    private final hpe kku;
    private final hpe kkv;
    private final hpe kkw;
    private final hpe kkx;
    private final hpx kky;
    private final hqy kkz;
    private final hdx kkA;
    private final hdw kkB;
    private final hea kkC;
    private final lhu kkD;
    private final b kkE;
    private final hnm kkF;
    private final List<String> kkG;
    private final lbn kkH;
    @Deprecated
    private final lbn kkI;
    private final lbp jAY;
    private final lbn kkJ;
    private final lbn kkK;
    private final lbn kkL;
    private final lbn kkM;
    private final lbn kkN;
    private boolean Initialized;
    private hqm kkO;

    private static hog.a k(hdm hdm2) {
        return new hog.a(hdm2.jYv, lgg.rlI, lgg.rlI, lhf.rnv);
    }

    public hfs(hdm hdm2, String string, lgg lgg2, hdx hdx2, hdw hdw2) {
        hdm2.jXk.getClass();
        super((hnc)hdm2, string, lgg2, new lhf(298, 0), hfs.k(hdm2));
        this.kki = new lij();
        this.kkG = lcn.emv();
        this.kkH = new lbn(this){
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final void W() {
                hfs.a(this.kkP);
            }
        };
        this.kkI = new lbn(this){
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final void W() {
                hdw hdw2 = (hdw)hfs.b(this.kkP).getSelectedItem();
                if (hdw2 == null) {
                    return;
                }
                if (hfs.b((hfs)this.kkP).kVB.H(hdw2)) {
                    boolean bl = hfs.b((hfs)this.kkP).kVB.I(hdw2);
                    hfs.b(this.kkP).a(hdw2, !bl, true);
                } else if (!this.kkP.cbP().kcf.a(hfs.c(this.kkP), hdw2)) {
                    this.kkP.kLu.a(this.kkP.cbO().kIn.kEB);
                } else {
                    this.kkP.cbP().kcf.a(hfs.d(this.kkP), hdw2, 0);
                }
            }
        };
        this.jAY = new lbp(this){
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final boolean caU() {
                this.kkP.cbP().kcf.cnF();
                return true;
            }
        };
        this.kkJ = new lbn(this){
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final void W() {
                this.kkP.cbP().kcf.cnF();
            }
        };
        this.kkK = new lbn(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final void W() {
                hdw hdw2 = (hdw)hfs.b(this.kkP).getSelectedItem();
                if (hdw2 != null) {
                    int n = (int)hfs.e(this.kkP).cqg().cpZ();
                    if (n < 1) {
                        if (!$assertionsDisabled) {
                            throw new AssertionError((Object)("Invalid value: " + n));
                        }
                        n = 1;
                    }
                    this.kkP.cbP().kcf.a(hfs.d(this.kkP), hdw2, --n);
                }
            }

            static {
                $assertionsDisabled = !hfs.class.desiredAssertionStatus();
            }
        };
        this.kkL = new lbn(this){
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final void W() {
                hfs.f(this.kkP);
            }
        };
        this.kkM = new lbn(this){
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final void W() {
                this.kkP.refresh();
            }
        };
        this.kkN = new lbn(this){
            final /* synthetic */ hfs kkP;
            {
                this.kkP = hfs2;
            }

            public final void W() {
                this.kkP.refresh();
            }
        };
        this.kkG.add("Display Name");
        this.kkG.add("Durability Max");
        this.kkA = hdx2;
        this.kkD = this.Mp(hdx2.Type);
        this.kkE = new b();
        this.kkB = hdw2;
        hdm2.jXk.getClass();
        this.kkg = new hpe[7];
        hdm2.jXk.getClass();
        this.kkh = new hpe[7];
        this.kkC = this.cbP().kck.b(this.kkA);
        assert (this.kkC != null);
        assert (this.kkC.getLevel() > 0.0f);
        int n = hdm2.jXk.jTB.cf;
        int n2 = hdm2.jXk.jTB.cg;
        this.kkl = new hpe((hnc)hdm2, null, new lgg(n * 2, n2), new lhf(this.getWidth() - hdm2.jXk.jTB.cf - n, 16), hdm2.kIT, lcy.qZI.esy());
        n2 += this.kkl.getHeight();
        this.j(this.kkl);
        String string2 = null;
        lgg lgg3 = new lgg(n, n2 += 16);
        int n3 = this.getWidth() - hdm2.jXk.jTB.cf - n;
        hdm2.jXk.getClass();
        this.kkk = new hqr((hnc)hdm2, string2, lgg3, new lhf(n3, (int)(5.5f * 16.0f)), hdm2.jGK);
        n2 += this.kkk.getHeight();
        this.j(this.kkk);
        this.kkj = new hiy(hdm2, (String)null, lgg.rlI, lhf.rnv, this.kki, this.kkC, hdm2.jXk.jNT);
        this.kkk.cwt().cqd().a(this.kkj);
        this.kkm = new lgg(n, n2 += hdm2.jXk.jTB.cg);
        hpa hpa2 = new hpa((hnc)hdm2, (String)null, new lgg(n, n2), hdm2.jXk.jTu, hdm2.jXk.jTt);
        this.j(hpa2);
        this.kkn = new a(this, (hnc)hdm2, (String)null, this.kkm, hdm2.jXk.jTA, lhu.rnR);
        this.j(this.kkn);
        hdm2.jXk.getClass();
        this.kko = new hpe((hnc)hdm2, null, new lgg(n += 128 + hdm2.jXk.jTB.cf, n2 + 6), new lhf(this.getWidth() - hdm2.jXk.jTB.cf - n, 26), hdm2.kJd, "");
        this.j(this.kko);
        this.kkp = new hpe((hnc)hdm2, null, new lgg(n, n2 + 30), new lhf(this.getWidth() - hdm2.jXk.jTB.cf - n - 10, 110), hdm2.kJg, "");
        this.j(this.kkp);
        n = hdm2.jXk.jTB.cf;
        this.kkq = new hpe((hnc)hdm2, null, new lgg(hdm2.jXk.jTB.cf * 2, n2 += this.kkn.getHeight() + 7), new lhf(this.getWidth() - hdm2.jXk.jTB.cf - n - 10, 110), hdm2.kJd, "Requirements:");
        this.j(this.kkq);
        n2 += 16;
        int n4 = 0;
        while (true) {
            hdm2.jXk.getClass();
            if (n4 >= 7) break;
            int n5 = n + hdm2.jXk.jTB.cf;
            String string3 = null;
            lgg lgg4 = new lgg(n5, n2);
            hdm2.jXk.getClass();
            this.kkg[n4] = new hpe((hnc)hdm2, string3, lgg4, new lhf(128 + 80, 16), hdm2.kIT, "");
            this.j(this.kkg[n4]);
            this.kkh[n4] = new hpe((hnc)hdm2, null, new lgg(n5 += this.kkg[n4].getWidth(), n2), new lhf(this.getWidth() - hdm2.jXk.jTB.cf - n5, 16), hdm2.kIT, "");
            this.j(this.kkh[n4]);
            n2 += 16;
            ++n4;
        }
        n2 = 410;
        n = hdm2.jXk.jTB.cf;
        this.kkr = new hpe((hnc)hdm2, null, new lgg(n, n2), new lhf(130, 16), hdm2.kJd, lcy.qZJ.esy());
        this.j(this.kkr);
        n4 = this.getWidth() - hdm2.jXk.jTB.cf * 2;
        String string4 = null;
        lgg lgg5 = new lgg(hdm2.jXk.jTB.cf, n2 += this.kkr.getHeight());
        hdm2.jXk.getClass();
        this.kks = new hqr((hnc)hdm2, string4, lgg5, new lhf(n4, (int)(4.5f * 16.0f)), hdm2.jGK);
        this.j(this.kks);
        n2 += this.kks.getHeight();
        this.kkF = new hnm(this.kkE.p(ldb.rep));
        this.kkt = new hoq<ctm>((hnc)hdm2, null, lgg.rlI, lhf.rnv, hdm2.kKz, new hoq.c[]{hdm2.kKE, hdm2.kKE, hdm2.kKE}, new int[]{150, 54, 54}, this.kkE, this.kkF);
        this.kks.cwt().cqd().a(this.kkt);
        this.kku = new hpe((hnc)hdm2, null, new lgg(hdm2.jXk.jTB.cf * 2, n2 += hdm2.jXk.jTB.cg), new lhf(200, 16), hdm2.kJd, lcy.qZK.esy());
        this.j(this.kku);
        this.kkv = new hpe((hnc)hdm2, null, new lgg(this.kku.getWidth() + hdm2.jXk.jTB.cf, n2), new lhf(70, 16), hdm2.kIX, "");
        this.j(this.kkv);
        n2 += this.kkv.getHeight();
        this.kkw = new hpe((hnc)hdm2, null, new lgg(hdm2.jXk.jTB.cf * 2, (n2 += hdm2.jXk.jTB.cg) - 10), new lhf(200, 16), hdm2.kJd, lcy.rbk.esy());
        this.j(this.kkw);
        this.kkx = new hpe((hnc)hdm2, null, new lgg(this.kkw.getWidth() + hdm2.jXk.jTB.cf, n2 - 10), new lhf(70, 16), hdm2.kIX, "");
        this.j(this.kkx);
        n2 += this.kkw.getHeight();
        hpe hpe2 = new hpe((hnc)hdm2, null, new lgg(hdm2.jXk.jTB.cf, (n2 += 2) + 8), new lhf(55, 16), hdm2.kJd, lcy.qZL.esy());
        this.j(hpe2);
        hdm2.jXk.getClass();
        n = 298 - (hdm2.jXk.jTB.cf + hdm2.jXk.jTz.rmN) * 2;
        this.kky = new hqy((hnc)hdm2, null, new lgg(n, n2), hdm2.jXk.jTz, hpx.a.kXm, hdm2.kJK, lcy.qZM.esy());
        this.kky.cvC().a(true, this.kkK);
        this.j(this.kky);
        this.kky.og(true);
        hdm2.jXk.getClass();
        n = 298 - (hdm2.jXk.jTB.cf + hdm2.jXk.jTz.rmN);
        this.kkz = new hqy((hnc)hdm2, null, new lgg(n, n2), hdm2.jXk.jTz, hpx.a.kXm, hdm2.kJK, lcy.qUX.esy());
        this.kkz.cvC().a(true, this.kkJ);
        this.j(this.kkz);
        n = 68;
        this.kkO = new hqm(this.kLu, null, new lgg(n, n2 + 4), new lhf(54, 24), hdm2.kKw, 1.0, 100.0, 1.0, 0, 1.0);
        this.j(this.kkO);
        n2 += this.kky.getHeight();
        this.Nh(n2 += hdm2.jXk.jTB.cg);
        this.cip();
        this.ccu();
    }

    private lhu Mp(int n) {
        String string = null;
        if (n == cxd.fJX) {
            string = "gui/crafting_weaponsmithing.dds";
        } else if (n == cxd.fJF) {
            string = "gui/crafting_taming.dds";
        } else if (n == cxd.fJW) {
            string = "gui/crafting_armorsmithing.dds";
        } else if (n == cxd.fIP) {
            string = "gui/crafting_alchemy.dds";
        } else if (n == cxd.fIW) {
            string = "gui/crafting_woodcutting.dds";
        } else if (n == cxd.fIV) {
            string = "gui/crafting_tailoring.dds";
        } else if (n == cxd.fIU) {
            string = "gui/crafting_smelting.dds";
        } else if (n == cxd.fIT) {
            string = "gui/crafting_jewelsmithing.dds";
        } else if (n == cxd.fIS) {
            string = "gui/crafting_cooking.dds";
        } else if (n == cxd.fIR) {
            string = "gui/crafting_construction.dds";
        } else if (n == cxd.fIQ) {
            string = "gui/crafting_bowyer.dds";
        } else if (n == cxd.fIX) {
            string = "gui/crafting_warhulk_construction.dds";
        } else {
            return lhu.rnR;
        }
        lhu lhu2 = new lhu(new lhf(128, 128), string);
        return lhu2;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccd() {
        assert (this.Initialized);
        super.ccd();
        this.ccu();
    }

    private void ccu() {
        int[] nArray = cwy.d(this.kkA.Type, this.kkB.Type, false);
        assert (nArray != null);
        this.kki.clear();
        les les2 = lea.enW();
        int n = 0;
        for (int i = 0; i < nArray.length; ++i) {
            ler ler2 = les2.acv(nArray[i]);
            hdw hdw2 = hdw.LW(ler2.getType());
            n += this.a(this.kki, les2, hdw2, null);
        }
        this.kki.a(null, hdw.kbg, true);
        this.kkj.cmK();
        this.ciq();
    }

    private void cip() {
        boolean bl = this.cbP().kcf.cnI();
        this.kky.og(bl);
        lip lip2 = bl ? lcy.qUY : lcy.qUX;
        this.kkz.setText(lip2.esy());
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private int a(lij<hdw> lij2, les les2, hdw hdw2, hdw hdw3) {
        if (hdw2.cem() == null) {
            ctu ctu2 = hdw2.mO(this.kkC.ceH().zg());
            if (ctu2 == null) {
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

    private void b(lij<hdw> lij2, hdw hdw2) {
    }

    @Deprecated
    private void ciq() {
        String string;
        int[] nArray;
        ctm[] ctmArray;
        Object object;
        hdw hdw2 = (hdw)this.kkj.getSelectedItem();
        if (hdw2 == null) {
            object = this.kkD;
        } else if (hdw2.cem() != null) {
            this.kkn.kkQ = null;
            object = this.kkD;
        } else {
            this.kkn.kkQ = hdw2;
            object = hdw2.atw();
        }
        this.kkn.a((lhu)object);
        this.kkn.cB(this.kkm.cf + (this.cbO().jXk.jTA.rmN - ((lhu)object).kLY.rmN) / 2, this.kkm.cg + (this.cbO().jXk.jTA.H - ((lhu)object).kLY.H) / 2);
        this.kkn.d(((lhu)object).kLY);
        object = hdw2 == null ? ljg.roH : hdw2.cdY();
        this.kko.mV(((lip)object).esy());
        if (this.kkn.kkQ != null && hdw2 != null) {
            object = hdw2.cei();
            this.kkp.mV(((lip)object).esy());
        } else {
            this.kkp.mV("");
        }
        this.cbO().jXk.getClass();
        int n = 7;
        List<lfs<String, String>> list = this.d(hdw2);
        int n2 = 0;
        Iterator<lfs<String, String>> iterator = list.iterator();
        while (iterator.hasNext()) {
            ctmArray = iterator.next();
            if (n2 == n) break;
            this.kkg[n2].mV((String)ctmArray.reX);
            this.kkh[n2].mV((String)ctmArray.reY);
            ++n2;
        }
        if (n2 < n) {
            for (int i = n2; i < n; ++i) {
                this.kkg[i].mV("");
                this.kkh[i].mV("");
            }
        }
        this.kkg[n - 1].mV("See tooltip for attributes.");
        this.kkh[n - 1].mV("");
        Iterator<lfs<String, String>> iterator2 = iterator = hdw2 == null ? null : hdw2.mO(this.kkC.ceH().zg());
        if (iterator == null) {
            ctmArray = new ctm[]{};
            nArray = new int[]{};
        } else {
            ctmArray = this.kkC.e((ctu)((Object)iterator));
            assert (ctmArray != null);
            nArray = this.kkC.a((ctu)((Object)iterator));
            assert (nArray != null);
            assert (nArray.length == ctmArray.length);
        }
        this.kkE.a(ctmArray, nArray);
        boolean bl = hdw2 != null && this.kkC.a(hdw2);
        this.kky.og(!bl);
        if (iterator == null) {
            string = "";
        } else {
            float f2 = this.kkC.f((ctu)((Object)iterator));
            if (!bl) {
                f2 = 0.0f;
            }
            lje lje2 = new lje(f2);
            string = lje2.esy();
        }
        this.kkv.mV(string);
        if (iterator == null) {
            string = "";
        } else {
            double d2 = this.kkC.g((ctu)((Object)iterator));
            liv liv2 = new liv(d2);
            string = ((lip)liv2).esy();
        }
        this.kkx.mV(string);
    }

    private List<lfs<String, String>> c(hdw hdw2) {
        ej[] ejArray;
        ArrayList<lfs<String, String>> arrayList = lcn.emv();
        if (hdw2 == null) {
            ejArray = new ej[]{};
        } else {
            ejArray = hdw2.cer();
            arrayList.add(new lfs<String, String>("", ""));
            cur cur2 = lea.eos().get(lea.enW().getName(hdw2.Type));
            if (cur2 != null && lea.enW().isDescendant(hdw2.Type, cug.fiL)) {
                lfs<String, String> lfs2 = new lfs<String, String>(lcy.qRU.esy(), Float.toString(cur2.fyc));
                arrayList.add(lfs2);
                arrayList.add(new lfs<String, String>("", ""));
            }
        }
        for (int i = 0; i < ejArray.length; ++i) {
            if (ejArray[i] == null) continue;
            int n = ejArray[i].getType();
            String string = ejArray[i].toString();
            String string2 = ep.aM((int)n);
            if (this.kkG.contains(string2)) continue;
            if (string2.equals("Weapon Attack Time Multiplier")) {
                string2 = "Attack Speed";
                float f2 = ((Float)ejArray[i].getValue()).floatValue();
                if (f2 > 0.0f) {
                    f2 = 1.0f / f2;
                }
                string = String.valueOf(f2);
            } else if (string2.equals("Durability")) {
                string2 = "Base Durability";
            } else if (string2.equals("Nourishment Duration")) {
                double d2 = ((Float)ejArray[i].getValue()).doubleValue();
                liv liv2 = new liv(d2);
                string = ((lip)liv2).esy();
            }
            arrayList.add(new lfs<String, String>(string2, string));
        }
        return arrayList;
    }

    private List<lfs<String, String>> d(hdw hdw2) {
        ctu ctu2;
        ArrayList<lfs<String, String>> arrayList = lcn.emv();
        ctu ctu3 = ctu2 = hdw2 == null ? null : hdw2.mO(this.kkC.ceH().zg());
        if (ctu2 != null) {
            String string;
            ctz[] ctzArray = ctu2.bbI();
            if (ctzArray != null) {
                int n = ctzArray.length;
                for (int i = 0; i < n; ++i) {
                    String string2 = hdx.LX(ctzArray[i].SkillType).cdY().esy();
                    lfs<String, String> lfs2 = new lfs<String, String>(string2, Float.toString(ctzArray[i].SkillLevel));
                    arrayList.add(lfs2);
                    arrayList.add(new lfs<String, String>("-Max Level-", Float.toString(ctu2.bbK())));
                }
            }
            if (lea.enW().k(ctu2.bbH(), cug.fgJ, false) && (string = cug.uG((int)ctu2.bbH())) != null) {
                lfs<String, String> lfs3 = new lfs<String, String>("Required Race:", string);
                arrayList.add(lfs3);
            }
        }
        return arrayList;
    }

    private void mU(boolean bl) {
        this.kkj.jHT.crt().a(bl, this.kkH);
        this.kkj.cvi().a(bl, this.kkI);
        this.cbP().kcf.cnH().a(bl, this.kkL);
        this.cbP().kck.kyz.cfa().a(bl, this.kkM);
        this.kkC.cec().a(bl, this.kkN);
        this.a(bl, this.jAY, 27, jpn.nLm);
    }

    static /* synthetic */ List a(hfs hfs2, hdw hdw2) {
        return hfs2.c(hdw2);
    }

    static /* synthetic */ List b(hfs hfs2, hdw hdw2) {
        return hfs2.d(hdw2);
    }

    static /* synthetic */ void a(hfs hfs2) {
        hfs2.ciq();
    }

    static /* synthetic */ hiy b(hfs hfs2) {
        return hfs2.kkj;
    }

    static /* synthetic */ hea c(hfs hfs2) {
        return hfs2.kkC;
    }

    static /* synthetic */ hdx d(hfs hfs2) {
        return hfs2.kkA;
    }

    static /* synthetic */ hqm e(hfs hfs2) {
        return hfs2.kkO;
    }

    static /* synthetic */ void f(hfs hfs2) {
        hfs2.cip();
    }
}

