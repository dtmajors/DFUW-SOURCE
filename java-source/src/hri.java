/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class hri
extends hrd<String[], String> {
    private final List<String[]> lah = new ArrayList<String[]>();
    private final hro jIi;

    public hri(int n) {
        this(n, new hro());
    }

    private hri(int n, hro hro2) {
        super(n, hro2);
        this.jIi = hro2;
    }

    public final void clear() {
        this.lah.clear();
        this.cwF();
        this.cwG();
    }

    public final void K(String[] stringArray) {
        assert (stringArray.length == this.p(ldb.reo).getSize()) : stringArray.length;
        this.lah.add(stringArray);
        this.cwF();
        this.cwG();
    }

    public final void b(int n, String[] stringArray) {
        assert (stringArray.length == this.p(ldb.reo).getSize()) : stringArray.length;
        assert (n >= 0) : n;
        assert (n <= this.lah.size()) : n;
        assert (false);
        this.lah.add(n, stringArray);
        this.cwF();
        this.cwG();
    }

    public final void Oa(int n) {
        assert (n >= 0) : n;
        assert (n < this.lah.size()) : n;
        this.lah.remove(n);
        this.cwF();
        this.cwG();
    }

    public final String[] Ob(int n) {
        assert (n >= 0) : n;
        assert (n < this.lah.size()) : n;
        return this.lah.get(n);
    }

    public String[] Oc(int n) {
        return this.lah.get(n);
    }

    public boolean c(int n, String[] stringArray) {
        assert (lda.by(stringArray[n]));
        return false;
    }

    public String b(String[] stringArray, int n) {
        return stringArray[n];
    }

    private void cwF() {
        this.jIi.Oe(this.lah.size());
    }

    private void cwG() {
        this.kMt.enp();
    }

    @Override
    public /* synthetic */ boolean e(int n, Object object) {
        return this.c(n, (String[])object);
    }

    @Override
    public /* synthetic */ Object a(Object object, int n) {
        return this.b((String[])object, n);
    }

    @Override
    public /* synthetic */ Object LQ(int n) {
        return this.Oc(n);
    }
}

