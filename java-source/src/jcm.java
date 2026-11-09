/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class jcm {
    private int aDf = -1;
    private int ID = -1;
    private loz mRs = null;
    private boolean mRt = false;
    private List<jcn> mRu = null;
    private double mRv = 0.0;
    private acd mRw = null;
    public final jll<jcm> mRa = new jll();

    public int qS() {
        return this.aDf;
    }

    public int getID() {
        return this.ID;
    }

    public loz yp() {
        return this.mRs;
    }

    public List<jcn> dxE() {
        return this.mRu != null ? Collections.unmodifiableList(this.mRu) : null;
    }

    public boolean xX() {
        return this.mRt;
    }

    public double dxF() {
        return this.mRv;
    }

    public boolean dxG() {
        if (this.mRu == null) {
            return false;
        }
        for (jcn jcn2 : this.mRu) {
            if (!jcn2.dxO()) continue;
            return true;
        }
        return false;
    }

    public List<jcn> dxH() {
        if (this.mRu == null) {
            return null;
        }
        LinkedList<jcn> linkedList = lcn.emA();
        for (jcn jcn2 : this.mRu) {
            if (!jcn2.dxO()) continue;
            linkedList.add(jcn2);
        }
        return linkedList;
    }

    public boolean dxI() {
        if (this.mRu == null) {
            return false;
        }
        for (jcn jcn2 : this.mRu) {
            if (jcn2 == null || !jcn2.dxO() || !jcn2.dxQ()) continue;
            return true;
        }
        return false;
    }

    public acd dxJ() {
        return this.mRw;
    }

    public jch dxK() {
        return (jch)jcc.dwT().TO(this.qS());
    }

    public int dxL() {
        if (this.mRu == null) {
            return 0;
        }
        int n = 0;
        for (jcn jcn2 : this.mRu) {
            if (!jcn2.isComplete()) continue;
            ++n;
        }
        return n;
    }

    public int dxM() {
        return this.mRu != null ? this.mRu.size() : 0;
    }

    public jcm(acd acd2, int n, int n2, loz loz2) {
        this(acd2, n, n2, loz2, false, null);
    }

    public jcm(acd acd2, int n, int n2, loz loz2, boolean bl, List<jcn> list) {
        this(acd2, n, n2, loz2, bl, list, 0.0);
    }

    public jcm(acd acd2, int n, int n2, loz loz2, boolean bl, List<jcn> list, double d2) {
        this.aDf = n;
        this.ID = n2;
        this.mRs = loz2;
        this.mRt = bl;
        this.mRu = list;
        this.mRv = d2;
        this.mRw = acd2;
        if (list != null) {
            for (jcn jcn2 : list) {
                jcn2.mRB = this;
            }
        }
    }

    public void b(jcf jcf2) {
        this.mRa.V(this);
        jcc.dwT().mQC.k(this, jcf2);
        jch jch2 = this.dxK();
        if (jch2 != null) {
            jch2.b(this);
            if (jcf2 != null) {
                jch2.a(jcf2);
            }
        }
    }
}

