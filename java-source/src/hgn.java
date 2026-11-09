/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

public class hgn
extends hgm {
    private static final lhf koo = new lhf(150, 16);
    private static final int kop = 16;
    private static final lhf koq = new lhf(10, 10);
    private final hpx kor;
    private final hqy kkz;
    private final hdx kos;
    private final EnumMap<alc.c, hpe> kot;
    private final EnumMap<alc.b, a> kou;
    private final lbp jAY;
    private final lbn kkJ;
    private final lbn kov;
    private final lbn kow;
    private boolean Initialized;
    private b kox;
    private final ArrayList<b> koy;
    private hdz koz;
    private final int koA;

    public hgn(hdm hdm2, String string, lgg lgg2, hee hee2, hdx hdx2) {
        hdm2.jXk.getClass();
        super(hdm2, string, lgg2, new lhf(472, 0), hdm2.jYy, hee2, null);
        this.kot = new EnumMap(alc.c.class);
        this.kou = new EnumMap(alc.b.class);
        this.jAY = new lbp(this){
            final /* synthetic */ hgn koB;
            {
                this.koB = hgn2;
            }

            public final boolean caU() {
                this.koB.cbP().kcg.cnL();
                return true;
            }
        };
        this.kkJ = new lbn(this){
            final /* synthetic */ hgn koB;
            {
                this.koB = hgn2;
            }

            public final void W() {
                this.koB.cbP().kcg.cnL();
            }
        };
        this.kov = new lbn(this){
            final /* synthetic */ hgn koB;
            {
                this.koB = hgn2;
            }

            public final void W() {
                this.koB.cbP().kcg.f(hgn.a(this.koB));
            }
        };
        this.kow = new lbn(this){
            final /* synthetic */ hgn koB;
            {
                this.koB = hgn2;
            }

            public final void W() {
                hgn.b(this.koB);
            }
        };
        this.koy = new ArrayList();
        this.kos = hdx2;
        this.koz = null;
        int n = hdm2.jXk.jTK.H;
        hdm2.jXk.getClass();
        int n2 = (472 - this.f((alc.a)alc.a.brl).rmN) / 2;
        this.kox = new b(this, alc.a.brl, new lgg(n2, n));
        n += this.kox.kgb.getHeight();
        String string2 = null;
        lgg lgg3 = new lgg(0, n += 2);
        hdm2.jXk.getClass();
        hpe hpe2 = new hpe((hnc)hdm2, string2, lgg3, new lhf(472, 16), hdm2.kIY, lcy.rbX.esy());
        this.j(hpe2);
        n += 16;
        n += hgn.koq.H;
        int n3 = hdm2.jXk.jTK.rmN;
        n3 += hgn.koo.rmN;
        n3 += hgn.koq.rmN;
        for (alc.c c2 : alc.c.ListOfValue) {
            lhf lhf2 = new lhf(hdm2.jXk.jPC.kLY.rmN + hgn.koq.rmN, 16);
            hpe hpe3 = new hpe(this.kLu, null, new lgg(n3, n), lhf2, this.cbO().kIY, hgn.a(c2).esy());
            this.j(hpe3);
            this.kot.put(c2, hpe3);
            n3 += lhf2.rmN;
        }
        this.koA = n;
        n3 = hdm2.jXk.jTN.rmN * 2 + hdm2.jXk.jTK.rmN;
        int n4 = (this.getWidth() - n3) / 2;
        this.kor = new hqy((hnc)hdm2, null, new lgg(n4, n += hdm2.jXk.jTK.H), hdm2.jXk.jTN, hpx.a.kXm, hdm2.kJK, lcy.qZN.esy());
        this.kor.cvC().a(true, this.kov);
        this.j(this.kor);
        this.kor.og(true);
        n4 += this.kor.getWidth();
        this.kkz = new hqy((hnc)hdm2, null, new lgg(n4 += hdm2.jXk.jTK.rmN, n), hdm2.jXk.jTN, hpx.a.kXm, hdm2.kJK, lcy.qUX.esy());
        this.kkz.cvC().a(true, this.kkJ);
        this.j(this.kkz);
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
        b b2 = this.j(hdz2);
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
            Object object2 = object = hdz2.awF() == null ? "outside" : "at " + this.j(hdz2);
        }
        if ((b2 = this.a((lgg)(object = this.cqu()), hdz2)) == null) {
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
        b b2 = this.a(lgg2, hdz2);
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

    private b j(hdz hdz2) {
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
        this.kkz.og(bl);
        this.kkz.setText(lcy.qUY.esy());
        for (hgy hgy2 : lin.a(this.crn(), hgy.class)) {
            hdz hdz2 = hgy2.cjV();
            b b2 = this.j(hdz2);
            if (b2 == null) continue;
            lgg lgg2 = this.a(hdz2, b2);
            hgy2.a(lgg2, (float)this.kLu.crO());
        }
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

    private b a(lgg lgg2, hdz hdz2) {
        b b2 = this.q(lgg2);
        if (b2 != null) {
            return b2;
        }
        b2 = this.a(lgg2, hdz2, true);
        if (b2 != null) {
            return b2;
        }
        b2 = this.a(lgg2, hdz2, false);
        return b2;
    }

    private b q(lgg lgg2) {
        for (b b2 : this.koy) {
            if (!b2.kgb.cqD().A(lgg2)) continue;
            return b2;
        }
        return null;
    }

    private b a(lgg lgg2, hdz hdz2, boolean bl) {
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
        int n = this.koA;
        for (a a2 : this.kou.values()) {
            a2.dispose();
        }
        this.kou.clear();
        this.koy.clear();
        this.koy.add(this.kox);
        alc.b[] bArray = this.koz == null ? new alc.b[]{} : alc.fT(this.koz.kaW.Type);
        boolean bl = bArray.length == 0;
        for (alc.c c2 : alc.c.ListOfValue) {
            hpe hpe2 = this.kot.get((Object)c2);
            hpe2.nR(bl);
        }
        if (bArray.length > 0) {
            n += 16;
            n += hgn.koq.H;
        }
        for (alc.b b2 : bArray) {
            int n2 = this.cbO().jXk.jTK.rmN;
            a a3 = new a(this, b2, n2, n);
            this.kou.put(b2, a3);
            this.koy.addAll(a3.cjD());
            int n3 = a3.fc;
            n += n3;
            n += hgn.koq.H;
        }
        if (bArray.length > 0) {
            n += hgn.koq.H;
        }
        int n4 = this.cbO().jXk.jTN.rmN * 2 + this.cbO().jXk.jTK.rmN;
        int n5 = (this.getWidth() - n4) / 2;
        this.kor.z(new lgg(n5, n));
        n5 += this.kor.getWidth();
        this.kkz.z(new lgg(n5 += this.cbO().jXk.jTK.rmN, n));
        n += this.kor.getHeight();
        this.Nh(n += this.cbO().jXk.jTK.rmN);
    }

    private lhu e(alc.a a2) {
        switch (a2) {
            case brl: {
                return this.cbO().jXk.jPA;
            }
        }
        return this.cbO().jXk.jPC;
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
        this.cbP().kcg.cnN().a(bl, this.kow);
        this.a(bl, this.jAY, 27, jpn.nLm);
    }

    static /* synthetic */ lhf a(hgn hgn2, alc.a a2) {
        return hgn2.f(a2);
    }

    static /* synthetic */ lhu b(hgn hgn2, alc.a a2) {
        return hgn2.e(a2);
    }

    static /* synthetic */ lhf cjB() {
        return koo;
    }

    static /* synthetic */ lip b(alc.b b2) {
        return hgn.a(b2);
    }

    static /* synthetic */ lhf cjC() {
        return koq;
    }

    static /* synthetic */ hdz a(hgn hgn2, b b2) {
        return hgn2.a(b2);
    }

    static /* synthetic */ hdx a(hgn hgn2) {
        return hgn2.kos;
    }

    static /* synthetic */ void b(hgn hgn2) {
        hgn2.cjz();
    }
}

