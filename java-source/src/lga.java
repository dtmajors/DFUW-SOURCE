/*
 * Decompiled with CFR.
 */
import java.util.SortedMap;

public class lga {
    private int rkO = -1;
    private SortedMap<Integer, lgj> rkP = lcn.emD();
    private boolean rkQ = false;
    int rkR = 0;

    public void clear() {
        this.rkP.clear();
    }

    public void start() {
        this.rkQ = false;
        this.clear();
    }

    public void stop() {
        this.rkQ = true;
        this.rkR = 25;
    }

    public void n(lgj lgj2) {
        assert (!this.rkP.containsKey(lgj2.aZa));
        this.rkP.put(lgj2.aZa, lgj2);
    }

    public lgj aJ(ldz ldz2) {
        if (this.rkQ && this.rkR <= 0) {
            return null;
        }
        int n = ldz2.enO();
        if (n <= this.rkO) {
            return null;
        }
        if (this.rkP.containsKey(n)) {
            this.rkP.headMap(n).clear();
            this.rkO = n;
            lgj lgj2 = new lgj((lgj)this.rkP.get(n), n, this.rkQ);
            if (this.rkQ) {
                --this.rkR;
            }
            return lgj2;
        }
        SortedMap<Integer, lgj> sortedMap = this.rkP.headMap(n);
        if (sortedMap.size() == 0) {
            return null;
        }
        this.rkO = sortedMap.lastKey();
        this.rkP.headMap(this.rkO).clear();
        lgj lgj3 = new lgj((lgj)this.rkP.get(this.rkO), n, this.rkQ);
        if (this.rkQ) {
            --this.rkR;
        }
        return lgj3;
    }
}

