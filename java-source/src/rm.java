/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class rm
extends qd {
    private ps[] aBz;
    private so aPQ;
    private Map<String, ldv> aPR;
    private String aMH;

    public rm(md md2) {
        super(md2, me.axn);
    }

    public void a(ps[] psArray) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadAllFortresses", "setGamelogicServerList: Can't modify while working");
            assert (false);
            return;
        }
        this.aBz = psArray;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPQ = this.f(new so((md)this, nx.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPQ);
        this.aPQ = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPQ.start();
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
        } else if (qe2 == this.aPQ) {
            this.tF();
        } else if (qe2.aMr == me.axF) {
            this.e(qe2);
        } else {
            lfn.b(5, "SFPersistenceWorkerLoadAllFortresses", "notifyChildCompleted: Unhandled worker " + qe2);
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
        this.aPR = lcn.emw();
        Set<String> set = this.tH();
        if (set == null) {
            this.aMH = "Couldn't load Fortress list from file";
            return;
        }
        LinkedList<Object> linkedList = lcn.emA();
        this.aPQ.d(linkedList);
        for (nx object2 : linkedList) {
            if (!set.remove(object2.Filename.toLowerCase())) {
                lfn.b(4, "SFPersistenceWorkerLoadAllFortresses", "notifyChildCompleted: Fortress file '" + object2.Filename + "' found in persistence but not in Fortress file.");
            }
            this.aPR.put(object2.Filename, object2.aFc);
        }
        if (!set.isEmpty()) {
            lfn.b(3, "SFPersistenceWorkerLoadAllFortresses", "notifyChildCompleted: " + set.size() + " new Fortresses in file");
            for (String iterator2 : set) {
                this.aPR.put(iterator2, null);
            }
        }
        Iterator<String> iterator = lcn.emw();
        boolean bl = false;
        while (var4_8 < this.aBz.length) {
            Map map = lcn.emw();
            iterator.put(this.aBz[var4_8].Wy.di, map);
            ++var4_8;
        }
        for (String string : this.aPR.keySet()) {
            object = this.aPR.get(string);
            if (object == null) continue;
            ((Map)iterator.get(((ldv)object).ib())).put(string, object);
        }
        for (String string : this.aPR.keySet()) {
            object = this.aPR.get(string);
            if (object != null) continue;
            int n = this.i((Map<Integer, Map<String, ldv>>)((Object)iterator));
            ((Map)iterator.get(n)).put(string, null);
        }
        Iterator iterator2 = iterator.keySet().iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator2.next();
            object = (Map)iterator.get(n);
            if (object.isEmpty()) continue;
            tc tc2 = this.f(new tc(this));
            tc2.bN(n);
            tc2.l((Map<String, ldv>)object);
            tc2.start();
        }
    }

    private int i(Map<Integer, Map<String, ldv>> map) {
        int n = -1;
        int n2 = Integer.MAX_VALUE;
        for (int n3 : map.keySet()) {
            int n4 = map.get(n3).size();
            if (n4 >= n2) continue;
            n = n3;
            n2 = n4;
        }
        return n;
    }

    private Set<String> tH() {
        jwq jwq2 = new jwq();
        List<String> list = jwq2.dUk();
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

