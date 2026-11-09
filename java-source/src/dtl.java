/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.util.Map;

public class dtl
extends dta {
    Map<ldv, lfs<Integer, Integer>> hcp = lcn.emw();

    public ldv bY(int n, int n2) {
        ldv ldv2 = super.bzv();
        this.hcp.put(ldv2, new lfs<Integer, Integer>(n, n2));
        return ldv2;
    }

    public void oa(ldv ldv2) {
        this.hcp.remove(ldv2);
        super.oa(ldv2);
    }

    public void bAg() {
        int n = 0;
        Map<String, Integer> map = lcn.emw();
        for (lfs<Integer, Integer> object : this.hcp.values()) {
            String string = null;
            if (object.getFirst() != -1) {
                string = del.zU(object.getFirst());
            }
            if (string == null) {
                string = "unknown";
            }
            string = string + "#" + object.getFirst();
            String string2 = null;
            if (object.eqz() != -1) {
                string2 = del.zR(object.eqz());
            }
            if (string2 == null) {
                string2 = "unknown";
            }
            string2 = string2 + "#" + object.eqz();
            String string3 = string + ":" + string2;
            Integer n2 = (Integer)map.get(string3);
            if (n2 == null) {
                n2 = new Integer(0);
            }
            Integer n3 = n2;
            Integer n4 = n2 = Integer.valueOf(n2 + 1);
            map.put(string3, n2);
            ++n;
        }
        for (Map.Entry entry : map.entrySet()) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "printOutHighestCountSfx() : " + (String)entry.getKey() + " Count=" + entry.getValue() + "/" + n);
        }
    }
}

