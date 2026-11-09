/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dju
extends dgj {
    private String gCw = null;
    private boolean gCx = false;
    private float gCy = 0.2f;
    private float gCz = 0.4f;
    private boolean gCA = false;
    private float gCB = 1.0f;
    private dky grJ = null;
    private double gCC = 0.0;
    private ljq gCD = null;
    private int gCE = -1;

    dju() {
        this.gqB = 70;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkSFXStarter();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (!this.isRelationEffect()) {
            return;
        }
        this.gCE = del.dr(this.gCw);
        if (this.gCE < 0) {
            return;
        }
        this.grJ = this.setupPositionalSensorOnTargetObject();
        if (this.grJ == null) {
            return;
        }
        this.gCD = new ljq(this.getTargetPosition());
        this.gCC = (double)lew.aj(0.0f, this.gCz) + this.MessageDelegator.arc().rgz;
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dju dju2 = (dju)dgj2;
        dju2.gCw = this.gCw;
        dju2.gCx = this.gCx;
        dju2.gCy = this.gCy;
        dju2.gCz = this.gCz;
        dju2.gCA = this.gCA;
        dju2.gCB = this.gCB;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gCw = "";
        this.gCx = true;
        this.gCy = 0.2f;
        this.gCz = 0.4f;
        this.gCA = false;
        this.gCB = 1.0f;
    }

    private void checkSFXStarter() {
        if (this.grJ == null) {
            return;
        }
        if (this.gCx) {
            if (this.gCC > this.MessageDelegator.arc().rgz) {
                return;
            }
            this.gCC = (double)lew.aj(this.gCy, this.gCz) + this.MessageDelegator.arc().rgz;
        } else if (this.gCA) {
            ljq ljq2 = new ljq(this.grJ.av());
            ljq2.et(this.gCD);
            float f = ljq2.eqN();
            if (f < this.gCB) {
                return;
            }
        } else {
            return;
        }
        this.gCD = new ljq(this.grJ.av());
        this.startGenericMainEffect(this.gCE, new ljq(this.gCD));
    }

    public String getTargetSpecialEffectName() {
        return this.gCw;
    }

    public void setTargetSpecialEffectName(String string) {
        this.gCw = string;
    }

    public boolean isUseRandomTimeStarting() {
        return this.gCx;
    }

    public void setUseRandomTimeStarting(boolean bl) {
        this.gCx = bl;
    }

    public float getMinTimePass() {
        return this.gCy;
    }

    public void setMinTimePass(float f) {
        this.gCy = f;
    }

    public float getMaxTimePass() {
        return this.gCz;
    }

    public void setMaxTimePass(float f) {
        this.gCz = f;
    }

    public boolean isUseDistanceToStart() {
        return this.gCA;
    }

    public void setUseDistanceToStart(boolean bl) {
        this.gCA = bl;
    }

    public float getDistancePass() {
        return this.gCB;
    }

    public void setDistancePass(float f) {
        this.gCB = f;
    }
}

