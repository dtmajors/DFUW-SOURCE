/*
 * Decompiled with CFR.
 */
public class dfx
extends dey {
    kkm gpj = null;
    private int dcq = 0;
    private float dKD;

    dfx() {
        this.gnv = 22;
        this.gpj = (kkm)gnw.h(1541);
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void cleanUp() {
        if (this.Initialized) {
            this.removeLight();
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    private void removeLight() {
        if (!this.gny) {
            return;
        }
        kkm kkm2 = (kkm)gnw.h(1541);
        kkm2.jM(false);
        kkm2.wD(false);
        kkm2.lQ(false);
        kkm2.ts(this.GUID);
        kkm2.pN(this.GUID);
        kkm2.Yz(kkm.pGi);
        this.MessageDelegator.a(kkm2);
    }

    private void bmq() {
        assert (this.MessageDelegator != null);
        this.gpj.jM(false);
        this.gpj.wD(false);
        this.gpj.lQ(false);
        this.gpj.ts(this.GUID);
        this.gpj.pN(this.GUID);
        this.gpj.Yz(kkm.pGh);
        kkm kkm2 = (kkm)gnw.h(1541);
        kkm2.a(this.gpj);
        kkm2.wD(true);
        this.MessageDelegator.a(kkm2);
        this.dcq = 0;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1536) {
            this.gnx = true;
            ktr ktr2 = (ktr)ktv2;
            if (ktr2.getResult() == 0) {
                this.gny = true;
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    private void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        assert (this.MessageDelegator != null);
        this.gpj.Yz(this.dcq);
        this.MessageDelegator.a(this.gpj);
        this.dcq = 0;
    }

    public int bna() {
        return this.gpj.bna();
    }

    public void Ai(int n2) {
        this.gpj.Ai(n2);
        this.dcq |= kkm.iSY;
    }

    public String getMeshName() {
        return this.gpj.getMeshName();
    }

    public void setMeshName(String string) {
        this.gpj.setMeshName(string);
    }

    public boolean isOn() {
        return this.gpj.isOn();
    }

    public void hX(boolean bl) {
        this.gpj.hX(bl);
        this.dcq |= kkm.iSW;
    }

    public ljq av() {
        return this.gpj.av();
    }

    public void c(ljq ljq2) {
        this.gpj.c(ljq2);
        this.dcq |= kkm.goz;
    }

    public float getRadius() {
        return this.gpj.getRadius();
    }

    public void setRadius(float f2) {
        this.gpj.setRadius(f2);
        this.dcq |= kkm.pGj;
    }

    public lgl aw() {
        return this.gpj.aw();
    }

    public void a(lgl lgl2) {
        this.gpj.a(lgl2);
        this.dcq |= kkm.goA;
    }

    public ljq blS() {
        return this.gpj.blS();
    }

    public void bM(ljq ljq2) {
        this.gpj.bM(ljq2);
        this.dcq |= kkm.iGB;
    }

    public float getMaxRadius() {
        return this.dKD;
    }

    public void setMaxRadius(float f2) {
        this.dKD = f2;
    }
}

