/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.ArrayList;

public class hha
extends hmt {
    private final lbn kpK = new lbn(this){
        final /* synthetic */ hha kpM;
        {
            this.kpM = hha2;
        }

        public final void W() {
        }
    };
    private final lbn kpL = new lbn(this){
        final /* synthetic */ hha kpM;
        {
            this.kpM = hha2;
        }

        public final void W() {
            this.kpM.cbO().cpt();
        }
    };
    private final hpa jHl;

    public hha(hdm hdm2, String string, lgg lgg2) {
        super((hnc)hdm2, string, lgg2, lhf.rnv);
        int n;
        hec hec2 = hdm2.cbP();
        ArrayList<a> arrayList = new ArrayList<a>();
        arrayList.add(new a(lcy.qZf, hec2.kck.kyB.kau));
        arrayList.add(new a(lcy.qZu, hdm2.jZq.jLP));
        arrayList.add(new a(lcy.qZh, hdm2.jZm.jLP));
        arrayList.add(new a(lcy.qZi, hdm2.jZk.jLP));
        arrayList.add(new a(lcy.qZj, hdm2.jYW.jLP));
        arrayList.add(new a(lcy.qZk, hdm2.jZD.kau));
        arrayList.add(new a(lcy.qZl, hec2.kck.kyA.kau));
        arrayList.add(new a(lcy.qZm, hdm2.jYO.jLP));
        arrayList.add(new a(lcy.qZn, hdm2.jZg.jLP));
        arrayList.add(new a(lcy.qZo, hdm2.jYT.jLP));
        arrayList.add(new a(lcy.qZp, hdm2.jZh.jLP));
        arrayList.add(new a(lcy.qZr, hdm2.jYX.jLP));
        arrayList.add(new a(lcy.qZt, this.kpL));
        if ((arrayList.size() & 1) != 0) {
            arrayList.add(new a(ljg.roH, this.kpK));
        }
        int n2 = 2;
        int n3 = (arrayList.size() + (n2 - 1)) / n2;
        hqy.a a2 = hdm2.kJL;
        int n4 = 0;
        int n5 = 0;
        String[][] stringArray = new String[n3][n2];
        int n6 = 0;
        for (int i = 0; i < n3; ++i) {
            for (n = 0; n < n2 && n6 < arrayList.size(); ++n) {
                String string2;
                stringArray[i][n] = string2 = ((a)arrayList.get((int)n6++)).kbJ.esy();
                lhf lhf2 = this.kLu.a(a2.kiK.jFE, string2);
                n4 = Math.max(n4, lhf2.rmN);
                n5 = Math.max(n5, lhf2.H);
            }
        }
        lhf lhf3 = a2.h(new lhf(n4, n5));
        this.cC(lhf3.rmN * n2, lhf3.H * n3);
        this.jHl = new hpa((hnc)hdm2, (String)null, lgg.rlI, this.cqv(), this.cbO().kIn.kEh);
        this.j(this.jHl);
        n6 = 0;
        n = 0;
        for (int i = 0; i < n3; ++i) {
            int n7 = 0;
            for (int j = 0; j < n2 && n6 < arrayList.size(); ++j) {
                hqy hqy2 = new hqy(this.kLu, null, new lgg(n7, n), lhf3, hpx.a.kXm, a2, stringArray[i][j]);
                hqy2.cvC().a(true, ((a)arrayList.get((int)n6++)).keI);
                this.j(hqy2);
                n7 += lhf3.rmN;
            }
            n += lhf3.H;
        }
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }
}

