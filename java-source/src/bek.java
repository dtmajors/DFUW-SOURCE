/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class bek
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

    public bek(cbx cbx2) {
        super(cbx2);
        this.dcr = 12;
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
        kmp kmp2 = (kmp)this.MessageDelegator.h(3356);
        kmp2.wD(false);
        kmp2.jM(false);
        kmp2.hC(this.amQ());
        kmp2.ts(this.getGUID());
        kmp2.pNZ = 4;
        kmp2.Active = this.Active;
        this.MessageDelegator.a(kmp2);
        if (this.Active) {
            this.amR();
        } else {
            this.amS();
        }
    }

    public void amv() {
        assert (null != this.MessageDelegator);
        kmp kmp2 = (kmp)this.MessageDelegator.h(3356);
        kmp2.dsK = true;
        kmp2.wD(true);
        assert (this.ane() != null);
        kmp2.hC(this.ane());
        kmp2.ts(this.getGUID());
        kmp2.pNZ = 1048449;
        kmp2.dcc = this.dcc;
        kmp2.dcd = this.dcd;
        kmp2.dce = this.dce;
        kmp2.dcf = this.dcf;
        kmp2.dcg = this.dcg;
        kmp2.dch = this.dch;
        kmp2.dci = this.dci;
        kmp2.dcj = this.dcj;
        kmp2.dck = this.dck;
        kmp2.dcl = this.dcl;
        kmp2.dcm = this.dcm;
        kmp2.bzd = this.bzd;
        kmp2.dcn = this.dcn;
        this.MessageDelegator.a(kmp2);
        this.dcb = kmp2.getGUID();
    }

    @Override
    public void aK(ljq ljq2) {
        if (this.isActive()) {
            assert (null != this.amQ());
            kmp kmp2 = (kmp)this.MessageDelegator.h(3356);
            kmp2.ts(this.getGUID());
            kmp2.hC(this.amQ());
            kmp2.pKf = false;
            kmp2.pKg = false;
            kmp2.pKh = false;
            kmp2.pKi = false;
            float f2 = 0.5f;
            if (ljq2.rlV < -f2) {
                kmp2.pKf = true;
            }
            if (ljq2.rlV > f2) {
                kmp2.pKg = true;
            }
            if (ljq2.x < -f2) {
                kmp2.pKh = true;
            }
            if (ljq2.x > f2) {
                kmp2.pKi = true;
            }
            kmp2.pNZ = 120;
            this.MessageDelegator.a(kmp2);
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

