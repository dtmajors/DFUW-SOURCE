/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class heu
extends hes {
    private boolean Initialized;

    public heu(hdm hdm2, String string, lgg lgg2, lhf lhf2, lhf lhf3, lbn lbn2, boolean bl, lbn lbn3, lip lip2) {
        super(hdm2, string, lgg2, lhf2, new hnu.e(hdm2.jXk.jRr, lhf3), new hen.d(lip2), new hnu.d(lbn2), new hen.e(true), new hen.c(bl), new hen.b(lbn3));
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected hcx a(hde hde2) {
        hdm hdm2 = this.cbO();
        String string = null;
        this.cbO().jXk.getClass();
        return new hcz(hdm2, string, lgg.rlI, 396, (hdg)hde2);
    }

    @Override
    protected lip cga() {
        return lcy.qXW;
    }

    @Override
    protected hde cgb() {
        return this.cbO().jZL.ccL();
    }

    private void refresh() {
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

