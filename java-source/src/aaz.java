/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public abstract class aaz {
    private wy bbg = null;
    private String aZO = null;
    private int ID = -1;
    private abc bdd = abc.bdt;
    private Map<Integer, Set<Integer>> bde = null;
    private Map<Integer, Set<Integer>> bdf = null;
    private boolean bdg = false;
    private boolean bdh = false;
    private los bdi = null;
    private Map<yw, String> bdj = null;
    private jcf bdk = null;
    private abb bdl = abb.bdn;

    public wy wF() {
        return this.bbg;
    }

    public int getID() {
        return this.ID;
    }

    public String ym() {
        return this.aZO;
    }

    public abc yn() {
        return this.bdd;
    }

    public boolean yo() {
        return this.bdg;
    }

    public void az(boolean bl) {
        this.bdg = bl;
    }

    public loz yp() {
        if (!this.yo()) {
            return null;
        }
        return lvm.sXo.bD(this.ys());
    }

    public boolean yq() {
        return this.bdh;
    }

    public void aA(boolean bl) {
        this.bdh = bl;
    }

    public loz yr() {
        if (!this.yq()) {
            return null;
        }
        return lvm.sXp.bD(this.ys());
    }

    public boolean isActive() {
        return this.bbg.b(this);
    }

    private los ys() {
        if (this.bdi == null) {
            this.bdi = new los(this.bbg.getID(), this.ID);
        }
        return this.bdi;
    }

    public LinkedList<Integer> yt() {
        LinkedList<Integer> linkedList = lcn.emA();
        for (Set<Integer> set : this.bdf.values()) {
            Integer n = new LinkedList<Integer>(set).getFirst();
            aaw aaw2 = this.bbg.dG(n);
            linkedList.add(aaw2.xN());
        }
        return linkedList;
    }

    public boolean vY() {
        return this.bdj == null ? false : !this.bdj.isEmpty();
    }

    public jcf yu() {
        if (this.bdh && this.bdk == null) {
            this.bdk = new jcf(this.bbg.getID(), this.ID, this.aZO, this.bdj, this.ys());
        }
        return this.bdk;
    }

    public abb yv() {
        if (this.bdl == abb.bdn && this.xP()) {
            return abb.bdr;
        }
        return this.bdl;
    }

    public void a(abb abb2) {
        this.bdl = abb2;
    }

    protected aaz(wy wy2, int n, abc abc2) {
        this.bbg = wy2;
        this.ID = n;
        this.bdd = abc2;
        this.bde = lcn.emw();
        this.bdf = lcn.emw();
    }

    protected aaz(wy wy2, int n, abc abc2, String string) {
        this(wy2, n, abc2);
    }

    public boolean yw() {
        return true;
    }

    public String wJ() {
        return this.ay(false);
    }

    protected String ay(boolean bl) {
        return bl ? xc.dV(this.ID) : xc.dU(this.ID);
    }

    public boolean cq(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (xc.cm(string) != 'N') {
            return false;
        }
        return xc.cn(string) == this.getID();
    }

    public void b(aaw aaw2) {
        if (aaw2 == null) {
            return;
        }
        Set<Integer> set = this.bde.get(aaw2.getValue());
        if (set == null) {
            set = lcn.emx();
            this.bde.put(aaw2.getValue(), set);
        }
        set.add(aaw2.getID());
    }

    public int yx() {
        return this.bde.size();
    }

    public int yy() {
        int n = 0;
        for (Set<Integer> set : this.bde.values()) {
            n += set.size();
        }
        return n;
    }

    public void c(aaw aaw2) {
        if (aaw2 == null) {
            return;
        }
        Set<Integer> set = this.bdf.get(aaw2.getValue());
        if (set == null) {
            set = lcn.emx();
            this.bdf.put(aaw2.getValue(), set);
        }
        set.add(aaw2.getID());
    }

    public Set<Integer> yz() {
        return this.bdf.keySet();
    }

    public Set<Integer> yA() {
        Set<Integer> set = lcn.emx();
        for (Set<Integer> set2 : this.bdf.values()) {
            for (Integer n : set2) {
                if (set.contains(n)) continue;
                set.add(n);
            }
        }
        return set;
    }

    protected void l(int n, boolean bl) {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "transmitOutput() : Not In Active Quest!!!... Quest = " + this.bbg + ", Node = " + this);
            assert (false);
            return;
        }
        Set<Integer> set = this.bdf.get(n);
        if (set == null) {
            lfn.b(5, this.getClass().getSimpleName(), "transmitOutput() : Out-Edge(s) Not Found for Value!!!... Quest = " + this.bbg + ", Node = " + this + ", Output Value = " + n);
            assert (false);
            return;
        }
        for (Integer n2 : set) {
            aaw aaw2 = this.bbg.dG(n2);
            if (aaw2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "transmitOutput() : Out-Edge Not Found!!!... Quest = " + this.bbg + ", Node = " + this + ", Out-Edge ID = " + n2.toString());
                assert (false);
                return;
            }
            aaw2.c(bl, this instanceof abd);
        }
    }

    public abstract void a(int var1, int var2, boolean var3, boolean var4);

    public abstract boolean xP();

    public abstract jcl xQ();

    public abstract aaz h(wy var1);

    protected final aaz a(wy wy2, aaz aaz2) {
        if (aaz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "copyContent() : Copy Parameter is Null!!!... Quest = " + this.bbg + ", Node = " + this);
            assert (false);
            return null;
        }
        aaz2.bdg = this.bdg;
        aaz2.bdh = this.bdh;
        aaz2.bdl = this.bdl;
        if (this.bdh) {
            if (this.bdk == null) {
                this.bdk = new jcf(this.bbg.getID(), this.ID, this.aZO, this.bdj, this.ys());
            }
            aaz2.bdk = this.bdk;
        }
        aaz2.bdi = this.bdi;
        this.c(aaz2);
        this.d(aaz2);
        if (this instanceof zb && aaz2 instanceof zb) {
            ((zb)((Object)this)).b(wy2, (zb)((Object)aaz2));
        }
        if (this instanceof acr && aaz2 instanceof acr) {
            ((acr)((Object)this)).a(wy2, (acr)((Object)aaz2));
        }
        if (this instanceof xl && aaz2 instanceof xl) {
            ((xl)((Object)this)).b(wy2, (xl)((Object)aaz2));
        }
        return aaz2;
    }

    protected void c(aaz aaz2) {
    }

    private void d(aaz aaz2) {
        if (aaz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "copyEdgeIDs() : Copy Parameter is Null!!!... Quest = " + this.bbg + ", Node = " + this);
            assert (false);
            return;
        }
        for (Map.Entry<Integer, Set<Integer>> entry : this.bde.entrySet()) {
            aaz2.bde.put(entry.getKey(), new HashSet(entry.getValue()));
        }
        for (Map.Entry<Integer, Set<Integer>> entry : this.bdf.entrySet()) {
            aaz2.bdf.put(entry.getKey(), new HashSet(entry.getValue()));
        }
    }

    public void a(yw yw2, String string) {
        if (this.bdj == null) {
            this.bdj = lcn.emw();
        }
        this.bdj.put(yw2, string);
    }
}

