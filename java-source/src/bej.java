/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class bej
extends btk {
    protected int dcr = 0;
    private boolean ddm = false;
    private cbx ddn = null;
    private ldv dcy = null;
    private boolean dcs = false;
    private ldv ddo = null;
    protected boolean dct = false;
    protected float bzb = 0.0f;

    public bej(cbx cbx2) {
        assert (cbx2 != null);
        this.ddn = cbx2;
        this.Active = false;
    }

    public void f(ljq ljq2, lgl lgl2) {
    }

    public ldv ane() {
        assert (null != this.ddn);
        if (null == this.ddn.aAG()) {
            return null;
        }
        return this.ddn.aAG().axa();
    }

    protected boolean amP() {
        return this.dct;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5376: {
                this.a((kvl)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void aK(ljq ljq2) {
        assert (false);
    }

    public void aL(ljq ljq2) {
    }

    public void amR() {
        assert (!this.ddn.isServerObject());
        assert (this.ane() != null);
        assert (this.amQ() != null);
        kmj kmj2 = (kmj)this.ddn.getMessageDelegator().h(3329);
        kmj2.Zf(8);
        kmj2.wD(true);
        kmj2.ts(this.getGUID());
        kmj2.hC(this.ane());
        kmj2.tE(this.amQ());
        this.ddn.getMessageDelegator().a(kmj2);
        this.ddo = kmj2.getGUID();
    }

    public void amS() {
        assert (!this.ddn.isServerObject());
        assert (this.ane() != null);
        assert (this.amQ() != null);
    }

    protected void a(kvl kvl2) {
        if (kvl2.dXg().equals(this.ddo)) {
            assert (kvl2.getResult() == 0);
            this.ddo = null;
            this.dcs = true;
            this.ddm = true;
            this.cL(this.bzb);
        } else {
            lfn.b(5, "SFObjectController", "handlePhysicsResponse() Unknown requestGUID received. This is probably because it was done in several steps: " + kvl2.dXg());
            lfn.b(5, "SFObjectController", "handlePhysicsResponse() " + this.getClass().getSimpleName());
        }
    }

    public void cL(float f2) {
        this.bzb = f2;
        if (this.HT()) {
            assert (null != this.ane());
            kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
            kmj2.Zf(2);
            kmj2.ts(this.getGUID());
            kmj2.hC(this.ane());
            kmj2.mC(this.bzb);
            this.MessageDelegator.a(kmj2);
        } else {
            lfn.b(0, "notifyMaxVelocityChanged", "controller not ready!");
        }
    }

    public final int amM() {
        return this.dcr;
    }

    public final String amT() {
        return bed.kp(this.dcr);
    }

    public void doTick(ldz ldz2) {
    }

    public boolean HT() {
        return this.ddm;
    }

    public void cX(boolean bl) {
        this.ddm = bl;
    }

    public cbx anf() {
        return this.ddn;
    }

    public void g(cbx cbx2) {
        this.ddn = cbx2;
    }

    public boolean amO() {
        return this.dcs;
    }

    public void cY(boolean bl) {
        this.dcs = bl;
    }

    public ldv amQ() {
        return this.dcy;
    }

    public void hf(ldv ldv2) {
        this.dcy = ldv2;
    }

    public float getMaxVelocity() {
        return this.bzb;
    }

    public void setMaxVelocity(float f2) {
        this.bzb = f2;
    }
}

