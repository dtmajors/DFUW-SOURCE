/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class rl
extends qd {
    private ps[] aBz;
    private so aPO;
    private Map<String, ldv> aPP;
    private String aMH;

    public rl(md md2) {
        super(md2, me.axk);
    }

    public void a(ps[] psArray) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadAllCities", "setGamelogicServerList: Can't modify while working");
            assert (false);
            return;
        }
        this.aBz = psArray;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPO = this.f(new so((md)this, nj.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPO);
        this.aPO = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPO.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aPO) {
            this.tF();
        } else if (qe2.aMr == me.axA) {
            this.e(qe2);
        } else {
            lfn.b(5, "SFPersistenceWorkerLoadAllCities", "notifyChildCompleted: Unhandled worker " + qe2);
            assert (false);
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void tF() {
        Object object;
        void var4_8;
        this.aPP = lcn.emw();
        Set<String> set = this.tG();
        if (set == null) {
            this.aMH = "Couldn't load city list from file";
            return;
        }
        LinkedList<Object> linkedList = lcn.emA();
        this.aPO.d(linkedList);
        for (nj object2 : linkedList) {
            if (!set.remove(object2.aDq.toLowerCase())) {
                lfn.b(4, "SFPersistenceWorkerLoadAllCities", "notifyChildCompleted: City file '" + object2.aDq + "' found in persistence but not in city file.");
            }
            this.aPP.put(object2.aDq, object2.aDk);
        }
        if (!set.isEmpty()) {
            lfn.b(3, "SFPersistenceWorkerLoadAllCities", "notifyChildCompleted: " + set.size() + " new cities in file");
            for (String iterator2 : set) {
                this.aPP.put(iterator2, null);
            }
        }
        Iterator<String> iterator = lcn.emw();
        boolean bl = false;
        while (var4_8 < this.aBz.length) {
            Map map = lcn.emw();
            iterator.put(this.aBz[var4_8].Wy.di, map);
            ++var4_8;
        }
        for (String string : this.aPP.keySet()) {
            object = this.aPP.get(string);
            if (object == null) continue;
            ((Map)iterator.get(((ldv)object).ib())).put(string, object);
        }
        for (String string : this.aPP.keySet()) {
            object = this.aPP.get(string);
            if (object != null) continue;
            int n = this.h((Map<Integer, Map<String, ldv>>)((Object)iterator));
            ((Map)iterator.get(n)).put(string, null);
        }
        Iterator iterator2 = iterator.keySet().iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator2.next();
            object = (Map)iterator.get(n);
            if (object.isEmpty()) continue;
            tb tb2 = this.f(new tb(this));
            tb2.bN(n);
            tb2.k((Map<String, ldv>)object);
            tb2.start();
        }
    }

    private int h(Map<Integer, Map<String, ldv>> map) {
        int n = -1;
        int n2 = Integer.MAX_VALUE;
        for (int n3 : map.keySet()) {
            int n4 = map.get(n3).size();
            if (n4 > n2) continue;
            n = n3;
            n2 = n4;
        }
        return n;
    }

    private Set<String> tG() {
        jwi jwi2 = new jwi();
        List<String> list = jwi2.dUk();
        if (list == null) {
            return null;
        }
        Set<String> set = lcn.emx();
        for (String string : list) {
            set.add(string.toLowerCase());
        }
        return set;
    }
}

