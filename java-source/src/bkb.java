/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  brg
 *  cbx
 *  cex
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class bkb
extends btk {
    private static bkf dqq = new bkf();
    private List<bkc> dqr = lcn.emv();
    private Map<Integer, bka> dqs = null;
    private int Qs = 1;
    private static les dqt = lea.enU();
    private static les dqu = lea.enV();

    public bkb() {
        this.ObjectType = 41;
    }

    public ldz arc() {
        assert (this.isInitialized());
        return this.MessageDelegator.arc();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dqr = lea.dSH();
    }

    public bke a(bkd.a a2) {
        assert (a2 != null);
        bke bke2 = dqq.a(a2);
        if (bke2 == null) {
            lfn.b(5, "SFFunctionManager", "createFunctionObject() FunctionObject could not be created.");
            return null;
        }
        bke2.setGUID(this.MessageDelegator.bzv());
        bke2.a(this);
        this.MessageDelegator.a(bke2);
        return bke2;
    }

    public void a(bke bke2) {
        this.MessageDelegator.hd(bke2.getGUID());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 9216: {
                this.a((fde)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fde fde2) {
        switch (fde2.bEz()) {
            case 9223: {
                this.a((fdx)fde2);
                break;
            }
            default: {
                if (fde2 instanceof fdo) {
                    fdo fdo2 = (fdo)fde2;
                    if (fdo2.akX == null) {
                        lfn.b(5, "SFFunctionManager", "handleFunctionMessage() TargetObjectGUID is null.");
                        lfn.b(5, "SFFunctionManager", "handleFunctionMessage() " + fdo2);
                        return;
                    }
                    if (fdo2.bOu()) {
                        this.a(fdo2);
                        break;
                    }
                    if (fdo2.akX.tV(this.GUID)) {
                        this.a(fdo2);
                        break;
                    }
                    ldv ldv2 = fdo2.akX;
                    ldv ldv3 = new ldv(ldv2.ib(), ldv2.enw(), 1036601);
                    fde2.on(ldv3);
                    this.MessageDelegator.F(fde2);
                    break;
                }
                lfn.b(5, "SFFunctionManager", "handleFunctionMessage() Unhandled functionmessage received: " + fde2.getClass().getName());
                lfn.b(5, "SFFunctionManager", "handleFunctionMessage() " + fde2);
            }
        }
    }

    private void a(fdo fdo2) {
        Object object;
        if (fdo2.aZG == null) {
            lfn.b(5, "SFFunctionManager", "handleFunctionStartMessage() SourceObjectGUID is null.");
            return;
        }
        if (fdo2.akX == null) {
            lfn.b(5, "SFFunctionManager", "handleFunctionStartMessage() TargetObjectGUID is null.");
            return;
        }
        ldv ldv2 = fdo2.aZG;
        ldv ldv3 = fdo2.akX;
        int n = 0;
        amf amf2 = this.MessageDelegator.d(fdo2.akX);
        if (amf2 == null) {
            lfn.b(5, "SFFunctionManager", "handleFunctionStartMessage() TargetObject " + fdo2.akX + " was not found.");
        } else if (amf2 instanceof cbx) {
            n = amf2.getObjectType();
        } else if (amf2 instanceof bvd) {
            object = (bvd)amf2;
            if (((bvd)object).aze() == null) {
                lfn.b(5, "SFFunctionManager", "handleFunctionStartMessage() TargetObject is a meshobject without a physicalobject.");
            } else {
                n = ((bvd)object).aze().getObjectType();
                fdo2.akX = ldv3 = ((bvd)object).aze().getGUID();
            }
        } else if (amf2 instanceof ayd) {
            n = amf2.getObjectType();
        } else if (amf2 instanceof amx) {
            n = amf2.getObjectType();
        } else if (amf2 instanceof brg) {
            object = (brg)amf2;
            n = ((cex)object.auk()).getObjectType();
        } else {
            lfn.b(5, "SFFunctionManager", "handleFunctionStartMessage() Object is of unknown type: " + amf2.getClass().getName());
        }
        if (n <= 0) {
            lfn.b(5, "SFFunctionManager", "handleFunctionStartMessage() ObjectType is invalid for targetobject " + fdo2.akX);
            if (fdo2.bOs()) {
                this.e(fdo2.aO(), fdo2.aqs, fdo2.bst);
            }
            return;
        }
        object = this.ah(n, fdo2.bst);
        if (object == null) {
            if (fdo2.bst == bkd.dqK) {
                this.hF(fdo2.aZG);
            }
            if (fdo2.bOs()) {
                this.e(fdo2.aO(), fdo2.aqs, fdo2.bst);
            }
            return;
        }
        if (fdo2.aZG.equals(lcr.qAC) && !bkd.a.isSupportReservedGUIDAsSourceObjectGUID(((bkc)object).dqv)) {
            if (fdo2.bst == bkd.dqK) {
                this.hF(fdo2.aZG);
            }
            if (fdo2.bOs()) {
                this.e(fdo2.aO(), fdo2.aqs, fdo2.bst);
            }
            return;
        }
        if (fdo2.bst == bkd.dqK) {
            int n2 = this.Qs++;
            bka bka2 = new bka();
            bka2.aqs = n2;
            bka2.dqo = object;
            bka2.dqp = fdo2;
            this.a(bka2);
            this.b(fdo2.aZG, n2, fdo2.akX);
        } else {
            this.a((bkc)object, fdo2);
        }
    }

    private void a(fdx fdx2) {
        if (fdx2.aqs == -1) {
            lfn.b(5, "SFFunctionManager", "handleValidateUseResponse() MessageTag is invalid.");
            return;
        }
        bka bka2 = this.kW(fdx2.aqs);
        if (bka2 == null) {
            lfn.b(5, "SFFunctionManager", "handleValidateUseResponse() No functioninfo mapped to messagetag " + fdx2.aqs);
            return;
        }
        if (fdx2.iKl) {
            if (bka2.dqo.dqv == bkd.a.dsj) {
                this.hF(bka2.dqp.aZG);
            }
            return;
        }
        this.a(bka2.dqo, bka2.dqp);
    }

    private bkc ag(int n, int n2) {
        int n3 = this.dqr.size();
        for (int i = 0; i < n3; ++i) {
            bkc bkc2 = this.dqr.get(i);
            if (!bkc2.aj(n, n2)) continue;
            return bkc2;
        }
        return null;
    }

    private String kV(int n) {
        return dqt.getName(n);
    }

    private String gL(int n) {
        return amh.gL(n);
    }

    private bkc ah(int n, int n2) {
        while (n2 > 0) {
            bkc bkc2 = this.ai(n, n2);
            if (bkc2 != null) {
                return bkc2;
            }
            n2 = dqt.uW(n2);
        }
        return null;
    }

    private void a(bkc bkc2, fdo fdo2) {
        assert (bkc2 != null);
        assert (fdo2 != null);
        bke bke2 = this.a(bkc2.dqv);
        if (bke2 == null) {
            lfn.b(5, "SFFunctionManager", "startFunction() FunctionObject " + (Object)((Object)bkc2.dqv) + " could not be created.");
            return;
        }
        bke2.a(bkc2.bst, fdo2);
        if (fdo2.bOr()) {
            fdh fdh2 = (fdh)this.MessageDelegator.h(9221, this.GUID, fdo2.aO());
            fdh2.gbp = bke2.getGUID();
            this.MessageDelegator.F(fdh2);
        }
        if (!fdo2.bOp() || bkc2.dqw == 0) {
            // empty if block
        }
    }

    private bkc ai(int n, int n2) {
        while (n > 0) {
            bkc bkc2 = this.ag(n, n2);
            if (bkc2 != null) {
                return bkc2;
            }
            n = dqu.uW(n);
        }
        return null;
    }

    private void a(bka bka2) {
        assert (bka2 != null);
        if (this.dqs == null) {
            this.dqs = lcn.emw();
        }
        this.dqs.put(bka2.aqs, bka2);
    }

    private bka kW(int n) {
        assert (n > 0);
        return this.dqs.remove(n);
    }

    private void e(ldv ldv2, int n, int n2) {
        assert (ldv2 != null);
        fcs fcs2 = (fcs)this.MessageDelegator.h(9219, this.GUID, ldv2);
        fcs2.aqs = n;
        fcs2.bst = n2;
        fcs2.iJq = false;
        this.MessageDelegator.F(fcs2);
    }

    private void hF(ldv ldv2) {
        assert (ldv2 != null);
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        gsy gsy2 = (gsy)this.MessageDelegator.h(11050, this.GUID, ldv3);
        this.MessageDelegator.F(gsy2);
    }

    private void b(ldv ldv2, int n, ldv ldv3) {
        fdw fdw2 = (fdw)this.MessageDelegator.h(9222, this.GUID, ldv2);
        fdw2.aqs = n;
        fdw2.akU = ldv3;
        this.MessageDelegator.F(fdw2);
    }
}

