/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 *  hzo
 *  lcr
 *  lcw
 */
import java.util.Map;

public class bwz
extends btk
implements bto {
    private final Map<ldv, bwy> To = lcn.emw();
    private final Map<String, bwy> dXN = lcn.emw();
    private final Map<String, bwx> dXO = lcn.emw();
    private boolean dXP = false;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 16645: {
                this.a((ern)dxq2);
                break;
            }
            case 26626: {
                this.a((frn)dxq2);
                break;
            }
            case 26628: {
                this.a((frp)dxq2);
                break;
            }
            case 26630: {
                this.a((frv)dxq2);
                break;
            }
            case 26631: {
                this.a((frz)dxq2);
                break;
            }
            case 26633: {
                this.a((frr)dxq2);
                break;
            }
            case 2305: {
                dxq2.on(lcr.qCM);
                this.MessageDelegator.F(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
    }

    private final void a(ern ern2) {
        if (ern2.ilu == 13) {
            String string = ern2.YL.trim().toLowerCase();
            bwy bwy2 = this.dXN.get(string);
            if (bwy2 != null) {
                bwy2.aCQ();
            } else {
                ern2.on(lcr.Tr);
                ern2.f(this.getGUID());
                this.MessageDelegator.E(ern2);
            }
        } else if (ern2.ilu == 19) {
            ern2.on(lcr.Tr);
            ern2.f(this.getGUID());
            this.MessageDelegator.E(ern2);
        } else assert (false);
    }

    protected void h(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private final void a(frr frr2) {
        bqt[] bqtArray = frr2.iUZ;
        if (frr2.iUV) {
            if (frr2.aCH == 1) {
                hvj hvj2 = (hvj)this.MessageDelegator.bzx().bzt().d(lcr.acL);
                ieo ieo2 = ((hzo)hvj2.cxO()).cHv();
                if (ieo2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "window manager has null command line");
                    return;
                }
                if (bqtArray != null) {
                    for (bqt bqt2 : bqtArray) {
                        ews ews2 = (ews)this.MessageDelegator.h(29700, this.GUID, ieo2.getGUID());
                        ews2.aMu = true;
                        ews2.iEz = false;
                        ews2.iEy = lqd.rXc.bD(bqt2.ResourceType, bqt2.asi);
                        this.MessageDelegator.E(ews2);
                    }
                }
                ews ews3 = (ews)this.MessageDelegator.h(29700, this.GUID, ieo2.getGUID());
                ews3.aMu = true;
                ews3.iEz = false;
                ews3.iEy = lqd.rXb.bD(frr2.YL, bqtArray == null ? 0 : bqtArray.length);
                this.MessageDelegator.E(ews3);
            }
        } else {
            String string = frr2.YL.toLowerCase();
            bwx bwx2 = this.dXO.get(string);
            if (bwx2 == null) {
                bwx2 = new bwx(this, frr2.YL);
                this.dXO.put(string, bwx2);
                if (lcw.qFy) {
                    bwx2.aCJ();
                }
            }
            bwx2.a(frr2);
        }
    }

    public void gF(String string) {
        this.dXO.remove(string.toLowerCase());
    }

    private final void a(frn frn2) {
        if (frn2.iOz != 0) {
            this.h(lzv.tYN.bD(frn2.YL, frn2.iOz));
            return;
        }
        if (this.To.containsKey(frn2.aO())) {
            this.h(lzv.tYP.bD(frn2.aO().toString()));
            return;
        }
        if (this.dXN.containsKey(frn2.YL.trim().toLowerCase())) {
            this.h(lzv.tYQ.bD(frn2.YL));
            return;
        }
        bwy bwy2 = new bwy(this, frn2);
        this.To.put(bwy2.dXC, bwy2);
        this.dXN.put(bwy2.YL.toLowerCase(), bwy2);
        if (lcw.qFy) {
            bwy2.aCJ();
        }
    }

    private final void a(frp frp2) {
        if (frp2.iOz != 0) {
            this.h(lzv.tYO.bD(frp2.iOz));
            return;
        }
        bwy bwy2 = this.To.remove(frp2.aO());
        if (bwy2 == null) {
            return;
        }
        if (lcw.qFy) {
            bwy2.aCK();
        }
        bwy2.shutdown();
        this.dXN.remove(bwy2.YL.toLowerCase());
        bwy2 = null;
    }

    private final void a(frv frv2) {
        bwy bwy2 = this.To.get(frv2.aO());
        if (bwy2 == null) {
            return;
        }
        bwy2.a(frv2);
    }

    private final void a(frz frz2) {
        bwy bwy2 = this.To.get(frz2.aO());
        if (bwy2 == null) {
            return;
        }
        bwy2.a(frz2);
    }

    public final void a(bwy bwy2) {
        fro fro2 = (fro)this.MessageDelegator.h(26627, this.getGUID(), bwy2.dXC);
        this.MessageDelegator.E(fro2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dXP == lcw.qFy) {
            if (lcw.qFy) {
                for (bwy bwy2 : this.To.values()) {
                    bwy2.bg(ldz2.rgz);
                }
            }
            return;
        }
        this.dXP = lcw.qFy;
        if (this.dXP) {
            for (bwy object : this.To.values()) {
                object.aCJ();
            }
            for (bwx bwx2 : this.dXO.values()) {
                bwx2.aCJ();
            }
        }
    }

    void gG(String string) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), lcr.Tr);
        ern2.ilu = 4;
        ern2.YL = string;
        ern2.izI = true;
        this.MessageDelegator.F(ern2);
    }

    void gH(String string) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), lcr.Tr);
        ern2.ilu = 21;
        ern2.YL = string;
        this.MessageDelegator.F(ern2);
    }

    void gI(String string) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.getGUID(), lcr.Tr);
        ern2.ilu = 19;
        ern2.YL = string;
        this.MessageDelegator.F(ern2);
    }
}

