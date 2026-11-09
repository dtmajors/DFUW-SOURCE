/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class fq
extends btk {
    private final ix SW;
    private Map<ldv, hq> SX = lcn.emw();
    private Map<Integer, hq> SY = lcn.emw();
    private int Qs = 1;

    public fq(ix ix2) {
        this.SW = ix2;
    }

    public void a(age age2, boolean bl, boolean bl2) {
        if (age2 == null) {
            lfn.b(5, "SFClientEngineRelationManager", "addClientEngineRelation() RSO is null.");
            return;
        }
        if (!bl && bl == bl2) {
            lfn.b(5, "SFClientEngineRelationManager", "addClientEngineRelation() CreateStartPointObserver == CreateEndPointObserver == false");
            return;
        }
        if (this.SX.containsKey(age2.getGUID())) {
            lfn.b(5, "SFClientEngineRelationManager", "addClientEngineRelation() RelationStateObject " + age2.getGUID() + " is already added to the map.");
            assert (false);
            return;
        }
        hq hq2 = new hq();
        hq2.adI = age2;
        this.SX.put(age2.getGUID(), hq2);
        if (bl) {
            hq2.adJ = this.Qs++;
            this.SY.put(hq2.adJ, hq2);
            this.c(hq2.adJ, age2.Bq());
        }
        if (bl2) {
            if (this.GUID.ib() != age2.Br().ib()) {
                age2.aI(true);
                if (hq2.lY()) {
                    this.SW.a(hq2.adI);
                    this.ad(hq2.adI.getGUID());
                }
            } else {
                hq2.adK = this.Qs++;
                this.SY.put(hq2.adK, hq2);
                this.c(hq2.adK, age2.Br());
            }
        }
    }

    public boolean ac(ldv ldv2) {
        return this.SX.containsKey(ldv2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12294: {
                this.a((fvu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void ad(ldv ldv2) {
        hq hq2 = this.SX.remove(ldv2);
        if (hq2 == null) {
            lfn.b(5, "SFClientEngineRelationManager", "removeClientEngineRelation() RelationStateObject " + ldv2 + " was not found.");
            return;
        }
        hq2.adI = null;
    }

    private void a(fvu fvu2) {
        if (fvu2.aVk() == -1) {
            lfn.b(5, "SFClientEngineRelationManager", "handleObserveStatusMessage() MessageTag is invalid.");
            return;
        }
        if (fvu2.iXT == null) {
            lfn.b(5, "SFClientEngineRelationManager", "handleObserveStatusMessage() ObservedObjectGUID is null.");
            return;
        }
        int n = fvu2.aVk();
        hq hq2 = this.SY.remove(n);
        if (hq2 == null) {
            lfn.b(5, "SFClientEngineRelationManager", "handleObserveStatusMessage() No relationinfo mapped to messagetag " + n);
            lfn.b(5, "SFClientEngineRelationManager", "handleObserveStatusMessage() ObjectGUID=" + fvu2.iXT);
            return;
        }
        if (hq2.adJ == n) {
            hq2.adJ = 0;
        } else if (hq2.adK == n) {
            hq2.adK = 0;
        } else {
            lfn.b(5, "SFClientEngineRelationManager", "handleObserveStatusMessage() Invalid messagetag provided: " + n);
            lfn.b(5, "SFClientEngineRelationManager", "handleObserveStatusMessage() StartPointMessageTag=" + hq2.adJ + " EndPointMessageTag=" + hq2.adK);
            return;
        }
        if (hq2.lY()) {
            this.SW.a(hq2.adI);
            this.ad(hq2.adI.getGUID());
        }
    }

    private void c(int n, ldv ldv2) {
        assert (n != -1);
        assert (ldv2 != null);
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, ldv2.bFk());
        fvq2.sk(n);
        fvq2.hcg = 2;
        fvq2.hch = ldv2;
        this.MessageDelegator.F(fvq2);
    }
}

