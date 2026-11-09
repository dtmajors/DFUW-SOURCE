/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;

public abstract class boq
extends bop {
    protected Map<Integer, Integer> dyb = lcn.emw();
    private boolean dyc = false;
    private boolean dyd = false;

    public Map<Integer, Integer> asW() {
        return this.dyb;
    }

    public void b(dtz.a[] aArray) {
        if (aArray == null) {
            assert (false);
            return;
        }
        for (int i = 0; i < aArray.length; ++i) {
            dtz.a a2 = aArray[i];
            String string = a2.ResourceName;
            int n = lea.enW().getType(string);
            if (n == -1) {
                assert (false) : "Invalid Resourcename [" + string + "]";
                continue;
            }
            this.dyb.put(n, 0);
        }
    }

    public boolean ls(int n) {
        for (Integer n2 : this.dyb.keySet()) {
            if (!lea.enW().isDescendant(n, n2)) continue;
            return true;
        }
        return false;
    }

    public int lt(int n) {
        for (Integer n2 : this.dyb.keySet()) {
            if (!lea.enW().isDescendant(n, n2)) continue;
            return this.dyb.get(n2);
        }
        assert (false) : "getTargetObjectCounter : Already Checked,So Can Not Be No Entry In Map At This Point";
        return 0;
    }

    public void am(int n, int n2) {
        for (Integer n3 : this.dyb.keySet()) {
            if (!lea.enW().isDescendant(n, n3)) continue;
            this.dyb.put(n3, n2);
            return;
        }
    }

    public void lu(int n) {
        for (Map.Entry<Integer, Integer> entry : this.dyb.entrySet()) {
            Integer n2 = entry.getKey();
            if (!lea.enW().isDescendant(n, n2)) continue;
            int n3 = entry.getValue();
            this.dyb.put(n2, n3 + 1);
            return;
        }
    }

    public String lv(int n) {
        for (Integer n2 : this.dyb.keySet()) {
            if (!lea.enW().isDescendant(n, n2)) continue;
            return cug.uG((int)n2);
        }
        assert (false) : "getTargetObjectName : Already Checked,So Can Not Be No Entry In Map At This Point";
        return "Generic Item";
    }

    public final boolean asX() {
        return this.dyc;
    }

    public final void dG(boolean bl2) {
        this.dyc = bl2;
    }

    public final boolean asY() {
        return this.dyd;
    }

    public final void dH(boolean bl2) {
        this.dyd = bl2;
    }
}

