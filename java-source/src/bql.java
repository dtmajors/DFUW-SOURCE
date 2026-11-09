/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cdb
 *  cew
 *  cug
 *  ep
 *  lcr
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class bql
extends bqk {
    private Map<ldv, bqa> dBV = null;
    private final Set<ldv> dBW = lcn.emx();

    public bql() {
        this(32);
    }

    public bql(int n) {
        super(n);
        this.dBV = lcn.emw();
    }

    public final float auw() {
        if (!(this.dBP instanceof cew)) {
            return 0.0f;
        }
        cew cew2 = (cew)this.dBP;
        cwo cwo2 = (cwo)cew2.aMg().b(cwf.b.fEF);
        if (cwo2 == null) {
            return 1.0f;
        }
        if (cwo2.bdT() == null) {
            lfn.b(5, "SFInventoryClient", "getVendorBuyAdjustmentValue() VendorObject is null.");
            return 1.0f;
        }
        if (cwo2.bdT().aYl() == null) {
            lfn.b(5, "SFInventoryClient", "getVendorBuyAdjustmentValue() InteractionManager is null.");
            return 1.0f;
        }
        return cwo2.bdT().aYl().asd();
    }

    public final void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.auz();
        this.auy();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12294: {
                this.handleObserverObserveStatusMessage((fvu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(fmm fmm2) {
        switch (fmm2.bEz()) {
            case 7959: 
            case 7960: 
            case 7969: 
            case 7999: 
            case 8007: 
            case 8009: {
                assert (this.dBP != null);
                fmm2.on(this.dBP.getGUID());
                this.MessageDelegator.I(fmm2);
                break;
            }
            case 7977: {
                this.a((flp)fmm2);
                break;
            }
            default: {
                super.a(fmm2);
            }
        }
    }

    protected final void a(ldv ldv2, int n, ej ej2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (ej2 != null);
        bqs bqs2 = this.iH(ldv2);
        if (bqs2 == null) {
            lfn.b(5, "SFInventoryClient", "handleItemAttribute() No item with WiretapGUID=" + ldv2 + " was found.");
            return;
        }
        block0 : switch (n) {
            case 1: 
            case 2: {
                switch (ej2.getDataType()) {
                    case 1: {
                        this.a(bqs2, ldv2, n, (es)ej2);
                        break block0;
                    }
                    case 2: {
                        this.a(bqs2, ldv2, n, (et)ej2);
                        break block0;
                    }
                    case 3: {
                        this.a(bqs2, ldv2, n, (ew)ej2);
                        break block0;
                    }
                    case 6: {
                        this.a(bqs2, ldv2, n, (fh)ej2);
                        break block0;
                    }
                    case 7: {
                        this.a(bqs2, ldv2, n, (ff)ej2);
                        break block0;
                    }
                }
                lfn.b(5, "SFInventoryClient", "handleItemAttribute() Unhandled datatype provided: '" + ej2.fl() + "'");
                return;
            }
            default: {
                lfn.b(5, "SFInventoryClient", "handleItemAttribute() Invalid EventType provided: " + n);
                return;
            }
        }
    }

    protected void aut() {
        assert (this.Initialized);
        super.aut();
        brs brs2 = this.dBQ.awe();
        this.dBQ.reset();
        this.a(brs2, this.dBQ.awe(), true);
        this.dBQ.awi();
    }

    protected boolean aux() {
        return false;
    }

    private void a(brs brs2, brs brs3, boolean bl2) {
        assert (brs2 != null);
        assert (brs3 != null);
        if (!brs2.Ba()) {
            return;
        }
        List<brs> list = brs2.AY();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            Object object;
            brs brs4 = list.get(i);
            if (brs4.awo() instanceof bpy) {
                object = this.dBQ.iZ(brs4.awo().getGUID());
                if (object == null) {
                    object = brs4.awq();
                }
                this.a(brs4, (brs)object, bl2);
                continue;
            }
            if (brs4.awo() instanceof bqs) {
                object = (bqs)brs4.awo();
                this.a((bqs)object, brs3, bl2);
                if (!((bqs)object).auU()) continue;
                brs brs5 = this.dBQ.iZ(((brm)object).getGUID());
                this.a(brs4, brs5, bl2);
                continue;
            }
            lfn.b(5, "SFInventoryPlayerClient", "addChildNodeItems() Invalid itembase found: " + brs4.awo());
            assert (false);
        }
    }

    private void a(flp flp2) {
        List<brs> list;
        if (flp2.dxF == null) {
            lfn.b(5, "SFInventoryClient", "handleDynamicContainerContentRequest() DynamicContainerGUID is null.");
            return;
        }
        brp[] brpArray = null;
        brs brs2 = this.dBQ.avZ();
        if (brs2 == null) {
            lfn.b(5, "SFInventoryClient", "handleDynamicContainerContentRequest() Could not find dynamic container " + flp2.dxF);
        } else if (!brs2.awo().getGUID().equals(flp2.dxF)) {
            lfn.b(5, "SFInventoryClient", "handleDynamicContainerContentRequest() DynamicContainer.GUID=" + brs2.awo().getGUID());
            lfn.b(5, "SFInventoryClient", "handleDynamicContainerContentRequest() Request.DynamicContainerGUID=" + flp2.dxF);
        } else {
            list = brs2.AY();
            if (list == null) {
                lfn.b(5, "SFInventoryClient", "handleDynamicContainerContentRequest() Dynamic container is empty: " + brs2);
            } else {
                brpArray = new brp[list.size()];
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    brs brs3 = (brs)list.get(i);
                    bqs bqs2 = (bqs)brs3.awo();
                    brpArray[i] = bqs2.auS();
                }
            }
        }
        list = (flq)this.MessageDelegator.h(7978, this.GUID, flp2.aO());
        ((flq)((Object)list)).dxF = flp2.dxF;
        ((flq)((Object)list)).dJg = brpArray;
        this.MessageDelegator.F((dxq)((Object)list));
    }

    private void a(bqs bqs2, ldv ldv2, int n, es es2) {
        assert (bqs2 != null);
        assert (ldv2 != null);
        assert (n > 0);
        assert (es2 != null);
        bqs2.g(es2);
        this.b(1, bqs2);
    }

    private void a(bqs bqs2, ldv ldv2, int n, et et2) {
        assert (bqs2 != null);
        assert (ldv2 != null);
        assert (n > 0);
        assert (et2 != null);
        et et3 = bqs2.ah(et2.getType());
        if (et3 != null && et3.fN() == et2.fN()) {
            return;
        }
        bqs2.g(et2);
        int n2 = et2.getType();
        if (n2 == 1104) {
            this.dBQ.awi();
        }
        this.a(1, bqs2);
        this.b(1, bqs2);
        if (ep.aY((int)n2)) {
            if (bqs2.Uu()) {
                this.dBQ.awg();
            }
        } else if (ep.bb((int)n2)) {
            boolean bl2 = false;
            if (bqs2.AT()) {
                bl2 = false;
            } else if (ResourceTree.isDescendant(bqs2.az(), cug.fiL)) {
                bl2 = true;
            }
            if (bl2) {
                cdb cdb2 = (cdb)this.dBP;
                cdb2.D(bqs2);
            }
        }
    }

    private void a(bqs bqs2, ldv ldv2, int n, ew ew2) {
        assert (bqs2 != null);
        assert (ldv2 != null);
        assert (n > 0);
        assert (ew2 != null);
        ew ew3 = bqs2.ao(ew2.getType());
        if (ew3 != null && ew3.fQ() == ew2.fQ()) {
            return;
        }
        bqs2.g(ew2);
        this.a(1, bqs2);
        this.b(1, bqs2);
    }

    private void iJ(ldv ldv2) {
        assert (this.Initialized);
        assert (this.dBP != null);
        assert (ldv2 != null);
        bqs bqs2 = this.iK(ldv2);
        if (bqs2 == null) {
            lfn.b(5, "SFInventoryClient", "handleItemObserved() Could not find item " + ldv2);
            return;
        }
        bse bse2 = bqm.me(bqs2.az());
        if (bse2 != null && bse2.dJj.length > 0) {
            bqs2.iT(this.MessageDelegator.bzv());
            this.a(bqs2.getGUID(), bqs2.auP(), bse2.dJj, bse2.dJl, bse2.dJm, bse2.dJn);
        }
    }

    private void a(bqs bqs2, ldv ldv2, int n, ff ff2) {
        assert (bqs2 != null);
        assert (ldv2 != null);
        assert (n > 0);
        assert (ff2 != null);
        bqs2.g(ff2);
        this.b(1, bqs2);
    }

    private void a(bqs bqs2, ldv ldv2, int n, fh fh2) {
        assert (bqs2 != null);
        assert (ldv2 != null);
        assert (n > 0);
        assert (fh2 != null);
        bqs2.g(fh2);
        this.b(1, bqs2);
    }

    private void handleObserverObserveStatusMessage(fvu fvu2) {
        assert (this.Initialized);
        assert (this.dBP != null);
        if (fvu2.iXT == null) {
            lfn.b(5, "SFInventoryClient", "handleObserverObserveStatusMessage() ObservedObjectGUID is null.");
            return;
        }
        if (!this.dBQ.cF(fvu2.iXT)) {
            lfn.b(5, "SFInventoryClient", "handleObserverObserveStatusMessage() Could not find observed item " + fvu2.iXT);
            return;
        }
        if (!this.dBW.contains(fvu2.iXT)) {
            lfn.b(5, "SFInventoryClient", "handleObserverObserveStatusMessage() StatusObserver for item " + fvu2.iXT + " is not registered.");
            assert (false);
            return;
        }
        this.iJ(fvu2.iXT);
        this.dBW.remove(fvu2.iXT);
    }

    public final bqs iK(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFInventoryClient", "getInventoryItem() ItemGUID is null.");
            return null;
        }
        brm brm2 = this.iF(ldv2);
        if (brm2 == null) {
            return null;
        }
        if (brm2 instanceof bqs) {
            return (bqs)brm2;
        }
        lfn.b(5, "SFInventoryClient", "getInventoryItem() Item " + ldv2 + " is not an inventoryitem: " + brm2.getClass().getName());
        return null;
    }

    protected void a(bqs bqs2, vi vi2) {
    }

    protected void f(bqs bqs2) {
    }

    private void a(bqs bqs2, brs brs2, boolean bl2) {
        bse bse2;
        assert (bqs2 != null);
        assert (bqs2.auP() == null);
        assert (brs2 != null);
        this.b(bqs2, brs2);
        if (!this.Initialized || this.dBP == null) {
            return;
        }
        this.b(1, bqs2);
        if (!bl2 && this.aux()) {
            if (bqs2.vf() > 1) {
                this.a(mce.usc.bD(bqs2.az(), bqs2.vf()));
            } else {
                this.a(mce.usb.bD(bqs2.az()));
            }
        }
        if ((bse2 = bqm.me(bqs2.az())) != null) {
            this.iL(bqs2.getGUID());
            if (this.dBW.contains(bqs2.getGUID())) {
                lfn.b(5, "SFInventoryClient", "addInventoryItem() There already exists a statusobserver for " + bqs2);
                assert (false);
                return;
            }
            this.dBW.add(bqs2.getGUID());
        }
        this.dBQ.awi();
    }

    private void a(vi vi2) {
        assert (vi2 != null);
        bqs bqs2 = new bqs();
        bqs2.setGUID(vi2.GUID);
        bqs2.l(vi2.ResourceType);
        bqs2.do(vi2.asi);
        bqs2.setWeight(vi2.aXy);
        bqs2.Q(vi2.aXU);
        bqs2.ap(11280, -2);
        lgw lgw2 = (lgw)ResourceTree.acv(bqs2.az());
        if (lgw2 == null) {
            lfn.b(5, "SFInventoryClient", "createInventoryItem() No ResourceListItem mapped to resourcetype " + bqs2.az());
            assert (false);
            return;
        }
        if (ResourceTree.isDescendant(lgw2.getType(), cug.fkH)) {
            float f2 = cug.uY((int)lgw2.getType());
            if (f2 <= 0.0f) {
                lfn.b(5, "SFInventoryClient", "createInventoryItem() Quality is invalid for '" + lgw2.getName() + "'");
            } else {
                et et2 = new et();
                et2.setType(1088);
                et2.o(f2);
                bqs2.g(et2);
            }
        }
        bqs2.b(lgw2.auO());
        if (this.iE(bqs2.getGUID())) {
            lfn.b(5, "SFInventoryClient", "createInventoryItem() Inventory " + this.GUID + " already contains item " + bqs2.getGUID());
            lfn.b(5, "SFInventoryClient", "createInventoryItem() " + bqs2);
            assert (false);
            return;
        }
        brs brs2 = this.dBQ.iZ(vi2.aXQ);
        if (brs2 == null) {
            lfn.b(5, "SFInventoryClient", "createInventoryItem() ContainerItem " + vi2.aXQ + " was not found for item " + bqs2.getGUID());
            return;
        }
        this.a(bqs2, brs2, false);
        if ((vi2.aXP & 1) > 0) {
            this.a(bqs2, vi2);
        }
    }

    private void a(bqs bqs2, ldv ldv2, ldv ldv3) {
        assert (bqs2 != null);
        assert (ldv2 != null);
        brs brs2 = this.dBQ.iZ(bqs2.getGUID());
        if (brs2 == null) {
            lfn.b(5, "SFInventoryClient", "changeParentItem() ItemNode for item " + bqs2.getGUID() + " was not found.");
            return;
        }
        brs brs3 = this.dBQ.iZ(ldv2);
        if (brs3 == null) {
            lfn.b(5, "SFInventoryClient", "changeParentItem() ItemNode for new parentitem " + ldv2 + " was not found.");
            return;
        }
        assert (brs2.awn() != null);
        assert (brs2.awn().k(brs2));
        this.b(1, bqs2);
        brs brs4 = brs2.awn();
        brs4.l(brs2);
        brs3.i(brs2);
        if (ldv3 != null) {
            bqs2.cJ(this.iI(ldv3));
        } else {
            bqs2.cJ(null);
        }
        this.a(1, brs4.awo());
        this.a(1, brs3.awo());
    }

    private void g(bqs bqs2) {
        assert (bqs2 != null);
        this.b(1, bqs2);
        this.f(bqs2);
        this.iG(bqs2.getGUID());
        if (bqs2.auU() && this.iQ(bqs2.getGUID()) != null) {
            this.iR(bqs2.getGUID());
        }
        if (!this.Initialized) {
            return;
        }
        if (this.aux()) {
            this.a(mce.usm.bD(bqs2.az()));
        }
        if (this.dBW.contains(bqs2.getGUID())) {
            this.dBW.remove(bqs2.getGUID());
            this.iM(bqs2.getGUID());
        }
        if (bqs2.auP() != null) {
            this.h(bqs2.getGUID(), bqs2.auP());
            this.MessageDelegator.oa(bqs2.auP());
            bqs2.iT(null);
        }
        this.dBQ.awi();
        if (this.dBP instanceof cew) {
            ((cew)this.dBP).aJC().avk().iS(bqs2.getGUID());
        }
    }

    private void a(bqs bqs2, float f2) {
        assert (bqs2 != null);
        bqs2.setWeight(f2);
        if (bqs2.auU()) {
            this.a(1, bqs2);
        }
        this.b(1, bqs2);
    }

    public final void n(int n, ldv ldv2) {
        assert (n > 0);
        assert (ldv2 != null);
        brs brs2 = this.dBQ.iZ(ldv2);
        if (brs2 == null) {
            lfn.b(5, "SFInventoryClient", "notifyParentItemObservers() ItemNode for item " + ldv2 + " was not found.");
            assert (false);
            return;
        }
        assert (brs2.awn() != null);
        this.ln(n);
        this.a(n, brs2.awn().awo());
    }

    protected final void a(int n, brm brm2) {
        assert (n > 0);
        assert (brm2 != null);
        if (brm2 instanceof bpy) {
            bqa bqa2 = this.dBV.get(brm2.getGUID());
            if (bqa2 != null) {
                bqa2.ln(n);
            }
        } else if (brm2 instanceof bqs) {
            bqa bqa3;
            bqs bqs2 = (bqs)brm2;
            if (bqs2.auU() && (bqa3 = this.dBV.get(brm2.getGUID())) != null) {
                bqa3.ln(n);
            }
        } else {
            lfn.b(5, "SFInventoryClient", "notifyContainerViewManagerObservers() Item " + brm2.getGUID() + " has invalid type: " + brm2.getClass().getSimpleName());
            return;
        }
    }

    protected final void b(int n, brm brm2) {
        assert (n > 0);
        assert (brm2 != null);
        brs brs2 = this.dBQ.iZ(brm2.getGUID());
        if (brs2 == null) {
            lfn.b(5, "SFInventoryClient", "notifyParentItemObservers() ItemNode for item " + brm2.getGUID() + " was not found.");
            assert (false);
            return;
        }
        assert (brs2.awn() != null);
        this.ln(n);
        this.a(n, brs2.awn().awo());
    }

    protected final void a(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void auy() {
        Iterator<ldv> iterator = this.dBW.iterator();
        while (iterator.hasNext()) {
            this.iM(iterator.next());
        }
        this.dBW.clear();
    }

    private void iL(ldv ldv2) {
        assert (ldv2 != null);
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, lcr.qzp);
        fvq2.hcg = 1;
        fvq2.hch = ldv2;
        this.MessageDelegator.F(fvq2);
    }

    private void iM(ldv ldv2) {
        assert (ldv2 != null);
        fvw fvw2 = (fvw)this.MessageDelegator.h(12293, this.GUID, lcr.qzp);
        fvw2.hch = ldv2;
        this.MessageDelegator.F(fvw2);
    }

    public final ldv iN(ldv ldv2) {
        assert (this.dBV != null);
        return this.z(ldv2, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final ldv z(ldv ldv2, boolean bl2) {
        Object object;
        assert (this.dBV != null);
        if (ldv2 == null) {
            lfn.b(5, "SFInventoryClient", "createContainerViewManager() ItemGUID is null.");
            return null;
        }
        if (this.dBV.containsKey(ldv2)) {
            this.iR(ldv2);
            return null;
        }
        brs brs2 = this.dBQ.iZ(ldv2);
        if (brs2 == null) {
            lfn.b(5, "SFInventoryClient", "createContainerViewManager() Item " + ldv2 + " was not found.");
            return null;
        }
        assert (brs2.awo() != null);
        assert (brs2.awo().getGUID() != null);
        bqm.b b2 = null;
        lip lip2 = null;
        if (this.dBQ.awe().awo().getGUID().equals(ldv2)) {
            b2 = this.alX();
            lip2 = bqm.b.getInventoryUtterance(b2);
        } else if (this.dBQ.awa() != null && this.dBQ.awa().getGUID().equals(ldv2)) {
            b2 = bqm.b.dEN;
            lip2 = bqm.b.getInventoryUtterance(b2);
        } else if (this.dBQ.awc() != null && this.dBQ.awc().getGUID().equals(ldv2)) {
            b2 = bqm.b.dEQ;
            lip2 = bqm.b.getInventoryUtterance(b2);
        } else if (this.dBQ.avY() != null && this.dBQ.avY().getGUID() != null && this.dBQ.avY().getGUID().equals(ldv2)) {
            b2 = bqm.b.dEO;
            lip2 = bqm.b.getInventoryUtterance(b2);
        } else {
            if (!(brs2.awo() instanceof bqs)) {
                lfn.b(5, "SFInventoryClient", "createContainerViewManager() Item " + ldv2 + " is not an inventoryitem: " + brs2.awo().getClass().getName());
                return null;
            }
            object = (bqs)brs2.awo();
            if (!((bqs)object).auU()) {
                lfn.b(5, "SFInventoryClient", "createContainerViewManager() Item " + ldv2 + " is not a container.");
                return null;
            }
            b2 = bqm.b.dEP;
            lip2 = ((bqs)object).auT();
        }
        object = new bqa();
        ((amf)object).setGUID(this.MessageDelegator.bzv());
        ((bqa)object).b(b2);
        ((bqa)object).a(this);
        ((bqa)object).iD(ldv2);
        ((bqa)object).d(lip2);
        ((bqa)object).dK(false);
        ((bqa)object).dL(bl2);
        this.MessageDelegator.a((amf)object);
        this.dBV.put(((bqa)object).AW(), (bqa)object);
        return ((amf)object).getGUID();
    }

    public final void iO(ldv ldv2) {
        assert (this.dBV != null);
        if (ldv2 == null) {
            lfn.b(5, "SFInventoryClient", "createDynamicContainerViewManager() ItemGUID is null.");
            return;
        }
        bqm.b b2 = bqm.b.dEO;
        lip lip2 = bqm.b.getInventoryUtterance(b2);
        bqa bqa2 = new bqa();
        bqa2.setGUID(this.MessageDelegator.bzv());
        bqa2.b(b2);
        bqa2.a(this);
        bqa2.iD(ldv2);
        bqa2.d(lip2);
        bqa2.dK(true);
        bqa2.dL(true);
        this.MessageDelegator.a(bqa2);
        this.dBV.put(bqa2.AW(), bqa2);
    }

    public final bqa iP(ldv ldv2) {
        assert (this.dBV != null);
        if (ldv2 == null) {
            lfn.b(5, "SFInventoryClient", "getContainerViewManager() ContainerViewManagerGUID is null.");
            return null;
        }
        for (bqa bqa2 : this.dBV.values()) {
            if (!bqa2.getGUID().equals(ldv2)) continue;
            return bqa2;
        }
        lfn.b(5, "SFInventoryClient", "getContainerViewManager() ContainerViewManager " + ldv2 + " was not found.");
        return null;
    }

    public final ldv iQ(ldv ldv2) {
        assert (this.dBV != null);
        if (ldv2 == null) {
            lfn.b(5, "SFInventoryClient", "getContainerViewManagerGUID() ItemGUID is null.");
            return null;
        }
        bqa bqa2 = this.dBV.get(ldv2);
        if (bqa2 != null) {
            return bqa2.getGUID();
        }
        return null;
    }

    public final void auz() {
        Iterator<bqa> iterator = this.dBV.values().iterator();
        while (iterator.hasNext()) {
            bqa bqa2 = iterator.next();
            if (!this.iE(bqa2.AW())) {
                lfn.b(5, "SFInventoryClient", "removeAllContainerViewManagers() Item " + bqa2.AW() + " was not found but viewmanager exists.");
                assert (false);
            }
            bqa2.Ci();
            iterator.remove();
        }
    }

    public final void iR(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFInventoryClient", "removeContainerViewManager() ItemGUID is null.");
            return;
        }
        if (!this.dBV.containsKey(ldv2)) {
            return;
        }
        bqa bqa2 = this.dBV.remove(ldv2);
        bqa2.Ci();
        if (this.dBV.isEmpty() && bqm.lY(this.aul())) {
            ((brc)this.dBP).avw();
        }
    }

    protected final void a(uk uk2) {
        assert (uk2 != null);
        switch (uk2.aWp) {
            case 24: {
                this.b((vi)uk2);
                break;
            }
            case 13: {
                this.a((va)uk2);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    protected void b(bqs bqs2, vi vi2) {
        assert (bqs2 != null);
        assert (vi2 != null);
        bqs2.Q(vi2.aXU);
        if ((vi2.aXP & 2) > 0) {
            this.b(1, bqs2);
        }
        if ((vi2.aXP & 0x40) > 0) {
            this.a(bqs2, this.iI(vi2.aXQ), vi2.aXR);
        }
        if ((vi2.aXP & 0x80) > 0) {
            this.a(bqs2, vi2.asi);
        }
        if ((vi2.aXP & 0x100) > 0) {
            this.a(bqs2, vi2.aXy);
        }
    }

    private void a(va va2) {
        Object object;
        assert (va2 != null);
        va2.GUID = this.iI(va2.GUID);
        if ((va2.aXP & 1) > 0) {
            switch (va2.aXx) {
                case 1: {
                    object = new bqd();
                    ((brm)object).setGUID(va2.GUID);
                    ((bpy)object).aXy = va2.aXy;
                    brs brs2 = new brs();
                    brs2.c((brm)object);
                    ((brm)object).c(brs2);
                    assert (!this.iE(((brm)object).getGUID()));
                    this.dBQ.d(brs2);
                    break;
                }
                case 2: {
                    object = new bqe();
                    ((brm)object).setGUID(va2.GUID);
                    ((bpy)object).aXy = va2.aXy;
                    brs brs3 = new brs();
                    brs3.c((brm)object);
                    ((brm)object).c(brs3);
                    assert (!this.iE(((brm)object).getGUID()));
                    assert (this.dBQ.awb() == null);
                    this.dBQ.e(brs3);
                    break;
                }
                case 3: {
                    object = new brz();
                    ((brm)object).setGUID(va2.GUID);
                    ((bpy)object).aXy = va2.aXy;
                    brs brs4 = new brs();
                    brs4.c((brm)object);
                    ((brm)object).c(brs4);
                    assert (!this.iE(((brm)object).getGUID()));
                    assert (this.dBQ.awd() == null);
                    this.dBQ.f(brs4);
                    break;
                }
                default: {
                    lfn.b(5, "SFInventoryClient", "handleContainerItemPropertyUpdate(ADD) Invalid containertype provided: " + va2.aXx);
                    assert (false);
                    return;
                }
            }
        }
        if ((va2.aXP & 0x100) > 0) {
            object = (bpy)this.iF(va2.GUID);
            if (object == null) {
                lfn.b(5, "SFInventoryClient", "handleContainerItemPropertyUpdate() Could not find containeritem " + va2.GUID);
                assert (false);
                return;
            }
            ((bpy)object).aXy = va2.aXy;
            this.a(1, (brm)object);
        }
        if ((va2.aXP & 4) > 0) {
            switch (va2.aXx) {
                case 1: {
                    object = this.dBQ.avZ();
                    if (object == null) {
                        lfn.b(5, "SFInventoryClient", "handleContainerItemPropertyUpdate() Could not find dynamic container " + va2.GUID);
                        return;
                    }
                    if (!((brs)object).awo().getGUID().equals(va2.GUID)) {
                        lfn.b(5, "SFInventoryClient", "handleContainerItemPropertyUpdate() DynamicContainer.GUID=" + ((brs)object).awo().getGUID());
                        lfn.b(5, "SFInventoryClient", "handleContainerItemPropertyUpdate() PropertyUpdate.GUID=" + va2.GUID);
                        return;
                    }
                    this.dBQ.awf();
                    break;
                }
                default: {
                    lfn.b(5, "SFInventoryClient", "handleContainerItemPropertyUpdate(REMOVE) Invalid containertype provided: " + va2.aXx);
                    assert (false);
                    return;
                }
            }
        }
    }

    private void b(vi vi2) {
        bqs bqs2;
        assert (vi2 != null);
        if (vi2.aXU == 0L) {
            lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "handleInventoryItemPropertyUpdate() : DatabasePersistentID has not been set in " + vi2);
        }
        vi2.GUID = this.iI(vi2.GUID);
        if ((vi2.aXP & 1) > 0) {
            vi2.aXQ = this.iI(vi2.aXQ);
            bqs2 = this.iK(vi2.GUID);
            if (bqs2 != null) {
                lfn.b(5, "SFInventoryClient", "handleInventoryItemPropertyUpdate(ADD) Item already exists: " + bqs2);
                assert (false);
            } else {
                this.a(vi2);
            }
        }
        if ((vi2.aXP & 2) > 0) {
            vi2.aXQ = this.iI(vi2.aXQ);
            if (!this.iE(vi2.GUID)) {
                this.a(vi2);
            }
        }
        if ((vi2.aXP & 8) > 0) {
            bqs2 = this.iK(vi2.GUID);
            if (bqs2 == null) {
                lfn.b(5, "SFInventoryClient", "handleInventoryItemPropertyUpdate(UPDATE) Item " + vi2.GUID + " was not found.");
                return;
            }
            this.b(bqs2, vi2);
        }
        if ((vi2.aXP & 4) > 0) {
            bqs2 = this.iK(vi2.GUID);
            if (bqs2 == null) {
                lfn.b(5, "SFInventoryClient", "handleInventoryItemPropertyUpdate(REMOVE) Item " + vi2.GUID + " was not found.");
                return;
            }
            this.g(bqs2);
        }
    }

    private void a(bqs bqs2, int n) {
        assert (bqs2 != null);
        int n2 = bqs2.vf();
        bqs2.do(n);
        this.b(1, bqs2);
        if (n > n2) {
            int n3 = n - n2;
            if (this.aux()) {
                this.a(mce.usc.bD(bqs2.az(), n3));
            }
        }
    }
}

