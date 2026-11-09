/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ss
extends qe {
    private Map<Integer, Map<ldv, nb>> aRy;
    private List<nb> aCN;
    private int aRz = 1;
    private int Ws;

    public ss(md md2) {
        super(md2, me.ayq);
    }

    public void F(List<nb> list) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCollectItemAttributes", "setItems: Can't modify while working");
            assert (false);
            return;
        }
        this.aCN = list;
        this.aRy = lcn.emw();
        if (this.aCN != null) {
            for (nb nb2 : this.aCN) {
                if (nb2.aCK.ib() == this.getGUID().ib()) continue;
                Map<ldv, nb> map = this.aRy.get(nb2.aCK.ib());
                if (map == null) {
                    map = lcn.emw();
                    this.aRy.put(nb2.aCK.ib(), map);
                }
                map.put(nb2.aCK, nb2);
            }
        }
    }

    @Override
    protected void sO() {
        if (this.aRy.isEmpty()) {
            this.ca(null);
            return;
        }
        ++this.aRz;
        for (int n : this.aRy.keySet()) {
            Map<ldv, nb> map = this.aRy.get(n);
            ArrayList<ldv> arrayList = lcn.abH(100);
            for (ldv ldv2 : map.keySet()) {
                arrayList.add(ldv2);
                if (arrayList.size() != 100) continue;
                this.a(n, arrayList);
                arrayList.clear();
            }
            if (arrayList.isEmpty()) continue;
            this.a(n, arrayList);
            arrayList.clear();
        }
    }

    @Override
    protected void sP() {
        this.Ws = 0;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7171: {
                this.a((fyw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fyw fyw2) {
        if (fyw2.aqs != this.aRz) {
            lfn.b(5, "SFPersistenceWorkerCollectItemAttributes", "handlePersistenceManagerItemAttributeResponse: Invalid MessageTag in response");
            assert (false);
            return;
        }
        --this.Ws;
        if (fyw2.jba != null) {
            for (eu eu2 : fyw2.jba) {
                Map<ldv, nb> map = this.aRy.get(eu2.GUID.ib());
                if (map == null) {
                    lfn.b(5, "SFPersistenceWorkerCollectItemAttributes", "handlePersistenceManagerItemAttributeResponse: Got response for " + eu2.GUID + " but have no entries for that node");
                    assert (false);
                    continue;
                }
                nb nb2 = map.get(eu2.GUID);
                if (nb2 == null) {
                    lfn.b(5, "SFPersistenceWorkerCollectItemAttributes", "handlePersistenceManagerItemAttributeResponse: Got response for " + eu2.GUID + " but don't have that item");
                    assert (false);
                    continue;
                }
                if (nb2.DR != null) {
                    lfn.b(5, "SFPersistenceWorkerCollectItemAttributes", "handlePersistenceManagerItemAttributeResponse: Got response for " + eu2.GUID + " which already has attributes, overwriting them");
                    assert (false);
                }
                if (eu2.DR == null) {
                    lfn.b(4, "SFPersistenceWorkerCollectItemAttributes", "handlePersistenceManagerItemAttributeResponse: Item " + eu2.GUID + " didn't have attributes, removing it from item list");
                    this.aCN.remove(nb2);
                    continue;
                }
                nb2.DR = eu2.DR;
            }
        }
        if (this.Ws == 0) {
            if (this.aCN != null) {
                for (nb nb3 : this.aCN) {
                    if (nb3.DR != null) continue;
                    lfn.b(5, "SFPersistenceWorkerCollectItemAttributes", "handlePersistenceManagerItemAttributeResponse: No attributes for item. ItemGUID=" + nb3.aCK + ", OwnerGUID=" + nb3.aCE + ", ItemID=" + nb3.aCF + ", ResourceType=" + nb3.aCI + ", Quantity=" + nb3.asi);
                }
            }
            this.ca(null);
        }
    }

    private void a(int n, List<ldv> list) {
        fyv fyv2 = (fyv)this.MessageDelegator.h(7170, this.getGUID(), lcr.ak((ldv)lcr.qAV, (int)n));
        fyv2.iPs = list.toArray(new ldv[list.size()]);
        fyv2.aqs = this.aRz;
        ++this.Ws;
        this.MessageDelegator.E(fyv2);
    }
}

