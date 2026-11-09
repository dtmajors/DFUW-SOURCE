/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class cfj
extends btk {
    public static Map<Integer, cfn> euv = lcn.emw();
    public static List<cfm> euw = lcn.emv();
    protected List<Integer> eux = lcn.emv();
    protected List<Integer> euy = lcn.emv();

    protected void pG(int n) {
        this.euy.remove((Object)n);
        this.eux.add(n);
    }

    protected void pH(int n) {
        this.euy.add(n);
    }

    public boolean pI(int n) {
        if (this.eux.indexOf(n) != -1) {
            return true;
        }
        return this.euy.indexOf(n) != -1;
    }

    public List<Integer> aNr() {
        return this.eux;
    }

    public List<Integer> aNs() {
        return this.euy;
    }

    public static void a(cfv cfv2, dxr dxr2, ldv ldv2) {
        dxy dxy2 = (dxy)dxr2.h(35587, ldv2, lcr.qEG);
        dxy2.Da(cfv2.ordinal());
        dxr2.E(dxy2);
    }
}

