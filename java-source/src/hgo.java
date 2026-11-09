/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  hdm
 *  lcy
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

public class hgo
extends hgm {
    private static final lhf koo = new lhf(88, 16);
    private static final int kop = 16;
    private static final lhf koq = new lhf(10, 25);
    private final hpx kor;
    private final hdx kos;
    private final EnumMap<alc.b, a> kou;
    private final lij<hdz> kki;
    private final hiz koL;
    private final hqr kkk;
    private final hpe koM;
    private final hpe koN;
    private final lbp jAY;
    private final lbn kov;
    private final lbn kow;
    private final lbn koO;
    private final lbn kkH;
    private final lbn kkI;
    private boolean Initialized;
    private b koP;
    private final ArrayList<b> koy;
    private hdz koz;
    private final int koA;
    private hpe koQ;

    public hgo(hdm hdm2, String string, lgg lgg2, hee hee2, hdx hdx2) {
        hdm2.jXk.getClass();
        super(hdm2, string, lgg2, new lhf(472, 0), hdm2.jYy, hee2, null);
        this.kou = new EnumMap(alc.b.class);
        this.kki = new lij();
        this.jAY = new lbp(this){
            final /* synthetic */ hgo koR;
            {
                this.koR = hgo2;
            }

            public final boolean caU() {
                this.koR.cbP().kcg.cnL();
                return true;
            }
        };
        this.kov = new lbn(this){
            final /* synthetic */ hgo koR;
            {
                this.koR = hgo2;
            }

            public final void W() {
                this.koR.cbP().kcg.f(hgo.a(this.koR));
            }
        };
        this.kow = new lbn(this){
            final /* synthetic */ hgo koR;
            {
                this.koR = hgo2;
            }

            public final void W() {
                hgo.b(this.koR);
            }
        };
        this.koO = new lbn(this){
            final /* synthetic */ hgo koR;
            {
                this.koR = hgo2;
            }

            public final void W() {
                hgo.c(this.koR);
            }
        };
        this.kkH = new lbn(this){
            final /* synthetic */ hgo koR;
            {
                this.koR = hgo2;
            }

            public final void W() {
            }
        };
        this.kkI = new lbn(this){
            final /* synthetic */ hgo koR;
            {
                this.koR = hgo2;
            }

            public final void W() {
                hdz hdz2 = (hdz)hgo.d(this.koR).getSelectedItem();
                if (hdz2 == null) {
                    return;
                }
                if (hgo.d((hgo)this.koR).kVB.H(hdz2)) {
                    boolean bl = hgo.d((hgo)this.koR).kVB.I(hdz2);
                    hgo.d(this.koR).a(hdz2, !bl, true);
                } else {
                    hee hee2 = this.koR.cbP().kck.kyA;
                    if (!hdz2.ceB().a(hee2, this.koR.kdT, false)) {
                        return;
                    }
                    this.koR.cbP().a(hdz2, this.koR, null, alc.a.brl.ordinal());
                }
            }
        };
        this.koy = new ArrayList();
        this.kos = hdx2;
        this.koz = null;
        int n = hdm2.jXk.jTK.H;
        int n2 = 331;
        n = 40;
        this.koP = new b(this, alc.a.brl, new lgg(n2, n));
        n += this.koP.kgb.getHeight();
        n += 2;
        this.koQ = new hpe((hnc)hdm2, null, new lgg(26, 6), new lhf(400, 16), hdm2.kIQ, lcy.rbU.esy());
        this.j(this.koQ);
        this.koM = new hpe((hnc)hdm2, null, new lgg(22, 45), new lhf(293, 16), hdm2.kIT, lcy.rbV.esy());
        this.j(this.koM);
        this.koN = new hpe((hnc)hdm2, null, new lgg(336, 180), new lhf(120, 250), hdm2.kJa, lcy.rbW.esy());
        this.j(this.koN);
        n2 = 20;
        n = 66;
        this.kkk = new hqr((hnc)hdm2, (String)null, new lgg(n2, n), new lhf(293, 101), hdm2.jGK);
        n += this.kkk.getHeight();
        this.j(this.kkk);
        hdx hdx3 = hdx.LX(cxd.fJX);
        this.koL = new hiz(hdm2, (String)null, lgg.rlI, lhf.rnv, this.kki, hdm2.jXk.jNT);
        this.kkk.cwt().cqd().a(this.koL);
        this.koA = n += hdm2.jXk.jTB.cg;
        n += hdm2.jXk.jTK.H;
        n2 = hdm2.jXk.jTN.rmN * 2 + hdm2.jXk.jTK.rmN;
        int n3 = (this.getWidth() - n2) / 2;
        this.kor = new hqy((hnc)hdm2, null, new lgg(331, 445), hdm2.jXk.jTN, hpx.a.kXm, hdm2.kJK, lcy.qZN.esy());
        this.kor.cvC().a(true, this.kov);
        this.j(this.kor);
        this.kor.og(true);
        n3 += this.kor.getWidth();
        n3 += hdm2.jXk.jTK.rmN;
        n += this.kor.getHeight();
        n += hdm2.jXk.jTK.rmN;
        this.cjA();
        this.cjz();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.cjz();
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
        this.cjz();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
    }

    @Override
    protected lgg g(hdz hdz2) {
        b b2 = this.n(hdz2);
        if (b2 == null) {
            return new lgg(0, 0);
        }
        return this.a(hdz2, b2);
    }

    @Override
    protected boolean a(hgy hgy2, boolean bl, boolean bl2, int n) {
        b b2;
        Object object;
        assert (n == -1);
        hdz hdz2 = hgy2.cjV();
        if (!bl) {
            Object object2 = object = hdz2.awF() == null ? "outside" : "at " + this.n(hdz2);
        }
        if ((b2 = this.b((lgg)(object = this.cqu()), hdz2)) == null) {
            return false;
        }
        if (!b2.m(hdz2)) {
            return false;
        }
        return super.a(hgy2, bl, bl2, b2.koH.ordinal());
    }

    @Override
    protected void cjw() {
        Object object;
        hdz hdz2 = null;
        for (hdu object2 : this.kdT.cfh()) {
            if (!(object2 instanceof hdz) || ((hdz)(object = (hdz)object2)).awF() != alc.a.brl) continue;
            hdz2 = object;
            break;
        }
        this.k(hdz2);
        for (alc.b b2 : alc.b.ListOfValue) {
            object = this.kou.get((Object)b2);
            if (object == null) continue;
            es es2 = this.koz.LY(b2.bnM);
            ((a)object).d(es2);
        }
        super.cjw();
        this.cjz();
    }

    @Override
    protected Collection<hdu> cfl() {
        ArrayList<hdu> arrayList = new ArrayList<hdu>(super.cfl());
        for (a a2 : this.kou.values()) {
            for (b b2 : a2.cjD()) {
                hdz hdz2 = b2.cjF();
                if (hdz2 == null) continue;
                arrayList.add(hdz2);
            }
        }
        return arrayList;
    }

    @Override
    protected void a(hdz hdz2, int n, int n2, lgg lgg2, int n3) {
        assert (n3 == -1);
        b b2 = this.b(lgg2, hdz2);
        if (b2 == null) {
            return;
        }
        if (!b2.m(hdz2)) {
            return;
        }
        super.a(hdz2, n, n2, lgg2, b2.koH.ordinal());
    }

    @Override
    protected boolean l(lfu lfu2) {
        assert (lda.by(lfu2));
        return false;
    }

    @Override
    protected boolean b(hdz hdz2, lgg lgg2) {
        return false;
    }

    private b n(hdz hdz2) {
        alc.a a2 = hdz2.awF();
        if (a2 == null) {
            return null;
        }
        for (b b2 : this.koy) {
            if (a2 != b2.koH) continue;
            return b2;
        }
        return null;
    }

    private lgg a(hdz hdz2, b b2) {
        lgs lgs2 = hdz2.ceB().awT();
        lgg lgg2 = b2.kec;
        lhf lhf2 = b2.kgb.cqv();
        lgg2 = new lgg(lgg2.cf + (lhf2.rmN - lgs2.rmN) / 2, lgg2.cg + (lhf2.H - lgs2.H) / 2);
        return lgg2;
    }

    private void cjz() {
        boolean bl = this.cbP().kcg.cnO();
        boolean bl2 = this.nw(bl);
        this.kor.og(!bl2);
        if (this.koz == null) {
            this.koQ.mV(lcy.rbU.esy());
        } else {
            this.koQ.mV(this.koz.cdY().esy());
        }
        for (hgy hgy2 : lin.a(this.crn(), hgy.class)) {
            hdz hdz2 = hgy2.cjV();
            b b2 = this.n(hdz2);
            if (b2 == null) continue;
            lgg lgg2 = this.a(hdz2, b2);
            hgy2.a(lgg2, (float)this.kLu.crO());
        }
        this.cjH();
    }

    private void cjH() {
        hef hef2 = this.cbP().kck.kyz;
        les les2 = lea.enW();
        Collection<hdu> collection = hef2.cfh();
        this.kki.clear();
        int n = 0;
        for (hdu hdu2 : collection) {
            if (!(hdu2 instanceof hdz)) continue;
            ler ler2 = les2.acv(hdu2.kaW.Type);
            n += this.a(this.kki, (hdz)hdu2, null);
        }
        this.koL.cmK();
    }

    private int a(lij<hdz> lij2, hdz hdz2, hdz hdz3) {
        if (!cug.uy((int)hdz2.kaW.Type)) {
            return 0;
        }
        lij2.d(hdz2, hdz3, null);
        return 1;
    }

    private boolean nw(boolean bl) {
        if (bl) {
            return false;
        }
        for (a a2 : this.kou.values()) {
            if (!a2.cjE()) continue;
            return true;
        }
        return false;
    }

    private b b(lgg lgg2, hdz hdz2) {
        b b2 = this.r(lgg2);
        if (b2 != null) {
            return b2;
        }
        b2 = this.b(lgg2, hdz2, true);
        if (b2 != null) {
            return b2;
        }
        b2 = this.b(lgg2, hdz2, false);
        return b2;
    }

    private b r(lgg lgg2) {
        for (b b2 : this.koy) {
            if (!b2.kgb.cqD().A(lgg2)) continue;
            return b2;
        }
        return null;
    }

    private b b(lgg lgg2, hdz hdz2, boolean bl) {
        b b2 = null;
        int n = 0;
        for (b b3 : this.koy) {
            hdz hdz3;
            if (hdz2 != null && !b3.m(hdz2) || bl && (b3.cjF() != null || (hdz3 = this.a(b3)) != null && hdz3 != hdz2)) continue;
            int n2 = lgg2.U(b3.cfx());
            if (b2 != null && n2 >= n) continue;
            b2 = b3;
            n = n2;
        }
        return b2;
    }

    private static final lip a(alc.b b2) {
        switch (b2) {
            case brE: {
                return lcy.rbY;
            }
            case brF: {
                return lcy.rbZ;
            }
            case brG: {
                return lcy.rca;
            }
        }
        assert (false);
        return null;
    }

    private static final lip a(alc.c c2) {
        switch (c2) {
            case brI: {
                return lcy.rcc;
            }
            case brJ: {
                return lcy.rcd;
            }
            case brK: {
                return lcy.rce;
            }
            case brL: {
                return lcy.rcf;
            }
        }
        assert (false);
        return null;
    }

    private void k(hdz hdz2) {
        if (hdz2 == this.koz) {
            return;
        }
        this.koz = hdz2;
        this.cjA();
    }

    private void cjA() {
        alc.b[] bArray;
        int n = 192;
        for (a a2 : this.kou.values()) {
            a2.dispose();
        }
        this.kou.clear();
        this.koy.clear();
        this.koy.add(this.koP);
        if (this.koz == null) {
            bArray = new alc.b[]{};
            this.koQ.mV(lcy.rbU.esy());
        } else {
            bArray = alc.fT(this.koz.kaW.Type);
            this.koQ.mV(this.koz.cdY().esy());
        }
        boolean bl = bArray.length == 0;
        for (alc.b b2 : bArray) {
            int n2 = 14;
            a a3 = new a(this, b2, n2, n);
            this.kou.put(b2, a3);
            this.koy.addAll(a3.cjD());
            int n3 = a3.fc;
            n += n3;
            n += hgo.koq.H;
        }
        if (bArray.length > 0) {
            n += hgo.koq.H;
        }
        int n4 = this.cbO().jXk.jTN.rmN * 2 + this.cbO().jXk.jTK.rmN;
        int n5 = (this.getWidth() - n4) / 2;
        n += this.kor.getHeight();
        n += this.cbO().jXk.jTK.rmN;
    }

    private lhu e(alc.a a2) {
        switch (a2) {
            case brl: {
                return this.cbO().jXk.jPA;
            }
            case bru: 
            case brq: 
            case brm: {
                return this.cbO().jXk.jPJ;
            }
        }
        return this.cbO().jXk.jPI;
    }

    private lhf f(alc.a a2) {
        return this.e((alc.a)a2).kLY;
    }

    private hdz a(b b2) {
        Collection<hdu> collection = this.kdT.cfh();
        for (hdu hdu2 : collection) {
            hdz hdz2;
            if (!(hdu2 instanceof hdz) || (hdz2 = (hdz)hdu2).awF() != b2.koH) continue;
            return hdz2;
        }
        return null;
    }

    private void mU(boolean bl) {
        this.cbP().kck.kyA.cfa().a(bl, this.koO);
        this.cbP().kcg.cnN().a(bl, this.kow);
        this.a(bl, this.jAY, 27, jpn.nLm);
        this.koL.jHT.crt().a(bl, this.kkH);
        this.koL.cvi().a(bl, this.kkI);
    }

    static /* synthetic */ lhf a(hgo hgo2, alc.a a2) {
        return hgo2.f(a2);
    }

    static /* synthetic */ lhu b(hgo hgo2, alc.a a2) {
        return hgo2.e(a2);
    }

    static /* synthetic */ lhf cjB() {
        return koo;
    }

    static /* synthetic */ lip b(alc.b b2) {
        return hgo.a(b2);
    }

    static /* synthetic */ lhf cjC() {
        return koq;
    }

    static /* synthetic */ hdz a(hgo hgo2, b b2) {
        return hgo2.a(b2);
    }

    static /* synthetic */ hdx a(hgo hgo2) {
        return hgo2.kos;
    }

    static /* synthetic */ void b(hgo hgo2) {
        hgo2.cjz();
    }

    static /* synthetic */ void c(hgo hgo2) {
        hgo2.cjH();
    }

    static /* synthetic */ hiz d(hgo hgo2) {
        return hgo2.koL;
    }
}

