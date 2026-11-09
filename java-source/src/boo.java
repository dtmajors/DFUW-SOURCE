/*
 * Decompiled with CFR.
 */
import java.util.Iterator;

public class boo
extends boq {
    private boolean dxT = false;
    private ldv dxU = null;
    private boolean ChainQuest = false;

    @Override
    public int asH() {
        return dud.hdQ.ordinal();
    }

    public int aer() {
        assert (this.dyb != null && this.dyb.size() == 1);
        Iterator iterator = this.dyb.keySet().iterator();
        if (iterator.hasNext()) {
            Integer n = (Integer)iterator.next();
            return this.lt(n);
        }
        return 0;
    }

    public int asL() {
        assert (this.dyb != null && this.dyb.size() == 1);
        return (Integer)this.dyb.keySet().iterator().next();
    }

    public int lq(int n) {
        if (this.dyb.isEmpty()) {
            return -1;
        }
        Iterator iterator = this.dyb.keySet().iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            if (!lea.enW().isDescendant(n, n2)) continue;
            return n2;
        }
        return -1;
    }

    public boolean asM() {
        return this.dxT;
    }

    public void dA(boolean bl2) {
        this.dxT = bl2;
    }

    @Override
    public ldv asN() {
        return this.dxU;
    }

    @Override
    public void ii(ldv ldv2) {
        this.dxU = ldv2;
    }

    public ldv asO() {
        return this.dxU;
    }

    public boolean asP() {
        return this.ChainQuest;
    }

    public void dB(boolean bl2) {
        this.ChainQuest = bl2;
    }
}

