/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Set;

public class asb {
    private static final int[] bTa = cug.vZ((int)cug.fhK);
    private static final int[] bTb = cug.vZ((int)cug.fhN);
    private final Set<asa> bBB = lcn.emx();
    private float bTc;
    private int bTd;
    private int Race;
    private float Radius;
    private a bTe;
    private float bTf = 0.0f;
    private float bTg = 1.0f;
    private String bTh = null;

    public void a(asa asa2) {
        this.bBB.add(asa2);
    }

    public int hP(int n) {
        if (lea.enW().isDescendant(n, cug.fgJ)) {
            int[] nArray;
            for (int n2 : nArray = this.SQ()) {
                if (!lea.enW().isDescendant(n, n2)) continue;
                return this.Race;
            }
            return n;
        }
        return cug.fgG;
    }

    public Set<asa> SL() {
        return this.bBB;
    }

    public float SM() {
        return this.bTc;
    }

    public String SN() {
        return lea.enW().getName(this.bTd);
    }

    public int SO() {
        return this.bTd;
    }

    public a SP() {
        return this.bTe;
    }

    public int cB() {
        return this.Race;
    }

    public float getRadius() {
        return this.Radius;
    }

    public boolean hf(int n) {
        return n != this.Race;
    }

    public void bN(float f2) {
        if ((double)f2 <= 0.0) {
            arw.ct.error("Global rate of fire cannot be less or equal to 0.0, it will be set to 1.0");
            this.bTc = 1.0f;
            return;
        }
        this.bTc = f2;
    }

    public void hQ(int n) {
        this.bTd = n;
    }

    public void a(a a2) {
        this.bTe = a2;
    }

    public void P(int n) {
        this.Race = n;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    private int[] SQ() {
        if (this.Race == cug.fhK || this.Race == cug.fhM || this.Race == cug.fhJ) {
            return bTa;
        }
        if (this.Race == cug.fhN || this.Race == cug.fhL || this.Race == cug.fhI) {
            return bTb;
        }
        assert (false) : "This tower has not a racial identity";
        return new int[0];
    }

    public final float SR() {
        return this.bTf;
    }

    public final void bO(float f2) {
        this.bTf = f2;
    }

    public final float SS() {
        return this.bTg;
    }

    public final void bP(float f2) {
        this.bTg = f2;
    }

    public final String ST() {
        return this.bTh;
    }

    public final void dS(String string) {
        this.bTh = string;
    }
}

