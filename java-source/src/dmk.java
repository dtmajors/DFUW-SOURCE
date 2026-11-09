/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class dmk {
    private int cEh = 0;
    private String eEh = null;
    private ioc gIl = null;
    private Map<Integer, List<ioc>> gIm = null;

    public int acY() {
        return this.cEh;
    }

    public String bqc() {
        return this.eEh;
    }

    public ioc bqd() {
        return this.gIl;
    }

    public Set<Integer> bqe() {
        return this.gIm.keySet();
    }

    public List<ioc> AD(int n) {
        return this.gIm.containsKey(n) ? this.gIm.get(n) : new LinkedList<ioc>();
    }

    public dmk(int n, String string, ioc ioc2, Map<Integer, List<ioc>> map) {
        this.cEh = n;
        this.eEh = string;
        this.gIl = ioc2;
        this.gIm = map;
    }
}

