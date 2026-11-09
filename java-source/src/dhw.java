/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhw
extends dgj {
    private dfk gws = null;
    private float gwu = 0.1f;
    private float gwv = 0.1f;
    private float dKD = 1.0f;
    private boolean gwy = true;
    private boolean gwz = true;
    private boolean gwP = true;
    private int gwA = 2;
    private float gwB = 1.0f;
    private boolean gwF = false;
    private lcq gwG = null;
    private boolean gwH = true;
    private String fFC = null;
    private boolean gwI = false;
    private boolean gwJ = false;
    private dky grJ = null;
    private double gvp;
    private double gvq;
    private mge gwQ = null;

    dhw() {
        this.gqB = 86;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObjects();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.gws == null) {
            assert (this.grJ != null);
            if (this.grJ.av().esJ()) {
                return;
            }
            this.createObjects();
        } else {
            this.updateObjects();
        }
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        assert (this.getSourcePosition() != null);
        this.grJ = this.setupPositionalSensorOnTargetObject();
    }

    protected void createObjects() {
        if (!this.hasInfiniteDuration()) {
            this.gvp = this.getDuration() * this.gwu;
            this.gvq = this.getDuration() * (1.0f - this.gwv);
        }
        this.createPoints();
        this.createLineMesh();
    }

    protected void removeObjects() {
        if (this.gws != null) {
            dey.bls().b(this.gws);
            this.gws = null;
        }
    }

    protected void updateObjects() {
        this.updatePoints();
    }

    protected void createLineMesh() {
        this.gws = (dfk)dKP.Af(9);
        this.gws.setGUID(this.getMainAtomGuid());
        this.gws.setConstantSize(this.gwF);
        this.gws.m(this.gwG);
        this.gws.setHasTexture(this.gwI);
        this.gws.setTextureName(this.fFC);
        float f2 = 1.0f;
        if (this.hasInfiniteDuration()) {
            this.gws.setLineWidth(this.gwB);
        } else {
            f2 = this.calculateTimeVal(this.gvp, this.gvq);
            float f3 = this.gwB * f2;
            this.gws.setLineWidth(f3);
        }
        this.gws.aD(this.gwQ.eyo());
        this.gws.c(this.getSourcePosition());
        this.gws.a(new lgl());
        this.gws.setTransformPoints(this.gwH);
        this.MessageDelegator.a(this.gws);
    }

    protected void createPoints() {
        if (this.gwA < 2) {
            this.gwA = 2;
        }
        this.gwQ = new mge();
        this.gwQ.setMaxRadius(this.dKD);
        this.gwQ.setMaxNumBranchPoints(this.gwA);
        this.gwQ.setYAxisDeviation(this.gwy);
        this.gwQ.setXAxisDeviation(this.gwz);
        this.gwQ.setZAxisDeviation(this.gwP);
        this.gwQ.setAnimateEndPoint(this.gwJ);
        ljq ljq2 = new ljq(this.grJ.av());
        ljq2.et(this.getSourcePosition());
        ljq2.y += 1.0f;
        this.gwQ.eN(ljq2);
        this.gwQ.eyl();
    }

    protected void updatePoints() {
        ljq ljq2 = new ljq(this.grJ.av());
        ljq2.et(this.getSourcePosition());
        ljq2.y += 1.0f;
        this.gwQ.eN(ljq2);
        this.gwQ.updatePoints();
        this.gws.aD(this.gwQ.eyo());
        float f2 = 1.0f;
        if (!this.hasInfiniteDuration()) {
            f2 = this.calculateTimeVal(this.gvp, this.gvq);
            float f3 = this.gwB * f2;
            this.gws.setLineWidth(f3);
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhw dhw2 = (dhw)dgj2;
        dhw2.gwu = this.gwu;
        dhw2.gwv = this.gwv;
        dhw2.dKD = this.dKD;
        dhw2.gwy = this.gwy;
        dhw2.gwz = this.gwz;
        dhw2.gwP = this.gwP;
        dhw2.gwA = this.gwA;
        dhw2.gwB = this.gwB;
        dhw2.gwF = this.gwF;
        dhw2.gwG = this.gwG;
        dhw2.gwH = this.gwH;
        dhw2.fFC = this.fFC;
        dhw2.gwI = this.gwI;
        dhw2.gwJ = this.gwJ;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gwu = 0.1f;
        this.gwv = 0.1f;
        this.dKD = 1.0f;
        this.gwy = true;
        this.gwz = true;
        this.gwP = true;
        this.gwA = 2;
        this.gwB = 1.0f;
        this.gwF = false;
        this.gwG = lcq.BRIGHT_WHITE;
        this.gwH = true;
        this.fFC = "sfx_lightning_32x32_01.dds";
        this.gwI = true;
        this.gwJ = false;
    }

    public float getIntroPercent() {
        return this.gwu;
    }

    public void setIntroPercent(float f2) {
        this.gwu = f2;
    }

    public float getOuttroPercent() {
        return this.gwv;
    }

    public void setOuttroPercent(float f2) {
        this.gwv = f2;
    }

    public float getMaxRadius() {
        return this.dKD;
    }

    public void setMaxRadius(float f2) {
        this.dKD = f2;
    }

    public boolean isYAxisDeviation() {
        return this.gwy;
    }

    public void setYAxisDeviation(boolean bl) {
        this.gwy = bl;
    }

    public boolean isXAxisDeviation() {
        return this.gwz;
    }

    public void setXAxisDeviation(boolean bl) {
        this.gwz = bl;
    }

    public boolean isZAxisDeviation() {
        return this.gwP;
    }

    public void setZAxisDeviation(boolean bl) {
        this.gwP = bl;
    }

    public int getNumPoints() {
        return this.gwA;
    }

    public void setNumPoints(int n2) {
        this.gwA = n2;
    }

    public float getMainBranchWidth() {
        return this.gwB;
    }

    public void setMainBranchWidth(float f2) {
        this.gwB = f2;
    }

    public boolean isConstantSize() {
        return this.gwF;
    }

    public void setConstantSize(boolean bl) {
        this.gwF = bl;
    }

    public lcq getLineColor() {
        return this.gwG;
    }

    public void setLineColor(lcq lcq2) {
        this.gwG = lcq2;
    }

    public boolean isTransformPoints() {
        return this.gwH;
    }

    public void setTransformPoints(boolean bl) {
        this.gwH = bl;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isHasTexture() {
        return this.gwI;
    }

    public void setHasTexture(boolean bl) {
        this.gwI = bl;
    }

    public boolean isAnimateEndPoint() {
        return this.gwJ;
    }

    public void setAnimateEndPoint(boolean bl) {
        this.gwJ = bl;
    }
}

