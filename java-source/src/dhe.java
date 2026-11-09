/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhe
extends dgj {
    dfz gur = null;
    private ljq gus = null;
    private ljq gut = null;
    private ljq guu = null;
    private ljq guv = null;
    private ljq guw = null;
    private ljq gux = null;
    private ljq guy = null;
    private ljq guz = null;
    private boolean guA = true;
    private lcq guB = null;
    private lcq guC = null;
    private lcq guD = null;
    private lcq guE = null;
    private int guF = 0;
    private float guG = 0.9f;
    private float guH = 0.9f;
    private float guI = 0.0f;
    private float guJ = 0.0f;
    private float guK = 0.0f;
    private float guL = 0.0f;
    private float guM = 0.0f;
    private float guN = 0.0f;
    private float doW = 1.0f;
    private float doX = 1.0f;
    private boolean guO = false;
    private float guP = 0.0f;
    private float guQ = 0.0f;
    private float guR = 0.0f;
    private float guS = 0.0f;
    private float guT = 1.0f;
    private static final int guU = 0;
    private static final int guV = 1;
    private static final int guW = 2;
    private int gsd = 0;
    private lgl guX = null;
    private lgl guY = null;
    private lgl guZ = null;
    private lgl gva = null;
    private ljq gvb = new ljq();
    private ljq gvc = new ljq();
    private lgl gvd = new lgl();
    private lgl gve = new lgl();

    public dhe() {
        this.gqB = 68;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateTracer();
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
        this.guX = new lgl(this.guw);
        this.guY = new lgl(this.gux);
        this.guZ = new lgl(this.guy);
        this.gva = new lgl(this.guz);
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhe dhe2 = (dhe)dgj2;
        dhe2.gus = this.gus;
        dhe2.gut = this.gut;
        dhe2.guu = this.guu;
        dhe2.guv = this.guv;
        dhe2.guw = this.guw;
        dhe2.gux = this.gux;
        dhe2.guy = this.guy;
        dhe2.guz = this.guz;
        dhe2.guA = this.guA;
        dhe2.guB = this.guB;
        dhe2.guC = this.guC;
        dhe2.guD = this.guD;
        dhe2.guE = this.guE;
        dhe2.guF = this.guF;
        dhe2.guG = this.guG;
        dhe2.guH = this.guH;
        dhe2.guI = this.guI;
        dhe2.guJ = this.guJ;
        dhe2.guK = this.guK;
        dhe2.guL = this.guL;
        dhe2.guM = this.guM;
        dhe2.guN = this.guN;
        dhe2.doW = this.doW;
        dhe2.doX = this.doX;
        dhe2.guO = this.guO;
        dhe2.guP = this.guP;
        dhe2.guQ = this.guQ;
        dhe2.guR = this.guR;
        dhe2.guS = this.guS;
        dhe2.guT = this.guT;
        dhe2.gsd = this.gsd;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gus = new ljq();
        this.gut = new ljq();
        this.guu = new ljq();
        this.guv = new ljq();
        this.guw = new ljq();
        this.gux = new ljq();
        this.guy = new ljq();
        this.guz = new ljq();
        this.guA = true;
        this.guB = lcq.BRIGHT_WHITE;
        this.guC = lcq.BRIGHT_WHITE;
        this.guD = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.guE = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.guF = 20;
        this.guG = 0.9f;
        this.guH = 0.9f;
        this.guI = 0.0f;
        this.guJ = 0.0f;
        this.guK = 0.9f;
        this.guL = 0.9f;
        this.guM = 0.0f;
        this.guN = 0.0f;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.guO = false;
        this.guP = 0.2f;
        this.guQ = 0.2f;
        this.guR = 1.0f;
        this.guS = 1.0f;
        this.guT = 1.0f;
        this.gsd = 0;
    }

    private void createTracer() {
        assert (this.gur == null);
        this.gur = (dfz)dKP.Af(19);
        this.gur.setGUID(this.getMainAtomGuid());
        this.gur.mH(this.getTargetObjectGUID());
        this.gur.setActive(true);
        this.gur.setEnabled(true);
        this.gur.setTracerCreationType(0);
        this.gur.setFirstPoint(this.gus);
        this.gur.setSecondPoint(this.guu);
        this.gur.setOffset(new ljq());
        this.gur.setFallOff(this.guA);
        this.gur.setTracerColorStart(this.guB);
        this.gur.setTracerColorEnd(this.guD);
        this.gur.setMaxNumberOfTracePoints(this.guF);
        this.gur.setUpperTransparencyStart(this.guG);
        this.gur.setUpperTransparencyEnd(this.guI);
        this.gur.setLowerTransparencyStart(this.guK);
        this.gur.setLowerTransparencyEnd(this.guM);
        this.gur.setScale(this.doW);
        this.gur.setFaceCamera(this.guO);
        this.gur.setMaxTracerPointLifeTime(this.guR);
        this.gur.setMinDistanceBetweenTracePoints(this.guP);
        this.MessageDelegator.a(this.gur);
    }

    private void removeTracer() {
        if (this.gur != null && this.gur.getGUID() != null) {
            dey.bls().b(this.gur);
            this.gur = null;
        }
    }

    private void updateTracer() {
        if (this.gur == null) {
            return;
        }
        float f2 = this.getLerpValue();
        f2 = lew.A(f2, 0.0f, 1.0f);
        ljq.a(this.gus, this.gut, f2, this.gvb);
        ljq.a(this.guu, this.guv, f2, this.gvc);
        this.gvd.c(this.guX, this.guY, f2);
        this.gve.c(this.guZ, this.gva, f2);
        this.gvb = this.gvd.eq(this.gvb);
        this.gvc = this.gve.eq(this.gvc);
        this.gur.setFirstPoint(this.gvb);
        this.gur.setSecondPoint(this.gvc);
        lcq lcq2 = lcq.a(this.guB, this.guC, f2);
        lcq lcq3 = lcq.a(this.guD, this.guE, f2);
        this.gur.setTracerColorStart(lcq2);
        this.gur.setTracerColorEnd(lcq3);
        float f3 = ldq.o(this.guG, this.guH, f2);
        float f4 = ldq.o(this.guI, this.guJ, f2);
        float f5 = ldq.o(this.guK, this.guL, f2);
        float f6 = ldq.o(this.guM, this.guN, f2);
        this.gur.setUpperTransparencyStart(f3);
        this.gur.setUpperTransparencyEnd(f4);
        this.gur.setLowerTransparencyStart(f5);
        this.gur.setLowerTransparencyEnd(f6);
        float f7 = ldq.o(this.doW, this.doX, f2);
        this.gur.setScale(f7);
        float f8 = ldq.o(this.guP, this.guQ, f2);
        this.gur.setMinDistanceBetweenTracePoints(f8);
        float f9 = ldq.o(this.guR, this.guS, f2);
        this.gur.setMaxTracerPointLifeTime(f9);
    }

    private float getLerpValue() {
        float f2 = (float)(this.MessageDelegator.arc().rgz - this.fC.rgz) * this.guT;
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        if (Float.isInfinite(f2)) {
            return 0.0f;
        }
        switch (this.gsd) {
            case 0: {
                return (float)Math.abs(Math.sin(f2));
            }
            case 1: {
                if (f2 <= Float.MIN_VALUE) {
                    return 0.0f;
                }
                return (float)Math.abs(Math.sin(Math.abs(Math.log(f2) * Math.abs(Math.sin(f2)))));
            }
            case 2: {
                return (float)Math.random();
            }
        }
        return (float)Math.random();
    }

    public ljq getFirstPointStart() {
        return this.gus;
    }

    public void setFirstPointStart(ljq ljq2) {
        this.gus = ljq2;
    }

    public ljq getFirstPointEnd() {
        return this.gut;
    }

    public void setFirstPointEnd(ljq ljq2) {
        this.gut = ljq2;
    }

    public ljq getSecondPointStart() {
        return this.guu;
    }

    public void setSecondPointStart(ljq ljq2) {
        this.guu = ljq2;
    }

    public ljq getSecondPointEnd() {
        return this.guv;
    }

    public void setSecondPointEnd(ljq ljq2) {
        this.guv = ljq2;
    }

    public ljq getFirstPointRotationStart() {
        return this.guw;
    }

    public void setFirstPointRotationStart(ljq ljq2) {
        this.guw = ljq2;
    }

    public ljq getFirstPointRotationEnd() {
        return this.gux;
    }

    public void setFirstPointRotationEnd(ljq ljq2) {
        this.gux = ljq2;
    }

    public ljq getSencondPointRotationStart() {
        return this.guy;
    }

    public void setSencondPointRotationStart(ljq ljq2) {
        this.guy = ljq2;
    }

    public ljq getSeconddPointRotationEnd() {
        return this.guz;
    }

    public void setSeconddPointRotationEnd(ljq ljq2) {
        this.guz = ljq2;
    }

    public boolean isFallOff() {
        return this.guA;
    }

    public void setFallOff(boolean bl) {
        this.guA = bl;
    }

    public lcq getTracerColorStartStart() {
        return this.guB;
    }

    public void setTracerColorStartStart(lcq lcq2) {
        this.guB = lcq2;
    }

    public lcq getTracerColorStartEnd() {
        return this.guC;
    }

    public void setTracerColorStartEnd(lcq lcq2) {
        this.guC = lcq2;
    }

    public lcq getTracerColorEndStart() {
        return this.guD;
    }

    public void setTracerColorEndStart(lcq lcq2) {
        this.guD = lcq2;
    }

    public lcq getTracerColorEndEnd() {
        return this.guE;
    }

    public void setTracerColorEndEnd(lcq lcq2) {
        this.guE = lcq2;
    }

    public int getMaxNumberOfTracePoints() {
        return this.guF;
    }

    public void setMaxNumberOfTracePoints(int n2) {
        this.guF = n2;
    }

    public float getUpperTransparancyStartStart() {
        return this.guG;
    }

    public void setUpperTransparancyStartStart(float f2) {
        this.guG = f2;
    }

    public float getUpperTransparancyStartEnd() {
        return this.guH;
    }

    public void setUpperTransparancyStartEnd(float f2) {
        this.guH = f2;
    }

    public float getUpperTransparancyEndStart() {
        return this.guI;
    }

    public void setUpperTransparancyEndStart(float f2) {
        this.guI = f2;
    }

    public float getUpperTransparancyEndEnd() {
        return this.guJ;
    }

    public void setUpperTransparancyEndEnd(float f2) {
        this.guJ = f2;
    }

    public float getLowerTransparancyStartStart() {
        return this.guK;
    }

    public void setLowerTransparancyStartStart(float f2) {
        this.guK = f2;
    }

    public float getLowerTransparancyStartEnd() {
        return this.guL;
    }

    public void setLowerTransparancyStartEnd(float f2) {
        this.guL = f2;
    }

    public float getLowerTransparancyEndStart() {
        return this.guM;
    }

    public void setLowerTransparancyEndStart(float f2) {
        this.guM = f2;
    }

    public float getLowerTransparancyEndEnd() {
        return this.guN;
    }

    public void setLowerTransparancyEndEnd(float f2) {
        this.guN = f2;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f2) {
        this.doW = f2;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f2) {
        this.doX = f2;
    }

    public boolean isFaceCamera() {
        return this.guO;
    }

    public void setFaceCamera(boolean bl) {
        this.guO = bl;
    }

    public float getMinDistanceBetweenTracePointsStart() {
        return this.guP;
    }

    public void setMinDistanceBetweenTracePointsStart(float f2) {
        this.guP = f2;
    }

    public float getMinDistanceBetweenTracePointsEnd() {
        return this.guQ;
    }

    public void setMinDistanceBetweenTracePointsEnd(float f2) {
        this.guQ = f2;
    }

    public float getMaxTracerPointLifeTimeStart() {
        return this.guR;
    }

    public void setMaxTracerPointLifeTimeStart(float f2) {
        this.guR = f2;
    }

    public float getMaxTracerPointLifeTimeEnd() {
        return this.guS;
    }

    public void setMaxTracerPointLifeTimeEnd(float f2) {
        this.guS = f2;
    }

    public float getDynamicFrequency() {
        return this.guT;
    }

    public void setDynamicFrequency(float f2) {
        this.guT = f2;
    }

    public int getLerpType() {
        return this.gsd;
    }

    public void setLerpType(int n2) {
        this.gsd = n2;
    }
}

