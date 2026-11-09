/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class lmw
extends lob {
    public lmw(a a2, List<lmv> list) {
        super(a2, list);
    }

    public final a eve() {
        return (a)this.ewy();
    }

    public final lmv AM(String string) {
        int n = this.eve().AN(string);
        if (n == -1) {
            return null;
        }
        return this.ewx().get(n);
    }

    @Override
    protected String adC(int n) {
        return this.eve().evf().get((int)n).Name;
    }

    @Override
    protected lmu adD(int n) {
        return this.eve().evf().get((int)n).kza;
    }
}

