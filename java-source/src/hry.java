/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hry
extends hoy {
    private boolean Initialized;
    private final hsl laU;

    public hry(hsh hsh2, String string, lgg lgg2, lhf lhf2, ldv ldv2) {
        this(hsh2, string, lgg2, lhf2, new hsl(hsh2, ldv2));
    }

    private hry(hsh hsh2, String string, lgg lgg2, lhf lhf2, hsl hsl2) {
        super(hsh2, string, lgg2, lhf2, hsl2);
        this.laU = hsl2;
    }

    public final hsl cxb() {
        return (hsl)this.cqc();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void bd(List<lfg> list) {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void cce() {
        super.cce();
        this.cuz();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

