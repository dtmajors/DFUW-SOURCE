/*
 * Decompiled with CFR.
 */
public class mhx
extends btk {
    mhv Dxg = null;

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.Dxg != null) {
            this.MessageDelegator.hd(this.Dxg.getGUID());
            this.Dxg = null;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11089: {
                this.a((gqr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gqr gqr2) {
        if (gqr2.ilu == 1) {
            this.yW(gqr2.jpD);
            return;
        }
        if (this.Dxg == null) {
            return;
        }
        if ((gqr2.ilu & 8) > 0) {
            this.Dxg.oo(gqr2.fXV);
        }
        if ((gqr2.ilu & 0x10) > 0) {
            this.Dxg.op(gqr2.mB);
        }
        if ((gqr2.ilu & 4) > 0) {
            this.Dxg.om(gqr2.eRm);
        }
        if ((gqr2.ilu & 0x20) > 0) {
            this.Dxg.yV(gqr2.jpF);
        }
        if ((gqr2.ilu & 0x40) > 0) {
            this.Dxg.aek(gqr2.jpG);
        }
        if ((gqr2.ilu & 0x100) > 0) {
            this.Dxg.ael(gqr2.jpH);
        }
        if ((gqr2.ilu & 0x80) > 0) {
            this.Dxg.on(gqr2.eUj);
        }
        if ((gqr2.ilu & 2) > 0) {
            this.Dxg.aem(gqr2.jpE);
        }
    }

    private void yW(boolean bl) {
        if (bl) {
            if (this.Dxg != null) {
                return;
            }
            this.Dxg = new mhv();
            this.Dxg.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.Dxg);
        } else {
            if (this.Dxg == null) {
                return;
            }
            this.MessageDelegator.hd(this.Dxg.getGUID());
            this.Dxg = null;
        }
    }
}

