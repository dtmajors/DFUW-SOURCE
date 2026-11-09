/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class anq {
    public static int bHg = 32;
    private int bHh;
    private ljp[] bHi;
    private ljq[] bHj = new ljq[bHg];
    anc.a bHk;

    public ljp LS() {
        return this.isFinished() ? null : this.bHi[this.bHh];
    }

    public boolean isFinished() {
        return !this.HT() || this.bHi.length <= this.bHh;
    }

    public boolean isPending() {
        return this.bHk == anc.a.bCd;
    }

    public boolean HT() {
        return this.bHk == anc.a.bCe;
    }

    public List<ljp> bv(float f) {
        if (!this.HT()) {
            return null;
        }
        ArrayList<ljp> arrayList = lcn.emv();
        int n = this.bHi.length;
        arrayList.add(0, this.bHi[n - 1]);
        for (int i = n - 2; i >= 0; --i) {
            if (!(this.bHi[i].x((ljp)arrayList.get(0)) > f)) continue;
            arrayList.add(0, this.bHi[i]);
        }
        return arrayList;
    }

    public void next() {
        if (!this.isFinished()) {
            ++this.bHh;
        }
    }

    public boolean LT() {
        if (this.bHk == anc.a.bBZ) {
            return true;
        }
        if (this.bHk == anc.a.bCa) {
            return true;
        }
        if (this.bHk == anc.a.bCc) {
            return true;
        }
        return this.bHk == anc.a.bCb;
    }

    public boolean LU() {
        return this.bHk == anc.a.bBZ;
    }

    public boolean LV() {
        return this.bHk == anc.a.bCa;
    }

    public boolean LW() {
        return this.bHk == anc.a.bCb;
    }

    public boolean LX() {
        return this.bHk == anc.a.bCc;
    }

    public boolean e(ljq ljq2, ljq ljq3) {
        if (ljq2 == null) {
            return false;
        }
        if (ljq3 == null) {
            return false;
        }
        for (int i = 0; i < this.bHj.length; ++i) {
            if (this.bHj[i] != null) continue;
            this.bHj[i] = ljq2.esF();
            return true;
        }
        float f = ljq.s(ljq2, ljq3);
        int n = -1;
        float f2 = 0.0f;
        for (int i = 0; i < this.bHj.length; ++i) {
            float f3;
            if (this.bHj[i] == null || !((f3 = ljq.s(ljq3, this.bHj[i])) >= f2)) continue;
            f2 = f3;
            n = i;
        }
        if (n < 0) {
            return false;
        }
        if (f2 >= f) {
            this.bHj[n] = ljq2.esF();
        }
        return true;
    }

    public ljq[] LY() {
        return this.bHj;
    }

    public int LZ() {
        return this.bHj.length;
    }

    public String Ma() {
        return this.bHk == anc.a.bCe ? "[" + this.bHh + "/" + this.bHi.length + "]" : "N/A";
    }

    public void b(anc.a a2, ljp[] ljpArray) {
        this.bHk = a2;
        if (this.bHk == anc.a.bCe && (ljpArray == null || ljpArray.length == 0)) {
            this.bHk = anc.a.bBZ;
        }
        this.bHi = ljpArray;
        this.bHh = 0;
    }

    public void terminate() {
        this.bHi = null;
        this.bHj = null;
    }
}

