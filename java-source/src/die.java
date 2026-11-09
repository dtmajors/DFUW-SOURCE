/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class die
extends dgj {
    private dfm gtf = null;
    private mgh gyT = null;
    private String ekh = null;
    private float gyU = 10.0f;
    private float gyV = 10.0f;
    private float gwo = 100.0f;
    private lcq gxq = lcq.BRIGHT_WHITE;

    public die() {
        this.gqB = 37;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (!this.gqU && this.isCameraReady()) {
            float f2 = ljq.s(this.getTargetPosition(), this.getCameraReadOnlyPosition());
            if (f2 < this.getMaxCamDistUpdateSpecialEffect()) {
                this.updateObject();
            }
        } else {
            this.updateObject();
        }
    }

    private void updateObject() {
        ljq ljq2 = this.gyT.ez(this.nx.rgz);
        lgl lgl2 = this.gyT.Bd();
        ljq2.es(this.getTargetPosition());
        this.gtf.c(ljq2);
        this.gtf.a(lgl2);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createTrajectory();
        this.createMesh();
        this.updateObject();
    }

    private void createTrajectory() {
        this.gyT = new mgh();
        this.gyT.og(this.gyU);
        this.gyT.hp(this.gyV);
        this.gyT.setTimeOfOneRevolution(this.gwo);
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        this.gtf.a(new lgl());
        this.gtf.n(this.gxq);
        this.MessageDelegator.a(this.gtf);
    }

    protected void removeMesh() {
        if (this.gtf != null) {
            dey.bls().b(this.gtf);
            this.gtf = null;
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        die die2 = (die)dgj2;
        die2.ekh = this.ekh;
        die2.gyU = this.gyU;
        die2.gyV = this.gyV;
        die2.gwo = this.gwo;
        die2.gxq = this.gxq;
    }

    public void setDefaultValues() {
        this.ekh = "Dummy";
        this.gyU = 10.0f;
        this.gyV = 10.0f;
        this.gwo = 100.0f;
        this.gxq = lcq.BRIGHT_WHITE;
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public float getTimeOfOneRevolution() {
        return this.gwo;
    }

    public void setTimeOfOneRevolution(float f2) {
        this.gwo = f2;
    }

    public float getXRadius() {
        return this.gyU;
    }

    public void setXRadius(float f2) {
        this.gyU = f2;
    }

    public float getZRadius() {
        return this.gyV;
    }

    public void setZRadius(float f2) {
        this.gyV = f2;
    }

    public lcq getMeshColor() {
        return this.gxq;
    }

    public void setMeshColor(lcq lcq2) {
        this.gxq = lcq2;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}

