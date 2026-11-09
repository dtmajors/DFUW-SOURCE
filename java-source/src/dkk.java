/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dkk
extends dgj {
    dfz gur = null;
    private int gDu = 0;
    private ljq gvb = null;
    private ljq gvc = null;
    private ljq Offset = null;
    private boolean guA = true;
    private lcq gzP = null;
    private lcq gzQ = null;
    private int guF = 0;
    private float gDv = 0.0f;
    private float gDw = 0.0f;
    private float gDx = 0.0f;
    private float gDy = 0.0f;
    private float daN = 0.0f;
    private boolean guO = false;
    private float gDz = 0.0f;
    private float gDA = 0.0f;

    dkk() {
        this.gqB = 12;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeTracer();
    }

    protected int getMainEffectObjectType() {
        return 5;
    }

    protected void initializeSpecialEffect() {
        assert (!this.isMainEffect()) : "A Tracer Effect can NOT be the maineffect";
        assert (this.isRelationEffect()) : "A Tracer MUST be a relationeffect";
        super.initializeSpecialEffect();
        this.createTracer();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkk dkk2 = (dkk)dgj2;
        dkk2.gDu = this.gDu;
        dkk2.gvb = this.gvb;
        dkk2.gvc = this.gvc;
        dkk2.Offset = this.Offset;
        dkk2.guA = this.guA;
        dkk2.gzP = this.gzP;
        dkk2.gzQ = this.gzQ;
        dkk2.guF = this.guF;
        dkk2.gDv = this.gDv;
        dkk2.gDw = this.gDw;
        dkk2.gDx = this.gDx;
        dkk2.gDy = this.gDy;
        dkk2.daN = this.daN;
        dkk2.guO = this.guO;
        dkk2.gDA = this.gDA;
        dkk2.gDz = this.gDz;
    }

    private void createTracer() {
        assert (this.gur == null);
        this.gur = (dfz)dKP.Af(19);
        this.gur.setGUID(this.getMainAtomGuid());
        this.gur.mH(this.getTargetObjectGUID());
        this.gur.setActive(true);
        this.gur.setEnabled(true);
        this.gur.setTracerCreationType(this.gDu);
        this.gur.setFirstPoint(this.gvb);
        this.gur.setSecondPoint(this.gvc);
        this.gur.setOffset(this.Offset);
        this.gur.setFallOff(this.guA);
        this.gur.setTracerColorStart(this.gzP);
        this.gur.setTracerColorEnd(this.gzQ);
        this.gur.setMaxNumberOfTracePoints(this.guF);
        this.gur.setUpperTransparencyEnd(this.gDw);
        this.gur.setUpperTransparencyStart(this.gDv);
        this.gur.setLowerTransparencyEnd(this.gDy);
        this.gur.setLowerTransparencyStart(this.gDx);
        this.gur.setScale(this.daN);
        this.gur.setFaceCamera(this.guO);
        this.gur.setMaxTracerPointLifeTime(this.gDA);
        this.gur.setMinDistanceBetweenTracePoints(this.gDz);
        this.MessageDelegator.a(this.gur);
    }

    private void removeTracer() {
        if (this.gur != null && this.gur.getGUID() != null) {
            dey.bls().b(this.gur);
            this.gur = null;
        }
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gDu = 0;
        this.gvb = new ljq();
        this.gvc = new ljq();
        this.Offset = new ljq();
        this.guA = true;
        this.gzP = lcq.BRIGHT_WHITE;
        this.gzQ = lcq.BRIGHT_WHITE;
        this.guF = 10;
        this.gDv = 0.9f;
        this.gDw = 0.0f;
        this.gDx = 0.9f;
        this.gDy = 0.0f;
        this.daN = 1.0f;
        this.guO = false;
        this.gDA = 0.0f;
        this.gDz = 0.0f;
    }

    public boolean isFaceCamera() {
        return this.guO;
    }

    public void setFaceCamera(boolean bl) {
        this.guO = bl;
    }

    public boolean isFallOff() {
        return this.guA;
    }

    public void setFallOff(boolean bl) {
        this.guA = bl;
    }

    public ljq getFirstPoint() {
        return this.gvb;
    }

    public void setFirstPoint(ljq ljq2) {
        this.gvb = ljq2;
    }

    public float getLowerTransparencyEnd() {
        return this.gDy;
    }

    public void setLowerTransparencyEnd(float f) {
        this.gDy = f;
    }

    public float getLowerTransparencyStart() {
        return this.gDx;
    }

    public void setLowerTransparencyStart(float f) {
        this.gDx = f;
    }

    public int getMaxNumberOfTracePoints() {
        return this.guF;
    }

    public void setMaxNumberOfTracePoints(int n) {
        this.guF = n;
    }

    public ljq getOffset() {
        return this.Offset;
    }

    public void setOffset(ljq ljq2) {
        this.Offset = ljq2;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public ljq getSecondPoint() {
        return this.gvc;
    }

    public void setSecondPoint(ljq ljq2) {
        this.gvc = ljq2;
    }

    public lcq getTracerColorEnd() {
        return this.gzQ;
    }

    public void setTracerColorEnd(lcq lcq2) {
        this.gzQ = lcq2;
    }

    public lcq getTracerColorStart() {
        return this.gzP;
    }

    public void setTracerColorStart(lcq lcq2) {
        this.gzP = lcq2;
    }

    public int getTracerCreationType() {
        return this.gDu;
    }

    public void setTracerCreationType(int n) {
        this.gDu = n;
    }

    public float getUpperTransparencyEnd() {
        return this.gDw;
    }

    public void setUpperTransparencyEnd(float f) {
        this.gDw = f;
    }

    public float getUpperTransparencyStart() {
        return this.gDv;
    }

    public void setUpperTransparencyStart(float f) {
        this.gDv = f;
    }

    public float getMaxTracerPointLifeTime() {
        return this.gDA;
    }

    public void setMaxTracerPointLifeTime(float f) {
        this.gDA = f;
    }

    public float getMinDistanceBetweenTracePoints() {
        return this.gDz;
    }

    public void setMinDistanceBetweenTracePoints(float f) {
        this.gDz = f;
    }
}

