/*
 * Decompiled with CFR.
 */
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import spenefett.util.jni.SFJNIUtils;

public abstract class hnc {
    public static final int kNe = 9999;
    public static final ljp kNf = new ljp(1.0f, 1.0f);
    public static final hbe jzX = hbe.jAM;
    public final lbh kAz;
    public final lic kNg;
    public final hmd kNh;
    public final c kNi;
    public final lcu kNj = new lcu(lcu.a.qEW);
    public final lcu kNk = new lcu(lcu.a.qEX);
    public final lcu kNl = new lcu(lcu.a.qEY);
    public final lcu kNm = new lcu(lcu.a.qEZ);
    public final lcu kNn = new lcu(lcu.a.qFb);
    public final lcu kNo = new lcu(lcu.a.qFd);
    public final lcu kNp = new lcu(lcu.a.qFf);
    public final lcu kNq = new lcu(lcu.a.qFf);
    public final lcu kNr = new lcu(lcu.a.qFd);
    public final lcu kNs = new lcu(lcu.a.qFe);
    public final lcu kNt = new lcu(lcu.a.qFe);
    public final lcu kNu = new lcu(lcu.a.qFg);
    public final lcu kNv = new lcu(lcu.a.qFg);
    public final lcu kNw = new lcu(lcu.a.qFc);
    public final lcu kNx = new lcu(lcu.a.qFa);
    public final lcu kNy = new lcu(lcu.a.qFi);
    private final ldl kNz = new ldl();
    private final ldl kLM = new ldl();
    private final ldl kaX = new ldl();
    private final lib kNA;
    private final hnd kLZ = new hnd();
    private final List<ldl> kNB = new ArrayList<ldl>();
    public final hnf kNC;
    public final hob kND;
    private final lbn kNE = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnc kNR;
        {
            this.kNR = hnc2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnc.a(this.kNR)) {
                throw new AssertionError();
            }
            if (hnc.b(this.kNR) == null) {
                this.kNR.ccc();
            }
        }

        static {
            $assertionsDisabled = !hnc.class.desiredAssertionStatus();
        }
    };
    private final lbn jZW = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnc kNR;
        {
            this.kNR = hnc2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnc.a(this.kNR)) {
                throw new AssertionError();
            }
            while (hnc.c(this.kNR).size() > 0) {
                ldl ldl2 = (ldl)hnc.c(this.kNR).remove(0);
                ldl2.enp();
            }
            if (hnc.d(this.kNR)) {
                hnc.a(this.kNR, false);
                if (hnc.b(this.kNR) == null) {
                    this.kNR.cdD();
                }
            }
        }

        static {
            $assertionsDisabled = !hnc.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private hms kNF;
    private hms kNG;
    private List<hnt> kNH;
    private lhu kNI;
    private lcu kNJ;
    private boolean kNK;
    private hly jHr;
    private boolean kNL;
    private boolean kNM;
    private lgg kNN = lgg.rlI;
    private lgg kNO;
    private boolean kNP;
    hms kNQ;

    public hnc(lbh lbh2, lic lic2, hmd hmd2, c c2, lhf lhf2) {
        assert (lic2 != null);
        Object object = Locale.getDefault();
        String string = ((Locale)object).getLanguage();
        String string2 = ((Locale)object).getCountry();
        jzX.debug("Default Locale = " + string + "_" + string2);
        object = System.getProperty("user.language", "(not given)");
        string = System.getProperty("user.region", "(not given)");
        jzX.debug("Specified Locale = " + (String)object + "_" + string);
        this.kAz = lbh2;
        this.kNg = lic2;
        this.kNh = hmd2;
        this.kNi = c2;
        this.kNA = new lib(this.kNg, false);
        this.kNC = new hnf(lic2, hmd2);
        this.jLT = true;
        this.kND = new hob(this, (String)null, lhf2, false);
        this.kND.initialize();
        this.mU(true);
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final boolean isConstructed() {
        return this.jLT;
    }

    public final void a(boolean bl, hly hly2) {
        assert (this.jLT);
        assert (hly2 != null);
        if (bl) {
            assert (this.jHr == null);
            this.b(hly2);
        } else {
            assert (this.jHr == hly2);
            this.b((hly)null);
        }
    }

    public final boolean a(hly hly2) {
        assert (this.jLT);
        return this.jHr == hly2;
    }

    public final hly crG() {
        assert (this.jLT);
        return this.jHr;
    }

    public final lbl<lbn> crH() {
        return this.kNz;
    }

    public final lbl<lbn> cqo() {
        return this.kLM;
    }

    public final lbl<lbn> ceb() {
        return this.kaX;
    }

    public final void B(lgg lgg2) {
        assert (this.jLT);
        if (lgg2.T(this.kNN)) {
            return;
        }
        this.kNN = lgg2;
        this.css();
        this.cdD();
        this.kNA.ee(this.crY());
    }

    public final void nY(boolean bl) {
        assert (this.jLT);
        this.css();
        if (this.kNL) {
            return;
        }
        this.kNL = true;
        this.kNM = bl;
        this.kNO = this.kNN;
        assert (!this.kNP);
        this.kNP = true;
        this.csp();
        this.kNP = false;
    }

    public final void cqL() {
        assert (this.jLT);
        if (!this.kNL) {
            return;
        }
        this.kNL = false;
        assert (!this.kNP);
        this.kNP = true;
        this.csq();
        this.kNP = false;
    }

    public final void Np(int n) {
        if (n > 5) {
            n = 5;
        }
        assert (this.jLT);
        this.css();
        this.LM(n);
    }

    public final void c(int n, boolean bl, Set<jpn> set) {
        assert (this.jLT);
        this.css();
        boolean bl2 = this.a(n, bl, set);
        assert (lda.yk(bl2));
    }

    public final void Nq(int n) {
        assert (this.jLT);
        boolean bl = this.LN(n);
        assert (lda.yk(bl));
    }

    public final boolean m(Set<jpn> set) {
        assert (this.jLT);
        return this.n(set);
    }

    public final boolean crI() {
        assert (this.jLT);
        return this.n(jpn.nLH);
    }

    public final boolean crJ() {
        assert (this.jLT);
        return this.n(jpn.nLI);
    }

    public final boolean crK() {
        assert (this.jLT);
        return this.n(jpn.nLJ);
    }

    public final hmg crL() {
        assert (this.jLT);
        return this.csk();
    }

    public final hmh crM() {
        assert (this.jLT);
        return this.csl();
    }

    public final void c(hms hms2, int n) {
        assert (this.jLT);
        assert (hms2 != null);
        assert (n > 0);
        hng hng2 = new hng(this.kAz);
        hng2.a(hms2, n, this.crP(), 0.0f, 1.0f);
    }

    public final int crN() {
        assert (this.jLT);
        return this.cpu();
    }

    public final int crO() {
        assert (this.jLT);
        return this.cdA();
    }

    public final double crP() {
        assert (this.jLT);
        return this.cpv();
    }

    public final int crQ() {
        assert (this.jLT);
        return this.cpw();
    }

    public final float crR() {
        return this.cpx();
    }

    public final lhi crS() {
        return this.cpy();
    }

    public final void crT() {
        assert (this.jLT);
        if (!this.kNK) {
            this.kNK = true;
        }
        this.csj();
    }

    public final hob crU() {
        assert (this.jLT);
        return this.cdE();
    }

    public final hms crV() {
        assert (this.jLT);
        return this.kNF;
    }

    public final void r(hms hms2) {
        assert (this.jLT);
        assert (hms2 == this.kNF);
        this.kNF = null;
        this.csr();
    }

    public final void s(hms hms2) {
        assert (this.jLT);
        if (this.v(hms2)) {
            this.csr();
        }
    }

    public final void a(String string, hms hms2) {
        assert (this.jLT);
        assert (hms2 == null || !hms2.isInitialized());
        hoc hoc2 = this.a("modal desktop for " + string, this.kND.cqv());
        this.s(null);
        this.css();
        this.kND.j(hoc2);
        hoc2.j(hms2);
    }

    public final void t(hms hms2) {
        assert (this.jLT);
        assert (hms2 != null);
        assert (hms2.isInitialized());
        assert (hms2.cqt() instanceof hoc);
        hoc hoc2 = (hoc)hms2.cqt();
        this.a(hoc2);
    }

    public final void a(lhi lhi2) {
        assert (this.jLT);
        this.b(lhi2);
    }

    public final void a(lgg lgg2, lhu lhu2, List<hnt> list) {
        this.a(lgg2, lhu2, list, null);
    }

    public final void a(lgg lgg2, lhu lhu2, List<hnt> list, hnt hnt2) {
        boolean bl;
        assert (this.jLT);
        if (this.kNG != null) {
            this.crW();
        }
        this.kNH = list;
        if (this.kNH.size() == 0 && hnt2 == null) {
            return;
        }
        hnt[] hntArray = new hnt[this.kNH.size()];
        this.kNH.toArray(hntArray);
        if (lgg2 == null) {
            lgg2 = this.kNN;
        }
        lhf lhf2 = this.cpz();
        lgg2 = lgg2.i(lhf2);
        this.kNG = this.a(lgg2, lhu2, hntArray, hnt2);
        lhf lhf3 = this.kND.cqv();
        boolean bl2 = this.kNG.cqw().cf + this.kNG.getWidth() > lhf3.rmN;
        boolean bl3 = bl = this.kNG.cqw().cg + this.kNG.getHeight() > lhf3.H;
        if (bl2 && bl) {
            int n = lgg2.cf - lhf2.rmN - this.kNG.getWidth();
            int n2 = lgg2.cg - lhf2.H - this.kNG.getHeight();
            this.kNG.cB(n, n2);
        } else if (bl2) {
            int n = lhf3.rmN - this.kNG.getWidth();
            this.kNG.cB(n, this.kNG.cqw().cg);
        } else if (bl) {
            int n = lhf3.H - this.kNG.getHeight();
            this.kNG.cB(this.kNG.cqw().cf, n);
        }
        this.crU().j(this.kNG);
    }

    public final void a(lhu lhu2, List<hnt> list) {
        this.a(lhu2, list, null);
    }

    public final void a(lhu lhu2, List<hnt> list, hnt hnt2) {
        assert (this.jLT);
        this.a(this.kNN, lhu2, list, hnt2);
    }

    public final void a(lhu lhu2, hms hms2) {
        boolean bl;
        assert (this.jLT);
        if (this.kNG != null) {
            this.crW();
        }
        lhf lhf2 = this.cpz();
        lgg lgg2 = this.kNN.i(lhf2);
        hms2.z(lgg2);
        this.kNG = hms2;
        lhf lhf3 = this.kND.cqv();
        boolean bl2 = this.kNG.cqw().cf + this.kNG.getWidth() > lhf3.rmN;
        boolean bl3 = bl = this.kNG.cqw().cg + this.kNG.getHeight() > lhf3.H;
        if (bl2 && bl) {
            int n = lgg2.cf - this.kNG.getWidth();
            int n2 = lgg2.cg - this.kNG.getHeight();
            this.kNG.cB(n, n2);
        } else if (bl2) {
            int n = lhf3.rmN - this.kNG.getWidth();
            this.kNG.cB(n, this.kNG.cqw().cg);
        } else if (bl) {
            int n = lhf3.H - this.kNG.getHeight();
            this.kNG.cB(this.kNG.cqw().cf, n);
        }
        this.crU().j(this.kNG);
    }

    public final void be(List<hnt> list) {
        assert (this.jLT);
        assert (list != null);
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        if (this.kNH != null) {
            linkedList.addAll(this.kNH);
        }
        linkedList.addAll(list);
        this.a(this.kNN, this.kNI, linkedList);
    }

    public final void crW() {
        assert (this.jLT);
        assert (this.kNG != null);
        if (this.kNG.isInitialized()) {
            this.kNG.remove();
        }
        this.kNG = null;
        this.kNI = null;
        this.kNH = null;
    }

    public final hms crX() {
        assert (this.jLT);
        return this.kNG;
    }

    public final lhf a(hnb hnb2, String string) {
        assert (this.jLT);
        return this.c(hnb2, string);
    }

    public final lhf b(hnb hnb2, String string) {
        assert (this.jLT);
        return this.c(hnb2, string, false, 999999, false);
    }

    public final int a(hnb hnb2, String string, boolean bl, int n, boolean bl2) {
        assert (this.jLT);
        return this.c((hnb)hnb2, (String)string, (boolean)bl, (int)n, (boolean)bl2).H;
    }

    public final double crY() {
        assert (this.jLT);
        return this.cdB();
    }

    public final lgg d(lgg lgg2, lhf lhf2) {
        int n = lhf2.rmN;
        n = Math.max(n, 0);
        n = Math.min(n, this.kND.getWidth());
        int n2 = lhf2.H;
        n2 = Math.max(n2, 0);
        n2 = Math.min(n2, this.kND.getHeight());
        int n3 = lgg2.cf;
        n3 = Math.max(n3, 0);
        n3 = Math.min(n3, this.kND.getWidth() - n);
        int n4 = lgg2.cg;
        n4 = Math.max(n4, 0);
        n4 = Math.min(n4, this.kND.getHeight() - n2);
        if (this.kND.getWidth() - n3 < n3 + n) {
            n3 = this.kND.getWidth() - n3;
            n3 -= n;
            n3 ^= 0xFFFFFFFF;
        }
        if (this.kND.getHeight() - n4 < n4 + n2) {
            n4 = this.kND.getHeight() - n4;
            n4 -= n2;
            n4 ^= 0xFFFFFFFF;
        }
        return new lgg(n3, n4);
    }

    public final lgg e(lgg lgg2, lhf lhf2) {
        int n = lhf2.rmN;
        n = Math.max(n, 0);
        n = Math.min(n, this.kND.getWidth());
        int n2 = lhf2.H;
        n2 = Math.max(n2, 0);
        n2 = Math.min(n2, this.kND.getHeight());
        int n3 = lgg2.cf;
        int n4 = lgg2.cg;
        if (n3 < 0) {
            n3 ^= 0xFFFFFFFF;
            n3 += n;
            n3 = this.kND.getWidth() - n3;
        }
        if (n4 < 0) {
            n4 ^= 0xFFFFFFFF;
            n4 += n2;
            n4 = this.kND.getHeight() - n4;
        }
        n3 = Math.min(n3, this.kND.getWidth() - n);
        n3 = Math.max(n3, 0);
        n4 = Math.min(n4, this.kND.getHeight() - n2);
        n4 = Math.max(n4, 0);
        return new lgg(n3, n4);
    }

    public final lcu cqJ() {
        assert (this.jLT);
        return this.kNJ;
    }

    public final void c(lcu lcu2) {
        assert (this.jLT);
        if (this.kNJ == lcu2) {
            return;
        }
        this.kNJ = lcu2;
        this.csm();
    }

    public final b crZ() {
        assert (this.jLT);
        b b2 = this.cdz();
        this.a(b2);
        return b2;
    }

    public final void c(b b2) {
        assert (this.jLT);
        this.b(b2);
    }

    public final double csa() {
        assert (this.jLT);
        return this.csn();
    }

    public final int csb() {
        assert (this.jLT);
        return this.cso();
    }

    public final boolean csc() {
        assert (this.jLT);
        return this.kNL;
    }

    public final boolean csd() {
        assert (this.jLT);
        assert (this.kNP);
        return this.kNM;
    }

    public final lgg cqu() {
        assert (this.jLT);
        return this.kNN;
    }

    public final lgg cse() {
        assert (this.jLT);
        assert (this.kNL);
        return new lgg(this.kNN.cf - this.kNO.cf, this.kNN.cg - this.kNO.cg);
    }

    public final String clipboardRead() {
        return SFJNIUtils.Instance.clipboardRead();
    }

    public final String csf() {
        String string = this.clipboardRead();
        if (string == null) {
            return null;
        }
        return string.replaceAll("[\r\n\t]", "");
    }

    public final boolean clipboardWrite(String string) {
        return SFJNIUtils.Instance.clipboardWrite(string);
    }

    public final hnu a(String string, String string2, hoz.a[] aArray, Object object, hoz.a a2, hoz.a a3, lbn lbn2) {
        return this.a(string, string2, aArray, null, false, object, a2, a3, lbn2);
    }

    public final hnu a(String string, String string2, hoz.a[] aArray, String string3, boolean bl, Object object, hoz.a a2, hoz.a a3, lbn lbn2) {
        hnu hnu2 = this.a(string, string2, aArray, string3, bl, object, a2, a3);
        this.a("Prompt", (hms)hnu2);
        hnu2.cqV();
        new a(hnu2, lbn2);
        return hnu2;
    }

    public final hnd csg() {
        return this.kLZ;
    }

    public final void csh() {
        if (this.kNF != null) {
            return;
        }
        this.u(this.crU());
    }

    public final void csi() {
        ArrayList<hob> arrayList = new ArrayList<hob>();
        for (hob hob2 : lin.a(this.kND.crn(), hob.class)) {
            if (!hob2.kRq) continue;
            arrayList.add(hob2);
        }
        for (hob hob2 : arrayList) {
            this.a(hob2);
        }
    }

    public final void a(ldl ldl2) {
        this.kNB.add(ldl2);
    }

    public final void h(char c2) {
        assert (this.jLT);
        this.i(c2);
    }

    public final void e(lhf lhf2) {
        assert (this.jLT);
        this.a(lhf2);
    }

    public final List<String> b(hnb hnb2, String string, boolean bl, int n, boolean bl2) {
        if (bl) {
            return this.a(hnb2, string, n, bl2);
        }
        return hnc.mW(string);
    }

    public final String a(List<String> list, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\r\n");
            }
            stringBuilder.append(bl ? string.trim() : string);
        }
        return stringBuilder.toString();
    }

    protected void cbg() {
        assert (this.jLT);
        if (this.kNA.isStarted()) {
            this.kNA.stop();
        }
        this.csi();
        this.kaX.enp();
        this.kND.cleanup();
        this.mU(false);
        assert (this.kLM.isEmpty());
        assert (this.kNz.isEmpty());
        assert (this.kaX.isEmpty());
        this.jLT = false;
    }

    protected hoc a(String string, lhf lhf2) {
        return new hoc(this, string, lhf2, true);
    }

    protected abstract boolean n(Set<jpn> var1);

    protected abstract void b(lhi var1);

    protected abstract lhf c(hnb var1, String var2);

    protected abstract lhf c(hnb var1, String var2, boolean var3, int var4, boolean var5);

    protected abstract void csj();

    protected abstract hmg csk();

    protected abstract hmh csl();

    protected abstract void csm();

    protected b cdz() {
        return new b();
    }

    protected void a(b b2) {
        lda.by(b2);
    }

    protected void b(b b2) {
        lda.by(b2);
    }

    protected abstract double csn();

    protected abstract int cso();

    protected double cdB() {
        return 1.0;
    }

    protected void cdD() {
        this.kNz.enp();
        if (this.kNF != null) {
            this.kNF.cqI();
            return;
        }
        this.crU().cqI();
        this.u(this.crU());
    }

    protected void csp() {
        this.kLM.enp();
        if (this.kNF != null) {
            this.kNF.cqK();
        } else {
            this.crU().cqK();
        }
    }

    protected void csq() {
        this.kLM.enp();
        if (this.kNF != null) {
            this.kNF.cqL();
        } else {
            this.crU().cqL();
        }
    }

    protected boolean LM(int n) {
        hob hob2 = this.crU();
        hob2.Nj(n);
        return false;
    }

    protected void ccc() {
        assert (this.kNF == null);
        this.crU().cqM();
    }

    protected boolean a(int n, boolean bl, Set<jpn> set) {
        if (this.kLZ.a(n, set)) {
            return true;
        }
        this.crU().b(n, bl, set);
        return false;
    }

    protected boolean LN(int n) {
        this.crU().Ni(n);
        return false;
    }

    protected abstract int cpu();

    protected abstract int cdA();

    protected abstract double cpv();

    protected abstract int cpw();

    protected abstract float cpx();

    protected abstract lhi cpy();

    protected abstract hnu a(String var1, String var2, hoz.a[] var3, String var4, boolean var5, Object var6, hoz.a var7, hoz.a var8);

    protected void csr() {
    }

    protected void cdC() {
    }

    protected abstract hpv a(lgg var1, lhu var2, hnt[] var3, hnt var4);

    protected abstract lhf cpz();

    protected hob cdE() {
        return (hob)this.kND.cro();
    }

    protected void i(char c2) {
        if (this.jHr == null) {
            return;
        }
        this.jHr.e(c2);
    }

    protected void cdF() {
        assert (this.jLT);
    }

    protected void a(lhf lhf2) {
        this.kND.d(lhf2);
    }

    private void b(hly hly2) {
        if (hly2 == this.jHr) {
            return;
        }
        this.jHr = hly2;
        this.cdF();
    }

    protected final void cqN() {
        this.v(null);
        this.cdC();
    }

    protected final void css() {
        if (this.kNG != null) {
            this.crW();
        }
        if (this.kNA.isStarted()) {
            this.kNA.stop();
        }
    }

    private void u(hms hms2) {
        lcu lcu2 = hms2.cqJ();
        this.c(lcu2);
    }

    private boolean v(hms hms2) {
        assert (this.kNQ == null);
        if (hms2 == this.kNF) {
            return false;
        }
        if (this.kNA.isStarted()) {
            this.kNA.stop();
        }
        if (this.kNF != null) {
            this.kNQ = this.kNF;
            this.kNF = null;
            this.kNQ.cqN();
            this.kNQ = null;
        }
        this.kNF = hms2;
        return true;
    }

    private final void a(hob hob2) {
        assert (this.jLT);
        hob2.remove();
    }

    private List<String> a(hnb hnb2, String string, int n, boolean bl) {
        List<String> list = hnc.mW(string);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : list) {
            List<String> list2 = this.b(hnb2, string2, n, bl);
            arrayList.addAll(list2);
        }
        if (arrayList.size() == 0) {
            arrayList.add("");
        }
        return arrayList;
    }

    private static List<String> mW(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = 0;
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            int n2 = 0;
            if (i + 1 < string.length()) {
                char c3 = string.charAt(i + 1);
                if (c2 == '\r' && c3 == '\n' || c2 == '\n' && c3 == '\r') {
                    n2 = 2;
                } else if (c2 == '\r' || c2 == '\n') {
                    n2 = 1;
                }
            } else if (c2 == '\r' || c2 == '\n') {
                n2 = 1;
            }
            if (n2 <= 0) continue;
            String string2 = string.substring(n, i);
            arrayList.add(string2);
            n = i += n2;
        }
        arrayList.add(string.substring(n));
        return arrayList;
    }

    private List<String> b(hnb hnb2, String string, int n, boolean bl) {
        assert (n >= 0);
        ArrayList<String> arrayList = new ArrayList<String>();
        BreakIterator breakIterator = BreakIterator.getLineInstance();
        breakIterator.setText(string);
        int n2 = 0;
        int n3 = breakIterator.first();
        while (n3 != -1) {
            assert (n3 >= n2);
            if (n3 != n2) {
                String string2 = string.substring(n2, n3);
                arrayList.add(string2);
                n2 = n3;
            }
            n3 = breakIterator.next();
        }
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (int i = 0; i < arrayList.size(); ++i) {
            String string3;
            String string4 = (String)arrayList.get(i);
            int n4 = this.a((hnb)hnb2, (String)(bl ? string4.trim() : string4)).rmN;
            if (n4 > n) {
                if (string4.length() <= 1) {
                    arrayList2.add(string4);
                    continue;
                }
                int n5 = string4.length() - 1;
                while (true) {
                    string3 = string4.substring(0, n5);
                    if (n5 <= 1 || (n4 = this.a((hnb)hnb2, (String)(bl ? string3.trim() : string3)).rmN) <= n) break;
                    --n5;
                }
                assert (n5 > 0);
                arrayList2.add(string3);
                arrayList.set(i, string4.substring(n5));
                --i;
                continue;
            }
            String string5 = string4;
            while (i + 1 < arrayList.size()) {
                string3 = string5 + (String)arrayList.get(i + 1);
                n4 = this.a((hnb)hnb2, (String)(bl ? string3.trim() : string3)).rmN;
                if (n4 > n) break;
                string5 = string3;
                ++i;
            }
            arrayList2.add(string5);
        }
        return arrayList2;
    }

    private void mU(boolean bl) {
        this.kNA.esg().a(bl, this.kNE);
        this.kAz.eme().a(bl, this.jZW);
    }

    static /* synthetic */ boolean a(hnc hnc2) {
        return hnc2.jLT;
    }

    static /* synthetic */ hms b(hnc hnc2) {
        return hnc2.kNF;
    }

    static /* synthetic */ List c(hnc hnc2) {
        return hnc2.kNB;
    }

    static /* synthetic */ boolean d(hnc hnc2) {
        return hnc2.kNK;
    }

    static /* synthetic */ boolean a(hnc hnc2, boolean bl) {
        hnc2.kNK = bl;
        return hnc2.kNK;
    }
}

