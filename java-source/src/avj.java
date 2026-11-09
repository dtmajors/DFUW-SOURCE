/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class avj
extends aul {
    private static final int ckO = 0;
    private static final int cdu = 1;
    private static final egg[] ckP = new egg[]{new egg("CreateVillage", egg.a.ipq, false, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    public static final amd ckQ = new amd(avj.class, aul.cdc, "ChatProxyPlayerVillage", bui, null);
    private boolean Initialized;

    public avj() {
        super(ckQ);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "village_create", lcy.qRr, ckP);
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
                gbi gbi2 = (gbi)this.MessageDelegator.h(24321, this.getGUID(), lcr.qBE);
                gbi2.eUC = string2 + ".xml";
                this.MessageDelegator.F(gbi2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }
}

