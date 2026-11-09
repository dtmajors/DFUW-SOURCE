/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class avq
extends aul {
    private static final int cqb = 0;
    private static final int cdu = 1;
    private static final egg[] cqc = new egg[]{new egg("CreateSlotMachine", egg.a.ipq, false, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    public static final amd cqd = new amd(avq.class, aul.cdc, "ChatProxySlotMachine", bui, null);
    private boolean Initialized;

    public avq() {
        super(cqd);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "slotmachine_create", lcy.qRr, cqc);
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
                int n2 = lea.enW().getType(string2);
                if (n2 <= 0) {
                    lfn.b(5, "SFChatProxyForSlotMachines", "onChatCommand() Unknown resourcetype: " + string2);
                    return;
                }
                gkh gkh2 = (gkh)this.MessageDelegator.h(26113, this.getGUID(), lcr.qBM);
                gkh2.Position = new ljq(-10.0f, 0.5f, 9.0f);
                gkh2.Rotation = new lgl();
                gkh2.ResourceType = n2;
                gkh2.ikP = false;
                this.MessageDelegator.F(gkh2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }
}

