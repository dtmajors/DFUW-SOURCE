/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
public class avl
extends aul {
    private static final int clf = 0;
    private static final int clg = 1;
    private static final int cdu = 2;
    private static final egg[] clh = new egg[]{new egg("Enable", egg.a.ipm, false, lcy.qRr)};
    private static final egg[] cli = new egg[]{new egg("Enable", egg.a.ipm, false, lcy.qRr)};
    private static final int cdX = 0;
    private static final int cdY = 0;
    private static final cqi[] bui = new cqi[0];
    private boolean Initialized;
    public static final amd clj = new amd(avh.class, aul.cdc, "ChatProxyRenderReport", bui, null);

    public avl() {
        super(clj);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "render_report_enable", lcy.qRr, clh);
        this.a(hc.aaP, 1, "level_report_enable", lcy.qRr, cli);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 0: {
                boolean bl = ((lch)objectArray[0]).booleanValue();
                assert (cqw.aZE() != null);
                cqw.aZE().gH(bl);
                return;
            }
            case 1: {
                boolean bl = ((lch)objectArray[0]).booleanValue();
                assert (cqw.aZE() != null);
                cqw.aZE().gI(bl);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            default: 
        }
        super.b(n, object);
    }
}

