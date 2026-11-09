/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bsa {
    private ldv dAu = null;
    private int ResourceType = 0;
    private int asi = 0;
    private brp[] dJg = null;
    private lef[] dJh = null;

    public ldv avU() {
        return this.dAu;
    }

    public void js(ldv ldv2) {
        this.dAu = ldv2;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    public brp[] avX() {
        return this.dJg;
    }

    public lef[] awJ() {
        return this.dJh;
    }

    public void e(brp brp2) {
        if (brp2 == null) {
            return;
        }
        assert (brp2.GUID != null);
        assert (brp2.ResourceType > 0);
        assert (brp2.asi > 0);
        assert (!this.jt(brp2.GUID));
        if (this.dJg == null) {
            this.dJg = new brp[]{brp2};
            return;
        }
        brp[] brpArray = new brp[this.dJg.length + 1];
        System.arraycopy(this.dJg, 0, brpArray, 0, this.dJg.length);
        brpArray[this.dJg.length] = brp2;
        this.dJg = brpArray;
    }

    public void a(lef lef2) {
        if (lef2 == null) {
            return;
        }
        assert (!this.b(lef2));
        if (this.dJh == null) {
            this.dJh = new lef[]{lef2};
            return;
        }
        lef[] lefArray = new lef[this.dJh.length + 1];
        System.arraycopy(this.dJh, 0, lefArray, 0, this.dJh.length);
        lefArray[this.dJh.length] = lef2;
        this.dJh = lefArray;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        assert (this.ResourceType > 0);
        assert (this.asi > 0);
        assert (this.dJg != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFResourceQueryInfo: InventoryGUID=");
        stringBuilder.append(this.dAu);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        stringBuilder.append(" ItemInfos=[");
        int n = this.dJg.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.dJg[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private boolean jt(ldv ldv2) {
        if (this.dJg == null) {
            return false;
        }
        int n = this.dJg.length;
        for (int i = 0; i < n; ++i) {
            if (!this.dJg[i].GUID.equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    private boolean b(lef lef2) {
        if (this.dJh == null) {
            return false;
        }
        int n = this.dJh.length;
        for (int i = 0; i < n; ++i) {
            if (!this.dJh[i].equals(lef2)) continue;
            return true;
        }
        return false;
    }
}

