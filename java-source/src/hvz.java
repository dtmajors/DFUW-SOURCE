/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.List;

public class hvz {
    protected int cck = 0;
    protected int lht = 0;
    protected List<Integer> lhu = lcn.emv();
    protected List<alu> PG = lcn.emv();
    protected float lhv = -1.0f;

    hvz(int n) {
        this.cck = n;
    }

    public List<alu> gh() {
        return this.PG;
    }

    public boolean cAM() {
        int n = 0;
        for (alu alu2 : this.PG) {
            if (bfk.kF(alu2.CD())) {
                ++n;
                continue;
            }
            --n;
        }
        return n >= 0;
    }

    public int cAN() {
        return this.PG.size();
    }

    public alu OB(int n) {
        return this.PG.get(n);
    }

    public int OC(int n) {
        return this.lhu.get(n);
    }

    public int j(alu alu2) {
        for (int i = 0; i < this.PG.size(); ++i) {
            if (this.PG.get(i) != alu2) continue;
            return this.lhu.get(i);
        }
        return -1;
    }

    public void k(alu alu2) {
        this.lhu.add(this.lht);
        this.PG.add(alu2);
        ++this.lht;
    }

    public void OD(int n) {
        this.PG.remove(n);
        this.lhu.remove(n);
    }

    public int zg() {
        if (this.PG.size() == 0) {
            return -1;
        }
        return hvz.l(this.PG.get(0));
    }

    public static int l(alu alu2) {
        int n = alu2.Eb();
        if (n == 0 || n == -1 || n == cxd.fJp) {
            return -1;
        }
        if (lea.enZ().isDescendant(n, cxd.fJo) && !lea.enZ().isDescendant(n, cxd.fHe) || lea.enZ().isDescendant(n, cxd.fJk) || lea.enZ().isDescendant(n, cxd.fLc) || lea.enZ().isDescendant(n, cxd.fIl) || lea.enZ().isDescendant(n, cxd.fHO) || lea.enZ().isDescendant(n, cxd.fIZ)) {
            return -1;
        }
        return n;
    }

    public int cAO() {
        if (this.PG.size() == 0) {
            return 0;
        }
        for (alu alu2 : this.PG) {
            if (alu2.Eb() == cxd.fKX) {
                return hso.cxK().cxP().cyZ().Ow(13536);
            }
            if (alu2.Eb() == cxd.fKW) {
                return Math.min(this.cAN(), 5);
            }
            if (alu2.Eb() == cxd.fHP) {
                return Math.min(this.cAN(), 5);
            }
            if (alu2.Eb() != cxd.fHS) continue;
            return Math.min(this.cAN(), 5);
        }
        return 0;
    }

    public int getId() {
        return this.cck;
    }

    public float cAP() {
        return this.lhv;
    }

    public void ke(float f2) {
        this.lhv = f2;
    }

    public double DV() {
        double d2 = 0.0;
        for (alu alu2 : this.PG) {
            if (alu2.hasInfiniteDuration()) continue;
            d2 = Math.max(d2, alu2.Ep());
        }
        return d2;
    }
}

