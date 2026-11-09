/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class auy
extends aul {
    private static final int cgh = 0;
    private static final int cdu = 1;
    private static final egg[] cgi = new egg[]{new egg("Create Sea Fortress", egg.a.ipq, false, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    public static final amd cgj = new amd(auy.class, aul.cdc, "ChatProxyFortressSystem", bui, null);
    private boolean Initialized;

    public auy() {
        super(cgj);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "fortress_sea_create", lcy.qRr, cgi);
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
                fce fce2 = (fce)this.MessageDelegator.h(24833, this.getGUID(), lcr.qBG);
                fce2.iJd = string2 + ".xml";
                this.MessageDelegator.F(fce2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24834: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

