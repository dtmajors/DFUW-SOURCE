/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class avr
extends aul {
    private boolean Initialized = false;
    private ldv cdD = null;
    private ldv Sy = null;

    public avr() {
        super(new amd(avr.class, aul.cdc, "ChatProxyForSubscription", new cqi[0], null));
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
        if (this.cdD == null) {
            return;
        }
        a[] aArray = (a[])a.class.getEnumConstants();
        a a2 = aArray[n];
        switch (a2) {
            case cqf: {
                this.nq();
                break;
            }
            case cqg: {
                this.bh(objectArray);
                break;
            }
            case cqh: {
                this.bi(objectArray);
                break;
            }
            case cqi: {
                this.bj(objectArray);
                break;
            }
            case cqj: {
                this.bk(objectArray);
                break;
            }
            case cqk: {
                this.bl(objectArray);
                break;
            }
            case cql: {
                this.Xi();
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
        this.a(hc.aaP, a.cqf, new ljk("dumps all subscription state to server logs"), new egg[0]);
        this.a(hc.aaP, a.cqg, new ljk("prints the propertyname of all the ignored properties for all the subscriptions for a specified subscriber"), new egg[]{new egg("subscriber_nodeid", egg.a.ipn, true, new ljk("the nodeid of the subscriber"))});
        this.a(hc.aaP, a.cqh, new ljk("prints the content of the stateobject for a specified object"), new egg[]{new egg("object_guid", egg.a.ipq, false, new ljk("the guid of the object"))});
        this.a(hc.aaP, a.cqi, new ljk("prints the content of a specified subscriber"), new egg[]{new egg("subscriber_nodeid", egg.a.ipn, true, new ljk("the nodeID of the subscriber"))});
        this.a(hc.aaP, a.cqj, new ljk("prints the content of a subscription object for a subscriber"), new egg[]{new egg("object_guid", egg.a.ipq, false, new ljk("the guid of the object")), new egg("subscriber_nodeid", egg.a.ipn, true, new ljk("the nodeid of the subscriber"))});
        this.a(hc.aaP, a.cqk, new ljk("prints the content of all the subscriptions for a subscriber where the state is not CREATED"), new egg[]{new egg("subscriber_nodeid", egg.a.ipn, true, new ljk("the nodeid of the subscriber"))});
        this.a(hc.aaP, a.cql, new ljk("prints the propertyname of all the properties where its updates are being suppressed for all the stateobjects"), new egg[0]);
    }

    private void a(egk egk2) {
        if (egk2.cdD == null) {
            lfn.b(5, "SFChatProxyForSubscription", "handleChatGUIDInfoMessage() PlayerObjectServerGUID is null.");
            return;
        }
        this.cdD = egk2.cdD;
        this.Sy = egk2.aO();
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void nq() {
        ery ery2 = (ery)this.MessageDelegator.h(16652, this.GUID, lcr.qAJ);
        ery2.ilu = 1;
        ery2.adA = this.Sy;
        this.d(this.cdD, ery2);
    }

    private void bh(Object[] objectArray) {
        ldv ldv2 = this.Sy;
        if (objectArray.length == 1) {
            int n = ((lei)objectArray[0]).intValue();
            if (n <= 0) {
                lfn.b(5, "SFChatProxyForSubscription", "printIgnoredUpdatePropertyIDs() Invalid nodeID provided: " + n);
                return;
            }
            ldv2 = lcr.ak((ldv)this.Sy, (int)n);
        }
        ery ery2 = (ery)this.MessageDelegator.h(16652, this.GUID, lcr.qAJ);
        ery2.ilu = 2;
        ery2.adA = ldv2;
        this.d(this.cdD, ery2);
    }

    private void bi(Object[] objectArray) {
        String string = (String)objectArray[0];
        ldv ldv2 = ldv.zq(string);
        if (ldv2 == null) {
            lfn.b(5, "SFChatProxyForSubscription", "printStateObject() Invalid objectGUID provided: '" + string + "'");
            return;
        }
        ldv2 = lcr.ak((ldv)ldv2, (int)this.cdD.ib());
        ery ery2 = (ery)this.MessageDelegator.h(16652, this.GUID, lcr.qAI);
        ery2.ilu = 3;
        ery2.Rs = ldv2;
        this.d(this.cdD, ery2);
    }

    private void bj(Object[] objectArray) {
        ldv ldv2 = this.Sy;
        if (objectArray.length == 1) {
            int n = ((lei)objectArray[0]).intValue();
            if (n <= 0) {
                lfn.b(5, "SFChatProxyForSubscription", "printSubscriber() Invalid nodeID provided: " + n);
                return;
            }
            ldv2 = lcr.ak((ldv)this.Sy, (int)n);
        }
        ery ery2 = (ery)this.MessageDelegator.h(16652, this.GUID, lcr.qAJ);
        ery2.ilu = 4;
        ery2.adA = ldv2;
        this.d(this.cdD, ery2);
    }

    private void bk(Object[] objectArray) {
        String string = (String)objectArray[0];
        ldv ldv2 = ldv.zq(string);
        if (ldv2 == null) {
            lfn.b(5, "SFChatProxyForSubscription", "printSubscription() Invalid objectGUID provided: '" + string + "'");
            return;
        }
        ldv2 = lcr.ak((ldv)ldv2, (int)this.cdD.ib());
        ldv ldv3 = this.Sy;
        if (objectArray.length == 2) {
            int n = ((lei)objectArray[1]).intValue();
            if (n <= 0) {
                lfn.b(5, "SFChatProxyForSubscription", "printSubscription() Invalid nodeID provided: " + n);
                return;
            }
            ldv3 = lcr.ak((ldv)this.Sy, (int)n);
        }
        ery ery2 = (ery)this.MessageDelegator.h(16652, this.GUID, lcr.qAJ);
        ery2.ilu = 5;
        ery2.adA = ldv3;
        ery2.Rs = ldv2;
        this.d(this.cdD, ery2);
    }

    private void bl(Object[] objectArray) {
        ldv ldv2 = this.Sy;
        if (objectArray.length == 1) {
            int n = ((lei)objectArray[0]).intValue();
            if (n <= 0) {
                lfn.b(5, "SFChatProxyForSubscription", "printSubscriptionsNotYetCreated() Invalid nodeID provided: " + n);
                return;
            }
            ldv2 = lcr.ak((ldv)this.Sy, (int)n);
        }
        ery ery2 = (ery)this.MessageDelegator.h(16652, this.GUID, lcr.qAJ);
        ery2.ilu = 6;
        ery2.adA = ldv2;
        this.d(this.cdD, ery2);
    }

    private void Xi() {
        ery ery2 = (ery)this.MessageDelegator.h(16652, this.GUID, lcr.qAI);
        ery2.ilu = 7;
        this.d(this.cdD, ery2);
    }
}

