/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
import java.util.Map;

public class bcp {
    private ldv ade = null;
    private String add = null;
    private ldv[] cXa = null;
    private int[] cXb = null;

    public ldv iG() {
        return this.ade;
    }

    public String iV() {
        return this.add;
    }

    public bcr gL(ldv ldv2) {
        for (int i = 0; i < this.cXa.length; ++i) {
            if (!this.cXa[i].equals(ldv2)) continue;
            return bcr.getValueByOrdinal(this.cXb[i]);
        }
        return bcr.cXg;
    }

    public Map<ldv, bcr> alh() {
        Map<ldv, bcr> map = lcn.emw();
        for (int i = 0; i < this.cXa.length; ++i) {
            map.put(this.cXa[i], bcr.getValueByOrdinal(this.cXb[i]));
        }
        return map;
    }

    @Deprecated
    public bcp() {
    }

    public bcp(ayd ayd2) {
        int n;
        this.ade = ayd2.getGUID();
        this.add = ayd2.iV();
        bcq[] bcqArray = ayd2.aac();
        int n2 = 0;
        for (n = 0; n < bcqArray.length; ++n) {
            if (bcqArray[n].ali() == bcr.cXg) continue;
            ++n2;
        }
        this.cXa = new ldv[n2];
        this.cXb = new int[n2];
        n2 = 0;
        for (n = 0; n < bcqArray.length; ++n) {
            if (bcqArray[n].ali() == bcr.cXg) continue;
            this.cXa[n2] = bcqArray[n].iG();
            this.cXb[n2] = bcqArray[n].ali().ordinal();
            ++n2;
        }
    }

    public bcp(ayq ayq2) {
        this.ade = ayq2.iG();
        this.add = ayq2.iV();
        this.cXa = new ldv[0];
        this.cXb = new int[0];
    }

    public void eT(String string) {
        this.add = string;
    }

    private boolean gM(ldv ldv2) {
        for (int i = 0; i < this.cXa.length; ++i) {
            if (!this.cXa[i].equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public void a(ldv ldv2, bcr bcr2) {
        if (ldv2 == null || bcr2 == null) {
            return;
        }
        if (bcr2 == bcr.cXg) {
            this.gN(ldv2);
            return;
        }
        bcr bcr3 = this.gL(ldv2);
        if (bcr3 != bcr.cXg) {
            if (bcr3 == bcr2) {
                return;
            }
            for (int i = 0; i < this.cXa.length; ++i) {
                if (!this.cXa[i].equals(ldv2)) continue;
                this.cXb[i] = bcr2.ordinal();
                break;
            }
            return;
        }
        ldv[] ldvArray = new ldv[this.cXa.length + 1];
        int[] nArray = new int[this.cXb.length + 1];
        for (int i = 0; i < this.cXa.length; ++i) {
            ldvArray[i] = this.cXa[i];
            nArray[i] = this.cXb[i];
        }
        ldvArray[ldvArray.length - 1] = ldv2;
        nArray[nArray.length - 1] = bcr2.ordinal();
        this.cXa = ldvArray;
        this.cXb = nArray;
    }

    private void gN(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        if (!this.gM(ldv2)) {
            return;
        }
        ldv[] ldvArray = new ldv[this.cXa.length - 1];
        int[] nArray = new int[this.cXb.length - 1];
        int n = 0;
        for (int i = 0; i < this.cXa.length; ++i) {
            if (this.cXa[i].equals(ldv2)) continue;
            ldvArray[n] = this.cXa[i];
            nArray[n] = this.cXb[i];
            ++n;
        }
        this.cXa = ldvArray;
        this.cXb = nArray;
    }
}

