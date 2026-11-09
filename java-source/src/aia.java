/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public abstract class aia
extends aht {
    private List<agw> bmW = lcn.abH(1);
    private List<agw> bmX = lcn.abH(1);
    protected Map<Integer, agj> bmY = lcn.emw();
    protected Map<Integer, Integer> bmZ = lcn.emw();
    private int bna = 20481;
    private int bnb = -1;

    public aia(int n) {
        super(n);
    }

    public final List<agw> BI() {
        return this.bmW;
    }

    public final List<agw> BJ() {
        return this.bmX;
    }

    public final boolean fv(int n) {
        if (n < 160) {
            return false;
        }
        return this.bmZ.containsKey(n);
    }

    @Override
    public void a(int n, int n2, List<uk> list) {
        if (this.bnb > 0 && this.bnb <= n2) {
            return;
        }
        agw agw2 = this.bmW.get(n);
        if (agw2 == null) {
            return;
        }
        int n3 = agw2.bio.size();
        for (int i = 0; i < n3; ++i) {
            vd vd2;
            int n4;
            agj agj2;
            Integer n5 = agw2.bio.get(i);
            Integer n6 = this.bmZ.get(n5);
            if (n6 <= n2 || (agj2 = this.fw(n4 = n5.intValue())) == null || (vd2 = agj2.eD(n2)) == null) continue;
            list.add(vd2);
        }
    }

    @Override
    public void b(int n, int n2, List<uk> list) {
        if (this.bnb > 0 && this.bnb <= n2) {
            return;
        }
        agw agw2 = this.bmX.get(n);
        if (agw2 == null) {
            return;
        }
        int n3 = agw2.bio.size();
        for (int i = 0; i < n3; ++i) {
            vd vd2;
            int n4;
            agj agj2;
            Integer n5 = agw2.bio.get(i);
            Integer n6 = this.bmZ.get(n5);
            if (n6 <= n2 || (agj2 = this.fw(n4 = n5.intValue())) == null || (vd2 = agj2.eD(n2)) == null) continue;
            list.add(vd2);
        }
    }

    protected final void a(agj agj2) {
        assert (agj2 != null);
        assert (agj2.AJ() > 0);
        if (this.bmY.containsKey(agj2.AK())) {
            return;
        }
        if (!this.b(agj2.AI(), agj2.AJ())) {
            return;
        }
        this.bmY.put(agj2.AK(), agj2);
    }

    protected final boolean c(Integer n) {
        assert (n != null);
        return this.bmY.containsKey(n);
    }

    protected final agj fw(int n) {
        assert (n > 0);
        return this.bmY.get(n);
    }

    protected final int BK() {
        return ++this.bna;
    }

    protected final agj b(agj agj2) {
        assert (agj2 != null);
        assert (agj2.AJ() > 0);
        if (!this.bmY.containsKey(agj2.AK())) {
            return null;
        }
        if (!this.c(agj2.AI(), agj2.AJ())) {
            return null;
        }
        return this.bmY.remove(agj2.AK());
    }

    protected final void d(Integer n) {
        assert (n != null);
        assert (this.bmZ.containsKey(n));
        this.bmZ.remove(n);
    }

    @Override
    protected final void fu(int n) {
        Integer n2 = new Integer(n);
        for (agj agj2 : this.bmY.values()) {
            this.a(agj2.AK(), n2);
        }
    }

    protected final void a(Integer n, Integer n2) {
        assert (n != null);
        assert (n2 != null);
        assert (n >= 160);
        this.bmZ.put(n, n2);
        int n3 = n2;
        if (n3 <= this.bnb) {
            return;
        }
        this.bnb = n3;
    }

    private boolean b(ahu.b b2, int n) {
        assert (this.blt != null);
        assert (b2 != null);
        assert (n > 0);
        hm hm2 = this.blt.a(b2);
        if (hm2 != null) {
            int n2 = hm2.adk;
            if (n2 < 0 || n2 >= this.bmW.size()) {
                return false;
            }
            agw agw2 = this.bmW.get(n2);
            if (agw2 == null) {
                return false;
            }
            agw2.bio.add(n);
            return true;
        }
        hn hn2 = this.blt.a(b2, n);
        if (hn2 != null) {
            int n3 = hn2.adk;
            if (n3 < 0 || n3 >= this.bmX.size()) {
                return false;
            }
            agw agw3 = this.bmX.get(n3);
            if (agw3 == null) {
                return false;
            }
            agw3.bio.add(n);
            return true;
        }
        if (this.blt.mZ()) {
            return false;
        }
        agw agw4 = this.bmW.get(0);
        if (agw4 == null) {
            return false;
        }
        agw4.bio.add(n);
        return true;
    }

    private boolean c(ahu.b b2, int n) {
        assert (this.blt != null);
        assert (b2 != null);
        assert (n > 0);
        hm hm2 = this.blt.a(b2);
        if (hm2 != null) {
            int n2 = hm2.adk;
            agw agw2 = this.bmW.get(n2);
            if (agw2 == null) {
                return false;
            }
            agw2.bio.remove(new Integer(n));
            return true;
        }
        hn hn2 = this.blt.a(b2, n);
        if (hn2 != null) {
            int n3 = hn2.adk;
            agw agw3 = this.bmX.get(n3);
            if (agw3 == null) {
                return false;
            }
            agw3.bio.remove(new Integer(n));
            return true;
        }
        if (this.blt.mZ()) {
            return false;
        }
        agw agw4 = this.bmW.get(0);
        if (agw4 == null) {
            return false;
        }
        agw4.bio.remove(new Integer(n));
        return true;
    }
}

