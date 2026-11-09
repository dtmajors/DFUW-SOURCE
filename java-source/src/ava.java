/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class ava
extends aul {
    private static final int ciM = 0;
    private static final int ciN = 1;
    private static final int ciO = 2;
    protected static final int cdu = 3;
    private static final int ciP = 0;
    private static final int ciQ = 1;
    protected static final int cdY = 2;
    private static final cqi[] bui = new cqi[]{new cqj(hc.aaQ, 0, "yield", false, new lch(false), new ljg("whether yielding should be enabled or disabled")), new cqo(hc.aaQ, 1, "yield_millisecs", false, new lei(20), 0, 2000, new ljg("number of milliseconds to yield by on each tick"))};
    public static final amd ciR = new amd(ava.class, aul.cdc, "ChatProxyForGui", bui, null);
    private boolean Initialized;
    private final double ciS = 60.0;
    private double lW = 0.0;

    public ava() {
        super(ciR);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.cc(true);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            default: 
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            case 0: {
                this.Wx();
                return;
            }
            case 1: {
                this.Wx();
                return;
            }
        }
        super.b(n, object);
    }

    private void Wx() {
        boolean bl = ((lch)this.gG(0)).booleanValue();
        int n = ((lei)this.gG(1)).intValue();
        this.cdh.rnh.m(ffv.a(this.cdh.rng, this.GUID, lcr.acL, bl, n));
    }

    private void a(ffu.a a2) {
        this.cdh.rnh.m(ffu.a(this.cdh.rng, this.GUID, lcr.acL, a2));
    }

    private void Wy() {
        this.cdh.rnh.m(ffp.a(this.cdh.rng, this.GUID, lcr.acL));
    }

    private void cc(boolean bl) {
        if (bl) {
            this.a(hc.aaz, 0, "gui_persist_save", lcy.qTb, cdd);
            this.a(hc.aaz, 1, "gui_persist_load", lcy.qTc, cdd);
            this.a(hc.aaz, 2, "gui_clear_chat_history", lcy.qTe, cdd);
        } else {
            this.We();
        }
    }
}

