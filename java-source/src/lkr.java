/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.util.List;

public class lkr
implements Cloneable {
    public static final int rqX = 0;
    public static final int rqY = 1;
    private int dRF;
    private int rqZ;
    private boolean eMi = true;
    private float rra = 0.0f;
    private boolean rrb;
    private boolean rrc = false;
    private String gsj;
    private String rrd = "";
    private String rre = "";
    private int rrf = 0;
    private float iki = 1.0f;
    private List<String> rrg;
    private int[] rrh;
    private boolean rri = false;
    private float rrj = 0.0f;
    private boolean rrk = false;
    private boolean rrl = false;
    private boolean eie = false;
    private List<lkp> rrm;

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        assert (object instanceof lkr) : "Error Other object is " + object.getClass().getSimpleName();
        lkr lkr2 = (lkr)object;
        if (this.eMi != lkr2.eMi) {
            return false;
        }
        if (this.dRF != lkr2.dRF) {
            return false;
        }
        if (this.rqZ != lkr2.rqZ) {
            return false;
        }
        if (this.rra != lkr2.rra) {
            return false;
        }
        if (this.rrb != lkr2.rrb) {
            return false;
        }
        if (this.rrc != lkr2.rrc) {
            return false;
        }
        if (!this.gsj.equals(lkr2.gsj)) {
            return false;
        }
        if (this.rrf != lkr2.rrf) {
            return false;
        }
        if (this.iki != lkr2.iki) {
            return false;
        }
        if (this.rri != lkr2.rri) {
            return false;
        }
        if (this.rrk != lkr2.rrk) {
            return false;
        }
        return this.rrd.equals(lkr2.rrd);
    }

    public int etO() {
        return this.dRF;
    }

    public void adf(int n) {
        this.dRF = n;
    }

    public String toString() {
        String string = lkv.adr((int)this.dRF);
        if (string == null) {
            string = "none";
        }
        string = string.trim();
        int n = 50;
        try {
            string = String.format("%1$-" + n + "s", string);
        }
        catch (Exception exception) {
            lfn.b(0, this.getClass().getSimpleName(), "toString() " + exception.getMessage());
        }
        String string2 = string + ", ID = " + this.dRF + ", PurePartial [" + this.rrc + "]";
        return string2;
    }

    public boolean isLooping() {
        return this.eMi;
    }

    public void setLooping(boolean bl) {
        this.eMi = bl;
    }

    public boolean isPartial() {
        return this.rrc;
    }

    public void yC(boolean bl) {
        this.rrc = bl;
    }

    public float etP() {
        return this.rra;
    }

    public void nE(float f) {
        this.rra = f;
    }

    public final Object clone() {
        lkr lkr2 = (lkr)super.clone();
        return lkr2;
    }

    public int etQ() {
        return this.rqZ;
    }

    public void adg(int n) {
        this.rqZ = n;
    }

    public boolean etR() {
        return this.rrb;
    }

    public void yD(boolean bl) {
        this.rrb = bl;
    }

    public List<String> etS() {
        return this.rrg;
    }

    public void ca(List<String> list) {
        this.rrg = list;
    }

    public String getSetName() {
        return this.gsj;
    }

    public void setSetName(String string) {
        this.gsj = string;
    }

    public String etT() {
        return this.rrd;
    }

    public void AD(String string) {
        this.rrd = string;
    }

    public void AE(String string) {
        this.rre = string;
    }

    public String etU() {
        return this.rre;
    }

    public int etV() {
        return this.rrf;
    }

    public void adh(int n) {
        this.rrf = n;
    }

    public float bEX() {
        return this.iki;
    }

    public void iF(float f) {
        this.iki = f;
    }

    public int[] etW() {
        return this.rrh;
    }

    public void aX(int[] nArray) {
        this.rrh = nArray;
    }

    public float etX() {
        return this.rrj;
    }

    public void nF(float f) {
        this.rrj = f;
    }

    public boolean etY() {
        return this.rri;
    }

    public void yE(boolean bl) {
        this.rri = bl;
    }

    public List<lkp> etZ() {
        return this.rrm;
    }

    public void c(lkp lkp2) {
        if (this.rrm == null) {
            this.rrm = lcn.abH(2);
        }
        this.rrm.add(lkp2);
    }

    public void cb(List<lkp> list) {
        this.rrm = list;
    }

    public boolean eua() {
        return this.rrk;
    }

    public void yF(boolean bl) {
        this.rrk = bl;
    }

    public boolean eub() {
        return this.rrl;
    }

    public void yG(boolean bl) {
        this.rrl = bl;
    }

    public boolean euc() {
        return this.eie;
    }

    public void yH(boolean bl) {
        this.eie = bl;
    }
}

