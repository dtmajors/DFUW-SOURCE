/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Set;

public class bpp
extends bns {
    private Set<Integer> dAc = lcn.emx();

    public bpp() {
        super(true);
    }

    @Override
    protected void a(fky fky2) {
        if (fky2.dxt == null) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionRequest() PlayerInventoryGUID is null.");
            return;
        }
        if (fky2.cZn != 1 && fky2.cZn != 2) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionRequest() Wrong TransactionType provided: " + fky2.cZn);
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(fky2.aO().ib());
        if (bpm2 == null) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionRequest() Could not find an InteractingClient with NodeID=" + fky2.aO().ib());
            return;
        }
        if (this.dAc.contains(bpm2.RB)) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionRequest() Logic on node " + bpm2.RB + " already has a pending transaction.");
            this.iB(fky2.aO());
            return;
        }
        int n = fky2.gKW;
        int n2 = fky2.dJc;
        String string = lea.enW().getName(n);
        if (!cug.vF((int)n)) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionRequest() ResourceType '" + string + "' is not a startingweapon. Transaction failed.");
            return;
        }
        if (n2 < 0 || n2 > 3) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionRequest() Invalid slotnumber: " + n2 + ". Transaction failed.");
            return;
        }
        int n3 = lcr.abS((int)fky2.dxt.enw());
        fky2.dxt = lcr.ak((ldv)fky2.dxt, (int)n3);
        brt brt2 = (brt)cug.fxg.get(fky2.gKW);
        if (brt2 == null) {
            return;
        }
        float f2 = brt2.Bb();
        if (fky2.cZn == 1) {
            switch (n2) {
                case 2: {
                    f2 = 100.0f;
                    break;
                }
                case 3: {
                    f2 = 1000.0f;
                    break;
                }
                default: {
                    lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionRequest() Invalid SlotNumber provided: " + n2);
                    return;
                }
            }
        }
        assert ((double)f2 > 0.0);
        fky2.iPi = f2;
        this.dAc.add(bpm2.RB);
        fky2.sk(bpm2.RB);
        dnk dnk2 = ((bpv)this.dwJ).atU();
        dnk2.a(this.GUID, fky2);
    }

    @Override
    protected void a(fkz fkz2) {
        bpm bpm2;
        if (fkz2.aVk() == -1) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionResponse() MessageTag is invalid.");
            return;
        }
        Integer n = new Integer(fkz2.aVk());
        if (!this.dAc.contains(n)) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionResponse() Transaction with messagetag " + fkz2.aVk() + " was not found.");
            return;
        }
        this.dAc.remove(n);
        if (fkz2.iPj) {
            // empty if block
        }
        if ((bpm2 = ((bpv)this.dwJ).lN(fkz2.aVk())) == null) {
            lfn.b(5, "SFInteractionLogicChangeStartingWeaponsServer", "handleTransactionResponse() Could not find an InteractingClient with NodeID=" + fkz2.aVk());
            return;
        }
        fkz2.f(this.GUID);
        fkz2.on(lcr.ak((ldv)this.GUID, (int)bpm2.RB));
        this.MessageDelegator.F(fkz2);
    }

    private void iB(ldv ldv2) {
        assert (ldv2 != null);
        fkz fkz2 = (fkz)this.MessageDelegator.h(11782, this.GUID, ldv2);
        fkz2.iPj = false;
        fkz2.s(mdd.uFi.bD(new Object[0]));
        this.MessageDelegator.F(fkz2);
    }
}

