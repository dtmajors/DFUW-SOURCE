/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class mhy {
    private mid Dxh = null;
    private float Dxi = 5.0f;
    private float Dxj = 50.0f;
    private List<ljq> Dxk = null;
    private Random Dxl = new Random();
    private a[] Dxm = null;

    public mhy(mid mid2, int n, float f, float f2) {
        this.Dxh = mid2;
        this.Dxj = f;
        this.Dxi = f2;
        this.init();
        for (a a2 : this.Dxm = new a[n]) {
            a2 = new a(this, null);
            a2.Dxo = this.Dxl.nextInt(this.Dxk.size());
            this.a(a2);
        }
    }

    public List<Integer> a(ldz ldz2, Set<Integer> set, ljq[] ljqArray) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        assert (ljqArray.length == this.Dxm.length);
        float f = (float)ldz2.qwh * this.Dxj;
        for (int i = 0; i < this.Dxm.length; ++i) {
            a a2 = this.Dxm[i];
            if (set.contains(i)) {
                this.a(a2);
            }
            ljqArray[i].eu(this.Dxk.get(a2.Dxo));
            if (a2.Dxp >= 1.0 && a2.Dxq != -1.0f) {
                a2.Dxq = (float)((double)a2.Dxq - ldz2.qwh);
                if (!(a2.Dxq <= 0.0f)) continue;
                a2.Dxq = -1.0f;
                linkedList.add(i);
                continue;
            }
            double d2 = ljq.s(this.Dxk.get(a2.Dxn), this.Dxk.get(a2.Dxo));
            assert (d2 > 0.0);
            a2.Dxp += (double)f / d2;
            if (!(a2.Dxp < 1.0)) continue;
            ljq.a(this.Dxk.get(a2.Dxn), this.Dxk.get(a2.Dxo), (float)a2.Dxp, ljqArray[i]);
            ljqArray[i].x = lew.A(16384.0f * ljqArray[i].x, -16384.0f, 16384.0f);
            ljqArray[i].rlV = lew.A(16384.0f * ljqArray[i].rlV, -16384.0f, 16384.0f);
            ljqArray[i].y = this.Dxh.Dxz.au(ljqArray[i].x, ljqArray[i].rlV);
        }
        return linkedList;
    }

    public final List<ljq> ezf() {
        return this.Dxk;
    }

    private void init() {
        ArrayList<ljq> arrayList = new ArrayList<ljq>();
        for (lfs<ljq, ljq> object : this.Dxh.DxA) {
            ljq ljq2 = (ljq)object.reX;
            ljq ljq3 = (ljq)object.reY;
            arrayList.add(new ljq(ljq2));
            arrayList.add(ljq.r(ljq2, ljq3));
            arrayList.add(new ljq(ljq3));
        }
        for (ljq ljq4 : this.Dxh.DxB) {
            arrayList.add(new ljq(ljq4));
        }
    }

    private void a(a a2) {
        float f;
        assert (a2.Dxp >= 1.0);
        assert (a2.Dxq == -1.0f);
        a2.Dxp = 0.0;
        a2.Dxq = this.Dxi;
        a2.Dxn = a2.Dxo;
        do {
            a2.Dxo = this.Dxl.nextInt(this.Dxk.size());
        } while (a2.Dxo == a2.Dxn || !((f = ljq.s(this.Dxk.get(a2.Dxn), this.Dxk.get(a2.Dxo))) > 1.0E-6f));
    }

    static /* synthetic */ float a(mhy mhy2) {
        return mhy2.Dxi;
    }
}

