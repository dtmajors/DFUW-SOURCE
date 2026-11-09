/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;

public class xb {
    private int ID = -1;
    private String aZO = null;
    private xa aZP = xa.bah;
    private List<wy> aCS = null;
    private lor bap = null;

    public int getID() {
        return this.ID;
    }

    public xa vR() {
        return this.aZP;
    }

    public List<wy> wr() {
        return new LinkedList<wy>(this.aCS);
    }

    public int ws() {
        return this.aCS.size();
    }

    public loz vT() {
        return lvm.sXr.bD(this.wt());
    }

    public loz vU() {
        return lvm.sXs.bD(this.wt());
    }

    private lor wt() {
        if (this.bap == null) {
            this.bap = new lor(this.ID);
        }
        return this.bap;
    }

    public List<lfs<Integer, List<jcf>>> a(xd xd2) {
        if (xd2 == null) {
            return null;
        }
        LinkedList<lfs<Integer, List<jcf>>> linkedList = lcn.emA();
        for (wy wy2 : this.aCS) {
            List<jcf> list = xd2.dY(wy2.getID());
            if (list == null || list.isEmpty()) continue;
            lfs lfs2 = new lfs();
            lfs2.reX = wy2.getID();
            lfs2.reY = list;
            linkedList.add(lfs2);
        }
        return linkedList;
    }

    public boolean vY() {
        for (wy wy2 : this.aCS) {
            if (!wy2.vY()) continue;
            return true;
        }
        return false;
    }

    public xb(int n, xa xa2) {
        this.ID = n;
        this.aZP = xa2;
        this.aCS = lcn.emA();
    }

    public xb(int n, xa xa2, String string) {
        this(n, xa2);
    }

    public void a(wy wy2) {
        if (wy2 == null) {
            return;
        }
        if (wy2.vS() != null) {
            return;
        }
        wy2.a(this);
        this.aCS.add(wy2);
    }

    public void b(wy wy2) {
        if (wy2 == null) {
            return;
        }
        if (!this.aCS.contains(wy2)) {
            return;
        }
        wy2.a((xb)null);
        this.aCS.remove(wy2);
    }
}

