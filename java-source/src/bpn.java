/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class bpn
extends bnq {
    private Set<Integer> dAc = lcn.emx();
    private Map<Integer, Double> dAd = lcn.emw();

    public bpn() {
        super(true);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11781: {
                this.a((fky)dxq2);
                break;
            }
            case 12831: {
                this.a((edi)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void cZ(float f2) {
        if (f2 <= 0.0f) {
            lfn.b(5, "SFInteractionLogicBarberServer", "changeCurrencyItemQuantity() TotalItemPrice is invalid.");
            return;
        }
        this.dwJ.asg().mt((int)f2);
    }

    private void a(edi edi2) {
        if (edi2.aVk() == -1) {
            lfn.b(5, "SFInteractionLogicBarberServer", "handleCharacterChangeVisualFeaturesResponse() MessageTag is invalid.");
            return;
        }
        if (!this.dAc.remove(edi2.aVk())) {
            lfn.b(5, "SFInteractionLogicBarberServer", "handleCharacterChangeVisualFeaturesResponse() Transaction with messagetag " + edi2.aVk() + " was not found.");
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(edi2.aVk());
        if (bpm2 == null) {
            lfn.b(5, "SFInteractionLogicBarberServer", "handleCharacterChangeVisualFeaturesResponse() Could not find an InteractingClient with NodeID=" + edi2.aVk());
            return;
        }
        assert (bpm2.dAb != null);
        if (edi2.imu && (float)edi2.imv <= 0.0f) {
            lfn.b(5, "SFInteractionLogicBarberServer", "handleCharacterChangeVisualFeaturesResponse() TotalPrice is invalid.");
            edi2.imu = false;
        }
        if (edi2.imu) {
            fky fky2 = bpm2.dAb;
            this.cZ(edi2.imv);
            this.a(lcr.ak((ldv)this.GUID, (int)bpm2.RB), true, null);
        } else {
            this.a(lcr.ak((ldv)this.GUID, (int)bpm2.RB), false, mdd.uFu.bD(new Object[0]));
        }
        bpm2.dAb = null;
    }

    @Override
    public void b(bpm bpm2) {
        super.b(bpm2);
        this.dAd.remove(bpm2.RB);
    }

    private void a(fky fky2) {
        if (fky2.ims == null) {
            lfn.b(5, "SFInteractionLogicBarberServer", "handleTransactionRequest() LayerTypeOrdinals array is null.");
            return;
        }
        if (fky2.imt == null) {
            lfn.b(5, "SFInteractionLogicBarberServer", "handleTransactionRequest() ExtraTypes array is null.");
            return;
        }
        if (fky2.ims.length != fky2.imt.length) {
            lfn.b(5, "SFInteractionLogicBarberServer", "handleTransactionRequest() LayerTypeOrdinals array have different length than ExtraTypes array.");
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(fky2.aO().ib());
        if (bpm2 == null) {
            lfn.b(5, "SFInteractionLogicBuyFromPlayerServer", "handleTransactionRequest() Could not find an InteractingClient with NodeID=" + fky2.aO().ib());
            return;
        }
        if (this.dAc.contains(bpm2.RB)) {
            lfn.b(5, "SFInteractionLogicBuyFromPlayerServer", "handleTransactionRequest() Logic on node " + bpm2.RB + " already has a pending transaction.");
            this.a(fky2.aO(), false, mdd.uFi.bD(new Object[0]));
            return;
        }
        Double d2 = this.dAd.get(bpm2.RB);
        if (d2 != null && this.MessageDelegator.arc().rgz < d2 + 10.0) {
            this.a(fky2.aO(), false, mdd.uFj.bD(new Object[0]));
            return;
        }
        this.dAd.put(bpm2.RB, this.MessageDelegator.arc().rgz);
        bpm2.dAb = fky2;
        this.dAc.add(bpm2.RB);
        int n = lcr.abS((int)fky2.YN.enw());
        fky2.YN = lcr.ak((ldv)fky2.YN, (int)n);
        edh edh2 = (edh)this.MessageDelegator.h(12830, this.GUID, fky2.YN);
        edh2.aqs = bpm2.RB;
        edh2.ims = fky2.ims;
        edh2.imt = fky2.imt;
        this.MessageDelegator.F(edh2);
    }

    private void a(ldv ldv2, boolean bl2, loz loz2) {
        assert (ldv2 != null);
        fkz fkz2 = (fkz)this.MessageDelegator.h(11782, this.GUID, ldv2);
        fkz2.iPj = bl2;
        fkz2.s(loz2);
        this.MessageDelegator.F(fkz2);
    }
}

