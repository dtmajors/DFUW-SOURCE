/*
 * Decompiled with CFR.
 */
public class aun
extends aul {
    private boolean Initialized = false;
    private ldv Tr = null;

    public aun() {
        super(new amd(aun.class, aul.cdc, "ChatProxyForAlignment", new cqi[0], null));
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

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.Tr == null) {
            return;
        }
        a a2 = a.values()[n];
        switch (a2) {
            case cdG: {
                this.k(objectArray);
                break;
            }
            case cdH: {
                this.l(objectArray);
                break;
            }
            default: {
                super.b(n, objectArray, string);
            }
        }
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, a.cdG, new ljk("prints the value of a player's alignment"), new egg[]{new egg("player_name", egg.a.ipq, true, new ljk("the name of the player to print the alignment value of"))});
        this.a(hc.aaP, a.cdH, new ljk("sets the value of a player's alignment"), new egg[]{new egg("alignment_value", egg.a.ipn, false, new ljk("the new value of the player's alignment")), new egg("player_name", egg.a.ipq, true, new ljk("the name of the player to set the alignment value of"))});
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void a(egk egk2) {
        if (egk2.Tr == null) {
            return;
        }
        this.Tr = egk2.Tr;
    }

    private void k(Object[] objectArray) {
        String string = null;
        if (objectArray.length > 0) {
            string = (String)objectArray[0];
        }
        dzo dzo2 = (dzo)this.MessageDelegator.h(23301, this.GUID, this.Tr);
        dzo2.dVm = 1;
        dzo2.YL = string;
        this.d(this.Tr, dzo2);
    }

    private void l(Object[] objectArray) {
        int n = ((lei)objectArray[0]).intValue();
        String string = null;
        if (objectArray.length > 1) {
            string = (String)objectArray[1];
        }
        dzp dzp2 = (dzp)this.MessageDelegator.h(23302, this.GUID, this.Tr);
        dzp2.dVm = 1;
        dzp2.ijB = n;
        dzp2.YL = string;
        this.d(this.Tr, dzp2);
    }
}

