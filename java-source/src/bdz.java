/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class bdz
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

    public bdz(cbx cbx2) {
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
        klu klu2 = (klu)this.MessageDelegator.h(3355);
        klu2.wD(false);
        klu2.jM(false);
        klu2.hC(this.amQ());
        klu2.ts(this.getGUID());
        klu2.pKe = 4;
        klu2.Active = this.Active;
        this.MessageDelegator.a(klu2);
        if (this.Active) {
            this.amR();
        } else {
            this.amS();
        }
    }

    public void amv() {
        assert (null != this.MessageDelegator);
        klu klu2 = (klu)this.MessageDelegator.h(3355);
        klu2.dsK = true;
        klu2.wD(true);
        assert (this.ane() != null);
        klu2.hC(this.ane());
        klu2.ts(this.getGUID());
        klu2.pKe = 1048449;
        klu2.dcc = this.dcc;
        klu2.dcd = this.dcd;
        klu2.dce = this.dce;
        klu2.dcf = this.dcf;
        klu2.dcg = this.dcg;
        klu2.dch = this.dch;
        klu2.dci = this.dci;
        klu2.dcj = this.dcj;
        klu2.dck = this.dck;
        klu2.dcl = this.dcl;
        klu2.dcm = this.dcm;
        klu2.bzd = this.bzd;
        klu2.dcn = this.dcn;
        this.MessageDelegator.a(klu2);
        this.dcb = klu2.getGUID();
    }

    @Override
    public void aK(ljq ljq2) {
        if (this.isActive()) {
            assert (null != this.amQ());
            klu klu2 = (klu)this.MessageDelegator.h(3355);
            klu2.ts(this.getGUID());
            klu2.hC(this.amQ());
            klu2.pKf = false;
            klu2.pKg = false;
            klu2.pKh = false;
            klu2.pKi = false;
            klu2.pKj = false;
            klu2.cZ = false;
            float f2 = 0.5f;
            if (ljq2.rlV < -f2) {
                klu2.pKf = true;
            }
            if (ljq2.rlV > f2) {
                klu2.pKg = true;
            }
            if (ljq2.x < -f2) {
                klu2.pKh = true;
            }
            if (ljq2.x > f2) {
                klu2.pKi = true;
            }
            if (ljq2.y < -f2) {
                klu2.cZ = true;
            }
            if (ljq2.y > f2) {
                klu2.pKj = true;
            }
            klu2.pKe = 3145848;
            this.MessageDelegator.a(klu2);
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

    public void cF(float f2) {
        klu klu2 = (klu)this.MessageDelegator.h(3355);
        klu2.wD(false);
        klu2.jM(false);
        klu2.ts(this.getGUID());
        klu2.hC(this.amQ());
        klu2.pKe = 0x400000;
        klu2.dZx = f2;
        this.MessageDelegator.a(klu2);
    }
}

