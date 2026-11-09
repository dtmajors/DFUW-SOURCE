/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  hdm
 *  lcy
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class hhb
extends hmt {
    private final lbn kpK = new lbn(this){
        final /* synthetic */ hhb kpS;
        {
            this.kpS = hhb2;
        }

        public final void W() {
        }
    };
    private final lbn kpL = new lbn(this){
        final /* synthetic */ hhb kpS;
        {
            this.kpS = hhb2;
        }

        public final void W() {
            this.kpS.cbO().cpt();
        }
    };
    private final hqz kpN;
    private hpa jHl;
    private boolean kpO = true;
    private final ArrayList<a> kpP;
    private ArrayList<hqz> kpQ = lcn.emv();
    private final lgg kpR = new lgg(0, 0);

    public hhb(hdm hdm2, String string, lgg lgg2, lbn lbn2) {
        super((hnc)hdm2, string, lgg2, lhf.rnv);
        hec hec2 = hdm2.cbP();
        this.kpP = new ArrayList();
        hdk hdk2 = this.cbO().jXk;
        this.kpP.add(new a(lcy.qZf, hec2.kck.kyB.kau, hdk2.jMo));
        this.kpP.add(new a(lcy.qZl, hec2.kck.kyA.kau, hdk2.jMg));
        this.kpP.add(new a(lcy.qZn, hdm2.jZg.jLP, hdk2.jMr));
        this.kpP.add(new a(lcy.qZp, hdm2.jZh.jLP, hdk2.jMs));
        this.kpP.add(new a(lcy.qZh, hdm2.jZm.jLP, hdk2.jMu));
        this.kpP.add(new a(lcy.qZj, hdm2.jYW.jLP, hdk2.jMm));
        this.kpP.add(new a(lcy.qZu, hdm2.jZq.jLP, hdk2.jMp));
        this.kpP.add(new a(lcy.qZi, hdm2.jZk.jLP, hdk2.jMt));
        this.kpP.add(new a(lcy.qZk, hdm2.jZD.kau, hdk2.jMi));
        this.kpP.add(new a(lcy.qZo, hdm2.jYT.jLP, hdk2.jMl));
        this.kpP.add(new a(lcy.qZr, hdm2.jYX.jLP, hdk2.jMn));
        this.kpP.add(new a(lcy.qZm, hdm2.jYO.jLP, hdk2.jMk));
        this.kpP.add(new a(lcy.qZt, this.kpL, hdk2.jMq));
        if ((this.kpP.size() & 1) != 0) {
            this.kpP.add(new a(ljg.roH, this.kpK, hdk2.jMg));
        }
        hpx.b b2 = this.cbO().kJH;
        hdk hdk3 = this.cbO().jXk;
        int n = this.kpR.cf + 12;
        int n2 = this.kpR.cg + 0;
        this.jHl = new hpa((hnc)this.cbO(), (String)null, new lgg(n, n2), hdk3.jMe.kLY, lhu.rnR);
        this.j(this.jHl);
        n = this.kpR.cf + 0;
        n2 = this.kpR.cg + 9;
        this.kpN = new hqz(this.kLu, null, new lgg(n, n2), hdk3.jMf.kLY, hpx.a.kXm, b2, hdk3.jMf);
        this.kpN.cvC().a(true, lbn2);
        this.j(this.kpN);
        if (this.kpO) {
            this.ckj();
        } else {
            this.ckk();
        }
    }

    public void cki() {
        if (this.kpO) {
            this.ckk();
        } else {
            this.ckj();
        }
    }

    private void ckj() {
        this.kpO = true;
        int n = 8;
        int n2 = 2;
        lhf lhf2 = new lhf(32, 32);
        this.d(new lhf(100 + lhf2.rmN * n, 15 + lhf2.H * n2));
        if (!this.kpQ.isEmpty()) {
            assert (this.jHl != null);
            this.jHl.a(this.cbO().jXk.jMe);
            for (hqz hqz2 : this.kpQ) {
                hqz2.nR(false);
            }
            return;
        }
        this.jHl.a(this.cbO().jXk.jMe);
        hpx.b b2 = this.cbO().kJH;
        int n3 = 0;
        n3 = 0;
        int n4 = this.kpR.cg + 5;
        for (int i = 0; i < n2; ++i) {
            int n5 = this.kpR.cf + 56;
            for (int j = 0; j < n; ++j) {
                a a2 = this.kpP.get(n3);
                if (n3 >= this.kpP.size()) break;
                hqz hqz3 = new hqz(this.kLu, null, new lgg(n5, n4), lhf2, hpx.a.kXm, b2, a2.kpT);
                hqz3.cvC().a(true, a2.keI);
                this.kpQ.add(hqz3);
                this.j(hqz3);
                n5 += lhf2.rmN + 1;
                ++n3;
            }
            n4 += lhf2.H + 1;
        }
    }

    private void ckk() {
        this.kpO = false;
        if (!this.kpQ.isEmpty()) {
            this.jHl.a(lhu.rnR);
            for (hqz hqz2 : this.kpQ) {
                hqz2.nR(true);
            }
        }
        this.d(new lhf(64, 74));
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    public boolean isExpanded() {
        return this.kpO;
    }

    @Override
    protected void ccc() {
        lgg lgg2 = this.cqu();
        if (this.b((hms)this.kpN, lgg2)) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, lcy.qZv.esy()));
            this.kLu.a(null, linkedList);
            return;
        }
        int n = this.kpQ.size();
        for (int i = 0; i < n; ++i) {
            hqz hqz2 = this.kpQ.get(i);
            if (!this.b((hms)hqz2, lgg2)) continue;
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().jGU, this.kpP.get((int)i).kbJ.esy()));
            this.kLu.a(null, linkedList);
            return;
        }
        super.ccc();
    }
}

