/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class bem
extends bej {
    private ldv dcb = null;
    private float dcc = 10.0f;
    private float dcd = (float)Math.PI;
    private float dce = 2.0f;
    private float dcf = 3.0f;
    private float dcg = 3.0f;
    private float dch = 0.75f;
    private float dci = 0.4f;
    private float dcj = 0.3f;
    private float dck = 0.2f;
    private float dcl = 0.1f;
    private float dcm = 4.0f;
    private float bzd = 0.95f;
    private float dcn = 0.55f;

    public bem(cbx cbx2) {
        super(cbx2);
        this.dcr = 11;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.anf().isServerObject()) {
            return;
        }
        if (!this.dct && this.dcb == null) {
            this.amv();
        }
        super.doTick(ldz2);
    }

    @Override
    public void setActive(boolean bl) {
        super.setActive(bl);
        if (this.dct) {
            this.amu();
        }
    }

    private void amu() {
        assert (this.amQ() != null);
        kmu kmu2 = (kmu)this.MessageDelegator.h(3344);
        kmu2.wD(false);
        kmu2.jM(false);
        kmu2.hC(this.amQ());
        kmu2.ts(this.getGUID());
        kmu2.pOO = 4;
        kmu2.Active = this.Active;
        this.MessageDelegator.a(kmu2);
        if (this.Active) {
            this.amR();
        } else {
            this.amS();
        }
    }

    public void amv() {
        assert (null != this.MessageDelegator);
        kmu kmu2 = (kmu)this.MessageDelegator.h(3344);
        kmu2.dsK = true;
        kmu2.wD(true);
        assert (this.ane() != null);
        kmu2.hC(this.ane());
        kmu2.ts(this.getGUID());
        kmu2.pOO = 1048449;
        kmu2.dcc = this.dcc;
        kmu2.dcd = this.dcd;
        kmu2.dce = this.dce;
        kmu2.dcf = this.dcf;
        kmu2.dcg = this.dcg;
        kmu2.dch = this.dch;
        kmu2.dci = this.dci;
        kmu2.dcj = this.dcj;
        kmu2.dck = this.dck;
        kmu2.dcl = this.dcl;
        kmu2.dcm = this.dcm;
        kmu2.bzd = this.bzd;
        kmu2.dcn = this.dcn;
        this.MessageDelegator.a(kmu2);
        this.dcb = kmu2.getGUID();
    }

    @Override
    public void aK(ljq ljq2) {
        if (this.isActive()) {
            assert (null != this.amQ());
            kmu kmu2 = (kmu)this.MessageDelegator.h(3344);
            kmu2.ts(this.getGUID());
            kmu2.hC(this.amQ());
            kmu2.pKf = false;
            kmu2.pKg = false;
            kmu2.pKh = false;
            kmu2.pKi = false;
            float f2 = 0.5f;
            if (ljq2.rlV < -f2) {
                kmu2.pKf = true;
            }
            if (ljq2.rlV > f2) {
                kmu2.pKg = true;
            }
            if (ljq2.x < -f2) {
                kmu2.pKh = true;
            }
            if (ljq2.x > f2) {
                kmu2.pKi = true;
            }
            kmu2.pOO = 120;
            this.MessageDelegator.a(kmu2);
        }
    }

    public void amw() {
        this.cX(false);
        this.amS();
    }

    public void amx() {
        this.cX(false);
    }

    @Override
    protected void a(kvl kvl2) {
        if (kvl2.dXg().equals(this.dcb)) {
            assert (kvl2.getResult() == 0);
            assert (!this.dct);
            this.hf(kvl2.axa());
            this.dct = true;
            this.dcb = null;
        } else {
            super.a(kvl2);
        }
    }

    public void ct(float f2) {
        this.dcd = f2;
    }

    public float amy() {
        return this.dcd;
    }

    public void cu(float f2) {
        this.dcc = f2;
    }

    public float amz() {
        return this.dcc;
    }

    public void cv(float f2) {
        this.dce = f2;
    }

    public float amA() {
        return this.dce;
    }

    public void cw(float f2) {
        this.dcf = f2;
    }

    public float amB() {
        return this.dcf;
    }

    public void cx(float f2) {
        this.dcg = f2;
    }

    public float amC() {
        return this.dcg;
    }

    public void cy(float f2) {
        this.dch = f2;
    }

    public float amD() {
        return this.dch;
    }

    public void cz(float f2) {
        this.dci = f2;
    }

    public float amE() {
        return this.dci;
    }

    public void cA(float f2) {
        this.dcj = f2;
    }

    public float amF() {
        return this.dcj;
    }

    public void cB(float f2) {
        this.dck = f2;
    }

    public float amG() {
        return this.dck;
    }

    public void cC(float f2) {
        this.dcl = f2;
    }

    public float amH() {
        return this.dcl;
    }

    public void cD(float f2) {
        this.dcm = f2;
    }

    public float amI() {
        return this.dcm;
    }

    public void bg(float f2) {
        this.bzd = f2;
    }

    public float GZ() {
        return this.bzd;
    }

    public void cE(float f2) {
        this.dcn = f2;
    }

    public float amJ() {
        return this.dcn;
    }
}

