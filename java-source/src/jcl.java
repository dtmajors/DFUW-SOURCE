/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jcl {
    private int aDf = -1;
    private int di = -1;
    private List<jck> bhg = null;
    private List<jck> mRr = null;

    public int qS() {
        return this.aDf;
    }

    public int ib() {
        return this.di;
    }

    public boolean dxC() {
        return this.bhg != null && !this.bhg.isEmpty();
    }

    public List<jck> Al() {
        return this.bhg;
    }

    public boolean dxD() {
        return this.mRr != null && !this.mRr.isEmpty();
    }

    public List<jck> we() {
        return this.mRr;
    }

    private jcl(int n, int n2) {
        this.aDf = n;
        this.di = n2;
    }

    public jcl(int n, int n2, List<jck> list, List<jck> list2) {
        this(n, n2);
        this.bhg = list;
        this.mRr = list2;
    }
}

