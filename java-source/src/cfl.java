/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 */
public class cfl
extends cfj {
    protected cex baW = null;
    protected boolean euK = false;

    public cfl(cex cex2) {
        this.baW = cex2;
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.euK) {
            this.aNu();
        }
    }

    private void aNu() {
        if (this.baW.mA() == null) {
            return;
        }
        int n = this.baW.mA().jr();
        ldv ldv2 = lcr.ak((ldv)lcr.qEG, (int)n);
        dxz dxz2 = (dxz)this.MessageDelegator.h(35585, this.GUID, ldv2);
        int[] nArray = new int[this.eux.size()];
        for (int i2 = 0; i2 < this.eux.size(); ++i2) {
            nArray[i2] = (Integer)this.eux.get(i2);
        }
        int[] nArray2 = new int[this.euy.size()];
        for (int i3 = 0; i3 < this.euy.size(); ++i3) {
            nArray2[i3] = (Integer)this.euy.get(i3);
        }
        dxz2.N(nArray);
        dxz2.O(nArray2);
        this.MessageDelegator.E(dxz2);
    }

    public void d(nd nd2) {
        int n;
        this.eux = lcn.emv();
        this.euy = lcn.emv();
        if (nd2.aCX != null) {
            for (n = 0; n < nd2.aCX.length; ++n) {
                this.eux.add(nd2.aCX[n]);
            }
        }
        if (nd2.aCY != null) {
            for (n = 0; n < nd2.aCY.length; ++n) {
                this.euy.add(nd2.aCY[n]);
            }
        }
        this.euK = true;
        if (this.Initialized) {
            this.aNu();
        }
    }

    public void c(nd nd2) {
        int n;
        nd2.aCX = new int[this.eux.size()];
        for (n = 0; n < this.eux.size(); ++n) {
            nd2.aCX[n] = (Integer)this.eux.get(n);
        }
        nd2.aCY = new int[this.euy.size()];
        for (n = 0; n < this.euy.size(); ++n) {
            nd2.aCY[n] = (Integer)this.euy.get(n);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 35586) {
            this.a((dxv)dxq2);
        } else if (dxq2.bEz() == 35587) {
            this.a((dxy)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    protected void a(dxy dxy2) {
        int n = this.baW.mA().jr();
        ldv ldv2 = lcr.ak((ldv)lcr.qEG, (int)n);
        dxy2.on(ldv2);
        this.MessageDelegator.E(dxy2);
    }

    protected void a(dxv dxv2) {
        if (dxv2.bEG()) {
            this.pG(dxv2.bEH());
        } else {
            this.pH(dxv2.bEH());
        }
    }
}

