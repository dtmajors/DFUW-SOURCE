/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public class hxg {
    public static final int ljt = lcw.aQH() ? 5 : 4;
    public static final int lju = 2;
    public static final int ljv = jej.mUd;
    protected List<List<List<List<a>>>> ljw = lcn.emv();

    public hxg() {
        for (int i = 0; i < ljt; ++i) {
            ArrayList arrayList = lcn.emv();
            this.ljw.add(arrayList);
            ArrayList arrayList2 = lcn.emv();
            arrayList.add(arrayList2);
            for (int j = 0; j < 2; ++j) {
                ArrayList<a> arrayList3 = lcn.emv();
                for (int k = 0; k < ljv; ++k) {
                    a a2 = new a(this);
                    a2.ljy = j == 0;
                    arrayList3.add(a2);
                }
                arrayList2.add(arrayList3);
            }
        }
    }

    public a k(int n, int n2, int n3, int n4) {
        return this.ljw.get(n).get(n2).get(n3).get(n4);
    }

    public int a(int n, int n2, int n3, hwm hwm2) {
        if (n < 0 || n >= ljt) {
            return -1;
        }
        if (n2 < 0 || n2 >= 1) {
            return -1;
        }
        if (n3 < 0 || n3 >= 2) {
            return -1;
        }
        if (hwm2 == null) {
            return -1;
        }
        for (int i = 0; i < ljv; ++i) {
            if (this.ljw.get((int)n).get((int)n2).get((int)n3).get((int)i).ljx != hwm2) continue;
            return i;
        }
        return -1;
    }

    public hwm l(int n, int n2, int n3, int n4) {
        if (n < 0 || n >= ljt) {
            return null;
        }
        if (n2 < 0 || n2 >= 1) {
            return null;
        }
        if (n3 < 0 || n3 >= 2) {
            return null;
        }
        if (n4 < 0 || n4 >= ljv) {
            return null;
        }
        return this.ljw.get((int)n).get((int)n2).get((int)n3).get((int)n4).ljx;
    }

    public void a(int n, int n2, int n3, int n4, hwm hwm2) {
        if (n < 0 || n >= ljt) {
            assert (false);
            return;
        }
        if (n2 < 0 || n2 >= 1) {
            assert (false);
            return;
        }
        if (n3 < 0 || n3 >= 2) {
            assert (false);
            return;
        }
        if (n4 < 0 || n4 >= ljv) {
            assert (false);
            return;
        }
        this.ljw.get((int)n).get((int)n2).get((int)n3).get((int)n4).ljx = hwm2;
        hzo hzo2 = (hzo)hso.cxK().cxO();
        if (n3 == 0) {
            hzo2.cHV().a(n4, hwm2);
        } else {
            hzo2.cHW().a(n4, hwm2);
        }
    }
}

