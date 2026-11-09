/*
 * Decompiled with CFR.
 */
public class ccl
extends ccd {
    private static final int elJ = Integer.MAX_VALUE;

    public ccl() {
        super(true);
        this.ObjectType = 102;
        this.oO(Integer.MAX_VALUE);
    }

    @Override
    public int ry() {
        return 1;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17409: {
                this.b((eat)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(eat eat2) {
        ccf ccf2 = this.a(eat2);
        if (ccf2 == ccf.elo) {
            this.M(eat2.bFc(), eat2.ack());
        }
        this.a(eat2, ccf2, this.getGUID());
    }
}

