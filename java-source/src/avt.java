/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class avt
extends aul {
    private static final int cqV = 0;
    private static final int cdu = 1;
    private static final egg[] cqW = new egg[]{new egg("Create Trade Route System", egg.a.ipq, false, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    public static final amd cqX = new amd(avt.class, aul.cdc, "ChatProxyTradeRouteSystem", bui, null);
    private boolean Initialized;

    public avt() {
        super(cqX);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "traderoute_system_create", lcy.qRr, cqW);
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
                assert (objectArray.length == 1) : objectArray.length;
                String string2 = (String)objectArray[0];
                gwp gwp2 = (gwp)this.MessageDelegator.h(25601, this.getGUID(), lcr.qBK);
                gwp2.gJx = string2 + ".xml";
                this.MessageDelegator.F(gwp2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25602: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

