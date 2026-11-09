/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.List;

public class hgs
extends hgr {
    public final hdv kaW;
    private boolean Initialized;

    public hgs(hdm hdm2, String string, lgg lgg2, lhf lhf2, hdv hdv2, boolean bl, boolean bl2) {
        super(hdm2, string, lgg2, lhf2, hdv2.atw(), bl ? hdv2.cel() : hdv2.awT(), bl2);
        this.kaW = hdv2;
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
    protected boolean co(int n, int n2) {
        assert (this.Initialized);
        if (!super.co(n, n2)) {
            return false;
        }
        return !this.kaW.ck(n, n2);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    protected void aV(List<hnt> list) {
        this.cbO().a(null, this.kaW, list);
        super.aV(list);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

