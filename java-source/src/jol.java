/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class jol
implements lbr {
    protected static final joi nHy = joi.nHV;
    private static final int[] nKn = new int[]{59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 75, 76, 77, 79, 80, 81, 82, 87, 88, 100, 101, 102, 126, 141, 145, 146, 147, 149, 151, 153, 160, 161, 178, 183, 197, 219, 220, 221, 222, 223, 227, 229, 230, 231, 232, 233, 234, 235, 236, 237};
    private final lha<dxq, dxq> cdh;
    private final jqx nHJ;
    private final joz nKo;
    private final jok nKp = new jok();
    private final joy nHB;
    private final jpa nKq;
    private final joh nKr;
    private final Set<ldv> nKs = new HashSet<ldv>();
    private final lbn nKt = new lbn(this){
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public final void W() {
            jol.a(this.nKF);
            jol.a(this.nKF, jol.b(this.nKF));
        }
    };
    private final lbn nKu = new lbn(this){
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public final void W() {
            Iterator<jos> iterator = jol.c(this.nKF).a((jow)null).iterator();
            while (iterator.hasNext()) {
                jos jos2 = iterator.next();
                if (!(jos2 instanceof jot) || jol.c(this.nKF).e(jos2) != null) continue;
                iterator.remove();
            }
            jol.a(this.nKF, jol.c(this.nKF));
            jol.d(this.nKF);
        }
    };
    private final lbi<fjf> nKv = new lbi<fjf>(this){
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public void a(fjf fjf2) {
            if (fjf2.ila) {
                jol.e(this.nKF).add(fjf2.aO());
                jol.f((jol)this.nKF).rnh.m(fjg.a(jol.f((jol)this.nKF).rng, fjf2.aO(), jol.b(this.nKF)));
                jol.f((jol)this.nKF).rnh.m(fjg.a(jol.f((jol)this.nKF).rng, fjf2.aO(), jol.c(this.nKF)));
            } else {
                jol.e(this.nKF).remove(fjf2.aO());
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjf)object);
        }
    };
    private final lbi<fje> nKw = new lbi<fje>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public void a(fje fje2) {
            if (fje2.iNF instanceof jok) {
                jol.b(this.nKF).i(fje2.iNF);
            } else if (fje2.iNF instanceof joz) {
                jol.a(this.nKF, true);
                jol.c(this.nKF).i(fje2.iNF);
                jol.a(this.nKF, false);
            } else if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fje)object);
        }

        static {
            $assertionsDisabled = !jol.class.desiredAssertionStatus();
        }
    };
    private final lbi<fjc> nKx = new lbi<fjc>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public void a(fjc fjc2) {
            jox<jpf> jox2;
            try {
                jox2 = jox.a(fjc2.ezf, jol.g((jol)this.nKF).jWW);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                jol.f((jol)this.nKF).rnh.m(fjd.a(jol.f((jol)this.nKF).rng, fjc2.aO(), fjd.a.iNA));
                return;
            }
            if (fjc2.akV == null) {
                jos jos2 = jol.c(this.nKF).b(jox2);
                if (jos2 == null) {
                    jol.f((jol)this.nKF).rnh.m(fjd.a(jol.f((jol)this.nKF).rng, fjc2.aO(), fjd.a.iND));
                    return;
                }
                jol.c(this.nKF).a(jos2, null);
                if (jos2 instanceof jot) {
                    jot jot2 = (jot)jos2;
                    jol.i((jol)this.nKF).kzI.a(false, jot2, jol.h(this.nKF));
                }
            } else {
                jos jos3 = jol.c(this.nKF).sZ(fjc2.akV);
                if (jos3 == null) {
                    jot jot3 = new jot(fjc2.akV);
                    jol.c(this.nKF).f(jot3);
                    jos3 = jot3;
                    jol.i((jol)this.nKF).kzI.a(true, jot3, jol.h(this.nKF));
                }
                if (jos3 instanceof jou) {
                    if (!(jox2.nKT instanceof jpg)) {
                        jol.f((jol)this.nKF).rnh.m(fjd.a(jol.f((jol)this.nKF).rng, fjc2.aO(), fjd.a.iNB));
                        return;
                    }
                } else if (jos3 instanceof jov) {
                    if (!(jox2.nKT instanceof jph)) {
                        jol.f((jol)this.nKF).rnh.m(fjd.a(jol.f((jol)this.nKF).rng, fjc2.aO(), fjd.a.iNC));
                        return;
                    }
                } else if (!$assertionsDisabled) {
                    throw new AssertionError(jox2.nKT);
                }
                jol.c(this.nKF).a(jos3, jox2);
            }
            jol.f((jol)this.nKF).rnh.m(fjd.a(jol.f((jol)this.nKF).rng, fjc2.aO(), fjd.a.iNz));
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjc)object);
        }

        static {
            $assertionsDisabled = !jol.class.desiredAssertionStatus();
        }
    };
    private final lbi<jpk> kuT = new lbi<jpk>(this){
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public void a(jpk jpk2) {
            if (jol.j(this.nKF)) {
                jol.f((jol)this.nKF).rnh.m(fjh.a(jol.f((jol)this.nKF).rng, lcr.acL, jpk2));
            } else {
                jol.k((jol)this.nKF).kuT.m(jpk2);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((jpk)object);
        }
    };
    private final lbi<jpp> nKy = new lbi<jpp>(this){
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public void b(jpp jpp2) {
            if (jol.j(this.nKF)) {
                return;
            }
            if (jol.a(this.nKF, jpp2)) {
                return;
            }
            jol.f((jol)this.nKF).rnh.m(fji.a(jol.f((jol)this.nKF).rng, lcr.acL, jpp2));
        }

        public /* synthetic */ void m(Object object) {
            this.b((jpp)object);
        }
    };
    private final jor nKz = new jor(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public final void a(jov jov2, boolean bl) {
            if (!$assertionsDisabled && jov2 != joj.nIY) {
                throw new AssertionError();
            }
            if (bl) {
                jol.b(this.nKF).dOP().evE();
            }
        }

        static {
            $assertionsDisabled = !jol.class.desiredAssertionStatus();
        }
    };
    private final jor nKA = new jor(this){
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public final void a(jov jov2, boolean bl) {
            if (bl) {
                jot jot2 = (jot)jov2;
                jol.f((jol)this.nKF).rnh.m(egq.a(jol.f((jol)this.nKF).rng, lcr.qCL, jot2.Name, null, jot2.Name));
            }
        }
    };
    private final lbn nKB = new lbn(this){
        final /* synthetic */ jol nKF;
        {
            this.nKF = jol2;
        }

        public final void W() {
            jol.l(this.nKF);
        }
    };
    private boolean Initialized;
    private boolean iNR;
    private boolean iNS;
    private boolean iNT;
    private boolean iNP;
    private b iNQ;
    private a nKC;
    private final Set<jpb> kvi = EnumSet.noneOf(jpb.class);
    private boolean nKD;
    private Collection<jox<? extends jph>> nKE;

    private static boolean Vv(int n) {
        for (int n2 : nKn) {
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    public jol(lbh lbh2, jqx jqx2, lha<dxq, dxq> lha2, joy joy2) {
        assert (lha2 != null);
        assert (jqx2 != null);
        this.cdh = lha2;
        this.nHJ = jqx2;
        this.nHB = joy2;
        joz.a a2 = new joz.a(this.nHJ.jWW, joj.dOL());
        this.nKo = new joz(a2);
        this.nKq = new jpa(this.nHJ.jWW, this.nKo);
        this.nKq.nLc.a(true, this.nHB.nKW);
        this.nKr = new joh(lbh2, this.cdh, this.nHB.kzI);
        this.dPc();
        this.nb(true);
        this.cdh.rnh.m(fjp.a(this.cdh.rng, lcr.acL, this.nHJ.jWW, this.nKo.dPg()));
        this.dPd();
        this.Initialized = true;
        this.c(lfy.a.rkK);
        this.cwS();
    }

    public final void cleanup() {
        assert (this.Initialized);
        this.nb(false);
        this.c(lfy.a.rkL);
        this.nKr.dispose();
        this.Initialized = false;
    }

    public final void e(boolean bl, boolean bl2, boolean bl3) {
        if (bl != this.iNR || bl2 != this.iNS || bl3 != this.iNT) {
            this.iNR = bl;
            this.iNS = bl2;
            this.iNT = bl3;
            this.cwS();
        }
    }

    public final void up(boolean bl) {
        if (bl == this.iNP) {
            return;
        }
        this.iNP = bl;
        this.dOW();
    }

    public final void a(b b2) {
        if (b2 == this.iNQ) {
            return;
        }
        this.iNQ = b2;
        this.dOX();
    }

    @Override
    public boolean a(lfu lfu2) {
        assert (this.Initialized);
        boolean bl = false;
        bl |= lfu2.a("Bindings", this.nKo);
        bl |= lfu2.a("Options", this.nKp);
        if (lfu2.eqA()) {
            for (jot jot2 : lin.a(this.nKo.a((jow)null), jot.class)) {
                this.nHB.kzI.a(true, jot2, this.nKA);
            }
        }
        return bl;
    }

    public final void finalize() {
        assert (!this.Initialized);
    }

    private void c(lfy.a a2) {
        lfz.a(this, a2, this.dOV(), "InputPersistence", lcw.qFE);
    }

    private String dOV() {
        assert (this.Initialized);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("input_persistence.xml");
        return stringBuilder.toString();
    }

    private void cwS() {
        this.dOY();
    }

    private void dOW() {
        if (!this.iNP) {
            this.dPb();
        }
        this.dOY();
    }

    private void dOX() {
        this.dOY();
    }

    private void dOY() {
        a a2 = this.dOZ();
        this.a(a2);
    }

    private void a(a a2) {
        if (a2 == this.nKC) {
            return;
        }
        this.nKC = a2;
        this.dPa();
    }

    private a dOZ() {
        if (!this.iNP) {
            return a.nKJ;
        }
        if (this.iNQ == b.nKN) {
            return a.nKJ;
        }
        if (this.iNS) {
            return a.nKL;
        }
        if (this.iNR) {
            return a.nKJ;
        }
        if (this.iNT) {
            return a.nKK;
        }
        return a.nKL;
    }

    private void dPa() {
        switch (this.nKC) {
            case nKI: {
                this.nHJ.nTt.dRh();
                for (jqk jqk2 : this.nHJ.nTp) {
                    jqk2.dRh();
                }
                break;
            }
            case nKL: {
                this.nHJ.nTt.dRh();
                for (jqk jqk3 : this.nHJ.nTp) {
                    boolean bl = true;
                    jqk3.uE(bl);
                }
                break;
            }
            case nKK: {
                this.nHJ.nTt.uE(true);
                jqm jqm2 = this.nHJ.nTq;
                jqm2.dRh();
                for (jqk jqk4 : this.nHJ.nTp) {
                    if (jqk4 == jqm2) continue;
                    boolean bl = true;
                    jqk4.uE(bl);
                }
                break;
            }
            case nKJ: {
                this.nHJ.nTt.uE(true);
                for (jqk jqk5 : this.nHJ.nTp) {
                    jqk5.dRh();
                }
                break;
            }
            default: {
                assert (false) : this.nKC;
                break;
            }
        }
        this.nKq.reset();
        this.dPb();
    }

    private void dPb() {
        EnumSet<jpb> enumSet = EnumSet.copyOf(this.kvi);
        this.kvi.clear();
        block10: for (jpb jpb2 : enumSet) {
            int n;
            int n2;
            switch (jpb2) {
                case nLg: {
                    n2 = 162;
                    n = 29;
                    break;
                }
                case nLh: {
                    n2 = 163;
                    n = 157;
                    break;
                }
                case nLe: {
                    n2 = 164;
                    n = 56;
                    break;
                }
                case nLf: {
                    n2 = 165;
                    n = 184;
                    break;
                }
                case nLi: {
                    n2 = 160;
                    n = 42;
                    break;
                }
                case nLj: {
                    n2 = 161;
                    n = 54;
                    break;
                }
                case nLk: {
                    n2 = 91;
                    n = 219;
                    break;
                }
                case nLl: {
                    n2 = 92;
                    n = 220;
                    break;
                }
                default: {
                    assert (false);
                    continue block10;
                }
            }
            this.c(n2, n, false, false);
            this.a(jpb2, false);
        }
    }

    private void dPc() {
        if (this.nHJ.nTr != null) {
            this.nHJ.nTr.g(this.nKp.dOQ().getValue(), this.nKp.dOR().getValue());
            if (this.nHJ.nTr.nSz != null) {
                this.nHJ.nTr.nSz.dI(this.nKp.dON().getValue());
            }
            if (this.nHJ.nTr.nSA != null) {
                this.nHJ.nTr.nSA.uF(this.nKp.dOP().getValue());
                this.nHJ.nTr.nSA.dI(this.nKp.dOO().getValue());
            }
        }
        if (this.nHJ.nTs != null) {
            if (this.nHJ.nTs.nSz != null) {
                this.nHJ.nTs.nSz.dI(this.nKp.dOS().getValue());
            }
            if (this.nHJ.nTs.nSA != null) {
                this.nHJ.nTs.nSA.dI(this.nKp.dOT().getValue());
            }
            if (this.nHJ.nTs.nSB != null) {
                this.nHJ.nTs.nSB.dI(this.nKp.dOU().getValue());
            }
        }
    }

    private boolean c(jpp jpp2) {
        switch (jpp2.nNJ) {
            case 513: {
                if (this.iNR) {
                    return false;
                }
                return this.a(this.nHJ.nTr.nSF, true);
            }
            case 515: {
                if (this.iNR) {
                    return false;
                }
                return this.a(this.nHJ.nTr.nSF, true);
            }
            case 514: {
                if (this.iNR) {
                    return false;
                }
                return this.a(this.nHJ.nTr.nSF, false);
            }
            case 516: {
                return this.a(this.nHJ.nTr.nSG, true);
            }
            case 518: {
                return this.a(this.nHJ.nTr.nSG, true);
            }
            case 517: {
                return this.a(this.nHJ.nTr.nSG, false);
            }
            case 519: {
                return this.a(this.nHJ.nTr.nSH, true);
            }
            case 520: {
                return this.a(this.nHJ.nTr.nSH, false);
            }
            case 523: {
                return this.ag(jpp2.nNK, true);
            }
            case 524: {
                return this.ag(jpp2.nNK, false);
            }
            case 525: {
                return this.ag(jpp2.nNK, true);
            }
            case 256: 
            case 260: {
                boolean bl;
                int n = jpp2.nNK;
                boolean bl2 = (jpp2.nNL & 0x1000000) != 0;
                int n2 = jpp2.nNL & 0xFFFF;
                assert (lda.acc(n2));
                int n3 = (jpp2.nNL & 0xFF0000) >> 16;
                boolean bl3 = bl = (jpp2.nNL & 0x40000000) != 0;
                if (this.b(n, n3, bl2, true)) {
                    return true;
                }
                if (this.iNT) {
                    return false;
                }
                return this.a(n3, bl2, true, bl);
            }
            case 257: 
            case 261: {
                int n = jpp2.nNK;
                boolean bl = (jpp2.nNL & 0x1000000) != 0;
                int n4 = (jpp2.nNL & 0xFF0000) >> 16;
                if (this.b(n, n4, bl, false)) {
                    return true;
                }
                if (this.iNT) {
                    return false;
                }
                return this.a(n4, bl, false, false);
            }
            case 258: {
                assert (lda.by(jpp2));
                break;
            }
            case 522: {
                assert (lda.by(jpp2));
                break;
            }
        }
        return false;
    }

    private boolean ag(int n, boolean bl) {
        jqt jqt2;
        switch (n >> 16) {
            case 1: {
                jqt2 = this.nHJ.nTr.nSI;
                break;
            }
            case 2: {
                jqt2 = this.nHJ.nTr.nSJ;
                break;
            }
            default: {
                return false;
            }
        }
        return this.a(jqt2, bl);
    }

    private boolean b(int n, int n2, boolean bl, boolean bl2) {
        switch (n) {
            case 16: {
                this.b(160, 42, false, bl2);
                this.b(161, 54, false, bl2);
                return true;
            }
            case 17: {
                this.b(162, 29, false, bl2);
                this.b(163, 157, false, bl2);
                return true;
            }
            case 18: {
                this.b(164, 56, false, bl2);
                this.b(165, 184, false, bl2);
                return true;
            }
        }
        jpb jpb2 = jpb.fromVirtualKey(n);
        if (jpb2 == null) {
            return false;
        }
        if (bl2 != this.kvi.contains((Object)jpb2)) {
            this.a(this.kvi, jpb2, bl2);
            this.a(jpb2, bl2);
            this.c(n, n2, bl, bl2);
        }
        return true;
    }

    private void c(int n, int n2, boolean bl, boolean bl2) {
        jpp jpp2 = new jpp(bl2 ? 256 : 257, n, n2 << 16 | (bl ? 0x1000000 : 0), 0, 0);
        this.cdh.rnh.m(fji.a(this.cdh.rng, lcr.acL, jpp2));
    }

    private boolean a(int n, boolean bl, boolean bl2, boolean bl3) {
        if (bl) {
            n += 128;
        }
        if (!this.Vw(n)) {
            return false;
        }
        jph jph2 = this.Vx(n);
        if (jph2 == null) {
            return false;
        }
        if (bl3) {
            return true;
        }
        this.a(jph2, bl2);
        return true;
    }

    private <E> void a(Set<E> set, E e2, boolean bl) {
        if (bl) {
            set.add(e2);
        } else {
            set.remove(e2);
        }
    }

    private boolean a(jph jph2, boolean bl) {
        if (jph2 == null) {
            return false;
        }
        this.nKq.kuT.m(new jpm(jph2, bl));
        return true;
    }

    private boolean Vw(int n) {
        if (!this.iNT) {
            for (jox<? extends jph> jox2 : this.nKE) {
                if (!this.a(n, jox2)) continue;
                return true;
            }
        }
        return jol.Vv(n);
    }

    private boolean a(int n, jox<? extends jph> jox2) {
        if (!(jox2.nKT instanceof jqu)) {
            return false;
        }
        jqu jqu2 = (jqu)jox2.nKT;
        if (n != jqu2.cY) {
            return false;
        }
        return this.kvi.containsAll(jox2.kvi);
    }

    private void a(jpb jpb2, boolean bl) {
        jph jph2 = this.Vx(jpb2.nvH);
        if (jph2 == null) {
            return;
        }
        this.nKq.kuT.m(new jpm(jph2, bl));
    }

    private jph Vx(int n) {
        return this.nHJ.nTq.nSD.get(new Integer(n));
    }

    private void d(lmv lmv2) {
        if (this.nKD) {
            return;
        }
        for (ldv ldv2 : this.nKs) {
            this.cdh.rnh.m(fjg.a(this.cdh.rng, ldv2, lmv2));
        }
    }

    private void dPd() {
        ArrayList<jox<? extends jph>> arrayList = new ArrayList<jox<? extends jph>>();
        for (jov jov2 : joj.nIQ) {
            jox<? extends jpf> jox2 = this.nKo.e(jov2);
            if (jox2 == null) continue;
            arrayList.add(jox2);
        }
        this.nKE = arrayList;
    }

    private void dPe() {
        this.cdh.rnh.m(fjl.h(this.cdh.rng, lcr.acL));
        this.dPb();
        this.nKq.reset();
    }

    private void nb(boolean bl) {
        this.nHJ.b(bl, this.kuT);
        this.nHJ.c(bl, this.nKy);
        this.nHJ.dRq().a(bl, this.nKB);
        this.nKp.cec().a(bl, this.nKt);
        this.nKo.cec().a(bl, this.nKu);
        this.nHB.kzI.a(bl, joj.nIY, this.nKz);
        this.cdh.rex.a(bl, fjf.class, this.nKv);
        this.cdh.rex.a(bl, fje.class, this.nKw);
        this.cdh.rex.a(bl, fjc.class, this.nKx);
    }

    static /* synthetic */ void a(jol jol2) {
        jol2.dPc();
    }

    static /* synthetic */ jok b(jol jol2) {
        return jol2.nKp;
    }

    static /* synthetic */ void a(jol jol2, lmv lmv2) {
        jol2.d(lmv2);
    }

    static /* synthetic */ joz c(jol jol2) {
        return jol2.nKo;
    }

    static /* synthetic */ void d(jol jol2) {
        jol2.dPd();
    }

    static /* synthetic */ Set e(jol jol2) {
        return jol2.nKs;
    }

    static /* synthetic */ lha f(jol jol2) {
        return jol2.cdh;
    }

    static /* synthetic */ boolean a(jol jol2, boolean bl) {
        jol2.nKD = bl;
        return jol2.nKD;
    }

    static /* synthetic */ jqx g(jol jol2) {
        return jol2.nHJ;
    }

    static /* synthetic */ jor h(jol jol2) {
        return jol2.nKA;
    }

    static /* synthetic */ joy i(jol jol2) {
        return jol2.nHB;
    }

    static /* synthetic */ boolean j(jol jol2) {
        return jol2.iNS;
    }

    static /* synthetic */ jpa k(jol jol2) {
        return jol2.nKq;
    }

    static /* synthetic */ boolean a(jol jol2, jpp jpp2) {
        return jol2.c(jpp2);
    }

    static /* synthetic */ void l(jol jol2) {
        jol2.dPe();
    }
}

