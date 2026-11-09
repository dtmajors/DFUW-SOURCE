/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  hlv
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import spenefett.util.jni.SFJNIUtils;

public class hec
extends hsg
implements lbr {
    public static hec kbV;
    private static final int kbW = 100;
    private static final String kbX = "xml-files/client/gui/gui_config.xml";
    private final hsi jDE;
    private final ldl kbY = new ldl();
    private final ldl kbZ = new ldl();
    private final ldl kca = new ldl();
    private final Map<Integer, a> kcb = new HashMap<Integer, a>();
    public final hdc kcc = new hdc();
    private final String[] jWU;
    public final Random eNu = new Random();
    public final hjz kcd;
    public final hjg kce;
    public final hjl kcf;
    public final hjm kcg;
    public final hjp kch;
    public final hjq kci;
    public final hjr kcj;
    public final hjh kck;
    public final hjx kcl;
    public final hjo kcm;
    public final hjk kcn;
    public final hjs kco;
    public final hjj kcp;
    public final hjt kcq;
    public final hji kcr;
    public final hjn kcs;
    public final hjf kct;
    public final hju kcu;
    public final hjw kcv;
    public final hjy kcw;
    public final hka kcx;
    public final joz.a jWX;
    private final lbn jEL = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hec.a(this.kdd)) {
                throw new AssertionError();
            }
            if (this.kdd.kcc.ccE().getValue()) {
                int n = (int)this.kdd.kcc.ccG().getValue();
                SFJNIUtils.Instance.sleep(n);
            }
            if (hec.b(this.kdd)) {
                hec.c(this.kdd);
                hec.a(this.kdd, false);
            }
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbn kcy = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hec.d(this.kdd)) {
                throw new AssertionError();
            }
            if (hec.e(this.kdd) == null) {
                return;
            }
            int n = loi.exd().AT("xml-files/client/gui/gui_config.xml");
            if (n <= hec.f(this.kdd)) {
                return;
            }
            hec.a(this.kdd, true);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbn kcz = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hec.g(this.kdd)) {
                throw new AssertionError();
            }
            lcw.qFE = this.kdd.kcc.ccC().getValue();
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbn kcA = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hec.h(this.kdd)) {
                throw new AssertionError();
            }
            boolean bl = this.kdd.kcc.ccH().getValue();
            hec.i(this.kdd).oG(bl);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fvt> kcB = new lbi<fvt>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void b(fvt fvt2) {
            if (!$assertionsDisabled && !hec.j(this.kdd)) {
                throw new AssertionError();
            }
            int n = fvt2.dTe;
            b b2 = b.ListOfValue.get(n);
            this.kdd.a(b2, fvt2.aO());
        }

        public /* synthetic */ void m(Object object) {
            this.b((fvt)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fey> kcC = new lbi<fey>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(fey fey2) {
            if (!$assertionsDisabled && !hec.k(this.kdd)) {
                throw new AssertionError();
            }
            if (hec.l(this.kdd) == null) {
                return;
            }
            hec.l(this.kdd).mR(fey2.iKJ);
        }

        public /* synthetic */ void m(Object object) {
            this.a((fey)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<gbb> kcD = new lbi<gbb>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void c(gbb gbb2) {
            if (!$assertionsDisabled && !lda.by(gbb2)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !hec.m(this.kdd)) {
                throw new AssertionError();
            }
            if (this.kdd.kcf.d(gbb2)) {
                return;
            }
            if (this.kdd.kcg.d(gbb2)) {
                return;
            }
            if (this.kdd.kcd.d(gbb2)) {
                return;
            }
        }

        public /* synthetic */ void m(Object object) {
            this.c((gbb)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fls> kcE = new lbi<fls>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void b(fls fls2) {
            hee hee2;
            if (!$assertionsDisabled && !hec.n(this.kdd)) {
                throw new AssertionError();
            }
            if (fls2.iPx == null) {
                return;
            }
            if (fls2.aO() == null) {
                return;
            }
            if (fls2.aXQ == null) {
                // empty if block
            }
            if ((hee2 = this.kdd.kcj.af(fls2.aO(), fls2.aXQ)) == null) {
                return;
            }
            ArrayList<hdu> arrayList = new ArrayList<hdu>();
            for (bsf object : fls2.iPx.values()) {
                ldv ldv2 = object.getGUID();
                hdu hdu2 = this.kdd.kcj.kaV.qS(ldv2);
                if (hdu2 == null) {
                    hdv hdv2 = hec.a(this.kdd, object);
                    if (hdv2 == null) continue;
                    hdu2 = hdv2.a(this.kdd.kcj.kaV, ldv2);
                }
                arrayList.add(hdu2);
                if (hdu2 == null) continue;
                hdu2.a(object);
            }
            if (hee2 == this.kdd.kck.kyz) {
                Collection<hdu> collection = this.kdd.kck.kyz.cfh();
                Collection<hea> collection2 = lin.a(collection, hea.class);
                arrayList.addAll(collection2);
            }
            hee2.a(arrayList, fls2.iPz, fls2.iPy);
        }

        public /* synthetic */ void m(Object object) {
            this.b((fls)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fff> kcF = new lbi<fff>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(fff fff2) {
            if (!$assertionsDisabled && !hec.o(this.kdd)) {
                throw new AssertionError();
            }
            String string = fff2.iKV;
            if (!$assertionsDisabled && string == null) {
                throw new AssertionError();
            }
            hec.a(this.kdd, string);
            hec.p(this.kdd).enp();
            hec.a(this.kdd, null);
        }

        public /* synthetic */ void m(Object object) {
            this.a((fff)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<egw> kcG = new lbi<egw>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(egw egw2) {
            if (!$assertionsDisabled && !hec.q(this.kdd)) {
                throw new AssertionError();
            }
            if (hec.r(this.kdd) != null) {
                hec.r(this.kdd).a(egw2.adk, egw2.ipG, egw2.ipH);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((egw)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<gzu> kcH = new lbi<gzu>(this){
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void b(gzu gzu2) {
        }

        public /* synthetic */ void m(Object object) {
            this.b((gzu)object);
        }
    };
    private final lbi<fmf> kcI = new lbi<fmf>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void b(fmf fmf2) {
            if (!$assertionsDisabled && !hec.s(this.kdd)) {
                throw new AssertionError();
            }
            if (!fmf2.iPn) {
                // empty if block
            }
            hec.a(this.kdd, fmf2.iPn, fmf2.ilu, fmf2.aqs, fmf2, fmf2.iPE, fmf2.gLy, fmf2.iPQ, fmf2.gLz);
        }

        public /* synthetic */ void m(Object object) {
            this.b((fmf)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fjg> kcJ = new lbi<fjg>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(fjg fjg2) {
            if (!$assertionsDisabled && !hec.t(this.kdd)) {
                throw new AssertionError();
            }
            if (hec.u(this.kdd) != null) {
                hec.u(this.kdd).m(fjg2.iNF);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjg)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fjh> kcK = new lbi<fjh>(this){
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(fjh fjh2) {
            if (hec.v(this.kdd) == null) {
                return;
            }
            hec.v(this.kdd).m(fjh2.iNG);
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjh)object);
        }
    };
    private final lbi<ffu> kcL = new lbi<ffu>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(ffu ffu2) {
            lfy.a a2;
            switch (ffu2.iLl) {
                case iLn: {
                    a2 = lfy.a.rkK;
                    break;
                }
                case iLm: {
                    a2 = lfy.a.rkL;
                    break;
                }
                default: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    return;
                }
            }
            hec.a(this.kdd, a2);
            if (hec.e(this.kdd) != null) {
                hec.e(this.kdd).c(a2);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((ffu)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<ffv> kcM = new lbi<ffv>(this){
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(ffv ffv2) {
            this.kdd.kcc.ccE().yP(ffv2.iLp);
            this.kdd.kcc.ccG().es(ffv2.iLq);
        }

        public /* synthetic */ void m(Object object) {
            this.a((ffv)object);
        }
    };
    private final lbi<fjl> kcN = new lbi<fjl>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(fjl fjl2) {
            if (!$assertionsDisabled && !lda.by(fjl2)) {
                throw new AssertionError();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjl)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fma> kcO = new lbi<fma>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void c(fma fma2) {
            if (!$assertionsDisabled && !hec.w(this.kdd)) {
                throw new AssertionError();
            }
            hec.a(this.kdd, fma2.iPn, -1, fma2.aqs, fma2, fma2.iPE, fma2.gLy, null, fma2.gLz);
        }

        public /* synthetic */ void m(Object object) {
            this.c((fma)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<fle> kcP = new lbi<fle>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void b(fle fle2) {
            if (!$assertionsDisabled && !hec.x(this.kdd)) {
                throw new AssertionError();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((fle)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbi<ffn> kcQ = new lbi<ffn>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public void a(ffn ffn2) {
            if (!$assertionsDisabled && !hec.y(this.kdd)) {
                throw new AssertionError();
            }
            hec.a(this.kdd, ffn2.aCK, ffn2.aXQ, ffn2.Position);
        }

        public /* synthetic */ void m(Object object) {
            this.a((ffn)object);
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final jor kcR = new jor(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void a(jov jov2, boolean bl) {
            if (!$assertionsDisabled && !hec.z(this.kdd)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && jov2 != joj.nIi) {
                throw new AssertionError();
            }
            if (bl) {
                hec.A(this.kdd).enp();
            }
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    public final lbt<lmv> kcS = new lbt<lmv>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void a(boolean bl, lbi<lmv> lbi2) {
            if (!$assertionsDisabled && lbi2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !(!bl ? hec.u(this.kdd) == lbi2 : hec.u(this.kdd) == null)) {
                throw new AssertionError();
            }
            if (bl) {
                hec.a(this.kdd, lbi2);
            } else {
                hec.a(this.kdd, null);
            }
            this.kdd.cdh.rnh.m(fjf.a(this.kdd.cdh.rng, bl));
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private final lbn jDG = new lbn(this){
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void W() {
            if (hec.e(this.kdd) != null) {
                return;
            }
            loi.exd().shutdown();
        }
    };
    public final lbt<jpk> kcT = new lbt<jpk>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hec kdd;
        {
            this.kdd = hec2;
        }

        public final void a(boolean bl, lbi<jpk> lbi2) {
            if (!$assertionsDisabled && !(!bl ? hec.v(this.kdd) == lbi2 : hec.v(this.kdd) == null)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && lbi2 == null) {
                throw new AssertionError();
            }
            if (bl) {
                hec.b(this.kdd, lbi2);
            } else {
                hec.b(this.kdd, null);
            }
        }

        static {
            $assertionsDisabled = !hec.class.desiredAssertionStatus();
        }
    };
    private lbj kcU;
    private lib kcV;
    private boolean kcW;
    private int kcX;
    private hlv kcY;
    private hci kcZ;
    private String iKV;
    private lbi<jpk> kda;
    private lbi<lmv> kdb;
    private int kdc;

    public hec(ldv ldv2, lbd lbd2, lbh lbh2, jpj jpj2, joz.a a2, hrx hrx2, jom jom2, lha<dxq, dxq> lha2, lha<kgz, kgh> lha3, hsi hsi2, ldv ldv3, int n, ldv ldv4, ldv ldv5, ldv ldv6, ldv ldv7, String[] stringArray) {
        super(ldv2, lbd2, lbh2, jpj2, hrx2, jom2, lha2, lha3);
        kbV = this;
        this.jDE = hsi2;
        this.jDE.check();
        this.jWU = stringArray;
        this.jWX = a2;
        this.kcc.ccC().yP(lcw.qFE);
        this.kcj = new hjr(lha2, lbd2, ldv4, ldv7, lbh2);
        this.kck = new hjh(lha2, this.kcj, lbd2, ldv3, n, ldv4, ldv5, ldv6, ldv7);
        this.kcl = new hjx(lha2);
        this.kcd = new hjz(lha2, this.kcj);
        this.kce = new hjg(lha2, this.kcj.kaV);
        this.kcf = new hjl(lha2, this.kck, this.kce);
        this.kcg = new hjm(lha2, this.kck, this.kce);
        this.kch = new hjp(lha2);
        this.kci = new hjq(lha2, this.kcj, this.kck);
        this.kcm = new hjo(this.kck, this.kzI);
        this.kcn = new hjk(lha2, this.kck);
        this.kco = new hjs(lha2, this.kck);
        this.kcp = new hjj(lha2);
        this.kcq = new hjt(lha2, this.kck);
        this.kcr = new hji(lha2);
        this.kcs = new hjn(lha2);
        this.kct = new hjf(lha2);
        this.kcu = new hju(this, ldv3);
        this.kcv = new hjw(this, ldv3);
        this.kcw = new hjy(this, lha2);
        this.kcx = new hka(this);
        this.kcV = new lib(this.kNg, true);
        this.kcV.ee(1.0);
        this.mU(true);
        ffd ffd2 = (ffg)this.cdh.rng.ik(2575);
        ffd2.f(lcr.acL);
        ffd2.on(lcr.qCg);
        ((ffg)ffd2).iKW = null;
        ((ffg)ffd2).iKI = false;
        this.cdh.rnh.m(ffd2);
        ffd2 = (fex)this.cdh.rng.ik(2576);
        ffd2.f(lcr.acL);
        ffd2.on(lcr.qCh);
        ((fex)ffd2).iKH = null;
        ((fex)ffd2).iKI = false;
        this.cdh.rnh.m(ffd2);
        this.c(lfy.a.rkK);
        this.ceS();
        assert (this.kcY != null);
    }

    public final String ceI() {
        assert (this.isConstructed());
        assert (this.iKV != null);
        return this.iKV;
    }

    public final void ceJ() {
    }

    public final void ceK() {
    }

    public final void ceL() {
        ljq ljq2 = this.kck.av();
        ljq2.x += this.jO(20.0f);
        ljq2.y += this.jO(20.0f);
        ljq2.rlV += this.jO(20.0f);
        this.cdh.rnh.m(ffb.a(this.cdh.rng, this.dbx, this.jWH.caL(), new ljg("Test"), new lhu(16, 16, "gui/button/tree_expand_normal.dds"), ljq2, 0.0f, new ljp(1.0f, 1.0f), new ldv(1, 1, 1)));
    }

    private float jO(float f2) {
        return this.eNu.nextFloat() % (f2 * 2.0f) - f2;
    }

    public final hlv ceM() {
        return this.kcY;
    }

    public final hdm cbO() {
        return (hdm)this.kcY;
    }

    public final lbl<lbn> ceN() {
        return this.kbY;
    }

    public final lbl<lbn> ceO() {
        return this.kbZ;
    }

    public final lbl<lbn> ceP() {
        assert (this.isConstructed());
        return this.kca;
    }

    public final void a(boolean bl, hci hci2) {
        assert (this.isConstructed());
        if (bl) {
            assert (this.kcZ == null);
            this.kcZ = hci2;
        } else {
            assert (this.kcZ == hci2);
            this.kcZ = null;
        }
    }

    public final void a(lip lip2, String string) {
        assert (this.isConstructed());
        egy egy2 = (egy)this.cdh.rng.ik(2305);
        egy2.on(lcr.qCM);
        egy2.ipJ = new lip[]{lip2};
        egy2.ccT = string;
        this.cdh.rnh.m(egy2);
    }

    public final void d(String string, String string2, String string3) {
        assert (this.isConstructed());
        this.cdh.rnh.m(egq.a(this.cdh.rng, lcr.qCL, string, string2, string3));
    }

    public final String[] ceQ() {
        assert (this.isConstructed());
        String[] stringArray = new String[this.jWU.length];
        System.arraycopy(this.jWU, 0, stringArray, 0, stringArray.length);
        return stringArray;
    }

    public final void cbn() {
        assert (this.isConstructed());
        this.cdh.rnh.m(gqz.p(this.cdh.rng, lcr.qzp));
    }

    public final void cl(int n, int n2) {
        assert (this.isConstructed());
        this.cdh.rnh.m(egv.b(this.cdh.rng, lcr.qCM, n, n2));
    }

    public final boolean ceR() {
        assert (this.isConstructed());
        return this.kcc.ccD().getValue();
    }

    public final void a(boolean bl, lbj lbj2) {
        assert (this.isConstructed());
        if (bl) {
            assert (this.kcU == null) : this.kcU;
            this.kcU = lbj2;
        } else {
            assert (this.kcU == lbj2) : this.kcU;
            this.kcU = null;
        }
    }

    public final void b(hdz hdz2) {
        this.cdh.rnh.m(flz.a(this.cdh.rng, hdz2.ceD(), hdz2.ceC(), hdz2.dbx, null, null, -1, -1));
    }

    public final void a(hdz hdz2, hgm hgm2, lgg lgg2, int n) {
        int n2;
        if (lgg2 == null) {
            n2 = -1;
        } else {
            n2 = ++this.kdc;
            a a2 = new a(hgm2, n2, lgg2);
            this.kcb.put(new Integer(n2), a2);
        }
        this.cdh.rnh.m(flz.a(this.cdh.rng, hdz2.ceD(), hdz2.ceC(), hdz2.dbx, hgm2.kdT.kdD.dbx, hgm2.kdT.kdC.kdD.dbx, n, n2));
    }

    public final void a(hdz hdz2, hdz hdz3) {
        this.cdh.rnh.m(flz.a(this.cdh.rng, hdz2.ceD(), hdz2.ceC(), hdz2.dbx, hdz3.dbx, hdz3.ceD(), -1, -1));
    }

    public final void a(hdz hdz2, int n, hgm hgm2, int n2, lgg lgg2, int n3) {
        int n4;
        if (n == 0) {
            this.a(hdz2, hgm2, lgg2, n3);
            return;
        }
        if (lgg2 == null) {
            n4 = -1;
        }
        n4 = ++this.kdc;
        a a2 = new a(hgm2, n4, lgg2);
        this.kcb.put(new Integer(n4), a2);
        this.cdh.rnh.m(fme.a(this.cdh.rng, hdz2.ceD(), 2, hdz2.ceC(), hdz2.dbx, n, n2, n3, hgm2.kdT.kdC.kdD.dbx, hgm2.kdT.kdD.dbx, null, n4));
    }

    public final void a(hdz hdz2, int n, int n2) {
        if (n == 0) {
            this.b(hdz2);
            return;
        }
        this.cdh.rnh.m(fme.a(this.cdh.rng, hdz2.ceD(), 4, hdz2.ceC(), hdz2.dbx, n, n2, -1, null, null, null, -1));
    }

    public final void b(hdz hdz2, hdz hdz3) {
        this.cdh.rnh.m(fme.a(this.cdh.rng, hdz2.ceD(), 1, hdz2.ceC(), hdz2.dbx, 0, 0, -1, hdz3.ceD(), hdz3.ceC(), hdz3.dbx, -1));
    }

    public final void a(hdz hdz2, int n, hdz hdz3, int n2) {
        if (n == 0) {
            this.b(hdz2, hdz3);
            return;
        }
        this.cdh.rnh.m(fme.a(this.cdh.rng, hdz2.ceD(), 8, hdz2.ceC(), hdz2.dbx, n, n2, -1, hdz3.ceD(), hdz3.ceC(), hdz3.dbx, -1));
    }

    public final void c(lmv lmv2) {
        this.cdh.rnh.m(fje.a(this.cdh.rng, lmv2));
    }

    public final void a(hlv hlv2) {
        assert (this.isConstructed());
        assert (this.kcY == null);
        assert (hlv2 != null);
        this.kcY = hlv2;
        this.kcY.c(lfy.a.rkK);
    }

    private void ceS() {
        hdm hdm2 = new hdm(this, this.jDE);
        this.a((hlv)hdm2);
        hdm2.cdy();
    }

    public final void ceT() {
        assert (this.kcY != null);
        this.kcY.c(lfy.a.rkL);
        this.kcY.dispose();
        this.kcY = null;
    }

    public final String mo(String string) {
        assert (this.isConstructed());
        return string + ".xml";
    }

    @Override
    public final boolean a(lfu lfu2) {
        boolean bl = false;
        bl |= lfu2.a("Hotbar", this.kcm);
        bl |= lfu2.a("DebugOptions", this.kcc);
        bl |= lfu2.a("EngineOptions", this.kcs);
        return bl |= lfu2.a("AudioOptions", this.kct);
    }

    protected void a(b b2, ldv ldv2) {
        switch (b2) {
            case kdk: {
                assert (false);
                return;
            }
            case kdl: {
                this.kck.cnm();
                return;
            }
            case kdm: {
                this.kck.cnn();
                return;
            }
            case kdn: {
                this.kck.cnk();
                return;
            }
            case kdo: {
                this.kck.cnl();
                return;
            }
            case kdp: {
                this.kbZ.enp();
                return;
            }
            case kdq: {
                this.kci.cnX();
                return;
            }
            case kdr: 
            case kds: {
                this.cdh.rnh.m(flr.k(this.cdh.rng, ldv2));
                return;
            }
            case kdt: {
                if (this.kcd.coI()) {
                    this.kcd.coR();
                }
                return;
            }
        }
        assert (false) : b2;
    }

    @Override
    protected void cbg() {
        this.c(lfy.a.rkL);
        this.ceT();
        assert (this.kcY == null);
        this.mU(false);
        this.kcx.dispose();
        this.kcq.dispose();
        this.kcp.dispose();
        this.kco.dispose();
        this.kcn.dispose();
        this.kcm.dispose();
        this.kci.dispose();
        this.kch.dispose();
        this.kcg.dispose();
        this.kcf.dispose();
        this.kce.dispose();
        this.kcd.dispose();
        this.kcl.dispose();
        this.kck.dispose();
        this.kcj.dispose();
        this.kcr.dispose();
        this.kcs.dispose();
        this.kct.dispose();
        this.kcu.dispose();
        this.kcv.dispose();
        this.kcw.dispose();
        this.kcV.stop();
        this.kcV = null;
        assert (this.kbY.isEmpty());
        assert (this.kbZ.isEmpty());
        assert (this.kca.isEmpty());
        super.cbg();
        kbV = null;
    }

    private void c(lfy.a a2) {
        String string = this.mo("gui_manager_persistence");
        lfz.a(this, a2, string, "GuiManagerPersistence", lcw.qFE);
    }

    private void ceU() {
        hnc.b b2 = this.kcY.crZ();
        hlv hlv2 = this.kcY;
        this.ceT();
        this.a(hlv2);
        this.kcY.c(b2);
    }

    private final void c(ldv ldv2, ldv ldv3, ljq ljq2) {
        this.kcx.d(ldv2, ldv3, ljq2);
    }

    private void a(boolean bl, int n, int n2, fmm fmm2, ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5) {
        a a2;
        hee hee2;
        hee hee3;
        if (ldv3 == null) {
            hee3 = null;
        } else {
            hee3 = this.kcj.af(fmm2.aO(), ldv3);
            if (hee3 == null) {
                return;
            }
        }
        if (ldv5 == null) {
            hee2 = null;
        } else {
            hee2 = this.kcj.af(fmm2.aO(), ldv5);
            if (hee2 == null) {
                return;
            }
        }
        if (n2 == -1) {
            a2 = null;
        } else {
            a2 = this.kcb.remove(new Integer(n2));
            assert (a2 != null);
        }
        if (!bl) {
            if (hee3 != null) {
                hee3.cff();
            }
            if (hee2 != null) {
                hee2.cff();
            }
        } else {
            switch (n) {
                case -1: {
                    break;
                }
                case 2: {
                    assert (n2 != -1);
                    break;
                }
                case 8: {
                    assert (n2 == -1);
                    break;
                }
                default: {
                    assert (n2 == -1);
                    break;
                }
            }
            if (a2 != null) {
                ldv ldv6 = ldv4 == null ? ldv2 : ldv4;
                hdz hdz2 = this.kcj.kaV.qT(ldv6);
                if (!(hdz2 == null || a2.kdg.kdT.isConstructed() && a2.kdg.kdT.d(hdz2))) {
                    hdz2 = null;
                }
                if (hdz2 == null) {
                    if (a2.kdj < 100) {
                        ++a2.kdj;
                        fmm2.f(this.dbx);
                        this.cdh.rnh.m(fmm2);
                        this.kcb.put(new Integer(n2), a2);
                    } else {
                        if (hee3 != null) {
                            hee3.cff();
                        }
                        if (hee2 != null) {
                            hee2.cff();
                        }
                    }
                    return;
                }
                a2.kdg.a(hdz2, a2.kdi);
            }
        }
    }

    private final hdv c(bsf bsf2) {
        int n = bsf2.awE().getType();
        if (bsf2 instanceof bsh) {
            return new hdw(n);
        }
        if (bsf2 instanceof bsj) {
            return new hdx(n);
        }
        return null;
    }

    private void mU(boolean bl) {
        lin.a(bl, this.cdh, lcr.qCM, 1, b.kdp.ordinal());
        this.kzI.a(bl, joj.nIi, this.kcR);
        this.kAz.eme().a(bl, this.jEL);
        this.jWK.cwP().a(bl, this.jDG);
        this.kcV.esg().a(bl, this.kcy);
        this.kcc.ccC().cec().a(bl, this.kcz);
        this.kcc.ccH().cec().a(bl, this.kcA);
        this.cdh.rex.a(bl, fjg.class, this.kcJ);
        this.cdh.rex.a(bl, fvt.class, this.kcB);
        this.cdh.rex.a(bl, fey.class, this.kcC);
        this.cdh.rex.a(bl, fls.class, this.kcE);
        this.cdh.rex.a(bl, fff.class, this.kcF);
        this.cdh.rex.a(bl, egw.class, this.kcG);
        this.cdh.rex.a(bl, gzu.class, this.kcH);
        this.cdh.rex.a(bl, fmf.class, this.kcI);
        this.cdh.rex.a(bl, fjh.class, this.kcK);
        this.cdh.rex.a(bl, ffu.class, this.kcL);
        this.cdh.rex.a(bl, ffv.class, this.kcM);
        this.cdh.rex.a(bl, fjl.class, this.kcN);
        this.cdh.rex.a(bl, gbb.class, this.kcD);
        this.cdh.rex.a(bl, fma.class, this.kcO);
        this.cdh.rex.a(bl, fle.class, this.kcP);
        this.cdh.rex.a(bl, ffn.class, this.kcQ);
        this.cdh.rnh.m(esr.b(this.cdh.rng, this.dbx, bl));
    }

    static /* synthetic */ boolean a(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ boolean b(hec hec2) {
        return hec2.kcW;
    }

    static /* synthetic */ void c(hec hec2) {
        hec2.ceU();
    }

    static /* synthetic */ boolean a(hec hec2, boolean bl) {
        hec2.kcW = bl;
        return hec2.kcW;
    }

    static /* synthetic */ boolean d(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ hlv e(hec hec2) {
        return hec2.kcY;
    }

    static /* synthetic */ int f(hec hec2) {
        return hec2.kcX;
    }

    static /* synthetic */ boolean g(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ boolean h(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ hsi i(hec hec2) {
        return hec2.jDE;
    }

    static /* synthetic */ boolean j(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ boolean k(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ lbj l(hec hec2) {
        return hec2.kcU;
    }

    static /* synthetic */ boolean m(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ boolean n(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ hdv a(hec hec2, bsf bsf2) {
        return hec2.c(bsf2);
    }

    static /* synthetic */ boolean o(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ String a(hec hec2, String string) {
        hec2.iKV = string;
        return hec2.iKV;
    }

    static /* synthetic */ ldl p(hec hec2) {
        return hec2.kca;
    }

    static /* synthetic */ boolean q(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ hci r(hec hec2) {
        return hec2.kcZ;
    }

    static /* synthetic */ boolean s(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ void a(hec hec2, boolean bl, int n, int n2, fmm fmm2, ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5) {
        hec2.a(bl, n, n2, fmm2, ldv2, ldv3, ldv4, ldv5);
    }

    static /* synthetic */ boolean t(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ lbi u(hec hec2) {
        return hec2.kdb;
    }

    static /* synthetic */ lbi v(hec hec2) {
        return hec2.kda;
    }

    static /* synthetic */ void a(hec hec2, lfy.a a2) {
        hec2.c(a2);
    }

    static /* synthetic */ boolean w(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ boolean x(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ boolean y(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ void a(hec hec2, ldv ldv2, ldv ldv3, ljq ljq2) {
        hec2.c(ldv2, ldv3, ljq2);
    }

    static /* synthetic */ boolean z(hec hec2) {
        return hec2.isConstructed();
    }

    static /* synthetic */ ldl A(hec hec2) {
        return hec2.kbY;
    }

    static /* synthetic */ lbi a(hec hec2, lbi lbi2) {
        hec2.kdb = lbi2;
        return hec2.kdb;
    }

    static /* synthetic */ lbi b(hec hec2, lbi lbi2) {
        hec2.kda = lbi2;
        return hec2.kda;
    }
}

