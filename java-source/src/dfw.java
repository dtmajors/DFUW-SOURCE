/*
 * Decompiled with CFR.
 */
public class dfw
extends dey {
    kkl gpi = null;
    private int dcq = 0;

    dfw() {
        this.gnv = 21;
        this.gpi = (kkl)gnw.h(1539);
        this.gnx = false;
        this.gny = false;
    }

    public boolean isOuterOn() {
        return this.gpi.isOuterOn();
    }

    public void setOuterOn(boolean bl) {
        this.gpi.setOuterOn(bl);
        this.dcq |= kkl.iTj;
    }

    public boolean isInnerOn() {
        return this.gpi.isInnerOn();
    }

    public void setInnerOn(boolean bl) {
        this.gpi.setInnerOn(bl);
        this.dcq |= kkl.iTk;
    }

    public String getTextureName() {
        return this.gpi.getTextureName();
    }

    public void setTextureName(String string) {
        this.gpi.setTextureName(string);
        this.dcq |= kkl.iTh;
    }

    public int getOuterColorNumber() {
        return this.gpi.getOuterColorNumber();
    }

    public void setOuterColorNumber(int n2) {
        this.gpi.setOuterColorNumber(n2);
        this.dcq |= kkl.iTi;
    }

    public ljq av() {
        return this.gpi.av();
    }

    public void c(ljq ljq2) {
        this.gpi.c(ljq2);
        this.dcq |= kkl.goz;
    }

    public float getInnerRadius() {
        return this.gpi.getInnerRadius();
    }

    public void setInnerRadius(float f2) {
        this.gpi.setInnerRadius(f2);
        this.dcq |= kkl.iTd;
    }

    public float getOuterRadius() {
        return this.gpi.getOuterRadius();
    }

    public void setOuterRadius(float f2) {
        this.gpi.setOuterRadius(f2);
        this.dcq |= kkl.iTe;
    }

    public lcq getInnerColor() {
        return this.gpi.getInnerColor();
    }

    public void setInnerColor(lcq lcq2) {
        this.gpi.setInnerColor(lcq2);
        this.dcq |= kkl.iTg;
    }

    public float getInnerIntensity() {
        return this.gpi.getInnerIntensity();
    }

    public void setInnerIntensity(float f2) {
        this.gpi.setInnerIntensity(f2);
        this.dcq |= kkl.iTf;
    }

    public boolean isOn() {
        return this.gpi.isOn();
    }

    public void hX(boolean bl) {
        this.gpi.hX(bl);
        this.dcq |= kkl.iSW;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bmq();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (this.Initialized) {
            this.removeLight();
        }
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.updateObject();
    }

    private void removeLight() {
        if (!this.gny) {
            return;
        }
        kkl kkl2 = (kkl)gnw.h(1539);
        kkl2.jM(false);
        kkl2.wD(false);
        kkl2.ts(this.GUID);
        kkl2.pN(this.GUID);
        kkl2.Yy(kkl.pGe);
        kkl2.Yy(kkl.pGf);
        this.MessageDelegator.a(kkl2);
    }

    private void bmq() {
        assert (this.MessageDelegator != null);
        this.gpi.jM(false);
        this.gpi.wD(false);
        this.gpi.ts(this.GUID);
        this.gpi.pN(this.GUID);
        this.gpi.Yy(kkl.pGe);
        kkl kkl2 = (kkl)gnw.h(1539);
        kkl2.a(this.gpi);
        kkl2.wD(true);
        this.MessageDelegator.a(kkl2);
        this.dcq = 0;
    }

    private void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        assert (this.MessageDelegator != null);
        this.gpi.Yy(this.dcq);
        this.MessageDelegator.a(this.gpi);
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
}

