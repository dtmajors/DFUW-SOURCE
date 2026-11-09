/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class amm {
    public static final float bys = 0.25f;
    private String byt = null;
    private int byu = -1;
    private String byv = null;
    private List<Integer> byw = lcn.emv();
    private List<Integer> byx = lcn.emv();
    private List<aml> byy = lcn.emv();
    private int byz = -1;
    private int byA = -1;
    private int byB = -1;
    private int byC = -1;
    private int byD = -1;
    private int byE = -1;
    private int byF = -1;
    private int byG = -1;
    private int byH = -1;
    private int byI = -1;
    private boolean byJ;
    private Map<Integer, a> byK;

    public void do(String string) {
        int n = this.f(string, true);
        this.byx.add(n);
    }

    public void dp(String string) {
        int n = this.f(string, true);
        this.byw.add(n);
    }

    public void a(aml aml2) {
        this.byy.add(aml2);
    }

    public void b(aml aml2) {
        this.byy.remove(aml2);
    }

    public String Gx() {
        String string = lea.enW().getName(this.byu);
        return string;
    }

    public int Gy() {
        return this.byu;
    }

    public void gP(int n) {
        this.byu = n;
    }

    public String Gz() {
        return this.byt;
    }

    public void dq(String string) {
        this.byt = string;
    }

    private int dr(String string) {
        return this.f(string, true);
    }

    private int f(String string, boolean bl) {
        int n;
        if (string == null || string.equals("")) {
            if (!bl) {
                return -1;
            }
            lfn.b(5, "SFStructureInfo", "getSpecialEffectType() Unknown EffectName: " + string);
            assert (false);
        }
        if ((n = del.dr(string)) <= 0 && bl) {
            lfn.b(5, "SFStructureInfo", "getSpecialEffectType() Unknown Effect: " + string);
            assert (false);
        }
        return n;
    }

    public boolean GA() {
        return this.byJ;
    }

    public void be(boolean bl) {
        this.byJ = bl;
    }

    public List<Integer> GB() {
        return this.byw;
    }

    public void R(List<Integer> list) {
        this.byw = list;
    }

    public int GC() {
        return this.byE;
    }

    public void gQ(int n) {
        this.byE = n;
    }

    public int GD() {
        return this.byD;
    }

    public void gR(int n) {
        this.byD = n;
    }

    public int GE() {
        return this.byA;
    }

    public void gS(int n) {
        this.byA = n;
    }

    public int GF() {
        return this.byz;
    }

    public void gT(int n) {
        this.byz = n;
    }

    public List<aml> GG() {
        return this.byy;
    }

    public aml gU(int n) {
        for (aml aml2 : this.byy) {
            if (aml2.BV() != n) continue;
            return aml2;
        }
        return null;
    }

    public int GH() {
        return this.byC;
    }

    public void gV(int n) {
        this.byC = n;
    }

    public int GI() {
        return this.byB;
    }

    public void gW(int n) {
        this.byB = n;
    }

    public int GJ() {
        return this.byF;
    }

    public void gX(int n) {
        this.byF = n;
    }

    public int GK() {
        return this.byG;
    }

    public void gY(int n) {
        this.byG = n;
    }

    public int GL() {
        return this.byH;
    }

    public void gZ(int n) {
        this.byH = n;
    }

    public int GM() {
        return this.byI;
    }

    public void ha(int n) {
        this.byI = n;
    }

    public final String GN() {
        return this.byv;
    }

    public final void ds(String string) {
        this.byv = string;
    }

    public void a(int n, eh eh2) {
        if (this.byK == null) {
            this.byK = lcn.emw();
        }
        this.byK.put(n, new a(this, n, eh2));
    }

    public Map<Integer, a> GO() {
        return this.byK;
    }

    public eh hb(int n) {
        a a2 = this.byK.get(n);
        return a2 != null ? this.byK.get(n).byL : null;
    }
}

