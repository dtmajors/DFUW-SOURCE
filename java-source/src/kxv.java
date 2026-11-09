/*
 * Decompiled with CFR.
 */
import java.util.List;

public class kxv
implements Comparable {
    protected int bst = -1;
    private String qgR = "";
    private String jps = "";
    private List<kxy> qgS = lcn.abH(5);
    private List qgT = null;

    public int getFunctionType() {
        return this.bst;
    }

    public void fZ(int n) {
        this.bst = n;
    }

    public String ein() {
        return this.qgR;
    }

    public void xq(String string) {
        this.qgR = string;
    }

    public String bWM() {
        return this.jps;
    }

    public void lg(String string) {
        this.jps = string;
    }

    public void xr(String string) {
        this.qgR = this.qgR + string;
    }

    public void xs(String string) {
        this.jps = this.jps + string;
    }

    public void a(kxy kxy2) {
        assert (kxy2 != null);
        assert (kxy2.eiv() > 0);
        assert (kxy2.eiw() != null);
        assert (kxy2.eix() != null);
        this.qgS.add(kxy2);
    }

    public void b(kxy kxy2) {
        assert (kxy2 != null);
        assert (kxy2.eiv() > 0);
        assert (kxy2.eiw() != null);
        assert (kxy2.eix() != null);
        if (this.qgT == null) {
            this.qgT = lcn.abH(2);
        }
        this.qgT.add(kxy2);
    }

    public List<kxy> eio() {
        return this.qgS;
    }

    public List eip() {
        return this.qgT;
    }

    public String getFunctionName() {
        return null;
    }

    public int compareTo(Object object) {
        if (object instanceof kxv) {
            kxv kxv2 = (kxv)object;
            if (this.bst < kxv2.getFunctionType()) {
                return -1;
            }
            if (this.bst > kxv2.getFunctionType()) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public boolean equals(Object object) {
        if (object instanceof kxv) {
            kxv kxv2 = (kxv)object;
            return kxv2.getFunctionType() == this.bst;
        }
        return false;
    }

    public String toString() {
        return "SFFunctionCode: Function='" + this.getFunctionName() + "' " + this.qgR;
    }
}

