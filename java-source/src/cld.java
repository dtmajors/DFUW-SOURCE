/*
 * Decompiled with CFR.
 */
public class cld
extends clc {
    public cld() {
        super(false);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    protected void aIw() {
        super.aIw();
        this.aRy();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aRA();
    }

    public void b(eq eq2, boolean bl) {
        super.b(eq2, bl);
        if (eq2.getType() == 1408 && this.eHC != null) {
            this.eHC.fw(eq2.getBooleanValue());
        }
    }

    private void aRy() {
        ej ej2 = this.fi().ae(1424);
        if (ej2 != null) {
            if (!(ej2 instanceof ew)) {
                return;
            }
            ew ew2 = (ew)ej2;
            if ((ew2.fQ() & 1) > 0) {
                this.aRz();
            }
        }
    }

    public void c(ew ew2, int n) {
        if (ew2.getType() == 1424) {
            if ((ew2.fQ() & 1) > 0) {
                this.aRz();
            } else {
                this.aRA();
            }
        }
        super.c(ew2, n);
    }

    private void aRz() {
        if (this.eHC != null) {
            lfn.b(5, "SFHouseClient", "addDoor() Door already added");
            return;
        }
        boolean bl = true;
        ej ej2 = this.fi().ae(1408);
        if (ej2 != null && ej2 instanceof eq) {
            bl = ((eq)ej2).getBooleanValue();
        }
        this.eHC = new cle(this);
        this.eHC.fy(bl);
        this.eHC.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eHC);
    }

    private void aRA() {
        if (this.eHC == null) {
            lfn.b(5, "SFHouseClient", "removeDoor() Door already removed");
            return;
        }
        this.eHC.remove();
        this.eHC = null;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1045: {
                this.a((fuk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fuk fuk2) {
        if (this.eHC == null) {
            return;
        }
        this.eHC.e(fuk2.iWZ, fuk2.oV);
    }
}

