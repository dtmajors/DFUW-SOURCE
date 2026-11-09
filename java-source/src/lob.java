/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;

public abstract class lob
extends lmv {
    private final List<lmv> rGa;
    private final List<lmv> rGb;
    private final lbn rGc = new lbn(this){
        final /* synthetic */ lob rGe;
        {
            this.rGe = lob2;
        }

        public final void W() {
            if (lob.d(this.rGe) == 0) {
                this.rGe.cdX();
            }
        }
    };
    private int rGd;

    public lob(a a2, List<lmv> list) {
        super(a2);
        this.rGa = list;
        this.rGb = Collections.unmodifiableList(this.rGa);
        for (lmv lmv2 : this.rGa) {
            if (lmv2 == null) continue;
            this.a(true, lmv2);
        }
    }

    public final List<lmv> ewx() {
        return this.rGb;
    }

    public final a ewy() {
        return (a)this.evb();
    }

    public final boolean b(lob lob2) {
        if (!this.evb().b(lob2.evb())) {
            return false;
        }
        if (this.rGa.size() != lob2.rGa.size()) {
            return false;
        }
        for (int i = 0; i < this.rGa.size(); ++i) {
            if (lin.i(this.rGa.get(i), lob2.rGa.get(i))) continue;
            return false;
        }
        return true;
    }

    public final void c(lob lob2) {
        if (this.a(lob2)) {
            this.cdX();
        }
    }

    public final String adN(int n) {
        return this.adC(n);
    }

    public final lmu adO(int n) {
        return this.adD(n);
    }

    @Override
    protected final boolean e(lmv lmv2) {
        assert (lmv2 instanceof lob);
        return this.a((lob)lmv2);
    }

    @Override
    protected final boolean f(lmv lmv2) {
        if (lmv2 instanceof lob) {
            return this.b((lob)lmv2);
        }
        return false;
    }

    @Override
    protected final boolean d(lfu lfu2) {
        boolean bl = false;
        ++this.rGd;
        for (int i = 0; i < this.rGa.size(); ++i) {
            bl |= lfu2.a(this.adC(i), this.rGa.get(i));
        }
        --this.rGd;
        return bl;
    }

    @Override
    protected String dPh() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.rGa.size(); ++i) {
            lmv lmv2 = this.rGa.get(i);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            String string = this.adC(i);
            stringBuilder.append(string);
            stringBuilder.append("=");
            String string2 = lmv2 == null ? "null" : lmv2.dPf();
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    protected abstract String adC(int var1);

    protected abstract lmu adD(int var1);

    protected boolean a(lob lob2) {
        lmv lmv2;
        int n;
        boolean bl = false;
        ++this.rGd;
        int n2 = Math.min(this.rGa.size(), lob2.rGa.size());
        for (n = 0; n < n2; ++n) {
            lmv2 = lob2.rGa.get(n);
            bl |= this.b(n, lmv2);
        }
        while (n < this.rGa.size()) {
            bl = this.adP(n2);
            ++n;
        }
        while (n < lob2.rGa.size()) {
            lmv2 = lob2.rGa.get(n);
            bl = this.c(n, lmv2);
            ++n;
        }
        --this.rGd;
        return bl;
    }

    private boolean b(int n, lmv lmv2) {
        lmv lmv3 = this.rGa.get(n);
        if (lmv3 != null && lmv2 != null) {
            return lmv3.i(lmv2);
        }
        return this.d(n, lmv2);
    }

    protected final boolean c(int n, lmv lmv2) {
        this.rGa.add(n, lmv2);
        if (lmv2 != null) {
            this.a(true, lmv2);
        }
        return true;
    }

    protected final boolean adP(int n) {
        lmv lmv2 = this.rGa.get(n);
        if (lmv2 != null) {
            this.a(false, lmv2);
        }
        this.rGa.remove(n);
        return true;
    }

    protected final boolean d(int n, lmv lmv2) {
        lmv lmv3 = this.rGa.get(n);
        if (lmv3 != null) {
            this.a(false, lmv3);
        }
        this.rGa.set(n, lmv2);
        if (lmv2 != null) {
            this.a(true, lmv2);
        }
        return !lin.i(lmv3, lmv2);
    }

    protected final void a(boolean bl, lmv lmv2) {
        lmv2.cec().a(bl, this.rGc);
    }

    static /* synthetic */ int d(lob lob2) {
        return lob2.rGd;
    }
}

