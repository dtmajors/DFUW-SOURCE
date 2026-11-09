/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  hdm
 *  lcy
 */
import java.util.ArrayList;

public class hmv
extends how {
    private final a kMs;
    private boolean Initialized;

    public static lhf a(hnc hnc2, a a2, lhu lhu2, hnt[] hntArray) {
        int n;
        int n2 = lhu2 == null ? 0 : lhu2.kLY.rmN;
        for (n = 0; n < hntArray.length; ++n) {
            if (hntArray[n].kPF.kPG instanceof hpe.d) {
                if (n2 >= a2.kMq) continue;
                n2 = a2.kMq;
                continue;
            }
            lhf lhf2 = hnc2.a(hntArray[n].kPF.kPG.jFE, hntArray[n].aFo);
            hntArray[n].fc = lhf2.H;
            if (n2 >= lhf2.rmN) continue;
            n2 = lhf2.rmN;
        }
        n = lhu2 == null ? 0 : lhu2.kLY.H;
        for (int i = 0; i < hntArray.length; ++i) {
            hntArray[i].fc = hntArray[i].kPF.kPG instanceof hpe.d ? hnc2.a(hntArray[i].kPF.kPG.jFE, hntArray[i].aFo, true, n2, true) : hnc2.a((hnb)hntArray[i].kPF.kPG.jFE, (String)hntArray[i].aFo).H;
            n += hntArray[i].fc;
        }
        return new lhf(a2.kri.rmN + n2 + a2.kri.rmN, a2.kri.H + n + a2.kri.H);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
    }

    @Override
    public void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    public hmv(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, lhu lhu2, hdx hdx2) {
        super(hnc2, string, lgg2, lhf2, a2.jGJ);
        Object object;
        Comparable<cxc> comparable;
        Object object2;
        this.kMs = a2;
        int n = this.kMs.kri.H;
        int n2 = this.kMs.kri.rmN;
        if (lhu2 != null) {
            object2 = new hpa(this.kLu, (String)null, new lgg(n2, n), null, lhu2);
            this.j((hms)object2);
            n += lhu2.kLY.H;
        }
        object2 = (hdm)hnc2;
        hea hea2 = object2.cbP().kck.b(hdx2);
        hnt.a a3 = object2.kKo;
        this.a((hdm)object2, 54, 22, hdx2.cdY().esy(), a3);
        a3 = object2.jGV;
        this.a((hdm)object2, n2, 55, hdx2.cei().esy(), a3);
        if (hea2 != null) {
            a3 = object2.jGU;
            comparable = lcy.qZW.a(new ljm(hea2.getLevel()));
            this.a((hdm)object2, n2, 120, ((lip)comparable).esy(), a3);
        }
        if (hea2 == null) {
            return;
        }
        comparable = hea2.ceH();
        if (comparable == null) {
            return;
        }
        if (!(comparable instanceof cwx)) {
            return;
        }
        aja[] ajaArray = ((cwx)comparable).bek();
        if (ajaArray == null) {
            return;
        }
        ArrayList<akc> arrayList = lcn.emv();
        for (aja aja2 : ajaArray) {
            if (!(aja2 instanceof akc)) continue;
            object = (akc)aja2;
            arrayList.add((akc)object);
        }
        int n3 = 26;
        int n4 = 224;
        n = this.kMs.kri.H - 3;
        for (akc akc2 : arrayList) {
            object = new lgg(n4, n);
            lgw lgw2 = (lgw)lea.enW().zx(akc2.pa());
            lhu lhu3 = lgw2.atw();
            hpa hpa2 = new hpa(hnc2, akc2.pa(), (lgg)object, new lhf(24, 24), lhu3);
            hpa2.N(0.375f, 0.375f);
            this.j(hpa2);
            this.a((hdm)object2, n4 + 18, n + 11, Integer.toString(akc2.Db()), object2.kKn);
            n += n3;
        }
    }

    private hdm ciO() {
        return (hdm)this.kLu;
    }

    private void a(hdm hdm2, int n, int n2, String string, hnt.a a2) {
        int n3 = 210;
        int n4 = a2.kPG instanceof hpe.d ? hdm2.a(a2.kPG.jFE, string, true, n3, true) : hdm2.a((hnb)a2.kPG.jFE, (String)string).H;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n, n2), new lhf(n3, n4), a2.kPG, string);
        this.j(hpe2);
    }
}

