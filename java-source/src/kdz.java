/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class kdz {
    public static final int Fa = 1;
    public static final int piu = 2;
    private String eH = "n/a";
    private int piv = 0;
    private int piw;
    private int aDw = this.piw = 0;
    private lju paq = null;
    private Map<Integer, List<kdx>> pix = lcn.emw();
    private Map<Integer, List<Integer>> piy = lcn.emw();

    public void setVersion(int n, int n2) {
        this.paq = new lju(n, n2);
    }

    public int getVersion() {
        if (this.paq != null) {
            return this.paq.getVersion();
        }
        return -1;
    }

    public void setName(String string) {
        this.eH = string;
    }

    public String getName() {
        return this.eH;
    }

    public void Wx(int n) {
        this.piv = n;
    }

    public int dVB() {
        return this.piv;
    }

    public void a(int n, kdx kdx2) {
        if (this.pix.containsKey(new Integer(n))) {
            List<kdx> list = this.pix.get(new Integer(n));
            list.add(kdx2);
        } else {
            ArrayList<kdx> arrayList = lcn.emv();
            arrayList.add(kdx2);
            this.pix.put(new Integer(n), arrayList);
        }
    }

    public Map<Integer, List<kdx>> dVC() {
        return this.pix;
    }

    public void fJ(int n, int n2) {
        if (this.piy.containsKey(new Integer(n))) {
            List<Integer> list = this.piy.get(new Integer(n));
            list.add(new Integer(n2));
        } else {
            ArrayList<Integer> arrayList = lcn.emv();
            arrayList.add(new Integer(n2));
            this.piy.put(new Integer(n), arrayList);
        }
    }

    public Map<Integer, List<Integer>> dVD() {
        return this.piy;
    }

    public void setLevel(int n) {
        this.aDw = n;
    }

    public int getLevel() {
        return this.aDw;
    }
}

