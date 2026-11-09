/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public abstract class ibs {
    private ibs lGk;
    private int lGl;
    private final lox lGm;
    private final ics lGn;
    private final int lGo;

    public ibs(lox lox2, ics ics2, int n) {
        this.lGm = lox2;
        this.lGn = ics2;
        this.lGo = n;
    }

    public String getId() {
        return this.lGm.getIdentifier();
    }

    public lox cNq() {
        return this.lGm;
    }

    public ics cNr() {
        return this.lGn;
    }

    public int cNs() {
        return this.lGo;
    }

    public List<ibs> getChildren() {
        return null;
    }

    public boolean hasChildren() {
        return false;
    }

    public icr pJ(boolean bl) {
        return new icr(this, this.lGn, this.lGo, bl);
    }

    public Map<ibs, icr> pK(boolean bl) {
        Map<ibs, icr> map = lcn.emw();
        this.b(map, bl);
        return map;
    }

    public void b(Map<ibs, icr> map, boolean bl) {
        map.put(this, this.pJ(bl));
        List<ibs> list = this.getChildren();
        if (list != null) {
            for (ibs ibs2 : list) {
                ibs2.b(map, bl);
            }
        }
    }

    public ibs cNt() {
        return this.lGk;
    }

    public int cNu() {
        return this.lGl;
    }

    public abstract boolean d(jmz var1);

    public abstract boolean cNv();

    void b(ibs ibs2) {
        this.lGk = ibs2;
        this.lGl = ibs2.lGl + 1;
    }
}

