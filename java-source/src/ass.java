/*
 * Decompiled with CFR.
 */
public class ass
extends asw {
    public ass(ldv ldv2, ldv ldv3, int n, boolean bl) {
        super(ldv2, ldv3, n, bl);
    }

    @Override
    public void initialize() {
        this.TR();
        super.initialize();
    }

    @Override
    protected void a(fbf fbf2) {
        int n = this.b(fbf2);
        if (n < 0) {
            return;
        }
        if (n == 0) {
            this.b(new aru(this.bXH, this.bXI, this.bRN, this.bRL, this.bXL, this.bRO));
        } else {
            this.b(new arx(Boolean.TRUE, this.bRN, this.bRL));
        }
    }

    @Override
    protected void TR() {
        if (this.bWN) {
            return;
        }
        assert (this.Ri != null);
        assert (this.GUID != null);
        if (this.Ri == null) {
            return;
        }
        int[] nArray = new int[]{1296, 1312, 1136};
        this.bWM = this.MessageDelegator.bzv();
        dqi dqi2 = new dqi();
        dqi2.setGUID(this.bWM);
        dqi2.nC(this.GUID);
        dqi2.M(nArray);
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, this.Ri);
        gzo2.jvG = dqi2;
        this.MessageDelegator.F(gzo2);
    }
}

