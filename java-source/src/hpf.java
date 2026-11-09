/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class hpf
extends hpw {
    private final ldl khR = new ldl();
    private final ldl khS = new ldl();
    private final c kUZ;
    private final int khU;
    private final hpe kfS;
    private final hpa khW;
    private final lhz khY;
    private final b kVa;
    private final ArrayList<hpa> kVb = new ArrayList();
    private final lbn kfc = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final void W() {
            if (!hpf.a(this.kVo)) {
                return;
            }
            double d2 = hpf.b(this.kVo).esb();
            double d3 = d2 * (double)this.kVo.kLu.crR();
            d3 = Math.abs(Math.sin(d3));
            float f2 = (float)d3;
            if ((f2 *= 1.5f) > 1.0f) {
                f2 = 1.0f;
            }
            if (!($assertionsDisabled || f2 >= 0.0f && f2 <= 1.0f)) {
                throw new AssertionError();
            }
            hpf.c(this.kVo).H(new lcq(1.0f, 1.0f, 1.0f, f2));
        }

        static {
            $assertionsDisabled = !hpf.class.desiredAssertionStatus();
        }
    };
    private final lbp kik = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.rer, false, false);
            return true;
        }
    };
    private final lbp kil = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.rer, true, false);
            return true;
        }
    };
    private final lbp kim = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.rer, false, true);
            return true;
        }
    };
    private final lbp kin = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.rer, true, true);
            return true;
        }
    };
    private final lbp kio = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.ret, false, false);
            return true;
        }
    };
    private final lbp kip = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.ret, true, false);
            return true;
        }
    };
    private final lbp kiq = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.ret, false, true);
            return true;
        }
    };
    private final lbp kir = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.ret, true, true);
            return true;
        }
    };
    private final lbp kis = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, -1, false);
            return true;
        }
    };
    private final lbp kit = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, -1, true);
            return true;
        }
    };
    private final lbp kVc = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.b(this.kVo, -1, true);
            return true;
        }
    };
    private final lbp kVd = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.b(this.kVo, -1, true);
            return true;
        }
    };
    private final lbp kiu = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, 1, false);
            return true;
        }
    };
    private final lbp kiv = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, 1, true);
            return true;
        }
    };
    private final lbp kVe = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.b(this.kVo, 1, false);
            return true;
        }
    };
    private final lbp kVf = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.b(this.kVo, 1, true);
            return true;
        }
    };
    private final lbp kVg = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.rer, false);
            return true;
        }
    };
    private final lbp kVh = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.rer, true);
            return true;
        }
    };
    private final lbp kVi = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.ret, false);
            return true;
        }
    };
    private final lbp kVj = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, ldd.ret, true);
            return true;
        }
    };
    private final lbp kiw = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.a(this.kVo, !hpf.d(this.kVo));
            return true;
        }
    };
    private final lbp kix = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.e(this.kVo);
            return true;
        }
    };
    private final lbp jHX = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            hpf.f(this.kVo);
            return true;
        }
    };
    private final lbp kiy = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            return true;
        }
    };
    private final lbp kOQ = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            this.kVo.kiG.selectAll();
            return true;
        }
    };
    private final lbp jHs = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            this.kVo.kiG.cha();
            return true;
        }
    };
    private final lbp jHt = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            this.kVo.kiG.chb();
            return true;
        }
    };
    private final lbp jHu = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            this.kVo.kiG.chc();
            return true;
        }
    };
    private final lbp kiz = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            this.kVo.kiG.chC();
            return true;
        }
    };
    private final lbp kiA = new lbp(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final boolean caU() {
            this.kVo.kiG.chB();
            return true;
        }
    };
    private final hly jHr = new hly(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final void e(char c2) {
            hpf.a(this.kVo, c2);
        }
    };
    private boolean Initialized;
    private a kVk;
    private int kib;
    private int kic;
    private boolean kid;
    private boolean kig;
    private boolean kVl;
    private boolean kVm;
    public final hmj kiG = new hmj(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public lbl<lbn> chx() {
            return hpf.g(this.kVo);
        }

        public lbl<lbn> chy() {
            return hpf.h(this.kVo);
        }

        public String chz() {
            return hpf.i(this.kVo).getText();
        }

        public boolean mN(String string) {
            if (!hpf.a(this.kVo, string)) {
                return false;
            }
            this.setCaretPosition(0);
            return true;
        }

        public int getCaretPosition() {
            if (!$assertionsDisabled && !hpf.a(this.kVo)) {
                throw new AssertionError();
            }
            return hpf.j(this.kVo);
        }

        public void setCaretPosition(int n) {
            this.L(n, false);
        }

        public void L(int n, boolean bl) {
            if (!($assertionsDisabled || n >= 0 && n <= this.chz().length())) {
                throw new AssertionError((Object)(n + " " + this.chz().length()));
            }
            int n2 = bl ? hpf.k(this.kVo) : n;
            hpf.a(this.kVo, n, n2);
        }

        public void selectAll() {
            if (!$assertionsDisabled && !hpf.a(this.kVo)) {
                throw new AssertionError();
            }
            lgg lgg2 = this.kVo.cqw();
            hpf.a(this.kVo, hpf.i(this.kVo).getText().length(), 0);
            this.kVo.z(lgg2);
        }

        public String chA() {
            int n;
            int n2 = hpf.k(this.kVo);
            if (n2 > (n = hpf.j(this.kVo))) {
                int n3 = n2;
                n2 = n;
                n = n3;
            }
            String string = this.chz();
            return string.substring(n2, n);
        }

        public boolean mO(String string) {
            int n;
            int n2 = hpf.k(this.kVo);
            if (n2 > (n = hpf.j(this.kVo))) {
                int n3 = n2;
                n2 = n;
                n = n3;
            }
            String string2 = this.chz();
            string2 = string2.substring(0, n2) + string + string2.substring(n);
            this.L(n, false);
            if (!hpf.a(this.kVo, string2)) {
                return false;
            }
            string2 = this.chz();
            int n4 = n2 + string.length();
            if (n4 > string2.length()) {
                n4 = string2.length();
            }
            this.L(n4, false);
            return true;
        }

        public void cha() {
            this.chb();
            this.mO("");
        }

        public void chb() {
            String string = this.chA();
            this.kVo.kLu.clipboardWrite(string);
        }

        public void chc() {
            String string = this.kVo.kLu.clipboardRead();
            if (string != null) {
                this.mO(string);
            }
        }

        public void chB() {
            this.chC();
            this.mO("");
        }

        public void chC() {
            String string = this.kVo.kLu.clipboardRead();
            if (string == null) {
                string = "";
            }
            string = string + this.chA();
            this.kVo.kLu.clipboardWrite(string);
        }

        public boolean chD() {
            return hpf.l(this.kVo);
        }

        public boolean ns(boolean bl) {
            if (bl == hpf.l(this.kVo)) {
                return false;
            }
            hpf.b(this.kVo, bl);
            this.kVo.chm();
            return true;
        }

        public int chE() {
            return hpf.i(this.kVo).getLineCount();
        }

        static {
            $assertionsDisabled = !hpf.class.desiredAssertionStatus();
        }
    };
    private final lbn kVn = new lbn(this){
        final /* synthetic */ hpf kVo;
        {
            this.kVo = hpf2;
        }

        public final void W() {
            if (!hpf.a(this.kVo)) {
                return;
            }
            hpf.m(this.kVo);
        }
    };

    public hpf(hnc hnc2, String string, lgg lgg2, lhf lhf2, c c2, int n) {
        super(hnc2, string, lgg2, lhf2, c2.khH);
        this.kUZ = c2;
        this.khU = n;
        this.khY = new lhz(this.kLu.kAz);
        this.kfS = new hpe(this.kLu, null, lgg.rlI, lhf.rnv, c2.kiK, "", false);
        this.j(this.kfS);
        this.khW = new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, c2.kiL);
        this.j(this.khW);
        this.khW.nR(true);
        this.kVa = new b(this.kLu, null, lgg.rlI, lhf.rnv, this.kUZ.kiP);
        this.j(this.kVa);
        this.kVa.kgb.H(this.kUZ.kiQ);
        this.chp();
    }

    public final void a(a a2) {
        assert (a2 != null);
        assert (!this.Initialized);
        assert (this.kVk == null);
        this.kVk = a2;
    }

    public final void ok(boolean bl) {
        assert (this.Initialized);
        if (bl == this.kVl) {
            return;
        }
        this.kVl = bl;
        this.cvd();
    }

    public final boolean cuV() {
        return this.kUZ.kiK instanceof hpe.d;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.chn();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kVl) {
            this.kVl = false;
            this.cvd();
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        return this.kLu.kNx;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        this.cqV();
        int n = this.M(this.cqu());
        this.kiG.L(n, this.kLu.crI());
    }

    @Override
    protected void cbu() {
        assert (this.Initialized);
        super.cbu();
        if (this.kLu.csc()) {
            int n = this.M(this.cqu());
            this.kiG.L(n, true);
        }
    }

    @Override
    protected int a(ldb ldb2, ldd ldd2, int n) {
        assert (this.Initialized);
        if (ldb2 == ldb.reo) {
            return n;
        }
        int n2 = this.kfS.cuX();
        n /= n2;
        int n3 = this.kfS.getLineCount();
        n += ldd2.reu;
        n = Math.max(n, 0);
        if ((n = Math.min(n, n3)) >= n3) {
            n = n3 - 1;
        }
        n2 = this.kfS.cuX();
        return n *= n2;
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        this.cvd();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
    }

    protected String mL(String string) {
        if (this.kVk != null) {
            string = this.kVk.mQ(string);
        }
        return string;
    }

    protected void chk() {
        if (this.kVk != null) {
            this.kVk.chF();
        }
        this.khS.enp();
    }

    protected void chl() {
        this.chn();
        this.l(this.khW.cqD());
        this.cvb();
        this.khR.enp();
        if (this.kVk != null) {
            this.kVk.chG();
        }
    }

    protected void chm() {
        lhf lhf2 = this.kig ? this.cqv() : lhf.rnv;
        this.kVa.d(lhf2);
        this.kVa.kgb.d(lhf2);
    }

    protected void cuZ() {
        if (this.kVm) {
            this.kiG.selectAll();
        }
        this.khW.nR(!this.kVm);
        for (int i = 0; i < this.kVb.size(); ++i) {
            this.kVb.get(i).nR(!this.kVm);
        }
        this.khY.setStarted(this.kVm);
        this.khY.eqf().a(this.kVm, this.kfc);
        if (this.kVm) {
            this.kLu.kAz.b(this.kVn);
        } else {
            this.cva();
        }
    }

    private void cva() {
        if (this.kVm == this.kLu.a(this.jHr)) {
            return;
        }
        this.kLu.a(this.kVm, this.jHr);
    }

    private void chn() {
        int n;
        lgg lgg2 = this.NM(this.kib);
        int n2 = lgg2.cf;
        if (this.kid) {
            String string = this.kib < this.kfS.getText().length() ? this.kfS.getText().substring(this.kib, this.kib + 1) : "0";
            lhf lhf2 = this.kLu.a(this.kfS.cuW().jFE, string);
            n = lhf2.rmN;
        } else {
            int n3 = this.kUZ.kiN;
            n2 -= n3 / 2;
            n = n3;
        }
        lgs lgs2 = new lgs(n2, lgg2.cg, n, this.kfS.cuX());
        this.khW.j(lgs2);
    }

    private void cvb() {
        int n = this.kib;
        int n2 = this.kic;
        if (n > n2) {
            int n3 = n;
            n = n2;
            n2 = n3;
        }
        lgg lgg2 = this.kfS.NL(n);
        lgg lgg3 = this.kfS.K(lgg2);
        lgg lgg4 = this.kfS.NL(n2);
        lgg lgg5 = this.kfS.K(lgg4);
        assert (this.kVb.size() == this.kfS.getLineCount());
        for (int i = 0; i < this.kVb.size(); ++i) {
            hpa hpa2 = this.kVb.get(i);
            if (i < lgg2.cg || i > lgg4.cg) {
                hpa2.Ne(this.kUZ.kiO);
                hpa2.Ng(0);
                continue;
            }
            lgg lgg6 = new lgg(0, i);
            lgg lgg7 = new lgg(this.kfS.NK(i), i);
            int n4 = this.kfS.K((lgg)lgg6).cf;
            int n5 = this.kfS.K((lgg)lgg7).cf;
            if (i == lgg2.cg) {
                n4 = lgg3.cf;
            }
            if (i == lgg4.cg) {
                n5 = lgg5.cf;
            }
            hpa2.Ne(this.kUZ.kiO + n4);
            hpa2.Ng(Math.max(0, n5 - n4));
        }
    }

    private lgg NM(int n) {
        lgg lgg2 = this.kfS.NM(n);
        lgg2 = this.a((hms)this.kfS, lgg2);
        return lgg2;
    }

    private int M(lgg lgg2) {
        lgg2 = this.kfS.a((hms)this, lgg2);
        return this.kfS.M(lgg2);
    }

    private boolean mM(String string) {
        if (this.kfS.getText().equals(string)) {
            return false;
        }
        if ((string = this.mL(string)).length() > this.khU) {
            return false;
        }
        this.kfS.mV(string);
        this.chp();
        this.chk();
        return true;
    }

    private void chp() {
        int n;
        int n2;
        if (this.cuV()) {
            n2 = this.getWidth() - this.kUZ.kiO * 2;
            n = this.kLu.a(this.kUZ.kiK.jFE, this.kfS.getText(), true, n2, false);
            if (n == 0) {
                n = this.kLu.a(this.kUZ.kiK.jFE, "w", true, n2, false);
            }
        } else {
            n2 = this.kLu.a((hnb)this.kUZ.kiK.jFE, (String)this.kfS.getText()).rmN;
            n = this.kUZ.kiK.jFE.kNb * 2;
        }
        this.cC(n2 + this.kUZ.kiO * 2, n);
        if (this.kig) {
            this.kVa.d(this.cqv());
            this.kVa.kgb.d(this.cqv());
        }
        this.kfS.cB(this.kUZ.kiO, 0);
        this.kfS.cC(Math.max(0, n2), Math.max(0, n));
        this.cvc();
    }

    protected void cvc() {
        int n;
        int n2 = this.kfS.getLineCount();
        for (n = this.kVb.size() - 1; n >= n2; --n) {
            hpa hpa2 = this.kVb.remove(n);
            hpa2.remove();
        }
        n = this.m(this.kfS);
        int n3 = this.kfS.cuX();
        for (int i = this.kVb.size(); i < n2; ++i) {
            hpa hpa3 = new hpa(this.kLu, (String)null, new lgg(0, i * n3), new lhf(0, n3), this.kUZ.kiM);
            this.j(hpa3);
            this.kVb.add(hpa3);
            this.b((hms)hpa3, n);
        }
    }

    private boolean cp(int n, int n2) {
        this.kib = n;
        this.kic = n2;
        if (this.Initialized) {
            this.chl();
        }
        return true;
    }

    private boolean Mi(int n) {
        String string = this.kfS.getText();
        if (n >= string.length()) {
            return false;
        }
        char c2 = string.charAt(n);
        return Character.isLetterOrDigit(c2);
    }

    private void g(char c2) {
        int n;
        assert (this.Initialized);
        if (c2 < ' ') {
            return;
        }
        if (this.kid && this.kic == this.kib && (n = this.kib + 1) <= this.kfS.getText().length()) {
            this.kiG.L(n, true);
        }
        this.kiG.mO(new String(new char[]{c2}));
    }

    private void b(ldd ldd2, boolean bl, boolean bl2) {
        int n;
        block13: {
            int n2;
            block12: {
                assert (ldd2 == ldd.rer || ldd2 == ldd.ret);
                n = this.kib;
                n2 = this.kfS.getText().length();
                if (!bl2) break block12;
                switch (ldd2) {
                    case rer: {
                        if (n > 0) {
                            boolean bl3 = this.Mi(n - 1);
                            --n;
                            while (n > 0 && bl3 == this.Mi(n - 1)) {
                                --n;
                            }
                        }
                        break block13;
                    }
                    case ret: {
                        if (n < n2) {
                            boolean bl4 = this.Mi(n);
                            ++n;
                            while (n < n2 && bl4 == this.Mi(n)) {
                                ++n;
                            }
                        }
                        break block13;
                    }
                    default: {
                        assert (false) : ldd2;
                        break block13;
                    }
                }
            }
            if ((n += ldd2.reu) < 0) {
                n = 0;
            }
            if (n > n2) {
                n = n2;
            }
        }
        this.kiG.L(n, bl);
    }

    private void a(ldd ldd2, boolean bl) {
        lgg lgg2 = this.kfS.NL(this.kib);
        int n = lgg2.cg;
        switch (ldd2) {
            case rer: {
                if (n <= 0) {
                    return;
                }
                --n;
                break;
            }
            case ret: {
                if (n >= this.kfS.getLineCount() - 1) {
                    return;
                }
                ++n;
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
        int n2 = this.kfS.K((lgg)lgg2).cf;
        lgg lgg3 = new lgg(n2, n * this.kfS.cuX());
        int n3 = this.kfS.M(lgg3);
        if (n3 > this.kfS.getText().length()) {
            n3 = this.kfS.getText().length();
        }
        this.kiG.L(n3, bl);
    }

    private void U(int n, boolean bl) {
        assert (n == -1 || n == 1);
        lgg lgg2 = this.kfS.NL(this.kib);
        int n2 = 0;
        switch (n) {
            case -1: {
                n2 = 0;
                break;
            }
            case 1: {
                n2 = this.kfS.NK(lgg2.cg);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        int n3 = this.kfS.J(new lgg(n2, lgg2.cg));
        this.kiG.L(n3, bl);
    }

    private void V(int n, boolean bl) {
        assert (n == -1 || n == 1);
        int n2 = n == -1 ? 0 : this.kfS.getText().length();
        this.kiG.L(n2, bl);
    }

    private void nr(boolean bl) {
        if (bl == this.kid) {
            return;
        }
        this.kid = bl;
        if (this.Initialized) {
            this.chl();
        }
    }

    private void chq() {
        if (this.kic == this.kib && this.kib > 0) {
            this.kiG.L(this.kib - 1, true);
        }
        this.kiG.mO("");
    }

    private void chr() {
        if (this.kic == this.kib && this.kib < this.kfS.getText().length()) {
            this.kiG.L(this.kib + 1, true);
        }
        this.kiG.mO("");
    }

    private void cvd() {
        boolean bl;
        boolean bl2 = bl = this.isFocusOwner() || this.kVl;
        if (bl == this.kVm) {
            return;
        }
        this.kVm = bl;
        this.cuZ();
    }

    private void mU(boolean bl) {
        this.a(bl, this.kik, 37, jpn.nLm);
        this.a(bl, this.kil, 37, jpn.nLH);
        this.a(bl, this.kim, 37, jpn.nLI);
        this.a(bl, this.kin, 37, jpn.nLL);
        this.a(bl, this.kio, 39, jpn.nLm);
        this.a(bl, this.kip, 39, jpn.nLH);
        this.a(bl, this.kiq, 39, jpn.nLI);
        this.a(bl, this.kir, 39, jpn.nLL);
        this.a(bl, this.kVg, 38, jpn.nLm);
        this.a(bl, this.kVh, 38, jpn.nLH);
        this.a(bl, this.kVi, 40, jpn.nLm);
        this.a(bl, this.kVj, 40, jpn.nLH);
        this.a(bl, this.kis, 36, jpn.nLm);
        this.a(bl, this.kVc, 36, jpn.nLI);
        this.a(bl, this.kit, 36, jpn.nLH);
        this.a(bl, this.kVd, 36, jpn.nLL);
        this.a(bl, this.kiu, 35, jpn.nLm);
        this.a(bl, this.kVe, 35, jpn.nLI);
        this.a(bl, this.kiv, 35, jpn.nLH);
        this.a(bl, this.kVf, 35, jpn.nLL);
        this.a(bl, this.kiw, 45, jpn.nLm);
        this.a(bl, this.kix, 8, jpn.nLm);
        this.a(bl, this.jHX, 46, jpn.nLm);
        this.a(bl, this.kiy, 34, jpn.nLm);
        this.a(bl, this.kiy, 33, jpn.nLm);
        this.a(bl, this.kiy, 38, jpn.nLm);
        this.a(bl, this.kiy, 40, jpn.nLm);
        this.a(bl, this.kiy, 9, jpn.nLm);
        this.a(bl, this.kiy, 101, jpn.nLm);
        this.a(bl, this.kOQ, 65, jpn.nLI);
        this.a(bl, this.jHs, 88, jpn.nLI);
        this.a(bl, this.jHt, 67, jpn.nLI);
        this.a(bl, this.jHu, 86, jpn.nLI);
        this.a(bl, this.kiA, 88, jpn.nLL);
        this.a(bl, this.kiz, 67, jpn.nLL);
        this.a(bl, this.jHu, 86, jpn.nLL);
        this.a(bl, this.jHs, 46, jpn.nLH);
        this.a(bl, this.jHt, 45, jpn.nLI);
        this.a(bl, this.jHu, 45, jpn.nLH);
        this.a(bl, this.kiA, 46, jpn.nLL);
        this.a(bl, this.kiz, 45, jpn.nLL);
    }

    static /* synthetic */ boolean a(hpf hpf2) {
        return hpf2.Initialized;
    }

    static /* synthetic */ lhz b(hpf hpf2) {
        return hpf2.khY;
    }

    static /* synthetic */ hpa c(hpf hpf2) {
        return hpf2.khW;
    }

    static /* synthetic */ void a(hpf hpf2, ldd ldd2, boolean bl, boolean bl2) {
        hpf2.b(ldd2, bl, bl2);
    }

    static /* synthetic */ void a(hpf hpf2, int n, boolean bl) {
        hpf2.U(n, bl);
    }

    static /* synthetic */ void b(hpf hpf2, int n, boolean bl) {
        hpf2.V(n, bl);
    }

    static /* synthetic */ void a(hpf hpf2, ldd ldd2, boolean bl) {
        hpf2.a(ldd2, bl);
    }

    static /* synthetic */ boolean d(hpf hpf2) {
        return hpf2.kid;
    }

    static /* synthetic */ void a(hpf hpf2, boolean bl) {
        hpf2.nr(bl);
    }

    static /* synthetic */ void e(hpf hpf2) {
        hpf2.chq();
    }

    static /* synthetic */ void f(hpf hpf2) {
        hpf2.chr();
    }

    static /* synthetic */ void a(hpf hpf2, char c2) {
        hpf2.g(c2);
    }

    static /* synthetic */ ldl g(hpf hpf2) {
        return hpf2.khR;
    }

    static /* synthetic */ ldl h(hpf hpf2) {
        return hpf2.khS;
    }

    static /* synthetic */ hpe i(hpf hpf2) {
        return hpf2.kfS;
    }

    static /* synthetic */ boolean a(hpf hpf2, String string) {
        return hpf2.mM(string);
    }

    static /* synthetic */ int j(hpf hpf2) {
        return hpf2.kib;
    }

    static /* synthetic */ int k(hpf hpf2) {
        return hpf2.kic;
    }

    static /* synthetic */ boolean a(hpf hpf2, int n, int n2) {
        return hpf2.cp(n, n2);
    }

    static /* synthetic */ boolean l(hpf hpf2) {
        return hpf2.kig;
    }

    static /* synthetic */ boolean b(hpf hpf2, boolean bl) {
        hpf2.kig = bl;
        return hpf2.kig;
    }

    static /* synthetic */ void m(hpf hpf2) {
        hpf2.cva();
    }
}

