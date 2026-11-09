/*
 * Decompiled with CFR.
 */
public class dfc
extends dfd {
    private int dcq = 0;
    private boolean gnI = false;
    private kic gnJ = null;

    public Object clone() {
        dfc dfc2 = new dfc();
        this.a(dfc2);
        return dfc2;
    }

    dfc() {
        this.gnv = 4;
        this.gnJ = (kic)gnw.h(1283);
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.updateObject();
    }

    public float getMaxDistance() {
        return this.gnJ.getMaxDistance();
    }

    public void setMaxDistance(float f2) {
        this.gnJ.setMaxDistance(f2);
        this.dcq |= 1;
    }

    public float getMinDistance() {
        return this.gnJ.getMinDistance();
    }

    public void setMinDistance(float f2) {
        this.gnJ.setMinDistance(f2);
        this.dcq |= 2;
    }

    public int getInsideConeAngle() {
        return this.gnJ.getInsideConeAngle();
    }

    public void setInsideConeAngle(int n2) {
        this.gnJ.setInsideConeAngle(n2);
        this.dcq |= 8;
    }

    public int getOutsideConeAngle() {
        return this.gnJ.getOutsideConeAngle();
    }

    public void setOutsideConeAngle(int n2) {
        this.gnJ.setOutsideConeAngle(n2);
        this.dcq |= 8;
    }

    public ljq getConeOrientation() {
        return this.gnJ.getConeOrientation();
    }

    public void setConeOrientation(ljq ljq2) {
        this.gnJ.setConeOrientation(ljq2);
        this.dcq |= 0x10;
    }

    public long getConeOutsideVolume() {
        return this.gnJ.getConeOutsideVolume();
    }

    public void setConeOutsideVolume(long l2) {
        this.gnJ.setConeOutsideVolume(l2);
        this.dcq |= 0x20;
    }

    public ljq Up() {
        return this.gnJ.Up();
    }

    public void bi(ljq ljq2) {
        this.gnJ.bi(ljq2);
        this.dcq |= 0x40;
    }

    public int getMode() {
        return (int)this.gnJ.dZY();
    }

    public void setMode(int n2) {
        this.gnJ.at(n2);
        this.dcq |= 0x80;
    }

    public int axv() {
        return this.gnJ.axv();
    }

    public void mU(int n2) {
        this.gnJ.mU(n2);
        this.dcq |= 0x100;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bly();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.blE();
            }
            this.CleanedUp = true;
        }
    }

    private void bly() {
        krt krt2 = new krt();
        krt2.ts(this.GUID);
        krt2.aaD(1);
        krt2.aaE(2);
        krt2.xC(true);
        krt2.hC(this.GUID);
        krt2.xc(this.gnK);
        krt2.xE(false);
        krt2.wL(this.eMi);
        krt2.setMaxDistance(this.getMaxDistance());
        krt2.setMinDistance(this.getMinDistance());
        krt2.c(this.blA());
        krt2.setInsideConeAngle(this.getInsideConeAngle());
        krt2.setOutsideConeAngle(this.getOutsideConeAngle());
        krt2.setConeOrientation(this.getConeOrientation());
        krt2.setConeOutsideVolume(this.getConeOutsideVolume());
        krt2.bi(this.Up());
        krt2.setMode(this.getMode());
        krt2.mU(this.axv());
        krt2.hN(this.gnI);
        krt2.dh(this.axw());
        this.MessageDelegator.a(krt2);
        this.gnJ.ts(this.GUID);
        this.gnJ.tB(this.GUID);
        this.gnJ.wD(false);
        this.gnJ.jM(false);
        this.dcq = 0;
    }

    public ljq blA() {
        return this.gnJ.av();
    }

    public void bK(ljq ljq2) {
        this.gnJ.c(ljq2);
        this.dcq |= 4;
    }

    public void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        this.gnJ.XH(this.dcq);
        this.MessageDelegator.a(this.gnJ);
        this.dcq = 0;
    }

    public boolean blz() {
        return this.gnI;
    }

    public void hN(boolean bl) {
        this.gnI = bl;
    }

    public float axw() {
        return this.gnJ.axw();
    }

    public void dh(float f2) {
        this.dcq |= 0x200;
        this.gnJ.dh(f2);
    }
}

