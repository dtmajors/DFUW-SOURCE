/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hjh {
    public static final a kxO = new a("Name", lod.a.rGh, lcy.rcr, b.kzc, -1);
    public static final a kxP = new a("Health", lnq.a.rFL, lcy.rcs, b.kzd, 352);
    public static final a kxQ = new a("HealthMax", lnq.a.rFL, lcy.rct, b.kzd, 354);
    public static final a kxR = new a("Stamina", lnq.a.rFL, lcy.rcu, b.kzd, 400);
    public static final a kxS = new a("StaminaMax", lnq.a.rFL, lcy.rcv, b.kzd, 402);
    public static final a kxT = new a("Mana", lnq.a.rFL, lcy.rcw, b.kzd, 384);
    public static final a kxU = new a("ManaMax", lnq.a.rFL, lcy.rcx, b.kzd, 386);
    public static final a kxV = new a("Alignment", lnu.a.rFR, lcy.rcy, b.kzd, 1296);
    public static final a kxW = new a("Suspect", lne.a.rFu, lcy.rcz, b.kzd, 1312);
    public static final a kxX = new a(null, null, null, b.kzd, 1488);
    public static final a kxY = new a("Strength", lnq.a.rFL, lcy.rcA, b.kzd, 208);
    public static final a kxZ = new a("Dexterity", lnq.a.rFL, lcy.rcB, b.kzd, 160);
    public static final a kya = new a("Intelligence", lnq.a.rFL, lcy.rcC, b.kzd, 176);
    public static final a kyb = new a("Wisdom", lnq.a.rFL, lcy.rcD, b.kzd, 240);
    public static final a kyc = new a("Role", lod.a.rGh, lcy.rcE, b.kzd, 11552);
    public static final a kyd = new a("Specialization", lod.a.rGh, lcy.rcF, b.kzd, 11536);
    public static final a kye = new a("Bludgeoning", lnq.a.rFL, lcy.rcI, b.kze, 1936);
    public static final a kyf = new a("Piercing", lnq.a.rFL, lcy.rcJ, b.kze, 4496);
    public static final a kyg = new a("Slashing", lnq.a.rFL, lcy.rcK, b.kze, 4912);
    public static final a kyh = new a("Acid", lnq.a.rFL, lcy.rcL, b.kze, 1680);
    public static final a kyi = new a("Arcane", lnq.a.rFL, lcy.rcM, b.kze, 1744);
    public static final a kyj = new a("Cold", lnq.a.rFL, lcy.rcN, b.kze, 2096);
    public static final a kyk = new a("Fire", lnq.a.rFL, lcy.rcO, b.kze, 2704);
    public static final a kyl = new a("Holy", lnq.a.rFL, lcy.rcP, b.kze, 3248);
    public static final a kym = new a("Impact", lnq.a.rFL, lcy.rcQ, b.kze, 3280);
    public static final a kyn = new a("Lightning", lnq.a.rFL, lcy.rcR, b.kze, 3536);
    public static final a kyo = new a("Unholy", lnq.a.rFL, lcy.rcS, b.kze, 5536);
    public static final a kyp = new a("Curse", lnq.a.rFL, lcy.rcT, b.kze, 3568);
    public static final a kyq = new a("Infliction", lnq.a.rFL, lcy.rcV, b.kze, 4464);
    public static final a kyr = new a("Archery", lnq.a.rFL, lcy.rcW, b.kze, 720);
    public static final a kys = new a("Magic", lnq.a.rFL, lcy.rcX, b.kze, 736);
    public static final a kyt = new a("Melee", lnq.a.rFL, lcy.rcY, b.kze, 752);
    public static final lfo ct = hbe.jAM;
    private static final Collection<a> kyu = lin.a(hjh.class, a.class, null, true, true, false);
    private static final Map<Integer, a> kyv;
    private static final int[] kyw;
    private static final int[] kyx;
    private final hjr kcj;
    private final lbd kyy;
    public final ldv hC;
    public final int SN;
    public final hef kyz;
    public final hee kyA;
    public final hee kyB;
    public final hee kyC;
    public final hee kyD;
    private final ldl kyE = new ldl();
    private final ldl kyF = new ldl();
    private final ldl kyG = new ldl();
    private final ldl kyH = new ldl();
    private final ldl kyI = new ldl();
    private final ldl kyJ = new ldl();
    private final lha<dxq, dxq> cdh;
    private Map<Integer, dcp> kyK;
    private static final lmx.a kyL;
    public final lmx kyM = new lmx(kyL);
    public final lmx kyN = new lmx(kyL);
    private final lbi<gjh> kyO = new lbi<gjh>(this){
        final /* synthetic */ hjh kyZ;
        {
            this.kyZ = hjh2;
        }

        public void b(gjh gjh2) {
            if (gjh2.jjf == 2) {
                ArrayList<hea> arrayList = new ArrayList<hea>();
                for (cxc cxc2 : gjh2.jiJ) {
                    hea hea2 = hjh.a((hjh)this.kyZ).kaV.qU(cxc2.getGUID());
                    if (hea2 == null) {
                        hdx hdx2 = hdx.LX(cxc2.zg());
                        hea2 = new hea(hjh.a((hjh)this.kyZ).kaV, cxc2.getGUID(), hdx2);
                    }
                    hea2.a(cxc2);
                    arrayList.add(hea2);
                }
                Collection<hdu> collection = this.kyZ.kyz.cfh();
                Collection<hdu> collection2 = lin.b(collection, hea.class);
                ArrayList<hdu> arrayList2 = new ArrayList<hdu>(collection2);
                arrayList2.addAll(arrayList);
                this.kyZ.kyz.l(arrayList2);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((gjh)object);
        }
    };
    private final lbi<eey> kyP = new lbi<eey>(this){
        final /* synthetic */ hjh kyZ;
        {
            this.kyZ = hjh2;
        }

        public void a(eey eey2) {
            hea hea2;
            hea hea3 = hea2 = eey2.iod[0] == null || eey2.iod[0].equals(ldv.rfd) ? null : hjh.a((hjh)this.kyZ).kaV.qV(eey2.iod[0]);
            if (lin.i(hea2, hjh.b(this.kyZ))) {
                return;
            }
            hjh.a(this.kyZ, hea2);
            hjh.c(this.kyZ).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((eey)object);
        }
    };
    private final lbi<eyv> kyQ = new lbi<eyv>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjh kyZ;
        {
            this.kyZ = hjh2;
        }

        public void b(eyv eyv2) {
            if (!$assertionsDisabled && eyv2.iFM == null) {
                throw new AssertionError();
            }
            hjh.a(this.kyZ, eyv2.iFM);
            hjh.d(this.kyZ).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.b((eyv)object);
        }

        static {
            $assertionsDisabled = !hjh.class.desiredAssertionStatus();
        }
    };
    private final lbi<gzp> kyR = new lbi<gzp>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjh kyZ;
        {
            this.kyZ = hjh2;
        }

        public void c(gzp gzp2) {
            if (!$assertionsDisabled && gzp2.aXP != 1 && gzp2.aXP != 2) {
                throw new AssertionError();
            }
            hjh.a(this.kyZ, gzp2.aO(), gzp2.bhp);
        }

        public /* synthetic */ void m(Object object) {
            this.c((gzp)object);
        }

        static {
            $assertionsDisabled = !hjh.class.desiredAssertionStatus();
        }
    };
    private final lbi<gzq> kyS = new lbi<gzq>(this){
        final /* synthetic */ hjh kyZ;
        {
            this.kyZ = hjh2;
        }

        public void c(gzq gzq2) {
            ej[] ejArray = gzq2.DR;
            ldv ldv2 = gzq2.aO();
            for (int i = 0; i < ejArray.length; ++i) {
                hjh.a(this.kyZ, ldv2, ejArray[i]);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.c((gzq)object);
        }
    };
    private final lbi<eff> kyT = new lbi<eff>(this){
        final /* synthetic */ hjh kyZ;
        {
            this.kyZ = hjh2;
        }

        public void a(eff eff2) {
            for (et et2 : eff2.iot) {
                if (et2 == null) continue;
                hjh.b(et2, this.kyZ.kyN, this.kyZ.kyM, hjh.cnw());
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((eff)object);
        }
    };
    private final lbn kmr = new lbn(this){
        final /* synthetic */ hjh kyZ;
        {
            this.kyZ = hjh2;
        }

        public final void W() {
            hjh.e(this.kyZ);
        }
    };
    private boolean jLT;
    private ldv kyU;
    private ljq Position = new ljq();
    private lgl Rotation = new lgl();
    private hea kyV;
    private alu[] kyW = new alu[0];
    private hdz kyX;
    private boolean kyY;

    private static List<lmx.a.a> cmY() {
        ArrayList<lmx.a.a> arrayList = new ArrayList<lmx.a.a>(kyu.size());
        for (a a2 : kyu) {
            if (a2.kza == null) continue;
            arrayList.add(new lmx.a.a(a2.kza, a2.Name));
        }
        return arrayList;
    }

    public hjh(lha<dxq, dxq> lha2, hjr hjr2, lbd lbd2, ldv ldv2, int n, ldv ldv3, ldv ldv4, ldv ldv5, ldv ldv6) {
        this.cdh = lha2;
        this.kcj = hjr2;
        this.kyy = lbd2;
        this.hC = ldv2;
        this.SN = n;
        this.kyz = this.kcj.kAw;
        String string = dsv.byP().iU();
        ((loc)this.kyN.AM(hjh.kxO.Name)).AO(string);
        hdz hdz2 = this.kcj.kaV.a(ldv3, hel.a.kel);
        this.kyA = new hee(null, this.cdh, this.kcj, this.kyz, hdz2, hdz2, bqm.b.dEn, lcy.rbl, true);
        hdz2 = this.kcj.kaV.a(ldv4, hel.a.kem);
        this.kyB = new hee(null, this.cdh, this.kcj, this.kyz, hdz2, hdz2, bqm.b.dEQ, lcy.rbr, true);
        hdz2 = this.kcj.kaV.a(ldv6, hel.a.kel);
        this.kyD = new hee(null, this.cdh, this.kcj, this.kcj.kAx, hdz2, hdz2, bqm.b.dEo, lcy.rbm, true);
        hdz2 = this.kcj.kaV.a(ldv5, hel.a.kem);
        this.kyC = new hee(null, this.cdh, this.kcj, this.kyz, hdz2, hdz2, bqm.b.dEN, null, true);
        this.kyC.cfd();
        this.jLT = true;
        this.nb(true);
        this.cnm();
        this.cnk();
        this.cnl();
        this.cnn();
    }

    public void dispose() {
        assert (this.jLT);
        if (this.kyD.isActive()) {
            this.kyD.cfe();
        }
        this.kyD.dispose();
        if (this.kyB.isActive()) {
            this.kyB.cfe();
        }
        this.kyB.dispose();
        if (this.kyA.isActive()) {
            this.kyA.cfe();
        }
        this.kyA.dispose();
        if (this.kyC.isActive()) {
            this.kyC.cfe();
        }
        this.kyC.dispose();
        this.nb(false);
        this.kyN.dispose();
        assert (this.kyE.isEmpty());
        assert (this.kyF.isEmpty());
        assert (this.kyG.isEmpty());
        assert (this.kyJ.isEmpty());
        assert (this.kyH.isEmpty());
        assert (this.kyI.isEmpty());
        this.jLT = false;
    }

    public final lbl<lbn> cmZ() {
        return this.kyE;
    }

    public final lbl<lbn> cna() {
        return this.kyN.cec();
    }

    public final lbl<lbn> cnb() {
        return this.kyF;
    }

    public final lbl<lbn> cnc() {
        return this.kyG;
    }

    public final void l(ldv ldv2, int n, int n2) {
        fky fky2 = fky.a(this.cdh.rng, ldv2, this.hC, this.kyz.kdD.dbx, ldv2);
        fky2.cZn = 1;
        fky2.dJc = n;
        fky2.gKW = n2;
        this.cdh.rnh.m(fky2);
    }

    public final void a(ldv ldv2, int n, int n2, int n3) {
        fky fky2 = fky.a(this.cdh.rng, ldv2, this.hC, this.kyz.kdD.dbx, ldv2);
        fky2.cZn = 2;
        fky2.dJc = n;
        fky2.gLa = n2;
        fky2.gKW = n3;
        this.cdh.rnh.m(fky2);
    }

    public final void j(ldv ldv2, ldv ldv3, int n) {
        fky fky2 = fky.a(this.cdh.rng, ldv2, this.hC, this.kyz.kdD.dbx, ldv3);
        fky2.iPh = n;
        this.cdh.rnh.m(fky2);
    }

    public final void qX(ldv ldv2) {
        this.cdh.rnh.m(fky.a(this.cdh.rng, ldv2, this.hC, this.kyz.kdD.dbx, null));
    }

    public final void a(dxq dxq2) {
        this.cdh.rnh.m(dxq2);
    }

    public final boolean e(hdx hdx2) {
        hea hea2 = this.b(hdx2);
        if (hea2 == null) {
            return false;
        }
        return hea2.getLevel() > 0.0f;
    }

    public final hea b(hdx hdx2) {
        Collection<hdu> collection = this.kyz.cfh();
        Collection<hea> collection2 = lin.a(collection, hea.class);
        for (hea hea2 : collection2) {
            if (!hea2.kaW.c(hdx2)) continue;
            return hea2;
        }
        return null;
    }

    public final hea cju() {
        return this.kyV;
    }

    public final ljq av() {
        return new ljq(this.Position);
    }

    public final ljq getRotation() {
        return this.Rotation.eqT();
    }

    public final String hl() {
        return ((loc)this.kyN.AM(hjh.kxO.Name)).getValue();
    }

    public final float afi() {
        return ((lnp)this.kyN.AM(hjh.kxP.Name)).getValue();
    }

    public final float cfC() {
        return ((lnp)this.kyN.AM(hjh.kxQ.Name)).getValue();
    }

    public final float cnd() {
        return ((lnp)this.kyN.AM(hjh.kxR.Name)).getValue();
    }

    public final float cne() {
        return ((lnp)this.kyN.AM(hjh.kxS.Name)).getValue();
    }

    public final float cnf() {
        return ((lnp)this.kyN.AM(hjh.kxT.Name)).getValue();
    }

    public final float cng() {
        return ((lnp)this.kyN.AM(hjh.kxU.Name)).getValue();
    }

    public final int cnh() {
        return ((lnt)this.kyN.AM(hjh.kxV.Name)).getValue();
    }

    public final boolean cni() {
        return ((lnd)this.kyN.AM(hjh.kxW.Name)).getValue();
    }

    public final alu[] cnj() {
        return this.kyW;
    }

    public final void n(hdu hdu2) {
        assert (this.jLT);
        assert (hdu2 != null);
        if (hdu2 instanceof hea) {
            this.cdh.rnh.m(efd.a(this.cdh.rng, this.hC, 3, hdu2.kaW.Type));
        } else if (hdu2 instanceof hdz) {
            this.cdh.rnh.m(flt.b(this.cdh.rng, ((hdz)hdu2).ceD(), hdu2.dbx));
        } else assert (false) : hdu2;
    }

    public final void cnk() {
        this.cdh.rnh.m(eex.a(this.cdh.rng, this.hC));
    }

    public final void cnl() {
        this.cdh.rnh.m(efe.a(this.cdh.rng, this.hC, kyx));
    }

    public final void cnm() {
        this.cdh.rnh.m(gjg.f(this.cdh.rng, this.hC, 2));
    }

    public final void cnn() {
        this.cdh.rnh.m(eyu.c(this.cdh.rng, this.hC));
    }

    public final void cno() {
        this.cdh.rnh.m(eeq.a(this.cdh.rng, this.hC, 5));
    }

    public final ldl cnp() {
        return this.kyH;
    }

    public final ldl cnq() {
        assert (this.jLT);
        return this.kyI;
    }

    public final ldl cnr() {
        return this.kyJ;
    }

    public final hdz cns() {
        return this.kyX;
    }

    public final boolean cnt() {
        return this.kyY;
    }

    private ldv a(ldv ldv2, dqi dqi2) {
        ldv ldv3 = this.kyy.caL();
        dqi2.setGUID(ldv3);
        dqi2.nC(lcr.acL);
        gzo gzo2 = gzo.g(this.cdh.rng);
        gzo2.jvG = dqi2;
        gzo2.on(ldv2);
        this.cdh.rnh.m(gzo2);
        return ldv3;
    }

    private void ae(ldv ldv2, ldv ldv3) {
        gzr gzr2 = gzr.h(this.cdh.rng);
        gzr2.bWM = ldv2;
        gzr2.on(ldv3);
        this.cdh.rnh.m(gzr2);
        this.kyy.qR(ldv2);
    }

    private void b(ldv ldv2, ej ej2) {
        if (ldv2.equals(this.kyU)) {
            int n = ej2.getType();
            switch (n) {
                case 1488: {
                    fc fc2 = (fc)ej2.getValue();
                    ljq ljq2 = fc2.Position;
                    lgl lgl2 = fc2.Rotation;
                    this.Position = new ljq(ljq2);
                    this.Rotation = new lgl(lgl2);
                    this.kyF.enp();
                    break;
                }
                default: {
                    hjh.a(ej2, this.kyN, this.kyM, kyv);
                    break;
                }
            }
        } else assert (false);
    }

    private void nK(boolean bl) {
        if (bl) {
            dqi dqi2 = new dqi();
            dqi2.M(kyw);
            this.kyU = this.a(this.hC, dqi2);
        } else {
            this.ae(this.kyU, this.hC);
        }
    }

    private static int[] a(b b2) {
        int[] nArray = new int[kyu.size()];
        int n = 0;
        for (a a2 : kyu) {
            if (a2.kzb != b2) continue;
            nArray[n++] = a2.bnM;
        }
        return Arrays.copyOf(nArray, n);
    }

    private static void a(ej ej2, lmw lmw2, lmw lmw3, Map<Integer, a> map) {
        a a2 = map.get(new Integer(ej2.getType()));
        if (a2 == null) {
            return;
        }
        lmv lmv2 = lmw2.AM(a2.Name);
        assert (lmv2 != null) : ej2.getType();
        if (lmv2 instanceof lnp) {
            float f2;
            float f3 = ((et)ej2).fN();
            int n = ((et)ej2).fM();
            switch (n) {
                case 2: {
                    f2 = f3 + 1.0f;
                    break;
                }
                case 3: {
                    f2 = f3 - 1.0f;
                    break;
                }
                case 1: {
                    f2 = f3;
                    break;
                }
                default: {
                    assert (false);
                    f2 = f3;
                }
            }
            lnp lnp2 = (lnp)lmw3.AM(a2.Name);
            lnp2.nH(f2);
            lnp lnp3 = (lnp)lmv2;
            lnp3.nH(f3);
        } else if (lmv2 instanceof lnt) {
            int n = ((ew)ej2).fQ();
            lnt lnt2 = (lnt)lmv2;
            lnt2.adI(n);
            lnt lnt3 = (lnt)lmw3.AM(a2.Name);
            lnt3.adI(n);
        } else if (lmv2 instanceof lnd) {
            ((lnd)lmv2).yP(((eq)ej2).getBooleanValue());
        } else {
            ((loc)lmv2).AO(((ff)ej2).getStringValue());
        }
    }

    private void cnu() {
        hdz hdz2 = null;
        for (hdz hdz3 : lin.a(this.kyz.cfh(), hdz.class)) {
            if (!hdz3.Uu() || !hdz3.ceB().b(hdw.kbl)) continue;
            hdz2 = hdz3;
            break;
        }
        if (hdz2 == null) {
            this.nL(false);
        }
        this.p(hdz2);
        if (hdz2 != null) {
            this.nL(hdz2.auX());
        }
    }

    private void p(hdz hdz2) {
        if (lin.i(hdz2, this.kyX)) {
            return;
        }
        this.kyX = hdz2;
        this.kyH.enp();
    }

    private void nL(boolean bl) {
        if (bl == this.kyY) {
            return;
        }
        this.kyY = bl;
        this.kyJ.enp();
    }

    public Map<Integer, dcp> cnv() {
        return this.kyK;
    }

    private void nb(boolean bl) {
        this.cdh.rex.a(bl, gjh.class, this.kyO);
        this.cdh.rex.a(bl, eey.class, this.kyP);
        this.cdh.rex.a(bl, eyv.class, this.kyQ);
        this.cdh.rex.a(bl, gzp.class, this.kyR);
        this.cdh.rex.a(bl, gzq.class, this.kyS);
        this.cdh.rex.a(bl, eff.class, this.kyT);
        lin.a(bl, this.cdh, this.hC, cbx.a.ekM.ordinal(), hec.b.kdl.ordinal());
        lin.a(bl, this.cdh, this.hC, cbx.a.ekK.ordinal(), hec.b.kdn.ordinal());
        this.nK(bl);
        lin.a(bl, this.cdh, this.hC, cbx.a.ekI.ordinal(), hec.b.kdm.ordinal());
        lin.a(bl, this.cdh, this.hC, cbx.a.ekH.ordinal(), hec.b.kdo.ordinal());
        this.cdh.rnh.m(eet.a(this.cdh.rng, this.hC, bl));
        this.kyz.cfa().a(bl, this.kmr);
    }

    static /* synthetic */ hjr a(hjh hjh2) {
        return hjh2.kcj;
    }

    static /* synthetic */ hea b(hjh hjh2) {
        return hjh2.kyV;
    }

    static /* synthetic */ hea a(hjh hjh2, hea hea2) {
        hjh2.kyV = hea2;
        return hjh2.kyV;
    }

    static /* synthetic */ ldl c(hjh hjh2) {
        return hjh2.kyE;
    }

    static /* synthetic */ alu[] a(hjh hjh2, alu[] aluArray) {
        hjh2.kyW = aluArray;
        return aluArray;
    }

    static /* synthetic */ ldl d(hjh hjh2) {
        return hjh2.kyG;
    }

    static /* synthetic */ void a(hjh hjh2, ldv ldv2, ej ej2) {
        hjh2.b(ldv2, ej2);
    }

    static /* synthetic */ Map cnw() {
        return kyv;
    }

    static /* synthetic */ void b(ej ej2, lmw lmw2, lmw lmw3, Map map) {
        hjh.a(ej2, lmw2, lmw3, map);
    }

    static /* synthetic */ void e(hjh hjh2) {
        hjh2.cnu();
    }

    static {
        HashMap<Integer, a> hashMap = new HashMap<Integer, a>();
        for (a a2 : kyu) {
            Integer n = new Integer(a2.bnM);
            assert (!hashMap.containsKey(n));
            hashMap.put(n, a2);
        }
        kyv = hashMap;
        kyw = hjh.a(b.kzd);
        kyx = hjh.a(b.kze);
        kyL = new lmx.a(null, hjh.cmY());
    }
}

