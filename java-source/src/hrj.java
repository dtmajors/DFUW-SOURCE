/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class hrj
extends hrd<String, String> {
    private final List<String> lah = new ArrayList<String>();
    private final hro jIi;

    public hrj() {
        this(new hro());
    }

    private hrj(hro hro2) {
        super(1, hro2);
        this.jIi = hro2;
    }

    public final void clear() {
        this.lah.clear();
        this.cwF();
        this.cwG();
    }

    public final void nd(String string) {
        this.lah.add(string);
        this.cwF();
        this.cwG();
    }

    public final void B(int n, String string) {
        assert (n >= 0) : n;
        assert (n <= this.lah.size()) : n;
        assert (false);
        this.lah.add(n, string);
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

    public final String NJ(int n) {
        assert (n >= 0) : n;
        assert (n < this.lah.size()) : n;
        return this.lah.get(n);
    }

    public String Od(int n) {
        return this.lah.get(n);
    }

    public boolean C(int n, String string) {
        assert (lda.by(string, new Integer(n)));
        return false;
    }

    public String v(String string, int n) {
        assert (n == 0);
        return string;
    }

    private void cwF() {
        this.jIi.Oe(this.lah.size());
    }

    private void cwG() {
        this.kMt.enp();
    }

    @Override
    public /* synthetic */ boolean e(int n, Object object) {
        return this.C(n, (String)object);
    }

    @Override
    public /* synthetic */ Object a(Object object, int n) {
        return this.v((String)object, n);
    }

    @Override
    public /* synthetic */ Object LQ(int n) {
        return this.Od(n);
    }
}

