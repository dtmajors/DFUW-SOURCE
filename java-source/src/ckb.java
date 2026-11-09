/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.MultiMap;

public class ckb {
    private int eFp;
    private int eFq;
    private double eFr;
    private boolean eFs;
    private int eFt;
    private int eFu;
    private int eFv;
    private Map<Integer, cjx> eFw = lcn.abI(4);
    private MultiMap eFx = lcn.emB();
    private Map<Integer, Integer> eFy = lcn.abI(16);
    private Map<String, lfs<Integer, Integer>> eFz = lcn.emw();
    private List<Integer> eFA = lcn.emv();

    public final Collection<cjx> aQE() {
        return this.eFw.values();
    }

    public void a(cjx cjx2) {
        this.eFw.put(cjx2.getIndex(), cjx2);
    }

    public void a(int n, ckf ckf2) {
        this.eFx.put((Object)n, ckf2);
    }

    public void g(String string, int n, int n2) {
        this.eFz.put(string, new lfs<Integer, Integer>(n, n2));
    }

    public Collection<ckf> qR(int n) {
        return (Collection)this.eFx.get(n);
    }

    public void aU(int n, int n2) {
        if (!this.eFy.containsKey(n)) {
            this.eFy.put(n, n2);
        }
        this.eFA.add(n2);
    }

    public int qS(int n) {
        Integer n2 = this.eFy.get(n);
        return n2 != null ? n2 : -1;
    }

    public boolean qT(int n) {
        return this.eFA.contains(n);
    }

    public cjx qU(int n) {
        return this.eFw.get(n);
    }

    public cjx hu(String string) {
        for (cjx cjx2 : this.eFw.values()) {
            if (!cjx2.getName().equalsIgnoreCase(string)) continue;
            return cjx2;
        }
        return null;
    }

    public int hv(String string) {
        lfs<Integer, Integer> lfs2 = this.eFz.get(string);
        if (lfs2 == null) {
            assert (false) : "Invalid Specialization : " + string;
            return -1;
        }
        return (Integer)lfs2.reX;
    }

    public lfs<Integer, Integer> hw(String string) {
        return this.eFz.get(string);
    }

    public int hx(String string) {
        for (cjx cjx2 : this.eFw.values()) {
            if (!cjx2.aQv().name().equalsIgnoreCase(string)) continue;
            return cjx2.getIndex();
        }
        assert (false) : "Invalid Armor Type : " + string;
        return -1;
    }

    public boolean qV(int n) {
        for (int n2 : this.eFy.values()) {
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    public final double aQF() {
        return this.eFr;
    }

    public final void bt(double d2) {
        this.eFr = d2;
    }

    public int aQG() {
        return this.eFp;
    }

    public void qW(int n) {
        this.eFp = n;
    }

    public int getDelay() {
        return this.eFq;
    }

    public void setDelay(int n) {
        this.eFq = n;
    }

    public final boolean aQH() {
        return this.eFs;
    }

    public final void gi(boolean bl) {
        this.eFs = bl;
    }

    public final int aQI() {
        return this.eFu;
    }

    public final void qX(int n) {
        this.eFu = n;
    }

    public final int aQJ() {
        return this.eFv;
    }

    public final void qY(int n) {
        this.eFv = n;
    }

    public final int aQK() {
        return this.eFt;
    }

    public final void qZ(int n) {
        this.eFt = n;
    }
}

