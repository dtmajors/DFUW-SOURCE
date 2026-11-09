/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
public class aur
extends aul {
    private static final int ceH = 0;
    private static final int ceI = 1;
    private static final int ceJ = 2;
    private static final int ceK = 3;
    private static final int ceL = 4;
    private static final int cdu = 5;
    private static final int cdX = 0;
    private static final int cdY = 0;
    private static final cqi[] bui = new cqi[0];
    private boolean Initialized = false;
    private ldv Tr = null;
    private ldv cdD = null;

    public aur() {
        super(new amd(aur.class, aul.cdc, "ChatProxyCharacter", bui, null));
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaQ, 0, "char_enable_sprint_hack", lcy.qRr, new egg[0]);
        this.a(hc.aaQ, 1, "char_disable_sprint_hack", lcy.qRr, new egg[0]);
        this.a(hc.aaP, 2, "adm_player_points_print", new ljk("Displays the player-points counts for a player"), new egg[]{new egg("player_name", egg.a.ipq, true, new ljk("The name of the player to display the player-points counts for"))});
        this.a(hc.aaP, 3, "adm_player_points_alter", new ljk("Alters the player-points value for a player"), new egg[]{new egg("points_delta", egg.a.ipn, false, new ljk("The amount to alter the player's player-points by")), new egg("player_name", egg.a.ipq, true, new ljk("The name of the player to alter the player-points value for"))});
        this.a(hc.aaP, 4, "adm_speed_modifier", new ljk("Alters the speed modifier of a player"), new egg[]{new egg("modifier", egg.a.ipp, false, new ljk("The multiplier for the speed."))});
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(egk egk2) {
        if (egk2.Tr == null) {
            return;
        }
        this.Tr = egk2.Tr;
        this.cdD = egk2.cdD;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 0: {
                byx.ecX = true;
                break;
            }
            case 1: {
                byx.ecX = false;
                break;
            }
            case 2: {
                this.z(objectArray);
                break;
            }
            case 3: {
                this.A(objectArray);
                break;
            }
            case 4: {
                byx.ecY = objectArray.length > 0 ? ((ldq)objectArray[0]).floatValue() : byx.ecY;
                break;
            }
            default: {
                super.b(n, objectArray, string);
            }
        }
    }

    private void z(Object[] objectArray) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.cdD);
        ern2.ilu = 61;
        ern2.YL = objectArray != null && objectArray.length > 0 ? ((String)objectArray[0]).trim() : "";
        this.MessageDelegator.F(ern2);
    }

    private void A(Object[] objectArray) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.cdD);
        ern2.ilu = 62;
        ern2.YL = objectArray.length > 1 ? ((String)objectArray[1]).trim() : "";
        ern2.izG = ((lei)objectArray[0]).intValue();
        this.MessageDelegator.F(ern2);
    }
}

