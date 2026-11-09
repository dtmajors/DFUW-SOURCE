/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ckn {
    public static final int eGR = 4;
    private float eGS;
    private float eGT = 1.0f;
    private float eGU = 2.0f;
    private float eGV = 4.0f;
    private float eGW = 8.0f;
    private Map<Integer, ckk> eGX = lcn.emw();

    public List<ckk> b(ckj ckj2) {
        ArrayList<ckk> arrayList = lcn.emv();
        for (ckk ckk2 : this.eGX.values()) {
            if (ckk2.aQS().ordinal() != ckj2.ordinal()) continue;
            arrayList.add(ckk2);
        }
        return arrayList;
    }

    public ckk hz(String string) {
        for (ckk ckk2 : this.eGX.values()) {
            if (!ckk2.getName().equalsIgnoreCase(string)) continue;
            return ckk2;
        }
        return null;
    }

    public ckk aW(int n, int n2) {
        for (ckk ckk2 : this.eGX.values()) {
            if (ckk2.aQS().ordinal() != n || ckk2.getIndex() != n2) continue;
            return ckk2;
        }
        return null;
    }

    public ckk ro(int n) {
        return this.eGX.get(n);
    }

    public float aX(int n, int n2) {
        float f = 1.0f;
        switch (n) {
            case 0: {
                f = this.eGT;
                break;
            }
            case 1: {
                f = this.eGU;
                break;
            }
            case 2: {
                f = this.eGV;
                break;
            }
            case 3: {
                f = this.eGW;
                break;
            }
            case 4: {
                return 0.0f;
            }
        }
        return this.eGS * (float)(n2 + 1) * f;
    }

    public String a(float f, int n, ckj ckj2) {
        List<ckk> list = this.b(ckj2);
        for (ckk ckk2 : list) {
            if (ckk2.rf(n) != f) continue;
            return ckk2.getName();
        }
        return null;
    }

    public void a(int n, ckk ckk2) {
        assert (!this.eGX.containsKey(n));
        this.eGX.put(n, ckk2);
    }

    public boolean D(int ... nArray) {
        if (nArray == null || nArray.length == 0) {
            return true;
        }
        ArrayList<Integer> arrayList = lcn.abH(4);
        int n = 0;
        for (int n2 : nArray) {
            ckk ckk2 = this.ro(n2);
            if (ckk2 == null) continue;
            if (arrayList.contains(ckk2.getID())) {
                return false;
            }
            n += ckk2.getIndex() + 1;
            arrayList.add(ckk2.getID());
        }
        return n <= 4;
    }

    public boolean d(List<Integer> list, int n) {
        if (list == null || list.size() == 0) {
            return true;
        }
        ArrayList<Integer> arrayList = lcn.abH(4);
        int n2 = 0;
        Object object = list.iterator();
        while (object.hasNext()) {
            int n3 = object.next();
            ckk ckk2 = this.ro(n3);
            if (ckk2 == null) {
                assert (false);
                continue;
            }
            if (arrayList.contains(ckk2.getID())) {
                return false;
            }
            n2 += ckk2.getIndex() + 1;
            arrayList.add(ckk2.getID());
        }
        object = this.ro(n);
        if (object != null) {
            n2 += ((ckk)object).getIndex() + 1;
        }
        return n2 <= 4;
    }

    public final float aRb() {
        return this.eGS;
    }

    public final Collection<ckk> aRc() {
        return this.eGX.values();
    }

    public final Map<Integer, ckk> aRd() {
        return this.eGX;
    }

    public final int aRe() {
        return this.eGX.size();
    }

    public void ex(float f) {
        this.eGS = f;
    }

    public void ey(float f) {
        this.eGT = f;
    }

    public void ez(float f) {
        this.eGU = f;
    }

    public void eA(float f) {
        this.eGV = f;
    }

    public void eB(float f) {
        this.eGW = f;
    }
}

