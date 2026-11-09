/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class ave
extends aul {
    private static final int cjM = 0;
    private static final int cdu = 1;
    private static final egg[] cjN = new egg[]{new egg("LSOResourceName", egg.a.ipq, false, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    private boolean Initialized;

    public ave() {
        super(new amd(ave.class, aul.cdc, "ChatProxyLocalStorageObject", bui, null));
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "lso_create", lcy.qRr, cjN);
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
                    lfn.b(5, "SFChatProxyForLocalStorageObject", "onChatCommand() Unknown resourcetype: " + string2);
                    return;
                }
                fpp fpp2 = (fpp)this.MessageDelegator.h(25857, this.getGUID(), lcr.qBL);
                fpp2.Position = new ljq(-10.0f, 0.5f, 9.0f);
                fpp2.Rotation = new lgl();
                fpp2.ResourceType = n2;
                fpp2.ikP = false;
                this.MessageDelegator.F(fpp2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }
}

