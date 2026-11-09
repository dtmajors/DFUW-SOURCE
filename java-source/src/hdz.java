/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcy
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class hdz
extends hdu {
    protected lip kbJ;
    protected ldv kbK;
    protected ldv kbL;
    protected int asi;
    protected float aXy;
    protected cak.c bpW;
    protected int aCJ = -1;
    protected boolean kbM;
    protected lip kbN;
    protected alc.a brQ;
    protected List<ej> dFm = new ArrayList<ej>();
    protected List<ej> kbO = Collections.unmodifiableList(this.dFm);
    private double kbP;
    private double kbQ;
    private static final Comparator<ej> kbR = new Comparator<ej>(){

        public int a(ej ej2, ej ej3) {
            String string = ej2.getName();
            String string2 = ej3.getName();
            return string.compareTo(string2);
        }

        public boolean equals(Object object) {
            return super.equals(object);
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((ej)object, (ej)object2);
        }
    };

    public final double cez() {
        return this.kbP;
    }

    public final double ceA() {
        return this.kbQ;
    }

    public final void h(double d2, double d3) {
        if (d2 == this.kbP && d3 == this.kbQ) {
            return;
        }
        this.kbP = d2;
        this.kbQ = d3;
        this.cdX();
    }

    public hdz(hel hel2, ldv ldv2, hdw hdw2) {
        super(hel2, ldv2, hdw2);
    }

    public final hdw ceB() {
        return (hdw)this.kaW;
    }

    public final ldv ceC() {
        return this.kbK;
    }

    public final ldv ceD() {
        return this.kbL;
    }

    public final int vf() {
        return this.asi;
    }

    public final float getWeight() {
        return this.aXy;
    }

    public final cak.c auO() {
        return this.bpW;
    }

    public final int AR() {
        return this.aCJ;
    }

    public final alc.a awF() {
        return this.brQ;
    }

    public final boolean Uu() {
        return this.aCJ >= 0;
    }

    @Override
    public final List<ej> getAttributes() {
        return this.kbO;
    }

    public final boolean auX() {
        return this.kbM;
    }

    @Override
    public final lip ced() {
        return this.kbN;
    }

    public boolean ceE() {
        if (this.ah(1680) != null) {
            return true;
        }
        if (this.ah(1744) != null) {
            return true;
        }
        if (this.ah(6416) != null) {
            return true;
        }
        if (this.ah(1936) != null) {
            return true;
        }
        if (this.ah(2096) != null) {
            return true;
        }
        if (this.ah(2704) != null) {
            return true;
        }
        if (this.ah(3248) != null) {
            return true;
        }
        if (this.ah(3280) != null) {
            return true;
        }
        if (this.ah(4464) != null) {
            return true;
        }
        if (this.ah(3536) != null) {
            return true;
        }
        if (this.ah(3568) != null) {
            return true;
        }
        if (this.ah(4496) != null) {
            return true;
        }
        if (this.ah(4912) != null) {
            return true;
        }
        if (this.ah(5536) != null) {
            return true;
        }
        return this.ah(4208) != null;
    }

    public et ah(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof et)) {
            return null;
        }
        return (et)ej2;
    }

    public ew ao(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof ew)) {
            return null;
        }
        return (ew)ej2;
    }

    public ff aq(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof ff)) {
            return null;
        }
        return (ff)ej2;
    }

    public fh ay(int n) {
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof fh)) {
            return null;
        }
        return (fh)ej2;
    }

    public es LY(int n) {
        assert (n == 1440 || n == 1456 || n == 1568 || n == 1600 || n == 1584 || n == 1616);
        ej ej2 = this.LZ(n);
        if (ej2 == null) {
            return null;
        }
        if (!(ej2 instanceof es)) {
            return null;
        }
        return (es)ej2;
    }

    public ej LZ(int n) {
        assert (n > 0);
        if (this.dFm == null) {
            return null;
        }
        for (ej ej2 : this.dFm) {
            if (ej2.getType() != n) continue;
            return ej2;
        }
        return null;
    }

    public bsh ceF() {
        return (bsh)this.cea();
    }

    @Override
    protected void cbg() {
        super.cbg();
    }

    @Override
    protected lip cee() {
        return this.kbJ;
    }

    @Override
    protected void aU(List<heh> list) {
        et et2;
        Object object;
        if (this.asi != 1) {
            list.add(new heh(lcy.qRI, new ljf(this.asi)));
        }
        list.add(new heh(lcy.qRK, new ljn(this.aXy)));
        ej ej2 = (ff)this.LZ(11024);
        if (ej2 != null) {
            list.add(new heh(lcy.qSp, new ljg(((ff)ej2).getStringValue())));
        }
        if ((ej2 = (et)this.LZ(9360)) != null) {
            float f2 = ((et)ej2).fN();
            if (f2 > 0.0f) {
                f2 /= 100.0f;
            }
            list.add(new heh(lcy.qSq, new lje(f2)));
        }
        ej ej3 = (et)this.LZ(1232);
        Object object2 = (et)this.LZ(1234);
        if (ej3 != null && object2 != null) {
            object = lcy.qRR.a(new ljm(((et)ej3).fN()), new ljm(((et)object2).fN()));
            list.add(new heh(lcy.qRQ, (lip)object));
        }
        if ((ej3 = (et)this.LZ(1088)) != null) {
            list.add(new heh(lcy.qRS, new ljm(((et)ej3).fN())));
        }
        if ((ej3 = this.aq(1360)) != null) {
            object2 = new ljg(((ff)ej3).getStringValue());
            list.add(new heh(lcy.qRJ, (lip)object2));
        }
        if ((ej3 = this.ah(640)) != null) {
            list.add(new heh(lcy.qRT, new ljm(((et)ej3).fN())));
        }
        if ((ej3 = this.ah(624)) != null) {
            float f3 = ((et)ej3).fN();
            if (f3 > 0.0f) {
                f3 = 1.0f / f3;
            }
            list.add(new heh(lcy.qRW, new ljm(f3)));
        }
        if ((et2 = (et)this.LZ(688)) != null) {
            float f4 = et2.fN();
            list.add(new heh(lcy.qSr, new lje(f4)));
        }
        if (this.ceF() != null && this.ceF().az() > 0 && (object = lea.eos().get(lea.enW().getName(this.ceF().az()))) != null && lea.enW().isDescendant(this.ceF().az(), cug.fiL)) {
            list.add(new heh(lcy.qRU, new lja((int)((cur)object).fyc)));
        }
        if ((object = this.ah(1552)) != null) {
            float f5 = ((et)object).fN();
            list.add(new heh(lcy.qRN, new ljd(f5)));
        }
        if (this.ceB().b(hdw.kbi)) {
            object = this.aq(9632);
            String string = object == null ? "" : ((ff)object).getStringValue();
            list.add(new heh(lcy.qRO, new ljg(string)));
            ew ew2 = this.ao(1248);
            int n = ew2 == null ? 0 : ew2.fQ();
            list.add(new heh(lcy.qSo, new lja(n)));
        }
    }

    public void o(bsh bsh2) {
        float f2;
        int n;
        lip lip2;
        assert (cug.vF((int)bsh2.az()));
        float f3 = bsh2.Bb();
        if (!ldq.ai(this.aXV, f3)) {
            this.aXV = f3;
        }
        if ((lip2 = bsh2.awA()) == null) {
            lip2 = ljg.roH;
        }
        if (!lin.i(lip2, this.kbJ)) {
            this.kbJ = lip2;
        }
        if ((n = bsh2.vf()) != this.asi) {
            this.asi = n;
        }
        if ((f2 = bsh2.awB()) != this.aXy) {
            this.aXy = f2;
        }
    }

    @Override
    protected boolean b(bsf bsf2) {
        ff ff2;
        int n;
        alc.a a2;
        int n2;
        cak.c c2;
        float f2;
        int n3;
        ldv ldv2;
        ldv ldv3;
        boolean bl = super.b(bsf2);
        bsh bsh2 = (bsh)bsf2;
        lip lip2 = bsf2.awA();
        if (lip2 == null) {
            lip2 = ljg.roH;
        }
        if (!lin.i(lip2, this.kbJ)) {
            this.kbJ = lip2;
            bl = true;
        }
        if (!lin.i(ldv3 = bsh2.AW(), this.kbK)) {
            assert (ldv3 != null);
            this.kbK = ldv3;
            bl = true;
        }
        if (!lin.i(ldv2 = bsh2.avU(), this.kbL)) {
            assert (ldv2 != null);
            this.kbL = ldv2;
            bl = true;
        }
        if ((n3 = bsh2.vf()) != this.asi) {
            this.asi = n3;
            bl = true;
        }
        if ((f2 = bsh2.awB()) != this.aXy) {
            this.aXy = f2;
            bl = true;
        }
        if (!lin.i((Object)(c2 = bsh2.auO()), (Object)this.bpW)) {
            this.bpW = c2;
            bl = true;
        }
        if ((n2 = bsh2.AR()) != this.aCJ) {
            this.aCJ = n2;
            bl = true;
        }
        if ((a2 = bsh2.awF()) != this.brQ) {
            this.brQ = a2;
            bl = true;
        }
        ej[] ejArray = bsh2.arJ();
        Arrays.sort(ejArray, kbR);
        int n4 = Math.min(ejArray.length, this.dFm.size());
        for (n = 0; n < n4; ++n) {
            if (lin.i(this.dFm.get(n), ejArray[n])) continue;
            this.dFm.set(n, ejArray[n]);
            bl = true;
        }
        for (n = n4; n < this.dFm.size(); ++n) {
            this.dFm.remove(n);
            bl = true;
        }
        for (n = n4; n < ejArray.length; ++n) {
            this.dFm.add(ejArray[n]);
            bl = true;
        }
        int n5 = n = !bsh2.AT() ? 1 : 0;
        if (n != this.kbM) {
            this.kbM = n;
            bl = true;
        }
        String string = (ff2 = this.aq(10368)) == null ? null : ff2.getStringValue();
        if (this.kbN == null || !lin.i(this.kbN.esy(), string)) {
            this.kbN = string == null ? null : new ljg(string);
            bl = true;
        }
        return bl;
    }
}

