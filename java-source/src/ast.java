/*
 * Decompiled with CFR.
 */
public class ast
extends asw {
    private boolean bVS;

    public ast(ldv ldv2, ldv ldv3, int n, boolean bl) {
        super(ldv2, ldv3, n, bl);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.TR();
    }

    public void TS() {
        if (!this.bWN) {
            return;
        }
        if (!this.bVS) {
            gzv gzv2 = (gzv)this.MessageDelegator.h(8198, this.GUID, this.Ri);
            gzv2.bWM = this.bWM;
            gzv2.ija = 1;
            gzv2.bnM = 1488;
            this.MessageDelegator.F(gzv2);
            this.bVS = true;
        }
    }

    public void TT() {
        if (!this.bWN) {
            return;
        }
        if (this.bVS) {
            gzv gzv2 = (gzv)this.MessageDelegator.h(8198, this.GUID, this.Ri);
            gzv2.bWM = this.bWM;
            gzv2.ija = 2;
            gzv2.bnM = 1488;
            this.MessageDelegator.F(gzv2);
            this.bVS = false;
        }
    }

    @Override
    public void terminate() {
        super.terminate();
    }

    @Override
    protected void a(fbf fbf2) {
        int n = this.b(fbf2);
        if (n < 0) {
            return;
        }
        if (n == 0) {
            this.b(new arv(this.ade, this.Ri, this.bRN, this.bRL));
        } else {
            this.b(new arx(Boolean.TRUE, this.bRN, this.bRL));
        }
    }

    @Override
    protected void TR() {
        if (this.bWN) {
            assert (false);
            return;
        }
        assert (this.Ri != null);
        assert (this.GUID != null);
        if (this.Ri == null) {
            return;
        }
        int[] nArray = new int[]{9840, 1136};
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

