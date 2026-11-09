/*
 * Decompiled with CFR.
 */
public class blt
extends bke {
    private dnr duC = null;
    private fdc duD = null;

    public blt() {
        this.dsy = bkd.a.drU;
    }

    @Override
    public void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9232) {
            this.Vc();
            return;
        }
        this.duD = (fdc)fdo2;
        boolean bl2 = true;
        if (this.duD.iJM <= 0) {
            bl2 = false;
        } else if (this.duD.dAu == null) {
            bl2 = false;
        } else if (this.duD.aXQ == null) {
            bl2 = false;
        } else if (this.duD.aCK == null) {
            bl2 = false;
        } else if (this.duD.dIW == null) {
            bl2 = false;
        }
        if (!bl2) {
            this.Vc();
            return;
        }
        dny dny2 = new dny();
        dny2.GUID = this.duD.aCK;
        dny2.dAy = this.duD.dIW;
        this.duC = new dnr();
        this.duC.gKR = this.MessageDelegator.getGUID();
        this.duC.ec = this.GUID;
        this.duC.gKS = this.duD.iJM;
        this.duC.gKT = this.duD.iJM;
        this.duC.dAu = this.duD.dAu;
        this.duC.aXQ = this.duD.aXQ;
        this.duC.gLi = dny2;
        this.duC.Tr = null;
        this.duC.gLj = false;
        this.duC.b(this.duD.brE());
        this.a(this.duC);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11266: {
                this.a((gxy)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gxy gxy2) {
        if (gxy2.iPj) {
            // empty if block
        }
        if (this.duD.bOs()) {
            this.a(this.duD.aZG, this.duD, gxy2.iPj, null);
        }
        if (gxy2.gKN != null && gxy2.gKN.gKR != null) {
            this.MessageDelegator.oa(gxy2.gKN.gKR);
        }
        this.Vc();
    }
}

