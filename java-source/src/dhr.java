/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhr
extends dgj {
    private dfw gvf = null;
    private mgg gvX = null;
    private int gvY = 1;
    private ljq gvZ = null;
    private ljq grM = null;
    private float gwa = 1.0f;
    private ljq grN = null;
    private boolean gvl = false;
    private boolean gvm = true;
    private String fFC = null;
    private float gvn = 0.0f;
    private lcq gvo = null;
    private int gvg = 7;
    private float gvj = 0.0f;
    private float gvk = 0.0f;
    private float gwb = 2.0f;
    private float gwc = 0.5f;
    private float gwd = 3.0f;
    private float gwe = 1.0f;
    private float gwf = 1.0f;
    private static final int gwg = 0;
    private static final int gwh = 1;
    private static final int gwi = 2;
    private static final int gwj = 3;
    private int gwk = 0;
    private double gvp;
    private double gvq;
    private dkx grI = null;

    public dhr() {
        this.gqB = 67;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeLight();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateLight();
    }

    protected int getMainEffectObjectType() {
        return 2;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.setupTrajectory();
        this.setupLight();
        if (this.isRelationEffect()) {
            this.grI = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gvf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhr dhr2 = (dhr)dgj2;
        dhr2.gvY = this.gvY;
        dhr2.gvZ = this.gvZ;
        dhr2.grM = this.grM;
        dhr2.gwa = this.gwa;
        dhr2.grN = this.grN;
        dhr2.gvl = this.gvl;
        dhr2.gvm = this.gvm;
        dhr2.fFC = this.fFC;
        dhr2.gvn = this.gvn;
        dhr2.gvo = this.gvo;
        dhr2.gvg = this.gvg;
        dhr2.gvj = this.gvj;
        dhr2.gvk = this.gvk;
        dhr2.gwb = this.gwb;
        dhr2.gwc = this.gwc;
        dhr2.gwd = this.gwd;
        dhr2.gwe = this.gwe;
        dhr2.gwk = this.gwk;
        dhr2.gwf = this.gwf;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvY = 2;
        this.gvZ = new ljq(0.0f, 3.14f, 0.0f);
        this.grM = new ljq(1.0f, 1.0f, 1.0f);
        this.gwa = 1.0f;
        this.grN = new ljq(0.0f, 0.0f, 0.0f);
        this.gvl = false;
        this.gvm = true;
        this.fFC = null;
        this.gvn = 1.0f;
        this.gvo = lcq.BRIGHT_WHITE;
        this.gvg = 7;
        this.gvj = 0.0f;
        this.gvk = 0.0f;
        this.gwb = 2.0f;
        this.gwc = 0.5f;
        this.gwd = 3.0f;
        this.gwe = 1.0f;
        this.gwk = 0;
        this.gwf = 1.0f;
    }

    private void setupTrajectory() {
        this.gvX = new mgg();
        this.gvX.setRadius(this.grM);
        this.gvX.setNumLoops(this.gvY);
        this.gvX.setFullCycleTime(this.gwa);
        lgl lgl2 = new lgl(this.gvZ);
        this.gvX.ad(lgl2);
    }

    private void setupLight() {
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(this.gvo);
        this.gvf.setInnerIntensity(this.gvn);
        this.gvf.setInnerOn(this.gvl);
        if (this.hasInfiniteDuration()) {
            this.gvf.setInnerRadius(this.gwd);
            this.gvf.setOuterRadius(this.gwb);
        } else {
            this.gvp = this.getDuration() * this.gvj;
            this.gvq = this.getDuration() * (1.0f - this.gvk);
            float f2 = this.calculateTimeVal(this.gvp, this.gvq);
            if (this.gvm) {
                this.gvf.setOuterRadius(f2 * this.gwb);
            }
            if (this.gvl) {
                this.gvf.setInnerRadius(f2 * this.gwd);
            }
        }
        this.gvf.hX(true);
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterOn(this.gvm);
        if (this.getTargetPosition() != null) {
            ljq ljq2 = new ljq(this.grN);
            ljq2.es(this.getTargetPosition());
            this.gvf.c(ljq2);
        } else {
            this.gvf.c(this.grN);
        }
        this.gvf.setTextureName(this.fFC);
        this.MessageDelegator.a(this.gvf);
    }

    private void updateLight() {
        ljq ljq2 = this.gvX.ez(this.nx.rgz);
        ljq2.es(this.grN);
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
        } else {
            ljq2.es(this.getTargetPosition());
            this.gvf.c(ljq2);
        }
        float f2 = (float)(this.MessageDelegator.arc().rgz - this.fC.rgz) * this.gwf;
        float f3 = 1.0f;
        switch (this.gwk) {
            case 0: {
                f3 = (float)Math.sin(f2);
                break;
            }
            case 1: {
                f3 = (float)Math.abs(Math.sin(Math.abs(Math.log(f2) * Math.abs(Math.sin(f2)))));
                break;
            }
            case 2: {
                f3 = (float)Math.sin(Math.abs(Math.log(f2)) * Math.abs(Math.sin(f2)));
                break;
            }
            case 3: {
                f3 = (float)Math.random();
                break;
            }
            default: {
                f3 = (float)Math.sin(f2);
            }
        }
        this.gvf.setOuterRadius(ldq.o(this.gwc, this.gwb, f3));
        this.gvf.setInnerRadius(ldq.o(this.gwe, this.gwd, f3));
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gvj != 0.0f || this.gvk != 0.0f) {
            float f4 = this.calculateTimeVal(this.gvp, this.gvq);
            if (f4 >= 0.99f) {
                return;
            }
            this.gvf.setOuterRadius(f4 * this.gwb);
            this.gvf.setInnerRadius(f4 * this.gwd);
        }
    }

    private void removeLight() {
        if (this.gvf != null) {
            dey.bls().b(this.gvf);
            this.gvf = null;
        }
    }

    public int getNumLoops() {
        return this.gvY;
    }

    public void setNumLoops(int n2) {
        this.gvY = n2;
    }

    public ljq getOrientation() {
        return this.gvZ;
    }

    public void setOrientation(ljq ljq2) {
        this.gvZ = ljq2;
    }

    public ljq getRadius() {
        return this.grM;
    }

    public void setRadius(ljq ljq2) {
        this.grM = ljq2;
    }

    public float getFullCycleTime() {
        return this.gwa;
    }

    public void setFullCycleTime(float f2) {
        this.gwa = f2;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public boolean isInnerOn() {
        return this.gvl;
    }

    public void setInnerOn(boolean bl) {
        this.gvl = bl;
    }

    public boolean isOuterOn() {
        return this.gvm;
    }

    public void setOuterOn(boolean bl) {
        this.gvm = bl;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getInnerIntensity() {
        return this.gvn;
    }

    public void setInnerIntensity(float f2) {
        this.gvn = f2;
    }

    public lcq getInnerColor() {
        return this.gvo;
    }

    public void setInnerColor(lcq lcq2) {
        this.gvo = lcq2;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n2) {
        this.gvg = n2;
    }

    public float getExpandPercentTime() {
        return this.gvj;
    }

    public void setExpandPercentTime(float f2) {
        this.gvj = f2;
    }

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f2) {
        this.gvk = f2;
    }

    public float getOuterRadiusMax() {
        return this.gwb;
    }

    public void setOuterRadiusMax(float f2) {
        this.gwb = f2;
    }

    public float getOuterRadiusMin() {
        return this.gwc;
    }

    public void setOuterRadiusMin(float f2) {
        this.gwc = f2;
    }

    public float getInnerRadiusMax() {
        return this.gwd;
    }

    public void setInnerRadiusMax(float f2) {
        this.gwd = f2;
    }

    public float getInnerRadiusMin() {
        return this.gwe;
    }

    public void setInnerRadiusMin(float f2) {
        this.gwe = f2;
    }

    public float getPulseSpeed() {
        return this.gwf;
    }

    public void setPulseSpeed(float f2) {
        this.gwf = f2;
    }

    public int getPulseType() {
        return this.gwk;
    }

    public void setPulseType(int n2) {
        this.gwk = n2;
    }
}

