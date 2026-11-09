/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class lmz
extends lmw {
    public final Object rFi;

    public lmz(a a2, List<lmv> list, Object object) {
        super(a2, list);
        this.rFi = object;
    }

    public final a evv() {
        return (a)this.eve();
    }

    public final void notifyChanged() {
        super.cdX();
    }

    @Override
    protected String dPh() {
        return this.rFi.toString();
    }
}

