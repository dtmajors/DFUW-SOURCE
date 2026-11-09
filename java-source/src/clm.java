/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class clm {
    private Map<Integer, Map<Integer, cll>> eIZ = lcn.emw();
    private cln eJa;

    public List<Integer> aY(int n, int n2) {
        Map<Integer, cll> map = this.eIZ.get(n);
        if (map == null) {
            return null;
        }
        cll cll2 = map.get(n2);
        if (cll2 == null) {
            return null;
        }
        return cll2.aSf();
    }

    public cll aZ(int n, int n2) {
        Map<Integer, cll> map = this.eIZ.get(n);
        if (map == null) {
            return null;
        }
        cll cll2 = map.get(n2);
        if (cll2 == null) {
            return null;
        }
        return cll2;
    }

    public boolean rA(int n) {
        return this.eIZ.containsKey(n);
    }

    public boolean ba(int n, int n2) {
        Map<Integer, cll> map = this.eIZ.get(n);
        if (map == null) {
            return false;
        }
        cll cll2 = map.get(n2);
        if (cll2 == null) {
            return false;
        }
        assert (cll2.az() == n2);
        return true;
    }

    public void a(int n, cll cll2) {
        assert (cll2 != null);
        Map<Integer, cll> map = this.eIZ.get(n);
        if (map == null) {
            map = lcn.emw();
            this.eIZ.put(n, map);
        }
        map.put(cll2.az(), cll2);
    }

    public final boolean rB(int n) {
        return this.eJa.rE(n);
    }

    public final int rC(int n) {
        return this.eJa.rC(n);
    }

    public int rD(int n) {
        return this.eJa.rF(n);
    }

    public final cln aSg() {
        return this.eJa;
    }

    public final void a(cln cln2) {
        this.eJa = cln2;
    }
}

