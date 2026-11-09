/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class dve
extends btk {
    private Map<ldv, lfs<ljq, ljq>> dpR = lcn.emw();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24842: {
                this.a((fci)dxq2);
                break;
            }
            case 24843: {
                this.a((fcg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fci fci2) {
        ldv ldv2 = fci2.cQE;
        ljq ljq2 = fci2.cQF;
        ljq ljq3 = fci2.iJj;
        int n = fci2.gKV;
        switch (n) {
            case 1: {
                if (!this.dpR.containsKey(ldv2)) {
                    this.dpR.put(ldv2, new lfs<ljq, ljq>(ljq2, ljq3));
                    break;
                }
                lfn.b(5, "SFFortressesGlobalManager", "handleFortressSystemRegisterMessage() Fortress with GUID " + ldv2 + " Already Has Been Registered.");
                break;
            }
            case 2: {
                lfs<ljq, ljq> lfs2 = this.dpR.remove(ldv2);
                if (lfs2 != null) break;
                lfn.b(5, "SFFortressesGlobalManager", "handleFortressSystemRegisterMessage() Fortress with GUID " + ldv2 + " Is Not Registered.");
                break;
            }
            default: {
                assert (false) : " Reason :" + n + " From GUID " + fci2.aO();
                break;
            }
        }
    }

    private void a(fcg fcg2) {
        fch fch2 = (fch)this.MessageDelegator.h(24844, this.getGUID(), fcg2.aO());
        this.MessageDelegator.b(fcg2, fch2);
        if (!this.dpR.isEmpty()) {
            ldv[] ldvArray = new ldv[this.dpR.size()];
            ljq[] ljqArray = new ljq[this.dpR.size()];
            ljq[] ljqArray2 = new ljq[this.dpR.size()];
            int n = 0;
            for (Map.Entry<ldv, lfs<ljq, ljq>> entry : this.dpR.entrySet()) {
                ldv ldv2 = entry.getKey();
                ljq ljq2 = (ljq)entry.getValue().reX;
                ljq ljq3 = (ljq)entry.getValue().reY;
                ldvArray[n] = ldv2;
                ljqArray[n] = ljq2;
                ljqArray2[n] = ljq3;
                ++n;
            }
            fch2.iJe = ldvArray;
            fch2.iJf = ljqArray;
            fch2.iJg = ljqArray2;
        }
        this.MessageDelegator.F(fch2);
    }
}

