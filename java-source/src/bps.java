/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Set;

public class bps
extends bnu {
    private Set<Integer> dAc = lcn.emx();

    public bps() {
        super(true);
    }

    @Override
    protected void a(fky fky2) {
        if (fky2.dxt == null) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionRequest() PlayerInventoryGUID is null.");
            return;
        }
        if (fky2.aCK == null) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionRequest() ItemGUID is null.");
            return;
        }
        if (fky2.iPh <= 0) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionRequest() ItemQuantity is invalid.");
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(fky2.aO().ib());
        if (bpm2 == null) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionRequest() Could not find an InteractingClient with NodeID=" + fky2.aO().ib());
            return;
        }
        if (this.dAc.contains(bpm2.RB)) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionRequest() Logic on node " + bpm2.RB + " already has a pending transaction.");
            this.iB(fky2.aO());
            return;
        }
        int n = lcr.abS((int)fky2.dxt.enw());
        fky2.dxt = lcr.ak((ldv)fky2.dxt, (int)n);
        fky2.aCK = lcr.ak((ldv)fky2.aCK, (int)this.GUID.ib());
        brt brt2 = this.dwJ.asg().jj(fky2.aCK);
        if (brt2 == null) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionRequest() ItemRep " + fky2.aCK + " was not found.");
            return;
        }
        fky2.aRX = brt2.az();
        assert ((double)brt2.Bb() > 0.0);
        fky2.iPi = brt2.Bb();
        this.dAc.add(bpm2.RB);
        fky2.sk(bpm2.RB);
        fky2.cZn = 3;
        dnk dnk2 = ((bpv)this.dwJ).atU();
        dnk2.a(this.GUID, fky2);
    }

    @Override
    protected void a(fkz fkz2) {
        bpm bpm2;
        if (fkz2.aVk() == -1) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionResponse() MessageTag is invalid.");
            return;
        }
        Integer n = new Integer(fkz2.aVk());
        if (!this.dAc.contains(n)) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionResponse() Transaction with messagetag " + fkz2.aVk() + " was not found.");
            return;
        }
        this.dAc.remove(n);
        if (fkz2.iPj) {
            // empty if block
        }
        if ((bpm2 = ((bpv)this.dwJ).lN(fkz2.aVk())) == null) {
            lfn.b(5, "SFInteractionLogicSellToPlayerServer", "handleTransactionResponse() Could not find an InteractingClient with NodeID=" + fkz2.aVk());
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

