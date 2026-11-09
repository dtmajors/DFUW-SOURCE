/*
 * Decompiled with CFR.
 */
public class dfz
extends dey {
    kno gpk = null;
    private int dcq = 0;

    dfz() {
        this.gnv = 19;
        this.gpk = (kno)gnw.h(779);
        this.gnx = false;
        this.gny = false;
    }

    public int getTracerCreationType() {
        return this.gpk.getTracerCreationType();
    }

    public void setTracerCreationType(int n2) {
        this.dcq |= 0x40;
        this.dcq |= 0x1000;
        this.gpk.setTracerCreationType(n2);
    }

    public ljq getFirstPoint() {
        return this.gpk.getFirstPoint();
    }

    public void setFirstPoint(ljq ljq2) {
        this.dcq |= 0x40;
        this.dcq |= 0x1000;
        this.gpk.setFirstPoint(ljq2);
    }

    public ljq getSecondPoint() {
        return this.gpk.getSecondPoint();
    }

    public void setSecondPoint(ljq ljq2) {
        this.dcq |= 0x40;
        this.dcq |= 0x1000;
        this.gpk.setSecondPoint(ljq2);
    }

    public ljq getOffset() {
        return this.gpk.getOffset();
    }

    public void setOffset(ljq ljq2) {
        this.dcq |= 0x40;
        this.dcq |= 0x1000;
        this.gpk.setOffset(ljq2);
    }

    public boolean isFallOff() {
        return this.gpk.isFallOff();
    }

    public void setFallOff(boolean bl) {
        this.dcq |= 0x20;
        this.gpk.setFallOff(bl);
    }

    public lcq getTracerColorStart() {
        return this.gpk.getTracerColorStart();
    }

    public void setTracerColorStart(lcq lcq2) {
        this.dcq |= 8;
        this.gpk.setTracerColorStart(lcq2);
    }

    public lcq getTracerColorEnd() {
        return this.gpk.getTracerColorEnd();
    }

    public void setTracerColorEnd(lcq lcq2) {
        this.dcq |= 0x10;
        this.gpk.setTracerColorEnd(lcq2);
    }

    public int getMaxNumberOfTracePoints() {
        return this.gpk.getMaxNumberOfTracePoints();
    }

    public void setMaxNumberOfTracePoints(int n2) {
        this.dcq |= 0x80;
        this.gpk.setMaxNumberOfTracePoints(n2);
    }

    public float getUpperTransparencyStart() {
        return this.gpk.getUpperTransparencyStart();
    }

    public void setUpperTransparencyStart(float f2) {
        this.dcq |= 0x100;
        this.gpk.setUpperTransparencyStart(f2);
    }

    public float getUpperTransparencyEnd() {
        return this.gpk.getUpperTransparencyEnd();
    }

    public void setUpperTransparencyEnd(float f2) {
        this.dcq |= 0x200;
        this.gpk.setUpperTransparencyEnd(f2);
    }

    public float getLowerTransparencyStart() {
        return this.gpk.getLowerTransparencyStart();
    }

    public void setLowerTransparencyStart(float f2) {
        this.dcq |= 0x400;
        this.gpk.setLowerTransparencyStart(f2);
    }

    public float getLowerTransparencyEnd() {
        return this.gpk.getLowerTransparencyEnd();
    }

    public void setLowerTransparencyEnd(float f2) {
        this.dcq |= 0x800;
        this.gpk.setLowerTransparencyEnd(f2);
    }

    public float getScale() {
        return this.gpk.getScale();
    }

    public void setScale(float f2) {
        this.dcq |= 0x40;
        this.dcq |= 0x1000;
        this.gpk.setScale(f2);
    }

    public boolean isFaceCamera() {
        return this.gpk.isFaceCamera();
    }

    public void setFaceCamera(boolean bl) {
        this.gpk.setFaceCamera(bl);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            if (this.gpk.bUk() == null) {
                assert (false);
                return;
            }
            this.createTracer();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.bnb();
            }
            this.CleanedUp = true;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.updateTracer();
    }

    private void createTracer() {
        this.gpk.Zv(1);
        this.gpk.lQ(false);
        this.gpk.jM(false);
        this.gpk.wD(false);
        this.gpk.kX(this.getGUID());
        this.gpk.ts(this.GUID);
        this.gpk.Zu(0);
        this.gpk.qk(this.GUID);
        kno kno2 = (kno)gnw.h(779);
        kno2.a(this.gpk);
        kno2.wD(true);
        this.MessageDelegator.a(kno2);
        this.dcq = 0;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 768) {
            this.gnx = true;
            ktu ktu2 = (ktu)ktv2;
            if (ktu2.getResult() == 0) {
                this.gny = true;
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    private void updateTracer() {
        if (this.dcq == 0) {
            return;
        }
        this.gpk.Zv(this.dcq);
        this.MessageDelegator.a(this.gpk);
        this.dcq = 0;
    }

    private void bnb() {
        if (!this.gny) {
            return;
        }
        kno kno2 = (kno)gnw.h(779);
        kno2.Zv(2);
        kno2.lQ(false);
        kno2.jM(false);
        kno2.wD(false);
        kno2.qj(this.gpk.bUk());
        kno2.kX(this.getGUID());
        kno2.ts(this.GUID);
        kno2.Zu(0);
        kno2.qk(this.GUID);
        this.MessageDelegator.a(kno2);
    }

    public ldv bnc() {
        return this.gpk.bUk();
    }

    public void mH(ldv ldv2) {
        this.gpk.qj(ldv2);
    }

    public boolean isEnabled() {
        return this.gpk.isEnabled();
    }

    public void setEnabled(boolean bl) {
        this.dcq |= 4;
        this.gpk.setEnabled(bl);
    }

    public float getMaxTracerPointLifeTime() {
        return this.gpk.getMaxTracerPointLifeTime();
    }

    public void setMaxTracerPointLifeTime(float f2) {
        this.dcq |= 0x8000;
        this.gpk.setMaxTracerPointLifeTime(f2);
    }

    public float getMinDistanceBetweenTracePoints() {
        return this.gpk.getMinDistanceBetweenTracePoints();
    }

    public void setMinDistanceBetweenTracePoints(float f2) {
        this.dcq |= 0x4000;
        this.gpk.setMinDistanceBetweenTracePoints(f2);
    }

    public void gy(float f2) {
        this.gpk.gy(f2);
    }

    public void mI(ldv ldv2) {
        this.gpk.mI(ldv2);
    }

    public void setMaxLength(float f2) {
        this.gpk.setMaxLength(f2);
    }
}

