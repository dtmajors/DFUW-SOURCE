/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Map;
import java.util.TreeMap;

public class bwx {
    public final bwz dXv;
    public final String YL;
    public hdm dXw;
    public hkx dXx;
    hip dXy;
    private Map<Integer, bqt[]> dXz = lcn.emG();
    private final lbn dXA = new lbn(this){
        final /* synthetic */ bwx dXB;
        {
            this.dXB = bwx2;
        }

        public void W() {
            this.dXB.dXv.gF(this.dXB.YL);
            this.dXB.dXx.closeWindow();
        }
    };

    public bwx(bwz bwz2, String string) {
        this.dXv = bwz2;
        this.YL = string;
    }

    public hen aCI() {
        lgg lgg2 = new lgg(200, 100);
        hen hen2 = new hen(this.dXw, this.YL, lgg2, new lhf(400, 585), this.dXw.jXJ, new hen.d(new ljk(this.YL + " item list")), new hnu.d(this.dXA), new hen.e(true), new hen.c(this.dXx.coX()));
        lhf lhf2 = hen2.cqv().q(hen2.cfF().keL.kKX.kPT.ctr());
        this.dXy = new hip(this.dXw, null, lgg.rlI, lhf2, this.dXw.kKI);
        hen2.w(this.dXy);
        return hen2;
    }

    public void aCJ() {
        if (hec.kbV == null) {
            assert (false);
            return;
        }
        this.dXw = hec.kbV.cbO();
        this.dXx = new hkx(this);
        this.dXx.cdk();
        for (Integer n : this.dXz.keySet()) {
            this.dXy.a(this.nC(n), this.dXz.get(n));
        }
    }

    private final String nC(int n) {
        switch (n) {
            case 1: {
                return "Backpack";
            }
            case 2: {
                return "Bank";
            }
            case 5: {
                return "Clan Bank";
            }
            case 3: {
                return "House Bank";
            }
            case 4: {
                return "House Vendor";
            }
        }
        return "" + n;
    }

    public void a(frr frr2) {
        bqt[] bqtArray = this.a(frr2.iUZ);
        this.dXz.put(frr2.aCH, bqtArray);
        if (this.dXy != null) {
            this.dXy.a(this.nC(frr2.aCH), bqtArray);
        }
    }

    private bqt[] a(bqt[] bqtArray) {
        TreeMap<String, bqt> treeMap = lcn.emG();
        for (bqt bqt2 : bqtArray) {
            String string = lea.enW().getName(bqt2.ResourceType);
            bqt bqt3 = (bqt)treeMap.get(string);
            if (bqt3 == null) {
                bqt3 = new bqt();
                treeMap.put(string, bqt3);
                bqt3.asi = bqt2.asi;
                bqt3.ResourceType = bqt2.ResourceType;
                continue;
            }
            bqt3.asi += bqt2.asi;
        }
        return treeMap.values().toArray(new bqt[treeMap.size()]);
    }
}

