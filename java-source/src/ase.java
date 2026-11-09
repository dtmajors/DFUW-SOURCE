/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class ase {
    private boolean[] bTx = new boolean[ldz.a.Values.size()];
    private boolean bTy;
    private int Qw;
    private boolean bTz;
    private boolean bTA;
    private boolean bTB;
    private arw.b bTC = arw.b.bSs;
    private float bTD = 30.0f;
    private Set<Integer> bTE;
    private String bTF;
    private boolean bTG;
    private a bTH = a.bTK;
    private arw.c bTI = arw.c.bSA;

    public ldz.a[] Te() {
        ArrayList<ldz.a> arrayList = lcn.emv();
        for (int i = 0; i < this.bTx.length; ++i) {
            if (this.bTx[i]) continue;
            arrayList.add(ldz.a.Values.get(i));
        }
        return arrayList.toArray(new ldz.a[arrayList.size()]);
    }

    public int getAlignment() {
        return this.Qw;
    }

    public arw.b Tf() {
        return this.bTC;
    }

    public float Tg() {
        return this.bTD;
    }

    public Set<Integer> Th() {
        return this.bTE;
    }

    public String Ti() {
        return this.bTF;
    }

    public a Tj() {
        return this.bTH;
    }

    public arw.c Tk() {
        return this.bTI;
    }

    public boolean a(ldz.a a2) {
        return !this.bTx[ldz.a.getOrdinal(a2)];
    }

    public boolean Jt() {
        return this.bTy;
    }

    public boolean Tl() {
        return this.bTA;
    }

    public boolean Tm() {
        return this.bTB;
    }

    public boolean Tn() {
        return this.bTz;
    }

    public boolean To() {
        return this.bTG;
    }

    public boolean isValid() {
        return this.bTE != null;
    }

    public void a(ldz.a[] aArray) {
        this.bTx = new boolean[ldz.a.Values.size()];
        Arrays.fill(this.bTx, true);
        for (ldz.a a2 : aArray) {
            if (a2 == null) continue;
            this.bTx[ldz.a.getOrdinal((ldz.a)a2)] = false;
        }
    }

    public void bP(boolean bl) {
        this.bTy = bl;
    }

    public void setAlignment(int n) {
        this.Qw = n;
    }

    public void bQ(boolean bl) {
        this.bTz = bl;
    }

    public void bR(boolean bl) {
        this.bTB = bl;
    }

    public void bS(boolean bl) {
        this.bTA = bl;
    }

    public void a(arw.b b2) {
        this.bTC = b2;
    }

    public void bS(float f2) {
        this.bTD = f2;
    }

    public void d(Set<Integer> set) {
        this.bTE = set;
    }

    public void dT(String string) {
        this.bTF = string;
    }

    public void bT(boolean bl) {
        this.bTG = bl;
    }

    public void a(a a2) {
        this.bTH = a2;
    }

    public void a(arw.c c2) {
        this.bTI = c2;
    }
}

